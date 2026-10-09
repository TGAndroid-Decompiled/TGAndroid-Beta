package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new p7.j(22);
    public int f47633a;
    public int f47634b;
    public boolean f47635c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47633a);
        parcel.writeInt(this.f47634b);
        parcel.writeInt(this.f47635c ? 1 : 0);
    }
}
