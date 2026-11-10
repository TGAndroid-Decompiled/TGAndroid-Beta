package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xu0 implements RequestDelegate {
    public final int f51824a;
    public final zu0 f51825b;

    public xu0(zu0 zu0Var, int i7) {
        this.f51824a = i7;
        this.f51825b = zu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51824a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                zu0 zu0Var = this.f51825b;
                zu0Var.f52541c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new xu0(zu0Var, 1));
                return;
            default:
                this.f51825b.f52541c.getMessagesController().R2(true);
                return;
        }
    }
}
