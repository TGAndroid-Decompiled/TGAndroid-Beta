package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.cu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39206a;
    public final JsPromptResult f39207b;
    public final cu f39208c;
    public final org.telegram.ui.ActionBar.a2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, cu cuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f39206a = zArr;
        this.f39207b = jsPromptResult;
        this.f39208c = cuVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39206a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39207b.confirm(this.f39208c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
