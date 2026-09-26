package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f42938a;
    public int f42939b;
    public boolean f42940c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42938a);
        parcel.writeInt(this.f42939b);
        parcel.writeInt(this.f42940c ? 1 : 0);
    }
}
