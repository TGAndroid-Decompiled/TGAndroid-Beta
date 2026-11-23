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
    public Status f57135a;
    public ArrayList f57136b;
    public String[] f57137c;

    @Override
    public final Status a() {
        return this.f57135a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f57135a, i7);
        bc.p(parcel, 2, this.f57136b);
        bc.m(parcel, 3, this.f57137c);
        bc.s(parcel, r10);
    }
}
