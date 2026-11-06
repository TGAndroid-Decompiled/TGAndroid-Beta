package s7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import q4.x;
public final class i extends r6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new x(20);
    public Status f54832a;
    public ArrayList f54833b;
    public String[] f54834c;

    @Override
    public final Status a() {
        return this.f54832a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f54832a, i7);
        wb.p(parcel, 2, this.f54833b);
        wb.m(parcel, 3, this.f54834c);
        wb.s(parcel, r10);
    }
}
