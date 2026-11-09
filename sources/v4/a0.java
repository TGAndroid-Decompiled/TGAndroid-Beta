package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f57007a;
    public int f57008b;
    public boolean f57009c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f57007a);
        parcel.writeInt(this.f57008b);
        parcel.writeInt(this.f57009c ? 1 : 0);
    }
}
