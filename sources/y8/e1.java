package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class e1 extends o6.a {
    public static final Parcelable.Creator<e1> CREATOR = new n0(12);
    public final boolean f46621a;
    public final List f46622b;

    public e1(ArrayList arrayList, boolean z10) {
        this.f46621a = z10;
        this.f46622b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (this.f46621a == e1Var.f46621a && ((list2 = this.f46622b) == (list = e1Var.f46622b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f46621a), this.f46622b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46622b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f46621a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46621a ? 1 : 0);
        w7.f0.n(parcel, 2, this.f46622b);
        w7.f0.r(parcel, q6);
    }
}
