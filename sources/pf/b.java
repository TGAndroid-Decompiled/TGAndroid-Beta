package pf;

import a3.h0;
import a3.j0;
import a3.l0;
import ai.f6;
import ai.jc;
import ai.kc;
import ai.r5;
import ai.w5;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import b2.p;
import b2.q;
import b2.x1;
import c5.f0;
import c5.o;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
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
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d6.j;
import d6.y;
import e0.g0;
import e2.v;
import fd.i;
import g6.n;
import g6.w;
import ii.c4;
import ii.i1;
import ii.k3;
import ii.l4;
import ii.r;
import ii.u3;
import ii.v3;
import ii.w3;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j4.a0;
import j4.b0;
import j4.d0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;
import m.q3;
import me.k;
import me.l;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.v20;
import z3.m;
public final class b implements h, f0, s, de.b, df.b, g2.g, n, m, v3, a0, Continuation, me.f {
    public static volatile b d;
    public final int f45591a;
    public Object f45592b;
    public Object f45593c;

    public b(int i10, Object obj, Object obj2) {
        this.f45591a = i10;
        this.f45593c = obj;
        this.f45592b = obj2;
    }

    public static b S() {
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
    public void A(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    @Override
    public void B(int i10) {
        r rVar = (r) this.f45593c;
        rVar.f30161b.b2(rVar, i10);
        rVar.d0();
        r.N(rVar);
    }

    @Override
    public df.a C(z0 z0Var) {
        int i10;
        List list = (List) this.f45593c;
        List list2 = (List) z0Var.f16869b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(z0Var, (List) this.f45592b, list);
    }

    @Override
    public void D(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        Y(cVar);
    }

    @Override
    public void E() {
        c4 c4Var = ((r) this.f45593c).f12650s;
        if (c4Var != null) {
            int i10 = 0;
            c4Var.e(false, true);
            int i11 = c4Var.f12314b0;
            if (i11 != 2) {
                i10 = i11;
            }
            c4Var.f(i10, true);
        }
    }

    @Override
    public void F(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public java.lang.Object G(de.c r6, ld.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.G(de.c, ld.c):java.lang.Object");
    }

    public c5.e H() {
        if (((o) this.f45592b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public boolean I(int i10) {
        return ((q) this.f45592b).f3532a.get(i10);
    }

    @Override
    public q80 J(View view) {
        r rVar = (r) this.f45593c;
        q80 q80Var = new q80(rVar, (d6) this.f45592b, view, false, false, true);
        rVar.H = q80Var;
        return q80Var;
    }

    public void K(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f45592b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    @Override
    public void L() {
        r rVar = (r) this.f45593c;
        rVar.a0();
        rVar.b0();
    }

    public byte[] M(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f45593c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f45592b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f16583a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f16584b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f16585c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f16586e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public void N(u3 u3Var, View view) {
        r rVar = (r) this.f45593c;
        q80 q80Var = new q80(rVar, (d6) this.f45592b, view, false, false, true);
        q80Var.Q = true;
        rVar.H = l4.c(q80Var, rVar.f30161b.f33216f0, rVar.getContext(), (d6) this.f45592b, u3Var, true);
    }

    @Override
    public int O() {
        return 1;
    }

    @Override
    public void P(byte[] r19, int r20, int r21, z3.l r22, e2.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.P(byte[], int, int, z3.l, e2.h):void");
    }

    public com.google.android.datatransport.cct.CctBackendFactory Q(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.Q(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public dc.b R() {
        if (((dc.b) this.f45593c) == null) {
            dc.f fVar = (dc.f) this.f45592b;
            int[] iArr = fVar.f8289c;
            cc.d dVar = fVar.f8287a;
            int i10 = dVar.f4588a;
            int i11 = dVar.f4589b;
            dc.b bVar = new dc.b(i10, i11);
            if (fVar.f8288b.length < i10) {
                fVar.f8288b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f8288b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 > length / 16) {
                int i28 = i19 - 1;
                int i29 = -1;
                int i30 = i28;
                while (i28 > i22) {
                    int i31 = i28 - i22;
                    int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                    if (i32 > i29) {
                        i30 = i28;
                        i29 = i32;
                    }
                    i28--;
                }
                int i33 = i30 << 3;
                byte[] a2 = dVar.a();
                for (int i34 = 0; i34 < i11; i34++) {
                    int i35 = i34 * i10;
                    for (int i36 = 0; i36 < i10; i36++) {
                        if ((a2[i35 + i36] & 255) < i33) {
                            int i37 = (i36 / 32) + (bVar.f8273c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f45593c = bVar;
            } else {
                throw cc.e.a();
            }
        }
        return (dc.b) this.f45593c;
    }

    public boolean T() {
        if (((a) ((la.h) this.f45592b).d) != null) {
            return true;
        }
        return false;
    }

    public void U(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45592b;
        w5 w5Var = (w5) this.f45593c;
        kc kcVar = w5Var.f1854e;
        kc.B1 = f7;
        jc jcVar = kcVar.f1310z0;
        if (jcVar != null) {
            jcVar.setSpeed(f7);
        }
        f6.a0(w5Var.f1860l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void V(Object obj) {
        Handler handler = (Handler) this.f45592b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void W(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        la.h hVar = (la.h) this.f45592b;
        g gVar3 = (g) hVar.f15466c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f45616a;
                    if (gVar != null && arrayList.size() == gVar.f45616a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f45611a, a10.f45611a) && Objects.equals(a2.f45612b, a10.f45612b) && Objects.equals(a2.f45613c, a10.f45613c) && Objects.equals(a2.d, a10.d) && a2.f45614e == a10.f45614e && a2.f45615f == a10.f45615f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) hVar.d) != null && gVar != null) {
            hVar.k(gVar);
        }
        if (((a) hVar.d) != null && (gVar2 = (g) hVar.f15466c) != null) {
            hVar.U(gVar2);
        }
        if (gVar != null && gVar.f45616a.size() > 0 && !gVar.a(0).f45611a.startsWith("audio/") && (dVar = (d) hVar.f15465b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) hVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f45590g = 0;
            aVar.h = 0;
            aVar.p();
        }
        hVar.f15466c = gVar;
    }

    public void X(o oVar) {
        this.f45592b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f45593c = str;
            }
        }
    }

    public void Y(d6.c cVar) {
        String str;
        String string;
        la.h hVar = (la.h) this.f45592b;
        if (cVar != null) {
            n6.m.e("Must be called from the main thread.");
            e6.h hVar2 = cVar.f8183j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar2 != null) {
                a aVar = (a) hVar.d;
                if (aVar == null || !TextUtils.equals(aVar.f45587c.a(), a2)) {
                    hVar.X(new a(cVar, (d6.g) this.f45593c, hVar2));
                    n6.m.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f8184k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f33932e0 != null && t12.R1()) {
                        ad adVar = new ad(t12.f33932e0, new ai.d());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        adVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    public void Z(x1 x1Var) {
        Handler handler = (Handler) this.f45592b;
        if (handler != null) {
            handler.post(new a1.f(2, this, x1Var));
        }
    }

    @Override
    public void a() {
        ((k) this.f45592b).a();
    }

    public void a0(g3 g3Var) {
        try {
            h0(g3Var, (p3) this.f45592b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f45592b;
        String str = (String) this.f45593c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.m.j("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.f4354s) {
            try {
                if (e0Var.f4351p != null) {
                    taskCompletionSource.setException(n6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4351p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(v vVar) {
        d0 d0Var = (d0) this.f45593c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.f45592b;
        if (vVar.x() == 0 && (vVar.x() & 128) != 0) {
            vVar.K(6);
            int a2 = vVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                vVar.h(0, 4, gVar.f276b);
                gVar.q(0);
                int i11 = gVar.i(16);
                gVar.t(3);
                if (i11 == 0) {
                    gVar.t(13);
                } else {
                    int i12 = gVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new g0(d0Var, i12)));
                        d0Var.f13773n++;
                    }
                }
            }
            if (d0Var.f13762a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void b0(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f45592b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7475b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f45592b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7475b, j3);
                p3Var = (p3) o3Var2.a();
            }
            h0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void c0(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f7475b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7475b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f45592b;
            } else {
                o3 o3Var = (o3) ((p3) this.f45592b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7475b, j3);
                p3Var = (p3) o3Var.a();
            }
            h0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f45592b, ((g2.o) this.f45593c).createDataSource());
    }

    @Override
    public void d(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void d0(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f45592b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7475b, i10);
            this.f45592b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f7475b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7475b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f45592b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f45592b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7475b, j3);
                p3Var = (p3) o3Var2.a();
            }
            h0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void e(w3 w3Var, View view) {
        r rVar = (r) this.f45593c;
        q80 q80Var = new q80(rVar, (d6) this.f45592b, view, false, false, true);
        q80Var.Q = true;
        m2 m2Var = rVar.f30161b.f33216f0;
        rVar.getContext();
        rVar.H = l4.b(q80Var, m2Var, w3Var, true);
    }

    public void e0(l3 l3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t10 = x3.t();
            t10.d((p3) this.f45592b);
            t10.c();
            x3.p((x3) t10.f7475b, l3Var);
            ((p) this.f45593c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean f(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.f(float):boolean");
    }

    public void f0(a4 a4Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t10 = x3.t();
            t10.d((p3) this.f45592b);
            t10.c();
            x3.r((x3) t10.f7475b, a4Var);
            ((p) this.f45593c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void g0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t10 = x3.t();
            t10.d((p3) this.f45592b);
            t10.c();
            x3.s((x3) t10.f7475b, b4Var);
            ((p) this.f45593c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    public void h0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f7475b, g3Var);
            ((p) this.f45593c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    public void i0(i3 i3Var, p3 p3Var) {
        try {
            com.google.android.gms.internal.play_billing.w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f7475b, i3Var);
            ((p) this.f45593c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void k(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void l(ii.f6 f6Var, String str) {
        r rVar = (r) this.f45593c;
        if (rVar.v == null) {
            d6 d6Var = (d6) this.f45592b;
            rVar.v = new q3(new ah.b(16, this, d6Var), d6Var);
        }
        rVar.v.f(f6Var, str);
    }

    @Override
    public void m(int i10) {
        r.R((r) this.f45593c, 74, i10);
    }

    @Override
    public void n() {
        int i10;
        r rVar = (r) this.f45593c;
        ii.x3 x3Var = rVar.f12649r;
        c4 c4Var = rVar.f12650s;
        if (c4Var != null) {
            k3 k3Var = x3Var.f12819l3;
            if (k3Var != null && k3Var.x() && x3Var.D4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (c4Var.f12312a0 == 2) {
                c4Var.f12314b0 = i10;
            } else {
                c4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.Z();
            }
        }
        rVar.c0();
    }

    @Override
    public void o(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override
    public void onContentChanged() {
        r rVar = (r) this.f45593c;
        c4 c4Var = rVar.f12650s;
        if (c4Var != null) {
            c4Var.setSendLoading(rVar.f12649r.n3());
        }
        rVar.Y(true);
        rVar.b0();
        ii.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p() {
        c4 c4Var = ((r) this.f45593c).f12650s;
        if (c4Var != null) {
            int i10 = c4Var.f12312a0;
            if (i10 == 2) {
                i10 = 0;
            }
            c4Var.f12314b0 = i10;
            c4Var.e(false, false);
            c4Var.f(2, true);
        }
    }

    @Override
    public void q(ii.a aVar) {
        r rVar = (r) this.f45593c;
        yi yiVar = rVar.f30161b;
        m2 m2Var = yiVar.f33216f0;
        if (m2Var != null && aVar != null && (aVar.f12233b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(m2Var)) {
            yi yiVar2 = new yi(rVar.getContext(), yiVar.f33216f0, false, false, false, null);
            yiVar2.f33207c2 = new ob.a(11);
            yiVar2.P = true;
            yiVar2.A1.setVisibility(8);
            yiVar2.f33271w2 = new r5(rVar, aVar, yiVar2, 10);
            yiVar2.t1();
            yiVar2.show();
        }
    }

    @Override
    public void r(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((la.h) this.f45592b).X(null);
    }

    @Override
    public void s(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f45592b;
        if (nVar != null) {
            nVar.s(str, j3, j10, j11);
        }
    }

    @Override
    public z3.d t(int i10, int i11, byte[] bArr) {
        return sc.v.a(this, bArr, i11);
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f45592b;
        Bundle bundle = (Bundle) this.f45593c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f14063a, j6.b.f14040b);
        }
        return task;
    }

    public String toString() {
        switch (this.f45591a) {
            case 10:
                try {
                    return R().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 25:
                return ((String) this.f45592b) + ", " + ((String) this.f45593c);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        Y(cVar);
    }

    @Override
    public void v(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void w() {
        r rVar = (r) this.f45593c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.f30161b.b2(rVar, 0);
        }
        rVar.d0();
        r.N(rVar);
    }

    @Override
    public void x(i1 i1Var, boolean z10) {
        ((r) this.f45593c).f30161b.w1(i1Var, z10);
    }

    @Override
    public void y() {
        ((k) this.f45592b).c((l) this.f45593c);
    }

    @Override
    public void z(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.f45593c).f10334g = null;
        n nVar = (n) this.f45592b;
        if (nVar != null) {
            nVar.z(str, j3, i10, obj, j10, j11);
        }
    }

    public b(int i10, Object obj, boolean z10) {
        this.f45591a = i10;
        this.f45592b = obj;
    }

    public b(int i10, boolean z10) {
        this.f45591a = i10;
    }

    public b(Object obj, int i10) {
        this.f45591a = i10;
        this.f45592b = obj;
        this.f45593c = null;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f45591a = i10;
        this.f45592b = obj;
        this.f45593c = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f45591a = 8;
        p pVar = new p(1);
        try {
            l5.s.b(context);
            pVar.f3506c = l5.s.a().c(j5.a.f14021e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new rb.a(5));
        } catch (Throwable unused) {
            pVar.f3505b = true;
        }
        this.f45593c = pVar;
        this.f45592b = p3Var;
    }

    public b(m6.a aVar) {
        this.f45591a = 14;
        this.f45592b = aVar == null ? null : aVar.f16294b;
    }

    public b(int i10) {
        this.f45591a = i10;
        switch (i10) {
            case 12:
                this.f45592b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f45593c = new ReferenceQueue();
                return;
            case 19:
                this.f45592b = new v();
                this.f45593c = new i4.a();
                return;
            case 29:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f45592b = byteArrayOutputStream;
                this.f45593c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                v20 v20Var = new v20(27);
                c10.getClass();
                n6.m.e("Must be called from the main thread.");
                d6.g gVar = c10.f8157c;
                gVar.getClass();
                try {
                    y yVar = gVar.f8192a;
                    j jVar = new j(v20Var);
                    Parcel N0 = yVar.N0();
                    com.google.android.gms.internal.cast.v.d(N0, jVar);
                    yVar.R0(N0, 4);
                } catch (RemoteException e7) {
                    d6.g.f8191c.a(e7, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.f45592b = new la.h(20, false);
                d6.g b10 = c10.b();
                this.f45593c = b10;
                b10.a(this);
                Y(b10.c());
                return;
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void g(boolean z10) {
    }

    public b(Context context, int i10) {
        this.f45591a = i10;
        switch (i10) {
            case 24:
                this.f45592b = context == null ? null : context.getApplicationContext();
                return;
            default:
                g2.o oVar = new g2.o();
                this.f45592b = context.getApplicationContext();
                this.f45593c = oVar;
                return;
        }
    }

    public b(q qVar, SparseArray sparseArray) {
        this.f45591a = 21;
        this.f45592b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.f3532a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f45593c = sparseArray2;
    }

    public b(Handler handler, l0 l0Var) {
        this.f45591a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f45592b = handler;
        this.f45593c = l0Var;
    }

    public b(Animator animator) {
        this.f45591a = 4;
        this.f45592b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f45593c = animatorSet;
        animatorSet.play(animator);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f45591a = 18;
        int size = arrayList.size();
        this.f45592b = new int[size];
        this.f45593c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f45592b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f45593c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override
    public void c(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public b(int i10, int i11) {
        this.f45591a = 18;
        this.f45592b = new int[]{i10, i11};
        this.f45593c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.f45591a = 18;
        this.f45592b = new int[]{i10, i11, i12};
        this.f45593c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(d0 d0Var) {
        this.f45591a = 22;
        this.f45593c = d0Var;
        this.f45592b = new a4.g(new byte[4], 4);
    }
}
