package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vu0 implements RequestDelegate {
    public final int f52864a;
    public final xu0 f52865b;

    public vu0(xu0 xu0Var, int i7) {
        this.f52864a = i7;
        this.f52865b = xu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52864a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                xu0 xu0Var = this.f52865b;
                xu0Var.f53939c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new vu0(xu0Var, 1));
                return;
            default:
                this.f52865b.f53939c.getMessagesController().X2(true);
                return;
        }
    }
}
