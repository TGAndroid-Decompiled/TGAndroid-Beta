package z5;

import java.util.Arrays;
import q6.m;
public final class b implements com.google.android.gms.common.api.b {
    public static final b f61609c;
    public final boolean f61610a;
    public final String f61611b;

    static {
        t1.a aVar = new t1.a(10, (byte) 0);
        aVar.f57641b = Boolean.FALSE;
        f61609c = new b(aVar);
    }

    public b(t1.a aVar) {
        this.f61610a = ((Boolean) aVar.f57641b).booleanValue();
        this.f61611b = (String) aVar.f57642c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (m.l(null, null) && this.f61610a == bVar.f61610a && m.l(this.f61611b, bVar.f61611b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f61610a), this.f61611b});
    }
}
