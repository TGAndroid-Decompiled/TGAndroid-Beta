package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy0 implements RequestDelegate {
    public final int f43624a;
    public final vy0 f43625b;

    public sy0(vy0 vy0Var, int i10) {
        this.f43624a = i10;
        this.f43625b = vy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43624a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vy0 vy0Var = this.f43625b;
                vy0Var.f44924c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new sy0(vy0Var, 1));
                return;
            default:
                this.f43625b.f44924c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
