package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class c1 extends o6.a {
    public static final Parcelable.Creator<c1> CREATOR = new l0(12);
    public final boolean f54237a;
    public final List f54238b;

    public c1(ArrayList arrayList, boolean z10) {
        this.f54237a = z10;
        this.f54238b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && c1.class == obj.getClass()) {
            c1 c1Var = (c1) obj;
            if (this.f54237a == c1Var.f54237a && ((list2 = this.f54238b) == (list = c1Var.f54238b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f54237a), this.f54238b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f54238b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f54237a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.f54237a ? 1 : 0);
        w7.h0.n(parcel, 2, this.f54238b);
        w7.h0.r(parcel, q6);
    }
}
