package p4;

import a8.ia;
import a8.ka;
import a8.q7;
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
import c8.s9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.df;
import org.telegram.messenger.re;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.s31;
import org.telegram.ui.xn;
public class d0 {
    public static final m1 B = new m1(1);
    public static final g9.u C = ka.a(new d3.q(5));
    public final Bundle A;
    public final Object f53213a = new Object();
    public final Uri f53214b;
    public final b0 f53215c;
    public final a0 d;
    public final pb.b f53216e;
    public final Context f53217f;
    public final c1 f53218g;
    public final m0 h;
    public final String f53219i;
    public final n1 f53220j;
    public final x f53221k;
    public final Handler f53222l;
    public final h2.d f53223m;
    public final y f53224n;
    public final Handler f53225o;
    public final boolean f53226p;
    public final boolean f53227q;
    public final h9.i0 f53228r;
    public e1 f53229s;
    public g1 f53230t;
    public df f53231u;
    public boolean v;
    public final long f53232w;
    public boolean f53233x;
    public final h9.i0 f53234y;
    public final h9.i0 f53235z;

    public d0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, pb.b bVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z9, boolean z10) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.f14112a + "]");
        this.f53221k = xVar;
        this.f53217f = context;
        this.f53219i = str2;
        this.f53234y = i0Var;
        this.f53235z = i0Var2;
        this.f53228r = i0Var3;
        this.f53216e = bVar;
        this.A = bundle2;
        this.f53223m = dVar;
        this.f53226p = z9;
        this.f53227q = z10;
        c1 c1Var2 = new c1(this);
        this.f53218g = c1Var2;
        this.f53225o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.f53222l = handler;
        this.f53229s = e1.H;
        this.f53215c = new b0(this, A0);
        this.d = new a0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f53214b = build;
        m0 m0Var = new m0(this, build, handler, bundle, z9, i0Var, i0Var2, t.f53456e, t.f53457f, bundle2);
        this.h = m0Var;
        this.f53220j = new n1(Process.myUid(), context.getPackageName(), c1Var2, bundle, ((q4.l) m0Var.f53382n.f53816b).f53800c.f53813b);
        g1 g1Var = new g1(c1Var);
        this.f53230t = g1Var;
        h2.m0.W(handler, new org.telegram.ui.web.s(10, this, g1Var));
        this.f53232w = 3000L;
        this.f53224n = new y(this, 2);
        h2.m0.W(handler, new y(this, 3));
    }

    public static void a(d0 d0Var) {
        synchronized (d0Var.f53213a) {
            try {
                if (d0Var.v) {
                    return;
                }
                l1 R0 = d0Var.f53230t.R0();
                if (!d0Var.f53215c.hasMessages(1)) {
                    l1 l1Var = d0Var.f53229s.f53259c;
                    e2.b1 b1Var = R0.f53367a;
                    int i7 = b1Var.f10184b;
                    e2.b1 b1Var2 = l1Var.f53367a;
                    if (i7 == b1Var2.f10184b && b1Var.f10186e == b1Var2.f10186e && b1Var.h == b1Var2.h && b1Var.f10189i == b1Var2.f10189i) {
                        ui.e eVar = d0Var.f53218g.f53196b;
                        h9.i0 w10 = eVar.w();
                        for (int i10 = 0; i10 < w10.size(); i10++) {
                            v vVar = (v) w10.get(i10);
                            eVar.A(vVar);
                            d0Var.c(vVar, new z(R0, eVar.G(vVar, 16), eVar.G(vVar, 17), vVar));
                        }
                        try {
                            d0Var.h.f53378j.b(0, R0, true, true, 0);
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
        if (vVar != null && Objects.equals(vVar.f53463a.f53818a.f53819a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z9, boolean z10) {
        e eVar;
        v e10 = this.f53221k.f53476a.e();
        if (e10 != null) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode == 85 || keyCode == 79) && z9) {
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
                h2.m0.W(this.f53222l, new xn(this, z10, e10, eVar, 15));
                return true;
            }
            if (this.f53230t.u()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            h2.m0.W(this.f53222l, new xn(this, z10, e10, eVar, 15));
            return true;
        }
        return false;
    }

    public final void c(v vVar, c0 c0Var) {
        int i7;
        c1 c1Var = this.f53218g;
        try {
            com.google.android.gms.common.api.internal.s C2 = c1Var.f53196b.C(vVar);
            if (C2 != null) {
                i7 = C2.e();
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
            c1Var.f53196b.T(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(c0 c0Var) {
        h9.i0 w10 = this.f53218g.f53196b.w();
        for (int i7 = 0; i7 < w10.size(); i7++) {
            c((v) w10.get(i7), c0Var);
        }
        try {
            c0Var.b(this.h.f53378j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 w10 = this.f53218g.f53196b.w();
        for (int i7 = 0; i7 < w10.size(); i7++) {
            v vVar = (v) w10.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.f53215c.a(false, false);
        d(new m3(y0Var, 7));
        try {
            re reVar = this.h.f53378j;
            e2.o oVar = this.f53229s.f53273s;
            reVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z9) {
        boolean z10;
        boolean z11;
        if (o()) {
            if (this.f53230t.p0(16) && this.f53230t.w() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f53230t.p0(31) && !this.f53230t.p0(20)) {
                z11 = false;
            } else {
                z11 = true;
            }
            v s5 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ia.p(!false);
            sparseBooleanArray.append(1, true);
            ia.p(!false);
            e2.y0 y0Var = new e2.y0(new e2.s(sparseBooleanArray));
            if (!z10 && z11) {
                this.f53216e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new m9.u(0, (Object) obj, new androidx.activity.n(this, s5, z9, y0Var)), new l2.g0(this, 2));
                return;
            }
            if (!z10) {
                h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            h2.m0.J(this.f53230t);
            if (z9) {
                p(s5);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f53218g.f53196b.D(vVar) && !this.h.f53376g.D(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f53463a.f53818a.f53819a, this.f53217f.getPackageName()) || vVar.f53464b == 0 || !new Bundle(vVar.f53466e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z9;
        synchronized (this.f53213a) {
            z9 = this.v;
        }
        return z9;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.f53216e.getClass();
        return pb.b.e1(list);
    }

    public final t m(v vVar) {
        h9.i0 q10;
        h9.i0 i0Var;
        boolean z9 = this.f53233x;
        h9.i0 i0Var2 = null;
        m0 m0Var = this.h;
        if (z9 && k(vVar)) {
            m0Var.getClass();
            j1 j1Var = t.f53456e;
            j1 j1Var2 = m0Var.f53391x;
            j1Var2.getClass();
            e2.y0 y0Var = m0Var.f53392y;
            y0Var.getClass();
            if (!m0Var.f53390w.isEmpty()) {
                h9.i0 i0Var3 = m0Var.f53390w;
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
            return new t(j1Var2, y0Var, i0Var2, i0Var);
        }
        this.f53216e.getClass();
        e2.y0 y0Var2 = t.f53457f;
        j1 j1Var3 = t.f53456e;
        t tVar = new t(j1Var3, y0Var2, null, null);
        if (i(vVar)) {
            boolean z10 = true;
            this.f53233x = true;
            x xVar = this.f53221k;
            h9.i0 i0Var6 = xVar.f53476a.f53235z;
            if (i0Var6.isEmpty()) {
                m0Var.v = xVar.f53476a.f53234y;
            } else {
                m0Var.f53390w = i0Var6;
                m0Var.o0();
            }
            d0 d0Var = m0Var.h;
            if (m0Var.f53392y.a(17) == y0Var2.a(17)) {
                z10 = false;
            }
            m0Var.f53391x = j1Var3;
            m0Var.f53392y = y0Var2;
            if (!m0Var.f53390w.isEmpty()) {
                m0Var.o0();
            }
            if (z10) {
                h2.m0.W(d0Var.f53222l, new h0(m0Var, d0Var.f53230t, 0));
                return tVar;
            }
            m0Var.p0(d0Var.f53230t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.f53216e.getClass();
        return s9.b(new m1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) q7.a(new m3(this, 6)).f5243b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f53216e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.f53216e.getClass();
        return h2.m0.g0(pb.b.e1(list), new m9.q() {
            @Override
            public final m9.y apply(Object obj) {
                return s9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.m0.f14112a + "] [" + e2.m0.b() + "]");
        synchronized (this.f53213a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                s31 s31Var = a0Var.f53175a;
                if (s31Var != null) {
                    a0Var.removeCallbacks(s31Var);
                    a0Var.f53175a = null;
                }
                this.f53222l.removeCallbacksAndMessages(null);
                try {
                    h2.m0.W(this.f53222l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                m0 m0Var = this.h;
                ComponentName componentName = m0Var.f53384p;
                d0 d0Var = m0Var.h;
                q4.q qVar = m0Var.f53382n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.f53816b).f53798a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d0Var.f53214b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.f53816b).f53798a.setMediaButtonReceiver(PendingIntent.getBroadcast(d0Var.f53217f, 0, intent, m0.f53375z));
                    }
                }
                androidx.mediarouter.app.f fVar = m0Var.f53383o;
                if (fVar != null) {
                    d0Var.f53217f.unregisterReceiver(fVar);
                }
                b bVar = m0Var.f53381m;
                if (bVar != null && !bVar.f53182f.getAndSet(true)) {
                    bVar.f53180c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.f53816b;
                MediaSession mediaSession = lVar.f53798a;
                lVar.f53802f.kill();
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
                lVar.f53799b.f53797a.clear();
                mediaSession.release();
                c1 c1Var = this.f53218g;
                Set<v> set = c1Var.f53197c;
                ui.e eVar = c1Var.f53196b;
                h9.i0 w10 = eVar.w();
                int size = w10.size();
                while (i10 < size) {
                    Object obj = w10.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    eVar.T(vVar);
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
                c1Var.f53195a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f53233x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f53222l;
        y yVar = this.f53224n;
        handler.removeCallbacks(yVar);
        if (this.f53227q) {
            long j3 = this.f53232w;
            if (j3 > 0) {
                if (this.f53230t.h() || this.f53230t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f53222l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
