package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f43047a;
    public int f43048b;
    public boolean f43049c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f43047a);
        parcel.writeInt(this.f43048b);
        parcel.writeInt(this.f43049c ? 1 : 0);
    }
}
