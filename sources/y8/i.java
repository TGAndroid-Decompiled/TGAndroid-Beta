package y8;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import e7.u;
import java.util.ArrayList;
import za.o;
public final class i implements Parcelable.Creator {
    public final int f59347a;

    public i(int i3) {
        this.f59347a = i3;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f59347a) {
            case 0:
                int z10 = g6.e.z(parcel);
                String str = null;
                String str2 = null;
                f fVar = null;
                g gVar = null;
                g gVar2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 != 4) {
                                if (c2 != 5) {
                                    if (c2 != 6) {
                                        g6.e.y(parcel, readInt);
                                    } else {
                                        gVar2 = (g) g6.e.g(parcel, readInt, g.CREATOR);
                                    }
                                } else {
                                    gVar = (g) g6.e.g(parcel, readInt, g.CREATOR);
                                }
                            } else {
                                fVar = (f) g6.e.g(parcel, readInt, f.CREATOR);
                            }
                        } else {
                            str2 = g6.e.h(parcel, readInt);
                        }
                    } else {
                        str = g6.e.h(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                ?? obj = new Object();
                obj.f59343a = str;
                obj.f59344b = str2;
                obj.f59345c = fVar;
                obj.d = gVar;
                obj.f59346e = gVar2;
                return obj;
            case 1:
                int z11 = g6.e.z(parcel);
                boolean z12 = false;
                int i3 = 0;
                boolean z13 = false;
                z5.d dVar = null;
                z5.a aVar = null;
                String str3 = null;
                z5.c cVar = null;
                z5.b bVar = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            dVar = (z5.d) g6.e.g(parcel, readInt2, z5.d.CREATOR);
                            break;
                        case 2:
                            aVar = (z5.a) g6.e.g(parcel, readInt2, z5.a.CREATOR);
                            break;
                        case 3:
                            str3 = g6.e.h(parcel, readInt2);
                            break;
                        case 4:
                            z12 = g6.e.n(parcel, readInt2);
                            break;
                        case 5:
                            i3 = g6.e.u(parcel, readInt2);
                            break;
                        case 6:
                            cVar = (z5.c) g6.e.g(parcel, readInt2, z5.c.CREATOR);
                            break;
                        case 7:
                            bVar = (z5.b) g6.e.g(parcel, readInt2, z5.b.CREATOR);
                            break;
                        case '\b':
                            z13 = g6.e.n(parcel, readInt2);
                            break;
                        default:
                            g6.e.y(parcel, readInt2);
                            break;
                    }
                }
                g6.e.m(parcel, z11);
                return new z5.e(dVar, aVar, str3, z12, i3, cVar, bVar, z13);
            case 2:
                int z14 = g6.e.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        g6.e.y(parcel, readInt3);
                    } else {
                        pendingIntent = (PendingIntent) g6.e.g(parcel, readInt3, PendingIntent.CREATOR);
                    }
                }
                g6.e.m(parcel, z14);
                return new z5.f(pendingIntent);
            case 3:
                int z15 = g6.e.z(parcel);
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z15) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            z16 = g6.e.n(parcel, readInt4);
                            break;
                        case 2:
                            str4 = g6.e.h(parcel, readInt4);
                            break;
                        case 3:
                            str5 = g6.e.h(parcel, readInt4);
                            break;
                        case 4:
                            z17 = g6.e.n(parcel, readInt4);
                            break;
                        case 5:
                            str6 = g6.e.h(parcel, readInt4);
                            break;
                        case 6:
                            arrayList = g6.e.j(parcel, readInt4);
                            break;
                        case 7:
                            z18 = g6.e.n(parcel, readInt4);
                            break;
                        default:
                            g6.e.y(parcel, readInt4);
                            break;
                    }
                }
                g6.e.m(parcel, z15);
                return new z5.a(z16, str4, str5, z17, str6, arrayList, z18);
            case 4:
                int z19 = g6.e.z(parcel);
                String str7 = null;
                boolean z20 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            g6.e.y(parcel, readInt5);
                        } else {
                            str7 = g6.e.h(parcel, readInt5);
                        }
                    } else {
                        z20 = g6.e.n(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z19);
                return new z5.b(str7, z20);
            case 5:
                int z21 = g6.e.z(parcel);
                byte[] bArr = null;
                boolean z22 = false;
                String str8 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                g6.e.y(parcel, readInt6);
                            } else {
                                str8 = g6.e.h(parcel, readInt6);
                            }
                        } else {
                            bArr = g6.e.b(parcel, readInt6);
                        }
                    } else {
                        z22 = g6.e.n(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z21);
                return new z5.c(z22, bArr, str8);
            case 6:
                int z23 = g6.e.z(parcel);
                boolean z24 = false;
                while (parcel.dataPosition() < z23) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        g6.e.y(parcel, readInt7);
                    } else {
                        z24 = g6.e.n(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z23);
                return new z5.d(z24);
            case 7:
                int z25 = g6.e.z(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                Uri uri = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                u uVar = null;
                while (parcel.dataPosition() < z25) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str9 = g6.e.h(parcel, readInt8);
                            break;
                        case 2:
                            str10 = g6.e.h(parcel, readInt8);
                            break;
                        case 3:
                            str11 = g6.e.h(parcel, readInt8);
                            break;
                        case 4:
                            str12 = g6.e.h(parcel, readInt8);
                            break;
                        case 5:
                            uri = (Uri) g6.e.g(parcel, readInt8, Uri.CREATOR);
                            break;
                        case 6:
                            str13 = g6.e.h(parcel, readInt8);
                            break;
                        case 7:
                            str14 = g6.e.h(parcel, readInt8);
                            break;
                        case '\b':
                            str15 = g6.e.h(parcel, readInt8);
                            break;
                        case '\t':
                            uVar = (u) g6.e.g(parcel, readInt8, u.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt8);
                            break;
                    }
                }
                g6.e.m(parcel, z25);
                return new z5.g(str9, str10, str11, str12, uri, str13, str14, str15, uVar);
            case 8:
                int z26 = g6.e.z(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                ArrayList arrayList2 = null;
                int i10 = 0;
                int i11 = 0;
                boolean z27 = false;
                boolean z28 = false;
                boolean z29 = false;
                int i12 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str16 = g6.e.h(parcel, readInt9);
                            break;
                        case 3:
                            str17 = g6.e.h(parcel, readInt9);
                            break;
                        case 4:
                            i10 = g6.e.u(parcel, readInt9);
                            break;
                        case 5:
                            i11 = g6.e.u(parcel, readInt9);
                            break;
                        case 6:
                            z27 = g6.e.n(parcel, readInt9);
                            break;
                        case 7:
                            z28 = g6.e.n(parcel, readInt9);
                            break;
                        case '\b':
                            str18 = g6.e.h(parcel, readInt9);
                            break;
                        case '\t':
                            z29 = g6.e.n(parcel, readInt9);
                            break;
                        case '\n':
                            str19 = g6.e.h(parcel, readInt9);
                            break;
                        case 11:
                            str20 = g6.e.h(parcel, readInt9);
                            break;
                        case '\f':
                            i12 = g6.e.u(parcel, readInt9);
                            break;
                        case '\r':
                            arrayList2 = g6.e.j(parcel, readInt9);
                            break;
                        default:
                            g6.e.y(parcel, readInt9);
                            break;
                    }
                }
                g6.e.m(parcel, z26);
                return new ConnectionConfiguration(str16, str17, i10, i11, z27, z28, str18, z29, str19, str20, i12, arrayList2);
            default:
                int z30 = g6.e.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z30) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        g6.e.y(parcel, readInt10);
                    } else {
                        bundle = g6.e.a(parcel, readInt10);
                    }
                }
                g6.e.m(parcel, z30);
                return new o(bundle);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f59347a) {
            case 0:
                return new h[i3];
            case 1:
                return new z5.e[i3];
            case 2:
                return new z5.f[i3];
            case 3:
                return new z5.a[i3];
            case 4:
                return new z5.b[i3];
            case 5:
                return new z5.c[i3];
            case 6:
                return new z5.d[i3];
            case 7:
                return new z5.g[i3];
            case 8:
                return new ConnectionConfiguration[i3];
            default:
                return new o[i3];
        }
    }
}
