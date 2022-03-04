package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;

public class HelloCommand extends Command {

    public static final String COMMAND_WORD = "hello";

    public static final String MESSAGE_SUCCESS = "Hello World";

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        return new CommandResult(String.format(MESSAGE_SUCCESS));
    }
}
