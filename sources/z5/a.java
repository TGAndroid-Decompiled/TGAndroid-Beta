package z5;

import b6.m;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
public abstract class a {
    public final DataHolder f47446a;
    public final int f47447b;
    public final int f47448c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f47446a = dataHolder;
        boolean z4 = false;
        if (i10 >= 0 && i10 < dataHolder.f2910n) {
            z4 = true;
        }
        m.k(z4);
        this.f47447b = i10;
        this.f47448c = dataHolder.e(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f47447b), Integer.valueOf(this.f47447b)) && m.l(Integer.valueOf(aVar.f47448c), Integer.valueOf(this.f47448c)) && aVar.f47446a == this.f47446a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47447b), Integer.valueOf(this.f47448c), this.f47446a});
    }
}
