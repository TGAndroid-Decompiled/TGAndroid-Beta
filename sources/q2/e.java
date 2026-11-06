package q2;

import a8.ia;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.qb;
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
import m4.d0;
import org.telegram.ui.Components.uy;
import p4.r0;
public final class e implements m {
    public final Set D;
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public m2.j L;
    public volatile android.support.v4.media.session.q M;
    public final UUID f53627a;
    public final r0 f53628b;
    public final ab.q f53629c;
    public final HashMap d;
    public final boolean f53630e;
    public final int[] f53631f;
    public final boolean h;
    public final d0 f53632n;
    public final pb.b f53633r;
    public final uy f53634s;
    public final long f53635w;
    public final ArrayList f53636x;
    public final Set f53637y;

    public e(UUID uuid, ab.q qVar, HashMap hashMap, boolean z9, int[] iArr, boolean z10, pb.b bVar) {
        uuid.getClass();
        ia.e("Use C.CLEARKEY_UUID instead", !e2.l.f10340c.equals(uuid));
        this.f53627a = uuid;
        this.f53628b = t.d;
        this.f53629c = qVar;
        this.d = hashMap;
        this.f53630e = z9;
        this.f53631f = iArr;
        this.h = z10;
        this.f53633r = bVar;
        this.f53632n = new d0(19);
        this.f53634s = new uy(this, 9);
        this.f53636x = new ArrayList();
        this.f53637y = Collections.newSetFromMap(new IdentityHashMap());
        this.D = Collections.newSetFromMap(new IdentityHashMap());
        this.f53635w = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.f53614p == 1) {
            f g10 = bVar.g();
            g10.getClass();
            Throwable cause = g10.getCause();
            if ((cause instanceof ResourceBusyException) || qb.c(cause)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static ArrayList f(e2.r rVar, UUID uuid, boolean z9) {
        ArrayList arrayList = new ArrayList(rVar.d);
        for (int i7 = 0; i7 < rVar.d; i7++) {
            e2.q qVar = rVar.f10530a[i7];
            if ((qVar.a(uuid) || (e2.l.d.equals(uuid) && qVar.a(e2.l.f10340c))) && (qVar.f10483e != null || z9)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    @Override
    public final void E(Looper looper, m2.j jVar) {
        boolean z9;
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    if (looper2 == looper) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.p(z9);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = jVar;
    }

    @Override
    public final int F(e2.u uVar) {
        h(false);
        q qVar = this.F;
        qVar.getClass();
        int o02 = qVar.o0();
        e2.r rVar = uVar.f10618w;
        if (rVar == null) {
            int h = s0.h(uVar.f10615s);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f53631f;
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
        } else if (this.K == null) {
            UUID uuid = this.f53627a;
            if (f(rVar, uuid, true).isEmpty()) {
                if (rVar.d == 1 && rVar.f10530a[0].a(e2.l.f10340c)) {
                    h2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = rVar.f10532c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return o02;
    }

    @Override
    public final void a() {
        q bVar;
        h(true);
        int i7 = this.E;
        this.E = i7 + 1;
        if (i7 == 0) {
            if (this.F == null) {
                UUID uuid = this.f53627a;
                this.f53628b.getClass();
                try {
                    try {
                        bVar = new t(uuid);
                    } catch (x unused) {
                        h2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                        bVar = new pb.b(21);
                    }
                    this.F = bVar;
                    bVar.B(new org.telegram.ui.Components.n(this));
                } catch (UnsupportedSchemeException e10) {
                    throw new Exception(e10);
                } catch (Exception e11) {
                    throw new Exception(e11);
                }
            } else if (this.f53635w != -9223372036854775807L) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f53636x;
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

    public final g b(Looper looper, j jVar, e2.u uVar, boolean z9) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new android.support.v4.media.session.q(this, looper, 9);
        }
        e2.r rVar = uVar.f10618w;
        int i7 = 0;
        b bVar = null;
        if (rVar == null) {
            int h = s0.h(uVar.f10615s);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.o0() != 2 || !r.f53653c) {
                int[] iArr = this.f53631f;
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
                if (i7 != -1 && qVar.o0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.f14329b;
                        b e10 = e(t1.f14397e, true, null, z9);
                        this.f53636x.add(e10);
                        this.G = e10;
                    } else {
                        bVar2.b(null);
                    }
                    return this.G;
                }
            }
            return null;
        }
        if (this.K == null) {
            arrayList = f(rVar, this.f53627a, false);
            if (arrayList.isEmpty()) {
                Exception exc = new Exception("Media does not support uuid: " + this.f53627a);
                h2.a.d("DefaultDrmSessionMgr", "DRM error", exc);
                if (jVar != null) {
                    jVar.d(exc);
                }
                return new n(new f(6003, exc));
            }
        } else {
            arrayList = null;
        }
        if (!this.f53630e) {
            bVar = this.H;
        } else {
            ArrayList arrayList2 = this.f53636x;
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.f53601a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        }
        if (bVar == null) {
            b e11 = e(arrayList, false, jVar, z9);
            if (!this.f53630e) {
                this.H = e11;
            }
            this.f53636x.add(e11);
            return e11;
        }
        bVar.b(jVar);
        return bVar;
    }

    public final b d(List list, boolean z9, j jVar) {
        this.F.getClass();
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        m2.j jVar2 = this.L;
        jVar2.getClass();
        b bVar = new b(this.f53627a, qVar, this.f53632n, this.f53634s, list, this.h | z9, z9, bArr, this.d, this.f53629c, looper, this.f53633r, jVar2);
        bVar.b(jVar);
        if (this.f53635w != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z9, j jVar, boolean z10) {
        b d = d(list, z9, jVar);
        boolean c10 = c(d);
        long j3 = this.f53635w;
        Set set = this.D;
        if (c10 && !set.isEmpty()) {
            h2 it = t0.q(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(null);
            }
            d.c(jVar);
            if (j3 != -9223372036854775807L) {
                d.c(null);
            }
            d = d(list, z9, jVar);
        }
        if (c(d) && z10) {
            Set set2 = this.f53637y;
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
                return d(list, z9, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.f53636x.isEmpty() && this.f53637y.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void h(boolean z9) {
        if (z9 && this.I == null) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override
    public final g i(j jVar, e2.u uVar) {
        boolean z9 = false;
        h(false);
        if (this.E > 0) {
            z9 = true;
        }
        ia.p(z9);
        this.I.getClass();
        return b(this.I, jVar, uVar, true);
    }

    @Override
    public final l m(j jVar, e2.u uVar) {
        boolean z9;
        if (this.E > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        this.I.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new org.telegram.ui.web.w(19, dVar, uVar));
        return dVar;
    }

    @Override
    public final void release() {
        h(true);
        int i7 = this.E - 1;
        this.E = i7;
        if (i7 != 0) {
            return;
        }
        if (this.f53635w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f53636x);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((b) arrayList.get(i10)).c(null);
            }
        }
        h2 it = t0.q(this.f53637y).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
