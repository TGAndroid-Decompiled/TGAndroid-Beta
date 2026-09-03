package sd;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import ld.e0;
import qd.r;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f47287n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f47288r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f47289s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final com.google.android.gms.internal.clearcut.e v = new com.google.android.gms.internal.clearcut.e("NOT_IN_STACK", 2);
    private volatile int _isTerminated$volatile;
    public final int f47290a;
    public final int f47291b;
    public final long f47292c;
    private volatile long controlState$volatile;
    public final String d;
    public final f f47293e;
    public final f f47294f;
    public final r h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i10, long j10, String str, int i11) {
        this.f47290a = i10;
        this.f47291b = i11;
        this.f47292c = j10;
        this.d = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.f47293e = new qd.l();
                        this.f47294f = new qd.l();
                        this.h = new r((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(e2.c.i(j10, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(l.d.k(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(android.support.v4.media.a.k(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(l.d.k(i10, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z4;
        synchronized (this.h) {
            try {
                if (f47289s.get(this) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f47288r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f47290a) {
                    return 0;
                }
                if (i10 >= this.f47291b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 > 0 && this.h.b(i12) == null) {
                    a aVar = new a(this, i12);
                    this.h.c(i12, aVar);
                    if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i13 = i11 + 1;
                        aVar.start();
                        return i13;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Runnable runnable, c5.c cVar) {
        i jVar;
        boolean z4;
        long j10;
        a aVar;
        boolean a2;
        b bVar;
        k.f47305f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f47298a = nanoTime;
            jVar.f47299b = cVar;
        } else {
            jVar = new j(runnable, nanoTime, cVar);
        }
        if (jVar.f47299b.f2264a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f47288r;
        if (z4) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f47281n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f47278c) != b.f47285e && (jVar.f47299b.f2264a != 0 || bVar != b.f47283b)) {
            aVar.h = true;
            m mVar = aVar.f47276a;
            mVar.getClass();
            jVar = (i) m.f47308b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f47311a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f47309c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f47299b.f2264a == 1) {
                        m.f47310e.incrementAndGet(mVar);
                    }
                    int i10 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i10) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i10, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (jVar.f47299b.f2264a == 1) {
                a2 = this.f47294f.a(jVar);
            } else {
                a2 = this.f47293e.a(jVar);
            }
            if (!a2) {
                throw new RejectedExecutionException(android.support.v4.media.a.r(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z4) {
            if (!e() && !d(j10)) {
                e();
            }
        } else if (e() || d(atomicLongFieldUpdater.get(this))) {
        } else {
            e();
        }
    }

    public final void c(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f47287n.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == v) {
                            i12 = -1;
                            break;
                        } else if (c3 == null) {
                            i12 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c3;
                            i12 = aVar2.b();
                            if (i12 != 0) {
                                break;
                            }
                            c3 = aVar2.c();
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f47287n.compareAndSet(this, j10, j11 | i12)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: sd.c.close():void");
    }

    public final boolean d(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f47290a;
        if (i10 < i11) {
            int a2 = a();
            if (a2 == 1 && i11 > 1) {
                a();
            }
            if (a2 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        com.google.android.gms.internal.clearcut.e eVar;
        int i10;
        while (true) {
            long j10 = f47287n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    eVar = v;
                    if (c3 == eVar) {
                        i10 = -1;
                        break;
                    } else if (c3 == null) {
                        i10 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c3;
                        i10 = aVar2.b();
                        if (i10 != 0) {
                            break;
                        }
                        c3 = aVar2.c();
                    }
                }
                if (i10 >= 0) {
                    if (f47287n.compareAndSet(this, j10, i10 | j11)) {
                        aVar.h(eVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f47275r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f47306g);
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        r rVar = this.h;
        int a2 = rVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a2; i16++) {
            a aVar = (a) rVar.b(i16);
            if (aVar != null) {
                m mVar = aVar.f47276a;
                mVar.getClass();
                if (m.f47308b.get(mVar) != null) {
                    i10 = (m.f47309c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i10 = m.f47309c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f47278c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i15++;
                                }
                            } else {
                                i14++;
                                if (i10 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i10);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i10);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i10);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j10 = f47288r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(e0.k(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f47290a;
        sb4.append(i17);
        sb4.append(", max = ");
        l.d.w(sb4, this.f47291b, "}, Worker States {CPU = ", i11, ", blocking = ");
        l.d.w(sb4, i12, ", parked = ", i13, ", dormant = ");
        l.d.w(sb4, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f47293e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f47294f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
