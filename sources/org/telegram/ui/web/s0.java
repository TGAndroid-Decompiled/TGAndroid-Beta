package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.iu;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f42750a;
    public final JsPromptResult f42751b;
    public final iu f42752c;
    public final org.telegram.ui.ActionBar.b2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, iu iuVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42750a = zArr;
        this.f42751b = jsPromptResult;
        this.f42752c = iuVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42750a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42751b.confirm(this.f42752c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
