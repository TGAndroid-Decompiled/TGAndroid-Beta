package tf;

import ai.r1;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.ViewGroup;
import ba.i;
import bi.z;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.cast.b1;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.a2;
import e5.l;
import e5.y;
import e6.e0;
import ei.j4;
import ei.q9;
import ei.r9;
import f6.h;
import f9.k;
import gi.w5;
import h2.q;
import h2.r;
import i2.g;
import i2.o;
import i6.n;
import i6.w;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import ji.b0;
import ji.h0;
import kotlin.jvm.internal.j;
import l4.a0;
import l4.d0;
import l4.f0;
import mi.z3;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.t0;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wm;
import p6.m;
import r0.i0;
import r0.l0;
import v7.s;
public final class b implements h, z, OnCompleteListener, com.google.android.gms.internal.clearcut.h, fb.b, y, p, k, g, n, ia.a, h0, a0, Continuation {
    public static volatile b f55093c;
    public Object f55094a;
    public Object f55095b;

    public b(Object obj) {
        this.f55094a = obj;
        this.f55095b = null;
    }

    public static b t() {
        b bVar;
        b bVar2 = f55093c;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = f55093c;
                    if (bVar == null) {
                        bVar = new b(0);
                        f55093c = bVar;
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
    public StackTraceElement[] A(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ia.a[] aVarArr = (ia.a[]) this.f55094a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i3 = 0; i3 < 1; i3++) {
            ia.a aVar = aVarArr[i3];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.A(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((s) this.f55095b).A(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public void B(l lVar) {
        this.f55094a = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.f55095b = str;
            }
        }
    }

    public void C(f6.c cVar) {
        String str;
        String M0;
        p7.d dVar = (p7.d) this.f55094a;
        if (cVar != null) {
            m.d("Must be called from the main thread.");
            g6.h hVar = cVar.f11473j;
            String a10 = cVar.a();
            if (!TextUtils.isEmpty(a10) && hVar != null) {
                a aVar = (a) dVar.f53346c;
                if (aVar == null || !TextUtils.equals(aVar.f55089c.a(), a10)) {
                    dVar.F(new a(cVar, (f6.g) this.f55095b, hVar));
                    m.d("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f11474k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer v12 = PhotoViewer.v1();
                    d.i();
                    if (v12.F != null && v12.f41420f0 != null && v12.U1()) {
                        fc fcVar = new fc(v12.f41420f0, new ei.b());
                        if (!TextUtils.isEmpty(str)) {
                            M0 = bd.a0(null, null, 2131752102, str);
                        } else {
                            M0 = bd.M0(2131752103, null);
                        }
                        fcVar.Q(2131624028, 36, M0).j();
                    }
                }
            }
        }
    }

    public void D(ArrayList arrayList) {
        r rVar;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((q) arrayList.get(i3)).f14161a == 1) {
                try {
                    rVar = new r((q) arrayList.get(i3));
                } catch (h2.p unused) {
                    rVar = null;
                }
                this.f55095b = rVar;
            }
        }
    }

    public void E(a2 a2Var) {
        Handler handler = (Handler) this.f55094a;
        if (handler != null) {
            handler.post(new a1.f(27, this, a2Var));
        }
    }

    public void F(g3 g3Var) {
        try {
            M(g3Var, (p3) this.f55094a);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void G(g3 g3Var, int i3, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.f55094a).g();
            o3Var.c();
            p3.p((p3) o3Var.f7524b, i3);
            p3 p3Var = (p3) o3Var.a();
            this.f55094a = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7524b, j10);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void H(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7524b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7524b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f55094a;
            } else {
                o3 o3Var = (o3) ((p3) this.f55094a).g();
                o3Var.c();
                p3.r((p3) o3Var.f7524b, j10);
                p3Var = (p3) o3Var.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void H0() {
        b0 b0Var = (b0) this.f55095b;
        b0Var.f16272t1.d.f35594g3.O(true);
        b0Var.f16271s1.d.f35594g3.O(true);
    }

    public void I(g3 g3Var, int i3, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f55094a).g();
            o3Var.c();
            p3.p((p3) o3Var.f7524b, i3);
            this.f55094a = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7524b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7524b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f55094a;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f55094a).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7524b, j10);
                p3Var = (p3) o3Var2.a();
            }
            M(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void J(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f55094a);
            t10.c();
            x3.p((x3) t10.f7524b, l3Var);
            ((i) this.f55095b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void K(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f55094a);
            t10.c();
            x3.r((x3) t10.f7524b, a4Var);
            ((i) this.f55095b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void L(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f55094a);
            t10.c();
            x3.s((x3) t10.f7524b, b4Var);
            ((i) this.f55095b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void M(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f7524b, g3Var);
            ((i) this.f55095b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void N(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f7524b, i3Var);
            ((i) this.f55095b).m((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void a(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((f6.c) fVar).a() + " " + i3);
        ((p7.d) this.f55094a).F(null);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f55094a;
        String str = (String) this.f55095b;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.G == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.i("Not connected to device", z10);
        i6.f fVar = (i6.f) wVar.m();
        Parcel P0 = fVar.P0();
        P0.writeString(str);
        fVar.U0(P0, 5);
        synchronized (e0Var.f9701t) {
            try {
                if (e0Var.f9698q != null) {
                    taskCompletionSource.setException(m.l(new Status(2001, null, null, null)));
                } else {
                    e0Var.f9698q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((k) ((c6.i) this.f55094a).f4235b).apply(obj);
    }

    @Override
    public void c(g2.y yVar) {
        d0 d0Var = (d0) this.f55095b;
        SparseArray sparseArray = d0Var.h;
        c4.f fVar = (c4.f) this.f55094a;
        if (yVar.A() == 0 && (yVar.A() & 128) != 0) {
            yVar.O(6);
            int a10 = yVar.a() / 4;
            for (int i3 = 0; i3 < a10; i3++) {
                yVar.k(0, 4, (byte[]) fVar.f4190b);
                fVar.J(0);
                int j10 = fVar.j(16);
                fVar.L(3);
                if (j10 == 0) {
                    fVar.L(13);
                } else {
                    int j11 = fVar.j(13);
                    if (sparseArray.get(j11) == null) {
                        sparseArray.put(j11, new l4.b0(new e0.e0(d0Var, j11)));
                        d0Var.f17788n++;
                    }
                }
            }
            if (d0Var.f17777a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public void close() {
        ((b0) this.f55095b).f16265l1.D(0);
    }

    @Override
    public i2.h createDataSource() {
        return new o((Context) this.f55094a, ((i2.p) this.f55095b).createDataSource());
    }

    @Override
    public void d(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((f6.c) fVar).a() + " " + i3);
    }

    @Override
    public void e(bi.a0 a0Var) {
        g0.E2(a0Var);
        ((Runnable) this.f55095b).run();
    }

    @Override
    public void f(f6.f fVar, String str) {
        f6.c cVar = (f6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        C(cVar);
    }

    @Override
    public void g(f6.f fVar) {
        f6.c cVar = (f6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        C(cVar);
    }

    @Override
    public Object mo5get() {
        Context appContext = (Context) ((e.a) this.f55094a).f9205a;
        fd.h blockingDispatcher = (fd.h) ((fb.c) this.f55095b).mo5get();
        j.e(appContext, "appContext");
        j.e(blockingDispatcher, "blockingDispatcher");
        return db.q.a(gb.j.f12222a, new w5(new db.o(0), 12), wd.b0.b(blockingDispatcher), new db.p(appContext, 0));
    }

    @Override
    public void h(f6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((f6.c) fVar).a());
    }

    @Override
    public void i(String str, long j10, long j11, long j12) {
        n nVar = (n) this.f55094a;
        if (nVar != null) {
            nVar.i(str, j10, j11, j12);
        }
    }

    @Override
    public void i0(long j10) {
        ((d2) this.f55094a).presentFragment(wm.ra(j10));
        ((b0) this.f55095b).dismiss();
    }

    @Override
    public void j(f6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((f6.c) fVar).a() + " " + str);
    }

    public e5.d k() {
        if (((l) this.f55094a) != null) {
            return new e5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void l(f6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((f6.c) fVar).a() + " " + z10);
    }

    @Override
    public void m(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((f6.c) fVar).a() + " " + i3);
    }

    @Override
    public void n(f6.f fVar, int i3) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((f6.c) fVar).a() + " " + i3);
    }

    @Override
    public void o(String str) {
        ((u10) this.f55094a).a(str);
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        f6.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.q qVar = (com.google.android.gms.internal.cast.q) this.f55094a;
        f6.b bVar2 = (f6.b) this.f55095b;
        r4.y yVar = qVar.f7005c;
        i6.b bVar3 = com.google.android.gms.internal.cast.q.f7004j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (true != z12) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z12) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f14620a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f11465y)));
                if (!z10 && bVar2.f11465y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (yVar == null && (bVar = qVar.d) != null) {
                    boolean z13 = bVar.f11463w;
                    boolean z14 = bVar.f11462s;
                    r4.z zVar = new r4.z();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30) {
                        zVar.f54396b = z11;
                    }
                    if (i3 >= 30) {
                        zVar.d = z13;
                    }
                    if (i3 >= 30) {
                        zVar.f54397c = z14;
                    }
                    r4.y.i(new r4.a0(zVar));
                    Log.i(bVar3.f14620a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(qVar.f7008i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        t tVar = qVar.f7007f;
                        m.g(tVar);
                        com.google.android.gms.internal.cast.p pVar = new com.google.android.gms.internal.cast.p(tVar);
                        r4.y.b();
                        r4.y.c().f54261f = pVar;
                        b2.a(b1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f14620a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f11465y)));
        if (!z10) {
        }
        z11 = false;
        if (yVar == null) {
        }
    }

    @Override
    public void p(String str, long j10, int i3, Object obj, long j11, long j12) {
        ((i6.m) this.f55095b).f14632g = null;
        n nVar = (n) this.f55094a;
        if (nVar != null) {
            nVar.p(str, j10, i3, obj, j11, j12);
        }
    }

    public void q() {
        this.f55094a = null;
        this.f55095b = null;
    }

    public boolean r(int i3) {
        return ((d2.t) this.f55094a).f8412a.get(i3);
    }

    public void s(k2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f55094a;
        if (handler != null) {
            handler.post(new c3.h0(this, dVar, 1));
        }
    }

    @Override
    public Object then(Task task) {
        l6.c cVar = (l6.c) this.f55094a;
        Bundle bundle = (Bundle) this.f55095b;
        cVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return cVar.d(bundle).onSuccessTask(l6.d.f18065b, ra.e.f54461b);
        }
        return task;
    }

    public boolean u() {
        if (((a) ((p7.d) this.f55094a).f53346c) != null) {
            return true;
        }
        return false;
    }

    public void v(k.a aVar) {
        ui.f fVar = (ui.f) this.f55094a;
        ((ActionMode.Callback) fVar.f56390b).onDestroyActionMode(fVar.l(aVar));
        g.s sVar = (g.s) this.f55095b;
        if (sVar.F != null) {
            sVar.f11746f.getDecorView().removeCallbacks(sVar.G);
        }
        if (sVar.E != null) {
            l0 l0Var = sVar.H;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a10 = i0.a(sVar.E);
            a10.a(0.0f);
            sVar.H = a10;
            a10.d(new g.j(this, 2));
        }
        sVar.f11763y = null;
        ViewGroup viewGroup = sVar.K;
        WeakHashMap weakHashMap = i0.f54015a;
        r0.y.c(viewGroup);
        sVar.x();
    }

    public boolean w(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f55095b).K;
        WeakHashMap weakHashMap = i0.f54015a;
        r0.y.c(viewGroup);
        ui.f fVar = (ui.f) this.f55094a;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.f56390b;
        k.e l10 = fVar.l(aVar);
        a0.l lVar = (a0.l) fVar.f56392e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.f56391c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(l10, menu2);
    }

    public void x(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f55094a;
        ei.b4 b4Var = (ei.b4) this.f55095b;
        r9 r9Var = b4Var.f10120e;
        r9.C1 = f10;
        q9 q9Var = r9Var.A0;
        if (q9Var != null) {
            q9Var.setSpeed(f10);
        }
        j4.Y(b4Var.f10126x, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void y(Object obj) {
        Handler handler = (Handler) this.f55094a;
        if (handler != null) {
            handler.post(new r1(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public void z(z3 z3Var) {
        d dVar;
        z3 z3Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        p7.d dVar2 = (p7.d) this.f55094a;
        z3 z3Var3 = (z3) dVar2.d;
        if (d1.f.u()) {
            if (z3Var3 != null || z3Var != null) {
                if (z3Var3 != null) {
                    ArrayList arrayList = z3Var3.f20086a;
                    if (z3Var != null && arrayList.size() == z3Var.f20086a.size()) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            f c2 = z3Var3.c(i3);
                            f c10 = z3Var.c(i3);
                            if ((c2 == null && c10 == null) || (c2 != null && c10 != null && Objects.equals(c2.f55113a, c10.f55113a) && Objects.equals(c2.f55114b, c10.f55114b) && Objects.equals(c2.f55115c, c10.f55115c) && Objects.equals(c2.d, c10.d) && c2.f55116e == c10.f55116e && c2.f55117f == c10.f55117f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) dVar2.f53346c) != null && z3Var != null) {
            dVar2.g(z3Var);
        }
        if (((a) dVar2.f53346c) != null && (z3Var2 = (z3) dVar2.d) != null) {
            dVar2.C(z3Var2);
        }
        if (z3Var != null && z3Var.f20086a.size() > 0 && !z3Var.c(0).f55113a.startsWith("audio/") && (dVar = (d) dVar2.f53345b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) dVar2.f53346c;
        if (aVar != null && z3Var != null) {
            aVar.d = z3Var;
            aVar.f55092g = 0;
            aVar.h = 0;
            aVar.p();
        }
        dVar2.d = z3Var;
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f55094a;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f55095b;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", false))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f7178e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f7178e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f7178e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f7197b);
    }

    public b(Object obj, Object obj2) {
        this.f55094a = obj;
        this.f55095b = obj2;
    }

    public b(Object obj, Object obj2, boolean z10) {
        this.f55095b = obj;
        this.f55094a = obj2;
    }

    public b(Context context, p3 p3Var) {
        i iVar = new i(2);
        try {
            n5.s.b(context);
            iVar.f3187c = n5.s.a().c(l5.a.f18036e).a("PLAY_BILLING_LIBRARY", new k5.c("proto"), new ra.e(6));
        } catch (Throwable unused) {
            iVar.f3186b = true;
        }
        this.f55095b = iVar;
        this.f55094a = p3Var;
    }

    public b(int i3) {
        switch (i3) {
            case 2:
                return;
            case 7:
                this.f55094a = ByteBuffer.allocateDirect(500);
                return;
            default:
                f6.a c2 = f6.a.c(t0.f25457b);
                s0.b bVar = new s0.b(18);
                c2.getClass();
                m.d("Must be called from the main thread.");
                f6.g gVar = c2.f11447c;
                gVar.getClass();
                try {
                    f6.y yVar = gVar.f11483a;
                    f6.j jVar = new f6.j(bVar);
                    Parcel P0 = yVar.P0();
                    com.google.android.gms.internal.cast.u.d(P0, jVar);
                    yVar.T0(P0, 4);
                } catch (RemoteException e10) {
                    f6.g.f11482c.a(e10, "Unable to call %s on %s.", "addCastStateListener", f6.y.class.getSimpleName());
                }
                this.f55094a = new p7.d(14, false);
                f6.g b10 = c2.b();
                this.f55095b = b10;
                b10.a(this);
                C(b10.c());
                return;
        }
    }

    public b(Context context) {
        i2.p pVar = new i2.p();
        this.f55094a = context.getApplicationContext();
        this.f55095b = pVar;
    }

    public b(Handler handler, c3.i0 i0Var) {
        if (i0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f55094a = handler;
        this.f55095b = i0Var;
    }

    public b(Animator animator) {
        this.f55094a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f55095b = animatorSet;
        animatorSet.play(animator);
    }

    @Override
    public void b(g2.l0 l0Var, e3.q qVar, f0 f0Var) {
    }
}
