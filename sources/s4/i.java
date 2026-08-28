package s4;

import d5.f0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kh.p;
import r4.k;
public abstract class i implements r4.g {
    public final ArrayDeque f47426a = new ArrayDeque();
    public final ArrayDeque f47427b;
    public final PriorityQueue f47428c;
    public g d;
    public long f47429e;
    public long f47430f;

    public i() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.f47426a.add(new r4.j());
        }
        this.f47427b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f47427b;
            p pVar = new p(this, 29);
            ?? obj = new Object();
            obj.f47425c = pVar;
            arrayDeque.add(obj);
        }
        this.f47428c = new PriorityQueue();
    }

    @Override
    public final void a(long j10) {
        this.f47429e = j10;
    }

    public abstract j b();

    public abstract void c(g gVar);

    @Override
    public k dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f47427b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f47428c;
            if (!priorityQueue.isEmpty()) {
                int i9 = f0.f4349a;
                if (((g) priorityQueue.peek()).d <= this.f47429e) {
                    g gVar = (g) priorityQueue.poll();
                    boolean isEndOfStream = gVar.isEndOfStream();
                    ArrayDeque arrayDeque2 = this.f47426a;
                    if (isEndOfStream) {
                        k kVar = (k) arrayDeque.pollFirst();
                        kVar.addFlag(4);
                        gVar.clear();
                        arrayDeque2.add(gVar);
                        return kVar;
                    }
                    c(gVar);
                    if (e()) {
                        j b10 = b();
                        k kVar2 = (k) arrayDeque.pollFirst();
                        kVar2.a(gVar.d, b10, Long.MAX_VALUE);
                        gVar.clear();
                        arrayDeque2.add(gVar);
                        return kVar2;
                    }
                    gVar.clear();
                    arrayDeque2.add(gVar);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    @Override
    public final Object dequeueInputBuffer() {
        boolean z10;
        if (this.d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.i(z10);
        ArrayDeque arrayDeque = this.f47426a;
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
        this.f47430f = 0L;
        this.f47429e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f47428c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f47426a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i9 = f0.f4349a;
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
        boolean z10;
        r4.j jVar = (r4.j) obj;
        if (jVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        g gVar = (g) jVar;
        if (gVar.isDecodeOnly()) {
            gVar.clear();
            this.f47426a.add(gVar);
        } else {
            long j10 = this.f47430f;
            this.f47430f = 1 + j10;
            gVar.f47424r = j10;
            this.f47428c.add(gVar);
        }
        this.d = null;
    }

    @Override
    public void release() {
    }
}
