package the_fireplace.lib.api.command;

import com.mojang.brigadier.tree.CommandNode;

public interface HelpCommand extends RegisterableCommand {
	HelpCommand addCommands(CommandNode<?>... commands);

	HelpCommand addCommands(String... commands);

	HelpCommand addSubCommandsFromCommand(CommandNode<?>... commands);
}