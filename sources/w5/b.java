package w5;

import java.util.Arrays;
import n6.l;
import org.telegram.ui.ActionBar.b5;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f49929c;
    public final boolean f49930a;
    public final String f49931b;

    static {
        b5 b5Var = new b5(19, (byte) 0);
        b5Var.f20465b = Boolean.FALSE;
        f49929c = new b(b5Var);
    }

    public b(b5 b5Var) {
        this.f49930a = ((Boolean) b5Var.f20465b).booleanValue();
        this.f49931b = (String) b5Var.f20466c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f49930a == bVar.f49930a && l.l(this.f49931b, bVar.f49931b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f49930a), this.f49931b});
    }
}
