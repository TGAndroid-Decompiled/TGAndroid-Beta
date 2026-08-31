package s4;

import h5.d0;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.Collections;
import java.util.List;
import s8.v;
public abstract class m {
    public final n0 f46988a;
    public final v f46989b;
    public final long f46990c;
    public final List d;
    public final List f46991e;
    public final List f46992f;
    public final j h;

    public m(n0 n0Var, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        h5.a.f(!list.isEmpty());
        this.f46988a = n0Var;
        this.f46989b = v.t(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f46991e = list3;
        this.f46992f = list4;
        this.h = sVar.a(this);
        this.f46990c = d0.N(sVar.f47006c, 1000000L, sVar.f47005b);
    }

    public abstract String b();

    public abstract r4.h c();

    public abstract j d();
}
