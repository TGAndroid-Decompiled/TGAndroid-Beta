package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new p7.j(22);
    public int f47679a;
    public int f47680b;
    public boolean f47681c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47679a);
        parcel.writeInt(this.f47680b);
        parcel.writeInt(this.f47681c ? 1 : 0);
    }
}
