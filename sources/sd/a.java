package sd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.q;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f47244r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f47245a;
    public final q f47246b;
    public b f47247c;
    public long d;
    public long f47248e;
    public int f47249f;
    public boolean h;
    private volatile int indexInArray;
    public final c f47250n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f47250n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f47245a = new m();
        this.f47246b = new Object();
        this.f47247c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f47249f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z4) {
        i f10;
        i f11;
        long j10;
        b bVar = this.f47247c;
        b bVar2 = b.f47251a;
        c cVar = this.f47250n;
        i iVar = null;
        boolean z10 = true;
        m mVar = this.f47245a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f47257r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f47277b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f47268b.f2264a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i10 = m.d.get(mVar);
                    int i11 = m.f47278c.get(mVar);
                    while (true) {
                        if (i10 != i11 && m.f47279e.get(mVar) != 0) {
                            i11--;
                            i b10 = mVar.b(i11, true);
                            if (b10 != null) {
                                iVar = b10;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar.f47263f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f47257r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f47247c = b.f47251a;
        }
        if (z4) {
            if (e(cVar.f47259a * 2) != 0) {
                z10 = false;
            }
            if (z10 && (f11 = f()) != null) {
                return f11;
            }
            mVar.getClass();
            i iVar4 = (i) m.f47277b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z10 && (f10 = f()) != null) {
                return f10;
            }
        } else {
            i f12 = f();
            if (f12 != null) {
                return f12;
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
        int i11 = this.f47249f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f47249f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int e6 = e(2);
        c cVar = this.f47250n;
        if (e6 == 0) {
            i iVar = (i) cVar.f47262e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f47263f.d();
        }
        i iVar2 = (i) cVar.f47263f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f47262e.d();
    }

    public final void g(int i10) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f47250n.d);
        sb.append("-worker-");
        if (i10 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i10);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        boolean z4;
        b bVar2 = this.f47247c;
        if (bVar2 == b.f47251a) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            c.f47257r.addAndGet(this.f47250n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f47247c = bVar;
        }
        return z4;
    }

    public final i j(int i10) {
        boolean z4;
        long j10;
        i iVar;
        long j11;
        long j12;
        i iVar2;
        int i11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f47257r;
        c cVar = this.f47250n;
        int i12 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i12 < 2) {
            return null;
        }
        int e6 = e(i12);
        int i13 = 0;
        long j13 = Long.MAX_VALUE;
        while (i13 < i12) {
            e6++;
            if (e6 > i12) {
                e6 = 1;
            }
            a aVar = (a) cVar.h.b(e6);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f47245a;
                if (i10 == 3) {
                    iVar = mVar.a();
                    j10 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.d.get(mVar);
                    int i15 = m.f47278c.get(mVar);
                    if (i10 == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j10 = 0;
                            if (!z4 || m.f47279e.get(mVar) != 0) {
                                int i16 = i14 + 1;
                                iVar = mVar.b(i14, z4);
                                if (iVar != null) {
                                    break;
                                }
                                i14 = i16;
                            } else {
                                break;
                            }
                        } else {
                            j10 = 0;
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                q qVar = this.f47246b;
                if (iVar != null) {
                    qVar.f11340a = iVar;
                    iVar2 = iVar3;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f47277b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (iVar4.f47268b.f2264a == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        k.f47274f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f47267a;
                        long j14 = k.f47271b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                qVar.f11340a = iVar4;
                                j12 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j12 = -2;
                    iVar2 = iVar3;
                }
                if (j12 == j11) {
                    i iVar5 = (i) qVar.f11340a;
                    qVar.f11340a = iVar2;
                    return iVar5;
                } else if (j12 > j10) {
                    j13 = Math.min(j13, j12);
                }
            }
            i13++;
            iVar3 = null;
        }
        if (j13 == Long.MAX_VALUE) {
            j13 = 0;
        }
        this.f47248e = j13;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: sd.a.run():void");
    }
}
