package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int f52056a;
    public final long f52057b;
    public final List f52058c;

    public u0(int i10, long j3, ArrayList arrayList) {
        this.f52056a = i10;
        this.f52057b = j3;
        this.f52058c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.s(parcel, 2, 4);
        parcel.writeInt(this.f52056a);
        w7.c0.s(parcel, 3, 8);
        parcel.writeLong(this.f52057b);
        w7.c0.p(parcel, 4, this.f52058c);
        w7.c0.r(parcel, q6);
    }
}
