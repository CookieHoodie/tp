package seedu.revised.command.subjectcommand;


import org.junit.jupiter.api.Test;
import seedu.revised.card.SubjectList;
import seedu.revised.exception.InvalidSubjectCommand;
import seedu.revised.exception.NoSubjectException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertThrows;

class QuizSubjectCommandTest {
    SubjectList subjectList = new SubjectList(new ArrayList<>());

    @Test
    void execute_command_throwsException() {
        String input = "quiz";
        QuizSubjectCommand quiz = new QuizSubjectCommand(input);
        assertThrows(InvalidSubjectCommand.class, () -> quiz.execute(subjectList));

    }

}