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
import org.telegram.messenger.bf;
import org.telegram.messenger.pe;
import org.telegram.ui.Components.as0;
import org.telegram.ui.web.t1;
import org.telegram.ui.xn;
public class d0 {
    public static final n1 B = new n1(1);
    public static final g9.t C = af.b.b(new d3.p(5));
    public final Bundle A;
    public final Object f55307a = new Object();
    public final Uri f55308b;
    public final b0 f55309c;
    public final a0 d;
    public final w7.s f55310e;
    public final Context f55311f;
    public final d1 f55312g;
    public final n0 h;
    public final String f55313i;
    public final o1 f55314j;
    public final x f55315k;
    public final Handler f55316l;
    public final h2.d f55317m;
    public final y f55318n;
    public final Handler f55319o;
    public final boolean f55320p;
    public final boolean f55321q;
    public final h9.i0 f55322r;
    public f1 f55323s;
    public h1 f55324t;
    public bf f55325u;
    public boolean v;
    public final long f55326w;
    public boolean f55327x;
    public final h9.i0 f55328y;
    public final h9.i0 f55329z;

    public d0(x xVar, Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        String str2 = str;
        h2.a.g("MediaSessionImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13778a + "]");
        this.f55315k = xVar;
        this.f55311f = context;
        this.f55313i = str2;
        this.f55328y = i0Var;
        this.f55329z = i0Var2;
        this.f55322r = i0Var3;
        this.f55310e = sVar;
        this.A = bundle2;
        this.f55317m = dVar;
        this.f55320p = z10;
        this.f55321q = z11;
        d1 d1Var = new d1(this);
        this.f55312g = d1Var;
        this.f55319o = new Handler(Looper.getMainLooper());
        Looper B0 = c1Var.B0();
        Handler handler = new Handler(B0);
        this.f55316l = handler;
        this.f55323s = f1.H;
        this.f55309c = new b0(this, B0);
        this.d = new a0(this, B0);
        Uri build = new Uri.Builder().scheme("androidx").authority("media3.session").appendPath(str2 == null ? "" : str2).build();
        this.f55308b = build;
        n0 n0Var = new n0(this, build, handler, bundle, z10, i0Var, i0Var2, t.f55558e, t.f55559f, bundle2);
        this.h = n0Var;
        this.f55314j = new o1(Process.myUid(), context.getPackageName(), d1Var, bundle, ((q4.l) n0Var.f55487n.f55949b).f55933c.f55946b);
        h1 h1Var = new h1(c1Var);
        this.f55324t = h1Var;
        h2.l0.W(handler, new t1(3, this, h1Var));
        this.f55326w = 3000L;
        this.f55318n = new y(this, 2);
        h2.l0.W(handler, new y(this, 3));
    }

