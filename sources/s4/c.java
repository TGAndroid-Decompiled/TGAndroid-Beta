package s4;

import android.net.Uri;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements n4.a {
    public final long f43986a;
    public final long f43987b;
    public final long f43988c;
    public final boolean d;
    public final long e;
    public final long f43989f;
    public final long f43990g;
    public final long h;
    public final b6.h f43991i;
    public final t f43992j;
    public final Uri f43993k;
    public final i f43994l;
    public final List f43995m;

    public c(long j10, long j11, long j12, boolean z4, long j13, long j14, long j15, long j16, i iVar, b6.h hVar, t tVar, Uri uri, ArrayList arrayList) {
        this.f43986a = j10;
        this.f43987b = j11;
        this.f43988c = j12;
        this.d = z4;
        this.e = j13;
        this.f43989f = j14;
        this.f43990g = j15;
        this.h = j16;
        this.f43994l = iVar;
        this.f43991i = hVar;
        this.f43993k = uri;
        this.f43992j = tVar;
        this.f43995m = arrayList;
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
            if (i10 >= this.f43995m.size()) {
                break;
            }
            if (((n4.b) linkedList.peek()).f14261a != i10) {
                long c3 = c(i10);
                if (c3 != -9223372036854775807L) {
                    j12 += c3;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f44012c;
                n4.b bVar = (n4.b) linkedList.poll();
                int i11 = bVar.f14261a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.f14262b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f43981c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f14263c));
                        bVar = (n4.b) linkedList.poll();
                        if (bVar.f14261a != i11) {
                            break;
                        }
                    } while (bVar.f14262b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f43979a, aVar.f43980b, arrayList3, aVar.d, aVar.e, aVar.f43982f));
                    if (bVar.f14261a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.f44010a, b10.f44011b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f43987b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        return new c(this.f43986a, j10, this.f43988c, this.d, this.e, this.f43989f, this.f43990g, this.h, this.f43994l, this.f43991i, this.f43992j, this.f43993k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f43995m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f43995m;
        if (i10 == list.size() - 1) {
            long j10 = this.f43987b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - ((h) list.get(i10)).f44011b;
        }
        return ((h) list.get(i10 + 1)).f44011b - ((h) list.get(i10)).f44011b;
    }

    public final long d(int i10) {
        return d0.G(c(i10));
    }
}
