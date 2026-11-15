package p4;

import a8.ja;
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
import c8.r9;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.cf;
import org.telegram.messenger.qe;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.wn;
public class d0 {
    public static final m1 B = new m1(1);
    public static final g9.t C = la.a(new d3.p(5));
    public final Bundle A;
    public final Object f54618a = new Object();
    public final Uri f54619b;
    public final b0 f54620c;
    public final a0 d;
    public final w7.s f54621e;
    public final Context f54622f;
    public final c1 f54623g;
    public final m0 h;
    public final String f54624i;
    public final n1 f54625j;
    public final x f54626k;
    public final Handler f54627l;
    public final h2.d f54628m;
    public final y f54629n;
    public final Handler f54630o;
    public final boolean f54631p;
    public final boolean f54632q;
    public final h9.i0 f54633r;
    public e1 f54634s;
    public g1 f54635t;
    public cf f54636u;
    public boolean v;
    public final long f54637w;
    public boolean f54638x;
    public final h9.i0 f54639y;
    public final h9.i0 f54640z;

    public d0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13471a + "]");
        this.f54626k = xVar;
        this.f54622f = context;
        this.f54624i = str2;
        this.f54639y = i0Var;
        this.f54640z = i0Var2;
        this.f54633r = i0Var3;
        this.f54621e = sVar;
        this.A = bundle2;
        this.f54628m = dVar;
        this.f54631p = z10;
        this.f54632q = z11;
        c1 c1Var2 = new c1(this);
        this.f54623g = c1Var2;
        this.f54630o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.f54627l = handler;
        this.f54634s = e1.H;
        this.f54620c = new b0(this, A0);
        this.d = new a0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f54619b = build;
        m0 m0Var = new m0(this, build, handler, bundle, z10, i0Var, i0Var2, t.f54861e, t.f54862f, bundle2);
        this.h = m0Var;
        this.f54625j = new n1(Process.myUid(), context.getPackageName(), c1Var2, bundle, ((q4.l) m0Var.f54787n.f55252b).f55236c.f55249b);
        g1 g1Var = new g1(c1Var);
        this.f54635t = g1Var;
        h2.l0.W(handler, new org.telegram.ui.web.e1(5, this, g1Var));
        this.f54637w = 3000L;
        this.f54629n = new y(this, 2);
        h2.l0.W(handler, new y(this, 3));
    }

    public static void a(d0 d0Var) {
        synchronized (d0Var.f54618a) {
            try {
                if (d0Var.v) {
                    return;
                }
                l1 R0 = d0Var.f54635t.R0();
                if (!d0Var.f54620c.hasMessages(1)) {
                    l1 l1Var = d0Var.f54634s.f54664c;
                    e2.b1 b1Var = R0.f54772a;
                    int i7 = b1Var.f10020b;
                    e2.b1 b1Var2 = l1Var.f54772a;
                    if (i7 == b1Var2.f10020b && b1Var.f10022e == b1Var2.f10022e && b1Var.h == b1Var2.h && b1Var.f10025i == b1Var2.f10025i) {
                        ab.c0 c0Var = d0Var.f54623g.f54601b;
                        h9.i0 o4 = c0Var.o();
                        for (int i10 = 0; i10 < o4.size(); i10++) {
                            v vVar = (v) o4.get(i10);
                            c0Var.s(vVar);
                            d0Var.c(vVar, new z(R0, c0Var.z(vVar, 16), c0Var.z(vVar, 17), vVar));
                        }
                        try {
                            d0Var.h.f54783j.b(0, R0, true, true, 0);
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
        if (vVar != null && Objects.equals(vVar.f54868a.f55254a.f55255a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.f54626k.f54881a.e();
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
                h2.l0.W(this.f54627l, new wn(this, z11, e10, eVar, 15));
                return true;
            }
            if (this.f54635t.u()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            h2.l0.W(this.f54627l, new wn(this, z11, e10, eVar, 15));
            return true;
        }
        return false;
    }

    public final void c(v vVar, c0 c0Var) {
        int i7;
        c1 c1Var = this.f54623g;
        try {
            com.google.android.gms.common.api.internal.t u10 = c1Var.f54601b.u(vVar);
            if (u10 != null) {
                i7 = u10.e();
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
            c1Var.f54601b.H(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(c0 c0Var) {
        h9.i0 o4 = this.f54623g.f54601b.o();
        for (int i7 = 0; i7 < o4.size(); i7++) {
            c((v) o4.get(i7), c0Var);
        }
        try {
            c0Var.b(this.h.f54783j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 o4 = this.f54623g.f54601b.o();
        for (int i7 = 0; i7 < o4.size(); i7++) {
            v vVar = (v) o4.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.f54620c.a(false, false);
        d(new org.telegram.ui.ActionBar.z(y0Var, 11));
        try {
            qe qeVar = this.h.f54783j;
            e2.o oVar = this.f54634s.f54678s;
            qeVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f54635t.p0(16) && this.f54635t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f54635t.p0(31) && !this.f54635t.p0(20)) {
                z12 = false;
            } else {
                z12 = true;
            }
            v s5 = s(vVar);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ja.p(!false);
            sparseBooleanArray.append(1, true);
            ja.p(!false);
            e2.y0 y0Var = new e2.y0(new e2.s(sparseBooleanArray));
            if (!z11 && z12) {
                this.f54621e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new m9.u(0, (Object) obj, new androidx.activity.n(this, s5, z10, y0Var)), new l2.d0(this, 2));
                return;
            }
            if (!z11) {
                h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            h2.l0.J(this.f54635t);
            if (z10) {
                p(s5);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f54623g.f54601b.x(vVar) && !this.h.f54781g.x(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f54868a.f55254a.f55255a, this.f54622f.getPackageName()) || vVar.f54869b == 0 || !new Bundle(vVar.f54871e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f54618a) {
            z10 = this.v;
        }
        return z10;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.f54621e.getClass();
        return w7.s.s0(list);
    }

    public final t m(v vVar) {
        h9.i0 q10;
        h9.i0 i0Var;
        boolean z10 = this.f54638x;
        h9.i0 i0Var2 = null;
        m0 m0Var = this.h;
        if (z10 && k(vVar)) {
            m0Var.getClass();
            j1 j1Var = t.f54861e;
            j1 j1Var2 = m0Var.f54796x;
            j1Var2.getClass();
            e2.y0 y0Var = m0Var.f54797y;
            y0Var.getClass();
            if (!m0Var.f54795w.isEmpty()) {
                h9.i0 i0Var3 = m0Var.f54795w;
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
        this.f54621e.getClass();
        e2.y0 y0Var2 = t.f54862f;
        j1 j1Var3 = t.f54861e;
        t tVar = new t(j1Var3, y0Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f54638x = true;
            x xVar = this.f54626k;
            h9.i0 i0Var6 = xVar.f54881a.f54640z;
            if (i0Var6.isEmpty()) {
                m0Var.v = xVar.f54881a.f54639y;
            } else {
                m0Var.f54795w = i0Var6;
                m0Var.o0();
            }
            d0 d0Var = m0Var.h;
            if (m0Var.f54797y.a(17) == y0Var2.a(17)) {
                z11 = false;
            }
            m0Var.f54796x = j1Var3;
            m0Var.f54797y = y0Var2;
            if (!m0Var.f54795w.isEmpty()) {
                m0Var.o0();
            }
            if (z11) {
                h2.l0.W(d0Var.f54627l, new h0(m0Var, d0Var.f54635t, 0));
                return tVar;
            }
            m0Var.p0(d0Var.f54635t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.f54621e.getClass();
        return r9.b(new m1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) t7.a(new org.telegram.ui.ActionBar.z(this, 10)).f4067b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f54621e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.f54621e.getClass();
        return h2.l0.g0(w7.s.s0(list), new m9.q() {
            @Override
            public final m9.y apply(Object obj) {
                return r9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13471a + "] [" + e2.m0.b() + "]");
        synchronized (this.f54618a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                lv0 lv0Var = a0Var.f54580a;
                if (lv0Var != null) {
                    a0Var.removeCallbacks(lv0Var);
                    a0Var.f54580a = null;
                }
                this.f54627l.removeCallbacksAndMessages(null);
                try {
                    h2.l0.W(this.f54627l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                m0 m0Var = this.h;
                ComponentName componentName = m0Var.f54789p;
                d0 d0Var = m0Var.h;
                q4.q qVar = m0Var.f54787n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.f55252b).f55234a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d0Var.f54619b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.f55252b).f55234a.setMediaButtonReceiver(PendingIntent.getBroadcast(d0Var.f54622f, 0, intent, m0.f54780z));
                    }
                }
                androidx.mediarouter.app.f fVar = m0Var.f54788o;
                if (fVar != null) {
                    d0Var.f54622f.unregisterReceiver(fVar);
                }
                b bVar = m0Var.f54786m;
                if (bVar != null && !bVar.f54587f.getAndSet(true)) {
                    bVar.f54585c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.f55252b;
                MediaSession mediaSession = lVar.f55234a;
                lVar.f55238f.kill();
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
                lVar.f55235b.f55233a.clear();
                mediaSession.release();
                c1 c1Var = this.f54623g;
                Set<v> set = c1Var.f54602c;
                ab.c0 c0Var = c1Var.f54601b;
                h9.i0 o4 = c0Var.o();
                int size = o4.size();
                while (i10 < size) {
                    Object obj = o4.get(i10);
                    i10++;
                    v vVar = (v) obj;
                    c0Var.H(vVar);
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
                c1Var.f54600a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f54638x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f54627l;
        y yVar = this.f54629n;
        handler.removeCallbacks(yVar);
        if (this.f54632q) {
            long j3 = this.f54637w;
            if (j3 > 0) {
                if (this.f54635t.h() || this.f54635t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f54627l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
