package w5;

import java.util.Arrays;
import n6.l;
import n7.z0;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f48038c;
    public final boolean f48039a;
    public final String f48040b;

    static {
        z0 z0Var = new z0(21, false);
        z0Var.f16703b = Boolean.FALSE;
        f48038c = new b(z0Var);
    }

    public b(z0 z0Var) {
        this.f48039a = ((Boolean) z0Var.f16703b).booleanValue();
        this.f48040b = (String) z0Var.f16704c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f48039a == bVar.f48039a && l.l(this.f48040b, bVar.f48040b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f48039a), this.f48040b});
    }
}
