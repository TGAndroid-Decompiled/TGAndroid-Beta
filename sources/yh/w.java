package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.u51;
import org.telegram.ui.y01;
import w7.b6;
import w7.n7;
public final class w extends y {
    public final g9 h;
    public final r8 f54534n;
    public final a0 f54535r;

    public w(a0 a0Var, Context context) {
        super(a0Var, context);
        this.f54535r = a0Var;
        u51 u51Var = new u51(context, a0Var.f21583a, 0, false, new r(a0Var, 4), new s(a0Var, 3), new s(a0Var, 4), a0Var.I0);
        this.d = u51Var;
        u51Var.r1();
        u51 u51Var2 = this.d;
        u51Var2.f30819f3.f29295r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.f16021n);
        i0.E2(this.f54537b);
        this.f54538c.addView(a0Var.f54454w1, b6.g());
        this.f54538c.addView(this.d, b6.g());
        this.f54538c.addView(a0Var.f54456y1, b6.g());
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, a0Var.I0);
        this.f54536a = lVar;
        lVar.setOccupyStatusBar(false);
        a7.m(this.f54536a, 5, t6.G6, a0Var.I0);
        a7.m(this.f54536a, 3, t6.f21332z8, a0Var.I0);
        this.f54536a.setBackButtonImage(2131231241);
        a7.m(this.f54536a, 1, t6.f21313y8, a0Var.I0);
        this.f54536a.setTitle(o5.m(a0Var.f54444m1));
        this.f54536a.getTitleTextView().setTranslationX(-i0.L(18.0f));
        this.f54536a.setActionBarMenuOnItemClick(new y01(this, 24));
        r8 r8Var = new r8(a0Var.f54444m1);
        this.f54534n = r8Var;
        g9 g9Var = new g9(getContext());
        this.h = g9Var;
        g9Var.setRoundRadius(i0.L(9.0f));
        g9Var.e(a0Var.f54444m1, r8Var);
        this.f54536a.addView(g9Var, b6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f54538c.addView(this.f54536a, b6.e(-1, 56, 48));
        this.f54538c.addView(a0Var.f54452u1, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y p5 = this.f54536a.p();
        p5.setGlassMode(true);
        p5.setTranslationX(-i0.L(7.0f));
        p5.a(3, 2131232485);
        if (w3.N(a0Var.f54444m1)) {
            p5.a(2, 2131232114);
        }
        vh.d dVar = new vh.d(getContext(), a0Var.I0, true);
        dVar.f();
        if (w3.w(27, a0Var.f54444m1)) {
            dq dqVar = new dq(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) cd.L0(2131751989, null));
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(cd.L0(2131747847, null));
        }
        a0Var.f54446o1 = dVar;
        dVar.setOnClickListener(new rh.s(this, 29));
        this.f54538c.addView(dVar, b6.f(48.0f, -1, 80, i0.L(12.0f), 0, i0.L(12.0f), i0.L(12.0f) + i0.f16021n));
        a();
    }

    @Override
    public final float b() {
        return n7.a(this.f54535r.f54441i1.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f54535r.f54452u1.setTranslationY(Math.max(i0.L(8.0f) + i0.f16020m, b() + i0.L(4.0f)));
    }
}
