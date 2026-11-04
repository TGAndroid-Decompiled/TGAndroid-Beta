package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
public final class f extends q6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new n8.g(28);
    public final List f53815a;
    public final String f53816b;

    public f(String str, ArrayList arrayList) {
        this.f53815a = arrayList;
        this.f53816b = str;
    }

    @Override
    public final Status a() {
        if (this.f53816b != null) {
            return Status.f6577e;
        }
        return Status.f6580r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.o(parcel, 1, this.f53815a);
        j8.a.m(parcel, 2, this.f53816b);
        j8.a.t(parcel, s6);
    }
}
