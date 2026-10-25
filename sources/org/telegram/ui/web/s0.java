package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.ju;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f45371a;
    public final JsPromptResult f45372b;
    public final ju f45373c;
    public final org.telegram.ui.ActionBar.e2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, ju juVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f45371a = zArr;
        this.f45372b = jsPromptResult;
        this.f45373c = juVar;
        this.d = e2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f45371a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f45372b.confirm(this.f45373c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
