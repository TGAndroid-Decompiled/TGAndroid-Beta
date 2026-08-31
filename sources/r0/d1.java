package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k7.r6;
public abstract class d1 extends j1 {
    public static boolean f46407i = false;
    public static Method f46408j;
    public static Class f46409k;
    public static Field f46410l;
    public static Field f46411m;
    public final WindowInsets f46412c;
    public i0.b[] d;
    public i0.b f46413e;
    public m1 f46414f;
    public i0.b f46415g;
    public int h;

    public d1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var);
        this.f46413e = null;
        this.f46412c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        if ((i10 & 6) == (i11 & 6)) {
            return true;
        }
        return false;
    }

    private i0.b u(int i10, boolean z4) {
        i0.b bVar = i0.b.f7756e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVar = i0.b.a(bVar, v(i11, z4));
            }
        }
        return bVar;
    }

    private i0.b w() {
        m1 m1Var = this.f46414f;
        if (m1Var != null) {
            return m1Var.f46452a.i();
        }
        return i0.b.f7756e;
    }

    private i0.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f46407i) {
                z();
            }
            Method method = f46408j;
            if (method != null && f46409k != null && f46410l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f46410l.get(f46411m.get(invoke));
                    if (rect != null) {
                        return i0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void z() {
        try {
            f46408j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f46409k = cls;
            f46410l = cls.getDeclaredField("mVisibleInsets");
            f46411m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f46410l.setAccessible(true);
            f46411m.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        f46407i = true;
    }

    public void A(i0.b bVar) {
        this.f46415g = bVar;
    }

    @Override
    public void d(View view) {
        i0.b x10 = x(view);
        if (x10 == null) {
            x10 = i0.b.f7756e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (!Objects.equals(this.f46415g, d1Var.f46415g) || !B(this.h, d1Var.h)) {
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
        if (this.f46413e == null) {
            WindowInsets windowInsets = this.f46412c;
            this.f46413e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f46413e;
    }

    @Override
    public m1 m(int i10, int i11, int i12, int i13) {
        c1 y0Var;
        m1 h = m1.h(null, this.f46412c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            y0Var = new b1(h);
        } else if (i14 >= 30) {
            y0Var = new a1(h);
        } else if (i14 >= 29) {
            y0Var = new z0(h);
        } else {
            y0Var = new y0(h);
        }
        y0Var.g(m1.e(k(), i10, i11, i12, i13));
        y0Var.e(m1.e(i(), i10, i11, i12, i13));
        return y0Var.b();
    }

    @Override
    public boolean o() {
        return this.f46412c.isRound();
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
    public void r(m1 m1Var) {
        this.f46414f = m1Var;
    }

    @Override
    public void t(int i10) {
        this.h = i10;
    }

    public i0.b v(int i10, boolean z4) {
        int i11;
        j e6;
        int i12;
        int i13;
        int i14;
        i0.b bVar = i0.b.f7756e;
        int i15 = 0;
        if (i10 != 1) {
            i0.b bVar2 = null;
            if (i10 != 2) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 == 128) {
                                    m1 m1Var = this.f46414f;
                                    if (m1Var != null) {
                                        e6 = m1Var.f46452a.e();
                                    } else {
                                        e6 = e();
                                    }
                                    if (e6 != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = d1.f.l(e6.f46437a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = d1.f.n(e6.f46437a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = d1.f.m(e6.f46437a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = d1.f.k(e6.f46437a);
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
                        bVar2 = bVarArr[r6.a(8)];
                    }
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    i0.b k10 = k();
                    i0.b w10 = w();
                    int i17 = k10.d;
                    if (i17 > w10.d) {
                        return i0.b.b(0, 0, 0, i17);
                    }
                    i0.b bVar3 = this.f46415g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i11 = this.f46415g.d) > w10.d) {
                        return i0.b.b(0, 0, 0, i11);
                    }
                }
            } else if (z4) {
                i0.b w11 = w();
                i0.b i18 = i();
                return i0.b.b(Math.max(w11.f7757a, i18.f7757a), 0, Math.max(w11.f7759c, i18.f7759c), Math.max(w11.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.b k11 = k();
                m1 m1Var2 = this.f46414f;
                if (m1Var2 != null) {
                    bVar2 = m1Var2.f46452a.i();
                }
                int i19 = k11.d;
                if (bVar2 != null) {
                    i19 = Math.min(i19, bVar2.d);
                }
                return i0.b.b(k11.f7757a, 0, k11.f7759c, i19);
            }
        } else if (z4) {
            return i0.b.b(0, Math.max(w().f7758b, k().f7758b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().f7758b, 0, 0);
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
        return !v(i10, false).equals(i0.b.f7756e);
    }
}
