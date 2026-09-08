package x2;

import b2.l1;
public final class q {
    public final l1 f48788a;
    public final int[] f48789b;

    public q(l1 l1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f48788a = l1Var;
        this.f48789b = iArr;
    }
}
