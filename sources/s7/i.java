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
    public Status f57090a;
    public ArrayList f57091b;
    public String[] f57092c;

    @Override
    public final Status a() {
        return this.f57090a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f57090a, i7);
        bc.p(parcel, 2, this.f57091b);
        bc.m(parcel, 3, this.f57092c);
        bc.s(parcel, r10);
    }
}
