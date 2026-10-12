package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.g0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new m8.h(28);
    public Status f43160a;
    public ArrayList f43161b;
    public String[] f43162c;

    @Override
    public final Status h() {
        return this.f43160a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f43160a, i10);
        g0.p(parcel, 2, this.f43161b);
        g0.m(parcel, 3, this.f43162c);
        g0.r(parcel, q6);
    }
}
