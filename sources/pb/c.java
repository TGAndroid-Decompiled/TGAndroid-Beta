package pb;

import a0.i;
import a6.l;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import bi.b8;
import bi.e8;
import bi.n0;
import c7.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.j;
import fb.n;
import fg.b2;
import fg.c2;
import g6.q;
import h7.d;
import h7.f;
import hi.g2;
import hi.k1;
import hi.k2;
import hi.l0;
import hi.p4;
import hi.r4;
import hi.v3;
import hi.z3;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import kg.e;
import l.x;
import m.e2;
import n7.k;
import n7.n1;
import n7.o1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.wi;
import org.telegram.ui.cj0;
import org.telegram.ui.iy;
public final class c implements a0, androidx.activity.result.b, s, e, q71, k0, v0, OnCompleteListener, f6.a, n, c2, x, wi, c5, l0, e2 {
    public final int f39875a;
    public Object f39876b;

    public c(int i10) {
        this.f39875a = i10;
    }

    @Override
    public void B(float f7) {
        ((n0) this.f39876b).f3223f.setRotation(f7);
    }

    @Override
    public i D() {
        return null;
    }

    @Override
    public s9 E() {
        p4 p4Var = ((r4) this.f39876b).G;
        if (p4Var != null) {
            return ((v3) p4Var).f9909a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        switch (this.f39875a) {
            case 23:
                ((hi.s) this.f39876b).I(i10, z10, i11, false, 0L);
                hi.s sVar = (hi.s) this.f39876b;
                cj0 cj0Var = sVar.O;
                if (cj0Var != null) {
                    cj0Var.i();
                    sVar.O = null;
                    return;
                }
                return;
            default:
                g2 g2Var = (g2) this.f39876b;
                g2Var.s0(i10, i11, z10);
                cj0 cj0Var2 = g2Var.O0;
                if (cj0Var2 != null) {
                    cj0Var2.i();
                    g2Var.O0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void J(CharSequence charSequence) {
        p4 p4Var = ((r4) this.f39876b).G;
        if (p4Var != null) {
            v3 v3Var = (v3) p4Var;
            v3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                v3Var.f9909a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public r9 M() {
        return (r4) this.f39876b;
    }

    @Override
    public hi.a O() {
        return ((r4) this.f39876b).f9464a;
    }

    @Override
    public i P() {
        return null;
    }

    @Override
    public boolean R() {
        r4 r4Var = (r4) this.f39876b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.f9464a;
            if (((v3) p4Var).f9909a.R4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean R1() {
        return false;
    }

    @Override
    public void U(int i10, int i11) {
        r4 r4Var = (r4) this.f39876b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.f9464a;
            k2 k2Var = ((v3) p4Var).f9909a.J3;
            if (k2Var != null) {
                k2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void a(int i10) {
        boolean z10;
        ao0 ao0Var = (ao0) this.f39876b;
        ao0Var.D0--;
        ao0Var.f8033e0 = i10;
        if (ao0Var.f8035f0 != i10) {
            ao0Var.f8049s.clear();
        }
        if (ao0Var.f8036g0 != i10) {
            ao0Var.I.clear();
        }
        ao0Var.N = true;
        iy iyVar = ao0Var.U;
        if (iyVar != null) {
            if (ao0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            iyVar.d(z10, true);
        }
        ao0Var.l();
        iy iyVar2 = ao0Var.U;
        if (iyVar2 != null) {
            iyVar2.c();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f39875a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                o1 o1Var = (o1) ((n1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(o1Var.f13986b);
                int i10 = k.f13967a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((v) this.f39876b).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    o1Var.f13985a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 20:
                q qVar = new q(0, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f39876b);
                iVar.T0(O0, 5);
                return;
            case 22:
                f fVar = new f(1, (TaskCompletionSource) obj2);
                g gVar = new g(new h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.f40544a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (GetCredentialRequest) this.f39876b);
                q7.a.b(obtain3, gVar);
                ((h7.b) ((d) ((h7.e) obj).u())).G0(obtain3, 1);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                Parcel K0 = iVar2.K0();
                int i12 = i7.f.f10502a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, (x5.e) this.f39876b);
                iVar2.L0(K0, 1);
                return;
        }
    }

    @Override
    public void b(k1 k1Var) {
        p4 p4Var = ((r4) this.f39876b).G;
        if (p4Var != null) {
            z3 z3Var = ((v3) p4Var).f9909a;
            z3.L1(z3Var, k1Var);
            z3Var.f10001h3.C(k1Var, true);
        }
    }

    @Override
    public void b0() {
        r4 r4Var = (r4) this.f39876b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.f9464a;
            z3 z3Var = ((v3) p4Var).f9909a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.f10001h3.onContentChanged();
        }
    }

    @Override
    public void c(l.l lVar, boolean z10) {
        ((g.s) this.f39876b).g(lVar);
    }

    @Override
    public boolean c0(int i10) {
        if (i10 == ((ao0) this.f39876b).f8032d0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean e() {
        n0 n0Var = (n0) this.f39876b;
        n0Var.d.invalidate();
        return n0Var.f3223f.j();
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public void f() {
        m0 m0Var = (m0) this.f39876b;
        m0Var.f4899a.lock();
        try {
            m0Var.f4907m = new g0(m0Var, m0Var.f4904j, m0Var.f4905k, m0Var.d, m0Var.f4906l, m0Var.f4899a, m0Var.f4901c);
            m0Var.f4907m.m();
            m0Var.f4900b.signalAll();
        } finally {
            m0Var.f4899a.unlock();
        }
    }

    @Override
    public void g() {
        r4 r4Var = (r4) this.f39876b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            z3.O1(((v3) p4Var).f9909a, r4Var.f9464a);
        }
    }

    @Override
    public void h(l.l lVar, MenuItem menuItem) {
        ((l.f) this.f39876b).f12610f.removeCallbacksAndMessages(lVar);
    }

    @Override
    public void i() {
        ((n0) this.f39876b).f3223f.o();
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        switch (this.f39875a) {
            case 3:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f39876b;
                f0 f0Var = (f0) j0Var.F.pollLast();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = f0Var.f1105a;
                int i10 = f0Var.f1106b;
                androidx.fragment.app.s l4 = j0Var.f1119c.l(str);
                if (l4 == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                l4.x(i10, aVar.f602a, aVar.f603b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f39876b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f603b;
                int i11 = aVar2.f602a;
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).f4308a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public void k0(ArrayList arrayList) {
        boolean z10;
        ao0 ao0Var = (ao0) this.f39876b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ao0Var.J.add(((b2) arrayList.get(i10)).f7959a);
        }
        iy iyVar = ao0Var.U;
        if (iyVar != null) {
            if (ao0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            iyVar.d(z10, false);
        }
        ao0Var.l();
    }

    @Override
    public void m() {
        m0 m0Var = (m0) this.f39876b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f4902f.values()) {
            cVar.disconnect();
        }
        m0Var.f4909o.F = Collections.EMPTY_SET;
    }

    @Override
    public void n(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f39876b;
        xVar.f4971o.lock();
        try {
            xVar.f4969m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f4971o.unlock();
        }
    }

    @Override
    public Object n2() {
        Type type = (Type) this.f39876b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void o(l.l lVar, l.n nVar) {
        l.f fVar = (l.f) this.f39876b;
        Handler handler = fVar.f12610f;
        l.e eVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f12611n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (lVar == ((l.e) arrayList.get(i10)).f12605b) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            eVar = (l.e) arrayList.get(i11);
        }
        handler.postAtTime(new p(this, eVar, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((j) this.f39876b).f6322c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e8 e8Var = (e8) this.f39876b;
        b8 b8Var = e8Var.L;
        AndroidUtilities.cancelRunOnUIThread(b8Var);
        t71 t71Var = e8Var.f2663y;
        if (t71Var != null && t71Var.y()) {
            AndroidUtilities.runOnUIThread(b8Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((e8) this.f39876b).i();
    }

    @Override
    public void p() {
        ((n0) this.f39876b).f3223f.f12495a.g(1, true);
    }

    @Override
    public void p0() {
        r4 r4Var = (r4) this.f39876b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            hi.a aVar = r4Var.f9464a;
            z3.N1(((v3) p4Var).f9909a);
        }
    }

    @Override
    public boolean q() {
        n0 n0Var = (n0) this.f39876b;
        bi.l0 l0Var = n0Var.f3223f;
        boolean m10 = l0Var.m(-90.0f);
        l0Var.i();
        n0Var.d.invalidate();
        return m10;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public void r0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.f39876b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.f753l0.d(null);
        }
    }

    @Override
    public void s(Bitmap bitmap) {
        ((f6.i) this.f39876b).e(bitmap, 3);
    }

    @Override
    public com.google.android.gms.common.api.internal.e t(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public boolean u(l.l lVar) {
        Window.Callback callback = ((g.s) this.f39876b).f8426f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override
    public void v(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f39876b;
        Lock lock = xVar.f4971o;
        lock.lock();
        try {
            if (xVar.f4970n) {
                xVar.f4970n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.f4970n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void w() {
        ((n0) this.f39876b).f3223f.k();
    }

    public da.a x(JSONObject jSONObject) {
        da.c bVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            bVar = new ob.a(7);
        } else {
            bVar = new qb.b(7);
        }
        return bVar.q2((na.d) this.f39876b, jSONObject);
    }

    @Override
    public void y0(jh jhVar) {
        NotificationCenter.getInstance(gg.n.a0((gg.n) this.f39876b)).doOnIdle(jhVar);
    }

    @Override
    public void z(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f39876b;
        xVar.f4971o.lock();
        try {
            xVar.f4969m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f4971o.unlock();
        }
    }

    public c(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.f39875a = i10;
        this.f39876b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(Object obj, int i10) {
        this.f39875a = i10;
        this.f39876b = obj;
    }

    public c(Set set) {
        this.f39875a = 0;
        this.f39876b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f39876b).put(a.class, bVar.f39874a);
        }
    }

    public c() {
        this.f39875a = 8;
        this.f39876b = new e2.v(10);
    }

    @Override
    public void K0() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void d(Bundle bundle) {
    }

    @Override
    public void i1(TLRPC.User user) {
    }

    @Override
    public void l(int i10) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
    }

    @Override
    public void k(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override
    public void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
