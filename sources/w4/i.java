package w4;

import h5.d0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import ph.z8;
import v4.j;
import v4.k;
public abstract class i implements v4.g {
    public final ArrayDeque f46524a = new ArrayDeque();
    public final ArrayDeque f46525b;
    public final PriorityQueue f46526c;
    public g d;
    public long e;
    public long f46527f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f46524a.add(new j());
        }
        this.f46525b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f46525b;
            z8 z8Var = new z8(this, 21);
            ?? aVar = new n3.a();
            aVar.h = z8Var;
            arrayDeque.add(aVar);
        }
        this.f46526c = new PriorityQueue();
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
        ArrayDeque arrayDeque = this.f46524a;
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
        if (gVar.d(Integer.MIN_VALUE)) {
            gVar.b();
            this.f46524a.add(gVar);
        } else {
            long j10 = this.f46527f;
            this.f46527f = 1 + j10;
            gVar.v = j10;
            this.f46526c.add(gVar);
        }
        this.d = null;
    }

    public abstract o3.c e();

    public abstract void f(g gVar);

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f46527f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f46526c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f46524a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = d0.f6924a;
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
        ArrayDeque arrayDeque = this.f46525b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f46526c;
            if (!priorityQueue.isEmpty()) {
                int i10 = d0.f6924a;
                if (((g) priorityQueue.peek()).f14227f <= this.e) {
                    g gVar = (g) priorityQueue.poll();
                    boolean d = gVar.d(4);
                    ArrayDeque arrayDeque2 = this.f46524a;
                    if (d) {
                        k kVar = (k) arrayDeque.pollFirst();
                        kVar.a(4);
                        gVar.b();
                        arrayDeque2.add(gVar);
                        return kVar;
                    }
                    f(gVar);
                    if (h()) {
                        o3.c e = e();
                        k kVar2 = (k) arrayDeque.pollFirst();
                        kVar2.k(gVar.f14227f, e, Long.MAX_VALUE);
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
