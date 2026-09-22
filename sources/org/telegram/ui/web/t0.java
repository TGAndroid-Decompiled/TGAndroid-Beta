package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.bu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f39092a;
    public final JsPromptResult f39093b;
    public final bu f39094c;
    public final org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, bu buVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f39092a = zArr;
        this.f39093b = jsPromptResult;
        this.f39094c = buVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f39092a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f39093b.confirm(this.f39094c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
