package z8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.b10;
public final class c extends p6.a implements y8.a {
    public static final Parcelable.Creator<c> CREATOR = new d(0);
    public final String f52700a;
    public final List f52701b;

    public c(String str, ArrayList arrayList) {
        this.f52700a = str;
        this.f52701b = arrayList;
        o6.l.h(str);
        o6.l.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        List list = cVar.f52701b;
        String str = cVar.f52700a;
        String str2 = this.f52700a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        List list2 = this.f52701b;
        if (list2 == null ? list == null : list2.equals(list)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f52700a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (i10 + 31) * 31;
        List list = this.f52701b;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return b10.k("CapabilityInfo{", this.f52700a, ", ", String.valueOf(this.f52701b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f52700a);
        df.p(parcel, 3, this.f52701b);
        df.r(parcel, q5);
    }
}
