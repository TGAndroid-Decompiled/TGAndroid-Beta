package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w7.v6;
public abstract class b1 extends h1 {
    public static boolean f44814i = false;
    public static Method f44815j;
    public static Class f44816k;
    public static Field f44817l;
    public static Field f44818m;
    public final WindowInsets f44819c;
    public i0.c[] d;
    public i0.c e;
    public k1 f44820f;
    public i0.c f44821g;
    public int h;

    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.e = null;
        this.f44819c = windowInsets;
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
        k1 k1Var = this.f44820f;
        if (k1Var != null) {
            return k1Var.f44853a.i();
        }
        return i0.c.e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f44814i) {
                z();
            }
            Method method = f44815j;
            if (method != null && f44816k != null && f44817l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f44817l.get(f44818m.get(invoke));
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
            f44815j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f44816k = cls;
            f44817l = cls.getDeclaredField("mVisibleInsets");
            f44818m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f44817l.setAccessible(true);
            f44818m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f44814i = true;
    }

    public void A(i0.c cVar) {
        this.f44821g = cVar;
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
        b1 b1Var = (b1) obj;
        if (!Objects.equals(this.f44821g, b1Var.f44821g) || !B(this.h, b1Var.h)) {
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
            WindowInsets windowInsets = this.f44819c;
            this.e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        a1 w0Var;
        k1 h = k1.h(null, this.f44819c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            w0Var = new z0(h);
        } else if (i14 >= 30) {
            w0Var = new y0(h);
        } else if (i14 >= 29) {
            w0Var = new x0(h);
        } else {
            w0Var = new w0(h);
        }
        w0Var.g(k1.e(k(), i10, i11, i12, i13));
        w0Var.e(k1.e(i(), i10, i11, i12, i13));
        return w0Var.b();
    }

    @Override
    public boolean o() {
        return this.f44819c.isRound();
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
    public void r(k1 k1Var) {
        this.f44820f = k1Var;
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
                                    k1 k1Var = this.f44820f;
                                    if (k1Var != null) {
                                        e = k1Var.f44853a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = b5.d.l(e.f44843a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = b5.d.n(e.f44843a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = b5.d.m(e.f44843a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = b5.d.k(e.f44843a);
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
                        cVar2 = cVarArr[v6.a(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    i0.c k10 = k();
                    i0.c w9 = w();
                    int i17 = k10.d;
                    if (i17 > w9.d) {
                        return i0.c.b(0, 0, 0, i17);
                    }
                    i0.c cVar3 = this.f44821g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i11 = this.f44821g.d) > w9.d) {
                        return i0.c.b(0, 0, 0, i11);
                    }
                }
            } else if (z10) {
                i0.c w10 = w();
                i0.c i18 = i();
                return i0.c.b(Math.max(w10.f12284a, i18.f12284a), 0, Math.max(w10.f12286c, i18.f12286c), Math.max(w10.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.c k11 = k();
                k1 k1Var2 = this.f44820f;
                if (k1Var2 != null) {
                    cVar2 = k1Var2.f44853a.i();
                }
                int i19 = k11.d;
                if (cVar2 != null) {
                    i19 = Math.min(i19, cVar2.d);
                }
                return i0.c.b(k11.f12284a, 0, k11.f12286c, i19);
            }
        } else if (z10) {
            return i0.c.b(0, Math.max(w().f12285b, k().f12285b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().f12285b, 0, 0);
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
