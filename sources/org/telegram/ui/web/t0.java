package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.eu;
public final class t0 implements TextView.OnEditorActionListener {
    public final boolean[] f42362a;
    public final JsPromptResult f42363b;
    public final eu f42364c;
    public final org.telegram.ui.ActionBar.b2 d;

    public t0(boolean[] zArr, JsPromptResult jsPromptResult, eu euVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f42362a = zArr;
        this.f42363b = jsPromptResult;
        this.f42364c = euVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f42362a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f42363b.confirm(this.f42364c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
