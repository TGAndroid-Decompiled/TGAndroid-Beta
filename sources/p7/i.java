package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.f0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new j(0);
    public Status f41021a;
    public ArrayList f41022b;
    public String[] f41023c;

    @Override
    public final Status i() {
        return this.f41021a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f41021a, i10);
        f0.p(parcel, 2, this.f41022b);
        f0.m(parcel, 3, this.f41023c);
        f0.r(parcel, q6);
    }
}
