package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qt implements RequestDelegate {
    public final int f50788a;
    public final tt f50789b;

    public qt(tt ttVar, int i7) {
        this.f50788a = i7;
        this.f50789b = ttVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50788a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                tt ttVar = this.f50789b;
                ttVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new qt(ttVar, 1));
                return;
            default:
                this.f50789b.getMessagesController().R2(true);
                return;
        }
    }
}
