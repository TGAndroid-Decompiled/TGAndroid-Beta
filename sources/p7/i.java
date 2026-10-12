package p7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import w7.c0;
public final class i extends o6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new j(0);
    public Status f45379a;
    public ArrayList f45380b;
    public String[] f45381c;

    @Override
    public final Status i() {
        return this.f45379a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = c0.q(parcel, 20293);
        c0.k(parcel, 1, this.f45379a, i10);
        c0.p(parcel, 2, this.f45380b);
        c0.m(parcel, 3, this.f45381c);
        c0.r(parcel, q6);
    }
}
