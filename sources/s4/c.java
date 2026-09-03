package s4;

import android.net.Uri;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements n4.a {
    public final long f46979a;
    public final long f46980b;
    public final long f46981c;
    public final boolean d;
    public final long f46982e;
    public final long f46983f;
    public final long f46984g;
    public final long h;
    public final b6.h f46985i;
    public final t f46986j;
    public final Uri f46987k;
    public final i f46988l;
    public final List f46989m;

    public c(long j10, long j11, long j12, boolean z4, long j13, long j14, long j15, long j16, i iVar, b6.h hVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f46979a = j10;
        this.f46980b = j11;
        this.f46981c = j12;
        this.d = z4;
        this.f46982e = j13;
        this.f46983f = j14;
        this.f46984g = j15;
        this.h = j16;
        this.f46988l = iVar;
        this.f46985i = hVar;
        this.f46987k = uri;
        this.f46986j = tVar;
        this.f46989m = arrayList;
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
            if (i10 >= this.f46989m.size()) {
                break;
            }
            if (((n4.b) linkedList.peek()).f15241a != i10) {
                long c3 = c(i10);
                if (c3 != -9223372036854775807L) {
                    j12 += c3;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f47008c;
                n4.b bVar = (n4.b) linkedList.poll();
                int i11 = bVar.f15241a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.f15242b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f46973c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f15243c));
                        bVar = (n4.b) linkedList.poll();
                        if (bVar.f15241a != i11) {
                            break;
                        }
                    } while (bVar.f15242b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f46971a, aVar.f46972b, arrayList3, aVar.d, aVar.f46974e, aVar.f46975f));
                    if (bVar.f15241a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.f47006a, b10.f47007b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f46980b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f46979a, j10, this.f46981c, this.d, this.f46982e, this.f46983f, this.f46984g, this.h, this.f46988l, this.f46985i, this.f46986j, this.f46987k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f46989m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f46989m;
        if (i10 == list.size() - 1) {
            long j10 = this.f46980b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - ((h) list.get(i10)).f47007b;
        }
        return ((h) list.get(i10 + 1)).f47007b - ((h) list.get(i10)).f47007b;
    }

    public final long d(int i10) {
        return d0.G(c(i10));
    }
}
