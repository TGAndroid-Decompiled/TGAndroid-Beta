package p4;

import a8.bb;
import a8.la;
import a8.t7;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import c8.t9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.bf;
import org.telegram.messenger.pe;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.yn;
public class d0 {
    public static final o1 B = new o1(1);
    public static final g9.t C = bb.a(new d3.p(5));
    public final Bundle A;
    public final Object f55178a = new Object();
    public final Uri f55179b;
    public final b0 f55180c;
    public final a0 d;
    public final w7.s f55181e;
    public final Context f55182f;
    public final e1 f55183g;
    public final m0 h;
    public final String f55184i;
    public final p1 f55185j;
    public final x f55186k;
    public final Handler f55187l;
    public final h2.d f55188m;
    public final y f55189n;
    public final Handler f55190o;
    public final boolean f55191p;
    public final boolean f55192q;
    public final h9.i0 f55193r;
    public g1 f55194s;
    public i1 f55195t;
    public bf f55196u;
    public boolean v;
    public final long f55197w;
    public boolean f55198x;
    public final h9.i0 f55199y;
    public final h9.i0 f55200z;

    public d0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13786a + "]");
        this.f55186k = xVar;
        this.f55182f = context;
        this.f55184i = str2;
        this.f55199y = i0Var;
        this.f55200z = i0Var2;
        this.f55193r = i0Var3;
        this.f55181e = sVar;
        this.A = bundle2;
        this.f55188m = dVar;
        this.f55191p = z10;
        this.f55192q = z11;
        e1 e1Var = new e1(this);
        this.f55183g = e1Var;
        this.f55190o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.f55187l = handler;
        this.f55194s = g1.H;
        this.f55180c = new b0(this, A0);
        this.d = new a0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f55179b = build;
        m0 m0Var = new m0(this, build, handler, bundle, z10, i0Var, i0Var2, t.f55432e, t.f55433f, bundle2);
        this.h = m0Var;
        this.f55185j = new p1(Process.myUid(), context.getPackageName(), e1Var, bundle, ((q4.l) m0Var.f55332n.f55826b).f55810c.f55823b);
        i1 i1Var = new i1(c1Var);
        this.f55195t = i1Var;
        h2.l0.W(handler, new c5(27, this, i1Var));
        this.f55197w = 3000L;
        this.f55189n = new y(this, 2);
        h2.l0.W(handler, new y(this, 3));
    }

    public static void a(d0 d0Var) {
        synchronized (d0Var.f55178a) {
            try {
                if (d0Var.v) {
                    return;
                }
                n1 R0 = d0Var.f55195t.R0();
                if (!d0Var.f55180c.hasMessages(1)) {
                    n1 n1Var = d0Var.f55194s.f55240c;
                    e2.b1 b1Var = R0.f55363a;
                    int i7 = b1Var.f10338b;
                    e2.b1 b1Var2 = n1Var.f55363a;
                    if (i7 == b1Var2.f10338b && b1Var.f10340e == b1Var2.f10340e && b1Var.h == b1Var2.h && b1Var.f10343i == b1Var2.f10343i) {
                        ab.c0 c0Var = d0Var.f55183g.f55210b;
                        h9.i0 p10 = c0Var.p();
                        for (int i10 = 0; i10 < p10.size(); i10++) {
                            v vVar = (v) p10.get(i10);
                            c0Var.t(vVar);
                            d0Var.c(vVar, new z(R0, c0Var.C(vVar, 16), c0Var.C(vVar, 17), vVar));
                        }
                        try {
                            d0Var.h.f55328j.b(0, R0, true, true, 0);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                d0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(v vVar) {
        if (vVar != null && Objects.equals(vVar.f55442a.f55828a.f55829a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.f55186k.f55453a.e();
        if (e10 != null) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 85 || keyCode == 79) && z10) {
                keyCode = 87;
            }
            if (keyCode != 79) {
                if (keyCode != 126) {
                    if (keyCode != 127) {
                        if (keyCode != 272) {
                            if (keyCode != 273) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        eVar = new e(this, e10, 6);
                                        break;
                                    case 87:
                                        break;
                                    case 88:
                                        break;
                                    case 89:
                                        eVar = new e(this, e10, 5);
                                        break;
                                    case 90:
                                        eVar = new e(this, e10, 4);
                                        break;
                                    default:
                                        return false;
                                }
                            }
                            eVar = new e(this, e10, 3);
                        }
                        eVar = new e(this, e10, 2);
                    } else {
                        eVar = new e(this, e10, 1);
                    }
                } else {
                    eVar = new e(this, e10, 9);
                }
                h2.l0.W(this.f55187l, new yn(this, z11, e10, eVar, 15));
                return true;
            }
            if (this.f55195t.u()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            h2.l0.W(this.f55187l, new yn(this, z11, e10, eVar, 15));
            return true;
        }
        return false;
    }

    public final void c(v vVar, c0 c0Var) {
        int i7;
        e1 e1Var = this.f55183g;
        try {
            com.google.android.gms.common.api.internal.t v = e1Var.f55210b.v(vVar);
            if (v != null) {
                i7 = v.e();
            } else if (h(vVar)) {
                i7 = 0;
            } else {
                return;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                c0Var.b(uVar, i7);
            }
        } catch (DeadObjectException unused) {
            e1Var.f55210b.K(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(c0 c0Var) {
        h9.i0 p10 = this.f55183g.f55210b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            c((v) p10.get(i7), c0Var);
        }
        try {
            c0Var.b(this.h.f55328j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 p10 = this.f55183g.f55210b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            v vVar = (v) p10.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.f55180c.a(false, false);
        d(new org.telegram.ui.ActionBar.p(y0Var, 12));
        try {
            pe peVar = this.h.f55328j;
            e2.o oVar = this.f55194s.f55254s;
            peVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f55195t.p0(16) && this.f55195t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f55195t.p0(31) && !this.f55195t.p0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            v s5 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            la.p(!false);
            sparseBooleanArray.append(1, true);
            la.p(!false);
            e2.y0 y0Var = new e2.y0(new e2.s(sparseBooleanArray));
            if (!z11 && z12) {
                this.f55181e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new m9.u(0, (Object) obj, new androidx.activity.n(this, s5, z10, y0Var)), new l2.d0(this, 2));
                return;
            }
            if (!z11) {
                h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            h2.l0.J(this.f55195t);
            if (z10) {
                p(s5);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f55183g.f55210b.A(vVar) && !this.h.f55326g.A(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f55442a.f55828a.f55829a, this.f55182f.getPackageName()) || vVar.f55443b == 0 || !new Bundle(vVar.f55445e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f55178a) {
            z10 = this.v;
        }
        return z10;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.f55181e.getClass();
        return w7.s.s0(list);
    }

    public final t m(v vVar) {
        h9.i0 q10;
        h9.i0 i0Var;
        boolean z10 = this.f55198x;
        h9.i0 i0Var2 = null;
        m0 m0Var = this.h;
        if (z10 && k(vVar)) {
            m0Var.getClass();
            l1 l1Var = t.f55432e;
            l1 l1Var2 = m0Var.f55341x;
            l1Var2.getClass();
            e2.y0 y0Var = m0Var.f55342y;
            y0Var.getClass();
            if (!m0Var.f55340w.isEmpty()) {
                h9.i0 i0Var3 = m0Var.f55340w;
                if (i0Var3 == null) {
                    i0Var = null;
                } else {
                    i0Var = h9.i0.q(i0Var3);
                }
            } else {
                h9.i0 i0Var4 = m0Var.v;
                if (i0Var4 == null) {
                    q10 = null;
                } else {
                    q10 = h9.i0.q(i0Var4);
                }
                h9.i0 i0Var5 = q10;
                i0Var = null;
                i0Var2 = i0Var5;
            }
            return new t(l1Var2, y0Var, i0Var2, i0Var);
        }
        this.f55181e.getClass();
        e2.y0 y0Var2 = t.f55433f;
        l1 l1Var3 = t.f55432e;
        t tVar = new t(l1Var3, y0Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f55198x = true;
            x xVar = this.f55186k;
            h9.i0 i0Var6 = xVar.f55453a.f55200z;
            if (i0Var6.isEmpty()) {
                m0Var.v = xVar.f55453a.f55199y;
            } else {
                m0Var.f55340w = i0Var6;
                m0Var.o0();
            }
            d0 d0Var = m0Var.h;
            if (m0Var.f55342y.a(17) == y0Var2.a(17)) {
                z11 = false;
            }
            m0Var.f55341x = l1Var3;
            m0Var.f55342y = y0Var2;
            if (!m0Var.f55340w.isEmpty()) {
                m0Var.o0();
            }
            if (z11) {
                h2.l0.W(d0Var.f55187l, new h0(m0Var, d0Var.f55195t, 0));
                return tVar;
            }
            m0Var.p0(d0Var.f55195t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.f55181e.getClass();
        return t9.b(new o1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) t7.a(new org.telegram.ui.ActionBar.p(this, 11)).f4348b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f55181e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.f55181e.getClass();
        return h2.l0.g0(w7.s.s0(list), new m9.q() {
            @Override
            public final m9.y apply(Object obj) {
                return t9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13786a + "] [" + e2.m0.b() + "]");
        synchronized (this.f55178a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                sv0 sv0Var = a0Var.f55149a;
                if (sv0Var != null) {
                    a0Var.removeCallbacks(sv0Var);
                    a0Var.f55149a = null;
                }
                this.f55187l.removeCallbacksAndMessages(null);
                try {
                    h2.l0.W(this.f55187l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                m0 m0Var = this.h;
                ComponentName componentName = m0Var.f55334p;
                d0 d0Var = m0Var.h;
                q4.q qVar = m0Var.f55332n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.f55826b).f55808a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d0Var.f55179b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.f55826b).f55808a.setMediaButtonReceiver(PendingIntent.getBroadcast(d0Var.f55182f, 0, intent, m0.f55325z));
                    }
                }
                androidx.mediarouter.app.f fVar = m0Var.f55333o;
                if (fVar != null) {
                    d0Var.f55182f.unregisterReceiver(fVar);
                }
                b bVar = m0Var.f55331m;
                if (bVar != null && !bVar.f55156f.getAndSet(true)) {
                    bVar.f55154c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.f55826b;
                MediaSession mediaSession = lVar.f55808a;
                lVar.f55812f.kill();
                if (i7 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e11) {
                        h2.a.m("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e11);
                    }
                }
                mediaSession.setCallback(null);
                lVar.f55809b.f55807a.clear();
                mediaSession.release();
                e1 e1Var = this.f55183g;
                Set<v> set = e1Var.f55211c;
                ab.c0 c0Var = e1Var.f55210b;
                h9.i0 p10 = c0Var.p();
                int size = p10.size();
                while (i10 < size) {
                    Object obj = p10.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    c0Var.K(vVar);
                    u uVar = vVar.d;
                    if (uVar != null) {
                        uVar.g();
                    }
                }
                for (v vVar2 : set) {
                    u uVar2 = vVar2.d;
                    if (uVar2 != null) {
                        uVar2.g();
                    }
                }
                set.clear();
                e1Var.f55209a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f55198x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f55187l;
        y yVar = this.f55189n;
        handler.removeCallbacks(yVar);
        if (this.f55192q) {
            long j3 = this.f55197w;
            if (j3 > 0) {
                if (this.f55195t.h() || this.f55195t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f55187l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
