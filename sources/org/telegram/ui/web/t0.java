package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.eu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f42342a;
    public final JsPromptResult f42343b;
    public final eu f42344c;
    public final org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, eu euVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42342a = zArr;
        this.f42343b = jsPromptResult;
        this.f42344c = euVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42342a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42343b.confirm(this.f42344c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
