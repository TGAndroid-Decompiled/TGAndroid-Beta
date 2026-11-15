package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f60502a;
    public final String f60503b;
    public final CommonWalletObject f60504c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f60502a = i7;
        this.f60503b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7119a = str;
            this.f60504c = commonWalletObject2;
            return;
        }
        this.f60504c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.f60502a);
        yb.l(parcel, 3, this.f60503b);
        yb.k(parcel, 4, this.f60504c, i7);
        yb.s(parcel, r10);
    }
}
