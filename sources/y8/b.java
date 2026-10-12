package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class b extends o6.a implements x8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f51975a;
    public final List f51976b;

    public b(String str, ArrayList arrayList) {
        this.f51975a = str;
        this.f51976b = arrayList;
        n6.m.h(str);
        n6.m.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f51976b;
        String str = bVar.f51975a;
        String str2 = this.f51975a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f51976b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f51975a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        List list = this.f51976b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return org.telegram.ui.Cells.c1.i("CapabilityInfo{", this.f51975a, ", ", String.valueOf(this.f51976b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.l(parcel, 2, this.f51975a);
        w7.c0.p(parcel, 3, this.f51976b);
        w7.c0.r(parcel, q6);
    }
}
