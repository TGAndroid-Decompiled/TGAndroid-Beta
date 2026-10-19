package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w7.s6;
public abstract class b1 extends h1 {
    public static boolean f44786i = false;
    public static Method f44787j;
    public static Class f44788k;
    public static Field f44789l;
    public static Field f44790m;
    public final WindowInsets f44791c;
    public i0.b[] d;
    public i0.b e;
    public k1 f44792f;
    public i0.b f44793g;
    public int h;

    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.e = null;
        this.f44791c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        if ((i10 & 6) == (i11 & 6)) {
            return true;
        }
        return false;
    }

    private i0.b u(int i10, boolean z10) {
        i0.b bVar = i0.b.e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVar = i0.b.a(bVar, v(i11, z10));
            }
        }
        return bVar;
    }

    private i0.b w() {
        k1 k1Var = this.f44792f;
        if (k1Var != null) {
            return k1Var.f44825a.i();
        }
        return i0.b.e;
    }

    private i0.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f44786i) {
                z();
            }
            Method method = f44787j;
            if (method != null && f44788k != null && f44789l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f44789l.get(f44790m.get(invoke));
                    if (rect != null) {
                        return i0.b.b(rect.left, rect.top, rect.right, rect.bottom);
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
            f44787j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f44788k = cls;
            f44789l = cls.getDeclaredField("mVisibleInsets");
            f44790m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f44789l.setAccessible(true);
            f44790m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f44786i = true;
    }

    public void A(i0.b bVar) {
        this.f44793g = bVar;
    }

    @Override
    public void d(View view) {
        i0.b x10 = x(view);
        if (x10 == null) {
            x10 = i0.b.e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (!Objects.equals(this.f44793g, b1Var.f44793g) || !B(this.h, b1Var.h)) {
            return false;
        }
        return true;
    }

    @Override
    public i0.b f(int i10) {
        return u(i10, false);
    }

    @Override
    public i0.b g(int i10) {
        return u(i10, true);
    }

    @Override
    public final i0.b k() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f44791c;
            this.e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override
    public k1 m(int i10, int i11, int i12, int i13) {
        a1 w0Var;
        k1 h = k1.h(null, this.f44791c);
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
        return this.f44791c.isRound();
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
    public void q(i0.b[] bVarArr) {
        this.d = bVarArr;
    }

    @Override
    public void r(k1 k1Var) {
        this.f44792f = k1Var;
    }

    @Override
    public void t(int i10) {
        this.h = i10;
    }

    public i0.b v(int i10, boolean z10) {
        int i11;
        i e;
        int i12;
        int i13;
        int i14;
        i0.b bVar = i0.b.e;
        int i15 = 0;
        if (i10 != 1) {
            i0.b bVar2 = null;
            if (i10 != 2) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 == 128) {
                                    k1 k1Var = this.f44792f;
                                    if (k1Var != null) {
                                        e = k1Var.f44825a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = b5.d.l(e.f44815a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = b5.d.n(e.f44815a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = b5.d.m(e.f44815a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = b5.d.k(e.f44815a);
                                        }
                                        return i0.b.b(i12, i13, i14, i15);
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
                    i0.b[] bVarArr = this.d;
                    if (bVarArr != null) {
                        bVar2 = bVarArr[s6.a(8)];
                    }
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    i0.b k10 = k();
                    i0.b w9 = w();
                    int i17 = k10.d;
                    if (i17 > w9.d) {
                        return i0.b.b(0, 0, 0, i17);
                    }
                    i0.b bVar3 = this.f44793g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i11 = this.f44793g.d) > w9.d) {
                        return i0.b.b(0, 0, 0, i11);
                    }
                }
            } else if (z10) {
                i0.b w10 = w();
                i0.b i18 = i();
                return i0.b.b(Math.max(w10.f12285a, i18.f12285a), 0, Math.max(w10.f12287c, i18.f12287c), Math.max(w10.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.b k11 = k();
                k1 k1Var2 = this.f44792f;
                if (k1Var2 != null) {
                    bVar2 = k1Var2.f44825a.i();
                }
                int i19 = k11.d;
                if (bVar2 != null) {
                    i19 = Math.min(i19, bVar2.d);
                }
                return i0.b.b(k11.f12285a, 0, k11.f12287c, i19);
            }
        } else if (z10) {
            return i0.b.b(0, Math.max(w().f12286b, k().f12286b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().f12286b, 0, 0);
            }
        }
        return bVar;
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
        return !v(i10, false).equals(i0.b.e);
    }
}
