package x2;

import b2.l1;
public final class r {
    public final l1 f45505a;
    public final int[] f45506b;

    public r(l1 l1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.f("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f45505a = l1Var;
        this.f45506b = iArr;
    }
}
