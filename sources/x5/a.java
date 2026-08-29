package x5;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import z5.l;
public abstract class a {
    public final DataHolder f50094a;
    public final int f50095b;
    public final int f50096c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f50094a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f3974n) {
            z10 = true;
        }
        l.k(z10);
        this.f50095b = i10;
        this.f50096c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f50095b), Integer.valueOf(this.f50095b)) && l.l(Integer.valueOf(aVar.f50096c), Integer.valueOf(this.f50096c)) && aVar.f50094a == this.f50094a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50095b), Integer.valueOf(this.f50096c), this.f50094a});
    }
}
