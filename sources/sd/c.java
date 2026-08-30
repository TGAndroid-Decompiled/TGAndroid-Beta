package sd;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kh.a2;
import ld.e0;
import qd.r;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f44264n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f44265r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f44266s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final i5.c v = new i5.c("NOT_IN_STACK", 3);
    private volatile int _isTerminated$volatile;
    public final int f44267a;
    public final int f44268b;
    public final long f44269c;
    private volatile long controlState$volatile;
    public final String d;
    public final f e;
    public final f f44270f;
    public final r h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i10, long j10, String str, int i11) {
        this.f44267a = i10;
        this.f44268b = i11;
        this.f44269c = j10;
        this.d = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.e = new qd.l();
                        this.f44270f = new qd.l();
                        this.h = new r((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(e2.c.i(j10, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(a2.k(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(android.support.v4.media.a.k(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(a2.k(i10, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z4;
        synchronized (this.h) {
            try {
                if (f44266s.get(this) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f44265r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f44267a) {
                    return 0;
                }
                if (i10 >= this.f44268b) {
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
        k.f44280f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f44274a = nanoTime;
            jVar.f44275b = cVar;
        } else {
            jVar = new j(runnable, nanoTime, cVar);
        }
        if (jVar.f44275b.f2081a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44265r;
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
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f44259n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f44257c) != b.e && (jVar.f44275b.f2081a != 0 || bVar != b.f44261b)) {
            aVar.h = true;
            m mVar = aVar.f44255a;
            mVar.getClass();
            jVar = (i) m.f44283b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f44285a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f44284c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f44275b.f2081a == 1) {
                        m.e.incrementAndGet(mVar);
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
            if (jVar.f44275b.f2081a == 1) {
                a2 = this.f44270f.a(jVar);
            } else {
                a2 = this.e.a(jVar);
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
            long j10 = f44264n.get(this);
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
                if (f44264n.compareAndSet(this, j10, j11 | i12)) {
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
        int i11 = this.f44267a;
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
        i5.c cVar;
        int i10;
        while (true) {
            long j10 = f44264n.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    cVar = v;
                    if (c3 == cVar) {
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
                    if (f44264n.compareAndSet(this, j10, i10 | j11)) {
                        aVar.h(cVar);
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
            if (a.f44254r.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f44281g);
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
                m mVar = aVar.f44255a;
                mVar.getClass();
                if (m.f44283b.get(mVar) != null) {
                    i10 = (m.f44284c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i10 = m.f44284c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f44257c.ordinal();
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
        long j10 = f44265r.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(e0.k(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f44267a;
        sb4.append(i17);
        sb4.append(", max = ");
        a2.w(sb4, this.f44268b, "}, Worker States {CPU = ", i11, ", blocking = ");
        a2.w(sb4, i12, ", parked = ", i13, ", dormant = ");
        a2.w(sb4, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f44270f.c());
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
