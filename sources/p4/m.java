package p4;

import f5.d0;
import j$.util.DesugarCollections;
import j3.t0;
import java.util.Collections;
import java.util.List;
import q8.z;
public abstract class m {
    public final t0 f45579a;
    public final z f45580b;
    public final long f45581c;
    public final List d;
    public final List f45582e;
    public final List f45583f;
    public final j h;

    public m(t0 t0Var, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        f5.a.f(!list.isEmpty());
        this.f45579a = t0Var;
        this.f45580b = z.u(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f45582e = list3;
        this.f45583f = list4;
        this.h = sVar.a(this);
        this.f45581c = d0.O(sVar.f45597c, 1000000L, sVar.f45596b);
    }

    public abstract String a();

    public abstract o4.i c();

    public abstract j d();
}
