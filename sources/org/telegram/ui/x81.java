package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x81 implements RequestDelegate {
    public final int f44007a;
    public final h91 f44008b;

    public x81(h91 h91Var, int i10) {
        this.f44007a = i10;
        this.f44008b = h91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44007a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                h91 h91Var = this.f44008b;
                h91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new x81(h91Var, 1));
                return;
            default:
                this.f44008b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
