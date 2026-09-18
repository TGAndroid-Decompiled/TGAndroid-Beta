package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.bu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f38936a;
    public final JsPromptResult f38937b;
    public final bu f38938c;
    public final org.telegram.ui.ActionBar.c2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, bu buVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38936a = zArr;
        this.f38937b = jsPromptResult;
        this.f38938c = buVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f38936a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f38937b.confirm(this.f38938c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
