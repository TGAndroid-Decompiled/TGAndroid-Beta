package w5;

import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;
import y5.l;

public abstract class a {

    public final DataHolder f49266a;

    public final int f49267b;

    public final int f49268c;

    public a(DataHolder dataHolder, int i10) {
        l.h(dataHolder);
        this.f49266a = dataHolder;
        boolean z10 = false;
        if (i10 >= 0 && i10 < dataHolder.f3405n) {
            z10 = true;
        }
        l.k(z10);
        this.f49267b = i10;
        this.f49268c = dataHolder.b(i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (l.l(Integer.valueOf(aVar.f49267b), Integer.valueOf(this.f49267b)) && l.l(Integer.valueOf(aVar.f49268c), Integer.valueOf(this.f49268c)) && aVar.f49266a == this.f49266a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49267b), Integer.valueOf(this.f49268c), this.f49266a});
    }
}
