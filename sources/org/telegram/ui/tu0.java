package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tu0 implements RequestDelegate {
    public final int f50132a;
    public final vu0 f50133b;

    public tu0(vu0 vu0Var, int i7) {
        this.f50132a = i7;
        this.f50133b = vu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50132a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vu0 vu0Var = this.f50133b;
                vu0Var.f50827c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new tu0(vu0Var, 1));
                return;
            default:
                this.f50133b.f50827c.getMessagesController().R2(true);
                return;
        }
    }
}
