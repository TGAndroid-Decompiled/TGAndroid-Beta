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
import org.telegram.ui.web.e0;
import q5.a0;
import q5.f0;
public final class h implements q5.f {
    public static final u5.b f47044k = new u5.b("RemoteMediaClient", null);
    public final Object f47045a;
    public final a7.e f47046b;
    public final u5.n f47047c;
    public final m d;
    public final c f47048e;
    public f0 f47049f;
    public TaskCompletionSource f47050g;
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f47051i = new CopyOnWriteArrayList();
    public final ConcurrentHashMap f47052j;

    static {
        String str = u5.n.v;
    }

    public h(u5.n nVar) {
        new ConcurrentHashMap();
        this.f47052j = new ConcurrentHashMap();
        this.f47045a = new Object();
        this.f47046b = new a7.e(Looper.getMainLooper(), 2);
        m mVar = new m(this);
        this.d = mVar;
        this.f47047c = nVar;
        nVar.h = new e0(this, 10);
        nVar.f48387c = mVar;
        this.f47048e = new c(this);
    }

    public static u t() {
        u uVar = new u(null, 1);
        uVar.a(new n(new Status(17, null, null, null), 0));
        return uVar;
    }

    public static final void x(o oVar) {
        try {
            oVar.p();
        } catch (IllegalArgumentException e6) {
            throw e6;
        } catch (Throwable unused) {
            oVar.a(new n(new Status(2100, null, null, null), 1));
        }
    }

    public final long a() {
        long o10;
        synchronized (this.f47045a) {
            b6.m.e("Must be called from the main thread.");
            o10 = this.f47047c.o();
        }
        return o10;
    }

    public final int b() {
        int i10;
        synchronized (this.f47045a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e6 = e();
                if (e6 != null) {
                    i10 = e6.f44607f;
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
        q5.q e6 = e();
        if (e6 == null) {
            return null;
        }
        Integer num = (Integer) e6.K.get(e6.f44611w);
        if (num == null) {
            return null;
        }
        return (q5.o) e6.D.get(num.intValue());
    }

    public final MediaInfo d() {
        MediaInfo mediaInfo;
        synchronized (this.f47045a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f47047c.f48363f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f44603a;
            }
        }
        return mediaInfo;
    }

    public final q5.q e() {
        q5.q qVar;
        synchronized (this.f47045a) {
            b6.m.e("Must be called from the main thread.");
            qVar = this.f47047c.f48363f;
        }
        return qVar;
    }

    public final int f() {
        int i10;
        synchronized (this.f47045a) {
            try {
                b6.m.e("Must be called from the main thread.");
                q5.q e6 = e();
                if (e6 != null) {
                    i10 = e6.f44606e;
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
        synchronized (this.f47045a) {
            b6.m.e("Must be called from the main thread.");
            q5.q qVar = this.f47047c.f48363f;
            if (qVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = qVar.f44603a;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.f2614e;
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
            q5.q e6 = e();
            if ((e6 == null || e6.f44606e != 5) && !m() && !l() && !k()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean i() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.f44606e == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        b6.m.e("Must be called from the main thread.");
        MediaInfo d = d();
        if (d != null && d.f2612b == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.f44611w != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 == null) {
            return false;
        }
        if (e6.f44606e == 3) {
            return true;
        }
        if (!j() || b() != 2) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.f44606e == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        b6.m.e("Must be called from the main thread.");
        q5.q e6 = e();
        if (e6 != null && e6.E) {
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
            this.f47051i.add(gVar);
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
            if (k() && (c3 = c()) != null && c3.f44595a != null) {
                return 6;
            }
        }
        return 0;
    }

    public final void u() {
        f0 f0Var = this.f47049f;
        if (f0Var == null) {
            return;
        }
        b6.m.e("Must be called from the main thread.");
        String str = this.f47047c.f48386b;
        q5.e0 e0Var = (q5.e0) f0Var;
        u5.a.b(str);
        synchronized (e0Var.C) {
            e0Var.C.put(str, this);
        }
        v e6 = w.e();
        e6.f2824c = new a0(e0Var, str, this);
        e6.f2822a = 8413;
        e0Var.e(1, e6.e());
        b6.m.e("Must be called from the main thread.");
        if (!w()) {
            t();
        } else {
            x(new i(this, 0));
        }
    }

    public final void v(q5.e0 e0Var) {
        q5.f fVar;
        f0 f0Var = this.f47049f;
        if (f0Var != e0Var) {
            if (f0Var != null) {
                this.f47047c.n();
                this.f47048e.c();
                b6.m.e("Must be called from the main thread.");
                String str = this.f47047c.f48386b;
                q5.e0 e0Var2 = (q5.e0) f0Var;
                if (!TextUtils.isEmpty(str)) {
                    synchronized (e0Var2.C) {
                        fVar = (q5.f) e0Var2.C.remove(str);
                    }
                    v e6 = w.e();
                    e6.f2824c = new a0(e0Var2, fVar, str);
                    e6.f2822a = 8414;
                    e0Var2.e(1, e6.e());
                    this.d.f47062b = null;
                    this.f47046b.removeCallbacksAndMessages(null);
                } else {
                    throw new IllegalArgumentException("Channel namespace cannot be null or empty");
                }
            }
            this.f47049f = e0Var;
            if (e0Var != null) {
                this.d.f47062b = e0Var;
            }
        }
    }

    public final boolean w() {
        if (this.f47049f != null) {
            return true;
        }
        return false;
    }
}
