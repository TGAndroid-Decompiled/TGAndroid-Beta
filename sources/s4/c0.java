package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new p7.j(22);
    public int f47635a;
    public int f47636b;
    public boolean f47637c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47635a);
        parcel.writeInt(this.f47636b);
        parcel.writeInt(this.f47637c ? 1 : 0);
    }
}
