package u7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import r6.l;

public class h extends z5.a {
    public static final Parcelable.Creator<h> CREATOR = new l(24);

    public final int f48454a;

    public final Float f48455b;

    public h(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        y5.l.a("Invalid PatternItem: type=" + i10 + " length=" + f10, z10);
        this.f48454a = i10;
        this.f48455b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f48454a == hVar.f48454a && y5.l.l(this.f48455b, hVar.f48455b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f48454a), this.f48455b});
    }

    public String toString() {
        return "[PatternItem: type=" + this.f48454a + " length=" + this.f48455b + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f48454a);
        r8.e(parcel, 3, this.f48455b);
        r8.r(parcel, iQ);
    }
}
