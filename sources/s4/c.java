package s4;

import android.net.Uri;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements n4.a {
    public final long f44051a;
    public final long f44052b;
    public final long f44053c;
    public final boolean d;
    public final long e;
    public final long f44054f;
    public final long f44055g;
    public final long h;
    public final b6.h f44056i;
    public final t f44057j;
    public final Uri f44058k;
    public final i f44059l;
    public final List f44060m;

    public c(long j10, long j11, long j12, boolean z4, long j13, long j14, long j15, long j16, i iVar, b6.h hVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f44051a = j10;
        this.f44052b = j11;
        this.f44053c = j12;
        this.d = z4;
        this.e = j13;
        this.f44054f = j14;
        this.f44055g = j15;
        this.h = j16;
        this.f44059l = iVar;
        this.f44056i = hVar;
        this.f44058k = uri;
        this.f44057j = tVar;
        this.f44060m = arrayList;
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
            if (i10 >= this.f44060m.size()) {
                break;
            }
            if (((n4.b) linkedList.peek()).f14246a != i10) {
                long c3 = c(i10);
                if (c3 != -9223372036854775807L) {
                    j12 += c3;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f44077c;
                n4.b bVar = (n4.b) linkedList.poll();
                int i11 = bVar.f14246a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.f14247b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f44046c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f14248c));
                        bVar = (n4.b) linkedList.poll();
                        if (bVar.f14246a != i11) {
                            break;
                        }
                    } while (bVar.f14247b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f44044a, aVar.f44045b, arrayList3, aVar.d, aVar.e, aVar.f44047f));
                    if (bVar.f14246a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.f44075a, b10.f44076b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f44052b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f44051a, j10, this.f44053c, this.d, this.e, this.f44054f, this.f44055g, this.h, this.f44059l, this.f44056i, this.f44057j, this.f44058k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f44060m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f44060m;
        if (i10 == list.size() - 1) {
            long j10 = this.f44052b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - ((h) list.get(i10)).f44076b;
        }
        return ((h) list.get(i10 + 1)).f44076b - ((h) list.get(i10)).f44076b;
    }

    public final long d(int i10) {
        return d0.G(c(i10));
    }
}
