package r0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import c8.vb;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class b1 extends h1 {
    public static boolean f54176i = false;
    public static Method f54177j;
    public static Class f54178k;
    public static Field f54179l;
    public static Field f54180m;
    public final WindowInsets f54181c;
    public i0.b[] d;
    public i0.b f54182e;
    public k1 f54183f;
    public i0.b f54184g;
    public int h;

    public b1(k1 k1Var, WindowInsets windowInsets) {
        super(k1Var);
        this.f54182e = null;
        this.f54181c = windowInsets;
    }

    public static boolean B(int i7, int i10) {
        if ((i7 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    private i0.b u(int i7, boolean z9) {
        i0.b bVar = i0.b.f15119e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                bVar = i0.b.a(bVar, v(i10, z9));
            }
        }
        return bVar;
    }

    private i0.b w() {
        k1 k1Var = this.f54183f;
        if (k1Var != null) {
            return k1Var.f54214a.i();
        }
        return i0.b.f15119e;
    }

    private i0.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f54176i) {
                z();
            }
            Method method = f54177j;
            if (method != null && f54178k != null && f54179l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f54179l.get(f54180m.get(invoke));
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
            f54177j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f54178k = cls;
            f54179l = cls.getDeclaredField("mVisibleInsets");
            f54180m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f54179l.setAccessible(true);
            f54180m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f54176i = true;
    }

    public void A(i0.b bVar) {
        this.f54184g = bVar;
    }

    @Override
    public void d(View view) {
        i0.b x10 = x(view);
        if (x10 == null) {
            x10 = i0.b.f15119e;
        }
        A(x10);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (!Objects.equals(this.f54184g, b1Var.f54184g) || !B(this.h, b1Var.h)) {
            return false;
        }
        return true;
    }

    @Override
    public i0.b f(int i7) {
        return u(i7, false);
    }

    @Override
    public i0.b g(int i7) {
        return u(i7, true);
    }

    @Override
    public final i0.b k() {
        if (this.f54182e == null) {
            WindowInsets windowInsets = this.f54181c;
            this.f54182e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f54182e;
    }

    @Override
    public k1 m(int i7, int i10, int i11, int i12) {
        a1 w0Var;
        k1 h = k1.h(null, this.f54181c);
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
        return this.f54181c.isRound();
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
    public void q(i0.b[] bVarArr) {
        this.d = bVarArr;
    }

    @Override
    public void r(k1 k1Var) {
        this.f54183f = k1Var;
    }

    @Override
    public void t(int i7) {
        this.h = i7;
    }

    public i0.b v(int i7, boolean z9) {
        int i10;
        h e10;
        int i11;
        int i12;
        int i13;
        i0.b bVar = i0.b.f15119e;
        int i14 = 0;
        if (i7 != 1) {
            i0.b bVar2 = null;
            if (i7 != 2) {
                if (i7 != 8) {
                    if (i7 != 16) {
                        if (i7 != 32) {
                            if (i7 != 64) {
                                if (i7 == 128) {
                                    k1 k1Var = this.f54183f;
                                    if (k1Var != null) {
                                        e10 = k1Var.f54214a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = d1.f.l(e10.f54197a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = d1.f.n(e10.f54197a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = d1.f.m(e10.f54197a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = d1.f.k(e10.f54197a);
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
                        bVar2 = bVarArr[vb.a(8)];
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
                    i0.b bVar3 = this.f54184g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i10 = this.f54184g.d) > w10.d) {
                        return i0.b.b(0, 0, 0, i10);
                    }
                }
            } else if (z9) {
                i0.b w11 = w();
                i0.b i17 = i();
                return i0.b.b(Math.max(w11.f15120a, i17.f15120a), 0, Math.max(w11.f15122c, i17.f15122c), Math.max(w11.d, i17.d));
            } else if ((this.h & 2) == 0) {
                i0.b k11 = k();
                k1 k1Var2 = this.f54183f;
                if (k1Var2 != null) {
                    bVar2 = k1Var2.f54214a.i();
                }
                int i18 = k11.d;
                if (bVar2 != null) {
                    i18 = Math.min(i18, bVar2.d);
                }
                return i0.b.b(k11.f15120a, 0, k11.f15122c, i18);
            }
        } else if (z9) {
            return i0.b.b(0, Math.max(w().f15121b, k().f15121b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().f15121b, 0, 0);
            }
        }
        return bVar;
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
        return !v(i7, false).equals(i0.b.f15119e);
    }
}
