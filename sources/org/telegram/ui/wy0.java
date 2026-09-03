package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wy0 implements RequestDelegate {
    public final int f42875a;
    public final zy0 f42876b;

    public wy0(zy0 zy0Var, int i10) {
        this.f42875a = i10;
        this.f42876b = zy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42875a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                zy0 zy0Var = this.f42876b;
                zy0Var.f44047c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new wy0(zy0Var, 1));
                return;
            default:
                this.f42876b.f44047c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
