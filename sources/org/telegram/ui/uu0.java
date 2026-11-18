package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uu0 implements RequestDelegate {
    public final int f52616a;
    public final wu0 f52617b;

    public uu0(wu0 wu0Var, int i7) {
        this.f52616a = i7;
        this.f52617b = wu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52616a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                wu0 wu0Var = this.f52617b;
                wu0Var.f53484c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new uu0(wu0Var, 1));
                return;
            default:
                this.f52617b.f53484c.getMessagesController().X2(true);
                return;
        }
    }
}
