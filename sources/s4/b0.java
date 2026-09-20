package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f42953a;
    public int f42954b;
    public boolean f42955c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42953a);
        parcel.writeInt(this.f42954b);
        parcel.writeInt(this.f42955c ? 1 : 0);
    }
}
