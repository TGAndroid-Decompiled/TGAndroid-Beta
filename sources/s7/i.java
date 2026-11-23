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
    public Status f57100a;
    public ArrayList f57101b;
    public String[] f57102c;

    @Override
    public final Status a() {
        return this.f57100a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 1, this.f57100a, i7);
        cc.p(parcel, 2, this.f57101b);
        cc.m(parcel, 3, this.f57102c);
        cc.s(parcel, r10);
    }
}
