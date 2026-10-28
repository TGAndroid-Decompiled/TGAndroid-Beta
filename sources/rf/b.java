package rf;

import ai.f0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import c3.i;
import c3.p;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.d0;
import d5.o;
import d6.e0;
import di.h4;
import di.q4;
import di.x9;
import di.y9;
import e2.k0;
import e2.n0;
import e2.x;
import e6.h;
import e6.j;
import e6.y;
import h6.w;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k2.s;
import k2.v;
import li.a4;
import li.d6;
import li.g1;
import li.j3;
import li.j4;
import li.q;
import li.s3;
import li.t3;
import li.u3;
import m.r3;
import m5.t;
import o6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.li1;
import r0.i0;
import r0.k1;
import r0.n;
import z3.m;
public class b implements h, n, fe.b, d0, r, g2.g, g6.a, ga.a, h6.n, m, i, Continuation, t3 {
    public static volatile b d;
    public final int f47369a;
    public Object f47370b;
    public Object f47371c;

    public b(int i10, Object obj, Object obj2) {
        this.f47369a = i10;
        this.f47370b = obj;
        this.f47371c = obj2;
    }

    public static void D(b bVar, i2.d dVar) {
        bVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) bVar.f47370b).entrySet()) {
            if (entry.getKey() == null) {
                List list = (List) entry.getValue();
                if (!I(dVar, list).equals(I((i2.d) bVar.f47371c, list))) {
                    throw null;
                }
            } else {
                throw new ClassCastException();
            }
        }
        bVar.f47371c = dVar;
    }

    public static String F(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static i2.d I(i2.d dVar, List list) {
        dVar.getClass();
        Map map = dVar.f13507a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.d(hashMap);
    }

    public static b L() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b(0);
                        d = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    @Override
    public void A(int i10) {
        q qVar = (q) this.f47371c;
        qVar.f30254b.f2(qVar, i10);
        qVar.d0();
        q.N(qVar);
    }

    @Override
    public void B(s3 s3Var, View view) {
        q qVar = (q) this.f47371c;
        l80 l80Var = new l80(qVar, (u6) this.f47370b, view, false, false, true);
        l80Var.Q = true;
        qVar.H = j4.c(l80Var, qVar.f30254b.f32990f0, qVar.getContext(), (u6) this.f47370b, s3Var, true);
    }

    @Override
    public java.lang.Object C(fe.c r6, nd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: rf.b.C(fe.c, nd.c):java.lang.Object");
    }

    public d5.e E() {
        if (((o) this.f47370b) != null) {
            return new d5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void G(byte[] r19, int r20, int r21, z3.l r22, e2.j r23) {
        throw new UnsupportedOperationException("Method not decompiled: rf.b.G(byte[], int, int, z3.l, e2.j):void");
    }

    @Override
    public void H() {
        a4 a4Var = ((q) this.f47371c).f17418s;
        if (a4Var != null) {
            int i10 = 0;
            a4Var.e(false, true);
            int i11 = a4Var.f17083b0;
            if (i11 != 2) {
                i10 = i11;
            }
            a4Var.g(i10, true);
        }
    }

    public void J(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f47370b;
        if (handler != null) {
            handler.post(new s(this, eVar, 0));
        }
    }

    public hb.n K(mb.a r7) {
        throw new UnsupportedOperationException("Method not decompiled: rf.b.K(mb.a):hb.n");
    }

    public boolean M() {
        if (((a) ((k6.c) this.f47370b).d) != null) {
            return true;
        }
        return false;
    }

    public void N(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f47370b;
        h4 h4Var = (h4) this.f47371c;
        y9 y9Var = h4Var.e;
        y9.B1 = f7;
        x9 x9Var = y9Var.f9471z0;
        if (x9Var != null) {
            x9Var.setSpeed(f7);
        }
        q4.Y(h4Var.f8625l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void O(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        k6.c cVar = (k6.c) this.f47370b;
        g gVar3 = (g) cVar.f16406c;
        if (c5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f47391a;
                    if (gVar != null && arrayList.size() == gVar.f47391a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f47387a, a10.f47387a) && Objects.equals(a2.f47388b, a10.f47388b) && Objects.equals(a2.f47389c, a10.f47389c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f47390f == a10.f47390f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) cVar.d) != null && gVar != null) {
            cVar.g(gVar);
        }
        if (((a) cVar.d) != null && (gVar2 = (g) cVar.f16406c) != null) {
            cVar.F(gVar2);
        }
        if (gVar != null && gVar.f47391a.size() > 0 && !gVar.a(0).f47387a.startsWith("audio/") && (dVar = (d) cVar.f16405b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) cVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f47368g = 0;
            aVar.h = 0;
            aVar.p();
        }
        cVar.f16406c = gVar;
    }

    @Override
    public l80 P(View view) {
        q qVar = (q) this.f47371c;
        l80 l80Var = new l80(qVar, (u6) this.f47370b, view, false, false, true);
        qVar.H = l80Var;
        return l80Var;
    }

    @Override
    public k1 P0(View view, k1 k1Var) {
        a5.m mVar = (a5.m) this.f47371c;
        k1 h = i0.h(view, k1Var);
        if (h.f47153a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f47370b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = mVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k1 b10 = i0.b(mVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public void Q() {
        q qVar = (q) this.f47371c;
        qVar.a0();
        qVar.b0();
    }

    public void R(o oVar) {
        this.f47370b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f47371c = str;
            }
        }
    }

    public void S(e6.c cVar) {
        String str;
        String string;
        k6.c cVar2 = (k6.c) this.f47370b;
        if (cVar != null) {
            l.e("Must be called from the main thread.");
            f6.h hVar = cVar.f9807j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) cVar2.d;
                if (aVar == null || !TextUtils.equals(aVar.f47366c.a(), a2)) {
                    cVar2.I(new a(cVar, (e6.g) this.f47371c, hVar));
                    l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f9808k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer v12 = PhotoViewer.v1();
                    d.i();
                    if (v12.E != null && v12.f35670e0 != null && v12.U1()) {
                        wc wcVar = new wc(v12.f35670e0, new di.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        wcVar.R(i10, 36, string).j();
                    }
                }
            }
        }
    }

    public void T(g3 g3Var) {
        try {
            a0(g3Var, (p3) this.f47370b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void U(g3 g3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.f47370b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7332b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f47370b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7332b, j10);
                p3Var = (p3) o3Var2.a();
            }
            a0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void V(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7332b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7332b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f47370b;
            } else {
                o3 o3Var = (o3) ((p3) this.f47370b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7332b, j10);
                p3Var = (p3) o3Var.a();
            }
            a0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void W(g3 g3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f47370b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7332b, i10);
            this.f47370b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.t3 t3Var = (com.google.android.gms.internal.play_billing.t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7332b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7332b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f47370b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f47370b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7332b, j10);
                p3Var = (p3) o3Var2.a();
            }
            a0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f47370b);
            t10.c();
            x3.p((x3) t10.f7332b, l3Var);
            ((b2.u) this.f47371c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(com.google.android.gms.internal.play_billing.a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f47370b);
            t10.c();
            x3.r((x3) t10.f7332b, a4Var);
            ((b2.u) this.f47371c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f47370b);
            t10.c();
            x3.s((x3) t10.f7332b, b4Var);
            ((b2.u) this.f47371c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void a(e6.f fVar, String str) {
        e6.c cVar = (e6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        S(cVar);
    }

    public void a0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f7332b, g3Var);
            ((b2.u) this.f47371c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f47370b;
        String str = (String) this.f47371c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.j("Not connected to device", z10);
        h6.f fVar = (h6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.f8072s) {
            try {
                if (e0Var.f8069p != null) {
                    taskCompletionSource.setException(l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f8069p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((e6.c) fVar).a() + " " + i10);
    }

    public void b0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f7332b, i3Var);
            ((b2.u) this.f47371c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean c(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: rf.b.c(float):boolean");
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f47370b, ((g2.o) this.f47371c).createDataSource());
    }

    @Override
    public void d(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((e6.c) fVar).a() + " " + i10);
    }

    @Override
    public void e(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((e6.c) fVar).a() + " " + i10);
    }

    @Override
    public c3.h f(p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        x xVar = (x) this.f47371c;
        xVar.K(min);
        pVar.b(0, min, xVar.f9731a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.f9732b, xVar.f9731a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.f47370b).b(c10);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new c3.h(-1, b10, position);
                        }
                        return new c3.h(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.f9732b);
                    } else {
                        j11 = b10;
                        i11 = xVar.f9732b;
                    }
                }
                int i12 = xVar.f9733c;
                if (xVar.a() < 10) {
                    xVar.N(i12);
                } else {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() < A) {
                        xVar.N(i12);
                    } else {
                        xVar.O(A);
                        if (xVar.a() < 4) {
                            xVar.N(i12);
                        } else {
                            if (h3.a.a(xVar.f9732b, xVar.f9731a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i12);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(xVar.f9732b, xVar.f9731a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.f9733c, xVar.f9732b + xVar.H()));
                            }
                        }
                    }
                }
                i10 = xVar.f9732b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new c3.h(-2, j11, position + i10);
        }
        return c3.h.d;
    }

    @Override
    public void g(e6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((e6.c) fVar).a() + " " + str);
    }

    @Override
    public void h(String str, long j10, long j11, long j12) {
        h6.n nVar = (h6.n) this.f47370b;
        if (nVar != null) {
            nVar.h(str, j10, j11, j12);
        }
    }

    @Override
    public void i(u3 u3Var, View view) {
        q qVar = (q) this.f47371c;
        l80 l80Var = new l80(qVar, (u6) this.f47370b, view, false, false, true);
        l80Var.Q = true;
        r2 r2Var = qVar.f30254b.f32990f0;
        qVar.getContext();
        qVar.H = j4.b(l80Var, r2Var, u3Var, true);
    }

    @Override
    public z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override
    public void k(Bitmap bitmap) {
        n4.s sVar = (n4.s) this.f47370b;
        sVar.f18696c = bitmap;
        g6.f fVar = (g6.f) this.f47371c;
        fVar.f12366l = sVar;
        fVar.b();
    }

    @Override
    public void l(e6.f fVar) {
        e6.c cVar = (e6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        S(cVar);
    }

    @Override
    public void m(int i10) {
        q.R((q) this.f47371c, 74, i10);
    }

    @Override
    public void n() {
        int i10;
        q qVar = (q) this.f47371c;
        li.v3 v3Var = qVar.f17417r;
        a4 a4Var = qVar.f17418s;
        if (a4Var != null) {
            j3 j3Var = v3Var.f17568v3;
            if (j3Var != null && j3Var.x() && v3Var.I4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (a4Var.f17081a0 == 2) {
                a4Var.f17083b0 = i10;
            } else {
                a4Var.g(i10, true);
            }
            if (i10 != 0) {
                qVar.Z();
            }
        }
        qVar.c0();
    }

    @Override
    public void o(li.a aVar) {
        q qVar = (q) this.f47371c;
        ti tiVar = qVar.f30254b;
        r2 r2Var = tiVar.f32990f0;
        if (r2Var != null && aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(r2Var)) {
            ti tiVar2 = new ti(qVar.getContext(), tiVar.f32990f0, false, false, false, null);
            tiVar2.f32982c2 = new sb.b(12);
            tiVar2.P = true;
            tiVar2.A1.setVisibility(8);
            tiVar2.f33056z2 = new androidx.car.app.utils.a(qVar, aVar, tiVar2, 11);
            tiVar2.w1();
            tiVar2.show();
        }
    }

    @Override
    public void onContentChanged() {
        q qVar = (q) this.f47371c;
        a4 a4Var = qVar.f17418s;
        if (a4Var != null) {
            a4Var.setSendLoading(qVar.f17417r.s3());
        }
        qVar.Y(true);
        qVar.b0();
        li.d dVar = qVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p(d6 d6Var, String str) {
        q qVar = (q) this.f47371c;
        if (qVar.v == null) {
            u6 u6Var = (u6) this.f47370b;
            qVar.v = new r3(new f0(24, this, u6Var), u6Var);
        }
        qVar.v.f(d6Var, str);
    }

    @Override
    public void q() {
        a4 a4Var = ((q) this.f47371c).f17418s;
        if (a4Var != null) {
            int i10 = a4Var.f17081a0;
            if (i10 == 2) {
                i10 = 0;
            }
            a4Var.f17083b0 = i10;
            a4Var.e(false, false);
            a4Var.g(2, true);
        }
    }

    @Override
    public void r(e6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((e6.c) fVar).a());
    }

    @Override
    public void s(g1 g1Var, boolean z10) {
        ((q) this.f47371c).f30254b.z1(g1Var, z10);
    }

    @Override
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((h6.m) this.f47371c).f12630g = null;
        h6.n nVar = (h6.n) this.f47370b;
        if (nVar != null) {
            nVar.t(str, j10, i10, obj, j11, j12);
        }
    }

    @Override
    public Object then(Task task) {
        k6.a aVar = (k6.a) this.f47370b;
        Bundle bundle = (Bundle) this.f47371c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(k6.n.f16425a, k6.b.f16403b);
        }
        return task;
    }

    public String toString() {
        switch (this.f47369a) {
            case 23:
                return ((HashMap) this.f47370b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        q qVar = (q) this.f47371c;
        if (qVar.getCurrentItemTop() != qVar.I) {
            qVar.f30254b.f2(qVar, 0);
        }
        qVar.d0();
        q.N(qVar);
    }

    @Override
    public void v(e6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((e6.c) fVar).a() + " " + z10);
    }

    @Override
    public StackTraceElement[] w(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ga.a[] aVarArr = (ga.a[]) this.f47370b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ga.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.w(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((u7.s) this.f47371c).w(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void x(e6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((e6.c) fVar).a() + " " + i10);
        ((k6.c) this.f47370b).I(null);
    }

    @Override
    public int y() {
        return 1;
    }

    @Override
    public void z() {
        x xVar = (x) this.f47371c;
        byte[] bArr = n0.f9692b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    public b(int i10, boolean z10) {
        this.f47369a = i10;
    }

    public b(Context context, int i10) {
        this.f47369a = i10;
        switch (i10) {
            case 19:
                g2.o oVar = new g2.o();
                this.f47370b = context.getApplicationContext();
                this.f47371c = oVar;
                return;
            default:
                this.f47370b = context;
                return;
        }
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f47369a = i10;
        this.f47371c = obj;
        this.f47370b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f47369a = 14;
        b2.u uVar = new b2.u(1);
        try {
            t.b(context);
            uVar.f3464c = t.a().c(k5.a.e).a("PLAY_BILLING_LIBRARY", new j5.c("proto"), new u7.s(4));
        } catch (Throwable unused) {
            uVar.f3463b = true;
        }
        this.f47371c = uVar;
        this.f47370b = p3Var;
    }

    public b(ga.a[] aVarArr) {
        this.f47369a = 21;
        this.f47370b = aVarArr;
        this.f47371c = new u7.s(8);
    }

    public b(int i10) {
        this.f47369a = i10;
        switch (i10) {
            case 12:
                this.f47370b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f47371c = new ReferenceQueue();
                return;
            case 24:
                this.f47370b = new HashMap();
                this.f47371c = i2.d.f13506b;
                return;
            case 25:
                this.f47370b = new x();
                this.f47371c = new i4.a();
                return;
            default:
                e6.a c10 = e6.a.c(ApplicationLoader.applicationContext);
                li1 li1Var = new li1(12);
                c10.getClass();
                l.e("Must be called from the main thread.");
                e6.g gVar = c10.f9784c;
                gVar.getClass();
                try {
                    y yVar = gVar.f9816a;
                    j jVar = new j(li1Var);
                    Parcel N0 = yVar.N0();
                    com.google.android.gms.internal.cast.t.d(N0, jVar);
                    yVar.R0(N0, 4);
                } catch (RemoteException e) {
                    e6.g.f9815c.a(e, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.f47370b = new k6.c(29, false);
                e6.g b10 = c10.b();
                this.f47371c = b10;
                b10.a(this);
                S(b10.c());
                return;
        }
    }

    @Override
    public void reset() {
    }

    public b(k0 k0Var) {
        this.f47369a = 26;
        this.f47370b = k0Var;
        this.f47371c = new x();
    }

    public b(Animation animation) {
        this.f47369a = 6;
        this.f47370b = animation;
        this.f47371c = null;
    }

    public b(Handler handler, v vVar) {
        this.f47369a = 27;
        if (vVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f47370b = handler;
        this.f47371c = vVar;
    }

    public b(Animator animator) {
        this.f47369a = 6;
        this.f47370b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f47371c = animatorSet;
        animatorSet.play(animator);
    }

    public b(a3.f fVar) {
        this.f47369a = 1;
        this.f47371c = fVar;
    }

    public b(a5.m mVar) {
        this.f47369a = 2;
        this.f47371c = mVar;
        this.f47370b = new Rect();
    }
}
