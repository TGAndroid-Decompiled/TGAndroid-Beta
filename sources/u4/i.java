package u4;

import f5.d0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import sf.f1;
import t4.k;
public abstract class i implements t4.g {
    public final ArrayDeque f49090a = new ArrayDeque();
    public final ArrayDeque f49091b;
    public final PriorityQueue f49092c;
    public g d;
    public long f49093e;
    public long f49094f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f49090a.add(new t4.j());
        }
        this.f49091b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.f49091b;
            f1 f1Var = new f1(this, 12);
            ?? obj = new Object();
            obj.f49089c = f1Var;
            arrayDeque.add(obj);
        }
        this.f49092c = new PriorityQueue();
    }

    @Override
    public final void a(long j10) {
        this.f49093e = j10;
    }

    public abstract j b();

    public abstract void c(g gVar);

    @Override
    public k dequeueOutputBuffer() {
        ArrayDeque arrayDeque = this.f49091b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f49092c;
            if (!priorityQueue.isEmpty()) {
                int i10 = d0.f6579a;
                if (((g) priorityQueue.peek()).d <= this.f49093e) {
                    g gVar = (g) priorityQueue.poll();
                    boolean isEndOfStream = gVar.isEndOfStream();
                    ArrayDeque arrayDeque2 = this.f49090a;
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
        f5.a.i(z10);
        ArrayDeque arrayDeque = this.f49090a;
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
        this.f49094f = 0L;
        this.f49093e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f49092c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f49090a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = d0.f6579a;
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
        t4.j jVar = (t4.j) obj;
        if (jVar == this.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        g gVar = (g) jVar;
        if (gVar.isDecodeOnly()) {
            gVar.clear();
            this.f49090a.add(gVar);
        } else {
            long j10 = this.f49094f;
            this.f49094f = 1 + j10;
            gVar.f49088r = j10;
            this.f49092c.add(gVar);
        }
        this.d = null;
    }

    @Override
    public void release() {
    }
}
