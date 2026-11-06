package r8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import q4.x;
public final class f extends r6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new x(13);
    public final List f54310a;
    public final String f54311b;

    public f(String str, ArrayList arrayList) {
        this.f54310a = arrayList;
        this.f54311b = str;
    }

    @Override
    public final Status a() {
        if (this.f54311b != null) {
            return Status.f6525e;
        }
        return Status.f6528r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.n(parcel, 1, this.f54310a);
        wb.l(parcel, 2, this.f54311b);
        wb.s(parcel, r10);
    }
}
