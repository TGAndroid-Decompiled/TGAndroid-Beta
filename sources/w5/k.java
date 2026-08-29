package w5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import z5.f0;
import z5.u;
import z5.v;
public final class k implements Parcelable.Creator {
    public final int f49782a;

    public k(int i10) {
        this.f49782a = i10;
    }

    public static void a(z5.f fVar, Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = fVar.f50599a;
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f50600b;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f50601c;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i13);
        com.google.android.gms.internal.cast.o.l(parcel, 4, fVar.d);
        com.google.android.gms.internal.cast.o.f(parcel, 5, fVar.f50602e);
        com.google.android.gms.internal.cast.o.o(parcel, 6, fVar.f50603f, i10);
        com.google.android.gms.internal.cast.o.b(parcel, 7, fVar.h);
        com.google.android.gms.internal.cast.o.k(parcel, 8, fVar.f50604n, i10);
        com.google.android.gms.internal.cast.o.o(parcel, 10, fVar.f50605r, i10);
        com.google.android.gms.internal.cast.o.o(parcel, 11, fVar.f50606s, i10);
        boolean z10 = fVar.v;
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = fVar.f50607w;
        com.google.android.gms.internal.cast.o.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z11 = fVar.f50608x;
        com.google.android.gms.internal.cast.o.s(parcel, 14, 4);
        parcel.writeInt(z11 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 15, fVar.f50609y);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        throw new UnsupportedOperationException("Method not decompiled: w5.k.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f49782a) {
            case 0:
                return new c[i10];
            case 1:
                return new w7.a[i10];
            case 2:
                return new DataHolder[i10];
            case 3:
                return new x7.a[i10];
            case 4:
                return new x7.b[i10];
            case 5:
                return new x7.c[i10];
            case 6:
                return new x7.d[i10];
            case 7:
                return new y5.a[i10];
            case 8:
                return new y7.e[i10];
            case 9:
                return new y7.a[i10];
            case 10:
                return new y7.f[i10];
            case 11:
                return new y7.g[i10];
            case 12:
                return new y7.h[i10];
            case 13:
                return new y7.b[i10];
            case 14:
                return new z5.d[i10];
            case 15:
                return new z5.o[i10];
            case 16:
                return new z5.j[i10];
            case 17:
                return new u[i10];
            case 18:
                return new v[i10];
            case 19:
                return new z5.n[i10];
            case 20:
                return new BinderWrapper[i10];
            case 21:
                return new f0[i10];
            case 22:
                return new z5.e[i10];
            case 23:
                return new z5.f[i10];
            case 24:
                return new z8.b[i10];
            default:
                return new z8.a[i10];
        }
    }
}
