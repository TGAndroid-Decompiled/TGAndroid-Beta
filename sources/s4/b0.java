package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new q7.m(4);
    public int f47691a;
    public int f47692b;
    public boolean f47693c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47691a);
        parcel.writeInt(this.f47692b);
        parcel.writeInt(this.f47693c ? 1 : 0);
    }
}
