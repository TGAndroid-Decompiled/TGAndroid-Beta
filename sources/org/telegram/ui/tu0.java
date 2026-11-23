package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tu0 implements RequestDelegate {
    public final int f52482a;
    public final vu0 f52483b;

    public tu0(vu0 vu0Var, int i7) {
        this.f52482a = i7;
        this.f52483b = vu0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f52482a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                vu0 vu0Var = this.f52483b;
                vu0Var.f53035c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new tu0(vu0Var, 1));
                return;
            default:
                this.f52483b.f53035c.getMessagesController().X2(true);
                return;
        }
    }
}
