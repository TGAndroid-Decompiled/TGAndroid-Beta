package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wu0 implements RequestDelegate {
    public final int f51483a;
    public final yu0 f51484b;

    public wu0(yu0 yu0Var, int i7) {
        this.f51483a = i7;
        this.f51484b = yu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51483a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                yu0 yu0Var = this.f51484b;
                yu0Var.f52195c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new wu0(yu0Var, 1));
                return;
            default:
                this.f51484b.f52195c.getMessagesController().R2(true);
                return;
        }
    }
}
