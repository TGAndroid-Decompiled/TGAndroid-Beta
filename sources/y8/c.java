package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList f59172a;
    public boolean f59173b;
    public boolean f59174c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.h(parcel, 1, this.f59172a);
        boolean z9 = this.f59173b;
        xb.q(parcel, 2, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f59174c;
        xb.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.d;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.s(parcel, r10);
    }
}
