package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.bu;
public final class u0 implements TextView.OnEditorActionListener {
    public final boolean[] f39075a;
    public final JsPromptResult f39076b;
    public final bu f39077c;
    public final org.telegram.ui.ActionBar.b2 d;

    public u0(boolean[] zArr, JsPromptResult jsPromptResult, bu buVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f39075a = zArr;
        this.f39076b = jsPromptResult;
        this.f39077c = buVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39075a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39076b.confirm(this.f39077c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
