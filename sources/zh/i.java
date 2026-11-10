package zh;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import bi.zd;
import c8.ha;
import fi.h7;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.LaunchActivity;
public final class i extends zd {
    public final l m0;

    public i(l lVar, Context context, h6 h6Var) {
        super(context, h6Var);
        this.m0 = lVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        l lVar = this.m0;
        Context context = lVar.getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, lVar.I0);
        String M0 = id.M0(2131750343, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.R = M0;
        u1Var.T = id.a0(null, null, 2131750342, Integer.valueOf(lVar.f60438g2.d.gifts_per_round));
        z5 z5Var = new z5(context, lVar.I0, jg.g.h(context, 2131232752));
        z5Var.setTextSize(1, 18.0f);
        t6.U(z5Var, m6.f27998j5, lVar.I0);
        t6.l(z5Var, 34, m6.Li, lVar.I0);
        z5Var.setHintText(id.M0(2131750341, null));
        z5Var.setFocusable(true);
        z5Var.setInputType(2);
        z5Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        t6.F(z5Var, m6.f28019k6, m6.f28037l6, m6.f28111p7, lVar.I0);
        z5Var.setImeOptions(268435462);
        z5Var.setBackgroundDrawable(null);
        z5Var.f31367k1 = org.telegram.messenger.g0.L(24.0f);
        z5Var.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        z5Var.addTextChangedListener(new h7(11, lVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(z5Var, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f28537a = org.telegram.messenger.g0.L(300.0f);
        alertDialog$Builder.k(id.M0(2131750345, null), new org.telegram.ui.web.a0(26, lVar, z5Var));
        alertDialog$Builder.h(id.M0(2131752589, null), new z3.j(1));
        org.telegram.ui.ActionBar.u1[] u1VarArr = {u1Var};
        if (Q != null) {
            org.telegram.messenger.g0.Z2(W, Q.getClassGuid());
        }
        u1VarArr[0].setOnDismissListener(new hi.o0(z5Var, Q, W, 5));
        u1VarArr[0].setOnShowListener(new kg.r(z5Var, 2));
        u1VarArr[0].show();
        View d = u1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        u1VarArr[0].f28560j0 = false;
        z5Var.setSelection(z5Var.getText().length());
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - org.telegram.messenger.g0.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i7) {
        l.d1(this.m0, i7);
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        l.d1(this.m0, i7);
    }
}
