package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f45896a;
    public int f45897b;
    public boolean f45898c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45896a);
        parcel.writeInt(this.f45897b);
        parcel.writeInt(this.f45898c ? 1 : 0);
    }
}
