package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.bu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f38931a;
    public final JsPromptResult f38932b;
    public final bu f38933c;
    public final org.telegram.ui.ActionBar.c2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, bu buVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f38931a = zArr;
        this.f38932b = jsPromptResult;
        this.f38933c = buVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f38931a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f38932b.confirm(this.f38933c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
