package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy0 implements RequestDelegate {
    public final int f44141a;
    public final xy0 f44142b;

    public uy0(xy0 xy0Var, int i10) {
        this.f44141a = i10;
        this.f44142b = xy0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44141a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                xy0 xy0Var = this.f44142b;
                xy0Var.f45801c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new uy0(xy0Var, 1));
                return;
            default:
                this.f44142b.f45801c.getMessagesController().loadAppConfig();
                return;
        }
    }
}
