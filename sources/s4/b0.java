package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f41589a;
    public int f41590b;
    public boolean f41591c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41589a);
        parcel.writeInt(this.f41590b);
        parcel.writeInt(this.f41591c ? 1 : 0);
    }
}
