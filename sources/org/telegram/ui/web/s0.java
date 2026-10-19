package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.iu;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f42767a;
    public final JsPromptResult f42768b;
    public final iu f42769c;
    public final org.telegram.ui.ActionBar.b2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, iu iuVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42767a = zArr;
        this.f42768b = jsPromptResult;
        this.f42769c = iuVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42767a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42768b.confirm(this.f42769c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
