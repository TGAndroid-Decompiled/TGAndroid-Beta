package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r71 implements RequestDelegate {
    public final int f41040a;
    public final c81 f41041b;

    public r71(c81 c81Var, int i10) {
        this.f41040a = i10;
        this.f41041b = c81Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41040a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                c81 c81Var = this.f41041b;
                c81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new r71(c81Var, 1));
                return;
            default:
                this.f41041b.getMessagesController().loadAppConfig();
                return;
        }
    }
}
