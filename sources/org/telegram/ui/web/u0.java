package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.zt;
public final class u0 implements TextView.OnEditorActionListener {
    public final boolean[] f42279a;
    public final JsPromptResult f42280b;
    public final zt f42281c;
    public final org.telegram.ui.ActionBar.b2 d;

    public u0(boolean[] zArr, JsPromptResult jsPromptResult, zt ztVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42279a = zArr;
        this.f42280b = jsPromptResult;
        this.f42281c = ztVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42279a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42280b.confirm(this.f42281c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
