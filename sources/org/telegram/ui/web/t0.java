package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.eu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39295a;
    public final JsPromptResult f39296b;
    public final eu f39297c;
    public final org.telegram.ui.ActionBar.a2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, eu euVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f39295a = zArr;
        this.f39296b = jsPromptResult;
        this.f39297c = euVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39295a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39296b.confirm(this.f39297c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
