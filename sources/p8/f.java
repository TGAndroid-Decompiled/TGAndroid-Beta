package p8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import n4.x;
public final class f extends p6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new x(21);
    public final List f46817a;
    public final String f46818b;

    public f(String str, ArrayList arrayList) {
        this.f46817a = arrayList;
        this.f46818b = str;
    }

    @Override
    public final Status h() {
        if (this.f46818b != null) {
            return Status.e;
        }
        return Status.f6465r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.n(parcel, 1, this.f46817a);
        df.l(parcel, 2, this.f46818b);
        df.r(parcel, q5);
    }
}
