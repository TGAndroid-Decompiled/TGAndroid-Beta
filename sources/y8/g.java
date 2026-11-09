package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f59293a;
    public final String f59294b;
    public final CommonWalletObject f59295c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f59293a = i7;
        this.f59294b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7730a = str;
            this.f59295c = commonWalletObject2;
            return;
        }
        this.f59295c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.f59293a);
        xb.l(parcel, 3, this.f59294b);
        xb.k(parcel, 4, this.f59295c, i7);
        xb.s(parcel, r10);
    }
}
