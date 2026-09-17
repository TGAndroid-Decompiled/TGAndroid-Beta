package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.e0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new j(0);
    public Status f43972a;
    public ArrayList f43973b;
    public String[] f43974c;

    @Override
    public final Status i() {
        return this.f43972a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.f43972a, i10);
        e0.p(parcel, 2, this.f43973b);
        e0.m(parcel, 3, this.f43974c);
        e0.r(parcel, q6);
    }
}
