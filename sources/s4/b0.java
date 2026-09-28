package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new p7.j(22);
    public int f42940a;
    public int f42941b;
    public boolean f42942c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f42940a);
        parcel.writeInt(this.f42941b);
        parcel.writeInt(this.f42942c ? 1 : 0);
    }
}
