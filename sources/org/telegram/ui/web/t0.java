package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.cu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39207a;
    public final JsPromptResult f39208b;
    public final cu f39209c;
    public final org.telegram.ui.ActionBar.a2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, cu cuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f39207a = zArr;
        this.f39208b = jsPromptResult;
        this.f39209c = cuVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39207a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39208b.confirm(this.f39209c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
