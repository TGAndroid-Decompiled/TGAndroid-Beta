package qd;

import a4.w;
import j7.l1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import jd.e0;
import od.s;
public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater f46616n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater f46617r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater f46618s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final fc.a v = new fc.a("NOT_IN_STACK", 2);
    private volatile int _isTerminated$volatile;
    public final int f46619a;
    public final int f46620b;
    public final long f46621c;
    private volatile long controlState$volatile;
    public final String d;
    public final f f46622e;
    public final f f46623f;
    public final s h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i10, long j10, String str, int i11) {
        this.f46619a = i10;
        this.f46620b = i11;
        this.f46621c = j10;
        this.d = str;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 > 0) {
                        this.f46622e = new od.m();
                        this.f46623f = new od.m();
                        this.h = new s((i10 + 1) * 2);
                        this.controlState$volatile = i10 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(com.google.android.recaptcha.internal.a.l(j10, "Idle worker keep alive time ", " must be positive").toString());
                }
                throw new IllegalArgumentException(l1.l(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(w.k(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(l1.l(i10, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        synchronized (this.h) {
            try {
                if (f46618s.get(this) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f46617r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f46619a) {
                    return 0;
                }
                if (i10 >= this.f46620b) {
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

    public final void b(Runnable runnable, a5.c cVar) {
        i jVar;
        boolean z10;
        long j10;
        a aVar;
        boolean a2;
        b bVar;
        k.f46634f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f46627a = nanoTime;
            jVar.f46628b = cVar;
        } else {
            jVar = new j(runnable, nanoTime, cVar);
        }
        if (jVar.f46628b.f161a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f46617r;
        if (z10) {
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
        if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f46610n, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f46607c) != b.f46614e && (jVar.f46628b.f161a != 0 || bVar != b.f46612b)) {
            aVar.h = true;
            m mVar = aVar.f46605a;
            mVar.getClass();
            jVar = (i) m.f46637b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f46640a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f46638c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f46628b.f161a == 1) {
                        m.f46639e.incrementAndGet(mVar);
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
            if (jVar.f46628b.f161a == 1) {
                a2 = this.f46623f.a(jVar);
            } else {
                a2 = this.f46622e.a(jVar);
            }
            if (!a2) {
                throw new RejectedExecutionException(w.q(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z10) {
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
            long j10 = f46616n.get(this);
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
                if (f46616n.compareAndSet(this, j10, j11 | i12)) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Method not decompiled: qd.c.close():void");
    }

    public final boolean d(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f46619a;
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
        fc.a aVar;
        int i10;
        while (true) {
            long j10 = f46616n.get(this);
            a aVar2 = (a) this.h.b((int) (2097151 & j10));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c3 = aVar2.c();
                while (true) {
                    aVar = v;
                    if (c3 == aVar) {
                        i10 = -1;
                        break;
                    } else if (c3 == null) {
                        i10 = 0;
                        break;
                    } else {
                        a aVar3 = (a) c3;
                        i10 = aVar3.b();
                        if (i10 != 0) {
                            break;
                        }
                        c3 = aVar3.c();
                    }
                }
                if (i10 >= 0) {
                    if (f46616n.compareAndSet(this, j10, i10 | j11)) {
                        aVar2.h(aVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f46604r.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f46635g);
    }

    public final String toString() {
        int i10;
        ArrayList arrayList = new ArrayList();
        s sVar = this.h;
        int a2 = sVar.a();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < a2; i16++) {
            a aVar = (a) sVar.b(i16);
            if (aVar != null) {
                m mVar = aVar.f46605a;
                mVar.getClass();
                if (m.f46637b.get(mVar) != null) {
                    i10 = (m.f46638c.get(mVar) - m.d.get(mVar)) + 1;
                } else {
                    i10 = m.f46638c.get(mVar) - m.d.get(mVar);
                }
                int ordinal = aVar.f46607c.ordinal();
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
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i10);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i13++;
                        }
                    } else {
                        i12++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i11++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i10);
                    sb4.append('c');
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j10 = f46617r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(e0.k(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f46619a;
        sb5.append(i17);
        sb5.append(", max = ");
        l1.w(sb5, this.f46620b, "}, Worker States {CPU = ", i11, ", blocking = ");
        l1.w(sb5, i12, ", parked = ", i13, ", dormant = ");
        l1.w(sb5, i14, ", terminated = ", i15, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f46622e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f46623f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
