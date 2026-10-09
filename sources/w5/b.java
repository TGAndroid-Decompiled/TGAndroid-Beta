package w5;

import java.util.Arrays;
import n6.l;
import org.telegram.ui.ActionBar.b5;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f49883c;
    public final boolean f49884a;
    public final String f49885b;

    static {
        b5 b5Var = new b5(19, (byte) 0);
        b5Var.f20461b = Boolean.FALSE;
        f49883c = new b(b5Var);
    }

    public b(b5 b5Var) {
        this.f49884a = ((Boolean) b5Var.f20461b).booleanValue();
        this.f49885b = (String) b5Var.f20462c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f49884a == bVar.f49884a && l.l(this.f49885b, bVar.f49885b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f49884a), this.f49885b});
    }
}
