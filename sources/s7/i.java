package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import q4.x;
public final class i extends r6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new x(20);
    public Status f54948a;
    public ArrayList f54949b;
    public String[] f54950c;

    @Override
    public final Status a() {
        return this.f54948a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 1, this.f54948a, i7);
        xb.p(parcel, 2, this.f54949b);
        xb.m(parcel, 3, this.f54950c);
        xb.s(parcel, r10);
    }
}
