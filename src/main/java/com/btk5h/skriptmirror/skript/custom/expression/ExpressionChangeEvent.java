package com.btk5h.skriptmirror.skript.custom.expression;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import com.btk5h.skriptmirror.skript.custom.CustomSyntaxEvent;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ExpressionChangeEvent extends CustomSyntaxEvent {
  private final static HandlerList handlers = new HandlerList();
  private final Object[] delta;

  public ExpressionChangeEvent(Event event, Expression<?>[] expressions,
                               SkriptParser.ParseResult parseResult, Object[] delta) {
    super(event, expressions, parseResult);
    this.delta = delta;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public Object[] getDelta() {
    return delta;
  }

  @Override
  public HandlerList getHandlers() {
    return handlers;
  }
}