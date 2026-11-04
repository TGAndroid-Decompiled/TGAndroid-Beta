package w8;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import x8.h;
import x8.i;
import x8.j;
import x8.k;
import x8.l;
import x8.m;
import x8.n;
import x8.q;
import x8.r;
import x8.s;
public final class b implements Parcelable.Creator {
    public final int f57413a;

    public b(int i3) {
        this.f57413a = i3;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r27) {
        throw new UnsupportedOperationException("Method not decompiled: w8.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f57413a) {
            case 0:
                return new a[i3];
            case 1:
                return new FaceParcel[i3];
            case 2:
                return new c[i3];
            case 3:
                return new LandmarkParcel[i3];
            case 4:
                return new i[i3];
            case 5:
                return new j[i3];
            case 6:
                return new k[i3];
            case 7:
                return new l[i3];
            case 8:
                return new r[i3];
            case 9:
                return new m[i3];
            case 10:
                return new n[i3];
            case 11:
                return new s[i3];
            case 12:
                return new q[i3];
            case 13:
                return new x8.b[i3];
            case 14:
                return new x8.c[i3];
            case 15:
                return new FullWallet[i3];
            case 16:
                return new x8.d[i3];
            case 17:
                return new x8.e[i3];
            case 18:
                return new x8.f[i3];
            case 19:
                return new MaskedWallet[i3];
            case 20:
                return new x8.g[i3];
            case 21:
                return new h[i3];
            case 22:
                return new CommonWalletObject[i3];
            case 23:
                return new y8.a[i3];
            case 24:
                return new y8.b[i3];
            case 25:
                return new y8.d[i3];
            case 26:
                return new y8.c[i3];
            case 27:
                return new y8.e[i3];
            case 28:
                return new y8.f[i3];
            default:
                return new y8.g[i3];
        }
    }
}
