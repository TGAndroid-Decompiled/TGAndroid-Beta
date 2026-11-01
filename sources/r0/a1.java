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
public abstract class a1 extends g1 {
    public static boolean f46106i = false;
    public static Method f46107j;
    public static Class f46108k;
    public static Field f46109l;
    public static Field f46110m;
    public final WindowInsets f46111c;
    public i0.c[] d;
    public i0.c e;
    public j1 f46112f;
    public i0.c f46113g;
    public int h;

    public a1(j1 j1Var, WindowInsets windowInsets) {
        super(j1Var);
        this.e = null;
        this.f46111c = windowInsets;
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
        j1 j1Var = this.f46112f;
        if (j1Var != null) {
            return j1Var.f46143a.i();
        }
        return i0.c.e;
    }

    private i0.c x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f46106i) {
                z();
            }
            Method method = f46107j;
            if (method != null && f46108k != null && f46109l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f46109l.get(f46110m.get(invoke));
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
            f46107j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f46108k = cls;
            f46109l = cls.getDeclaredField("mVisibleInsets");
            f46110m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f46109l.setAccessible(true);
            f46110m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f46106i = true;
    }

    public void A(i0.c cVar) {
        this.f46113g = cVar;
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
        a1 a1Var = (a1) obj;
        if (!Objects.equals(this.f46113g, a1Var.f46113g) || !B(this.h, a1Var.h)) {
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
            WindowInsets windowInsets = this.f46111c;
            this.e = i0.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override
    public j1 m(int i10, int i11, int i12, int i13) {
        z0 v0Var;
        j1 h = j1.h(null, this.f46111c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            v0Var = new y0(h);
        } else if (i14 >= 30) {
            v0Var = new x0(h);
        } else if (i14 >= 29) {
            v0Var = new w0(h);
        } else {
            v0Var = new v0(h);
        }
        v0Var.g(j1.e(k(), i10, i11, i12, i13));
        v0Var.e(j1.e(i(), i10, i11, i12, i13));
        return v0Var.b();
    }

    @Override
    public boolean o() {
        return this.f46111c.isRound();
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
    public void r(j1 j1Var) {
        this.f46112f = j1Var;
    }

    @Override
    public void t(int i10) {
        this.h = i10;
    }

    public i0.c v(int i10, boolean z10) {
        int i11;
        h e;
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
                                    j1 j1Var = this.f46112f;
                                    if (j1Var != null) {
                                        e = j1Var.f46143a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = b5.d.l(e.f46133a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = b5.d.n(e.f46133a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = b5.d.m(e.f46133a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = b5.d.k(e.f46133a);
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
                    i0.c w9 = w();
                    int i17 = k10.d;
                    if (i17 > w9.d) {
                        return i0.c.b(0, 0, 0, i17);
                    }
                    i0.c cVar3 = this.f46113g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i11 = this.f46113g.d) > w9.d) {
                        return i0.c.b(0, 0, 0, i11);
                    }
                }
            } else if (z10) {
                i0.c w10 = w();
                i0.c i18 = i();
                return i0.c.b(Math.max(w10.f7766a, i18.f7766a), 0, Math.max(w10.f7768c, i18.f7768c), Math.max(w10.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.c k11 = k();
                j1 j1Var2 = this.f46112f;
                if (j1Var2 != null) {
                    cVar2 = j1Var2.f46143a.i();
                }
                int i19 = k11.d;
                if (cVar2 != null) {
                    i19 = Math.min(i19, cVar2.d);
                }
                return i0.c.b(k11.f7766a, 0, k11.f7768c, i19);
            }
        } else if (z10) {
            return i0.c.b(0, Math.max(w().f7767b, k().f7767b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.c.b(0, k().f7767b, 0, 0);
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
