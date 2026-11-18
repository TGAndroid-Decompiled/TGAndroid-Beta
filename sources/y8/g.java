package y8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new v(5);
    public final int f61067a;
    public final String f61068b;
    public final CommonWalletObject f61069c;

    public g(int i7, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f61067a = i7;
        this.f61068b = str2;
        if (i7 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.f7405a = str;
            this.f61069c = commonWalletObject2;
            return;
        }
        this.f61069c = commonWalletObject;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 1, 4);
        parcel.writeInt(this.f61067a);
        bc.l(parcel, 3, this.f61068b);
        bc.k(parcel, 4, this.f61069c, i7);
        bc.s(parcel, r10);
    }
}
