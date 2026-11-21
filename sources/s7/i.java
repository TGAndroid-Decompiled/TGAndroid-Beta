package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import q4.x;
public final class i extends r6.a implements r {
    public static final Parcelable.Creator<i> CREATOR = new x(20);
    public Status f57131a;
    public ArrayList f57132b;
    public String[] f57133c;

    @Override
    public final Status a() {
        return this.f57131a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f57131a, i7);
        bc.p(parcel, 2, this.f57132b);
        bc.m(parcel, 3, this.f57133c);
        bc.s(parcel, r10);
    }
}
