package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import c8.wb;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class b1 extends h1 {
    public static boolean f55644i = false;
    public static Method f55645j;
    public static Class f55646k;
    public static Field f55647l;
    public static Field f55648m;
    public final WindowInsets f55649c;
    public i0.c[] d;
    public i0.c f55650e;
    public k1 f55651f;
    public i0.c f55652g;
    public int h;

    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.f55650e = null;
        this.f55649c = windowInsets;
    }

    public static boolean B(int i7, int i10) {
        if ((i7 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    private i0.c u(int i7, boolean z10) {
        i0.c cVar = i0.c.f15573e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                cVar = i0.c.a(cVar, v(i10, z10));
            }
        }
        return cVar;
    }

    private i0.c w() {
        k1 k1Var = this.f55651f;
        if (k1Var != null) {
            return k1Var.f55682a.i();
        }
        return i0.c.f15573e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f55644i) {
                z();
            }
            Method method = f55645j;
            if (method != null && f55646k != null && f55647l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f55647l.get(f55648m.get(invoke));
                    if (rect != null) {
                        return i0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void z() {
        try {
            f55645j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f55646k = cls;
            f55647l = cls.getDeclaredField("mVisibleInsets");
            f55648m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f55647l.setAccessible(true);
            f55648m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f55644i = true;
    }

    public void A(i0.c cVar) {
        this.f55652g = cVar;
    }

    @Override
    public void d(View view) {
        i0.c x10 = x(view);
        if (x10 == null) {
            x10 = i0.c.f15573e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (!Objects.equals(this.f55652g, b1Var.f55652g) || !B(this.h, b1Var.h)) {
            return false;
        }
        return true;
    }

    @Override
    public i0.c f(int i7) {
        return u(i7, false);
    }

    @Override
    public i0.c g(int i7) {
        return u(i7, true);
    }

    @Override
    public final i0.c k() {
        if (this.f55650e == null) {
            WindowInsets windowInsets = this.f55649c;
            this.f55650e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f55650e;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        a1 w0Var;
        k1 h = k1.h(null, this.f55649c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            w0Var = new z0(h);
        } else if (i13 >= 30) {
            w0Var = new y0(h);
        } else if (i13 >= 29) {
            w0Var = new x0(h);
        } else {
            w0Var = new w0(h);
        }
        w0Var.g(k1.e(k(), i7, i10, i11, i12));
        w0Var.e(k1.e(i(), i7, i10, i11, i12));
        return w0Var.b();
    }

    @Override
    public boolean o() {
        return this.f55649c.isRound();
    }

    @Override
    public boolean p(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0 && !y(i10)) {
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
    public void r(k1 k1Var) {
        this.f55651f = k1Var;
    }

    @Override
    public void t(int i7) {
        this.h = i7;
    }

    public i0.c v(int i7, boolean z10) {
        int i10;
        h e10;
        int i11;
        int i12;
        int i13;
        i0.c cVar = i0.c.f15573e;
        int i14 = 0;
        if (i7 != 1) {
            i0.c cVar2 = null;
            if (i7 != 2) {
                if (i7 != 8) {
                    if (i7 != 16) {
                        if (i7 != 32) {
                            if (i7 != 64) {
                                if (i7 == 128) {
                                    k1 k1Var = this.f55651f;
                                    if (k1Var != null) {
                                        e10 = k1Var.f55682a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = d1.f.l(e10.f55665a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = d1.f.n(e10.f55665a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = d1.f.m(e10.f55665a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = d1.f.k(e10.f55665a);
                                        }
                                        return i0.c.b(i11, i12, i13, i14);
                                    }
                                }
                            } else {
                                return l();
                            }
                        } else {
                            return h();
                        }
                    } else {
                        return j();
                    }
                } else {
                    i0.c[] cVarArr = this.d;
                    if (cVarArr != null) {
                        cVar2 = cVarArr[wb.a(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    i0.c k10 = k();
                    i0.c w10 = w();
                    int i16 = k10.d;
                    if (i16 > w10.d) {
                        return i0.c.b(0, 0, 0, i16);
                    }
                    i0.c cVar3 = this.f55652g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i10 = this.f55652g.d) > w10.d) {
                        return i0.c.b(0, 0, 0, i10);
                    }
                }
            } else if (z10) {
                i0.c w11 = w();
                i0.c i17 = i();
                return i0.c.b(Math.max(w11.f15574a, i17.f15574a), 0, Math.max(w11.f15576c, i17.f15576c), Math.max(w11.d, i17.d));
            } else if ((this.h & 2) == 0) {
                i0.c k11 = k();
                k1 k1Var2 = this.f55651f;
                if (k1Var2 != null) {
                    cVar2 = k1Var2.f55682a.i();
                }
                int i18 = k11.d;
                if (cVar2 != null) {
                    i18 = Math.min(i18, cVar2.d);
                }
                return i0.c.b(k11.f15574a, 0, k11.f15576c, i18);
            }
        } else if (z10) {
            return i0.c.b(0, Math.max(w().f15575b, k().f15575b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().f15575b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean y(int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 8 && i7 != 128) {
                return true;
            }
        }
        return !v(i7, false).equals(i0.c.f15573e);
    }
}
