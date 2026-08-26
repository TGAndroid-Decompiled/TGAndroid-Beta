package org.telegram.ui.web;

import org.telegram.messenger.FactCheckController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.EditTextCaption;

public final class BotWebViewContainer$$ExternalSyntheticLambda34 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final Object f$1;
    public final boolean f$2;
    public final int f$3;
    public final Object f$4;

    public BotWebViewContainer$$ExternalSyntheticLambda34(FactCheckController factCheckController, EditTextCaption editTextCaption, int i, MessageObject messageObject, boolean z) {
        this.f$0 = factCheckController;
        this.f$1 = editTextCaption;
        this.f$3 = i;
        this.f$4 = messageObject;
        this.f$2 = z;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$23((String[]) this.f$1, this.f$2, this.f$3, (BotWebViewContainer.MyWebView) this.f$4, alertDialog, i);
                break;
            default:
                ((FactCheckController) this.f$0).lambda$openFactCheckEditor$8((EditTextCaption) this.f$1, this.f$3, (MessageObject) this.f$4, this.f$2, alertDialog, i);
                break;
        }
    }

    public BotWebViewContainer$$ExternalSyntheticLambda34(BotWebViewContainer botWebViewContainer, String[] strArr, boolean z, int i, BotWebViewContainer.MyWebView myWebView) {
        this.f$0 = botWebViewContainer;
        this.f$1 = strArr;
        this.f$2 = z;
        this.f$3 = i;
        this.f$4 = myWebView;
    }
}
