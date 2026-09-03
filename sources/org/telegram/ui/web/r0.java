package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.xt;
public final class r0 implements TextView.OnEditorActionListener {
    public final boolean[] f42643a;
    public final JsPromptResult f42644b;
    public final xt f42645c;
    public final org.telegram.ui.ActionBar.d2 d;

    public r0(boolean[] zArr, JsPromptResult jsPromptResult, xt xtVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f42643a = zArr;
        this.f42644b = jsPromptResult;
        this.f42645c = xtVar;
        this.d = d2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42643a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42644b.confirm(this.f42645c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
