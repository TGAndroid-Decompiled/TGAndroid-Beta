package z6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import g7.p8;
import java.util.ArrayList;
public final class i extends y5.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new w7.i(22);
    public Status f50323a;
    public ArrayList f50324b;
    public String[] f50325c;

    @Override
    public final Status i() {
        return this.f50323a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f50323a, i9);
        p8.p(parcel, 2, this.f50324b);
        p8.m(parcel, 3, this.f50325c);
        p8.r(parcel, q10);
    }
}
