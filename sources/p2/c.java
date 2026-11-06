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
    public final long f52980a;
    public final long f52981b;
    public final long f52982c;
    public final boolean d;
    public final long f52983e;
    public final long f52984f;
    public final long f52985g;
    public final long h;
    public final m6 f52986i;
    public final e0 f52987j;
    public final Uri f52988k;
    public final i f52989l;
    public final List f52990m;

    public c(long j3, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, i iVar, m6 m6Var, e0 e0Var, Uri uri, ArrayList arrayList) {
        this.f52980a = j3;
        this.f52981b = j10;
        this.f52982c = j11;
        this.d = z9;
        this.f52983e = j12;
        this.f52984f = j13;
        this.f52985g = j14;
        this.h = j15;
        this.f52989l = iVar;
        this.f52986i = m6Var;
        this.f52988k = uri;
        this.f52987j = e0Var;
        this.f52990m = arrayList;
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
            if (i7 >= this.f52990m.size()) {
                break;
            }
            if (((f1) linkedList.peek()).f10247a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i7);
                List list2 = b10.f53010c;
                f1 f1Var = (f1) linkedList.poll();
                int i10 = f1Var.f10247a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = f1Var.f10248b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f52974c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(f1Var.f10249c));
                        f1Var = (f1) linkedList.poll();
                        if (f1Var.f10247a != i10) {
                            break;
                        }
                    } while (f1Var.f10248b == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f52972a, aVar.f52973b, arrayList3, aVar.d, aVar.f52975e, aVar.f52976f));
                    if (f1Var.f10247a != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(f1Var);
                arrayList.add(new h(b10.f53008a, b10.f53009b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i7++;
        }
        long j12 = j11;
        long j13 = this.f52981b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f52980a, j3, this.f52982c, this.d, this.f52983e, this.f52984f, this.f52985g, this.h, this.f52989l, this.f52986i, this.f52987j, this.f52988k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f52990m.get(i7);
    }

    public final long c(int i7) {
        long j3;
        long j10;
        List list = this.f52990m;
        if (i7 == list.size() - 1) {
            j3 = this.f52981b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).f53009b;
        } else {
            j3 = ((h) list.get(i7 + 1)).f53009b;
            j10 = ((h) list.get(i7)).f53009b;
        }
        return j3 - j10;
    }

    public final long d(int i7) {
        return m0.S(c(i7));
    }
}
