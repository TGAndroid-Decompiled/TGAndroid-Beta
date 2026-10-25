package w8;

import android.os.Parcelable;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
public final class s implements Parcelable.Creator {
    public final int f51132a;

    public s(int i10) {
        this.f51132a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        throw new UnsupportedOperationException("Method not decompiled: w8.s.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f51132a) {
            case 0:
                return new r[i10];
            case 1:
                return new m[i10];
            case 2:
                return new n[i10];
            case 3:
                return new t[i10];
            case 4:
                return new q[i10];
            case 5:
                return new b[i10];
            case 6:
                return new c[i10];
            case 7:
                return new FullWallet[i10];
            case 8:
                return new d[i10];
            case 9:
                return new e[i10];
            case 10:
                return new f[i10];
            case 11:
                return new MaskedWallet[i10];
            case 12:
                return new g[i10];
            case 13:
                return new h[i10];
            case 14:
                return new CommonWalletObject[i10];
            case 15:
                return new x8.a[i10];
            case 16:
                return new x8.b[i10];
            case 17:
                return new x8.d[i10];
            case 18:
                return new x8.c[i10];
            case 19:
                return new x8.e[i10];
            case 20:
                return new x8.f[i10];
            case 21:
                return new x8.g[i10];
            case 22:
                return new x8.h[i10];
            case 23:
                return new y5.e[i10];
            case 24:
                return new y5.f[i10];
            case 25:
                return new y5.a[i10];
            case 26:
                return new y5.b[i10];
            case 27:
                return new y5.c[i10];
            case 28:
                return new y5.d[i10];
            default:
                return new y5.g[i10];
        }
    }
}
