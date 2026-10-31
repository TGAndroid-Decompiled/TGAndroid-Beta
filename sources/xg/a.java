package xg;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import d9.k;
import e2.j;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.l9;
import org.telegram.messenger.p20;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;
import r9.d;
import w7.b9;
import xh.e3;
import xh.h3;
import xh.m2;
public final class a implements wg.c, p20, mu0, nu0, l9, j, k, d, x6 {
    public final int f53673a;

    public a(int i10) {
        this.f53673a = i10;
    }

    @Override
    public Object K(bh.d dVar) {
        Set J = dVar.J(za.a.class);
        za.c cVar = za.c.f55430c;
        if (cVar == null) {
            synchronized (za.c.class) {
                try {
                    cVar = za.c.f55430c;
                    if (cVar == null) {
                        cVar = new za.c(0);
                        za.c.f55430c = cVar;
                    }
                } finally {
                }
            }
        }
        return new za.b(J, cVar);
    }

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        switch (this.f53673a) {
            case 15:
                return Boolean.FALSE;
            case 24:
                return Boolean.FALSE;
            default:
                return Boolean.FALSE;
        }
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: xg.a.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public void b(Object obj, float f7) {
        switch (this.f53673a) {
            case 17:
                m2 m2Var = (m2) obj;
                m2Var.f53878c = f7;
                m2Var.f53882f.invalidate();
                m2Var.X.setAlpha(f7);
                m2Var.J();
                m2Var.H();
                return;
            case 18:
            default:
                ((h3) obj).setSwipeOffsetY(f7);
                return;
            case 19:
                ((e3) obj).setLoadProgress(f7);
                return;
        }
    }

    @Override
    public int f(View view) {
        Drawable background = view.getBackground();
        if (background instanceof eq) {
            Drawable drawable = ((eq) background).f25839a;
            if (drawable instanceof ColorDrawable) {
                return ((ColorDrawable) drawable).getColor();
            }
            return 0;
        }
        return 0;
    }

    @Override
    public int g(p6 p6Var, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f53673a) {
            case 0:
                if (sc.e(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return t6.r1(f7, t6.w0(t6.tj, p6Var));
            case 1:
                if (sc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return b9.n(f10, t6.w0(t6.f20929d6, p6Var), t6.w0(t6.Ge, p6Var));
            case 2:
                if (sc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.8f;
                }
                return b9.n(f11, t6.w0(t6.f20872a7, p6Var), t6.w0(t6.f20929d6, p6Var));
            case 3:
                return 855638016;
            case 4:
                return 1073741824;
            case 5:
                int w02 = t6.w0(t6.f21001h5, p6Var);
                if (z10) {
                    f12 = 0.82f;
                } else {
                    f12 = 0.78f;
                }
                return t6.r1(f12, w02);
            case 6:
                return t6.r1(0.075f, -16777216);
            case 7:
                return t6.r1(0.88f, t6.w0(t6.f20929d6, p6Var));
            case 8:
                if (sc.e(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return b9.n(f13, t6.w0(t6.f20929d6, p6Var), t6.w0(t6.Ml, p6Var));
            case 9:
                if (sc.e(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return t6.r1(f14, t6.w0(t6.f20929d6, p6Var));
            case 10:
                return t6.r1(0.78f, t6.w0(t6.f21001h5, p6Var));
            case 11:
                return t6.r1(0.7f, t6.w0(t6.f20929d6, p6Var));
            case 12:
                sc.e(262144);
                return 0;
            case 13:
                if (sc.e(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return t6.r1(f15, t6.w0(t6.f20929d6, p6Var));
            default:
                if (!sc.e(256)) {
                    return t6.x0(null, t6.G8, false);
                }
                int x02 = t6.x0(null, t6.G8, false);
                if (z10) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.825f;
                }
                return t6.r1(f16, x02);
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f53673a) {
            case 16:
                return ((m2) obj).f53878c;
            case 17:
            default:
                return ((h3) obj).getSwipeOffsetY();
            case 18:
                return ((e3) obj).f53747c;
        }
    }

    @Override
    public Object l(Object obj) {
        Void r12 = (Void) obj;
        ou0 ou0Var = h3.f53784b0;
        return Boolean.FALSE;
    }
}
