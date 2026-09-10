package org.telegram.ui;
public final class qp implements j70 {
    public final yp f36114a;

    public qp(yp ypVar) {
        this.f36114a = ypVar;
    }

    @Override
    public final void a(k70 k70Var, long j3) {
        yp ypVar = this.f36114a;
        ypVar.Y(ypVar.getMessagesController().getChat(Long.valueOf(j3)), k70Var);
    }
}
