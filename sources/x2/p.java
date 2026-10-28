package x2;

import b2.q1;
public final class p {
    public final q1 f51410a;
    public final int[] f51411b;

    public p(q1 q1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f51410a = q1Var;
        this.f51411b = iArr;
    }
}
