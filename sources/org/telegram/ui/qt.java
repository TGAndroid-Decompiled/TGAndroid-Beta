package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qt implements RequestDelegate {
    public final int f49147a;
    public final tt f49148b;

    public qt(tt ttVar, int i7) {
        this.f49147a = i7;
        this.f49148b = ttVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49147a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                tt ttVar = this.f49148b;
                ttVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new qt(ttVar, 1));
                return;
            default:
                this.f49148b.getMessagesController().R2(true);
                return;
        }
    }
}
