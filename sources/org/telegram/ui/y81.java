package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y81 implements RequestDelegate {
    public final int f44279a;
    public final i91 f44280b;

    public y81(i91 i91Var, int i10) {
        this.f44279a = i10;
        this.f44280b = i91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44279a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                i91 i91Var = this.f44280b;
                i91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new y81(i91Var, 1));
                return;
            default:
                this.f44280b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
