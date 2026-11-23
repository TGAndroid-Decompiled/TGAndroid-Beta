package q4;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.common.internal.BinderWrapper;
import q6.h0;
public final class x implements Parcelable.Creator {
    public final int f55858a;

    public x(int i7) {
        this.f55858a = i7;
    }

    public static void a(q6.g gVar, Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = gVar.f55905a;
        cc.q(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = gVar.f55906b;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = gVar.f55907c;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i12);
        cc.l(parcel, 4, gVar.d);
        cc.f(parcel, 5, gVar.f55908e);
        cc.o(parcel, 6, gVar.f55909f, i7);
        cc.b(parcel, 7, gVar.h);
        cc.k(parcel, 8, gVar.f55910n, i7);
        cc.o(parcel, 10, gVar.f55911r, i7);
        cc.o(parcel, 11, gVar.f55912s, i7);
        boolean z10 = gVar.f55913w;
        cc.q(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = gVar.f55914x;
        cc.q(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z11 = gVar.f55915y;
        cc.q(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.l(parcel, 15, gVar.E);
        cc.s(parcel, r10);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: q4.x.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f55858a) {
            case 0:
                return new y[i7];
            case 1:
                return new q6.e[i7];
            case 2:
                return new q6.p[i7];
            case 3:
                return new q6.r[i7];
            case 4:
                return new q6.k[i7];
            case 5:
                return new q6.w[i7];
            case 6:
                return new q6.x[i7];
            case 7:
                return new q6.o[i7];
            case 8:
                return new BinderWrapper[i7];
            case 9:
                return new h0[i7];
            case 10:
                return new q6.f[i7];
            case 11:
                return new q6.g[i7];
            case 12:
                return new r8.b[i7];
            case 13:
                return new r8.f[i7];
            case 14:
                return new r8.g[i7];
            case 15:
                return new r8.h[i7];
            case 16:
                return new s7.e[i7];
            case 17:
                return new s7.f[i7];
            case 18:
                return new s7.g[i7];
            case 19:
                return new s7.h[i7];
            case 20:
                return new s7.i[i7];
            case 21:
                return new s7.k[i7];
            case 22:
                return new s7.l[i7];
            case 23:
                return new s7.m[i7];
            case 24:
                return new t9.b[i7];
            case 25:
                return new t9.a[i7];
            case 26:
                return new u0.h[i7];
            case 27:
                return new u6.a[i7];
            case 28:
                return new u6.b[i7];
            default:
                return new u6.c[i7];
        }
    }
}
