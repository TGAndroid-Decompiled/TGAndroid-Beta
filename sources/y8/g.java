package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f61197a;
    public final String f61198b;
    public final CommonWalletObject f61199c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f61197a = i7;
        this.f61198b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7396a = str;
            this.f61199c = commonWalletObject2;
            return;
        }
        this.f61199c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f61197a);
        cc.l(parcel, 3, this.f61198b);
        cc.k(parcel, 4, this.f61199c, i7);
        cc.s(parcel, r10);
    }
}
