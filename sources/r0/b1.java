package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class b1 extends h1 {
    public static boolean f53988i = false;
    public static Method f53989j;
    public static Class f53990k;
    public static Field f53991l;
    public static Field f53992m;
    public final WindowInsets f53993c;
    public i0.b[] d;
    public i0.b f53994e;
    public k1 f53995f;
    public i0.b f53996g;
    public int h;

    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.f53994e = null;
        this.f53993c = windowInsets;
    }

    public static boolean B(int i3, int i10) {
        if ((i3 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    private i0.b u(int i3, boolean z10) {
        i0.b bVar = i0.b.f14494e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0) {
                bVar = i0.b.a(bVar, v(i10, z10));
            }
        }
        return bVar;
    }

    private i0.b w() {
        k1 k1Var = this.f53995f;
        if (k1Var != null) {
            return k1Var.f54026a.i();
        }
        return i0.b.f14494e;
    }

    private i0.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f53988i) {
                z();
            }
            Method method = f53989j;
            if (method != null && f53990k != null && f53991l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f53991l.get(f53992m.get(invoke));
                    if (rect != null) {
                        return i0.b.b(rect.left, rect.top, rect.right, rect.bottom);
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
            f53989j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f53990k = cls;
            f53991l = cls.getDeclaredField("mVisibleInsets");
            f53992m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f53991l.setAccessible(true);
            f53992m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f53988i = true;
    }

    public void A(i0.b bVar) {
        this.f53996g = bVar;
    }

    @Override
    public void d(View view) {
        i0.b x10 = x(view);
        if (x10 == null) {
            x10 = i0.b.f14494e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (!Objects.equals(this.f53996g, b1Var.f53996g) || !B(this.h, b1Var.h)) {
            return false;
        }
        return true;
    }

    @Override
    public i0.b f(int i3) {
        return u(i3, false);
    }

    @Override
    public i0.b g(int i3) {
        return u(i3, true);
    }

    @Override
    public final i0.b k() {
        if (this.f53994e == null) {
            WindowInsets windowInsets = this.f53993c;
            this.f53994e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f53994e;
    }

    @Override
    public k1 m(int i3, int i10, int i11, int i12) {
        a1 w0Var;
        k1 h = k1.h(null, this.f53993c);
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
        w0Var.g(k1.e(k(), i3, i10, i11, i12));
        w0Var.e(k1.e(i(), i3, i10, i11, i12));
        return w0Var.b();
    }

    @Override
    public boolean o() {
        return this.f53993c.isRound();
    }

    @Override
    public boolean p(int i3) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i3 & i10) != 0 && !y(i10)) {
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
        this.f53995f = k1Var;
    }

    @Override
    public void t(int i3) {
        this.h = i3;
    }

    public i0.b v(int i3, boolean z10) {
        int i10;
        h e10;
        int i11;
        int i12;
        int i13;
        i0.b bVar = i0.b.f14494e;
        int i14 = 0;
        if (i3 != 1) {
            i0.b bVar2 = null;
            if (i3 != 2) {
                if (i3 != 8) {
                    if (i3 != 16) {
                        if (i3 != 32) {
                            if (i3 != 64) {
                                if (i3 == 128) {
                                    k1 k1Var = this.f53995f;
                                    if (k1Var != null) {
                                        e10 = k1Var.f54026a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = d1.f.l(e10.f54009a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = d1.f.n(e10.f54009a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = d1.f.m(e10.f54009a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = d1.f.k(e10.f54009a);
                                        }
                                        return i0.b.b(i11, i12, i13, i14);
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
                        bVar2 = bVarArr[x7.l.a(8)];
                    }
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    i0.b k10 = k();
                    i0.b w10 = w();
                    int i16 = k10.d;
                    if (i16 > w10.d) {
                        return i0.b.b(0, 0, 0, i16);
                    }
                    i0.b bVar3 = this.f53996g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i10 = this.f53996g.d) > w10.d) {
                        return i0.b.b(0, 0, 0, i10);
                    }
                }
            } else if (z10) {
                i0.b w11 = w();
                i0.b i17 = i();
                return i0.b.b(Math.max(w11.f14495a, i17.f14495a), 0, Math.max(w11.f14497c, i17.f14497c), Math.max(w11.d, i17.d));
            } else if ((this.h & 2) == 0) {
                i0.b k11 = k();
                k1 k1Var2 = this.f53995f;
                if (k1Var2 != null) {
                    bVar2 = k1Var2.f54026a.i();
                }
                int i18 = k11.d;
                if (bVar2 != null) {
                    i18 = Math.min(i18, bVar2.d);
                }
                return i0.b.b(k11.f14495a, 0, k11.f14497c, i18);
            }
        } else if (z10) {
            return i0.b.b(0, Math.max(w().f14496b, k().f14496b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().f14496b, 0, 0);
            }
        }
        return bVar;
    }

    public boolean y(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !v(i3, false).equals(i0.b.f14494e);
    }
}
