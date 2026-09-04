package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.e0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new r(14);
    public final int f47711a;
    public final String f47712b;
    public final CommonWalletObject f47713c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f47711a = i10;
        this.f47712b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f6158a = str;
            this.f47713c = commonWalletObject2;
            return;
        }
        this.f47713c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f47711a);
        e0.l(parcel, 3, this.f47712b);
        e0.k(parcel, 4, this.f47713c, i10);
        e0.r(parcel, q6);
    }
}
