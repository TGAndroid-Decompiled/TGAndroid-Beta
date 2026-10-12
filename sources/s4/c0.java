package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new p7.j(22);
    public int f47866a;
    public int f47867b;
    public boolean f47868c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47866a);
        parcel.writeInt(this.f47867b);
        parcel.writeInt(this.f47868c ? 1 : 0);
    }
}