    public static void a(d0 d0Var) {
        synchronized (d0Var.f55307a) {
            try {
                if (d0Var.v) {
                    return;
                }
                m1 R0 = d0Var.f55324t.R0();
                if (!d0Var.f55309c.hasMessages(1)) {
                    m1 m1Var = d0Var.f55323s.f55364c;
                    e2.b1 b1Var = R0.f55471a;
                    int i7 = b1Var.f10328b;
                    e2.b1 b1Var2 = m1Var.f55471a;
                    if (i7 == b1Var2.f10328b && b1Var.f10330e == b1Var2.f10330e && b1Var.h == b1Var2.h && b1Var.f10333i == b1Var2.f10333i) {
                        ab.c0 c0Var = d0Var.f55312g.f55331b;
                        h9.i0 s5 = c0Var.s();
                        for (int i10 = 0; i10 < s5.size(); i10++) {
                            v vVar = (v) s5.get(i10);
                            c0Var.w(vVar);
                            d0Var.c(vVar, new z(R0, c0Var.D(vVar, 16), c0Var.D(vVar, 17), vVar));
                        }
                        try {
                            d0Var.h.f55483j.b(0, R0, true, true, 0);
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
        if (vVar != null && Objects.equals(vVar.f55567a.f55951a.f55952a, "com.android.systemui")) {
            return true;
        }
        return false;
    }

    public final boolean b(KeyEvent keyEvent, boolean z10, boolean z11) {
        e eVar;
        v e10 = this.f55315k.f55579a.e();
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
                h2.l0.W(this.f55316l, new xn(this, z11, e10, eVar, 15));
                return true;
            }
            if (this.f55324t.v()) {
                eVar = new e(this, e10, 7);
            } else {
                eVar = new e(this, e10, 8);
            }
            h2.l0.W(this.f55316l, new xn(this, z11, e10, eVar, 15));
            return true;
        }
        return false;
    }

    public final void c(v vVar, c0 c0Var) {
        int i7;
        d1 d1Var = this.f55312g;
        try {
            com.google.android.gms.common.api.internal.t y10 = d1Var.f55331b.y(vVar);
            if (y10 != null) {
                i7 = y10.e();
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
            d1Var.f55331b.K(vVar);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionImpl", "Exception in " + vVar, e10);
        }
    }

    public final void d(c0 c0Var) {
        h9.i0 s5 = this.f55312g.f55331b.s();
        for (int i7 = 0; i7 < s5.size(); i7++) {
            c((v) s5.get(i7), c0Var);
        }
        try {
            c0Var.b(this.h.f55483j, 0);
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final v e() {
        h9.i0 s5 = this.f55312g.f55331b.s();
        for (int i7 = 0; i7 < s5.size(); i7++) {
            v vVar = (v) s5.get(i7);
            if (i(vVar)) {
                return vVar;
            }
        }
        return null;
    }

    public final void f(e2.y0 y0Var) {
        this.f55309c.a(false, false);
        d(new org.telegram.tgnet.g(y0Var, 15));
        try {
            pe peVar = this.h.f55483j;
            e2.o oVar = this.f55323s.f55378s;
            peVar.n();
        } catch (RemoteException e10) {
            h2.a.d("MediaSessionImpl", "Exception in using media1 API", e10);
        }
    }

    public final void g(v vVar, boolean z10) {
        boolean z11;
        boolean z12;
        if (o()) {
            if (this.f55324t.q0(16) && this.f55324t.x() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f55324t.q0(31) && !this.f55324t.q0(20)) {
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
                this.f55310e.getClass();
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                ?? obj = new Object();
                obj.n(unsupportedOperationException);
                obj.b(new m9.u(0, (Object) obj, new androidx.activity.n(this, s5, z10, y0Var)), new l2.e0(this, 2));
                return;
            }
            if (!z11) {
                h2.a.l("MediaSessionImpl", "Play requested without current MediaItem, but playback resumption prevented by missing available commands");
            }
            h2.l0.J(this.f55324t);
            if (z10) {
                p(s5);
            }
        }
    }

    public final boolean h(v vVar) {
        if (!this.f55312g.f55331b.B(vVar) && !this.h.f55481g.B(vVar)) {
            return false;
        }
        return true;
    }

    public final boolean i(v vVar) {
        if (!Objects.equals(vVar.f55567a.f55951a.f55952a, this.f55311f.getPackageName()) || vVar.f55568b == 0 || !new Bundle(vVar.f55570e).getBoolean("androidx.media3.session.MediaNotificationManager", false)) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f55307a) {
            z10 = this.v;
        }
        return z10;
    }

    public final m9.y l(v vVar, List list) {
        s(vVar);
        this.f55310e.getClass();
        return w7.s.g0(list);
    }

    public final t m(v vVar) {
        h9.i0 q10;
        h9.i0 i0Var;
        boolean z10 = this.f55327x;
        h9.i0 i0Var2 = null;
        n0 n0Var = this.h;
        if (z10 && k(vVar)) {
            n0Var.getClass();
            k1 k1Var = t.f55558e;
            k1 k1Var2 = n0Var.f55496x;
            k1Var2.getClass();
            e2.y0 y0Var = n0Var.f55497y;
            y0Var.getClass();
            if (!n0Var.f55495w.isEmpty()) {
                h9.i0 i0Var3 = n0Var.f55495w;
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
            return new t(k1Var2, y0Var, i0Var2, i0Var);
        }
        this.f55310e.getClass();
        e2.y0 y0Var2 = t.f55559f;
        k1 k1Var3 = t.f55558e;
        t tVar = new t(k1Var3, y0Var2, null, null);
        if (i(vVar)) {
            boolean z11 = true;
            this.f55327x = true;
            x xVar = this.f55315k;
            h9.i0 i0Var6 = xVar.f55579a.f55329z;
            if (i0Var6.isEmpty()) {
                n0Var.v = xVar.f55579a.f55328y;
            } else {
                n0Var.f55495w = i0Var6;
                n0Var.o0();
            }
            d0 d0Var = n0Var.h;
            if (n0Var.f55497y.a(17) == y0Var2.a(17)) {
                z11 = false;
            }
            n0Var.f55496x = k1Var3;
            n0Var.f55497y = y0Var2;
            if (!n0Var.f55495w.isEmpty()) {
                n0Var.o0();
            }
            if (z11) {
                h2.l0.W(d0Var.f55316l, new h0(n0Var, d0Var.f55324t, 0));
                return tVar;
            }
            n0Var.p0(d0Var.f55324t);
        }
        return tVar;
    }

    public final m9.w n(v vVar) {
        s(vVar);
        this.f55310e.getClass();
        return u9.b(new n1(-6));
    }

    public final boolean o() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return ((Boolean) u7.a(new org.telegram.tgnet.g(this, 14)).f4340b.get()).booleanValue();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        return true;
    }

    public final void p(v vVar) {
        s(vVar);
        this.f55310e.getClass();
    }

    public final m9.e0 q(v vVar, List list, final int i7, final long j3) {
        s(vVar);
        this.f55310e.getClass();
        return h2.l0.g0(w7.s.g0(list), new m9.q() {
            @Override
            public final m9.y apply(Object obj) {
                return u9.b(new w((List) obj, i7, j3));
            }
        });
    }

    public final void r() {
        h2.a.g("MediaSessionImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + h2.l0.f13778a + "] [" + e2.m0.b() + "]");
        synchronized (this.f55307a) {
            try {
                if (this.v) {
                    return;
                }
                this.v = true;
                a0 a0Var = this.d;
                as0 as0Var = a0Var.f55275a;
                if (as0Var != null) {
                    a0Var.removeCallbacks(as0Var);
                    a0Var.f55275a = null;
                }
                this.f55316l.removeCallbacksAndMessages(null);
                try {
                    h2.l0.W(this.f55316l, new y(this, 0));
                } catch (Exception e10) {
                    h2.a.m("MediaSessionImpl", "Exception thrown while closing", e10);
                }
                n0 n0Var = this.h;
                ComponentName componentName = n0Var.f55489p;
                d0 d0Var = n0Var.h;
                q4.q qVar = n0Var.f55487n;
                int i7 = Build.VERSION.SDK_INT;
                int i10 = 0;
                if (i7 < 31) {
                    if (componentName == null) {
                        ((q4.l) qVar.f55949b).f55931a.setMediaButtonReceiver(null);
                    } else {
                        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", d0Var.f55308b);
                        intent.setComponent(componentName);
                        ((q4.l) qVar.f55949b).f55931a.setMediaButtonReceiver(PendingIntent.getBroadcast(d0Var.f55311f, 0, intent, n0.f55480z));
                    }
                }
                androidx.mediarouter.app.f fVar = n0Var.f55488o;
                if (fVar != null) {
                    d0Var.f55311f.unregisterReceiver(fVar);
                }
                b bVar = n0Var.f55486m;
                if (bVar != null && !bVar.f55282f.getAndSet(true)) {
                    bVar.f55280c.execute(new a(bVar, 0));
                }
                q4.l lVar = (q4.l) qVar.f55949b;
                MediaSession mediaSession = lVar.f55931a;
                lVar.f55935f.kill();
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
                lVar.f55932b.f55930a.clear();
                mediaSession.release();
                d1 d1Var = this.f55312g;
                Set<v> set = d1Var.f55332c;
                ab.c0 c0Var = d1Var.f55331b;
                h9.i0 s5 = c0Var.s();
                int size = s5.size();
                while (i10 < size) {
                    Object obj = s5.get(i10);
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
                d1Var.f55330a.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v s(v vVar) {
        v e10;
        if (this.f55327x && k(vVar) && (e10 = e()) != null) {
            return e10;
        }
        return vVar;
    }

    public final void t() {
        Handler handler = this.f55316l;
        y yVar = this.f55318n;
        handler.removeCallbacks(yVar);
        if (this.f55321q) {
            long j3 = this.f55326w;
            if (j3 > 0) {
                if (this.f55324t.j() || this.f55324t.g()) {
                    handler.postDelayed(yVar, j3);
                }
            }
        }
    }

    public final void u() {
        if (Looper.myLooper() == this.f55316l.getLooper()) {
            return;
        }
        throw new IllegalStateException("Player callback method is called from a wrong thread. See javadoc of MediaSession for details.");
    }
}
