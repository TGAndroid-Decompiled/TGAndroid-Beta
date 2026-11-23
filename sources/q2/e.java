package q2;

import a8.ma;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.wb;
import e2.s0;
import h9.g0;
import h9.h2;
import h9.i0;
import h9.t0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.jn;
import p4.o0;
import p4.r0;
public final class e implements m {
    public final Set E;
    public int F;
    public q G;
    public b H;
    public b I;
    public Looper J;
    public Handler K;
    public byte[] L;
    public m2.i M;
    public volatile android.support.v4.media.session.q N;
    public final UUID f55752a;
    public final r0 f55753b;
    public final ab.q f55754c;
    public final HashMap d;
    public final boolean f55755e;
    public final int[] f55756f;
    public final boolean h;
    public final k8.a f55757n;
    public final qb.a f55758r;
    public final jn f55759s;
    public final long f55760w;
    public final ArrayList f55761x;
    public final Set f55762y;

    public e(UUID uuid, ab.q qVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, qb.a aVar) {
        uuid.getClass();
        ma.e("Use C.CLEARKEY_UUID instead", !e2.l.f10486c.equals(uuid));
        this.f55752a = uuid;
        this.f55753b = t.d;
        this.f55754c = qVar;
        this.d = hashMap;
        this.f55755e = z10;
        this.f55756f = iArr;
        this.h = z11;
        this.f55758r = aVar;
        this.f55757n = new k8.a(23);
        this.f55759s = new jn(this, 10);
        this.f55761x = new ArrayList();
        this.f55762y = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.f55760w = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f55739p == 1) {
            f g10 = bVar.g();
            g10.getClass();
            Throwable cause = g10.getCause();
            if ((cause instanceof ResourceBusyException) || wb.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList f(e2.r rVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(rVar.d);
        for (int i7 = 0; i7 < rVar.d; i7++) {
            e2.q qVar = rVar.f10676a[i7];
            if ((qVar.a(uuid) || (e2.l.d.equals(uuid) && qVar.a(e2.l.f10486c))) && (qVar.f10629e != null || z10)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    @Override
    public final int E1(e2.u uVar) {
        h(false);
        q qVar = this.G;
        qVar.getClass();
        int H = qVar.H();
        e2.r rVar = uVar.f10764w;
        if (rVar == null) {
            int h = s0.h(uVar.f10761s);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f55756f;
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
            UUID uuid = this.f55752a;
            if (f(rVar, uuid, true).isEmpty()) {
                if (rVar.d == 1 && rVar.f10676a[0].a(e2.l.f10486c)) {
                    h2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = rVar.f10678c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return H;
    }

    @Override
    public final l M(j jVar, e2.u uVar) {
        boolean z10;
        if (this.F > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.p(z10);
        this.J.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new o0(2, dVar, uVar));
        return dVar;
    }

    @Override
    public final void a() {
        q sVar;
        h(true);
        int i7 = this.F;
        this.F = i7 + 1;
        if (i7 == 0) {
            if (this.G == null) {
                UUID uuid = this.f55752a;
                this.f55753b.getClass();
                try {
                    try {
                        sVar = new t(uuid);
                    } catch (x unused) {
                        h2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        sVar = new w7.s(21);
                    }
                    this.G = sVar;
                    sVar.a(new c5(this));
                } catch (UnsupportedSchemeException e10) {
                    throw new Exception(e10);
                } catch (Exception e11) {
                    throw new Exception(e11);
                }
            } else if (this.f55760w != -9223372036854775807L) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f55761x;
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

    public final g b(Looper looper, j jVar, e2.u uVar, boolean z10) {
        ArrayList arrayList;
        if (this.N == null) {
            this.N = new android.support.v4.media.session.q(this, looper, 9);
        }
        e2.r rVar = uVar.f10764w;
        int i7 = 0;
        b bVar = null;
        if (rVar == null) {
            int h = s0.h(uVar.f10761s);
            q qVar = this.G;
            qVar.getClass();
            if (qVar.H() != 2 || !r.f55778c) {
                int[] iArr = this.f55756f;
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
                if (i7 != -1 && qVar.H() != 1) {
                    b bVar2 = this.H;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f13998b;
                        b e10 = e(t1.f14066e, true, null, z10);
                        this.f55761x.add(e10);
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
            arrayList = f(rVar, this.f55752a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f55752a);
                h2.a.d("DefaultDrmSessionMgr", "DRM error", exc);
                if (jVar != null) {
                    jVar.d(exc);
                }
                return new n(new f(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f55755e) {
            bVar = this.I;
        } else {
            ArrayList arrayList2 = this.f55761x;
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f55726a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e11 = e(arrayList, false, jVar, z10);
            if (!this.f55755e) {
                this.I = e11;
            }
            this.f55761x.add(e11);
            return e11;
        }
        bVar.b(jVar);
        return bVar;
    }

    public final b d(List list, boolean z10, j jVar) {
        this.G.getClass();
        q qVar = this.G;
        byte[] bArr = this.L;
        Looper looper = this.J;
        looper.getClass();
        m2.i iVar = this.M;
        iVar.getClass();
        b bVar = new b(this.f55752a, qVar, this.f55757n, this.f55759s, list, this.h | z10, z10, bArr, this.d, this.f55754c, looper, this.f55758r, iVar);
        bVar.b(jVar);
        if (this.f55760w != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j3 = this.f55760w;
        Set set = this.E;
        if (c10 && !set.isEmpty()) {
            h2 it = t0.q(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(null);
            }
            d.c(jVar);
            if (j3 != -9223372036854775807L) {
                d.c(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.f55762y;
            if (!set2.isEmpty()) {
                h2 it2 = t0.q(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    h2 it3 = t0.q(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).c(null);
                    }
                }
                d.c(jVar);
                if (j3 != -9223372036854775807L) {
                    d.c(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.G != null && this.F == 0 && this.f55761x.isEmpty() && this.f55762y.isEmpty()) {
            q qVar = this.G;
            qVar.getClass();
            qVar.release();
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
    public final g r(j jVar, e2.u uVar) {
        boolean z10 = false;
        h(false);
        if (this.F > 0) {
            z10 = true;
        }
        ma.p(z10);
        this.J.getClass();
        return b(this.J, jVar, uVar, true);
    }

    @Override
    public final void r1(Looper looper, m2.i iVar) {
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
                    ma.p(z10);
                    this.K.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.M = iVar;
    }

    @Override
    public final void release() {
        h(true);
        int i7 = this.F - 1;
        this.F = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f55760w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f55761x);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((b) arrayList.get(i10)).c(null);
            }
        }
        h2 it = t0.q(this.f55762y).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
