package q2;

import a8.ia;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import c8.rb;
import h2.m0;
import h9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import m4.d0;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;
public final class b implements g {
    public final List f53694a;
    public final q f53695b;
    public final d0 f53696c;
    public final vy d;
    public final boolean f53697e;
    public final boolean f53698f;
    public final HashMap f53699g;
    public final h2.k h;
    public final pb.b f53700i;
    public final m2.j f53701j;
    public final ab.q f53702k;
    public final UUID f53703l;
    public final Looper f53704m;
    public final android.support.v4.media.session.q f53705n;
    public final Object f53706o;
    public int f53707p;
    public int f53708q;
    public HandlerThread f53709r;
    public android.support.v4.media.session.f f53710s;
    public k2.b f53711t;
    public f f53712u;
    public byte[] v;
    public byte[] f53713w;
    public o f53714x;
    public rt f53715y;
    public p f53716z;

    public b(UUID uuid, q qVar, d0 d0Var, vy vyVar, List list, boolean z9, boolean z10, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, pb.b bVar, m2.j jVar) {
        this.f53703l = uuid;
        this.f53696c = d0Var;
        this.d = vyVar;
        this.f53695b = qVar;
        this.f53697e = z9;
        this.f53698f = z10;
        if (bArr != null) {
            this.f53713w = bArr;
            this.f53694a = null;
        } else {
            list.getClass();
            this.f53694a = DesugarCollections.unmodifiableList(list);
        }
        this.f53699g = hashMap;
        this.f53702k = qVar2;
        this.h = new h2.k();
        this.f53700i = bVar;
        this.f53701j = jVar;
        this.f53707p = 2;
        this.f53704m = looper;
        this.f53705n = new android.support.v4.media.session.q(this, looper, 8);
        this.f53706o = new Object();
    }

    @Override
    public final UUID a() {
        p();
        return this.f53703l;
    }

    @Override
    public final void b(j jVar) {
        int i7;
        p();
        boolean z9 = false;
        if (this.f53708q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.f53708q);
            this.f53708q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.f14100a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.f14101b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.f14102c);
                        hashSet.add(jVar);
                        kVar.f14102c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = kVar.f14101b;
                    if (num != null) {
                        i7 = num.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    hashMap.put(jVar, Integer.valueOf(i7));
                } finally {
                }
            }
        }
        int i10 = this.f53708q + 1;
        this.f53708q = i10;
        if (i10 == 1) {
            if (this.f53707p == 2) {
                z9 = true;
            }
            ia.p(z9);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f53709r = handlerThread;
            handlerThread.start();
            this.f53710s = new android.support.v4.media.session.f(this, this.f53709r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.f53707p);
        }
        e eVar = (e) this.d.f39747b;
        if (eVar.f53728w != -9223372036854775807L) {
            eVar.D.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override
    public final void c(j jVar) {
        p();
        int i7 = this.f53708q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.f53708q = i10;
        if (i10 == 0) {
            this.f53707p = 0;
            android.support.v4.media.session.q qVar = this.f53705n;
            String str = m0.f14112a;
            qVar.removeCallbacksAndMessages(null);
            this.f53710s.b();
            this.f53710s = null;
            this.f53709r.quit();
            this.f53709r = null;
            this.f53711t = null;
            this.f53712u = null;
            this.f53714x = null;
            synchronized (this.f53706o) {
                this.f53715y = null;
            }
            this.f53716z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.f53695b.L(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.f(jVar) == 0) {
                jVar.e();
            }
        }
        vy vyVar = this.d;
        int i11 = this.f53708q;
        e eVar = (e) vyVar.f39747b;
        if (i11 == 1 && eVar.E > 0 && eVar.f53728w != -9223372036854775807L) {
            eVar.D.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new m5(this, 21), this, SystemClock.uptimeMillis() + eVar.f53728w);
        } else if (i11 == 0) {
            eVar.f53729x.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            d0 d0Var = eVar.f53725n;
            HashSet hashSet = (HashSet) d0Var.f19611a;
            hashSet.remove(this);
            if (((b) d0Var.f19612b) == this) {
                d0Var.f19612b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    d0Var.f19612b = bVar;
                    p q10 = bVar.f53695b.q();
                    bVar.f53716z = q10;
                    android.support.v4.media.session.f fVar = bVar.f53710s;
                    String str2 = m0.f14112a;
                    q10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.f58476g.getAndIncrement(), true, SystemClock.elapsedRealtime(), q10)).sendToTarget();
                }
            }
            if (eVar.f53728w != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.D.remove(this);
            }
        }
        eVar.g();
    }

    @Override
    public final boolean d() {
        p();
        return this.f53697e;
    }

    @Override
    public final int e() {
        p();
        return this.f53707p;
    }

    @Override
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.f53695b.w0(str, bArr);
    }

    @Override
    public final f g() {
        p();
        if (this.f53707p == 1) {
            return this.f53712u;
        }
        return null;
    }

    @Override
    public final k2.b h() {
        p();
        return this.f53711t;
    }

    public final void i(h2.j jVar) {
        Set<j> set;
        h2.k kVar = this.h;
        synchronized (kVar.f14100a) {
            set = kVar.f14102c;
        }
        for (j jVar2 : set) {
            jVar.accept(jVar2);
        }
    }

    public final void j(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.j(boolean):void");
    }

    public final boolean k() {
        int i7 = this.f53707p;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i7, Throwable th2) {
        int i10;
        Set<j> set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = m0.z(m0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !rb.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th2 instanceof x) {
                        i10 = 6001;
                    } else if (th2 instanceof c) {
                        i10 = 6003;
                    } else if (th2 instanceof u) {
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
        this.f53712u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.f14100a) {
                set = kVar.f14102c;
            }
            for (j jVar : set) {
                jVar.d((Exception) th2);
            }
        } else if (th2 instanceof Error) {
            if (!rb.c(th2) && !rb.b(th2)) {
                throw ((Error) th2);
            }
        } else {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        }
        if (this.f53707p != 4) {
            this.f53707p = 1;
        }
    }

    public final void m(Throwable th2, boolean z9) {
        int i7;
        if (!(th2 instanceof NotProvisionedException) && !rb.b(th2)) {
            if (z9) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            l(i7, th2);
            return;
        }
        this.f53696c.v0(this);
    }

    public final boolean n() {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.n():boolean");
    }

    public final void o(int i7, boolean z9, byte[] bArr) {
        try {
            synchronized (this.f53706o) {
                try {
                    this.f53715y = new rt(9);
                    List list = this.f53694a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o l02 = this.f53695b.l0(bArr, this.f53694a, i7, this.f53699g);
            this.f53714x = l02;
            android.support.v4.media.session.f fVar = this.f53710s;
            String str = m0.f14112a;
            l02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.f58476g.getAndIncrement(), z9, SystemClock.elapsedRealtime(), l02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f53704m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
