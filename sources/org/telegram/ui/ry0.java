package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry0 implements RequestDelegate {
    public final int f41073a;
    public final uy0 f41074b;

    public ry0(uy0 uy0Var, int i10) {
        this.f41073a = i10;
        this.f41074b = uy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41073a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                uy0 uy0Var = this.f41074b;
                uy0Var.f42067c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new ry0(uy0Var, 1));
                return;
            default:
                this.f41074b.f42067c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
