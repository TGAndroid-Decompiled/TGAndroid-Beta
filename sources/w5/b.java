package w5;

import java.util.Arrays;
import m4.c;
import n6.l;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f47197c;
    public final boolean f47198a;
    public final String f47199b;

    static {
        c cVar = new c(27, (byte) 0);
        cVar.f15392b = Boolean.FALSE;
        f47197c = new b(cVar);
    }

    public b(c cVar) {
        this.f47198a = ((Boolean) cVar.f15392b).booleanValue();
        this.f47199b = (String) cVar.f15393c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.l(null, null) && this.f47198a == bVar.f47198a && l.l(this.f47199b, bVar.f47199b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f47198a), this.f47199b});
    }
}
