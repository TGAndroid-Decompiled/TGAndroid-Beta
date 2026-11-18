package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.ArrayList;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList f61046a;
    public boolean f61047b;
    public boolean f61048c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.h(parcel, 1, this.f61046a);
        boolean z10 = this.f61047b;
        bc.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f61048c;
        bc.q(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.s(parcel, r10);
    }
}
