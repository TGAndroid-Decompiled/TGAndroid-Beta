package z2;

import d2.o1;
public final class o {
    public final o1 f59636a;
    public final int[] f59637b;

    public o(o1 o1Var, int... iArr) {
        if (iArr.length == 0) {
            g2.a.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f59636a = o1Var;
        this.f59637b = iArr;
    }
}
