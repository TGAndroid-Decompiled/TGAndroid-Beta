package v8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import w7.f0;
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new s(9);
    public ArrayList f48279a;
    public String f48280b;
    public String f48281c;
    public ArrayList d;
    public boolean e;
    public String f48282f;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.h(parcel, 2, this.f48279a);
        f0.l(parcel, 4, this.f48280b);
        f0.l(parcel, 5, this.f48281c);
        f0.h(parcel, 6, this.d);
        boolean z10 = this.e;
        f0.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f0.l(parcel, 8, this.f48282f);
        f0.r(parcel, q6);
    }
}
