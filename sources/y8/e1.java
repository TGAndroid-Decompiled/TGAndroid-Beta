package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e1 extends o6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean f48614a;
    public final List f48615b;

    public e1(ArrayList arrayList, boolean z10) {
        this.f48614a = z10;
        this.f48615b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f48614a == e1Var.f48614a && ((list2 = this.f48615b) == (list = e1Var.f48615b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48614a), this.f48615b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48615b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f48614a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.s(parcel, 1, 4);
        parcel.writeInt(this.f48614a ? 1 : 0);
        w7.g0.n(parcel, 2, this.f48615b);
        w7.g0.r(parcel, q6);
    }
}
