package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f44813a;
    public int f44814b;
    public boolean f44815c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f44813a);
        parcel.writeInt(this.f44814b);
        parcel.writeInt(this.f44815c ? 1 : 0);
    }
}
