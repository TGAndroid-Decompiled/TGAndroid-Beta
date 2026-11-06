package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f56903a;
    public int f56904b;
    public boolean f56905c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f56903a);
        parcel.writeInt(this.f56904b);
        parcel.writeInt(this.f56905c ? 1 : 0);
    }
}
