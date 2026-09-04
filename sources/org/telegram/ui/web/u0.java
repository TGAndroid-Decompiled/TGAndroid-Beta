package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.zt;
public final class u0 implements TextView.OnEditorActionListener {
    public final boolean[] f42251a;
    public final JsPromptResult f42252b;
    public final zt f42253c;
    public final org.telegram.ui.ActionBar.b2 d;

    public u0(boolean[] zArr, JsPromptResult jsPromptResult, zt ztVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42251a = zArr;
        this.f42252b = jsPromptResult;
        this.f42253c = ztVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42251a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42252b.confirm(this.f42253c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
