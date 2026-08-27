package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import h7.s6;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class d1 extends j1 {

    public static boolean f46574i = false;

    public static Method f46575j;

    public static Class f46576k;

    public static Field f46577l;

    public static Field f46578m;

    public final WindowInsets f46579c;
    public i0.c[] d;

    public i0.c f46580e;

    public m1 f46581f;

    public i0.c f46582g;
    public int h;

    public d1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var);
        this.f46580e = null;
        this.f46579c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private i0.c u(int i10, boolean z10) {
        i0.c cVarA = i0.c.f10488e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = i0.c.a(cVarA, v(i11, z10));
            }
        }
        return cVarA;
    }

    private i0.c w() {
        m1 m1Var = this.f46581f;
        return m1Var != null ? m1Var.f46619a.i() : i0.c.f10488e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f46574i) {
            z();
        }
        Method method = f46575j;
        if (method != null && f46576k != null && f46577l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f46577l.get(f46578m.get(objInvoke));
                if (rect != null) {
                    return i0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e9) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
            }
        }
        return null;
    }

    private static void z() {
        try {
            f46575j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f46576k = cls;
            f46577l = cls.getDeclaredField("mVisibleInsets");
            f46578m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f46577l.setAccessible(true);
            f46578m.setAccessible(true);
        } catch (ReflectiveOperationException e9) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
        }
        f46574i = true;
    }

    public void A(i0.c cVar) {
        this.f46582g = cVar;
    }

    @Override
    public void d(View view) {
        i0.c cVarX = x(view);
        if (cVarX == null) {
            cVarX = i0.c.f10488e;
        }
        A(cVarX);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Objects.equals(this.f46582g, d1Var.f46582g) && B(this.h, d1Var.h);
    }

    @Override
    public i0.c f(int i10) {
        return u(i10, false);
    }

    @Override
    public i0.c g(int i10) {
        return u(i10, true);
    }

    @Override
    public final i0.c k() {
        if (this.f46580e == null) {
            WindowInsets windowInsets = this.f46579c;
            this.f46580e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f46580e;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        c1 z0Var;
        m1 m1VarH = m1.h(null, this.f46579c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            z0Var = new b1(m1VarH);
        } else if (i14 >= 30) {
            z0Var = new a1(m1VarH);
        } else {
            z0Var = i14 >= 29 ? new z0(m1VarH) : new y0(m1VarH);
        }
        z0Var.g(m1.e(k(), i10, i11, i12, i13));
        z0Var.e(m1.e(i(), i10, i11, i12, i13));
        return z0Var.b();
    }

    @Override
    public boolean o() {
        return this.f46579c.isRound();
    }

    @Override
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !y(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void q(i0.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override
    public void r(m1 m1Var) {
        this.f46581f = m1Var;
    }

    @Override
    public void t(int i10) {
        this.h = i10;
    }

    public i0.c v(int i10, boolean z10) {
        i0.c cVarI;
        int i11;
        i0.c cVar = i0.c.f10488e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    i0.c[] cVarArr = this.d;
                    cVarI = cVarArr != null ? cVarArr[s6.a(8)] : null;
                    if (cVarI != null) {
                        return cVarI;
                    }
                    i0.c cVarK = k();
                    i0.c cVarW = w();
                    int i12 = cVarK.d;
                    if (i12 > cVarW.d) {
                        return i0.c.b(0, 0, 0, i12);
                    }
                    i0.c cVar2 = this.f46582g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i11 = this.f46582g.d) > cVarW.d) {
                        return i0.c.b(0, 0, 0, i11);
                    }
                } else {
                    if (i10 == 16) {
                        return j();
                    }
                    if (i10 == 32) {
                        return h();
                    }
                    if (i10 == 64) {
                        return l();
                    }
                    if (i10 == 128) {
                        m1 m1Var = this.f46581f;
                        j jVarE = m1Var != null ? m1Var.f46619a.e() : e();
                        if (jVarE != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return i0.c.b(i13 >= 28 ? d1.f.l(jVarE.f46604a) : 0, i13 >= 28 ? d1.f.n(jVarE.f46604a) : 0, i13 >= 28 ? d1.f.m(jVarE.f46604a) : 0, i13 >= 28 ? d1.f.k(jVarE.f46604a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    i0.c cVarW2 = w();
                    i0.c cVarI2 = i();
                    return i0.c.b(Math.max(cVarW2.f10489a, cVarI2.f10489a), 0, Math.max(cVarW2.f10491c, cVarI2.f10491c), Math.max(cVarW2.d, cVarI2.d));
                }
                if ((this.h & 2) == 0) {
                    i0.c cVarK2 = k();
                    m1 m1Var2 = this.f46581f;
                    cVarI = m1Var2 != null ? m1Var2.f46619a.i() : null;
                    int iMin = cVarK2.d;
                    if (cVarI != null) {
                        iMin = Math.min(iMin, cVarI.d);
                    }
                    return i0.c.b(cVarK2.f10489a, 0, cVarK2.f10491c, iMin);
                }
            }
        } else {
            if (z10) {
                return i0.c.b(0, Math.max(w().f10490b, k().f10490b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().f10490b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean y(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !v(i10, false).equals(i0.c.f10488e);
    }
}
