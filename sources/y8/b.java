package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class b extends o6.a implements x8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f48586a;
    public final List f48587b;

    public b(String str, ArrayList arrayList) {
        this.f48586a = str;
        this.f48587b = arrayList;
        n6.l.h(str);
        n6.l.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f48587b;
        String str = bVar.f48586a;
        String str2 = this.f48586a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f48587b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f48586a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        List list = this.f48587b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return org.telegram.ui.Cells.d0.j("CapabilityInfo{", this.f48586a, ", ", String.valueOf(this.f48587b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.f48586a);
        w7.g0.p(parcel, 3, this.f48587b);
        w7.g0.r(parcel, q6);
    }
}
