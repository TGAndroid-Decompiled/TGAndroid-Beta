package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.lt;

public final class r0 implements TextView.OnEditorActionListener {

    public final boolean[] f43954a;

    public final JsPromptResult f43955b;

    public final lt f43956c;
    public final org.telegram.ui.ActionBar.b2 d;

    public r0(boolean[] zArr, JsPromptResult jsPromptResult, lt ltVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f43954a = zArr;
        this.f43955b = jsPromptResult;
        this.f43956c = ltVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43954a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43955b.confirm(this.f43956c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
