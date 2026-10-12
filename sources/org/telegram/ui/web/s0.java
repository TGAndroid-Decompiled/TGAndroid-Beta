package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.uu;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f43393a;
    public final JsPromptResult f43394b;
    public final uu f43395c;
    public final org.telegram.ui.ActionBar.a2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, uu uuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f43393a = zArr;
        this.f43394b = jsPromptResult;
        this.f43395c = uuVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43393a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43394b.confirm(this.f43395c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
