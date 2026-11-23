package p2;

import a8.ma;
import e2.u;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final u f55251a;
    public final i0 f55252b;
    public final long f55253c;
    public final List d;
    public final List f55254e;
    public final List f55255f;
    public final j h;

    public m(u uVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        ma.f(!list.isEmpty());
        this.f55251a = uVar;
        this.f55252b = i0.q(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f55254e = list3;
        this.f55255f = list4;
        this.h = sVar.a(this);
        long j3 = sVar.f55269c;
        long j10 = sVar.f55268b;
        String str = l0.f13778a;
        this.f55253c = l0.a0(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract o2.i d();

    public abstract j h();
}
