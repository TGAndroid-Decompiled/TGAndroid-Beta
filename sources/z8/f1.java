package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public final class f1 extends p6.a {
    public static final Parcelable.Creator<f1> CREATOR = new o0(12);
    public final boolean f52728a;
    public final List f52729b;

    public f1(ArrayList arrayList, boolean z10) {
        this.f52728a = z10;
        this.f52729b = arrayList;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj != null && f1.class == obj.getClass()) {
            f1 f1Var = (f1) obj;
            if (this.f52728a == f1Var.f52728a && ((list2 = this.f52729b) == (list = f1Var.f52729b) || (list2 != null && list2.equals(list)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f52728a), this.f52729b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f52729b);
        return "AppWearDetailsParcelable{isWatchface=" + this.f52728a + ", watchfaceCategories=" + valueOf + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.f52728a ? 1 : 0);
        df.n(parcel, 2, this.f52729b);
        df.r(parcel, q5);
    }
}
