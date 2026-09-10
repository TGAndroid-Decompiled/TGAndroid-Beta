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
    public static boolean f41034i = false;
    public static Method f41035j;
    public static Class f41036k;
    public static Field f41037l;
    public static Field f41038m;
    public final WindowInsets f41039c;
    public i0.c[] d;
    public i0.c e;
    public l1 f41040f;
    public i0.c f41041g;
    public int h;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var);
        this.e = null;
        this.f41039c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        if ((i10 & 6) == (i11 & 6)) {
            return true;
        }
        return false;
    }

    private i0.c u(int i10, boolean z10) {
        i0.c cVar = i0.c.e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVar = i0.c.a(cVar, v(i11, z10));
            }
        }
        return cVar;
    }

    private i0.c w() {
        l1 l1Var = this.f41040f;
        if (l1Var != null) {
            return l1Var.f41074a.i();
        }
        return i0.c.e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f41034i) {
                z();
            }
            Method method = f41035j;
            if (method != null && f41036k != null && f41037l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f41037l.get(f41038m.get(invoke));
                    if (rect != null) {
                        return i0.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void z() {
        try {
            f41035j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f41036k = cls;
            f41037l = cls.getDeclaredField("mVisibleInsets");
            f41038m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f41037l.setAccessible(true);
            f41038m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f41034i = true;
    }

    public void A(i0.c cVar) {
        this.f41041g = cVar;
    }

    @Override
    public void d(View view) {
        i0.c x10 = x(view);
        if (x10 == null) {
            x10 = i0.c.e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (!Objects.equals(this.f41041g, c1Var.f41041g) || !B(this.h, c1Var.h)) {
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
        if (this.e == null) {
            WindowInsets windowInsets = this.f41039c;
            this.e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        b1 x0Var;
        l1 h = l1.h(null, this.f41039c);
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
        return this.f41039c.isRound();
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
        this.f41040f = l1Var;
    }

    @Override
    public void t(int i10) {
        this.h = i10;
    }

    public i0.c v(int i10, boolean z10) {
        int i11;
        i e;
        int i12;
        int i13;
        int i14;
        i0.c cVar = i0.c.e;
        int i15 = 0;
        if (i10 != 1) {
            i0.c cVar2 = null;
            if (i10 != 2) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 == 128) {
                                    l1 l1Var = this.f41040f;
                                    if (l1Var != null) {
                                        e = l1Var.f41074a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = b5.d.l(e.f41061a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = b5.d.n(e.f41061a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = b5.d.m(e.f41061a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = b5.d.k(e.f41061a);
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
                    i0.c cVar3 = this.f41041g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i11 = this.f41041g.d) > w10.d) {
                        return i0.c.b(0, 0, 0, i11);
                    }
                }
            } else if (z10) {
                i0.c w11 = w();
                i0.c i18 = i();
                return i0.c.b(Math.max(w11.f10074a, i18.f10074a), 0, Math.max(w11.f10076c, i18.f10076c), Math.max(w11.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.c k11 = k();
                l1 l1Var2 = this.f41040f;
                if (l1Var2 != null) {
                    cVar2 = l1Var2.f41074a.i();
                }
                int i19 = k11.d;
                if (cVar2 != null) {
                    i19 = Math.min(i19, cVar2.d);
                }
                return i0.c.b(k11.f10074a, 0, k11.f10076c, i19);
            }
        } else if (z10) {
            return i0.c.b(0, Math.max(w().f10075b, k().f10075b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().f10075b, 0, 0);
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
        return !v(i10, false).equals(i0.c.e);
    }
}
