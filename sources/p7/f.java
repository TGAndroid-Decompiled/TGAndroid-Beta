package p7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class f extends z5.a {
    public static final Parcelable.Creator<f> CREATOR = new w0(12);

    public final byte[] f45513a;

    public f(byte[] bArr) {
        this.f45513a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.c(parcel, 1, this.f45513a);
        r8.r(parcel, iQ);
    }
}
