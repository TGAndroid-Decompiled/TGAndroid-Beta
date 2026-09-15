package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t81 implements RequestDelegate {
    public final int f37590a;
    public final e91 f37591b;

    public t81(e91 e91Var, int i10) {
        this.f37590a = i10;
        this.f37591b = e91Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37590a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                e91 e91Var = this.f37591b;
                e91Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new t81(e91Var, 1));
                return;
            default:
                this.f37591b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
