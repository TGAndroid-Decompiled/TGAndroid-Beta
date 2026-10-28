package s4;

import android.os.Parcel;
import android.os.Parcelable;
public final class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new q7.m(4);
    public int f47726a;
    public int f47727b;
    public boolean f47728c;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47726a);
        parcel.writeInt(this.f47727b);
        parcel.writeInt(this.f47728c ? 1 : 0);
    }
}
