package v8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new s(2);
    public int f48299a;
    public String f48300b;
    public String f48301c;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        int i11 = this.f48299a;
        f0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        f0.l(parcel, 2, this.f48300b);
        f0.l(parcel, 3, this.f48301c);
        f0.r(parcel, q6);
    }
}
