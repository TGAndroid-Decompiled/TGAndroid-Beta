package z5;

import b6.m;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
public abstract class a {
    public final DataHolder f47382a;
    public final int f47383b;
    public final int f47384c;

    public a(DataHolder dataHolder, int i10) {
        m.h(dataHolder);
        this.f47382a = dataHolder;
        boolean z4 = false;
        if (i10 >= 0 && i10 < dataHolder.f2927n) {
            z4 = true;
        }
        m.k(z4);
        this.f47383b = i10;
        this.f47384c = dataHolder.e(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (m.l(Integer.valueOf(aVar.f47383b), Integer.valueOf(this.f47383b)) && m.l(Integer.valueOf(aVar.f47384c), Integer.valueOf(this.f47384c)) && aVar.f47382a == this.f47382a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47383b), Integer.valueOf(this.f47384c), this.f47382a});
    }
}
