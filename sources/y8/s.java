package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new u8.o(26);
    public String f61121a;
    public Bundle f61122b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f61121a);
        cc.b(parcel, 3, this.f61122b);
        cc.s(parcel, r10);
    }
}
