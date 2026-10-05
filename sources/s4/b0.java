package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f46516a;
    public int f46517b;
    public boolean f46518c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f46516a);
        parcel.writeInt(this.f46517b);
        parcel.writeInt(this.f46518c ? 1 : 0);
    }
}
