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
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.w3;
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
import ii.e6;
import ii.i1;
import ii.k3;
import ii.k4;
import ii.r;
import ii.u3;
import ii.v3;
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
import l5.t;
import m.f3;
import m.r3;
import me.k;
import me.l;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.c80;
import z3.m;
public final class b implements h, f0, s, de.b, df.b, g2.g, n, m, v3, a0, Continuation, me.f {
    public static volatile b d;
    public final int f45447a;
    public Object f45448b;
    public Object f45449c;

    public b(int i10, Object obj, Object obj2) {
        this.f45447a = i10;
        this.f45449c = obj;
        this.f45448b = obj2;
    }

    public static b Q() {
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
    public void A() {
        ((k) this.f45448b).c((l) this.f45449c);
    }

    @Override
    public void B(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.f45449c).f10333g = null;
        n nVar = (n) this.f45448b;
        if (nVar != null) {
            nVar.B(str, j3, i10, obj, j10, j11);
        }
    }

    @Override
    public void C(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        W(cVar);
    }

    @Override
    public void D() {
        c4 c4Var = ((r) this.f45449c).f12646s;
        if (c4Var != null) {
            int i10 = 0;
            c4Var.e(false, true);
            int i11 = c4Var.f12321b0;
            if (i11 != 2) {
                i10 = i11;
            }
            c4Var.f(i10, true);
        }
    }

