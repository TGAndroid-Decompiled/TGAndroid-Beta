package p2;

import android.net.Uri;
import e2.e0;
import e2.f1;
import h2.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.m6;
public final class c implements w2.a {
    public final long f53110a;
    public final long f53111b;
    public final long f53112c;
    public final boolean d;
    public final long f53113e;
    public final long f53114f;
    public final long f53115g;
    public final long h;
    public final m6 f53116i;
    public final e0 f53117j;
    public final Uri f53118k;
    public final i f53119l;
    public final List f53120m;

    public c(long j3, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, i iVar, m6 m6Var, e0 e0Var, Uri uri, ArrayList arrayList) {
        this.f53110a = j3;
        this.f53111b = j10;
        this.f53112c = j11;
        this.d = z9;
        this.f53113e = j12;
        this.f53114f = j13;
        this.f53115g = j14;
        this.h = j15;
        this.f53119l = iVar;
        this.f53116i = m6Var;
        this.f53118k = uri;
        this.f53117j = e0Var;
        this.f53120m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j3;
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new f1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i7 = 0;
        while (true) {
            j3 = -9223372036854775807L;
            if (i7 >= this.f53120m.size()) {
                break;
            }
            if (((f1) linkedList.peek()).f10247a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i7);
                List list2 = b10.f53140c;
                f1 f1Var = (f1) linkedList.poll();
                int i10 = f1Var.f10247a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = f1Var.f10248b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f53104c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(f1Var.f10249c));
                        f1Var = (f1) linkedList.poll();
                        if (f1Var.f10247a != i10) {
                            break;
                        }
                    } while (f1Var.f10248b == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f53102a, aVar.f53103b, arrayList3, aVar.d, aVar.f53105e, aVar.f53106f));
                    if (f1Var.f10247a != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(f1Var);
                arrayList.add(new h(b10.f53138a, b10.f53139b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i7++;
        }
        long j12 = j11;
        long j13 = this.f53111b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f53110a, j3, this.f53112c, this.d, this.f53113e, this.f53114f, this.f53115g, this.h, this.f53119l, this.f53116i, this.f53117j, this.f53118k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f53120m.get(i7);
    }

    public final long c(int i7) {
        long j3;
        long j10;
        List list = this.f53120m;
        if (i7 == list.size() - 1) {
            j3 = this.f53111b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).f53139b;
        } else {
            j3 = ((h) list.get(i7 + 1)).f53139b;
            j10 = ((h) list.get(i7)).f53139b;
        }
        return j3 - j10;
    }

    public final long d(int i7) {
        return m0.S(c(i7));
    }
}
