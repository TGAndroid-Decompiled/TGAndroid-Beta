package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.uu;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f43398a;
    public final JsPromptResult f43399b;
    public final uu f43400c;
    public final org.telegram.ui.ActionBar.a2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, uu uuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43398a = zArr;
        this.f43399b = jsPromptResult;
        this.f43400c = uuVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43398a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43399b.confirm(this.f43400c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
