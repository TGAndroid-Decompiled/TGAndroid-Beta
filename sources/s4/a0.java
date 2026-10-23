package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f46318a;
    public int f46319b;
    public boolean f46320c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46318a);
        parcel.writeInt(this.f46319b);
        parcel.writeInt(this.f46320c ? 1 : 0);
    }
}
