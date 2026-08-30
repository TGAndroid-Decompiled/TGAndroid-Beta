package w4;

import h5.d0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import v4.j;
import v4.k;
public abstract class i implements v4.g {
    public final ArrayDeque f46442a = new ArrayDeque();
    public final ArrayDeque f46443b;
    public final PriorityQueue f46444c;
    public g d;
    public long e;
    public long f46445f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f46442a.add(new j());
        }
        this.f46443b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f46443b;
            rh.e eVar = new rh.e(this, 18);
            ?? aVar = new n3.a();
            aVar.h = eVar;
            arrayDeque.add(aVar);
        }
        this.f46444c = new PriorityQueue();
    }

    @Override
    public final void a(long j10) {
        this.e = j10;
    }

    @Override
    public final Object c() {
        boolean z4;
        if (this.d == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        ArrayDeque arrayDeque = this.f46442a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.d = gVar;
        return gVar;
    }

    @Override
    public final void d(Object obj) {
        boolean z4;
        j jVar = (j) obj;
        if (jVar == this.d) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        g gVar = (g) jVar;
        if (gVar.e(Integer.MIN_VALUE)) {
            gVar.c();
            this.f46442a.add(gVar);
        } else {
            long j10 = this.f46445f;
            this.f46445f = 1 + j10;
            gVar.v = j10;
            this.f46444c.add(gVar);
        }
        this.d = null;
    }

    public abstract e5.b e();

    public abstract void f(g gVar);

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f46445f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f46444c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f46442a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = d0.f6937a;
            gVar.c();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.c();
            arrayDeque.add(gVar2);
            this.d = null;
        }
    }

    @Override
    public k b() {
        ArrayDeque arrayDeque = this.f46443b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f46444c;
            if (!priorityQueue.isEmpty()) {
                int i10 = d0.f6937a;
                if (((g) priorityQueue.peek()).f14242f <= this.e) {
                    g gVar = (g) priorityQueue.poll();
                    boolean e = gVar.e(4);
                    ArrayDeque arrayDeque2 = this.f46442a;
                    if (e) {
                        k kVar = (k) arrayDeque.pollFirst();
                        kVar.a(4);
                        gVar.c();
                        arrayDeque2.add(gVar);
                        return kVar;
                    }
                    f(gVar);
                    if (h()) {
                        e5.b e6 = e();
                        k kVar2 = (k) arrayDeque.pollFirst();
                        kVar2.k(gVar.f14242f, e6, Long.MAX_VALUE);
                        gVar.c();
                        arrayDeque2.add(gVar);
                        return kVar2;
                    }
                    gVar.c();
                    arrayDeque2.add(gVar);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean h();

    @Override
    public void release() {
    }
}
