package q6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new q4.x(1);
    public final int f53770a;
    public final String f53771b;

    public e(int i7, String str) {
        this.f53770a = i7;
        this.f53771b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (eVar.f53770a == this.f53770a && m.k(eVar.f53771b, this.f53771b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f53770a;
    }

    public final String toString() {
        int i7 = this.f53770a;
        int length = String.valueOf(i7).length();
        String str = this.f53771b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb2.append(i7);
        sb2.append(":");
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.f53770a);
        wb.l(parcel, 2, this.f53771b);
        wb.s(parcel, r10);
    }
}
