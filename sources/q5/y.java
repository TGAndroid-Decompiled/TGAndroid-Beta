package q5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
public final class y extends y5.a {
    public static final Parcelable.Creator<y> CREATOR = new o5.p(8);
    public final int f46069a;
    public final boolean f46070b;
    public final boolean f46071c;

    public y(int i9, boolean z10, boolean z11) {
        this.f46069a = i9;
        this.f46070b = z10;
        this.f46071c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f46069a == yVar.f46069a && this.f46070b == yVar.f46070b && this.f46071c == yVar.f46071c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46069a), Boolean.valueOf(this.f46070b), Boolean.valueOf(this.f46071c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.f46069a);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f46070b ? 1 : 0);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f46071c ? 1 : 0);
        p8.r(parcel, q10);
    }
}
