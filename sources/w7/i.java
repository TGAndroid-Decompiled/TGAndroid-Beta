package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import g7.p8;
import x5.f0;
import x5.j;
import x5.n;
import x5.o;
import x5.u;
import x5.v;
import z6.k;
import z6.l;
import z6.m;
public final class i implements Parcelable.Creator {
    public final int f48781a;

    public i(int i9) {
        this.f48781a = i9;
    }

    public static void a(x5.f fVar, Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = fVar.f48899a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = fVar.f48900b;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f48901c;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i12);
        p8.l(parcel, 4, fVar.d);
        p8.f(parcel, 5, fVar.f48902e);
        p8.o(parcel, 6, fVar.f48903f, i9);
        p8.b(parcel, 7, fVar.h);
        p8.k(parcel, 8, fVar.f48904n, i9);
        p8.o(parcel, 10, fVar.f48905r, i9);
        p8.o(parcel, 11, fVar.f48906s, i9);
        boolean z10 = fVar.v;
        p8.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = fVar.f48907w;
        p8.s(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = fVar.f48908x;
        p8.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        p8.l(parcel, 15, fVar.f48909y);
        p8.r(parcel, q10);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: w7.i.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f48781a) {
            case 0:
                return new h[i9];
            case 1:
                return new b[i9];
            case 2:
                return new x5.d[i9];
            case 3:
                return new o[i9];
            case 4:
                return new j[i9];
            case 5:
                return new u[i9];
            case 6:
                return new v[i9];
            case 7:
                return new n[i9];
            case 8:
                return new BinderWrapper[i9];
            case 9:
                return new f0[i9];
            case 10:
                return new x5.e[i9];
            case 11:
                return new x5.f[i9];
            case 12:
                return new x8.b[i9];
            case 13:
                return new x8.a[i9];
            case 14:
                return new y7.b[i9];
            case 15:
                return new y7.f[i9];
            case 16:
                return new y7.g[i9];
            case 17:
                return new y7.h[i9];
            case 18:
                return new z6.e[i9];
            case 19:
                return new z6.f[i9];
            case 20:
                return new z6.g[i9];
            case 21:
                return new z6.h[i9];
            case 22:
                return new z6.i[i9];
            case 23:
                return new k[i9];
            case 24:
                return new l[i9];
            default:
                return new m[i9];
        }
    }
}
