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
import org.telegram.messenger.cf;
import org.telegram.messenger.qe;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.yn;
public class e0 {
    public static final o1 B = new o1(1);
    public static final g9.t C = bb.a(new d3.p(5));
    public final Bundle A;
    public final Object f55232a = new Object();
    public final Uri f55233b;
    public final c0 f55234c;
    public final b0 d;
    public final w7.s f55235e;
    public final Context f55236f;
    public final e1 f55237g;
    public final n0 h;
    public final String f55238i;
    public final p1 f55239j;
    public final x f55240k;
    public final Handler f55241l;
    public final h2.d f55242m;
    public final y f55243n;
    public final Handler f55244o;
    public final boolean f55245p;
    public final boolean f55246q;
    public final h9.i0 f55247r;
    public g1 f55248s;
    public i1 f55249t;
    public cf f55250u;
    public boolean v;
    public final long f55251w;
    public boolean f55252x;
    public final h9.i0 f55253y;
    public final h9.i0 f55254z;

    public e0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13815a + "]");
        this.f55240k = xVar;
        this.f55236f = context;
        this.f55238i = str2;
        this.f55253y = i0Var;
        this.f55254z = i0Var2;
        this.f55247r = i0Var3;
        this.f55235e = sVar;
        this.A = bundle2;
        this.f55242m = dVar;
        this.f55245p = z10;
        this.f55246q = z11;
        e1 e1Var = new e1(this);
        this.f55237g = e1Var;
        this.f55244o = new Handler(Looper.getMainLooper());
        Looper A0 = c1Var.A0();
        Handler handler = new Handler(A0);
        this.f55241l = handler;
        this.f55248s = g1.H;
        this.f55234c = new c0(this, A0);
        this.d = new b0(this, A0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f55233b = build;
        n0 n0Var = new n0(this, build, handler, bundle, z10, i0Var, i0Var2, t.f55477e, t.f55478f, bundle2);
        this.h = n0Var;
        this.f55239j = new p1(Process.myUid(), context.getPackageName(), e1Var, bundle, ((q4.l) n0Var.f55386n.f55871b).f55855c.f55868b);
        i1 i1Var = new i1(c1Var);
        this.f55249t = i1Var;
        h2.l0.W(handler, new u4(29, this, i1Var));
        this.f55251w = 3000L;
        this.f55243n = new y(this, 2);
        h2.l0.W(handler, new y(this, 3));
    }

    public static void a(e0 e0Var) {
        synchronized (e0Var.f55232a) {
            try {
                if (e0Var.v) {
                    return;
                }
                n1 R0 = e0Var.f55249t.R0();
                if (!e0Var.f55234c.hasMessages(1)) {
                    n1 n1Var = e0Var.f55248s.f55286c;
                    e2.b1 b1Var = R0.f55408a;
                    int i7 = b1Var.f10367b;
                    e2.b1 b1Var2 = n1Var.f55408a;
                    if (i7 == b1Var2.f10367b && b1Var.f10369e == b1Var2.f10369e && b1Var.h == b1Var2.h && b1Var.f10372i == b1Var2.f10372i) {
                        ab.c0 c0Var = e0Var.f55237g.f55256b;
                        h9.i0 p10 = c0Var.p();
                        for (int i10 = 0; i10 < p10.size(); i10++) {
                            v vVar = (v) p10.get(i10);
                            c0Var.t(vVar);
                            e0Var.c(vVar, new a0(R0, c0Var.C(vVar, 16), c0Var.C(vVar, 17), vVar));
                        }
                        try {
                            e0Var.h.f55382j.b(0, R0, true, true, 0);
                        } catch (RemoteException e10) {
                            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
                        }
                    }
                }
                e0Var.t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean k(v vVar) {
        if (vVar != null && Objects.equals(vVar.f55487a.f55873a.f55874a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.f55240k.f55498a.e();
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
                h2.l0.W(this.f55241l, new yn(this, z11, e10, eVar, 15));
                return true;
            }
            if (this.f55249t.u()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            h2.l0.W(this.f55241l, new yn(this, z11, e10, eVar, 15));
            return true;
        }
        return false;
    }

    public final void c(v vVar, d0 d0Var) {
        int i7;
        e1 e1Var = this.f55237g;
        try {
            com.google.android.gms.common.api.internal.t v = e1Var.f55256b.v(vVar);
            if (v != null) {
                i7 = v.e();
            } else if (h(vVar)) {
                i7 = 0;
            } else {
                return;
            }
            u uVar = vVar.d;
            if (uVar != null) {
                d0Var.b(uVar, i7);
            }
        } catch (DeadObjectException unused) {
            e1Var.f55256b.K(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(d0 d0Var) {
        h9.i0 p10 = this.f55237g.f55256b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            c((v) p10.get(i7), d0Var);
        }
        try {
            d0Var.b(this.h.f55382j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 p10 = this.f55237g.f55256b.p();
        for (int i7 = 0; i7 < p10.size(); i7++) {
            v vVar = (v) p10.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.f55234c.a(false, false);
        d(new org.telegram.tgnet.u(y0Var, 13));
        try {
            qe qeVar = this.h.f55382j;
            e2.o oVar = this.f55248s.f55300s;
            qeVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f55249t.p0(16) && this.f55249t.w() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f55249t.p0(31) && !this.f55249t.p0(20)) {
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
                this.f55235e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new m9.u(0, (Object) obj, new androidx.activity.n(this, s5, z10, y0Var)), new l2.d0(this, 2));
                return;
            }
            if (!z11) {
                h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            h2.l0.J(this.f55249t);
            if (z10) {
                p(s5);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f55237g.f55256b.A(vVar) && !this.h.f55380g.A(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f55487a.f55873a.f55874a, this.f55236f.getPackageName()) || vVar.f55488b == 0 || !new Bundle(vVar.f55490e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f55232a) {
            z10 = this.v;
        }
        return z10;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.f55235e.getClass();
        return w7.s.s0(list);
    }

    public final t m(v vVar) {
        h9.i0 q10;
        h9.i0 i0Var;
        boolean z10 = this.f55252x;
        h9.i0 i0Var2 = null;
        n0 n0Var = this.h;
        if (z10 && k(vVar)) {
            n0Var.getClass();
            l1 l1Var = t.f55477e;
            l1 l1Var2 = n0Var.f55395x;
            l1Var2.getClass();
            e2.y0 y0Var = n0Var.f55396y;
            y0Var.getClass();
            if (!n0Var.f55394w.isEmpty()) {
                h9.i0 i0Var3 = n0Var.f55394w;
                if (i0Var3 == null) {
                    i0Var = null;
                } else {
                    i0Var = h9.i0.q(i0Var3);
                }
            } else {
                h9.i0 i0Var4 = n0Var.v;
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
        this.f55235e.getClass();
        e2.y0 y0Var2 = t.f55478f;
        l1 l1Var3 = t.f55477e;
        t tVar = new t(l1Var3, y0Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f55252x = true;
            x xVar = this.f55240k;
            h9.i0 i0Var6 = xVar.f55498a.f55254z;
            if (i0Var6.isEmpty()) {
                n0Var.v = xVar.f55498a.f55253y;
            } else {
                n0Var.f55394w = i0Var6;
                n0Var.o0();
            }
            e0 e0Var = n0Var.h;
            if (n0Var.f55396y.a(17) == y0Var2.a(17)) {
                z11 = false;
            }
            n0Var.f55395x = l1Var3;
            n0Var.f55396y = y0Var2;
            if (!n0Var.f55394w.isEmpty()) {
                n0Var.o0();
            }
            if (z11) {
                h2.l0.W(e0Var.f55241l, new i0(n0Var, e0Var.f55249t, 0));
                return tVar;
            }
            n0Var.p0(e0Var.f55249t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.f55235e.getClass();
        return t9.b(new o1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) t7.a(new org.telegram.tgnet.u(this, 12)).f4377b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f55235e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.f55235e.getClass();
        return h2.l0.g0(w7.s.s0(list), new m9.q() {
            @Override
            public final m9.y apply(Object obj) {
                return t9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13815a + "] [" + e2.m0.b() + "]");
        synchronized (this.f55232a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                b0 b0Var = this.d;
                es0 es0Var = b0Var.f55203a;
                if (es0Var != null) {
                    b0Var.removeCallbacks(es0Var);
                    b0Var.f55203a = null;
                }
                this.f55241l.removeCallbacksAndMessages(null);
                try {
                    h2.l0.W(this.f55241l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                n0 n0Var = this.h;
                ComponentName componentName = n0Var.f55388p;
                e0 e0Var = n0Var.h;
                q4.q qVar = n0Var.f55386n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.f55871b).f55853a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", e0Var.f55233b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.f55871b).f55853a.setMediaButtonReceiver(PendingIntent.getBroadcast(e0Var.f55236f, 0, intent, n0.f55379z));
                    }
                }
                androidx.mediarouter.app.f fVar = n0Var.f55387o;
                if (fVar != null) {
                    e0Var.f55236f.unregisterReceiver(fVar);
                }
                b bVar = n0Var.f55385m;
                if (bVar != null && !bVar.f55202f.getAndSet(true)) {
                    bVar.f55200c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.f55871b;
                MediaSession mediaSession = lVar.f55853a;
                lVar.f55857f.kill();
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
                lVar.f55854b.f55852a.clear();
                mediaSession.release();
                e1 e1Var = this.f55237g;
                Set<v> set = e1Var.f55257c;
                ab.c0 c0Var = e1Var.f55256b;
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
                e1Var.f55255a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f55252x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f55241l;
        y yVar = this.f55243n;
        handler.removeCallbacks(yVar);
        if (this.f55246q) {
            long j3 = this.f55251w;
            if (j3 > 0) {
                if (this.f55249t.h() || this.f55249t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f55241l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
