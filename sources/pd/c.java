package pd;

import a9.p;
import id.f0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import nd.r;

public final class c implements Executor, Closeable {

    public static final AtomicLongFieldUpdater f45709n = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    public static final AtomicLongFieldUpdater f45710r = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    public static final AtomicIntegerFieldUpdater f45711s = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final ec.a v = new ec.a("NOT_IN_STACK", 3);
    private volatile int _isTerminated$volatile;

    public final int f45712a;

    public final int f45713b;

    public final long f45714c;
    private volatile long controlState$volatile;
    public final String d;

    public final f f45715e;

    public final f f45716f;
    public final r h;
    private volatile long parkedWorkersStack$volatile;

    public c(int i10, long j10, String str, int i11) {
        this.f45712a = i10;
        this.f45713b = i11;
        this.f45714c = j10;
        this.d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(i0.a.l(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(p.j(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(i0.a.l(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(com.google.android.recaptcha.internal.a.m(j10, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f45715e = new f();
        this.f45716f = new f();
        this.h = new r((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.h) {
            try {
                if (f45711s.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f45710r;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f45712a) {
                    return 0;
                }
                if (i10 >= this.f45713b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.h.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i12);
                this.h.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, com.google.android.gms.internal.cast.a aVar) {
        i jVar;
        b bVar;
        k.f45727f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f45720a = jNanoTime;
            jVar.f45721b = aVar;
        } else {
            jVar = new j(runnable, jNanoTime, aVar);
        }
        boolean z10 = jVar.f45721b.f3426a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f45710r;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar2 = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar2 == null || !kotlin.jvm.internal.j.a(aVar2.f45703n, this)) {
            aVar2 = null;
        }
        if (aVar2 != null && (bVar = aVar2.f45700c) != b.f45707e && (jVar.f45721b.f3426a != 0 || bVar != b.f45705b)) {
            aVar2.h = true;
            m mVar = aVar2.f45698a;
            mVar.getClass();
            jVar = (i) m.f45730b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f45733a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f45731c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.d.get(mVar) != 127) {
                    if (jVar.f45721b.f3426a == 1) {
                        m.f45732e.incrementAndGet(mVar);
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
            if (!(jVar.f45721b.f3426a == 1 ? this.f45716f.a(jVar) : this.f45715e.a(jVar))) {
                throw new RejectedExecutionException(p.p(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z10) {
            if (e() || d(jAddAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f45709n.get(this);
            int iB = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iB == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == v) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        iB = aVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = aVar2.c();
                        }
                    }
                } else {
                    iB = i11;
                }
            }
            if (iB >= 0) {
                if (f45709n.compareAndSet(this, j10, j11 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    @Override
    public final void close() throws InterruptedException {
        int i10;
        i iVarA;
        if (f45711s.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !kotlin.jvm.internal.j.a(aVar.f45703n, this)) {
                aVar = null;
            }
            synchronized (this.h) {
                i10 = (int) (f45710r.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    Object objB = this.h.b(i11);
                    kotlin.jvm.internal.j.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f45698a;
                        f fVar = this.f45716f;
                        mVar.getClass();
                        i iVar = (i) m.f45730b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarA2 = mVar.a();
                            if (iVarA2 == null) {
                                break;
                            } else {
                                fVar.a(iVarA2);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f45716f.b();
            this.f45715e.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.f45715e.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f45715e.d();
                    if (iVarA == null && (iVarA = (i) this.f45716f.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.i(b.f45707e);
            }
            f45709n.set(this, 0L);
            f45710r.set(this, 0L);
        }
    }

    public final boolean d(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f45712a;
        if (i10 < i11) {
            int iA = a();
            if (iA == 1 && i11 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        ec.a aVar;
        int iB;
        while (true) {
            long j10 = f45709n.get(this);
            a aVar2 = (a) this.h.b((int) (2097151 & j10));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVar2.c();
                while (true) {
                    aVar = v;
                    if (objC == aVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar3 = (a) objC;
                    iB = aVar3.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar3.c();
                }
                if (iB >= 0) {
                    if (f45709n.compareAndSet(this, j10, ((long) iB) | j11)) {
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
            if (a.f45697r.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        b(runnable, k.f45728g);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.h;
        int iA = rVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) rVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f45698a;
                mVar.getClass();
                int i16 = m.f45730b.get(mVar) != null ? (m.f45731c.get(mVar) - m.d.get(mVar)) + 1 : m.f45731c.get(mVar) - m.d.get(mVar);
                int iOrdinal = aVar.f45700c.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (iOrdinal == 4) {
                    i14++;
                }
            }
        }
        long j10 = f45710r.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.d);
        sb5.append('@');
        sb5.append(f0.k(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f45712a;
        sb5.append(i17);
        sb5.append(", max = ");
        i0.a.x(sb5, this.f45713b, "}, Worker States {CPU = ", i10, ", blocking = ");
        i0.a.x(sb5, i11, ", parked = ", i12, ", dormant = ");
        i0.a.x(sb5, i13, ", terminated = ", i14, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f45715e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f45716f.c());
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
