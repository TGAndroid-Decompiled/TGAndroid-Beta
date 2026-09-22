package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e1 extends o6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean f46362a;
    public final List f46363b;

    public e1(ArrayList arrayList, boolean z10) {
        this.f46362a = z10;
        this.f46363b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f46362a == e1Var.f46362a && ((list2 = this.f46363b) == (list = e1Var.f46363b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46362a), this.f46363b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46363b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f46362a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.f46362a ? 1 : 0);
        w7.e0.n(parcel, 2, this.f46363b);
        w7.e0.r(parcel, q6);
    }
}
