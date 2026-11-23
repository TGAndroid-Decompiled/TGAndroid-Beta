package p4;

import a8.ma;
import a8.u7;
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
import c8.u9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.cf;
import org.telegram.messenger.qe;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.xn;
public class d0 {
    public static final o1 B = new o1(1);
    public static final g9.t C = af.b.b(new d3.p(5));
    public final Bundle A;
    public final Object f55188a = new Object();
    public final Uri f55189b;
    public final b0 f55190c;
    public final a0 d;
    public final w7.s f55191e;
    public final Context f55192f;
    public final e1 f55193g;
    public final m0 h;
    public final String f55194i;
    public final p1 f55195j;
    public final x f55196k;
    public final Handler f55197l;
    public final h2.d f55198m;
    public final y f55199n;
    public final Handler f55200o;
    public final boolean f55201p;
    public final boolean f55202q;
    public final h9.i0 f55203r;
    public g1 f55204s;
    public i1 f55205t;
    public cf f55206u;
    public boolean v;
    public final long f55207w;
    public boolean f55208x;
    public final h9.i0 f55209y;
    public final h9.i0 f55210z;

    public d0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13778a + "]");
        this.f55196k = xVar;
        this.f55192f = context;
        this.f55194i = str2;
        this.f55209y = i0Var;
        this.f55210z = i0Var2;
        this.f55203r = i0Var3;
        this.f55191e = sVar;
        this.A = bundle2;
        this.f55198m = dVar;
        this.f55201p = z10;
        this.f55202q = z11;
        e1 e1Var = new e1(this);
        this.f55193g = e1Var;
        this.f55200o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.f55197l = handler;
        this.f55204s = g1.H;
        this.f55190c = new b0(this, A0);
        this.d = new a0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f55189b = build;
        m0 m0Var = new m0(this, build, handler, bundle, z10, i0Var, i0Var2, t.f55442e, t.f55443f, bundle2);
        this.h = m0Var;
        this.f55195j = new p1(Process.myUid(), context.getPackageName(), e1Var, bundle, ((q4.l) m0Var.f55342n.f55836b).f55820c.f55833b);
        i1 i1Var = new i1(c1Var);
        this.f55205t = i1Var;
        h2.l0.W(handler, new c5(27, this, i1Var));
        this.f55207w = 3000L;
        this.f55199n = new y(this, 2);
        h2.l0.W(handler, new y(this, 3));
    }

    public static void a(d0 d0Var) {
        synchronized (d0Var.f55188a) {
            try {
                if (d0Var.v) {
                    return;
                }
                n1 R0 = d0Var.f55205t.R0();
                if (!d0Var.f55190c.hasMessages(1)) {
                    n1 n1Var = d0Var.f55204s.f55250c;
                    e2.b1 b1Var = R0.f55373a;
                    int i7 = b1Var.f10330b;
                    e2.b1 b1Var2 = n1Var.f55373a;
                    if (i7 == b1Var2.f10330b && b1Var.f10332e == b1Var2.f10332e && b1Var.h == b1Var2.h && b1Var.f10335i == b1Var2.f10335i) {
                        ab.c0 c0Var = d0Var.f55193g.f55220b;
                        h9.i0 p10 = c0Var.p();
                        for (int i10 = 0; i10 < p10.size(); i10++) {
                            v vVar = (v) p10.get(i10);
                            c0Var.t(vVar);
                            d0Var.c(vVar, new z(R0, c0Var.C(vVar, 16), c0Var.C(vVar, 17), vVar));
                        }
                        try {
                            d0Var.h.f55338j.b(0, R0, true, true, 0);
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
        if (vVar != null && Objects.equals(vVar.f55452a.f55838a.f55839a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.f55196k.f55463a.e();
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
                h2.l0.W(this.f55197l, new xn(this, z11, e10, eVar, 15));
                return true;
            }
            if (this.f55205t.u()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            h2.l0.W(this.f55197l, new xn(this, z11, e10, eVar, 15));
            return true;
        }
        return false;
    }

    public final void c(v vVar, c0 c0Var) {
        int i7;
        e1 e1Var = this.f55193g;
        try {
            com.google.android.gms.common.api.internal.t v = e1Var.f55220b.v(vVar);
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
            e1Var.f55220b.K(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(c0 c0Var) {
        h9.i0 p10 = this.f55193g.f55220b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            c((v) p10.get(i7), c0Var);
        }
        try {
            c0Var.b(this.h.f55338j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 p10 = this.f55193g.f55220b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            v vVar = (v) p10.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.f55190c.a(false, false);
        d(new org.telegram.tgnet.v(y0Var, 13));
        try {
            qe qeVar = this.h.f55338j;
            e2.o oVar = this.f55204s.f55264s;
            qeVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f55205t.p0(16) && this.f55205t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f55205t.p0(31) && !this.f55205t.p0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            v s5 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ma.p(!false);
            sparseBooleanArray.append(1, true);
            ma.p(!false);
            e2.y0 y0Var = new e2.y0(new e2.s(sparseBooleanArray));
            if (!z11 && z12) {
                this.f55191e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new m9.u(0, (Object) obj, new androidx.activity.n(this, s5, z10, y0Var)), new l2.d0(this, 2));
                return;
            }
            if (!z11) {
                h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            h2.l0.J(this.f55205t);
            if (z10) {
                p(s5);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f55193g.f55220b.A(vVar) && !this.h.f55336g.A(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f55452a.f55838a.f55839a, this.f55192f.getPackageName()) || vVar.f55453b == 0 || !new Bundle(vVar.f55455e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f55188a) {
            z10 = this.v;
        }
        return z10;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.f55191e.getClass();
        return w7.s.s0(list);
    }

    public final t m(v vVar) {
        h9.i0 q10;
        h9.i0 i0Var;
        boolean z10 = this.f55208x;
        h9.i0 i0Var2 = null;
        m0 m0Var = this.h;
        if (z10 && k(vVar)) {
            m0Var.getClass();
            l1 l1Var = t.f55442e;
            l1 l1Var2 = m0Var.f55351x;
            l1Var2.getClass();
            e2.y0 y0Var = m0Var.f55352y;
            y0Var.getClass();
            if (!m0Var.f55350w.isEmpty()) {
                h9.i0 i0Var3 = m0Var.f55350w;
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
        this.f55191e.getClass();
        e2.y0 y0Var2 = t.f55443f;
        l1 l1Var3 = t.f55442e;
        t tVar = new t(l1Var3, y0Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f55208x = true;
            x xVar = this.f55196k;
            h9.i0 i0Var6 = xVar.f55463a.f55210z;
            if (i0Var6.isEmpty()) {
                m0Var.v = xVar.f55463a.f55209y;
            } else {
                m0Var.f55350w = i0Var6;
                m0Var.o0();
            }
            d0 d0Var = m0Var.h;
            if (m0Var.f55352y.a(17) == y0Var2.a(17)) {
                z11 = false;
            }
            m0Var.f55351x = l1Var3;
            m0Var.f55352y = y0Var2;
            if (!m0Var.f55350w.isEmpty()) {
                m0Var.o0();
            }
            if (z11) {
                h2.l0.W(d0Var.f55197l, new h0(m0Var, d0Var.f55205t, 0));
                return tVar;
            }
            m0Var.p0(d0Var.f55205t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.f55191e.getClass();
        return u9.b(new o1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) u7.a(new org.telegram.tgnet.v(this, 12)).f4340b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f55191e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.f55191e.getClass();
        return h2.l0.g0(w7.s.s0(list), new m9.q() {
            @Override
            public final m9.y apply(Object obj) {
                return u9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13778a + "] [" + e2.m0.b() + "]");
        synchronized (this.f55188a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                es0 es0Var = a0Var.f55159a;
                if (es0Var != null) {
                    a0Var.removeCallbacks(es0Var);
                    a0Var.f55159a = null;
                }
                this.f55197l.removeCallbacksAndMessages(null);
                try {
                    h2.l0.W(this.f55197l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                m0 m0Var = this.h;
                ComponentName componentName = m0Var.f55344p;
                d0 d0Var = m0Var.h;
                q4.q qVar = m0Var.f55342n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.f55836b).f55818a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d0Var.f55189b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.f55836b).f55818a.setMediaButtonReceiver(PendingIntent.getBroadcast(d0Var.f55192f, 0, intent, m0.f55335z));
                    }
                }
                androidx.mediarouter.app.f fVar = m0Var.f55343o;
                if (fVar != null) {
                    d0Var.f55192f.unregisterReceiver(fVar);
                }
                b bVar = m0Var.f55341m;
                if (bVar != null && !bVar.f55166f.getAndSet(true)) {
                    bVar.f55164c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.f55836b;
                MediaSession mediaSession = lVar.f55818a;
                lVar.f55822f.kill();
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
                lVar.f55819b.f55817a.clear();
                mediaSession.release();
                e1 e1Var = this.f55193g;
                Set<v> set = e1Var.f55221c;
                ab.c0 c0Var = e1Var.f55220b;
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
                e1Var.f55219a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f55208x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f55197l;
        y yVar = this.f55199n;
        handler.removeCallbacks(yVar);
        if (this.f55202q) {
            long j3 = this.f55207w;
            if (j3 > 0) {
                if (this.f55205t.h() || this.f55205t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f55197l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
