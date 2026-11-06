package p2;

import a8.ia;
import e2.u;
import h2.m0;
import h9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
public abstract class m {
    public final u f53047a;
    public final i0 f53048b;
    public final long f53049c;
    public final List d;
    public final List f53050e;
    public final List f53051f;
    public final j h;

    public m(u uVar, List list, s sVar, List list2, List list3, List list4) {
        List unmodifiableList;
        ia.f(!list.isEmpty());
        this.f53047a = uVar;
        this.f53048b = i0.q(list);
        if (list2 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list2);
        }
        this.d = unmodifiableList;
        this.f53050e = list3;
        this.f53051f = list4;
        this.h = sVar.a(this);
        long j3 = sVar.f53065c;
        long j10 = sVar.f53064b;
        String str = m0.f14112a;
        this.f53049c = m0.a0(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String b();

    public abstract o2.i c();

    public abstract j f();
}
