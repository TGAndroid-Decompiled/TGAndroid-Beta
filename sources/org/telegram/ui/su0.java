package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class su0 implements RequestDelegate {
    public final int f51278a;
    public final uu0 f51279b;

    public su0(uu0 uu0Var, int i7) {
        this.f51278a = i7;
        this.f51279b = uu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51278a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                uu0 uu0Var = this.f51279b;
                uu0Var.f52030c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new su0(uu0Var, 1));
                return;
            default:
                this.f51279b.f52030c.getMessagesController().R2(true);
                return;
        }
    }
}
