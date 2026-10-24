package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f46317a;
    public int f46318b;
    public boolean f46319c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46317a);
        parcel.writeInt(this.f46318b);
        parcel.writeInt(this.f46319c ? 1 : 0);
    }
}
