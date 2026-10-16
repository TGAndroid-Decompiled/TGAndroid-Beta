package org.telegram.ui.web;

import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.ui.Components.nu;
public final class u0 implements TextView.OnEditorActionListener {
    public final boolean[] f41188a;
    public final JsPromptResult f41189b;
    public final nu f41190c;
    public final org.telegram.ui.ActionBar.a2 d;

    public u0(boolean[] zArr, JsPromptResult jsPromptResult, nu nuVar, org.telegram.ui.ActionBar.a2 a2Var) {
        this.f41188a = zArr;
        this.f41189b = jsPromptResult;
        this.f41190c = nuVar;
        this.d = a2Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        boolean[] zArr = this.f41188a;
        if (!zArr[0]) {
            zArr[0] = true;
            this.f41189b.confirm(this.f41190c.getText().toString());
            this.d.dismiss();
        }
        return true;
    }
}
