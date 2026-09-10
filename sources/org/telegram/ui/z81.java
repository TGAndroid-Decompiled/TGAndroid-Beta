package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z81 implements RequestDelegate {
    public final int f39233a;
    public final k91 f39234b;

    public z81(k91 k91Var, int i10) {
        this.f39233a = i10;
        this.f39234b = k91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39233a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                k91 k91Var = this.f39234b;
                k91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new z81(k91Var, 1));
                return;
            default:
                this.f39234b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
