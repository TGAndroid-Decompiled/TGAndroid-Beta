package w4;

import h5.d0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import oh.h4;
import v4.j;
import v4.k;
public abstract class i implements v4.g {
    public final ArrayDeque f49413a = new ArrayDeque();
    public final ArrayDeque f49414b;
    public final PriorityQueue f49415c;
    public g d;
    public long f49416e;
    public long f49417f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f49413a.add(new j());
        }
        this.f49414b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f49414b;
            sf.g gVar = new sf.g(this, 11);
            ?? aVar = new n3.a();
            aVar.h = gVar;
            arrayDeque.add(aVar);
        }
        this.f49415c = new PriorityQueue();
    }

    @Override
    public final void a(long j10) {
        this.f49416e = j10;
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
        ArrayDeque arrayDeque = this.f49413a;
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
            gVar.b();
            this.f49413a.add(gVar);
        } else {
            long j10 = this.f49417f;
            this.f49417f = 1 + j10;
            gVar.v = j10;
            this.f49415c.add(gVar);
        }
        this.d = null;
    }

    public abstract h4 e();

    public abstract void f(g gVar);

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f49417f = 0L;
        this.f49416e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f49415c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f49413a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = d0.f7237a;
            gVar.b();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.b();
            arrayDeque.add(gVar2);
            this.d = null;
        }
    }

    @Override
    public k b() {
        ArrayDeque arrayDeque = this.f49414b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f49415c;
            if (!priorityQueue.isEmpty()) {
                int i10 = d0.f7237a;
                if (((g) priorityQueue.peek()).f15216f <= this.f49416e) {
                    g gVar = (g) priorityQueue.poll();
                    boolean e6 = gVar.e(4);
                    ArrayDeque arrayDeque2 = this.f49413a;
                    if (e6) {
                        k kVar = (k) arrayDeque.pollFirst();
                        kVar.a(4);
                        gVar.b();
                        arrayDeque2.add(gVar);
                        return kVar;
                    }
                    f(gVar);
                    if (h()) {
                        h4 e10 = e();
                        k kVar2 = (k) arrayDeque.pollFirst();
                        kVar2.j(gVar.f15216f, e10, Long.MAX_VALUE);
                        gVar.b();
                        arrayDeque2.add(gVar);
                        return kVar2;
                    }
                    gVar.b();
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
