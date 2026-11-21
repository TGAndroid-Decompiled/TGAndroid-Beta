package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new u8.o(13);
    public int f59102a;
    public int f59103b;
    public boolean f59104c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f59102a);
        parcel.writeInt(this.f59103b);
        parcel.writeInt(this.f59104c ? 1 : 0);
    }
}