    @Override
    public void E(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public java.lang.Object F(de.c r6, ld.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.F(de.c, ld.c):java.lang.Object");
    }

    public c5.e G() {
        if (((o) this.f45448b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public boolean H(int i10) {
        return ((q) this.f45448b).f3530a.get(i10);
    }

    public void I(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.f45448b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    @Override
    public s80 J(View view) {
        r rVar = (r) this.f45449c;
        s80 s80Var = new s80(rVar, (c6) this.f45448b, view, false, false, true);
        rVar.H = s80Var;
        return s80Var;
    }

    @Override
    public df.a K(z0 z0Var) {
        int i10;
        List list = (List) this.f45449c;
        List list2 = (List) z0Var.f16573b;
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
        return new i(z0Var, (List) this.f45448b, list);
    }

    public byte[] L(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f45449c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f45448b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f16286a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f16287b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f16288c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.f16289e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override
    public void M() {
        r rVar = (r) this.f45449c;
        rVar.a0();
        rVar.b0();
    }

    public com.google.android.datatransport.cct.CctBackendFactory N(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.N(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public void O(u3 u3Var, View view) {
        r rVar = (r) this.f45449c;
        s80 s80Var = new s80(rVar, (c6) this.f45448b, view, false, false, true);
        s80Var.Q = true;
        rVar.H = k4.c(s80Var, rVar.f30570b.f24338f0, rVar.getContext(), (c6) this.f45448b, u3Var, true);
    }

    public dc.b P() {
        if (((dc.b) this.f45449c) == null) {
            dc.f fVar = (dc.f) this.f45448b;
            int[] iArr = fVar.f8287c;
            cc.d dVar = fVar.f8285a;
            int i10 = dVar.f4587a;
            int i11 = dVar.f4588b;
            dc.b bVar = new dc.b(i10, i11);
            if (fVar.f8286b.length < i10) {
                fVar.f8286b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f8286b);
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
                            int i37 = (i36 / 32) + (bVar.f8271c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f45449c = bVar;
            } else {
                throw cc.e.a();
            }
        }
        return (dc.b) this.f45449c;
    }

    public boolean R() {
        if (((a) ((f3) this.f45448b).d) != null) {
            return true;
        }
        return false;
    }

    public void S(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f45448b;
        w5 w5Var = (w5) this.f45449c;
        kc kcVar = w5Var.f1852e;
        kc.B1 = f7;
        jc jcVar = kcVar.f1308z0;
        if (jcVar != null) {
            jcVar.setSpeed(f7);
        }
        f6.a0(w5Var.f1858l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void T(Object obj) {
        Handler handler = (Handler) this.f45448b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    public void U(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        f3 f3Var = (f3) this.f45448b;
        g gVar3 = (g) f3Var.f15425c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f45472a;
                    if (gVar != null && arrayList.size() == gVar.f45472a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f45467a, a10.f45467a) && Objects.equals(a2.f45468b, a10.f45468b) && Objects.equals(a2.f45469c, a10.f45469c) && Objects.equals(a2.d, a10.d) && a2.f45470e == a10.f45470e && a2.f45471f == a10.f45471f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) f3Var.d) != null && gVar != null) {
            f3Var.n(gVar);
        }
        if (((a) f3Var.d) != null && (gVar2 = (g) f3Var.f15425c) != null) {
            f3Var.T(gVar2);
        }
        if (gVar != null && gVar.f45472a.size() > 0 && !gVar.a(0).f45467a.startsWith("audio/") && (dVar = (d) f3Var.f15424b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) f3Var.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f45446g = 0;
            aVar.h = 0;
            aVar.p();
        }
        f3Var.f15425c = gVar;
    }

    public void V(o oVar) {
        this.f45448b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f45449c = str;
            }
        }
    }

    public void W(d6.c cVar) {
        String str;
        String string;
        f3 f3Var = (f3) this.f45448b;
        if (cVar != null) {
            n6.m.e("Must be called from the main thread.");
            e6.h hVar = cVar.f8181j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) f3Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f45443c.a(), a2)) {
                    f3Var.W(new a(cVar, (d6.g) this.f45449c, hVar));
                    n6.m.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f8182k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f33743e0 != null && t12.R1()) {
                        zc zcVar = new zc(t12.f33743e0, new ai.d());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        zcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    public void X(x1 x1Var) {
        Handler handler = (Handler) this.f45448b;
        if (handler != null) {
            handler.post(new a1.f(2, this, x1Var));
        }
    }

    public void Y(g3 g3Var) {
        try {
            h0(g3Var, (p3) this.f45448b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f45448b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7474b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f45448b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7474b, j3);
                p3Var = (p3) o3Var2.a();
            }
            h0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void a() {
        ((k) this.f45448b).a();
    }

    @Override
    public int a0() {
        return 1;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f45448b;
        String str = (String) this.f45449c;
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
        synchronized (e0Var.f4353s) {
            try {
                if (e0Var.f4350p != null) {
                    taskCompletionSource.setException(n6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4350p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(v vVar) {
        d0 d0Var = (d0) this.f45449c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.f45448b;
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
                        d0Var.f13771n++;
                    }
                }
            }
            if (d0Var.f13760a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void b0(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f7474b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7474b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f45448b;
            } else {
                o3 o3Var = (o3) ((p3) this.f45448b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7474b, j3);
                p3Var = (p3) o3Var.a();
            }
            h0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void c0(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f45448b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7474b, i10);
            this.f45448b = (p3) o3Var.a();
            com.google.android.gms.internal.play_billing.f3 f3Var = (com.google.android.gms.internal.play_billing.f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.f7474b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7474b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f45448b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f45448b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7474b, j3);
                p3Var = (p3) o3Var2.a();
            }
            h0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f45448b, ((g2.o) this.f45449c).createDataSource());
    }

    @Override
    public void d(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void d0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f45448b);
            t10.c();
            x3.p((x3) t10.f7474b, l3Var);
            ((p) this.f45449c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void e(ii.w3 w3Var, View view) {
        r rVar = (r) this.f45449c;
        s80 s80Var = new s80(rVar, (c6) this.f45448b, view, false, false, true);
        s80Var.Q = true;
        m2 m2Var = rVar.f30570b.f24338f0;
        rVar.getContext();
        rVar.H = k4.b(s80Var, m2Var, w3Var, true);
    }

    public void e0(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f45448b);
            t10.c();
            x3.r((x3) t10.f7474b, a4Var);
            ((p) this.f45449c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public boolean f(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.f(float):boolean");
    }

    @Override
    public void f0(byte[] r19, int r20, int r21, z3.l r22, e2.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.f0(byte[], int, int, z3.l, e2.h):void");
    }

    public void g0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f45448b);
            t10.c();
            x3.s((x3) t10.f7474b, b4Var);
            ((p) this.f45449c).i((x3) t10.a());
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
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f7474b, g3Var);
            ((p) this.f45449c).i((x3) t10.a());
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
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f7474b, i3Var);
            ((p) this.f45449c).i((x3) t10.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void k(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void l(e6 e6Var, String str) {
        r rVar = (r) this.f45449c;
        if (rVar.v == null) {
            c6 c6Var = (c6) this.f45448b;
            rVar.v = new r3(new ah.b(16, this, c6Var), c6Var);
        }
        rVar.v.f(e6Var, str);
    }

    @Override
    public void m(int i10) {
        r.R((r) this.f45449c, 74, i10);
    }

    @Override
    public void n() {
        int i10;
        r rVar = (r) this.f45449c;
        ii.x3 x3Var = rVar.f12645r;
        c4 c4Var = rVar.f12646s;
        if (c4Var != null) {
            k3 k3Var = x3Var.f12818l3;
            if (k3Var != null && k3Var.x() && x3Var.D4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (c4Var.f12319a0 == 2) {
                c4Var.f12321b0 = i10;
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
        r rVar = (r) this.f45449c;
        c4 c4Var = rVar.f12646s;
        if (c4Var != null) {
            c4Var.setSendLoading(rVar.f12645r.n3());
        }
        rVar.Y(true);
        rVar.b0();
        ii.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p() {
        c4 c4Var = ((r) this.f45449c).f12646s;
        if (c4Var != null) {
            int i10 = c4Var.f12319a0;
            if (i10 == 2) {
                i10 = 0;
            }
            c4Var.f12321b0 = i10;
            c4Var.e(false, false);
            c4Var.f(2, true);
        }
    }

    @Override
    public void q(ii.a aVar) {
        r rVar = (r) this.f45449c;
        aj ajVar = rVar.f30570b;
        m2 m2Var = ajVar.f24338f0;
        if (m2Var != null && aVar != null && (aVar.f12232b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(m2Var)) {
            aj ajVar2 = new aj(rVar.getContext(), ajVar.f24338f0, false, false, false, null);
            ajVar2.f24329c2 = new ob.a(11);
            ajVar2.P = true;
            ajVar2.A1.setVisibility(8);
            ajVar2.f24393w2 = new r5(rVar, aVar, ajVar2, 10);
            ajVar2.t1();
            ajVar2.show();
        }
    }

    @Override
    public void r(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f45448b;
        if (nVar != null) {
            nVar.r(str, j3, j10, j11);
        }
    }

    @Override
    public void s(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((f3) this.f45448b).W(null);
    }

    @Override
    public void t(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        W(cVar);
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f45448b;
        Bundle bundle = (Bundle) this.f45449c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f14061a, j6.b.f14038b);
        }
        return task;
    }

    public String toString() {
        switch (this.f45447a) {
            case 10:
                try {
                    return P().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 25:
                return ((String) this.f45448b) + ", " + ((String) this.f45449c);
            default:
                return super.toString();
        }
    }

    @Override
    public void u(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void v() {
        r rVar = (r) this.f45449c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.f30570b.b2(rVar, 0);
        }
        rVar.d0();
        r.N(rVar);
    }

    @Override
    public void w(i1 i1Var, boolean z10) {
        ((r) this.f45449c).f30570b.w1(i1Var, z10);
    }

    @Override
    public z3.d x(int i10, int i11, byte[] bArr) {
        return sc.v.a(this, bArr, i11);
    }

    @Override
    public void y(int i10) {
        r rVar = (r) this.f45449c;
        rVar.f30570b.b2(rVar, i10);
        rVar.d0();
        r.N(rVar);
    }

    @Override
    public void z(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public b(int i10, Object obj, boolean z10) {
        this.f45447a = i10;
        this.f45448b = obj;
    }

    public b(int i10, boolean z10) {
        this.f45447a = i10;
    }

    public b(Object obj, int i10) {
        this.f45447a = i10;
        this.f45448b = obj;
        this.f45449c = null;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f45447a = i10;
        this.f45448b = obj;
        this.f45449c = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f45447a = 8;
        p pVar = new p(1);
        try {
            t.b(context);
            pVar.f3504c = t.a().c(j5.a.f14019e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new rb.a(5, false));
        } catch (Throwable unused) {
            pVar.f3503b = true;
        }
        this.f45449c = pVar;
        this.f45448b = p3Var;
    }

    public b(m6.a aVar) {
        this.f45447a = 14;
        this.f45448b = aVar == null ? null : aVar.f16017b;
    }

    public b(int i10) {
        this.f45447a = i10;
        switch (i10) {
            case 12:
                this.f45448b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f45449c = new ReferenceQueue();
                return;
            case 19:
                this.f45448b = new v();
                this.f45449c = new i4.a();
                return;
            case 29:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f45448b = byteArrayOutputStream;
                this.f45449c = new DataOutputStream(byteArrayOutputStream);
                return;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                c80 c80Var = new c80(25);
                c10.getClass();
                n6.m.e("Must be called from the main thread.");
                d6.g gVar = c10.f8155c;
                gVar.getClass();
                try {
                    y yVar = gVar.f8190a;
                    j jVar = new j(c80Var);
                    Parcel N0 = yVar.N0();
                    com.google.android.gms.internal.cast.v.d(N0, jVar);
                    yVar.R0(N0, 4);
                } catch (RemoteException e7) {
                    d6.g.f8189c.a(e7, "Unable to call %s on %s.", "addCastStateListener", y.class.getSimpleName());
                }
                this.f45448b = new f3(20, false);
                d6.g b10 = c10.b();
                this.f45449c = b10;
                b10.a(this);
                W(b10.c());
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
        this.f45447a = i10;
        switch (i10) {
            case 24:
                this.f45448b = context == null ? null : context.getApplicationContext();
                return;
            default:
                g2.o oVar = new g2.o();
                this.f45448b = context.getApplicationContext();
                this.f45449c = oVar;
                return;
        }
    }

    public b(q qVar, SparseArray sparseArray) {
        this.f45447a = 21;
        this.f45448b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.f3530a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f45449c = sparseArray2;
    }

    public b(Handler handler, l0 l0Var) {
        this.f45447a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f45448b = handler;
        this.f45449c = l0Var;
    }

    public b(Animator animator) {
        this.f45447a = 4;
        this.f45448b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f45449c = animatorSet;
        animatorSet.play(animator);
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f45447a = 18;
        int size = arrayList.size();
        this.f45448b = new int[size];
        this.f45449c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f45448b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f45449c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override
    public void c(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public b(int i10, int i11) {
        this.f45447a = 18;
        this.f45448b = new int[]{i10, i11};
        this.f45449c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.f45447a = 18;
        this.f45448b = new int[]{i10, i11, i12};
        this.f45449c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(d0 d0Var) {
        this.f45447a = 22;
        this.f45449c = d0Var;
        this.f45448b = new a4.g(new byte[4], 4);
    }
}
