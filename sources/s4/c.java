package s4;

import android.net.Uri;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements n4.a {
    public final long f46948a;
    public final long f46949b;
    public final long f46950c;
    public final boolean d;
    public final long f46951e;
    public final long f46952f;
    public final long f46953g;
    public final long h;
    public final b6.h f46954i;
    public final t f46955j;
    public final Uri f46956k;
    public final i f46957l;
    public final List f46958m;

    public c(long j10, long j11, long j12, boolean z4, long j13, long j14, long j15, long j16, i iVar, b6.h hVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f46948a = j10;
        this.f46949b = j11;
        this.f46950c = j12;
        this.d = z4;
        this.f46951e = j13;
        this.f46952f = j14;
        this.f46953g = j15;
        this.h = j16;
        this.f46957l = iVar;
        this.f46954i = hVar;
        this.f46956k = uri;
        this.f46955j = tVar;
        this.f46958m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new n4.b(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= this.f46958m.size()) {
                break;
            }
            if (((n4.b) linkedList.peek()).f15239a != i10) {
                long c3 = c(i10);
                if (c3 != -9223372036854775807L) {
                    j12 += c3;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f46977c;
                n4.b bVar = (n4.b) linkedList.poll();
                int i11 = bVar.f15239a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.f15240b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f46942c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f15241c));
                        bVar = (n4.b) linkedList.poll();
                        if (bVar.f15239a != i11) {
                            break;
                        }
                    } while (bVar.f15240b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f46940a, aVar.f46941b, arrayList3, aVar.d, aVar.f46943e, aVar.f46944f));
                    if (bVar.f15239a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.f46975a, b10.f46976b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f46949b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f46948a, j10, this.f46950c, this.d, this.f46951e, this.f46952f, this.f46953g, this.h, this.f46957l, this.f46954i, this.f46955j, this.f46956k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f46958m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f46958m;
        if (i10 == list.size() - 1) {
            long j10 = this.f46949b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - ((h) list.get(i10)).f46976b;
        }
        return ((h) list.get(i10 + 1)).f46976b - ((h) list.get(i10)).f46976b;
    }

    public final long d(int i10) {
        return d0.G(c(i10));
    }
}
