package yc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import ve.r;
public final class k implements ye.a {
    public final char f54409a;
    public int f54410b = 0;
    public final LinkedList f54411c = new LinkedList();

    public k(char c10) {
        this.f54409a = c10;
    }

    @Override
    public final int a(se.b bVar, se.b bVar2) {
        ye.a aVar;
        int i10 = bVar.f48203g;
        LinkedList linkedList = this.f54411c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (ye.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (ye.a) linkedList.getFirst();
                break;
            }
        }
        return aVar.a(bVar, bVar2);
    }

    @Override
    public final char b() {
        return this.f54409a;
    }

    @Override
    public final void c(r rVar, r rVar2, int i10) {
        ye.a aVar;
        LinkedList linkedList = this.f54411c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (it.hasNext()) {
                aVar = (ye.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            } else {
                aVar = (ye.a) linkedList.getFirst();
                break;
            }
        }
        aVar.c(rVar, rVar2, i10);
    }

    @Override
    public final int d() {
        return this.f54410b;
    }

    @Override
    public final char e() {
        return this.f54409a;
    }

    public final void f(ye.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.f54411c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((ye.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f54409a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.f54410b = d;
    }
}
