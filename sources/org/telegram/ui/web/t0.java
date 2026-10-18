package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.iu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f42734a;
    public final JsPromptResult f42735b;
    public final iu f42736c;
    public final org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, iu iuVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42734a = zArr;
        this.f42735b = jsPromptResult;
        this.f42736c = iuVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42734a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42735b.confirm(this.f42736c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
