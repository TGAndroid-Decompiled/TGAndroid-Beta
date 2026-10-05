package x2;

import b2.l1;
public final class q {
    public final l1 f49256a;
    public final int[] f49257b;

    public q(l1 l1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f49256a = l1Var;
        this.f49257b = iArr;
    }
}
