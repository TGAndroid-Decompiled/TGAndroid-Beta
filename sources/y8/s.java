package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int f49671a;
    public final boolean f49672b;

    public s(int i10, boolean z10) {
        this.f49671a = i10;
        this.f49672b = z10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.f49671a);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.f49672b ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
