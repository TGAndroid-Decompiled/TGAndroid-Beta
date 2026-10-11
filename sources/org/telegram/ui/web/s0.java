package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.su;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f43643a;
    public final JsPromptResult f43644b;
    public final su f43645c;
    public final org.telegram.ui.ActionBar.a2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, su suVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43643a = zArr;
        this.f43644b = jsPromptResult;
        this.f43645c = suVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43643a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43644b.confirm(this.f43645c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
