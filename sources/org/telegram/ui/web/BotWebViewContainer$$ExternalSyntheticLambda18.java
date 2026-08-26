package org.telegram.ui.web;

import android.webkit.JsPromptResult;
import org.telegram.ui.ActionBar.AlertDialog;

public final class BotWebViewContainer$$ExternalSyntheticLambda18 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BotWebViewContainer$$ExternalSyntheticLambda18(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$15((String[]) this.f$1, alertDialog, i);
                break;
            default:
                boolean[] zArr = (boolean[]) this.f$0;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f$1).cancel();
                }
                break;
        }
    }
}
