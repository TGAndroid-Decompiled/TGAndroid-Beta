package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.g0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new j(0);
    public Status f44312a;
    public ArrayList f44313b;
    public String[] f44314c;

    @Override
    public final Status i() {
        return this.f44312a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.f44312a, i10);
        g0.p(parcel, 2, this.f44313b);
        g0.m(parcel, 3, this.f44314c);
        g0.r(parcel, q6);
    }
}
