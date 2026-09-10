package th;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import bi.k6;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.f0;
import e9.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.v51;
import org.telegram.ui.vo0;
import org.telegram.ui.zp0;
import qg.k;
import qg.q0;
import r0.l1;
import r0.n;
import s4.m0;
import uh.l;
import wh.k0;
import wh.p1;
import xf.m;
import xh.e0;
import xh.l3;
import xh.v5;
import xh.w7;
import xh.z3;
import xh.z7;
import za.b0;
import za.c0;
import zh.i7;
import zh.j0;
import zh.j7;
import zh.l0;
import zh.m6;
import zh.n6;
import zh.o;
import zh.o1;
import zh.o6;
import zh.o7;
import zh.r5;
import zh.t0;
import zh.u7;
import zh.y3;
public final class e implements a, Continuation, m, c2, n, BillingController.ProductDetailsResponseListenerLegacy, x2.m, c5, le.d, Utilities.Callback5, vo0, i5.e, ll0, Utilities.Callback2Return, kl0, r5, o7, l {
    public final int f42199a;
    public final Object f42200b;

    public e(Object obj, int i10) {
        this.f42199a = i10;
        this.f42200b = obj;
    }

    @Override
    public void G(int i10, float f7, float f10, le.e eVar) {
        View view = ((z3) this.f42200b).f46354b;
        if (view instanceof w0) {
            ((w0) view).K();
        } else {
            view.invalidate();
        }
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        e0 e0Var = (e0) this.f42200b;
        if (z10) {
            long j3 = i10;
            if (e0Var.I != j3) {
                e0Var.I = j3;
                e0Var.f45358r.setText(e0.o(j3));
            }
            e0Var.n(true);
        }
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        int a2;
        switch (this.f42199a) {
            case 5:
                ((k0) this.f42200b).h.i(l1Var);
                return l1.f41073b;
            default:
                u7 u7Var = (u7) this.f42200b;
                int i10 = 0;
                i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) u7Var.v.getLayoutParams();
                if (!u7Var.f48924c) {
                    i10 = l1Var.d();
                }
                marginLayoutParams.topMargin = i10;
                if (u7Var.f48924c) {
                    a2 = l1Var.f41074a.f(2).d;
                } else {
                    a2 = l1Var.a();
                }
                marginLayoutParams.bottomMargin = a2;
                marginLayoutParams.leftMargin = defaultWindowInsets.f10074a;
                marginLayoutParams.rightMargin = defaultWindowInsets.f10076c;
                i7 i7Var = u7Var.f48958s;
                if (i7Var != null) {
                    i7Var.requestLayout();
                }
                j7 j7Var = u7Var.v;
                if (j7Var != null) {
                    j7Var.requestLayout();
                }
                return l1.f41073b;
        }
    }

    @Override
    public void a(int i10) {
        switch (this.f42199a) {
            case 14:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f42200b;
                if (i10 == 1) {
                    callback2.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    callback2.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            case 15:
                k6 k6Var = (k6) this.f42200b;
                if (i10 == 1) {
                    k6Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    k6Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
            default:
                n80 n80Var = (n80) this.f42200b;
                if (i10 == 1) {
                    n80Var.run(Boolean.TRUE, null);
                    return;
                } else if (i10 != 3) {
                    n80Var.run(Boolean.FALSE, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public Object apply(Object obj) {
        ((g3) this.f42200b).getClass();
        String a2 = c0.f47873b.a((b0) obj);
        kotlin.jvm.internal.i.d(a2, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(a2));
        byte[] bytes = a2.getBytes(xd.a.f45082a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(boolean z10) {
        y3 y3Var = (y3) this.f42200b;
        if (y3Var != null) {
            y3Var.c();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        long j3;
        long j10;
        int i11;
        int i12;
        int i13;
        o1 o1Var = (o1) this.f42200b;
        zp0 zp0Var = o1Var.f48665c;
        ArrayList arrayList = o1Var.f48673r;
        l0 l0Var = ((j0) view).f48529f;
        int i14 = o1Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j3 = 0;
            if (i16 >= l0Var.f48634f.size()) {
                break;
            }
            zh.k0 k0Var = (zh.k0) l0Var.f48634f.get(i16);
            long j11 = k0Var.f48579g;
            if (j11 > 0 && currentTime - k0Var.d <= o.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(k0Var.f48575a));
            }
            i16++;
        }
        t0 t0Var = o1Var.P;
        if (t0Var != null) {
            j3 = t0Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            zh.k0 k0Var2 = (zh.k0) arrayList.get(i17);
            if (!k0Var2.f48576b && k0Var2.e && k0Var2.f48579g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(k0Var2.f48575a))) {
                    j10 = j3;
                    if (o1Var.f48675w != l0Var.f48632b || (i13 = o1Var.f48676x) == 0 || k0Var2.f48575a < i13) {
                        i11 = k0Var2.f48575a;
                        break;
                    }
                } else {
                    j10 = j3;
                }
                i18++;
            }
            i17++;
            j3 = j10;
        }
        j10 = j3;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 < arrayList.size()) {
                    zh.k0 k0Var3 = (zh.k0) arrayList.get(i15);
                    if (k0Var3.f48576b || !k0Var3.e || k0Var3.f48579g >= j10) {
                        if (hashSet.contains(Integer.valueOf(k0Var3.f48575a))) {
                            i12 = k0Var3.f48575a;
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                    i15++;
                } else {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        o1Var.f48675w = l0Var.f48632b;
        o1Var.f48676x = i12;
        o1Var.f48677y = true;
        m0 itemAnimator = zp0Var.getItemAnimator();
        zp0Var.setItemAnimator(null);
        o1Var.d.i1(i18, zp0Var.getHeight() / 2, true);
        o1Var.e.m(i18);
        zp0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean d(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: th.e.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public a1 e(int i10, b2.l1 l1Var, int[] iArr) {
        x2.i iVar = (x2.i) this.f42200b;
        f0 u10 = i0.u();
        for (int i11 = 0; i11 < l1Var.f1784a; i11++) {
            u10.b(new x2.f(i10, l1Var, i11, iVar, iArr[i11]));
        }
        return u10.i();
    }

    @Override
    public void f(d2 d2Var, int i10) {
        switch (this.f42199a) {
            case 4:
                ((org.telegram.messenger.k0) this.f42200b).run();
                return;
            case 10:
                ((Utilities.Callback) this.f42200b).run(d2Var.g(i10, true, true));
                return;
            default:
                ((Runnable) this.f42200b).run();
                return;
        }
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f42200b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void h(long j3) {
        switch (this.f42199a) {
            case 3:
                ((wh.d) this.f42200b).a(j3, true);
                return;
            default:
                ((l3) this.f42200b).h();
                return;
        }
    }

    @Override
    public void l(uh.h hVar, float f7, float f10) {
        n6 n6Var = (n6) this.f42200b;
        o6 o6Var = n6Var.v;
        if (!o6Var.f48759x) {
            hVar.f42785q = new m6(n6Var, 2);
            float sqrt = (float) Math.sqrt(Math.pow(o6Var.getHeight(), 2.0d) + Math.pow(o6Var.getWidth(), 2.0d));
            ArrayList arrayList = n6Var.f48717i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((uh.h) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onProductDetailsResponse(c5.h hVar, List list) {
        int i10;
        p1 p1Var = (p1) this.f42200b;
        ArrayList arrayList = p1Var.f44299n0;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.o oVar = (c5.o) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    k kVar = (k) obj;
                    if (kVar.h() != null && kVar.h().equals(oVar.f4331c)) {
                        kVar.h = oVar;
                        if (kVar.f() > j3) {
                            j3 = kVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((k) obj2).f40763g = j3;
        }
        AndroidUtilities.runOnUIThread(new q0(p1Var, 21));
    }

    @Override
    public void p(Canvas canvas, int i10) {
        i iVar = (i) this.f42200b;
        iVar.getClass();
        canvas.save();
        RectF rectF = iVar.f42234r;
        canvas.translate(-rectF.left, (-rectF.top) + AndroidUtilities.dp(30.0f));
        iVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public Object run(Object obj, Object obj2) {
        Long l4 = (Long) obj;
        return zh.m0.a((zh.m0) this.f42200b, (Long) obj2);
    }

    @Override
    public Object then(Task task) {
        ((CountDownLatch) this.f42200b).countDown();
        return null;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f42199a) {
            case 13:
                v5.b((v5) this.f42200b, (ArrayList) obj, (Integer) obj2, (Long) obj3, (ArrayList) obj4, (ArrayList) obj5);
                return;
            default:
                w7 w7Var = (w7) this.f42200b;
                v51 v51Var = (v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                w7Var.getClass();
                if (v51Var.G instanceof TL_stars.StarsTransaction) {
                    z7.h1(w7Var.getContext(), false, 0L, w7Var.f46236c, (TL_stars.StarsTransaction) v51Var.G, w7Var.f46235b);
                    return;
                }
                return;
        }
    }

    @Override
    public void B(float f7, int i10) {
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
