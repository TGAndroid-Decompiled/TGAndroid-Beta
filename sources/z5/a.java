package z5;

import b6.m;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
public abstract class a {
    public final DataHolder f51118a;
    public final int f51119b;
    public final int f51120c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f51118a = dataHolder;
        boolean z4 = false;
        if (i10 >= 0 && i10 < dataHolder.f2870n) {
            z4 = true;
        }
        m.k(z4);
        this.f51119b = i10;
        this.f51120c = dataHolder.e(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f51119b), Integer.valueOf(this.f51119b)) && m.l(Integer.valueOf(aVar.f51120c), Integer.valueOf(this.f51120c)) && aVar.f51118a == this.f51118a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f51119b), Integer.valueOf(this.f51120c), this.f51118a});
    }
}
