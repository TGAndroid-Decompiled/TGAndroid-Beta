package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r71 implements RequestDelegate {
    public final int f41991a;
    public final b81 f41992b;

    public r71(b81 b81Var, int i10) {
        this.f41991a = i10;
        this.f41992b = b81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41991a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                b81 b81Var = this.f41992b;
                b81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new r71(b81Var, 1));
                return;
            default:
                this.f41992b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
