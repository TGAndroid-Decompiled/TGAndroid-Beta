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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wp;
public final class r2 extends LinearLayout implements ls {
    public final int f60524a;
    public final j6 f60525b;
    public final j6 f60526c;
    public final wp[] d;
    public final wp[] f60527e;
    public SpannableString f60528f;
    public c20 h;
    public long f60529n;

    public r2(int i7, Context context, g6 g6Var) {
        super(context);
        this.d = new wp[1];
        this.f60527e = new wp[1];
        this.f60529n = -1L;
        this.f60524a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        j6 a10 = a(context, g6Var);
        this.f60525b = a10;
        addView(a10, ha.r(-2, 18, 5));
        j6 a11 = a(context, g6Var);
        this.f60526c = a11;
        addView(a11, ha.r(-2, 18, 5));
        b(false);
    }

    public static j6 a(Context context, g6 g6Var) {
        j6 j6Var = new j6(context, false, true, false);
        j6Var.f34937n = true;
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setGravity(5);
        s6.Y(j6Var, l6.G6, g6Var);
        return j6Var;
    }

    public final void b(boolean z9) {
        int i7 = this.f60524a;
        ea y10 = ea.y(i7, false);
        ea y11 = ea.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        boolean z10 = y10.f3810e;
        j6 j6Var = this.f60525b;
        j6 j6Var2 = this.f60526c;
        if (z10 && y11.f3810e) {
            j6Var.c(dd.a1(false, jg.g.m(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z9, true);
            if (s5.k()) {
                j6Var2.setVisibility(8);
            } else {
                j6Var2.setVisibility(0);
                wp[] wpVarArr = this.f60527e;
                j6Var2.c(dd.a1(true, "⭐️" + s5.d(), 0.7f, wpVarArr), z9, true);
                wp wpVar = wpVarArr[0];
                if (wpVar != null) {
                    wpVar.a(l6.Wl);
                }
            }
            this.f60529n = j3;
            return;
        }
        if (this.f60528f == null) {
            SpannableString spannableString = new SpannableString("x");
            this.f60528f = spannableString;
            spannableString.setSpan(new c80(org.telegram.messenger.g0.L(48.0f), j6Var), 0, 1, 33);
        }
        j6Var.c(this.f60528f, false, true);
        j6Var2.setVisibility(8);
        this.f60529n = -1L;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25114y3) {
            b(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        qs.f(this.f60524a).b(this, qs.f25114y3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f60524a).n(this, qs.f25114y3);
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
