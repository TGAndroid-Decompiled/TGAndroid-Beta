package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new u8.o(13);
    public int f57003a;
    public int f57004b;
    public boolean f57005c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f57003a);
        parcel.writeInt(this.f57004b);
        parcel.writeInt(this.f57005c ? 1 : 0);
    }
}
