package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.st;
public final class r0 implements TextView.OnEditorActionListener {
    public final boolean[] f44157a;
    public final JsPromptResult f44158b;
    public final st f44159c;
    public final org.telegram.ui.ActionBar.c2 d;

    public r0(boolean[] zArr, JsPromptResult jsPromptResult, st stVar, org.telegram.ui.ActionBar.c2 c2Var) {
        this.f44157a = zArr;
        this.f44158b = jsPromptResult;
        this.f44159c = stVar;
        this.d = c2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f44157a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f44158b.confirm(this.f44159c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
