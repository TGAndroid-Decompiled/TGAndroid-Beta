package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new c(17);
    public final int f50056a;
    public final String f50057b;

    public v(int i10, String str) {
        this.f50056a = i10;
        this.f50057b = str;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(this.f50056a);
        w7.f0.l(parcel, 3, this.f50057b);
        w7.f0.r(parcel, q6);
    }
}
