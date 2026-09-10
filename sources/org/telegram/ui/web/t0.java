package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.fu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f38081a;
    public final JsPromptResult f38082b;
    public final fu f38083c;
    public final org.telegram.ui.ActionBar.d2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, fu fuVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f38081a = zArr;
        this.f38082b = jsPromptResult;
        this.f38083c = fuVar;
        this.d = d2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f38081a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f38082b.confirm(this.f38083c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
