package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import o6.w0;
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new w0(16);
    public final byte[] f46420a;

    public f(byte[] bArr) {
        this.f46420a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.c(parcel, 1, this.f46420a);
        o.r(parcel, q6);
    }
}
