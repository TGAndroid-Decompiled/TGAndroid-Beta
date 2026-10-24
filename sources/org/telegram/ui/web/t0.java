package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.gu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f43244a;
    public final JsPromptResult f43245b;
    public final gu f43246c;
    public final org.telegram.ui.ActionBar.c2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, gu guVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f43244a = zArr;
        this.f43245b = jsPromptResult;
        this.f43246c = guVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43244a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43245b.confirm(this.f43246c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
