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
    public static boolean f41815i = false;
    public static Method f41816j;
    public static Class f41817k;
    public static Field f41818l;
    public static Field f41819m;
    public final WindowInsets f41820c;
    public i0.b[] d;
    public i0.b e;
    public l1 f41821f;
    public i0.b f41822g;
    public int h;

    public c1(l1 l1Var, WindowInsets windowInsets) {
        super(l1Var);
        this.e = null;
        this.f41820c = windowInsets;
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
        l1 l1Var = this.f41821f;
        if (l1Var != null) {
            return l1Var.f41855a.i();
        }
        return i0.b.e;
    }

    private i0.b x(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f41815i) {
                z();
            }
            Method method = f41816j;
            if (method != null && f41817k != null && f41818l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f41818l.get(f41819m.get(invoke));
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
            f41816j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f41817k = cls;
            f41818l = cls.getDeclaredField("mVisibleInsets");
            f41819m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f41818l.setAccessible(true);
            f41819m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f41815i = true;
    }

    public void A(i0.b bVar) {
        this.f41822g = bVar;
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
        c1 c1Var = (c1) obj;
        if (!Objects.equals(this.f41822g, c1Var.f41822g) || !B(this.h, c1Var.h)) {
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
            WindowInsets windowInsets = this.f41820c;
            this.e = i0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override
    public l1 m(int i10, int i11, int i12, int i13) {
        b1 x0Var;
        l1 h = l1.h(null, this.f41820c);
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
        return this.f41820c.isRound();
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
    public void r(l1 l1Var) {
        this.f41821f = l1Var;
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
                                    l1 l1Var = this.f41821f;
                                    if (l1Var != null) {
                                        e = l1Var.f41855a.e();
                                    } else {
                                        e = e();
                                    }
                                    if (e != null) {
                                        int i16 = Build.VERSION.SDK_INT;
                                        if (i16 >= 28) {
                                            i12 = b5.d.l(e.f41842a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i13 = b5.d.n(e.f41842a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i14 = b5.d.m(e.f41842a);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i16 >= 28) {
                                            i15 = b5.d.k(e.f41842a);
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
                        bVar2 = bVarArr[w6.a(8)];
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
                    i0.b bVar3 = this.f41822g;
                    if (bVar3 != null && !bVar3.equals(bVar) && (i11 = this.f41822g.d) > w10.d) {
                        return i0.b.b(0, 0, 0, i11);
                    }
                }
            } else if (z10) {
                i0.b w11 = w();
                i0.b i18 = i();
                return i0.b.b(Math.max(w11.f10588a, i18.f10588a), 0, Math.max(w11.f10590c, i18.f10590c), Math.max(w11.d, i18.d));
            } else if ((this.h & 2) == 0) {
                i0.b k11 = k();
                l1 l1Var2 = this.f41821f;
                if (l1Var2 != null) {
                    bVar2 = l1Var2.f41855a.i();
                }
                int i19 = k11.d;
                if (bVar2 != null) {
                    i19 = Math.min(i19, bVar2.d);
                }
                return i0.b.b(k11.f10588a, 0, k11.f10590c, i19);
            }
        } else if (z10) {
            return i0.b.b(0, Math.max(w().f10589b, k().f10589b), 0, 0);
        } else {
            if ((this.h & 4) == 0) {
                return i0.b.b(0, k().f10589b, 0, 0);
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
