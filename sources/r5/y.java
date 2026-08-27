package r5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import n6.w0;

public final class y extends z5.a {
    public static final Parcelable.Creator<y> CREATOR = new w0(16);

    public final int f46828a;

    public final boolean f46829b;

    public final boolean f46830c;

    public y(int i10, boolean z10, boolean z11) {
        this.f46828a = i10;
        this.f46829b = z10;
        this.f46830c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f46828a == yVar.f46828a && this.f46829b == yVar.f46829b && this.f46830c == yVar.f46830c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46828a), Boolean.valueOf(this.f46829b), Boolean.valueOf(this.f46830c)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f46828a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f46829b ? 1 : 0);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f46830c ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
