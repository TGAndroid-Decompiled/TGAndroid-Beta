package q7;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import s4.b0;
public final class m implements Parcelable.Creator {
    public final int f47007a;

    public m(int i10) {
        this.f47007a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r26) {
        throw new UnsupportedOperationException("Method not decompiled: q7.m.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f47007a) {
            case 0:
                return new l[i10];
            case 1:
                return new n[i10];
            case 2:
                return new r9.b[i10];
            case 3:
                return new r9.a[i10];
            case 4:
                return new b0[i10];
            case 5:
                return new s6.a[i10];
            case 6:
                return new s6.b[i10];
            case 7:
                return new s6.c[i10];
            case 8:
                return new s8.a[i10];
            case 9:
                return new s8.m[i10];
            case 10:
                return new s8.b[i10];
            case 11:
                return new s8.d[i10];
            case 12:
                return new s8.c[i10];
            case 13:
                return new s8.f[i10];
            case 14:
                return new s8.e[i10];
            case 15:
                return new s8.h[i10];
            case 16:
                return new s8.g[i10];
            case 17:
                return new s8.j[i10];
            case 18:
                return new s8.i[i10];
            case 19:
                return new s8.l[i10];
            case 20:
                return new s8.k[i10];
            case 21:
                return new u0.h[i10];
            case 22:
                return new v8.a[i10];
            case 23:
                return new FaceParcel[i10];
            case 24:
                return new v8.b[i10];
            case 25:
                return new LandmarkParcel[i10];
            case 26:
                return new w8.i[i10];
            case 27:
                return new w8.j[i10];
            case 28:
                return new w8.k[i10];
            default:
                return new w8.l[i10];
        }
    }
}
