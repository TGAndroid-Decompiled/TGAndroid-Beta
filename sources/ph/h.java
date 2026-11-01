package ph;

import android.app.Activity;
import android.content.Context;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.dd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.LaunchActivity;
import rh.v8;
import w7.b6;
public final class h extends v8 {
    public final m m0;

    public h(m mVar, Context context, p6 p6Var) {
        super(context, p6Var);
        this.m0 = mVar;
    }

    @Override
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m mVar = this.m0;
        Context context = mVar.getContext();
        Activity W = org.telegram.messenger.i0.W(context);
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (W != null) {
            W.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, mVar.I0);
        String L0 = dd.L0(2131750352, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = dd.a0(null, null, 2131750351, Integer.valueOf(mVar.f45227d2.d.gifts_per_round));
        ih.b bVar = new ih.b(context, mVar.I0, i0.a.f(context, 2131232749));
        bVar.setTextSize(1, 18.0f);
        a7.V(bVar, t6.f21038j5, mVar.I0);
        a7.m(bVar, 34, t6.Li, mVar.I0);
        bVar.setHintText(dd.L0(2131750350, null));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        a7.G(bVar, t6.f21059k6, t6.f21077l6, t6.f21154p7, mVar.I0);
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.f24004k1 = org.telegram.messenger.i0.L(24.0f);
        bVar.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        bVar.addTextChangedListener(new ag.u2(mVar, viewArr, false, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        x1Var.f21469a = org.telegram.messenger.i0.L(300.0f);
        alertDialog$Builder.k(dd.L0(2131750354, null), new org.telegram.ui.web.k0(2, mVar, bVar));
        alertDialog$Builder.h(dd.L0(2131752589, null), new org.telegram.utils.twidget.t(6));
        org.telegram.ui.ActionBar.x1[] x1VarArr = {x1Var};
        if (Q != null) {
            org.telegram.messenger.i0.Y2(W, Q.getClassGuid());
        }
        x1VarArr[0].setOnDismissListener(new org.telegram.ui.Components.z1(bVar, Q, W, 3));
        x1VarArr[0].setOnShowListener(new ag.d0(bVar, 2));
        x1VarArr[0].show();
        View d = x1VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        x1VarArr[0].f21491j0 = false;
        bVar.setSelection(bVar.getText().length());
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - org.telegram.messenger.i0.L(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i10) {
        m.d1(this.m0, i10);
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        m.d1(this.m0, i10);
    }
}
