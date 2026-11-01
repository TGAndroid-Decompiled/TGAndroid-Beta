package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.w3;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.v51;
import org.telegram.ui.z01;
import w7.b6;
import w7.n7;
public final class v extends x {
    public final g9 h;
    public final r8 f54535n;
    public final z f54536r;

    public v(z zVar, Context context) {
        super(zVar, context);
        this.f54536r = zVar;
        v51 v51Var = new v51(context, zVar.f21584a, 0, false, new q(zVar, 4), new r(zVar, 3), new r(zVar, 4), zVar.I0);
        this.d = v51Var;
        v51Var.r1();
        v51 v51Var2 = this.d;
        v51Var2.f31183f3.f29638r = false;
        v51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, i0.L(60.0f) + i0.f16167n);
        i0.E2(this.f54538b);
        this.f54539c.addView(zVar.f54556w1, b6.g());
        this.f54539c.addView(this.d, b6.g());
        this.f54539c.addView(zVar.f54558y1, b6.g());
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, zVar.I0);
        this.f54537a = lVar;
        lVar.setOccupyStatusBar(false);
        a7.m(this.f54537a, 5, t6.G6, zVar.I0);
        a7.m(this.f54537a, 3, t6.f21333z8, zVar.I0);
        this.f54537a.setBackButtonImage(2131231241);
        a7.m(this.f54537a, 1, t6.f21314y8, zVar.I0);
        this.f54537a.setTitle(o5.m(zVar.f54546m1));
        this.f54537a.getTitleTextView().setTranslationX(-i0.L(18.0f));
        this.f54537a.setActionBarMenuOnItemClick(new z01(this, 24));
        r8 r8Var = new r8(zVar.f54546m1);
        this.f54535n = r8Var;
        g9 g9Var = new g9(getContext());
        this.h = g9Var;
        g9Var.setRoundRadius(i0.L(9.0f));
        g9Var.e(zVar.f54546m1, r8Var);
        this.f54537a.addView(g9Var, b6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.f54539c.addView(this.f54537a, b6.e(-1, 56, 48));
        this.f54539c.addView(zVar.f54554u1, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.y p5 = this.f54537a.p();
        p5.setGlassMode(true);
        p5.setTranslationX(-i0.L(7.0f));
        p5.a(3, 2131232485);
        if (w3.N(zVar.f54546m1)) {
            p5.a(2, 2131232114);
        }
        vh.d dVar = new vh.d(getContext(), zVar.I0, true);
        dVar.f();
        if (w3.w(27, zVar.f54546m1)) {
            dq dqVar = new dq(2131231078, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) dd.L0(2131751989, null));
            spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(dd.L0(2131747847, null));
        }
        zVar.f54548o1 = dVar;
        dVar.setOnClickListener(new rh.s(this, 29));
        this.f54539c.addView(dVar, b6.f(48.0f, -1, 80, i0.L(12.0f), 0, i0.L(12.0f), i0.L(12.0f) + i0.f16167n));
        a();
    }

    @Override
    public final float b() {
        return n7.a(this.f54536r.f54543i1.e) * super.b();
    }

    @Override
    public final void c() {
        super.c();
        this.f54536r.f54554u1.setTranslationY(Math.max(i0.L(8.0f) + i0.f16166m, b() + i0.L(4.0f)));
    }
}
