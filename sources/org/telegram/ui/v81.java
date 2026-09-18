package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v81 implements RequestDelegate {
    public final int f38334a;
    public final g91 f38335b;

    public v81(g91 g91Var, int i10) {
        this.f38334a = i10;
        this.f38335b = g91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38334a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                g91 g91Var = this.f38335b;
                g91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new v81(g91Var, 1));
                return;
            default:
                this.f38335b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
