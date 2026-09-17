package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.zt;
public final class u0 implements TextView.OnEditorActionListener {
    public final boolean[] f42252a;
    public final JsPromptResult f42253b;
    public final zt f42254c;
    public final org.telegram.ui.ActionBar.b2 d;

    public u0(boolean[] zArr, JsPromptResult jsPromptResult, zt ztVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42252a = zArr;
        this.f42253b = jsPromptResult;
        this.f42254c = ztVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42252a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42253b.confirm(this.f42254c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
