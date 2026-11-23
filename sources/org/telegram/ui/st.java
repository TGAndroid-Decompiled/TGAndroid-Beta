package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class st implements RequestDelegate {
    public final int f52080a;
    public final vt f52081b;

    public st(vt vtVar, int i7) {
        this.f52080a = i7;
        this.f52081b = vtVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52080a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vt vtVar = this.f52081b;
                vtVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new st(vtVar, 1));
                return;
            default:
                this.f52081b.getMessagesController().X2(true);
                return;
        }
    }
}
