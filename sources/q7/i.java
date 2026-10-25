package q7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import n4.x;
public final class i extends p6.a implements q {
    public static final Parcelable.Creator<i> CREATOR = new x(28);
    public Status f46992a;
    public ArrayList f46993b;
    public String[] f46994c;

    @Override
    public final Status h() {
        return this.f46992a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.f46992a, i10);
        df.p(parcel, 2, this.f46993b);
        df.m(parcel, 3, this.f46994c);
        df.r(parcel, q5);
    }
}
