package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.iu;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f42724a;
    public final JsPromptResult f42725b;
    public final iu f42726c;
    public final org.telegram.ui.ActionBar.b2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, iu iuVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42724a = zArr;
        this.f42725b = jsPromptResult;
        this.f42726c = iuVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42724a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42725b.confirm(this.f42726c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
