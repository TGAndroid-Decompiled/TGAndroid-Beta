package q2;

import a8.ja;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.sb;
import e2.s0;
import h9.g0;
import h9.g2;
import h9.i0;
import h9.s1;
import h9.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.cf;
import org.telegram.ui.web.e1;
import p4.q0;
public final class f implements n {
    public final Set E;
    public int F;
    public r G;
    public b H;
    public b I;
    public Looper J;
    public Handler K;
    public byte[] L;
    public m2.j M;
    public volatile android.support.v4.media.session.q N;
    public final UUID f55168a;
    public final q0 f55169b;
    public final ab.q f55170c;
    public final HashMap d;
    public final boolean f55171e;
    public final int[] f55172f;
    public final boolean h;
    public final k8.a f55173n;
    public final qb.a f55174r;
    public final ou f55175s;
    public final long f55176w;
    public final ArrayList f55177x;
    public final Set f55178y;

    public f(UUID uuid, ab.q qVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, qb.a aVar) {
        uuid.getClass();
        ja.e("Use C.CLEARKEY_UUID instead", !e2.l.f10176c.equals(uuid));
        this.f55168a = uuid;
        this.f55169b = u.d;
        this.f55170c = qVar;
        this.d = hashMap;
        this.f55171e = z10;
        this.f55172f = iArr;
        this.h = z11;
        this.f55174r = aVar;
        this.f55173n = new k8.a(23);
        this.f55175s = new ou(this, 16);
        this.f55177x = new ArrayList();
        this.f55178y = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.f55176w = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f55153p == 1) {
            g g10 = bVar.g();
            g10.getClass();
            Throwable cause = g10.getCause();
            if ((cause instanceof ResourceBusyException) || sb.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList f(e2.r rVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(rVar.d);
        for (int i7 = 0; i7 < rVar.d; i7++) {
            e2.q qVar = rVar.f10366a[i7];
            if ((qVar.a(uuid) || (e2.l.d.equals(uuid) && qVar.a(e2.l.f10176c))) && (qVar.f10319e != null || z10)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    @Override
    public final h A(k kVar, e2.u uVar) {
        boolean z10 = false;
        h(false);
        if (this.F > 0) {
            z10 = true;
        }
        ja.p(z10);
        this.J.getClass();
        return b(this.J, kVar, uVar, true);
    }

    @Override
    public final int E1(e2.u uVar) {
        h(false);
        r rVar = this.G;
        rVar.getClass();
        int M = rVar.M();
        e2.r rVar2 = uVar.f10454w;
        if (rVar2 == null) {
            int h = s0.h(uVar.f10451s);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f55172f;
                if (i7 < iArr.length) {
                    if (iArr[i7] == h) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 == -1) {
                return 0;
            }
        } else if (this.L == null) {
            UUID uuid = this.f55168a;
            if (f(rVar2, uuid, true).isEmpty()) {
                if (rVar2.d == 1 && rVar2.f10366a[0].a(e2.l.f10176c)) {
                    h2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = rVar2.f10368c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return M;
    }

    @Override
    public final m L(k kVar, e2.u uVar) {
        boolean z10;
        if (this.F > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.p(z10);
        this.J.getClass();
        e eVar = new e(this, kVar);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new e1(10, eVar, uVar));
        return eVar;
    }

    @Override
    public final void a() {
        r sVar;
        h(true);
        int i7 = this.F;
        this.F = i7 + 1;
        if (i7 == 0) {
            if (this.G == null) {
                UUID uuid = this.f55168a;
                this.f55169b.getClass();
                try {
                    try {
                        sVar = new u(uuid);
                    } catch (y unused) {
                        h2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        sVar = new w7.s(21);
                    }
                    this.G = sVar;
                    sVar.f(new cf(this));
                } catch (UnsupportedSchemeException e10) {
                    throw new Exception(e10);
                } catch (Exception e11) {
                    throw new Exception(e11);
                }
            } else if (this.f55176w != -9223372036854775807L) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f55177x;
                    if (i10 < arrayList.size()) {
                        ((b) arrayList.get(i10)).b(null);
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final h b(Looper looper, k kVar, e2.u uVar, boolean z10) {
        ArrayList arrayList;
        if (this.N == null) {
            this.N = new android.support.v4.media.session.q(this, looper, 9);
        }
        e2.r rVar = uVar.f10454w;
        int i7 = 0;
        b bVar = null;
        if (rVar == null) {
            int h = s0.h(uVar.f10451s);
            r rVar2 = this.G;
            rVar2.getClass();
            if (rVar2.M() != 2 || !s.f55194c) {
                int[] iArr = this.f55172f;
                while (true) {
                    if (i7 < iArr.length) {
                        if (iArr[i7] == h) {
                            break;
                        }
                        i7++;
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (i7 != -1 && rVar2.M() != 1) {
                    b bVar2 = this.H;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f13686b;
                        b e10 = e(s1.f13749e, true, null, z10);
                        this.f55177x.add(e10);
                        this.H = e10;
                    } else {
                        bVar2.b(null);
                    }
                    return this.H;
                }
            }
            return null;
        }
        if (this.L == null) {
            arrayList = f(rVar, this.f55168a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f55168a);
                h2.a.d("DefaultDrmSessionMgr", "DRM error", exc);
                if (kVar != null) {
                    kVar.d(exc);
                }
                return new o(new g(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f55171e) {
            bVar = this.I;
        } else {
            ArrayList arrayList2 = this.f55177x;
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f55140a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e11 = e(arrayList, false, kVar, z10);
            if (!this.f55171e) {
                this.I = e11;
            }
            this.f55177x.add(e11);
            return e11;
        }
        bVar.b(kVar);
        return bVar;
    }

    public final b d(List list, boolean z10, k kVar) {
        this.G.getClass();
        r rVar = this.G;
        byte[] bArr = this.L;
        Looper looper = this.J;
        looper.getClass();
        m2.j jVar = this.M;
        jVar.getClass();
        b bVar = new b(this.f55168a, rVar, this.f55173n, this.f55175s, list, this.h | z10, z10, bArr, this.d, this.f55170c, looper, this.f55174r, jVar);
        bVar.b(kVar);
        if (this.f55176w != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, k kVar, boolean z11) {
        b d = d(list, z10, kVar);
        boolean c10 = c(d);
        long j3 = this.f55176w;
        Set set = this.E;
        if (c10 && !set.isEmpty()) {
            g2 it = t0.q(set).iterator();
            while (it.hasNext()) {
                ((h) it.next()).c(null);
            }
            d.c(kVar);
            if (j3 != -9223372036854775807L) {
                d.c(null);
            }
            d = d(list, z10, kVar);
        }
        if (c(d) && z11) {
            Set set2 = this.f55178y;
            if (!set2.isEmpty()) {
                g2 it2 = t0.q(set2).iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    g2 it3 = t0.q(set).iterator();
                    while (it3.hasNext()) {
                        ((h) it3.next()).c(null);
                    }
                }
                d.c(kVar);
                if (j3 != -9223372036854775807L) {
                    d.c(null);
                }
                return d(list, z10, kVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.G != null && this.F == 0 && this.f55177x.isEmpty() && this.f55178y.isEmpty()) {
            r rVar = this.G;
            rVar.getClass();
            rVar.release();
            this.G = null;
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.J == null) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final void r1(Looper looper, m2.j jVar) {
        boolean z10;
        synchronized (this) {
            try {
                Looper looper2 = this.J;
                if (looper2 == null) {
                    this.J = looper;
                    this.K = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ja.p(z10);
                    this.K.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.M = jVar;
    }

    @Override
    public final void release() {
        h(true);
        int i7 = this.F - 1;
        this.F = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f55176w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f55177x);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((b) arrayList.get(i10)).c(null);
            }
        }
        g2 it = t0.q(this.f55178y).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
        g();
    }
}
