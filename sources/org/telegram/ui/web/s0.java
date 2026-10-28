package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.ju;
public final class s0 implements TextView.OnEditorActionListener {
    public final boolean[] f44885a;
    public final JsPromptResult f44886b;
    public final ju f44887c;
    public final org.telegram.ui.ActionBar.e2 d;

    public s0(boolean[] zArr, JsPromptResult jsPromptResult, ju juVar, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f44885a = zArr;
        this.f44886b = jsPromptResult;
        this.f44887c = juVar;
        this.d = e2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f44885a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f44886b.confirm(this.f44887c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
