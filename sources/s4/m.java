package s4;

import h5.d0;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.Collections;
import java.util.List;
import s8.v;
public abstract class m {
    public final n0 f47019a;
    public final v f47020b;
    public final long f47021c;
    public final List d;
    public final List f47022e;
    public final List f47023f;
    public final j h;

    public m(n0 n0Var, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        h5.a.f(!list.isEmpty());
        this.f47019a = n0Var;
        this.f47020b = v.t(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f47022e = list3;
        this.f47023f = list4;
        this.h = sVar.a(this);
        this.f47021c = d0.N(sVar.f47037c, 1000000L, sVar.f47036b);
    }

    public abstract String b();

    public abstract r4.h c();

    public abstract j d();
}
