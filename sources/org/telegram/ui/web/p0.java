package org.telegram.ui.web;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.ys;
public final class p0 implements TextView.OnEditorActionListener {
    public final int f51203a;
    public final Object f51204b;
    public final Object f51205c;
    public final Object d;
    public final Object f51206e;

    public p0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f51203a = i7;
        this.f51204b = obj;
        this.f51205c = obj2;
        this.d = obj3;
        this.f51206e = obj4;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f51203a) {
            case 0:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.f51204b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.f51205c).confirm(((ys) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.u1) this.f51206e).dismiss();
                }
                return true;
            default:
                zh.n1 n1Var = (zh.n1) this.f51204b;
                if (i7 != 6) {
                    return false;
                }
                String obj = n1Var.getText().toString();
                if (obj.length() > 0 && obj.length() <= 12) {
                    ((c20) this.f51205c).a(obj);
                    org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.d)[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
                    }
                    View view = (View) this.f51206e;
                    if (view != null) {
                        view.requestFocus();
                    }
                } else {
                    org.telegram.messenger.g0.F3(n1Var);
                }
                return true;
        }
    }
}
