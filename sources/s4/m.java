package s4;

import h5.d0;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.Collections;
import java.util.List;
import s8.v;
public abstract class m {
    public final n0 f44022a;
    public final v f44023b;
    public final long f44024c;
    public final List d;
    public final List e;
    public final List f44025f;
    public final j h;

    public m(n0 n0Var, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        h5.a.f(!list.isEmpty());
        this.f44022a = n0Var;
        this.f44023b = v.t(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.e = list3;
        this.f44025f = list4;
        this.h = sVar.a(this);
        this.f44024c = d0.N(sVar.f44037c, 1000000L, sVar.f44036b);
    }

    public abstract String b();

    public abstract r4.h c();

    public abstract j d();
}
