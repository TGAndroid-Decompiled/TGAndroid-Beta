package y5;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.r;
import androidx.biometric.u;
import androidx.biometric.w;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.TaskCompletionSource;
import dg.e1;
import dg.e2;
import eg.q2;
import g.q;
import hg.y1;
import i9.y;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import k1.d0;
import l.e0;
import l.x;
import l3.t;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ht0;
public final class h implements a0, androidx.activity.result.b, v0, q2, a3.b, com.google.android.gms.common.api.internal.o, x, s, t, l.j, k1.g, o0.a {
    public static h f50775c;
    public final int f50776a;
    public Object f50777b;

    public h(int i10, boolean z4) {
        this.f50776a = i10;
    }

    public static p h(Looper looper, Object obj, String str) {
        b6.m.i(obj, "Listener must not be null");
        b6.m.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    public static h m(Context context) {
        b6.m.h(context);
        synchronized (h.class) {
            try {
                if (f50775c == null) {
                    o.a(context);
                    f50775c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f50775c;
    }

    public static final l u(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean w(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: y5.h.w(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void B(a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f50777b;
        xVar.f2839o.lock();
        try {
            xVar.f2836l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f2839o.unlock();
        }
    }

    @Override
    public void H(float f10) {
        ht0 ht0Var = (ht0) this.f50777b;
        e1.e(ht0Var.M1).k(String.valueOf(dg.m.f4581a.indexOf(ht0Var.T0.getCurrentBrush())), f10);
        e2 e2Var = ht0Var.H1;
        e2Var.f4526c = f10;
        ht0Var.s0(e2Var, null);
    }

    @Override
    public void W(Object obj) {
        switch (this.f50776a) {
            case 2:
                r rVar = (r) this.f50777b;
                if (((Boolean) obj).booleanValue()) {
                    if (rVar.R()) {
                        rVar.W(rVar.q(2131689600));
                    }
                    androidx.biometric.a0 a0Var = rVar.f553i0;
                    if (!a0Var.f513n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = a0Var.d;
                        if (executor == null) {
                            executor = new androidx.biometric.p(1);
                        }
                        executor.execute(new androidx.biometric.h(rVar, 0));
                    }
                    androidx.biometric.a0 a0Var2 = rVar.f553i0;
                    if (a0Var2.f520u == null) {
                        a0Var2.f520u = new z();
                    }
                    androidx.biometric.a0.h(a0Var2.f520u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f50777b;
                if (tVar != null && pVar.f987o0) {
                    pVar.getClass();
                    throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    @Override
    public void a(long j10) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f50777b).B;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f50776a) {
            case 18:
                g6.f fVar = new g6.f(0, (TaskCompletionSource) obj2);
                g6.e eVar = (g6.e) ((g6.h) obj).u();
                Parcel G0 = eVar.G0();
                y6.a.d(G0, fVar);
                y6.a.c(G0, (g6.a) this.f50777b);
                eVar.H0(G0, 1);
                return;
            default:
                j8.j jVar = (j8.j) this.f50777b;
                s7.b bVar = (s7.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                s7.a aVar = new s7.a(0, (TaskCompletionSource) obj2);
                try {
                    s7.i iVar = (s7.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = s7.c.f47074a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    iVar.f47082a.transact(19, obtain, null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e6) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e6);
                    Bundle bundle = Bundle.EMPTY;
                    aVar.l0(Status.h, null);
                    return;
                }
        }
    }

    @Override
    public void c(l.l lVar, boolean z4) {
        switch (this.f50776a) {
            case 17:
                ((q) this.f50777b).g(lVar);
                return;
            default:
                if (lVar instanceof e0) {
                    ((e0) lVar).f11371z.k().c(false);
                }
                x xVar = ((m.h) this.f50777b).f13203e;
                if (xVar != null) {
                    xVar.c(lVar, z4);
                    return;
                }
                return;
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f50777b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public Object d(dd.p pVar, wc.c cVar) {
        return ((d0) this.f50777b).d(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public boolean d0(l.l lVar) {
        switch (this.f50776a) {
            case 17:
                Window.Callback callback = ((q) this.f50777b).f6771f.getCallback();
                if (callback != null) {
                    callback.onMenuOpened(108, lVar);
                    return true;
                }
                return true;
            default:
                m.h hVar = (m.h) this.f50777b;
                if (lVar == hVar.f13202c) {
                    return false;
                }
                ((e0) lVar).A.getClass();
                hVar.getClass();
                x xVar = hVar.f13203e;
                if (xVar == null) {
                    return false;
                }
                return xVar.d0(lVar);
        }
    }

    @Override
    public void e(int i10, long j10, long j11) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f50777b).B;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void f(Object obj) {
        com.google.android.gms.common.api.internal.n nVar;
        u7.c cVar = (u7.c) obj;
        androidx.activity.o oVar = ((f7.j) this.f50777b).f6132b;
        synchronized (oVar) {
            oVar.f355a = false;
            nVar = ((p) oVar.f356b).f2779c;
        }
        if (nVar != null) {
            ((f7.d) oVar.f357c).c(nVar, 2441);
        }
    }

    public void g(x5.k kVar, w wVar) {
        k0 k0Var = (k0) this.f50777b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f50777b;
            r rVar = (r) k0Var2.D("androidx.biometric.BiometricFragment");
            if (rVar == null) {
                rVar = new r();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, rVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            v k10 = rVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            androidx.biometric.a0 a0Var = rVar.f553i0;
            a0Var.f506f = kVar;
            int i10 = kVar.f50429a;
            if (i10 == 0) {
                if (wVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && i11 < 30 && i10 == 15 && wVar == null) {
                a0Var.f507g = h7.s.a();
            } else {
                a0Var.f507g = wVar;
            }
            if (rVar.Q()) {
                rVar.f553i0.f510k = rVar.q(2131689578);
            } else {
                rVar.f553i0.f510k = null;
            }
            if (rVar.Q() && new androidx.biometric.e(new u(k10, 0)).h(255) != 0) {
                rVar.f553i0.f513n = true;
                rVar.S();
            } else if (rVar.f553i0.f515p) {
                rVar.f552h0.postDelayed(new androidx.biometric.q(rVar), 600L);
            } else {
                rVar.X();
            }
        }
    }

    @Override
    public Object mo38get() {
        return new f3.j((Context) ((rc.a) this.f50777b).mo38get(), "com.google.android.datatransport.events", Integer.valueOf(f3.j.d).intValue());
    }

    @Override
    public od.b getData() {
        return ((d0) this.f50777b).f10274c;
    }

    @Override
    public void j(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f50777b;
        m.h hVar = toolbar.f480a.G;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.T.f12081c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).f902a.t();
        }
    }

    @Override
    public void k(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.f50777b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.f915a;
        int i10 = f0Var.f916b;
        androidx.fragment.app.s r10 = j0Var.f929c.r(str);
        if (r10 == null) {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
            return;
        }
        r10.x(i10, aVar.f367a, aVar.f368b);
    }

    @Override
    public void l(Exception exc) {
        h5.a.p("DecoderAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f50777b).B;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    public StringBuilder n() {
        pe.a aVar = (pe.a) this.f50777b;
        if (aVar instanceof ke.o) {
            StringBuilder sb = ((ke.o) aVar).f11179b.f11164b;
            if (sb.length() != 0) {
                return sb;
            }
            return null;
        }
        return null;
    }

    @Override
    public void o(int i10) {
        a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f50777b;
        Lock lock = xVar.f2839o;
        lock.lock();
        try {
            if (!xVar.f2838n && (aVar = xVar.f2837m) != null && aVar.f()) {
                xVar.f2838n = true;
                xVar.f2831e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f2838n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f50777b).B;
        Handler handler = (Handler) bVar.f6120b;
        if (handler != null) {
            handler.post(new kh.f(1, bVar, z4));
        }
    }

    @Override
    public void p() {
        ((com.google.android.exoplayer2.ext.ffmpeg.b) this.f50777b).T = true;
    }

    @Override
    public void q(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f50777b;
        xVar.f2839o.lock();
        try {
            Bundle bundle2 = xVar.f2835k;
            if (bundle2 == null) {
                xVar.f2835k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f2836l = a.f50757e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f2839o.unlock();
        }
    }

    @Override
    public Cursor r(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f50777b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e6) {
            Log.w("FontsProvider", "Unable to query the content provider", e6);
            return null;
        }
    }

    @Override
    public boolean s(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f50777b).getClass();
        return false;
    }

    public void t(e3.g gVar, Thread thread, Throwable th2) {
        i9.n nVar = (i9.n) this.f50777b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    y.a(nVar.f7968e.I(new i9.l(nVar, System.currentTimeMillis(), th2, thread, gVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e6) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e6);
            }
        }
    }

    public String toString() {
        switch (this.f50776a) {
            case 7:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f50777b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public void v() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f50777b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long z4 = z();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + z4);
    }

    public void x(long j10) {
        long z4 = z();
        if (z4 != j10) {
            if (z4 != -1) {
                if (z4 == -2) {
                    z4 = -2;
                } else {
                    return;
                }
            }
            StringBuilder s6 = android.support.v4.media.a.s(j10, "expected non-string scope or scope ", " but found ");
            s6.append(z4);
            throw new IOException(s6.toString());
        }
    }

    public long z() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f50777b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    public h(g6.g gVar, g6.a aVar) {
        this.f50776a = 18;
        this.f50777b = aVar;
    }

    public h(Object obj, int i10) {
        this.f50776a = i10;
        this.f50777b = obj;
    }

    public h(int i10) {
        this.f50776a = i10;
        switch (i10) {
            case 8:
                this.f50777b = Collections.newSetFromMap(new WeakHashMap());
                return;
            default:
                this.f50777b = new ArrayDeque(16);
                return;
        }
    }

    public h(Context context) {
        this.f50776a = 0;
        this.f50777b = context.getApplicationContext();
    }

    @Override
    public float get() {
        ht0 ht0Var = (ht0) this.f50777b;
        int i10 = ht0Var.M1;
        dg.m currentBrush = ht0Var.T0.getCurrentBrush();
        if (currentBrush == null) {
            return e1.e(i10).f4520i;
        }
        return e1.e(i10).f(String.valueOf(dg.m.f4581a.indexOf(currentBrush)), currentBrush.d());
    }

    public h(Context context, Uri uri) {
        this.f50776a = 27;
        this.f50777b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public h(LaunchActivity launchActivity, Executor executor, ee.b bVar) {
        this.f50776a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s6 = launchActivity.s();
            androidx.biometric.a0 a0Var = (androidx.biometric.a0) new androidx.biometric.e(launchActivity).m(androidx.biometric.a0.class);
            this.f50777b = s6;
            a0Var.d = executor;
            a0Var.f505e = bVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void b() {
    }

    @Override
    public void i() {
    }

    @Override
    public void y() {
    }
}
