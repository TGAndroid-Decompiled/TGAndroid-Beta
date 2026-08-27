package s4;

import d5.g0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import lh.p;
import r4.k;
import r4.l;

public abstract class i implements r4.h {

    public final ArrayDeque f47790a = new ArrayDeque();

    public final ArrayDeque f47791b;

    public final PriorityQueue f47792c;
    public g d;

    public long f47793e;

    public long f47794f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f47790a.add(new g());
        }
        this.f47791b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f47791b;
            p pVar = new p(this, 29);
            h hVar = new h();
            hVar.f47789c = pVar;
            arrayDeque.add(hVar);
        }
        this.f47792c = new PriorityQueue();
    }

    @Override
    public final void a(long j10) {
        this.f47793e = j10;
    }

    public abstract a5.b b();

    public abstract void c(g gVar);

    @Override
    public l dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f47791b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f47792c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            g gVar = (g) priorityQueue.peek();
            int i10 = g0.f4795a;
            if (gVar.d > this.f47793e) {
                return null;
            }
            g gVar2 = (g) priorityQueue.poll();
            boolean zIsEndOfStream = gVar2.isEndOfStream();
            ArrayDeque arrayDeque2 = this.f47790a;
            if (zIsEndOfStream) {
                l lVar = (l) arrayDeque.pollFirst();
                lVar.addFlag(4);
                gVar2.clear();
                arrayDeque2.add(gVar2);
                return lVar;
            }
            c(gVar2);
            if (e()) {
                a5.b bVarB = b();
                l lVar2 = (l) arrayDeque.pollFirst();
                lVar2.a(gVar2.d, bVarB, Long.MAX_VALUE);
                gVar2.clear();
                arrayDeque2.add(gVar2);
                return lVar2;
            }
            gVar2.clear();
            arrayDeque2.add(gVar2);
        }
    }

    @Override
    public final Object dequeueInputBuffer() {
        d5.a.i(this.d == null);
        ArrayDeque arrayDeque = this.f47790a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.d = gVar;
        return gVar;
    }

    public abstract boolean e();

    @Override
    public void flush() {
        ArrayDeque arrayDeque;
        this.f47794f = 0L;
        this.f47793e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f47792c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f47790a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = g0.f4795a;
            gVar.clear();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.clear();
            arrayDeque.add(gVar2);
            this.d = null;
        }
    }

    @Override
    public final void queueInputBuffer(Object obj) {
        k kVar = (k) obj;
        d5.a.f(kVar == this.d);
        g gVar = (g) kVar;
        if (gVar.isDecodeOnly()) {
            gVar.clear();
            this.f47790a.add(gVar);
        } else {
            long j10 = this.f47794f;
            this.f47794f = 1 + j10;
            gVar.f47788r = j10;
            this.f47792c.add(gVar);
        }
        this.d = null;
    }

    @Override
    public void release() {
    }
}
