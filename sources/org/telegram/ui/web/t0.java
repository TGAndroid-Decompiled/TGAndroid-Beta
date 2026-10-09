package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.ru;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f43460a;
    public final JsPromptResult f43461b;
    public final ru f43462c;
    public final org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, ru ruVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f43460a = zArr;
        this.f43461b = jsPromptResult;
        this.f43462c = ruVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43460a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43461b.confirm(this.f43462c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
