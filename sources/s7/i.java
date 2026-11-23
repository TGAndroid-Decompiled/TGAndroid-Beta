package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import q4.x;
public final class i extends r6.a implements r {
    public static final Parcelable.Creator<i> CREATOR = new x(20);
    public Status f57214a;
    public ArrayList f57215b;
    public String[] f57216c;

    @Override
    public final Status a() {
        return this.f57214a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f57214a, i7);
        cc.p(parcel, 2, this.f57215b);
        cc.m(parcel, 3, this.f57216c);
        cc.s(parcel, r10);
    }
}
