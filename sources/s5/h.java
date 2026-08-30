package s5;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.qk0;
import q5.a0;
import q5.e0;
import q5.f0;
public final class h implements q5.f {
    public static final u5.b f44071k = new u5.b("RemoteMediaClient", null);
    public final Object f44072a;
    public final a7.e f44073b;
    public final u5.n f44074c;
    public final m d;
    public final c e;
    public f0 f44075f;
    public TaskCompletionSource f44076g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f44077i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f44078j;

    static {
        String str = u5.n.v;
    }

    public h(u5.n nVar) {
        new ConcurrentHashMap();
        this.f44078j = new ConcurrentHashMap();
        this.f44072a = new Object();
        this.f44073b = new a7.e(Looper.getMainLooper(), 2);
        m mVar = new m(this);
        this.d = mVar;
        this.f44074c = nVar;
        nVar.h = new qk0(this, 11);
        nVar.f45133c = mVar;
        this.e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new n(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f44072a) {
            b6.m.e("Must be called from the main thread.");
            o10 = this.f44074c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f44072a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e = e();
                if (e != null) {
                    i10 = e.f42849f;
                } else {
                    i10 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final q5.o c() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e == null) {
            return null;
        }
        Integer num = (Integer) e.K.get(e.f42853w);
        if (num == null) {
            return null;
        }
        return (q5.o) e.D.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f44072a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f44074c.f45110f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f42846a;
            }
        }
        return mediaInfo;
    }

    public final q5.q e() {
        q5.q qVar;
        synchronized (this.f44072a) {
            b6.m.e("Must be called from the main thread.");
            qVar = this.f44074c.f45110f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f44072a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e = e();
                if (e != null) {
                    i10 = e.e;
                } else {
                    i10 = 1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j10;
        synchronized (this.f44072a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f44074c.f45110f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f42846a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.e;
            } else {
                j10 = 0;
            }
        }
        return j10;
    }

    public final boolean h() {
        b6.m.e("Must be called from the main thread.");
        if (!i()) {
            b6.m.e("Must be called from the main thread.");
            q5.q e = e();
            if ((e == null || e.e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        b6.m.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f2687b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.f42853w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e == null) {
            return false;
        }
        if (e.e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        b6.m.e("Must be called from the main thread.");
        q5.q e = e();
        if (e != null && e.E) {
            return true;
        }
        return false;
    }

    public final void o(java.lang.String r47) {
        throw new UnsupportedOperationException("Method not decompiled: s5.h.o(java.lang.String):void");
    }

    public final void p(g gVar) {
        b6.m.e("Must be called from the main thread.");
        if (gVar != null) {
            this.f44077i.add(gVar);
        }
    }

    public final BasePendingResult q(q5.p pVar) {
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            return t();
        }
        j jVar = new j(this, pVar, 2);
        x(jVar);
        return jVar;
    }

    public final void r() {
        b6.m.e("Must be called from the main thread.");
        int f10 = f();
        if (f10 != 4 && f10 != 2) {
            b6.m.e("Must be called from the main thread.");
            if (!w()) {
                t();
                return;
            } else {
                x(new i(this, 6));
                return;
            }
        }
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 5));
        }
    }

    public final int s() {
        q5.o c3;
        if (d() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (c3 = c()) != null && c3.f42839a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f44075f;
        if (f0Var == null) {
            return;
        }
        b6.m.e("Must be called from the main thread.");
        String str = this.f44074c.f45132b;
        e0 e0Var = (e0) f0Var;
        u5.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v e = w.e();
        e.f2885c = new a0(e0Var, str, this);
        e.f2883a = 8413;
        e0Var.e(1, e.e());
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(e0 e0Var) {
        q5.f fVar;
        f0 f0Var = this.f44075f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f44074c.n();
                this.e.c();
                b6.m.e("Must be called from the main thread.");
                String str = this.f44074c.f45132b;
                e0 e0Var2 = (e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.C) {
                        fVar = (q5.f) e0Var2.C.remove(str);
                    }
                    v e = w.e();
                    e.f2885c = new a0(e0Var2, fVar, str);
                    e.f2883a = 8414;
                    e0Var2.e(1, e.e());
                    this.d.f44088b = null;
                    this.f44073b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f44075f = e0Var;
            if (e0Var != null) {
                this.d.f44088b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f44075f != null) {
            return true;
        }
        return false;
    }
}
