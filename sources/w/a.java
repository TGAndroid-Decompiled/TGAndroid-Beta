package w;

import a8.bf;
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
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.firebase.messaging.o;
import d7.b0;
import d7.h0;
import d7.j;
import d7.k;
import d7.m;
import d7.m0;
import d7.o0;
import d7.p0;
import d7.q0;
import d7.t;
import d7.u;
import d7.v;
import d7.w;
import d7.x;
import d7.y;
import d7.z0;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import o7.s0;
public final class a implements Parcelable.Creator {
    public final int f50638a;

    public a(int i10) {
        this.f50638a = i10;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        s0 s10;
        s0 s11;
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
        Bundle bundle2 = null;
        c.b bVar = null;
        String str5 = null;
        switch (this.f50638a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(1);
                    public final int f2013a;
                    public final MediaDescriptionCompat f2014b;

                    {
                        this.f2013a = inParcel.readInt();
                        this.f2014b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f2013a + ", mDescription=" + this.f2014b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i12) {
                        parcel.writeInt(this.f2013a);
                        this.f2014b.writeToParcel(parcel, i12);
                    }
                };
            case 2:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 3:
                return new MediaMetadataCompat(inParcel);
            case 4:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 5:
                return new androidx.activity.result.a(inParcel);
            case 6:
                i.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                i.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 7:
                return new androidx.fragment.app.b(inParcel);
            case 8:
                return new androidx.fragment.app.c(inParcel);
            case 9:
                ?? obj = new Object();
                obj.f2624a = inParcel.readString();
                obj.f2625b = inParcel.readInt();
                return obj;
            case 10:
                ?? obj2 = new Object();
                obj2.e = null;
                obj2.f2665f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f2662a = inParcel.createStringArrayList();
                obj2.f2663b = inParcel.createStringArrayList();
                obj2.f2664c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.e = inParcel.readString();
                obj2.f2665f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f2666n = inParcel.createTypedArrayList(e0.CREATOR);
                return obj2;
            case 11:
                return new n0(inParcel);
            case 12:
                int z13 = bf.z(inParcel);
                int i12 = 0;
                while (inParcel.dataPosition() < z13) {
                    int readInt = inParcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                bf.y(inParcel, readInt);
                            } else {
                                bundle = bf.a(inParcel, readInt);
                            }
                        } else {
                            i12 = bf.u(inParcel, readInt);
                        }
                    } else {
                        i10 = bf.u(inParcel, readInt);
                    }
                }
                bf.m(inParcel, z13);
                return new b6.a(i10, i12, bundle);
            case 13:
                int z14 = bf.z(inParcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < z14) {
                    int readInt2 = inParcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 5) {
                            bf.y(inParcel, readInt2);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) bf.g(inParcel, readInt2, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str5 = bf.h(inParcel, readInt2);
                    }
                }
                bf.m(inParcel, z14);
                return new SignInConfiguration(str5, googleSignInOptions);
            case 14:
                try {
                    return Transport.a(inParcel.readString());
                } catch (b7.a e) {
                    throw new RuntimeException(e);
                }
            case 15:
                ?? obj3 = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i13 = c.c.f5888b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar = (c.b) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        obj4.f5887a = readStrongBinder;
                        bVar = obj4;
                    }
                }
                obj3.f5890a = bVar;
                return obj3;
            case 16:
                int z15 = bf.z(inParcel);
                while (inParcel.dataPosition() < z15) {
                    int readInt3 = inParcel.readInt();
                    if (((char) readInt3) != 2) {
                        bf.y(inParcel, readInt3);
                    } else {
                        bundle2 = bf.a(inParcel, readInt3);
                    }
                }
                bf.m(inParcel, z15);
                return new o(bundle2);
            case 17:
                try {
                    return d7.c.a(inParcel.readString());
                } catch (d7.b e10) {
                    throw new RuntimeException(e10);
                }
            case 18:
                int z16 = bf.z(inParcel);
                while (inParcel.dataPosition() < z16) {
                    int readInt4 = inParcel.readInt();
                    if (((char) readInt4) != 1) {
                        bf.y(inParcel, readInt4);
                    } else {
                        z12 = bf.n(inParcel, readInt4);
                    }
                }
                bf.m(inParcel, z16);
                return new z0(z12);
            case 19:
                int z17 = bf.z(inParcel);
                long j10 = 0;
                while (inParcel.dataPosition() < z17) {
                    int readInt5 = inParcel.readInt();
                    if (((char) readInt5) != 1) {
                        bf.y(inParcel, readInt5);
                    } else {
                        j10 = bf.w(inParcel, readInt5);
                    }
                }
                bf.m(inParcel, z17);
                return new m0(j10);
            case 20:
                int z18 = bf.z(inParcel);
                while (inParcel.dataPosition() < z18) {
                    int readInt6 = inParcel.readInt();
                    if (((char) readInt6) != 1) {
                        bf.y(inParcel, readInt6);
                    } else {
                        z11 = bf.n(inParcel, readInt6);
                    }
                }
                bf.m(inParcel, z18);
                return new d7.n0(z11);
            case 21:
                int z19 = bf.z(inParcel);
                while (inParcel.dataPosition() < z19) {
                    int readInt7 = inParcel.readInt();
                    if (((char) readInt7) != 1) {
                        bf.y(inParcel, readInt7);
                    } else {
                        z10 = bf.n(inParcel, readInt7);
                    }
                }
                bf.m(inParcel, z19);
                return new t(z10);
            case 22:
                int z20 = bf.z(inParcel);
                while (inParcel.dataPosition() < z20) {
                    int readInt8 = inParcel.readInt();
                    if (((char) readInt8) != 1) {
                        bf.y(inParcel, readInt8);
                    } else {
                        str4 = bf.h(inParcel, readInt8);
                    }
                }
                bf.m(inParcel, z20);
                return new o0(str4);
            case 23:
                int z21 = bf.z(inParcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (inParcel.dataPosition() < z21) {
                    int readInt9 = inParcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    bf.y(inParcel, readInt9);
                                } else {
                                    i11 = bf.u(inParcel, readInt9);
                                }
                            } else {
                                bArr4 = bf.b(inParcel, readInt9);
                            }
                        } else {
                            bArr3 = bf.b(inParcel, readInt9);
                        }
                    } else {
                        bArr2 = bf.b(inParcel, readInt9);
                    }
                }
                bf.m(inParcel, z21);
                if (bArr2 == null) {
                    s10 = null;
                } else {
                    s10 = s0.s(bArr2.length, bArr2);
                }
                if (bArr3 == null) {
                    s11 = null;
                } else {
                    s11 = s0.s(bArr3.length, bArr3);
                }
                if (bArr4 != null) {
                    s0Var = s0.s(bArr4.length, bArr4);
                }
                return new p0(s10, s11, s0Var, i11);
            case 24:
                int z22 = bf.z(inParcel);
                while (inParcel.dataPosition() < z22) {
                    int readInt10 = inParcel.readInt();
                    if (((char) readInt10) != 1) {
                        bf.y(inParcel, readInt10);
                    } else {
                        bArr = bf.c(inParcel, readInt10);
                    }
                }
                bf.m(inParcel, z22);
                return new q0(bArr);
            case 25:
                int z23 = bf.z(inParcel);
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
                d7.f fVar = null;
                String str7 = null;
                ResultReceiver resultReceiver = null;
                while (inParcel.dataPosition() < z23) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            yVar = (y) bf.g(inParcel, readInt11, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) bf.g(inParcel, readInt11, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = bf.b(inParcel, readInt11);
                            break;
                        case 5:
                            arrayList = bf.l(inParcel, readInt11, x.CREATOR);
                            break;
                        case 6:
                            int x9 = bf.x(inParcel, readInt11);
                            if (x9 == 0) {
                                d = null;
                                break;
                            } else {
                                bf.A(inParcel, x9, 8);
                                d = Double.valueOf(inParcel.readDouble());
                                break;
                            }
                        case 7:
                            arrayList2 = bf.l(inParcel, readInt11, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) bf.g(inParcel, readInt11, m.CREATOR);
                            break;
                        case '\t':
                            num = bf.v(inParcel, readInt11);
                            break;
                        case '\n':
                            h0Var = (h0) bf.g(inParcel, readInt11, h0.CREATOR);
                            break;
                        case 11:
                            str6 = bf.h(inParcel, readInt11);
                            break;
                        case '\f':
                            fVar = (d7.f) bf.g(inParcel, readInt11, d7.f.CREATOR);
                            break;
                        case '\r':
                            str7 = bf.h(inParcel, readInt11);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) bf.g(inParcel, readInt11, ResultReceiver.CREATOR);
                            break;
                        default:
                            bf.y(inParcel, readInt11);
                            break;
                    }
                }
                bf.m(inParcel, z23);
                return new v(yVar, b0Var, bArr5, arrayList, d, arrayList2, mVar, num, h0Var, str6, fVar, str7, resultReceiver);
            case 26:
                int z24 = bf.z(inParcel);
                String str8 = null;
                String str9 = null;
                byte[] bArr6 = null;
                j jVar = null;
                d7.i iVar = null;
                k kVar = null;
                d7.g gVar = null;
                String str10 = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt12 = inParcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            str8 = bf.h(inParcel, readInt12);
                            break;
                        case 2:
                            str9 = bf.h(inParcel, readInt12);
                            break;
                        case 3:
                            bArr6 = bf.b(inParcel, readInt12);
                            break;
                        case 4:
                            jVar = (j) bf.g(inParcel, readInt12, j.CREATOR);
                            break;
                        case 5:
                            iVar = (d7.i) bf.g(inParcel, readInt12, d7.i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) bf.g(inParcel, readInt12, k.CREATOR);
                            break;
                        case 7:
                            gVar = (d7.g) bf.g(inParcel, readInt12, d7.g.CREATOR);
                            break;
                        case '\b':
                            str10 = bf.h(inParcel, readInt12);
                            break;
                        case '\t':
                            bf.h(inParcel, readInt12);
                            break;
                        default:
                            bf.y(inParcel, readInt12);
                            break;
                    }
                }
                bf.m(inParcel, z24);
                return new u(str8, str9, bArr6, jVar, iVar, kVar, gVar, str10);
            case 27:
                int z25 = bf.z(inParcel);
                byte[] bArr7 = null;
                ArrayList arrayList3 = null;
                while (inParcel.dataPosition() < z25) {
                    int readInt13 = inParcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            if (c13 != 4) {
                                bf.y(inParcel, readInt13);
                            } else {
                                arrayList3 = bf.l(inParcel, readInt13, Transport.CREATOR);
                            }
                        } else {
                            bArr7 = bf.b(inParcel, readInt13);
                        }
                    } else {
                        str3 = bf.h(inParcel, readInt13);
                    }
                }
                bf.m(inParcel, z25);
                return new w(str3, bArr7, arrayList3);
            case 28:
                int z26 = bf.z(inParcel);
                Integer num2 = null;
                while (inParcel.dataPosition() < z26) {
                    int readInt14 = inParcel.readInt();
                    char c14 = (char) readInt14;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            bf.y(inParcel, readInt14);
                        } else {
                            num2 = bf.v(inParcel, readInt14);
                        }
                    } else {
                        str2 = bf.h(inParcel, readInt14);
                    }
                }
                bf.m(inParcel, z26);
                return new x(str2, num2.intValue());
            default:
                int z27 = bf.z(inParcel);
                String str11 = null;
                String str12 = null;
                while (inParcel.dataPosition() < z27) {
                    int readInt15 = inParcel.readInt();
                    char c15 = (char) readInt15;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            if (c15 != 4) {
                                bf.y(inParcel, readInt15);
                            } else {
                                str12 = bf.h(inParcel, readInt15);
                            }
                        } else {
                            str11 = bf.h(inParcel, readInt15);
                        }
                    } else {
                        str = bf.h(inParcel, readInt15);
                    }
                }
                bf.m(inParcel, z27);
                return new y(str, str11, str12);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f50638a) {
            case 0:
                return new b[i10];
            case 1:
                return new MediaBrowserCompat$MediaItem[i10];
            case 2:
                return new MediaDescriptionCompat[i10];
            case 3:
                return new MediaMetadataCompat[i10];
            case 4:
                return new RatingCompat[i10];
            case 5:
                return new androidx.activity.result.a[i10];
            case 6:
                return new androidx.activity.result.g[i10];
            case 7:
                return new androidx.fragment.app.b[i10];
            case 8:
                return new androidx.fragment.app.c[i10];
            case 9:
                return new e0[i10];
            case 10:
                return new k0[i10];
            case 11:
                return new n0[i10];
            case 12:
                return new b6.a[i10];
            case 13:
                return new SignInConfiguration[i10];
            case 14:
                return new Transport[i10];
            case 15:
                return new c.d[i10];
            case 16:
                return new o[i10];
            case 17:
                return new d7.c[i10];
            case 18:
                return new z0[i10];
            case 19:
                return new m0[i10];
            case 20:
                return new d7.n0[i10];
            case 21:
                return new t[i10];
            case 22:
                return new o0[i10];
            case 23:
                return new p0[i10];
            case 24:
                return new q0[i10];
            case 25:
                return new v[i10];
            case 26:
                return new u[i10];
            case 27:
                return new w[i10];
            case 28:
                return new x[i10];
            default:
                return new y[i10];
        }
    }
}
