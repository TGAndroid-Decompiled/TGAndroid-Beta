package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qt implements RequestDelegate {
    public final int f50789a;
    public final tt f50790b;

    public qt(tt ttVar, int i7) {
        this.f50789a = i7;
        this.f50790b = ttVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50789a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                tt ttVar = this.f50790b;
                ttVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new qt(ttVar, 1));
                return;
            default:
                this.f50790b.getMessagesController().R2(true);
                return;
        }
    }
}
