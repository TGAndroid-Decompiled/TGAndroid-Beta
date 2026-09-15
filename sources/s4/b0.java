package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f42654a;
    public int f42655b;
    public boolean f42656c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42654a);
        parcel.writeInt(this.f42655b);
        parcel.writeInt(this.f42656c ? 1 : 0);
    }
}
