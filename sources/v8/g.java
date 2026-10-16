package v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import w7.f0;
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new s(12);
    public final int f46886a;
    public final String f46887b;
    public final CommonWalletObject f46888c;

    public g(int i10, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f46886a = i10;
        this.f46887b = str2;
        if (i10 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f5999a = str;
            this.f46888c = commonWalletObject2;
            return;
        }
        this.f46888c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.f46886a);
        f0.l(parcel, 3, this.f46887b);
        f0.k(parcel, 4, this.f46888c, i10);
        f0.r(parcel, q6);
    }
}
