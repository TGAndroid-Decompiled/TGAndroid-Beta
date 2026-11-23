package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f59052a;
    public int f59053b;
    public boolean f59054c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f59052a);
        parcel.writeInt(this.f59053b);
        parcel.writeInt(this.f59054c ? 1 : 0);
    }
}
