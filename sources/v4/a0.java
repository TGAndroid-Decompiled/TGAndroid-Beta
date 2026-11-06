package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f56878a;
    public int f56879b;
    public boolean f56880c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f56878a);
        parcel.writeInt(this.f56879b);
        parcel.writeInt(this.f56880c ? 1 : 0);
    }
}
