package x2;

import b2.p1;
public final class p {
    public final p1 f52947a;
    public final int[] f52948b;

    public p(p1 p1Var, int... iArr) {
        if (iArr.length == 0) {
            e2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f52947a = p1Var;
        this.f52948b = iArr;
    }
}
