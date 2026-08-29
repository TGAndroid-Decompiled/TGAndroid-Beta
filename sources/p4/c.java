package p4;

import android.net.Uri;
import f5.d0;
import j3.a1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements k4.a {
    public final long f45539a;
    public final long f45540b;
    public final long f45541c;
    public final boolean d;
    public final long f45542e;
    public final long f45543f;
    public final long f45544g;
    public final long h;
    public final d9.c f45545i;
    public final a1 f45546j;
    public final Uri f45547k;
    public final i f45548l;
    public final List f45549m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, i iVar, d9.c cVar, a1 a1Var, Uri uri, ArrayList arrayList) {
        this.f45539a = j10;
        this.f45540b = j11;
        this.f45541c = j12;
        this.d = z10;
        this.f45542e = j13;
        this.f45543f = j14;
        this.f45544g = j15;
        this.h = j16;
        this.f45548l = iVar;
        this.f45545i = cVar;
        this.f45547k = uri;
        this.f45546j = a1Var;
        this.f45549m = arrayList;
    }

    @Override
    public final Object a(List list) {
        long j10;
        long j11;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new k4.b());
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= this.f45549m.size()) {
                break;
            }
            if (((k4.b) linkedList.peek()).f13446a != i10) {
                long c3 = c(i10);
                if (c3 != -9223372036854775807L) {
                    j12 += c3;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.f45568c;
                k4.b bVar = (k4.b) linkedList.poll();
                int i11 = bVar.f13446a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.f13447b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f45533c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.f13448c));
                        bVar = (k4.b) linkedList.poll();
                        if (bVar.f13446a != i11) {
                            break;
                        }
                    } while (bVar.f13447b == i12);
                    j11 = j12;
                    arrayList2.add(new a(aVar.f45531a, aVar.f45532b, arrayList3, aVar.d, aVar.f45534e, aVar.f45535f));
                    if (bVar.f13446a != i11) {
                        break;
                    }
                    j12 = j11;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.f45566a, b10.f45567b - j11, arrayList2, b10.d));
                j12 = j11;
            }
            i10++;
        }
        long j13 = j12;
        long j14 = this.f45540b;
        if (j14 != -9223372036854775807L) {
            j10 = j14 - j13;
        }
        a1 a1Var = this.f45546j;
        Uri uri = this.f45547k;
        return new c(this.f45539a, j10, this.f45541c, this.d, this.f45542e, this.f45543f, this.f45544g, this.h, this.f45548l, this.f45545i, a1Var, uri, arrayList);
    }

    public final h b(int i10) {
        return (h) this.f45549m.get(i10);
    }

    public final long c(int i10) {
        List list = this.f45549m;
        if (i10 == list.size() - 1) {
            long j10 = this.f45540b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return j10 - ((h) list.get(i10)).f45567b;
        }
        return ((h) list.get(i10 + 1)).f45567b - ((h) list.get(i10)).f45567b;
    }

    public final long d(int i10) {
        return d0.H(c(i10));
    }
}
