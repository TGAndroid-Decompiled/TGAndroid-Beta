package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new p7.m(20);
    public int f45933a;
    public int f45934b;
    public boolean f45935c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f45933a);
        parcel.writeInt(this.f45934b);
        parcel.writeInt(this.f45935c ? 1 : 0);
    }
}
