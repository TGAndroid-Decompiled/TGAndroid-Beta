package r5;

import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
public final class c0 implements Parcelable.Creator {
    public final int f46711a;

    public c0(int i10) {
        this.f46711a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r43) {
        throw new UnsupportedOperationException("Method not decompiled: r5.c0.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f46711a) {
            case 0:
                return new b[i10];
            case 1:
                return new s5.a[i10];
            case 2:
                return new s5.f[i10];
            case 3:
                return new s5.b[i10];
            case 4:
                return new s5.d[i10];
            case 5:
                return new s7.d[i10];
            case 6:
                return new s7.e[i10];
            case 7:
                return new s7.f[i10];
            case 8:
                return new s7.g[i10];
            case 9:
                return new s7.h[i10];
            case 10:
                return new UserAddress[i10];
            case 11:
                return new u0.h[i10];
            case 12:
                return new u5.y[i10];
            case 13:
                return new u5.d[i10];
            case 14:
                return new u5.c[i10];
            case 15:
                return new u6.a[i10];
            case 16:
                return new u6.b[i10];
            case 17:
                return new u6.c[i10];
            case 18:
                return new u6.d[i10];
            case 19:
                return new u6.e[i10];
            case 20:
                return new u6.f[i10];
            case 21:
                return new u6.g[i10];
            case 22:
                return new u6.h[i10];
            case 23:
                return new u6.i[i10];
            case 24:
                return new u6.j[i10];
            case 25:
                return new GetCredentialRequest[i10];
            case 26:
                return new u6.k[i10];
            case 27:
                return new u6.l[i10];
            case 28:
                return new u6.m[i10];
            default:
                return new u6.n[i10];
        }
    }
}
