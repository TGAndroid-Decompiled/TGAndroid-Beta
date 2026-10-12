package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.nu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f41487a;
    public final JsPromptResult f41488b;
    public final nu f41489c;
    public final org.telegram.ui.ActionBar.a2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, nu nuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f41487a = zArr;
        this.f41488b = jsPromptResult;
        this.f41489c = nuVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f41487a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f41488b.confirm(this.f41489c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
