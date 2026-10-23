package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.iu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f43255a;
    public final JsPromptResult f43256b;
    public final iu f43257c;
    public final org.telegram.ui.ActionBar.c2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, iu iuVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f43255a = zArr;
        this.f43256b = jsPromptResult;
        this.f43257c = iuVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f43255a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f43256b.confirm(this.f43257c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
