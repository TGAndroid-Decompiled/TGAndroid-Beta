package w;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.e0;
import androidx.fragment.app.k0;
import androidx.fragment.app.n0;
import c7.a0;
import c7.b0;
import c7.h0;
import c7.j;
import c7.k;
import c7.m;
import c7.m0;
import c7.o0;
import c7.p0;
import c7.q0;
import c7.t;
import c7.u;
import c7.v;
import c7.w;
import c7.x;
import c7.y;
import c7.z;
import c7.z0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import n7.s0;
import w7.d0;
public final class a implements Parcelable.Creator {
    public final int f47897a;

    public a(int i10) {
        this.f47897a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel inParcel) {
        s0 t10;
        s0 t11;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        Bundle bundle = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        byte[][] bArr = null;
        s0 s0Var = null;
        String str4 = null;
        c.b bVar = null;
        String str5 = null;
        switch (this.f47897a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                int z13 = d0.z(inParcel);
                int i12 = 0;
                while (inParcel.dataPosition() < z13) {
                    int readInt = inParcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                d0.y(inParcel, readInt);
                            } else {
                                bundle = d0.a(inParcel, readInt);
                            }
                        } else {
                            i12 = d0.u(inParcel, readInt);
                        }
                    } else {
                        i10 = d0.u(inParcel, readInt);
                    }
                }
                d0.m(inParcel, z13);
                return new a6.a(i10, i12, bundle);
            case 2:
                int z14 = d0.z(inParcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < z14) {
                    int readInt2 = inParcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 5) {
                            d0.y(inParcel, readInt2);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) d0.g(inParcel, readInt2, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str5 = d0.h(inParcel, readInt2);
                    }
                }
                d0.m(inParcel, z14);
                return new SignInConfiguration(str5, googleSignInOptions);
            case 3:
                try {
                    return Transport.a(inParcel.readString());
                } catch (a7.a e7) {
                    throw new RuntimeException(e7);
                }
            case 4:
                return new MediaBrowserCompat$MediaItem(inParcel);
            case 5:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 6:
                return new MediaMetadataCompat(inParcel);
            case 7:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 8:
                return new androidx.activity.result.a(inParcel);
            case 9:
                i.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                i.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 10:
                return new androidx.fragment.app.b(inParcel);
            case 11:
                return new androidx.fragment.app.c(inParcel);
            case 12:
                ?? obj = new Object();
                obj.f1424a = inParcel.readString();
                obj.f1425b = inParcel.readInt();
                return obj;
            case 13:
                ?? obj2 = new Object();
                obj2.f1467e = null;
                obj2.f1468f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f1464a = inParcel.createStringArrayList();
                obj2.f1465b = inParcel.createStringArrayList();
                obj2.f1466c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.f1467e = inParcel.readString();
                obj2.f1468f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f1469n = inParcel.createTypedArrayList(e0.CREATOR);
                return obj2;
            case 14:
                return new n0(inParcel);
            case 15:
                ?? obj3 = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i13 = c.c.f4097b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar = (c.b) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        obj4.f4096a = readStrongBinder;
                        bVar = obj4;
                    }
                }
                obj3.f4099a = bVar;
                return obj3;
            case 16:
                try {
                    return c7.c.a(inParcel.readString());
                } catch (c7.b e10) {
                    throw new RuntimeException(e10);
                }
            case 17:
                int z15 = d0.z(inParcel);
                while (inParcel.dataPosition() < z15) {
                    int readInt3 = inParcel.readInt();
                    if (((char) readInt3) != 1) {
                        d0.y(inParcel, readInt3);
                    } else {
                        z12 = d0.n(inParcel, readInt3);
                    }
                }
                d0.m(inParcel, z15);
                return new z0(z12);
            case 18:
                int z16 = d0.z(inParcel);
                long j3 = 0;
                while (inParcel.dataPosition() < z16) {
                    int readInt4 = inParcel.readInt();
                    if (((char) readInt4) != 1) {
                        d0.y(inParcel, readInt4);
                    } else {
                        j3 = d0.w(inParcel, readInt4);
                    }
                }
                d0.m(inParcel, z16);
                return new m0(j3);
            case 19:
                int z17 = d0.z(inParcel);
                while (inParcel.dataPosition() < z17) {
                    int readInt5 = inParcel.readInt();
                    if (((char) readInt5) != 1) {
                        d0.y(inParcel, readInt5);
                    } else {
                        z11 = d0.n(inParcel, readInt5);
                    }
                }
                d0.m(inParcel, z17);
                return new c7.n0(z11);
            case 20:
                int z18 = d0.z(inParcel);
                while (inParcel.dataPosition() < z18) {
                    int readInt6 = inParcel.readInt();
                    if (((char) readInt6) != 1) {
                        d0.y(inParcel, readInt6);
                    } else {
                        z10 = d0.n(inParcel, readInt6);
                    }
                }
                d0.m(inParcel, z18);
                return new t(z10);
            case 21:
                int z19 = d0.z(inParcel);
                while (inParcel.dataPosition() < z19) {
                    int readInt7 = inParcel.readInt();
                    if (((char) readInt7) != 1) {
                        d0.y(inParcel, readInt7);
                    } else {
                        str4 = d0.h(inParcel, readInt7);
                    }
                }
                d0.m(inParcel, z19);
                return new o0(str4);
            case 22:
                int z20 = d0.z(inParcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (inParcel.dataPosition() < z20) {
                    int readInt8 = inParcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    d0.y(inParcel, readInt8);
                                } else {
                                    i11 = d0.u(inParcel, readInt8);
                                }
                            } else {
                                bArr4 = d0.b(inParcel, readInt8);
                            }
                        } else {
                            bArr3 = d0.b(inParcel, readInt8);
                        }
                    } else {
                        bArr2 = d0.b(inParcel, readInt8);
                    }
                }
                d0.m(inParcel, z20);
                if (bArr2 == null) {
                    t10 = null;
                } else {
                    t10 = s0.t(bArr2.length, bArr2);
                }
                if (bArr3 == null) {
                    t11 = null;
                } else {
                    t11 = s0.t(bArr3.length, bArr3);
                }
                if (bArr4 != null) {
                    s0Var = s0.t(bArr4.length, bArr4);
                }
                return new p0(t10, t11, s0Var, i11);
            case 23:
                int z21 = d0.z(inParcel);
                while (inParcel.dataPosition() < z21) {
                    int readInt9 = inParcel.readInt();
                    if (((char) readInt9) != 1) {
                        d0.y(inParcel, readInt9);
                    } else {
                        bArr = d0.c(inParcel, readInt9);
                    }
                }
                d0.m(inParcel, z21);
                return new q0(bArr);
            case 24:
                int z22 = d0.z(inParcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList = null;
                Double d = null;
                ArrayList arrayList2 = null;
                m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str6 = null;
                c7.f fVar = null;
                String str7 = null;
                ResultReceiver resultReceiver = null;
                while (inParcel.dataPosition() < z22) {
                    int readInt10 = inParcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            yVar = (y) d0.g(inParcel, readInt10, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) d0.g(inParcel, readInt10, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = d0.b(inParcel, readInt10);
                            break;
                        case 5:
                            arrayList = d0.l(inParcel, readInt10, x.CREATOR);
                            break;
                        case 6:
                            int x10 = d0.x(inParcel, readInt10);
                            if (x10 == 0) {
                                d = null;
                                break;
                            } else {
                                d0.A(inParcel, x10, 8);
                                d = Double.valueOf(inParcel.readDouble());
                                break;
                            }
                        case 7:
                            arrayList2 = d0.l(inParcel, readInt10, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) d0.g(inParcel, readInt10, m.CREATOR);
                            break;
                        case '\t':
                            num = d0.v(inParcel, readInt10);
                            break;
                        case '\n':
                            h0Var = (h0) d0.g(inParcel, readInt10, h0.CREATOR);
                            break;
                        case 11:
                            str6 = d0.h(inParcel, readInt10);
                            break;
                        case '\f':
                            fVar = (c7.f) d0.g(inParcel, readInt10, c7.f.CREATOR);
                            break;
                        case '\r':
                            str7 = d0.h(inParcel, readInt10);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) d0.g(inParcel, readInt10, ResultReceiver.CREATOR);
                            break;
                        default:
                            d0.y(inParcel, readInt10);
                            break;
                    }
                }
                d0.m(inParcel, z22);
                return new v(yVar, b0Var, bArr5, arrayList, d, arrayList2, mVar, num, h0Var, str6, fVar, str7, resultReceiver);
            case 25:
                int z23 = d0.z(inParcel);
                String str8 = null;
                String str9 = null;
                byte[] bArr6 = null;
                j jVar = null;
                c7.i iVar = null;
                k kVar = null;
                c7.g gVar = null;
                String str10 = null;
                while (inParcel.dataPosition() < z23) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str8 = d0.h(inParcel, readInt11);
                            break;
                        case 2:
                            str9 = d0.h(inParcel, readInt11);
                            break;
                        case 3:
                            bArr6 = d0.b(inParcel, readInt11);
                            break;
                        case 4:
                            jVar = (j) d0.g(inParcel, readInt11, j.CREATOR);
                            break;
                        case 5:
                            iVar = (c7.i) d0.g(inParcel, readInt11, c7.i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) d0.g(inParcel, readInt11, k.CREATOR);
                            break;
                        case 7:
                            gVar = (c7.g) d0.g(inParcel, readInt11, c7.g.CREATOR);
                            break;
                        case '\b':
                            str10 = d0.h(inParcel, readInt11);
                            break;
                        case '\t':
                            d0.h(inParcel, readInt11);
                            break;
                        default:
                            d0.y(inParcel, readInt11);
                            break;
                    }
                }
                d0.m(inParcel, z23);
                return new u(str8, str9, bArr6, jVar, iVar, kVar, gVar, str10);
            case 26:
                int z24 = d0.z(inParcel);
                byte[] bArr7 = null;
                ArrayList arrayList3 = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt12 = inParcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            if (c13 != 4) {
                                d0.y(inParcel, readInt12);
                            } else {
                                arrayList3 = d0.l(inParcel, readInt12, Transport.CREATOR);
                            }
                        } else {
                            bArr7 = d0.b(inParcel, readInt12);
                        }
                    } else {
                        str3 = d0.h(inParcel, readInt12);
                    }
                }
                d0.m(inParcel, z24);
                return new w(str3, bArr7, arrayList3);
            case 27:
                int z25 = d0.z(inParcel);
                Integer num2 = null;
                while (inParcel.dataPosition() < z25) {
                    int readInt13 = inParcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            d0.y(inParcel, readInt13);
                        } else {
                            num2 = d0.v(inParcel, readInt13);
                        }
                    } else {
                        str2 = d0.h(inParcel, readInt13);
                    }
                }
                d0.m(inParcel, z25);
                return new x(str2, num2.intValue());
            case 28:
                int z26 = d0.z(inParcel);
                String str11 = null;
                String str12 = null;
                while (inParcel.dataPosition() < z26) {
                    int readInt14 = inParcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            if (c15 != 4) {
                                d0.y(inParcel, readInt14);
                            } else {
                                str12 = d0.h(inParcel, readInt14);
                            }
                        } else {
                            str11 = d0.h(inParcel, readInt14);
                        }
                    } else {
                        str = d0.h(inParcel, readInt14);
                    }
                }
                d0.m(inParcel, z26);
                return new y(str, str11, str12);
            default:
                try {
                    return a0.a(inParcel.readString());
                } catch (z e11) {
                    throw new RuntimeException(e11);
                }
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f47897a) {
            case 0:
                return new b[i10];
            case 1:
                return new a6.a[i10];
            case 2:
                return new SignInConfiguration[i10];
            case 3:
                return new Transport[i10];
            case 4:
                return new MediaBrowserCompat$MediaItem[i10];
            case 5:
                return new MediaDescriptionCompat[i10];
            case 6:
                return new MediaMetadataCompat[i10];
            case 7:
                return new RatingCompat[i10];
            case 8:
                return new androidx.activity.result.a[i10];
            case 9:
                return new androidx.activity.result.g[i10];
            case 10:
                return new androidx.fragment.app.b[i10];
            case 11:
                return new androidx.fragment.app.c[i10];
            case 12:
                return new e0[i10];
            case 13:
                return new k0[i10];
            case 14:
                return new n0[i10];
            case 15:
                return new c.d[i10];
            case 16:
                return new c7.c[i10];
            case 17:
                return new z0[i10];
            case 18:
                return new m0[i10];
            case 19:
                return new c7.n0[i10];
            case 20:
                return new t[i10];
            case 21:
                return new o0[i10];
            case 22:
                return new p0[i10];
            case 23:
                return new q0[i10];
            case 24:
                return new v[i10];
            case 25:
                return new u[i10];
            case 26:
                return new w[i10];
            case 27:
                return new x[i10];
            case 28:
                return new y[i10];
            default:
                return new a0[i10];
        }
    }
}
