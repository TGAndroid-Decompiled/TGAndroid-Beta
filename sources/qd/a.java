package qd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.q;
public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater f46604r = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m f46605a;
    public final q f46606b;
    public b f46607c;
    public long d;
    public long f46608e;
    public int f46609f;
    public boolean h;
    private volatile int indexInArray;
    public final c f46610n;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i10) {
        this.f46610n = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f46605a = new m();
        this.f46606b = new Object();
        this.f46607c = b.d;
        this.nextParkedWorker = c.v;
        int nanoTime = (int) System.nanoTime();
        this.f46609f = nanoTime == 0 ? 42 : nanoTime;
        g(i10);
    }

    public final i a(boolean z10) {
        i f9;
        i f10;
        long j10;
        b bVar = this.f46607c;
        b bVar2 = b.f46611a;
        c cVar = this.f46610n;
        i iVar = null;
        boolean z11 = true;
        m mVar = this.f46605a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f46617r;
            do {
                j10 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f46637b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 != null && iVar2.f46628b.f161a == 1) {
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
                    int i11 = m.f46638c.get(mVar);
                    while (true) {
                        if (i10 != i11 && m.f46639e.get(mVar) != 0) {
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
                        i iVar3 = (i) cVar.f46623f.d();
                        if (iVar3 == null) {
                            return j(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f46617r.compareAndSet(cVar, j10, j10 - 4398046511104L));
            this.f46607c = b.f46611a;
        }
        if (z10) {
            if (e(cVar.f46619a * 2) != 0) {
                z11 = false;
            }
            if (z11 && (f10 = f()) != null) {
                return f10;
            }
            mVar.getClass();
            i iVar4 = (i) m.f46637b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z11 && (f9 = f()) != null) {
                return f9;
            }
        } else {
            i f11 = f();
            if (f11 != null) {
                return f11;
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
        int i11 = this.f46609f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f46609f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & Integer.MAX_VALUE) % i10;
    }

    public final i f() {
        int e10 = e(2);
        c cVar = this.f46610n;
        if (e10 == 0) {
            i iVar = (i) cVar.f46622e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f46623f.d();
        }
        i iVar2 = (i) cVar.f46623f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f46622e.d();
    }

    public final void g(int i10) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46610n.d);
        sb2.append("-worker-");
        if (i10 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i10);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i10;
    }

    public final void h(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean i(b bVar) {
        boolean z10;
        b bVar2 = this.f46607c;
        if (bVar2 == b.f46611a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c.f46617r.addAndGet(this.f46610n, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f46607c = bVar;
        }
        return z10;
    }

    public final i j(int i10) {
        boolean z10;
        long j10;
        i iVar;
        long j11;
        long j12;
        i iVar2;
        int i11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f46617r;
        c cVar = this.f46610n;
        int i12 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i12 < 2) {
            return null;
        }
        int e10 = e(i12);
        int i13 = 0;
        long j13 = Long.MAX_VALUE;
        while (i13 < i12) {
            e10++;
            if (e10 > i12) {
                e10 = 1;
            }
            a aVar = (a) cVar.h.b(e10);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f46605a;
                if (i10 == 3) {
                    iVar = mVar.a();
                    j10 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.d.get(mVar);
                    int i15 = m.f46638c.get(mVar);
                    if (i10 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j10 = 0;
                            if (!z10 || m.f46639e.get(mVar) != 0) {
                                int i16 = i14 + 1;
                                iVar = mVar.b(i14, z10);
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
                q qVar = this.f46606b;
                if (iVar != null) {
                    qVar.f13927a = iVar;
                    iVar2 = iVar3;
                    j12 = -1;
                    j11 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f46637b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j11 = -1;
                            break;
                        }
                        j11 = -1;
                        if (iVar4.f46628b.f161a == 1) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        if ((i11 & i10) == 0) {
                            break;
                        }
                        k.f46634f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f46627a;
                        long j14 = k.f46631b;
                        if (nanoTime < j14) {
                            j12 = j14 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                qVar.f13927a = iVar4;
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
                    i iVar5 = (i) qVar.f13927a;
                    qVar.f13927a = iVar2;
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
        this.f46608e = j13;
        return null;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: qd.a.run():void");
    }
}
