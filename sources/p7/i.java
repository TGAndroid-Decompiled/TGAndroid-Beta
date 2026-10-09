package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.d0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new j(0);
    public Status f45493a;
    public ArrayList f45494b;
    public String[] f45495c;

    @Override
    public final Status i() {
        return this.f45493a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 1, this.f45493a, i10);
        d0.p(parcel, 2, this.f45494b);
        d0.m(parcel, 3, this.f45495c);
        d0.r(parcel, q6);
    }
}
