package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wy0 implements RequestDelegate {
    public final int f39787a;
    public final zy0 f39788b;

    public wy0(zy0 zy0Var, int i10) {
        this.f39787a = i10;
        this.f39788b = zy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39787a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                zy0 zy0Var = this.f39788b;
                zy0Var.f40904c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new wy0(zy0Var, 1));
                return;
            default:
                this.f39788b.f40904c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
