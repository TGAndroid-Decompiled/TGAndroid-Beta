package y8;

import android.os.Parcel;
import android.os.Parcelable;
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new l0(1);
    public final String f54251a;
    public final String f54252b;
    public final long f54253c;

    public m0(long j10, String str, String str2) {
        this.f54251a = str;
        this.f54252b = str2;
        this.f54253c = j10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.l(parcel, 2, this.f54251a);
        w7.h0.l(parcel, 3, this.f54252b);
        w7.h0.s(parcel, 4, 8);
        parcel.writeLong(this.f54253c);
        w7.h0.r(parcel, q6);
    }
}
