package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.su;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f43506a;
    public final JsPromptResult f43507b;
    public final su f43508c;
    public final org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, su suVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f43506a = zArr;
        this.f43507b = jsPromptResult;
        this.f43508c = suVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43506a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43507b.confirm(this.f43508c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
