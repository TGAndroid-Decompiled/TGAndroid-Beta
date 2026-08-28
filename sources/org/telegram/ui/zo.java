package org.telegram.ui;
public final class zo implements q60 {
    public final hp f45191a;

    public zo(hp hpVar) {
        this.f45191a = hpVar;
    }

    @Override
    public final void a(r60 r60Var, long j10) {
        hp hpVar = this.f45191a;
        hpVar.X(hpVar.getMessagesController().getChat(Long.valueOf(j10)), r60Var);
    }
}
