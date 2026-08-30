package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.vt;
public final class r0 implements TextView.OnEditorActionListener {
    public final boolean[] f39615a;
    public final JsPromptResult f39616b;
    public final vt f39617c;
    public final org.telegram.ui.ActionBar.d2 d;

    public r0(boolean[] zArr, JsPromptResult jsPromptResult, vt vtVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f39615a = zArr;
        this.f39616b = jsPromptResult;
        this.f39617c = vtVar;
        this.d = d2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39615a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39616b.confirm(this.f39617c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
