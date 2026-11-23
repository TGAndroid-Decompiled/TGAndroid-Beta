package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rt implements RequestDelegate {
    public final int f51881a;
    public final ut f51882b;

    public rt(ut utVar, int i7) {
        this.f51881a = i7;
        this.f51882b = utVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51881a) {
            case 0:
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PASSWORD";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                ut utVar = this.f51882b;
                utVar.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new rt(utVar, 1));
                return;
            default:
                this.f51882b.getMessagesController().X2(true);
                return;
        }
    }
}
