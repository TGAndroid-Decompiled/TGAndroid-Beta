package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f56994a;
    public int f56995b;
    public boolean f56996c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f56994a);
        parcel.writeInt(this.f56995b);
        parcel.writeInt(this.f56996c ? 1 : 0);
    }
}
