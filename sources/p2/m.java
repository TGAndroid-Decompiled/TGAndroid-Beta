package p2;

import a8.ja;
import e2.u;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final u f54556a;
    public final i0 f54557b;
    public final long f54558c;
    public final List d;
    public final List f54559e;
    public final List f54560f;
    public final j h;

    public m(u uVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        ja.f(!list.isEmpty());
        this.f54556a = uVar;
        this.f54557b = i0.q(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f54559e = list3;
        this.f54560f = list4;
        this.h = sVar.a(this);
        long j3 = sVar.f54574c;
        long j10 = sVar.f54573b;
        String str = l0.f13471a;
        this.f54558c = l0.a0(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract o2.i c();

    public abstract j d();
}
