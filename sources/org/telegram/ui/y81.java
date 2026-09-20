package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y81 implements RequestDelegate {
    public final int f39832a;
    public final i91 f39833b;

    public y81(i91 i91Var, int i10) {
        this.f39832a = i10;
        this.f39833b = i91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39832a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                i91 i91Var = this.f39833b;
                i91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new y81(i91Var, 1));
                return;
            default:
                this.f39833b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
