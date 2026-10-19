package x2;

import b2.p1;
public final class o {
    public final p1 f49170a;
    public final int[] f49171b;

    public o(p1 p1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f49170a = p1Var;
        this.f49171b = iArr;
    }
}
