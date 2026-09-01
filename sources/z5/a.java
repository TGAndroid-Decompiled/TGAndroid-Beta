package z5;

import b6.m;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
public abstract class a {
    public final DataHolder f51083a;
    public final int f51084b;
    public final int f51085c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f51083a = dataHolder;
        boolean z4 = false;
        if (i10 >= 0 && i10 < dataHolder.f2870n) {
            z4 = true;
        }
        m.k(z4);
        this.f51084b = i10;
        this.f51085c = dataHolder.e(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f51084b), Integer.valueOf(this.f51084b)) && m.l(Integer.valueOf(aVar.f51085c), Integer.valueOf(this.f51085c)) && aVar.f51083a == this.f51083a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f51084b), Integer.valueOf(this.f51085c), this.f51083a});
    }
}
