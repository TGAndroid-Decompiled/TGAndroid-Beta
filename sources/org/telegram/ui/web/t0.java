package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.du;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39205a;
    public final JsPromptResult f39206b;
    public final du f39207c;
    public final org.telegram.ui.ActionBar.a2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, du duVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f39205a = zArr;
        this.f39206b = jsPromptResult;
        this.f39207c = duVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39205a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39206b.confirm(this.f39207c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
