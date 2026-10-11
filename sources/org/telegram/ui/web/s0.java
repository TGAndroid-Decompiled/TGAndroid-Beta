package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.su;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f43677a;
    public final JsPromptResult f43678b;
    public final su f43679c;
    public final org.telegram.ui.ActionBar.a2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, su suVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43677a = zArr;
        this.f43678b = jsPromptResult;
        this.f43679c = suVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43677a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43678b.confirm(this.f43679c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
