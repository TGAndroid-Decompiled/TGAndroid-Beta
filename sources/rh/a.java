package rh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.p80;
public final class a extends LinearLayout implements vs {
    public final int f46607a;
    public final org.telegram.ui.ActionBar.p6 f46608b;
    public final TextView f46609c;
    public final p80 d;
    public sf.b e;
    public final dq[] f46610f;

    public a(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, i10, sf.b.f48267a, p6Var);
    }

    public final void a() {
        sf.b bVar = this.e;
        int i10 = this.f46607a;
        sf.a s10 = e6.x(i10, bVar).s();
        sf.b bVar2 = this.e;
        sf.b bVar3 = sf.b.f48267a;
        TextView textView = this.f46609c;
        org.telegram.ui.ActionBar.p6 p6Var = this.f46608b;
        p80 p80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(h8.a1(false, dd.a0(null, null, 2131750125, dd.E(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.t6.uj;
            org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
            org.telegram.ui.ActionBar.a7.H(p80Var, i11, p6Var);
            p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(dd.L0(2131750124, null), new ph.x1(this, 7)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
        } else if (bVar2 == sf.b.f48268b) {
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, 2131750123, s10.b()));
            dq[] dqVarArr = this.f46610f;
            textView.setText(h8.a1(true, W2, 0.6f, dqVarArr));
            dqVarArr[0].a(org.telegram.ui.ActionBar.t6.uj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.u1.i().getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", 2, (long) (s10.c() * ((org.telegram.messenger.k0) wp.r1(i10).f19300y7.f18036l.f13481b).f16536a * 100.0d), false));
            int i12 = org.telegram.ui.ActionBar.t6.vj;
            int i13 = org.telegram.ui.ActionBar.t6.tj;
            org.telegram.ui.ActionBar.a7.n(p80Var, i12, i13, 3, 0.33f, p6Var);
            org.telegram.ui.ActionBar.a7.o(p80Var, 2, i12, i13, 3, 0.33f, p6Var);
            p80Var.setText(sb2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.y3) {
            a();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        int i10 = this.f46607a;
        at.f(i10).c(this, at.y3);
        at.f(i10).c(this, at.C3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f46607a;
        at.f(i10).n(this, at.y3);
        at.f(i10).n(this, at.C3);
    }

    public a(Context context, int i10, sf.b bVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f46610f = new dq[1];
        this.f46607a = i10;
        this.f46608b = p6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(9.0f));
        int L = org.telegram.messenger.i0.L(24.0f);
        int i11 = org.telegram.ui.ActionBar.t6.tj;
        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(this, d02, N, null, p6Var);
        TextView textView = new TextView(context);
        this.f46609c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.vj, p6Var);
        textView.setGravity(17);
        addView(textView, w7.b6.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        p80 p80Var = new p80(context, p6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 12.0f);
        p80Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.T2(dd.L0(2131750124, null), new cs(2, context, p6Var)), true, org.telegram.messenger.i0.L(2.6666667f), org.telegram.messenger.i0.L(1.0f)));
        p80Var.setGravity(17);
        addView(p80Var, w7.b6.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
