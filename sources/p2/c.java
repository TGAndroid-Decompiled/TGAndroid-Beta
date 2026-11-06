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
    public final long f53004a;
    public final long f53005b;
    public final long f53006c;
    public final boolean d;
    public final long f53007e;
    public final long f53008f;
    public final long f53009g;
    public final long h;
    public final m6 f53010i;
    public final e0 f53011j;
    public final Uri f53012k;
    public final i f53013l;
    public final List f53014m;

    public c(long j3, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, i iVar, m6 m6Var, e0 e0Var, Uri uri, ArrayList arrayList) {
        this.f53004a = j3;
        this.f53005b = j10;
        this.f53006c = j11;
        this.d = z9;
        this.f53007e = j12;
        this.f53008f = j13;
        this.f53009g = j14;
        this.h = j15;
        this.f53013l = iVar;
        this.f53010i = m6Var;
        this.f53012k = uri;
        this.f53011j = e0Var;
        this.f53014m = arrayList;
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
            if (i7 >= this.f53014m.size()) {
                break;
            }
            if (((f1) linkedList.peek()).f10247a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i7);
                List list2 = b10.f53034c;
                f1 f1Var = (f1) linkedList.poll();
                int i10 = f1Var.f10247a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = f1Var.f10248b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f52998c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(f1Var.f10249c));
                        f1Var = (f1) linkedList.poll();
                        if (f1Var.f10247a != i10) {
                            break;
                        }
                    } while (f1Var.f10248b == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f52996a, aVar.f52997b, arrayList3, aVar.d, aVar.f52999e, aVar.f53000f));
                    if (f1Var.f10247a != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(f1Var);
                arrayList.add(new h(b10.f53032a, b10.f53033b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i7++;
        }
        long j12 = j11;
        long j13 = this.f53005b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f53004a, j3, this.f53006c, this.d, this.f53007e, this.f53008f, this.f53009g, this.h, this.f53013l, this.f53010i, this.f53011j, this.f53012k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f53014m.get(i7);
    }

    public final long c(int i7) {
        long j3;
        long j10;
        List list = this.f53014m;
        if (i7 == list.size() - 1) {
            j3 = this.f53005b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).f53033b;
        } else {
            j3 = ((h) list.get(i7 + 1)).f53033b;
            j10 = ((h) list.get(i7)).f53033b;
        }
        return j3 - j10;
    }

    public final long d(int i7) {
        return m0.S(c(i7));
    }
}
