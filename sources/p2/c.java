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
    public final long f54515a;
    public final long f54516b;
    public final long f54517c;
    public final boolean d;
    public final long f54518e;
    public final long f54519f;
    public final long f54520g;
    public final long h;
    public final f5.a f54521i;
    public final e0 f54522j;
    public final Uri f54523k;
    public final i f54524l;
    public final List f54525m;

    public c(long j3, long j10, long j11, boolean z10, long j12, long j13, long j14, long j15, i iVar, f5.a aVar, e0 e0Var, Uri uri, ArrayList arrayList) {
        this.f54515a = j3;
        this.f54516b = j10;
        this.f54517c = j11;
        this.d = z10;
        this.f54518e = j12;
        this.f54519f = j13;
        this.f54520g = j14;
        this.h = j15;
        this.f54524l = iVar;
        this.f54521i = aVar;
        this.f54523k = uri;
        this.f54522j = e0Var;
        this.f54525m = arrayList;
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
            if (i7 >= this.f54525m.size()) {
                break;
            }
            if (((f1) linkedList.peek()).f10083a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j11 += c10;
                }
            } else {
                h b10 = b(i7);
                List list2 = b10.f54545c;
                f1 f1Var = (f1) linkedList.poll();
                int i10 = f1Var.f10083a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = f1Var.f10084b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.f54509c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(f1Var.f10085c));
                        f1Var = (f1) linkedList.poll();
                        if (f1Var.f10083a != i10) {
                            break;
                        }
                    } while (f1Var.f10084b == i11);
                    j10 = j11;
                    arrayList2.add(new a(aVar.f54507a, aVar.f54508b, arrayList3, aVar.d, aVar.f54510e, aVar.f54511f));
                    if (f1Var.f10083a != i10) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(f1Var);
                arrayList.add(new h(b10.f54543a, b10.f54544b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i7++;
        }
        long j12 = j11;
        long j13 = this.f54516b;
        if (j13 != -9223372036854775807L) {
            j3 = j13 - j12;
        }
        return new c(this.f54515a, j3, this.f54517c, this.d, this.f54518e, this.f54519f, this.f54520g, this.h, this.f54524l, this.f54521i, this.f54522j, this.f54523k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.f54525m.get(i7);
    }

    public final long c(int i7) {
        long j3;
        long j10;
        List list = this.f54525m;
        if (i7 == list.size() - 1) {
            j3 = this.f54516b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).f54544b;
        } else {
            j3 = ((h) list.get(i7 + 1)).f54544b;
            j10 = ((h) list.get(i7)).f54544b;
        }
        return j3 - j10;
    }

    public final long d(int i7) {
        return l0.S(c(i7));
    }
}
