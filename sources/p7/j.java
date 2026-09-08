package p7;

import android.os.Parcelable;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import s4.b0;
public final class j implements Parcelable.Creator {
    public final int f44001a;

    public j(int i10) {
        this.f44001a = i10;
    }

    @Override
    public final java.lang.Object createFromParcel(android.os.Parcel r26) {
        throw new UnsupportedOperationException("Method not decompiled: p7.j.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f44001a) {
            case 0:
                return new i[i10];
            case 1:
                return new l[i10];
            case 2:
                return new m[i10];
            case 3:
                return new n[i10];
            case 4:
                return new p9.b[i10];
            case 5:
                return new p9.a[i10];
            case 6:
                return new r6.a[i10];
            case 7:
                return new r6.b[i10];
            case 8:
                return new r6.c[i10];
            case 9:
                return new r8.a[i10];
            case 10:
                return new r8.m[i10];
            case 11:
                return new r8.b[i10];
            case 12:
                return new r8.d[i10];
            case 13:
                return new r8.c[i10];
            case 14:
                return new r8.f[i10];
            case 15:
                return new r8.e[i10];
            case 16:
                return new r8.h[i10];
            case 17:
                return new r8.g[i10];
            case 18:
                return new r8.j[i10];
            case 19:
                return new r8.i[i10];
            case 20:
                return new r8.l[i10];
            case 21:
                return new r8.k[i10];
            case 22:
                return new b0[i10];
            case 23:
                return new u0.h[i10];
            case 24:
                return new u8.a[i10];
            case 25:
                return new FaceParcel[i10];
            case 26:
                return new u8.b[i10];
            case 27:
                return new LandmarkParcel[i10];
            case 28:
                return new v8.i[i10];
            default:
                return new v8.j[i10];
        }
    }
}
