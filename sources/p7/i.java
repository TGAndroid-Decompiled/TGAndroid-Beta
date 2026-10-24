package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.f0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new m8.h(28);
    public Status f44669a;
    public ArrayList f44670b;
    public String[] f44671c;

    @Override
    public final Status h() {
        return this.f44669a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.k(parcel, 1, this.f44669a, i10);
        f0.p(parcel, 2, this.f44670b);
        f0.m(parcel, 3, this.f44671c);
        f0.r(parcel, q6);
    }
}
