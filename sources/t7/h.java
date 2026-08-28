package t7;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import q7.j;
import x5.l;
public class h extends y5.a {
    public static final Parcelable.Creator<h> CREATOR = new j(15);
    public final int f47732a;
    public final Float f47733b;

    public h(int i9, Float f10) {
        boolean z10 = true;
        if (i9 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        l.a("Invalid PatternItem: type=" + i9 + " length=" + f10, z10);
        this.f47732a = i9;
        this.f47733b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f47732a == hVar.f47732a && l.l(this.f47733b, hVar.f47733b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47732a), this.f47733b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f47732a + " length=" + this.f47733b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f47732a);
        p8.e(parcel, 3, this.f47733b);
        p8.r(parcel, q10);
    }
}
