package x2;

import b2.q1;
public final class o {
    public final q1 f47782a;
    public final int[] f47783b;

    public o(q1 q1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f47782a = q1Var;
        this.f47783b = iArr;
    }
}
