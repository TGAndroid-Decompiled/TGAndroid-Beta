package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w7.w6;
public abstract class c1 extends i1 {
    public static boolean f44694i = false;
    public static Method f44695j;
    public static Class f44696k;
    public static Field f44697l;
    public static Field f44698m;
    public final WindowInsets f44699c;
    public i0.c[] d;
    public i0.c f44700e;
    public l1 f44701f;
    public i0.c f44702g;
    public int h;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var);
        this.f44700e = null;
        this.f44699c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        if ((i10 & 6) == (i11 & 6)) {
            return true;
        }
        return false;
    }

    private i0.c u(int i10, boolean z10) {
        i0.c cVar = i0.c.f11450e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVar = i0.c.a(cVar, v(i11, z10));
            }
        }
        return cVar;
    }

    private i0.c w() {
        l1 l1Var = this.f44701f;
        if (l1Var != null) {
            return l1Var.f44739a.i();
        }
        return i0.c.f11450e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f44694i) {
                z();
            }
            Method method = f44695j;
            if (method != null && f44696k != null && f44697l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f44697l.get(f44698m.get(invoke));
                    if (rect != null) {
                        return i0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e7) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void z() {
        try {
            f44695j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f44696k = cls;
            f44697l = cls.getDeclaredField("mVisibleInsets");
            f44698m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f44697l.setAccessible(true);
            f44698m.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f44694i = true;
    }

    public void A(i0.c cVar) {
        this.f44702g = cVar;
    }

    @Override
    public void d(View view) {
        i0.c x10 = x(view);
        if (x10 == null) {
            x10 = i0.c.f11450e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (!Objects.equals(this.f44702g, c1Var.f44702g) || !B(this.h, c1Var.h)) {
            return false;
        }
        return true;
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
        if (this.f44700e == null) {
            WindowInsets windowInsets = this.f44699c;
            this.f44700e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f44700e;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        b1 x0Var;
        l1 h = l1.h(null, this.f44699c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            x0Var = new a1(h);
        } else if (i14 >= 30) {
            x0Var = new z0(h);
        } else if (i14 >= 29) {
            x0Var = new y0(h);
        } else {
            x0Var = new x0(h);
        }
        x0Var.g(l1.e(k(), i10, i11, i12, i13));
        x0Var.e(l1.e(i(), i10, i11, i12, i13));
        return x0Var.b();
    }

    @Override
    public boolean o() {
        return this.f44699c.isRound();
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
    public void r(l1 l1Var) {
        this.f44701f = l1Var;
    }

    @Override
    public void t(int i10) {
        this.h = i10;
    }

    public i0.c v(int i10, boolean z10) {
        int i11;
        i e7;
        int i12;
        int i13;
        int i14;
        i0.c cVar = i0.c.f11450e;
        int i15 = 0;
        if (i10 != 1) {
            i0.c cVar2 = null;
            if (i10 != 2) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 == 128) {
                                    l1 l1Var = this.f44701f;
                                    if (l1Var != null) {
                                        e7 = l1Var.f44739a.e();
                                    } else {
                                        e7 = e();
                                    }
                                    if (e7 != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = b5.d.l(e7.f44724a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = b5.d.n(e7.f44724a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = b5.d.m(e7.f44724a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = b5.d.k(e7.f44724a);
                                        }
                                        return i0.c.b(i12, i13, i14, i15);
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
                        cVar2 = cVarArr[w6.a(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    i0.c k10 = k();
                    i0.c w10 = w();
                    int i17 = k10.d;
                    if (i17 > w10.d) {
                        return i0.c.b(0, 0, 0, i17);
                    }
                    i0.c cVar3 = this.f44702g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i11 = this.f44702g.d) > w10.d) {
                        return i0.c.b(0, 0, 0, i11);
                    }
                }
            } else if (z10) {
                i0.c w11 = w();
                i0.c i18 = i();
                return i0.c.b(Math.max(w11.f11451a, i18.f11451a), 0, Math.max(w11.f11453c, i18.f11453c), Math.max(w11.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.c k11 = k();
                l1 l1Var2 = this.f44701f;
                if (l1Var2 != null) {
                    cVar2 = l1Var2.f44739a.i();
                }
                int i19 = k11.d;
                if (cVar2 != null) {
                    i19 = Math.min(i19, cVar2.d);
                }
                return i0.c.b(k11.f11451a, 0, k11.f11453c, i19);
            }
        } else if (z10) {
            return i0.c.b(0, Math.max(w().f11452b, k().f11452b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().f11452b, 0, 0);
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
        return !v(i10, false).equals(i0.c.f11450e);
    }
}
