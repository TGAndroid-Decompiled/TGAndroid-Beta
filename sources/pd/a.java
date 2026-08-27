package pd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.q;

public final class a extends Thread {

    public static final AtomicIntegerFieldUpdater f45697r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    public final m f45698a;

    public final q f45699b;

    public b f45700c;
    public long d;

    public long f45701e;

    public int f45702f;
    public boolean h;
    private volatile int indexInArray;

    public final c f45703n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f45703n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f45698a = new m();
        this.f45699b = new q();
        this.f45700c = b.d;
        this.nextParkedWorker = c.v;
        int iNanoTime = (int) System.nanoTime();
        this.f45702f = iNanoTime == 0 ? 42 : iNanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i iVarF;
        i iVarF2;
        long j10;
        b bVar = this.f45700c;
        b bVar2 = b.f45704a;
        c cVar = this.f45703n;
        i iVar = null;
        m mVar = this.f45698a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f45710r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f45730b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || iVar2.f45721b.f3426a != 1) {
                            int i10 = m.d.get(mVar);
                            int i11 = m.f45731c.get(mVar);
                            while (i10 != i11 && m.f45732e.get(mVar) != 0) {
                                i11--;
                                i iVarB = mVar.b(i11, true);
                                if (iVarB != null) {
                                    iVar = iVarB;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f45716f.d();
                    return iVar3 == null ? j(1) : iVar3;
                }
            } while (!c.f45710r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f45700c = b.f45704a;
        }
        if (z10) {
            boolean z11 = e(cVar.f45712a * 2) == 0;
            if (z11 && (iVarF2 = f()) != null) {
                return iVarF2;
            }
            mVar.getClass();
            i iVarA = (i) m.f45730b.getAndSet(mVar, null);
            if (iVarA == null) {
                iVarA = mVar.a();
            }
            if (iVarA != null) {
                return iVarA;
            }
            if (!z11 && (iVarF = f()) != null) {
                return iVarF;
            }
        } else {
            i iVarF3 = f();
            if (iVarF3 != null) {
                return iVarF3;
            }
        }
        return j(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int e(int i10) {
        int i11 = this.f45702f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f45702f = i14;
        int i15 = i10 - 1;
        return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int iE = e(2);
        c cVar = this.f45703n;
        if (iE == 0) {
            i iVar = (i) cVar.f45715e.d();
            return iVar != null ? iVar : (i) cVar.f45716f.d();
        }
        i iVar2 = (i) cVar.f45716f.d();
        return iVar2 != null ? iVar2 : (i) cVar.f45715e.d();
    }

    public final void g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f45703n.d);
        sb2.append("-worker-");
        sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        b bVar2 = this.f45700c;
        boolean z10 = bVar2 == b.f45704a;
        if (z10) {
            c.f45710r.addAndGet(this.f45703n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f45700c = bVar;
        }
        return z10;
    }

    public final i j(int i10) {
        long j10;
        i iVarB;
        long j11;
        long j12;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f45710r;
        c cVar = this.f45703n;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i11 < 2) {
            return null;
        }
        int iE = e(i11);
        int i12 = 0;
        long jMin = Long.MAX_VALUE;
        while (i12 < i11) {
            iE++;
            if (iE > i11) {
                iE = 1;
            }
            a aVar = (a) cVar.h.b(iE);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f45698a;
                if (i10 != 3) {
                    mVar.getClass();
                    int i13 = m.d.get(mVar);
                    int i14 = m.f45731c.get(mVar);
                    boolean z10 = i10 == 1;
                    while (true) {
                        if (i13 != i14) {
                            j10 = 0;
                            if (!z10 || m.f45732e.get(mVar) != 0) {
                                int i15 = i13 + 1;
                                iVarB = mVar.b(i13, z10);
                                if (iVarB != null) {
                                    break;
                                }
                                i13 = i15;
                            }
                        } else {
                            j10 = 0;
                        }
                        iVarB = iVar2;
                        break;
                    }
                } else {
                    iVarB = mVar.a();
                    j10 = 0;
                }
                q qVar = this.f45699b;
                if (iVarB == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f45730b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j11 = -1;
                        } else {
                            j11 = -1;
                            if (((iVar3.f45721b.f3426a == 1 ? 1 : 2) & i10) != 0) {
                                k.f45727f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.f45720a;
                                long j13 = k.f45724b;
                                if (jNanoTime < j13) {
                                    j12 = j13 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                        qVar.f15253a = iVar3;
                                        j12 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == iVar3);
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j12 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    qVar.f15253a = iVarB;
                    iVar = iVar2;
                    j12 = -1;
                    j11 = -1;
                }
                if (j12 == j11) {
                    i iVar4 = (i) qVar.f15253a;
                    qVar.f15253a = iVar;
                    return iVar4;
                }
                if (j12 > j10) {
                    jMin = Math.min(jMin, j12);
                }
            }
            i12++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f45701e = jMin;
        return null;
    }

    @Override
    public final void run() {
        long j10;
        loop0: while (true) {
            boolean z10 = false;
            while (true) {
                if (c.f45711s.get(this.f45703n) == 0) {
                    b bVar = this.f45700c;
                    b bVar2 = b.f45707e;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.h);
                    if (iVarA != null) {
                        this.f45701e = 0L;
                        c cVar = this.f45703n;
                        int i10 = iVarA.f45721b.f3426a;
                        this.d = 0L;
                        if (this.f45700c == b.f45706c) {
                            this.f45700c = b.f45705b;
                        }
                        if (i10 != 0 && i(b.f45705b) && !cVar.e() && !cVar.d(c.f45710r.get(cVar))) {
                            cVar.e();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (i10 != 0) {
                            c.f45710r.addAndGet(cVar, -2097152L);
                            if (this.f45700c == bVar2) {
                                break;
                            }
                            this.f45700c = b.d;
                            break;
                        }
                        break;
                    }
                    this.h = false;
                    if (this.f45701e == 0) {
                        Object obj = this.nextParkedWorker;
                        ec.a aVar = c.v;
                        if (obj != aVar) {
                            f45697r.set(this, -1);
                            while (this.nextParkedWorker != c.v) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f45697r;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.f45703n;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f45711s;
                                if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                    break;
                                }
                                b bVar3 = this.f45700c;
                                b bVar4 = b.f45707e;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                i(b.f45706c);
                                Thread.interrupted();
                                if (this.d == 0) {
                                    j10 = 2097151;
                                    this.d = System.nanoTime() + this.f45703n.f45714c;
                                } else {
                                    j10 = 2097151;
                                }
                                LockSupport.parkNanos(this.f45703n.f45714c);
                                if (System.nanoTime() - this.d >= 0) {
                                    this.d = 0L;
                                    c cVar3 = this.f45703n;
                                    synchronized (cVar3.h) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.f45710r;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j10)) > cVar3.f45712a) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i11 = this.indexInArray;
                                                        g(0);
                                                        cVar3.c(this, i11, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j10);
                                                        if (andDecrement != i11) {
                                                            Object objB = cVar3.h.b(andDecrement);
                                                            kotlin.jvm.internal.j.b(objB);
                                                            a aVar2 = (a) objB;
                                                            cVar3.h.c(i11, aVar2);
                                                            aVar2.g(i11);
                                                            cVar3.c(aVar2, andDecrement, i11);
                                                        }
                                                        cVar3.h.c(andDecrement, null);
                                                        this.f45700c = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f45703n;
                            if (this.nextParkedWorker == aVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f45709n;
                                while (true) {
                                    long j11 = atomicLongFieldUpdater2.get(cVar4);
                                    int i12 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.h.b((int) (j11 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f45709n.compareAndSet(cVar5, j11, ((j11 + 2097152) & (-2097152)) | ((long) i12))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z10) {
                            i(b.f45706c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f45701e);
                            this.f45701e = 0L;
                            break;
                        }
                        z10 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        i(b.f45707e);
    }
}
