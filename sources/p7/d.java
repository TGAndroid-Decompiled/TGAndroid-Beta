package p7;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(10);

    public final byte[] f45511a;

    public d(byte[] bArr) {
        this.f45511a = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.f45511a);
        r8.r(parcel, iQ);
    }
}
