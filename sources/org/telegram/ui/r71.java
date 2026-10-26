package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r71 implements RequestDelegate {
    public final int f43047a;
    public final d81 f43048b;

    public r71(d81 d81Var, int i10) {
        this.f43047a = i10;
        this.f43048b = d81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43047a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                d81 d81Var = this.f43048b;
                d81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new r71(d81Var, 1));
                return;
            default:
                this.f43048b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
