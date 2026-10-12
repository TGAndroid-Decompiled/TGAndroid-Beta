package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f49824a;
    public final Boolean f49825b;
    public final Boolean f49826c;
    public final Boolean d;
    public final Boolean e;

    public ve(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f49824a = (Boolean) z5Var.f5426b;
        this.f49825b = (Boolean) z5Var.f5427c;
        this.f49826c = (Boolean) z5Var.f5425a;
        this.d = (Boolean) z5Var.d;
        this.e = (Boolean) z5Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f49824a, veVar.f49824a) && n6.l.l(this.f49825b, veVar.f49825b) && n6.l.l(this.f49826c, veVar.f49826c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49824a, this.f49825b, this.f49826c, this.d, this.e});
    }
}
