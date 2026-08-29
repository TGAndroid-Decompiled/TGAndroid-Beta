package q7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import o6.w0;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new w0(15);
    public final byte[] f46419a;

    public e(byte[] bArr) {
        this.f46419a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.c(parcel, 2, this.f46419a);
        o.r(parcel, q6);
    }
}
