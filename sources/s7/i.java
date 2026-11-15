package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import q4.x;
public final class i extends r6.a implements r {
    public static final Parcelable.Creator<i> CREATOR = new x(20);
    public Status f56516a;
    public ArrayList f56517b;
    public String[] f56518c;

    @Override
    public final Status a() {
        return this.f56516a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 1, this.f56516a, i7);
        yb.p(parcel, 2, this.f56517b);
        yb.m(parcel, 3, this.f56518c);
        yb.s(parcel, r10);
    }
}
