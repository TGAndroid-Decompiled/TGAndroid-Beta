package org.telegram.ui.web;

import android.webkit.JsResult;
import org.telegram.ui.ActionBar.AlertDialog;

public final class BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda5 implements AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final boolean[] f$0;
    public final JsResult f$1;

    public BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda5(boolean[] zArr, JsResult jsResult, int i) {
        this.$r8$classId = i;
        this.f$0 = zArr;
        this.f$1 = jsResult;
    }

    @Override
    public final void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                boolean[] zArr = this.f$0;
                if (!zArr[0]) {
                    zArr[0] = true;
                    this.f$1.cancel();
                }
                break;
            case 1:
                boolean[] zArr2 = this.f$0;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.f$1.confirm();
                }
                break;
            default:
                boolean[] zArr3 = this.f$0;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    this.f$1.confirm();
                }
                break;
        }
    }
}
