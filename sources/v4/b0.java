package v4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new u8.o(13);
    public int f59106a;
    public int f59107b;
    public boolean f59108c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f59106a);
        parcel.writeInt(this.f59107b);
        parcel.writeInt(this.f59108c ? 1 : 0);
    }
}
