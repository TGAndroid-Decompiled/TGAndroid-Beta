package org.telegram.ui;
public final class sp implements o70 {
    public final aq f40189a;

    public sp(aq aqVar) {
        this.f40189a = aqVar;
    }

    @Override
    public final void a(p70 p70Var, long j10) {
        aq aqVar = this.f40189a;
        aqVar.Y(aqVar.getMessagesController().getChat(Long.valueOf(j10)), p70Var);
    }
}
