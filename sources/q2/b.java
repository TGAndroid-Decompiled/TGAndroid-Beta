package q2;

import a8.ja;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import c8.sb;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.ff;
public final class b implements h {
    public final List f55140a;
    public final r f55141b;
    public final k8.a f55142c;
    public final ou d;
    public final boolean f55143e;
    public final boolean f55144f;
    public final HashMap f55145g;
    public final h2.k h;
    public final qb.a f55146i;
    public final m2.j f55147j;
    public final ab.q f55148k;
    public final UUID f55149l;
    public final Looper f55150m;
    public final android.support.v4.media.session.q f55151n;
    public final Object f55152o;
    public int f55153p;
    public int f55154q;
    public HandlerThread f55155r;
    public android.support.v4.media.session.f f55156s;
    public k2.b f55157t;
    public g f55158u;
    public byte[] v;
    public byte[] f55159w;
    public p f55160x;
    public ff f55161y;
    public q f55162z;

    public b(UUID uuid, r rVar, k8.a aVar, ou ouVar, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, ab.q qVar, Looper looper, qb.a aVar2, m2.j jVar) {
        this.f55149l = uuid;
        this.f55142c = aVar;
        this.d = ouVar;
        this.f55141b = rVar;
        this.f55143e = z10;
        this.f55144f = z11;
        if (bArr != null) {
            this.f55159w = bArr;
            this.f55140a = null;
        } else {
            list.getClass();
            this.f55140a = DesugarCollections.unmodifiableList(list);
        }
        this.f55145g = hashMap;
        this.f55148k = qVar;
        this.h = new h2.k();
        this.f55146i = aVar2;
        this.f55147j = jVar;
        this.f55153p = 2;
        this.f55150m = looper;
        this.f55151n = new android.support.v4.media.session.q(this, looper, 8);
        this.f55152o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f55149l;
    }

    @Override
    public final void b(k kVar) {
        int i7;
        p();
        boolean z10 = false;
        if (this.f55154q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f55154q);
            this.f55154q = 0;
        }
        if (kVar != null) {
            h2.k kVar2 = this.h;
            synchronized (kVar2.f13460a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar2.d);
                    arrayList.add(kVar);
                    kVar2.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar2.f13461b.get(kVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar2.f13462c);
                        hashSet.add(kVar);
                        kVar2.f13462c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar2.f13461b;
                    if (num != null) {
                        i7 = num.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    hashMap.put(kVar, Integer.valueOf(i7));
                } finally {
                }
            }
        }
        int i10 = this.f55154q + 1;
        this.f55154q = i10;
        if (i10 == 1) {
            if (this.f55153p == 2) {
                z10 = true;
            }
            ja.p(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f55155r = handlerThread;
            handlerThread.start();
            this.f55156s = new android.support.v4.media.session.f(this, this.f55155r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (kVar != null && k() && this.h.f(kVar) == 1) {
            kVar.c(this.f55153p);
        }
        f fVar = (f) this.d.f25806b;
        if (fVar.f55176w != -9223372036854775807L) {
            fVar.E.remove(this);
            Handler handler = fVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(k kVar) {
        p();
        int i7 = this.f55154q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f55154q = i10;
        if (i10 == 0) {
            this.f55153p = 0;
            android.support.v4.media.session.q qVar = this.f55151n;
            String str = l0.f13471a;
            qVar.removeCallbacksAndMessages(null);
            this.f55156s.b();
            this.f55156s = null;
            this.f55155r.quit();
            this.f55155r = null;
            this.f55157t = null;
            this.f55158u = null;
            this.f55160x = null;
            synchronized (this.f55152o) {
                this.f55161y = null;
            }
            this.f55162z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f55141b.C(bArr);
                this.v = null;
            }
        }
        if (kVar != null) {
            this.h.i(kVar);
            if (this.h.f(kVar) == 0) {
                kVar.e();
            }
        }
        ou ouVar = this.d;
        int i11 = this.f55154q;
        f fVar = (f) ouVar.f25806b;
        if (i11 == 1 && fVar.F > 0 && fVar.f55176w != -9223372036854775807L) {
            fVar.E.add(this);
            Handler handler = fVar.K;
            handler.getClass();
            handler.postAtTime(new d(this, 1), this, SystemClock.uptimeMillis() + fVar.f55176w);
        } else if (i11 == 0) {
            fVar.f55177x.remove(this);
            if (fVar.H == this) {
                fVar.H = null;
            }
            if (fVar.I == this) {
                fVar.I = null;
            }
            k8.a aVar = fVar.f55173n;
            HashSet hashSet = (HashSet) aVar.f17788b;
            hashSet.remove(this);
            if (((b) aVar.f17789c) == this) {
                aVar.f17789c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    aVar.f17789c = bVar;
                    q n10 = bVar.f55141b.n();
                    bVar.f55162z = n10;
                    android.support.v4.media.session.f fVar2 = bVar.f55156s;
                    String str2 = l0.f13471a;
                    n10.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(1, new a(x2.t.f59664g.getAndIncrement(), true, SystemClock.elapsedRealtime(), n10)).sendToTarget();
                }
            }
            if (fVar.f55176w != -9223372036854775807L) {
                Handler handler2 = fVar.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                fVar.E.remove(this);
            }
        }
        fVar.g();
    }

    @Override
    public final boolean d() {
        p();
        return this.f55143e;
    }

    @Override
    public final int e() {
        p();
        return this.f55153p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f55141b.Y(str, bArr);
    }

    @Override
    public final g g() {
        p();
        if (this.f55153p == 1) {
            return this.f55158u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f55157t;
    }

    public final void i(h2.j jVar) {
        Set<k> set;
        h2.k kVar = this.h;
        synchronized (kVar.f13460a) {
            set = kVar.f13462c;
        }
        for (k kVar2 : set) {
            jVar.accept(kVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f55153p;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i7, Throwable th2) {
        int i10;
        Set<k> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = l0.z(l0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !sb.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th2 instanceof y) {
                        i10 = 6001;
                    } else if (th2 instanceof c) {
                        i10 = 6003;
                    } else if (th2 instanceof v) {
                        i10 = 6008;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            i10 = 6004;
                        } else if (i7 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.f55158u = new g(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f13460a) {
                set = kVar.f13462c;
            }
            for (k kVar2 : set) {
                kVar2.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!sb.c(th2) && !sb.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f55153p != 4) {
            this.f55153p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        int i7;
        if (!(th2 instanceof NotProvisionedException) && !sb.b(th2)) {
            if (z10) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            l(i7, th2);
            return;
        }
        this.f55142c.U0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z10, byte[] bArr) {
        try {
            synchronized (this.f55152o) {
                try {
                    this.f55161y = new ff(11);
                    List list = this.f55140a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p L = this.f55141b.L(bArr, this.f55140a, i7, this.f55145g);
            this.f55160x = L;
            android.support.v4.media.session.f fVar = this.f55156s;
            String str = l0.f13471a;
            L.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.t.f59664g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), L)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f55150m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
