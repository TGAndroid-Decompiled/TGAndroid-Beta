package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import g7.a7;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class d1 extends j1 {
    public static boolean f46884i = false;
    public static Method f46885j;
    public static Class f46886k;
    public static Field f46887l;
    public static Field f46888m;
    public final WindowInsets f46889c;
    public i0.b[] d;
    public i0.b f46890e;
    public m1 f46891f;
    public i0.b f46892g;
    public int h;

    public d1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var);
        this.f46890e = null;
        this.f46889c = windowInsets;
    }

    public static boolean B(int i9, int i10) {
        if ((i9 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    private i0.b u(int i9, boolean z10) {
        i0.b bVar = i0.b.f10847e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                bVar = i0.b.a(bVar, v(i10, z10));
            }
        }
        return bVar;
    }

    private i0.b w() {
        m1 m1Var = this.f46891f;
        if (m1Var != null) {
            return m1Var.f46929a.i();
        }
        return i0.b.f10847e;
    }

    private i0.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f46884i) {
                z();
            }
            Method method = f46885j;
            if (method != null && f46886k != null && f46887l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f46887l.get(f46888m.get(invoke));
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
            f46885j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f46886k = cls;
            f46887l = cls.getDeclaredField("mVisibleInsets");
            f46888m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f46887l.setAccessible(true);
            f46888m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f46884i = true;
    }

    public void A(i0.b bVar) {
        this.f46892g = bVar;
    }

    @Override
    public void d(View view) {
        i0.b x10 = x(view);
        if (x10 == null) {
            x10 = i0.b.f10847e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (!Objects.equals(this.f46892g, d1Var.f46892g) || !B(this.h, d1Var.h)) {
            return false;
        }
        return true;
    }

    @Override
    public i0.b f(int i9) {
        return u(i9, false);
    }

    @Override
    public i0.b g(int i9) {
        return u(i9, true);
    }

    @Override
    public final i0.b k() {
        if (this.f46890e == null) {
            WindowInsets windowInsets = this.f46889c;
            this.f46890e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f46890e;
    }

    @Override
    public m1 m(int i9, int i10, int i11, int i12) {
        c1 y0Var;
        m1 h = m1.h(null, this.f46889c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            y0Var = new b1(h);
        } else if (i13 >= 30) {
            y0Var = new a1(h);
        } else if (i13 >= 29) {
            y0Var = new z0(h);
        } else {
            y0Var = new y0(h);
        }
        y0Var.g(m1.e(k(), i9, i10, i11, i12));
        y0Var.e(m1.e(i(), i9, i10, i11, i12));
        return y0Var.b();
    }

    @Override
    public boolean o() {
        return this.f46889c.isRound();
    }

    @Override
    public boolean p(int i9) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0 && !y(i10)) {
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
    public void r(m1 m1Var) {
        this.f46891f = m1Var;
    }

    @Override
    public void t(int i9) {
        this.h = i9;
    }

    public i0.b v(int i9, boolean z10) {
        int i10;
        j e10;
        int i11;
        int i12;
        int i13;
        i0.b bVar = i0.b.f10847e;
        int i14 = 0;
        if (i9 != 1) {
            i0.b bVar2 = null;
            if (i9 != 2) {
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 != 32) {
                            if (i9 != 64) {
                                if (i9 == 128) {
                                    m1 m1Var = this.f46891f;
                                    if (m1Var != null) {
                                        e10 = m1Var.f46929a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = d1.f.l(e10.f46914a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = d1.f.n(e10.f46914a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = d1.f.m(e10.f46914a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = d1.f.k(e10.f46914a);
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
                        bVar2 = bVarArr[a7.a(8)];
                    }
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    i0.b k10 = k();
                    i0.b w8 = w();
                    int i16 = k10.d;
                    if (i16 > w8.d) {
                        return i0.b.b(0, 0, 0, i16);
                    }
                    i0.b bVar3 = this.f46892g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i10 = this.f46892g.d) > w8.d) {
                        return i0.b.b(0, 0, 0, i10);
                    }
                }
            } else if (z10) {
                i0.b w10 = w();
                i0.b i17 = i();
                return i0.b.b(Math.max(w10.f10848a, i17.f10848a), 0, Math.max(w10.f10850c, i17.f10850c), Math.max(w10.d, i17.d));
            } else if ((this.h & 2) == 0) {
                i0.b k11 = k();
                m1 m1Var2 = this.f46891f;
                if (m1Var2 != null) {
                    bVar2 = m1Var2.f46929a.i();
                }
                int i18 = k11.d;
                if (bVar2 != null) {
                    i18 = Math.min(i18, bVar2.d);
                }
                return i0.b.b(k11.f10848a, 0, k11.f10850c, i18);
            }
        } else if (z10) {
            return i0.b.b(0, Math.max(w().f10849b, k().f10849b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().f10849b, 0, 0);
            }
        }
        return bVar;
    }

    public boolean y(int i9) {
        if (i9 != 1 && i9 != 2) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 8 && i9 != 128) {
                return true;
            }
        }
        return !v(i9, false).equals(i0.b.f10847e);
    }
}
