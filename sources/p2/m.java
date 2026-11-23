package p2;

import a8.la;
import e2.u;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final u f55170a;
    public final i0 f55171b;
    public final long f55172c;
    public final List d;
    public final List f55173e;
    public final List f55174f;
    public final j h;

    public m(u uVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        la.f(!list.isEmpty());
        this.f55170a = uVar;
        this.f55171b = i0.q(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f55173e = list3;
        this.f55174f = list4;
        this.h = sVar.a(this);
        long j3 = sVar.f55188c;
        long j10 = sVar.f55187b;
        String str = l0.f13815a;
        this.f55172c = l0.a0(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract o2.i c();

    public abstract j d();
}
