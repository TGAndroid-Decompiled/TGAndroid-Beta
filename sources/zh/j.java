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
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.LaunchActivity;
public final class j extends zd {
    public final m m0;

    public j(m mVar, Context context, f6 f6Var) {
        super(context, f6Var);
        this.m0 = mVar;
    }

    @Override
    public final boolean d(float f10) {
        if (getProgress() <= 0.99d && f10 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m mVar = this.m0;
        Context context = mVar.getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, mVar.I0);
        String M0 = hd.M0(2131750342, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = hd.a0(null, null, 2131750341, Integer.valueOf(mVar.d2.d.gifts_per_round));
        z5 z5Var = new z5(context, mVar.I0, jg.g.h(context, 2131232752));
        z5Var.setTextSize(1, 18.0f);
        r6.V(z5Var, k6.f27957j5, mVar.I0);
        r6.m(z5Var, 34, k6.Li, mVar.I0);
        z5Var.setHintText(hd.M0(2131750340, null));
        z5Var.setFocusable(true);
        z5Var.setInputType(2);
        z5Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        r6.G(z5Var, k6.f27978k6, k6.f27996l6, k6.f28070p7, mVar.I0);
        z5Var.setImeOptions(268435462);
        z5Var.setBackgroundDrawable(null);
        z5Var.f31347k1 = org.telegram.messenger.g0.L(24.0f);
        z5Var.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        z5Var.addTextChangedListener(new h7(11, mVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(z5Var, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.f28548a = org.telegram.messenger.g0.L(300.0f);
        alertDialog$Builder.k(hd.M0(2131750344, null), new org.telegram.ui.web.a0(27, mVar, z5Var));
        alertDialog$Builder.h(hd.M0(2131752589, null), new h(0));
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
        u1VarArr[0].f28571j0 = false;
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
        m.d1(this.m0, i7);
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        m.d1(this.m0, i7);
    }
}
