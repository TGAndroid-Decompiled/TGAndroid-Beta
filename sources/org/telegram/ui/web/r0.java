package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.xt;
public final class r0 implements TextView.OnEditorActionListener {
    public final boolean[] f42680a;
    public final JsPromptResult f42681b;
    public final xt f42682c;
    public final org.telegram.ui.ActionBar.d2 d;

    public r0(boolean[] zArr, JsPromptResult jsPromptResult, xt xtVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f42680a = zArr;
        this.f42681b = jsPromptResult;
        this.f42682c = xtVar;
        this.d = d2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42680a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42681b.confirm(this.f42682c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
