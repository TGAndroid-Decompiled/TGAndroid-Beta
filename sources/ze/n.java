package ze;

import cf.s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public final class n implements ff.a {
    public final char f54559a;
    public int f54560b = 0;
    public final LinkedList f54561c = new LinkedList();

    public n(char c10) {
        this.f54559a = c10;
    }

    @Override
    public final int a(b bVar, b bVar2) {
        ff.a aVar;
        int i10 = bVar.f54496g;
        LinkedList linkedList = this.f54561c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (ff.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (ff.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.a(bVar, bVar2);
    }

    @Override
    public final void b(s sVar, s sVar2, int i10) {
        ff.a aVar;
        LinkedList linkedList = this.f54561c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (ff.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (ff.a) linkedList.getFirst();
                break;
            }
        }
        aVar.b(sVar, sVar2, i10);
    }

    @Override
    public final char c() {
        return this.f54559a;
    }

    @Override
    public final int d() {
        return this.f54560b;
    }

    @Override
    public final char e() {
        return this.f54559a;
    }

    public final void f(ff.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f54561c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((ff.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f54559a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f54560b = d;
    }
}
