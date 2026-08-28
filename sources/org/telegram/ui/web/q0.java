package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.mt;
public final class q0 implements TextView.OnEditorActionListener {
    public final boolean[] f43967a;
    public final JsPromptResult f43968b;
    public final mt f43969c;
    public final org.telegram.ui.ActionBar.c2 d;

    public q0(boolean[] zArr, JsPromptResult jsPromptResult, mt mtVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f43967a = zArr;
        this.f43968b = jsPromptResult;
        this.f43969c = mtVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        boolean[] zArr = this.f43967a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43968b.confirm(this.f43969c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
