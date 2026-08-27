package w;

import a7.h;
import a7.i;
import a7.j;
import a7.l;
import a7.m;
import a7.n;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.f0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import c8.k;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.gms.common.api.Status;
import h7.q8;
import j$.util.Objects;
import java.util.ArrayList;

public final class a implements Parcelable.Creator {

    public final int f48918a;

    public a(int i10) {
        this.f48918a = i10;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        int iU = -1;
        boolean zN = false;
        int iU2 = 0;
        int iU3 = 0;
        int iU4 = 0;
        boolean zN2 = false;
        boolean zN3 = false;
        int iU5 = 0;
        h[] hVarArr = null;
        String strH = null;
        String[] strArrI = null;
        PendingIntent pendingIntent = null;
        c.b bVar = null;
        Status status = null;
        Bundle bundleA = null;
        String strH2 = null;
        String strH3 = null;
        switch (this.f48918a) {
            case 0:
                Bundle bundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(bundle);
                return new b(bundle);
            case 1:
                String string = inParcel.readString();
                string.getClass();
                return new a4.a(inParcel.readInt(), string);
            case 2:
                int iZ = q8.z(inParcel);
                String strH4 = null;
                Account account = null;
                while (inParcel.dataPosition() < iZ) {
                    int i10 = inParcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        hVarArr = (h[]) q8.k(inParcel, i10, h.CREATOR);
                    } else if (c10 == 2) {
                        strH4 = q8.h(inParcel, i10);
                    } else if (c10 == 3) {
                        zN = q8.n(inParcel, i10);
                    } else if (c10 != 4) {
                        q8.y(inParcel, i10);
                    } else {
                        account = (Account) q8.g(inParcel, i10, Account.CREATOR);
                    }
                }
                q8.m(inParcel, iZ);
                return new a7.f(hVarArr, strH4, zN, account);
            case 3:
                int iZ2 = q8.z(inParcel);
                String strH5 = null;
                String strH6 = null;
                while (inParcel.dataPosition() < iZ2) {
                    int i11 = inParcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 1) {
                        strH3 = q8.h(inParcel, i11);
                    } else if (c11 == 2) {
                        strH5 = q8.h(inParcel, i11);
                    } else if (c11 != 3) {
                        q8.y(inParcel, i11);
                    } else {
                        strH6 = q8.h(inParcel, i11);
                    }
                }
                q8.m(inParcel, iZ2);
                return new a7.g(strH3, strH5, strH6);
            case 4:
                int iZ3 = q8.z(inParcel);
                l lVar = null;
                byte[] bArrB = null;
                while (inParcel.dataPosition() < iZ3) {
                    int i12 = inParcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 1) {
                        strH2 = q8.h(inParcel, i12);
                    } else if (c12 == 3) {
                        lVar = (l) q8.g(inParcel, i12, l.CREATOR);
                    } else if (c12 == 4) {
                        iU = q8.u(inParcel, i12);
                    } else if (c12 != 5) {
                        q8.y(inParcel, i12);
                    } else {
                        bArrB = q8.b(inParcel, i12);
                    }
                }
                q8.m(inParcel, iZ3);
                return new h(strH2, lVar, iU, bArrB);
            case 5:
                int iZ4 = q8.z(inParcel);
                while (inParcel.dataPosition() < iZ4) {
                    int i13 = inParcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 1) {
                        iU5 = q8.u(inParcel, i13);
                    } else if (c13 != 2) {
                        q8.y(inParcel, i13);
                    } else {
                        bundleA = q8.a(inParcel, i13);
                    }
                }
                q8.m(inParcel, iZ4);
                return new i(iU5, bundleA);
            case 6:
                int iZ5 = q8.z(inParcel);
                ArrayList arrayListL = null;
                String[] strArrI2 = null;
                while (inParcel.dataPosition() < iZ5) {
                    int i14 = inParcel.readInt();
                    char c14 = (char) i14;
                    if (c14 == 1) {
                        status = (Status) q8.g(inParcel, i14, Status.CREATOR);
                    } else if (c14 == 2) {
                        arrayListL = q8.l(inParcel, i14, n.CREATOR);
                    } else if (c14 != 3) {
                        q8.y(inParcel, i14);
                    } else {
                        strArrI2 = q8.i(inParcel, i14);
                    }
                }
                q8.m(inParcel, iZ5);
                j jVar = new j();
                jVar.f119a = status;
                jVar.f120b = arrayListL;
                jVar.f121c = strArrI2;
                return jVar;
            case 7:
                int iZ6 = q8.z(inParcel);
                String strH7 = null;
                String strH8 = null;
                String strH9 = null;
                i[] iVarArr = null;
                String strH10 = null;
                m mVar = null;
                boolean zN4 = false;
                int iU6 = 1;
                boolean zN5 = false;
                while (inParcel.dataPosition() < iZ6) {
                    int i15 = inParcel.readInt();
                    char c15 = (char) i15;
                    if (c15 == 11) {
                        strH10 = q8.h(inParcel, i15);
                    } else if (c15 != '\f') {
                        switch (c15) {
                            case 1:
                                strH7 = q8.h(inParcel, i15);
                                break;
                            case 2:
                                strH8 = q8.h(inParcel, i15);
                                break;
                            case 3:
                                zN4 = q8.n(inParcel, i15);
                                break;
                            case 4:
                                iU6 = q8.u(inParcel, i15);
                                break;
                            case 5:
                                zN5 = q8.n(inParcel, i15);
                                break;
                            case 6:
                                strH9 = q8.h(inParcel, i15);
                                break;
                            case 7:
                                iVarArr = (i[]) q8.k(inParcel, i15, i.CREATOR);
                                break;
                            default:
                                q8.y(inParcel, i15);
                                break;
                        }
                    } else {
                        mVar = (m) q8.g(inParcel, i15, m.CREATOR);
                    }
                }
                q8.m(inParcel, iZ6);
                return new l(strH7, strH8, zN4, iU6, zN5, strH9, iVarArr, strH10, mVar);
            case 8:
                int iZ7 = q8.z(inParcel);
                while (inParcel.dataPosition() < iZ7) {
                    int i16 = inParcel.readInt();
                    if (((char) i16) != 1) {
                        q8.y(inParcel, i16);
                    } else {
                        zN3 = q8.n(inParcel, i16);
                    }
                }
                q8.m(inParcel, iZ7);
                return new m(zN3);
            case 9:
                int iZ8 = q8.z(inParcel);
                long jW = 0;
                a7.g gVar = null;
                String strH11 = null;
                a7.f fVar = null;
                String strH12 = null;
                int iU7 = 0;
                boolean zN6 = false;
                int iU8 = -1;
                int iU9 = 0;
                while (inParcel.dataPosition() < iZ8) {
                    int i17 = inParcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            gVar = (a7.g) q8.g(inParcel, i17, a7.g.CREATOR);
                            break;
                        case 2:
                            jW = q8.w(inParcel, i17);
                            break;
                        case 3:
                            iU7 = q8.u(inParcel, i17);
                            break;
                        case 4:
                            strH11 = q8.h(inParcel, i17);
                            break;
                        case 5:
                            fVar = (a7.f) q8.g(inParcel, i17, a7.f.CREATOR);
                            break;
                        case 6:
                            zN6 = q8.n(inParcel, i17);
                            break;
                        case 7:
                            iU8 = q8.u(inParcel, i17);
                            break;
                        case '\b':
                            iU9 = q8.u(inParcel, i17);
                            break;
                        case '\t':
                            strH12 = q8.h(inParcel, i17);
                            break;
                        default:
                            q8.y(inParcel, i17);
                            break;
                    }
                }
                q8.m(inParcel, iZ8);
                return new n(gVar, jW, iU7, strH11, fVar, zN6, iU8, iU9, strH12);
            case 10:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(10);

                    public final int f772a;

                    public final MediaDescriptionCompat f773b;

                    {
                        this.f772a = inParcel.readInt();
                        this.f773b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f772a + ", mDescription=" + this.f773b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i18) {
                        parcel.writeInt(this.f772a);
                        this.f773b.writeToParcel(parcel, i18);
                    }
                };
            case 11:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 12:
                return new MediaMetadataCompat(inParcel);
            case 13:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 14:
                return new androidx.activity.result.a(inParcel);
            case 15:
                kotlin.jvm.internal.j.e(inParcel, "inParcel");
                Parcelable parcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                kotlin.jvm.internal.j.b(parcelable);
                return new androidx.activity.result.g((IntentSender) parcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 16:
                return new androidx.fragment.app.b(inParcel);
            case 17:
                return new androidx.fragment.app.c(inParcel);
            case 18:
                f0 f0Var = new f0();
                f0Var.f1433a = inParcel.readString();
                f0Var.f1434b = inParcel.readInt();
                return f0Var;
            case 19:
                l0 l0Var = new l0();
                l0Var.f1476e = null;
                l0Var.f1477f = new ArrayList();
                l0Var.h = new ArrayList();
                l0Var.f1473a = inParcel.createStringArrayList();
                l0Var.f1474b = inParcel.createStringArrayList();
                l0Var.f1475c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                l0Var.d = inParcel.readInt();
                l0Var.f1476e = inParcel.readString();
                l0Var.f1477f = inParcel.createStringArrayList();
                l0Var.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                l0Var.f1478n = inParcel.createTypedArrayList(f0.CREATOR);
                return l0Var;
            case 20:
                return new o0(inParcel);
            case 21:
                return new b4.a(inParcel);
            case 22:
                c.d dVar = new c.d();
                IBinder strongBinder = inParcel.readStrongBinder();
                int i18 = c.c.f2188b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(c.b.h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.f2187a = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.f2190a = bVar;
                return dVar;
            case 23:
                return new PictureFrame(inParcel);
            case 24:
                return new c4.a(inParcel);
            case 25:
                int iZ9 = q8.z(inParcel);
                int iU10 = 0;
                while (inParcel.dataPosition() < iZ9) {
                    int i19 = inParcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        zN2 = q8.n(inParcel, i19);
                    } else if (c16 != 2) {
                        q8.y(inParcel, i19);
                    } else {
                        iU10 = q8.u(inParcel, i19);
                    }
                }
                q8.m(inParcel, iZ9);
                return new c6.a(iU10, zN2);
            case 26:
                int iZ10 = q8.z(inParcel);
                while (inParcel.dataPosition() < iZ10) {
                    int i20 = inParcel.readInt();
                    if (((char) i20) != 1) {
                        q8.y(inParcel, i20);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(inParcel, i20, PendingIntent.CREATOR);
                    }
                }
                q8.m(inParcel, iZ10);
                return new c6.b(pendingIntent);
            case 27:
                int iZ11 = q8.z(inParcel);
                boolean zN7 = false;
                while (inParcel.dataPosition() < iZ11) {
                    int i21 = inParcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iU4 = q8.u(inParcel, i21);
                    } else if (c17 != 2) {
                        q8.y(inParcel, i21);
                    } else {
                        zN7 = q8.n(inParcel, i21);
                    }
                }
                q8.m(inParcel, iZ11);
                return new c6.c(iU4, zN7);
            case 28:
                int iZ12 = q8.z(inParcel);
                while (inParcel.dataPosition() < iZ12) {
                    int i22 = inParcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 2) {
                        iU3 = q8.u(inParcel, i22);
                    } else if (c18 != 3) {
                        q8.y(inParcel, i22);
                    } else {
                        strArrI = q8.i(inParcel, i22);
                    }
                }
                q8.m(inParcel, iZ12);
                c8.a aVar2 = new c8.a();
                aVar2.f2501a = iU3;
                aVar2.f2502b = strArrI;
                return aVar2;
            default:
                int iZ13 = q8.z(inParcel);
                byte[] bArrB2 = null;
                String strH13 = null;
                Point[] pointArr = null;
                c8.f fVar2 = null;
                c8.i iVar = null;
                c8.j jVar2 = null;
                c8.l lVar2 = null;
                k kVar = null;
                c8.g gVar2 = null;
                c8.e eVar = null;
                c8.d dVar2 = null;
                c8.c cVar = null;
                int iU11 = 0;
                boolean zN8 = false;
                while (inParcel.dataPosition() < iZ13) {
                    int i23 = inParcel.readInt();
                    c8.g gVar3 = gVar2;
                    switch ((char) i23) {
                        case 2:
                            iU2 = q8.u(inParcel, i23);
                            break;
                        case 3:
                            strH = q8.h(inParcel, i23);
                            break;
                        case 4:
                            strH13 = q8.h(inParcel, i23);
                            break;
                        case 5:
                            iU11 = q8.u(inParcel, i23);
                            break;
                        case 6:
                            pointArr = (Point[]) q8.k(inParcel, i23, Point.CREATOR);
                            break;
                        case 7:
                            fVar2 = (c8.f) q8.g(inParcel, i23, c8.f.CREATOR);
                            break;
                        case '\b':
                            iVar = (c8.i) q8.g(inParcel, i23, c8.i.CREATOR);
                            break;
                        case '\t':
                            jVar2 = (c8.j) q8.g(inParcel, i23, c8.j.CREATOR);
                            break;
                        case '\n':
                            lVar2 = (c8.l) q8.g(inParcel, i23, c8.l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) q8.g(inParcel, i23, k.CREATOR);
                            break;
                        case '\f':
                            gVar2 = (c8.g) q8.g(inParcel, i23, c8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (c8.c) q8.g(inParcel, i23, c8.c.CREATOR);
                            break;
                        case 14:
                            dVar2 = (c8.d) q8.g(inParcel, i23, c8.d.CREATOR);
                            break;
                        case 15:
                            eVar = (c8.e) q8.g(inParcel, i23, c8.e.CREATOR);
                            break;
                        case 16:
                            bArrB2 = q8.b(inParcel, i23);
                            break;
                        case 17:
                            zN8 = q8.n(inParcel, i23);
                            break;
                        default:
                            q8.y(inParcel, i23);
                            break;
                    }
                    gVar2 = gVar3;
                }
                q8.m(inParcel, iZ13);
                c8.m mVar2 = new c8.m();
                mVar2.f2549a = iU2;
                mVar2.f2550b = strH;
                mVar2.A = bArrB2;
                mVar2.f2551c = strH13;
                mVar2.d = iU11;
                mVar2.f2552e = pointArr;
                mVar2.B = zN8;
                mVar2.f2553f = fVar2;
                mVar2.h = iVar;
                mVar2.f2554n = jVar2;
                mVar2.f2555r = lVar2;
                mVar2.f2556s = kVar;
                mVar2.v = gVar2;
                mVar2.f2557w = cVar;
                mVar2.f2558x = dVar2;
                mVar2.f2559y = eVar;
                return mVar2;
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f48918a) {
            case 0:
                return new b[i10];
            case 1:
                return new a4.a[i10];
            case 2:
                return new a7.f[i10];
            case 3:
                return new a7.g[i10];
            case 4:
                return new h[i10];
            case 5:
                return new i[i10];
            case 6:
                return new j[i10];
            case 7:
                return new l[i10];
            case 8:
                return new m[i10];
            case 9:
                return new n[i10];
            case 10:
                return new MediaBrowserCompat$MediaItem[i10];
            case 11:
                return new MediaDescriptionCompat[i10];
            case 12:
                return new MediaMetadataCompat[i10];
            case 13:
                return new RatingCompat[i10];
            case 14:
                return new androidx.activity.result.a[i10];
            case 15:
                return new androidx.activity.result.g[i10];
            case 16:
                return new androidx.fragment.app.b[i10];
            case 17:
                return new androidx.fragment.app.c[i10];
            case 18:
                return new f0[i10];
            case 19:
                return new l0[i10];
            case 20:
                return new o0[i10];
            case 21:
                return new b4.a[i10];
            case 22:
                return new c.d[i10];
            case 23:
                return new PictureFrame[i10];
            case 24:
                return new c4.a[i10];
            case 25:
                return new c6.a[i10];
            case 26:
                return new c6.b[i10];
            case 27:
                return new c6.c[i10];
            case 28:
                return new c8.a[i10];
            default:
                return new c8.m[i10];
        }
    }
}
