package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.p6;
public final class b extends o6.a implements x8.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);
    public final String f49565a;
    public final List f49566b;

    public b(String str, ArrayList arrayList) {
        this.f49565a = str;
        this.f49566b = arrayList;
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
        List list = bVar.f49566b;
        String str = bVar.f49565a;
        String str2 = this.f49565a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f49566b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f49565a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        List list = this.f49566b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return p6.j("CapabilityInfo{", this.f49565a, ", ", String.valueOf(this.f49566b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f49565a);
        w7.e0.p(parcel, 3, this.f49566b);
        w7.e0.r(parcel, q6);
    }
}
