package seedu.revised.command.flashcardcommand;

import seedu.revised.card.Topic;
import seedu.revised.exception.FailedParseException;
import seedu.revised.ui.Ui;

public class SorryFlashcardCommand extends FlashcardCommand {

    public void execute(Topic topic) throws FailedParseException {
        throw new FailedParseException(Ui.FAILED_PARSE_EXCEPTION);
    }

    /**
     * Checks whether the the user exits the program.
     *
     * @return <code>true</code> if user exits the program
     */
    public boolean isExit() {
        return false;
    }
}
