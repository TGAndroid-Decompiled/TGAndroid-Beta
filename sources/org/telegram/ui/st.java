package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class st implements RequestDelegate {
    public final int f52072a;
    public final vt f52073b;

    public st(vt vtVar, int i7) {
        this.f52072a = i7;
        this.f52073b = vtVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52072a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vt vtVar = this.f52073b;
                vtVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new st(vtVar, 1));
                return;
            default:
                this.f52073b.getMessagesController().X2(true);
                return;
        }
    }
}
