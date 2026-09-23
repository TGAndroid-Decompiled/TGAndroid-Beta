package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.cu;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f38827a;
    public final JsPromptResult f38828b;
    public final cu f38829c;
    public final org.telegram.ui.ActionBar.b2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, cu cuVar, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f38827a = zArr;
        this.f38828b = jsPromptResult;
        this.f38829c = cuVar;
        this.d = b2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f38827a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f38828b.confirm(this.f38829c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
