package zh;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import bi.dd;
import bi.ea;
import c8.ha;
import org.telegram.messenger.c20;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.wp;
public final class r2 extends LinearLayout implements ls {
    public final int f60533a;
    public final i6 f60534b;
    public final i6 f60535c;
    public final wp[] d;
    public final wp[] f60536e;
    public SpannableString f60537f;
    public c20 h;
    public long f60538n;

    public r2(int i7, Context context, h6 h6Var) {
        super(context);
        this.d = new wp[1];
        this.f60536e = new wp[1];
        this.f60538n = -1L;
        this.f60533a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        i6 a10 = a(context, h6Var);
        this.f60534b = a10;
        addView(a10, ha.r(-2, 18, 5));
        i6 a11 = a(context, h6Var);
        this.f60535c = a11;
        addView(a11, ha.r(-2, 18, 5));
        b(false);
    }

    public static i6 a(Context context, h6 h6Var) {
        i6 i6Var = new i6(context, false, true, false);
        i6Var.f34546n = true;
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setGravity(5);
        t6.Y(i6Var, m6.G6, h6Var);
        return i6Var;
    }

    public final void b(boolean z9) {
        int i7 = this.f60533a;
        ea y10 = ea.y(i7, false);
        ea y11 = ea.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        boolean z10 = y10.f3807e;
        i6 i6Var = this.f60534b;
        i6 i6Var2 = this.f60535c;
        if (z10 && y11.f3807e) {
            i6Var.c(dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z9, true);
            if (s5.k()) {
                i6Var2.setVisibility(8);
            } else {
                i6Var2.setVisibility(0);
                wp[] wpVarArr = this.f60536e;
                i6Var2.c(dd.a1(true, "⭐️" + s5.d(), 0.7f, wpVarArr), z9, true);
                wp wpVar = wpVarArr[0];
                if (wpVar != null) {
                    wpVar.a(m6.Wl);
                }
            }
            this.f60538n = j3;
            return;
        }
        if (this.f60537f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f60537f = spannableString;
            spannableString.setSpan(new b80(org.telegram.messenger.g0.L(48.0f), i6Var), 0, 1, 33);
        }
        i6Var.c(this.f60537f, false, true);
        i6Var2.setVisibility(8);
        this.f60538n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25118y3) {
            b(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        qs.f(this.f60533a).b(this, qs.f25118y3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f60533a).n(this, qs.f25118y3);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        c20 c20Var = this.h;
        if (c20Var != null && i7 != i11) {
            c20Var.a(Integer.valueOf(i7));
        }
    }

    public void setOnWidthChanged(c20 c20Var) {
        this.h = c20Var;
    }
}
