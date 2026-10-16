package org.telegram.ui;
public final class rp implements o70 {
    public final aq f39566a;

    public rp(aq aqVar) {
        this.f39566a = aqVar;
    }

    @Override
    public final void a(p70 p70Var, long j10) {
        aq aqVar = this.f39566a;
        aqVar.Y(aqVar.getMessagesController().getChat(Long.valueOf(j10)), p70Var);
    }
}
