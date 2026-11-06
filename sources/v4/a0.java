package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f56902a;
    public int f56903b;
    public boolean f56904c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f56902a);
        parcel.writeInt(this.f56903b);
        parcel.writeInt(this.f56904c ? 1 : 0);
    }
}
