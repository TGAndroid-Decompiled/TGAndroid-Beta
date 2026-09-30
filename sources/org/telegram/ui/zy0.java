package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zy0 implements RequestDelegate {
    public final int f40606a;
    public final cz0 f40607b;

    public zy0(cz0 cz0Var, int i10) {
        this.f40606a = i10;
        this.f40607b = cz0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40606a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                cz0 cz0Var = this.f40607b;
                cz0Var.f32832c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new zy0(cz0Var, 1));
                return;
            default:
                this.f40607b.f32832c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
