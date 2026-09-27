package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.du;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39162a;
    public final JsPromptResult f39163b;
    public final du f39164c;
    public final org.telegram.ui.ActionBar.c2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, du duVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f39162a = zArr;
        this.f39163b = jsPromptResult;
        this.f39164c = duVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39162a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39163b.confirm(this.f39164c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
