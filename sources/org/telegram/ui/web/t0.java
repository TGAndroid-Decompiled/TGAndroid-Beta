package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.ut;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39580a;
    public final JsPromptResult f39581b;
    public final ut f39582c;
    public final org.telegram.ui.ActionBar.d2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, ut utVar, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f39580a = zArr;
        this.f39581b = jsPromptResult;
        this.f39582c = utVar;
        this.d = d2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39580a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39581b.confirm(this.f39582c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
