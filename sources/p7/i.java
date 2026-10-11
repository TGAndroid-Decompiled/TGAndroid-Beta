package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.d0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new j(0);
    public Status f45561a;
    public ArrayList f45562b;
    public String[] f45563c;

    @Override
    public final Status i() {
        return this.f45561a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f45561a, i10);
        d0.p(parcel, 2, this.f45562b);
        d0.m(parcel, 3, this.f45563c);
        d0.r(parcel, q6);
    }
}
