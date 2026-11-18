package y8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new u8.o(26);
    public String f61111a;
    public Bundle f61112b;

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f61111a);
        bc.b(parcel, 3, this.f61112b);
        bc.s(parcel, r10);
    }
}
