package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class st implements RequestDelegate {
    public final int f52070a;
    public final vt f52071b;

    public st(vt vtVar, int i7) {
        this.f52070a = i7;
        this.f52071b = vtVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52070a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vt vtVar = this.f52071b;
                vtVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new st(vtVar, 1));
                return;
            default:
                this.f52071b.getMessagesController().X2(true);
                return;
        }
    }
}
