package v5;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import x5.l;
public abstract class a {
    public final DataHolder f48356a;
    public final int f48357b;
    public final int f48358c;

    public a(DataHolder dataHolder, int i9) {
        l.h(dataHolder);
        this.f48356a = dataHolder;
        boolean z10 = false;
        if (i9 >= 0 && i9 < dataHolder.f2960n) {
            z10 = true;
        }
        l.k(z10);
        this.f48357b = i9;
        this.f48358c = dataHolder.b(i9);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f48357b), Integer.valueOf(this.f48357b)) && l.l(Integer.valueOf(aVar.f48358c), Integer.valueOf(this.f48358c)) && aVar.f48356a == this.f48356a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48357b), Integer.valueOf(this.f48358c), this.f48356a});
    }
}
