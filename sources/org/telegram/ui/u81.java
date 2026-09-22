package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u81 implements RequestDelegate {
    public final int f37847a;
    public final f91 f37848b;

    public u81(f91 f91Var, int i10) {
        this.f37847a = i10;
        this.f37848b = f91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37847a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                f91 f91Var = this.f37848b;
                f91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new u81(f91Var, 1));
                return;
            default:
                this.f37848b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
