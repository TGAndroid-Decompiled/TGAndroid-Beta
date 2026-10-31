package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.h0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(11);
    public final int f50696a;
    public final String f50697b;
    public final CommonWalletObject f50698c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f50696a = i10;
        this.f50697b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f5449a = str;
            this.f50698c = commonWalletObject2;
            return;
        }
        this.f50698c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.f50696a);
        h0.l(parcel, 3, this.f50697b);
        h0.k(parcel, 4, this.f50698c, i10);
        h0.r(parcel, q6);
    }
}
