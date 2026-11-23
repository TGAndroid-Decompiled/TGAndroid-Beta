package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.ArrayList;
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new u8.o(29);
    public ArrayList f61175a;
    public boolean f61176b;
    public boolean f61177c;
    public int d;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.h(parcel, 1, this.f61175a);
        boolean z10 = this.f61176b;
        cc.q(parcel, 2, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f61177c;
        cc.q(parcel, 3, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i10 = this.d;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.s(parcel, r10);
    }
}
