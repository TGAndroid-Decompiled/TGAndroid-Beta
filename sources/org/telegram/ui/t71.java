package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t71 implements RequestDelegate {
    public final int f43532a;
    public final f81 f43533b;

    public t71(f81 f81Var, int i10) {
        this.f43532a = i10;
        this.f43533b = f81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43532a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                f81 f81Var = this.f43533b;
                f81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new t71(f81Var, 1));
                return;
            default:
                this.f43533b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
