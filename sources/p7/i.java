package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.h0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new m8.i(27);
    public Status f44874a;
    public ArrayList f44875b;
    public String[] f44876c;

    @Override
    public final Status a() {
        return this.f44874a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 1, this.f44874a, i10);
        h0.p(parcel, 2, this.f44875b);
        h0.m(parcel, 3, this.f44876c);
        h0.r(parcel, q6);
    }
}
