package org.telegram.ui.web;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.r20;
import org.telegram.ui.Components.mt;
public final class q0 implements TextView.OnEditorActionListener {
    public final int f42971a;
    public final Object f42972b;
    public final Object f42973c;
    public final Object d;
    public final Object e;

    public q0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f42971a = i10;
        this.f42972b = obj;
        this.f42973c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f42971a) {
            case 0:
                if (i10 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f42972b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f42973c).confirm(((mt) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.x1) this.e).dismiss();
                }
                return true;
            default:
                ph.t1 t1Var = (ph.t1) this.f42972b;
                if (i10 != 6) {
                    return false;
                }
                String obj = t1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((r20) this.f42973c).a(obj);
                    org.telegram.ui.ActionBar.x1 x1Var = ((org.telegram.ui.ActionBar.x1[]) this.d)[0];
                    if (x1Var != null) {
                        x1Var.dismiss();
                    }
                    View view = (View) this.e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.i0.E3(t1Var);
                }
                return true;
        }
    }
}
