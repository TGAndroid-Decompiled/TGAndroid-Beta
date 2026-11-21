package p2;

import android.net.Uri;
import e2.e0;
import e2.f1;
import h2.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public final class c implements w2.a {
    public final long f55125a;
    public final long f55126b;
    public final long f55127c;
    public final boolean d;
    public final long f55128e;
    public final long f55129f;
    public final long f55130g;
    public final long h;
    public final f5.a f55131i;
    public final e0 f55132j;
    public final Uri f55133k;
    public final i f55134l;
    public final List f55135m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, f5.a aVar, e0 e0Var, Uri uri, ArrayList arrayList) {
        this.f55125a = j3;
        this.f55126b = j10;
        this.f55127c = j11;
        this.d = z10;
        this.f55128e = j12;
        this.f55129f = j13;
        this.f55130g = j14;
        this.h = j15;
        this.f55134l = iVar;
        this.f55131i = aVar;
        this.f55133k = uri;
        this.f55132j = e0Var;
        this.f55135m = arrayList;
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
            if (i7 >= this.f55135m.size()) {
                break;
            }
            if (((f1) linkedList.peek()).f10427a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i7);
                List list2 = b10.f55155c;
                f1 f1Var = (f1) linkedList.poll();
                int i10 = f1Var.f10427a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = f1Var.f10428b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f55119c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(f1Var.f10429c));
                        f1Var = (f1) linkedList.poll();
                        if (f1Var.f10427a != i10) {
                            break;
                        }
                    } while (f1Var.f10428b == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f55117a, aVar.f55118b, arrayList3, aVar.d, aVar.f55120e, aVar.f55121f));
                    if (f1Var.f10427a != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(f1Var);
                arrayList.add(new h(b10.f55153a, b10.f55154b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i7++;
        }
        long j12 = j11;
        long j13 = this.f55126b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f55125a, j3, this.f55127c, this.d, this.f55128e, this.f55129f, this.f55130g, this.h, this.f55134l, this.f55131i, this.f55132j, this.f55133k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f55135m.get(i7);
    }

    public final long c(int i7) {
        long j3;
        long j10;
        List list = this.f55135m;
        if (i7 == list.size() - 1) {
            j3 = this.f55126b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).f55154b;
        } else {
            j3 = ((h) list.get(i7 + 1)).f55154b;
            j10 = ((h) list.get(i7)).f55154b;
        }
        return j3 - j10;
    }

    public final long d(int i7) {
        return l0.S(c(i7));
    }
}
