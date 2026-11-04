package w;

import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.net.Uri;
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
import androidx.fragment.app.f0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.common.Transport;
import e7.b0;
import e7.h0;
import e7.i;
import e7.k;
import e7.m;
import e7.m0;
import e7.n0;
import e7.p0;
import e7.q0;
import e7.t;
import e7.u;
import e7.v;
import e7.w;
import e7.x;
import e7.y;
import e7.z0;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import p7.t0;
public final class a implements Parcelable.Creator {
    public final int f57004a;

    public a(int i3) {
        this.f57004a = i3;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        t0 o10;
        t0 o11;
        long j10 = 0;
        int i3 = 0;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ArrayList arrayList = null;
        byte[][] bArr = null;
        t0 t0Var = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        c.b bVar = null;
        GoogleSignInAccount googleSignInAccount = null;
        switch (this.f57004a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                return new ParcelImpl(inParcel);
            case 2:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(2);
                    public final int f1138a;
                    public final MediaDescriptionCompat f1139b;

                    {
                        this.f1138a = inParcel.readInt();
                        this.f1139b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f1138a + ", mDescription=" + this.f1139b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i11) {
                        parcel.writeInt(this.f1138a);
                        this.f1139b.writeToParcel(parcel, i11);
                    }
                };
            case 3:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 4:
                return new MediaMetadataCompat(inParcel);
            case 5:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 6:
                return new androidx.activity.result.a(inParcel);
            case 7:
                j.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 8:
                return new androidx.fragment.app.b(inParcel);
            case 9:
                return new androidx.fragment.app.c(inParcel);
            case 10:
                ?? obj = new Object();
                obj.f1814a = inParcel.readString();
                obj.f1815b = inParcel.readInt();
                return obj;
            case 11:
                ?? obj2 = new Object();
                obj2.f1857e = null;
                obj2.f1858f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f1854a = inParcel.createStringArrayList();
                obj2.f1855b = inParcel.createStringArrayList();
                obj2.f1856c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.f1857e = inParcel.readString();
                obj2.f1858f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f1859n = inParcel.createTypedArrayList(f0.CREATOR);
                return obj2;
            case 12:
                return new o0(inParcel);
            case 13:
                int z13 = g6.e.z(inParcel);
                long j11 = 0;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                Uri uri = null;
                String str7 = null;
                String str8 = null;
                ArrayList arrayList2 = null;
                String str9 = null;
                String str10 = null;
                while (inParcel.dataPosition() < z13) {
                    int readInt = inParcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str3 = g6.e.h(inParcel, readInt);
                            break;
                        case 3:
                            str4 = g6.e.h(inParcel, readInt);
                            break;
                        case 4:
                            str5 = g6.e.h(inParcel, readInt);
                            break;
                        case 5:
                            str6 = g6.e.h(inParcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) g6.e.g(inParcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str7 = g6.e.h(inParcel, readInt);
                            break;
                        case '\b':
                            j11 = g6.e.w(inParcel, readInt);
                            break;
                        case '\t':
                            str8 = g6.e.h(inParcel, readInt);
                            break;
                        case '\n':
                            arrayList2 = g6.e.l(inParcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str9 = g6.e.h(inParcel, readInt);
                            break;
                        case '\f':
                            str10 = g6.e.h(inParcel, readInt);
                            break;
                        default:
                            g6.e.y(inParcel, readInt);
                            break;
                    }
                }
                g6.e.m(inParcel, z13);
                return new GoogleSignInAccount(str3, str4, str5, str6, uri, str7, j11, str8, arrayList2, str9, str10);
            case 14:
                int z14 = g6.e.z(inParcel);
                int i11 = 0;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                ArrayList arrayList3 = null;
                Account account = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (inParcel.dataPosition() < z14) {
                    int readInt2 = inParcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = g6.e.u(inParcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = g6.e.l(inParcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) g6.e.g(inParcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z15 = g6.e.n(inParcel, readInt2);
                            break;
                        case 5:
                            z16 = g6.e.n(inParcel, readInt2);
                            break;
                        case 6:
                            z17 = g6.e.n(inParcel, readInt2);
                            break;
                        case 7:
                            str11 = g6.e.h(inParcel, readInt2);
                            break;
                        case '\b':
                            str12 = g6.e.h(inParcel, readInt2);
                            break;
                        case '\t':
                            arrayList = g6.e.l(inParcel, readInt2, c6.a.CREATOR);
                            break;
                        case '\n':
                            str13 = g6.e.h(inParcel, readInt2);
                            break;
                        default:
                            g6.e.y(inParcel, readInt2);
                            break;
                    }
                }
                g6.e.m(inParcel, z14);
                return new GoogleSignInOptions(i11, arrayList3, account, z15, z16, z17, str11, str12, GoogleSignInOptions.c(arrayList), str13);
            case 15:
                int z18 = g6.e.z(inParcel);
                String str14 = "";
                String str15 = "";
                while (inParcel.dataPosition() < z18) {
                    int readInt3 = inParcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 != 4) {
                        if (c2 != 7) {
                            if (c2 != '\b') {
                                g6.e.y(inParcel, readInt3);
                            } else {
                                str15 = g6.e.h(inParcel, readInt3);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) g6.e.g(inParcel, readInt3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str14 = g6.e.h(inParcel, readInt3);
                    }
                }
                g6.e.m(inParcel, z18);
                return new SignInAccount(str14, googleSignInAccount, str15);
            case 16:
                ?? obj3 = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i12 = c.c.f3929b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar = (c.b) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        obj4.f3928a = readStrongBinder;
                        bVar = obj4;
                    }
                }
                obj3.f3931a = bVar;
                return obj3;
            case 17:
                int z19 = g6.e.z(inParcel);
                int i13 = 0;
                while (inParcel.dataPosition() < z19) {
                    int readInt4 = inParcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                g6.e.y(inParcel, readInt4);
                            } else {
                                bundle = g6.e.a(inParcel, readInt4);
                            }
                        } else {
                            i13 = g6.e.u(inParcel, readInt4);
                        }
                    } else {
                        i3 = g6.e.u(inParcel, readInt4);
                    }
                }
                g6.e.m(inParcel, z19);
                return new c6.a(i3, i13, bundle);
            case 18:
                int z20 = g6.e.z(inParcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < z20) {
                    int readInt5 = inParcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 2) {
                        if (c11 != 5) {
                            g6.e.y(inParcel, readInt5);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) g6.e.g(inParcel, readInt5, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str2 = g6.e.h(inParcel, readInt5);
                    }
                }
                g6.e.m(inParcel, z20);
                return new SignInConfiguration(str2, googleSignInOptions);
            case 19:
                try {
                    return Transport.a(inParcel.readString());
                } catch (c7.a e10) {
                    throw new RuntimeException(e10);
                }
            case 20:
                try {
                    return e7.c.a(inParcel.readString());
                } catch (e7.b e11) {
                    throw new RuntimeException(e11);
                }
            case 21:
                int z21 = g6.e.z(inParcel);
                while (inParcel.dataPosition() < z21) {
                    int readInt6 = inParcel.readInt();
                    if (((char) readInt6) != 1) {
                        g6.e.y(inParcel, readInt6);
                    } else {
                        z12 = g6.e.n(inParcel, readInt6);
                    }
                }
                g6.e.m(inParcel, z21);
                return new z0(z12);
            case 22:
                int z22 = g6.e.z(inParcel);
                while (inParcel.dataPosition() < z22) {
                    int readInt7 = inParcel.readInt();
                    if (((char) readInt7) != 1) {
                        g6.e.y(inParcel, readInt7);
                    } else {
                        j10 = g6.e.w(inParcel, readInt7);
                    }
                }
                g6.e.m(inParcel, z22);
                return new m0(j10);
            case 23:
                int z23 = g6.e.z(inParcel);
                while (inParcel.dataPosition() < z23) {
                    int readInt8 = inParcel.readInt();
                    if (((char) readInt8) != 1) {
                        g6.e.y(inParcel, readInt8);
                    } else {
                        z11 = g6.e.n(inParcel, readInt8);
                    }
                }
                g6.e.m(inParcel, z23);
                return new n0(z11);
            case 24:
                int z24 = g6.e.z(inParcel);
                while (inParcel.dataPosition() < z24) {
                    int readInt9 = inParcel.readInt();
                    if (((char) readInt9) != 1) {
                        g6.e.y(inParcel, readInt9);
                    } else {
                        z10 = g6.e.n(inParcel, readInt9);
                    }
                }
                g6.e.m(inParcel, z24);
                return new t(z10);
            case 25:
                int z25 = g6.e.z(inParcel);
                while (inParcel.dataPosition() < z25) {
                    int readInt10 = inParcel.readInt();
                    if (((char) readInt10) != 1) {
                        g6.e.y(inParcel, readInt10);
                    } else {
                        str = g6.e.h(inParcel, readInt10);
                    }
                }
                g6.e.m(inParcel, z25);
                return new e7.o0(str);
            case 26:
                int z26 = g6.e.z(inParcel);
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (inParcel.dataPosition() < z26) {
                    int readInt11 = inParcel.readInt();
                    char c12 = (char) readInt11;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    g6.e.y(inParcel, readInt11);
                                } else {
                                    i10 = g6.e.u(inParcel, readInt11);
                                }
                            } else {
                                bArr4 = g6.e.b(inParcel, readInt11);
                            }
                        } else {
                            bArr3 = g6.e.b(inParcel, readInt11);
                        }
                    } else {
                        bArr2 = g6.e.b(inParcel, readInt11);
                    }
                }
                g6.e.m(inParcel, z26);
                if (bArr2 == null) {
                    o10 = null;
                } else {
                    o10 = t0.o(bArr2.length, bArr2);
                }
                if (bArr3 == null) {
                    o11 = null;
                } else {
                    o11 = t0.o(bArr3.length, bArr3);
                }
                if (bArr4 != null) {
                    t0Var = t0.o(bArr4.length, bArr4);
                }
                return new p0(o10, o11, t0Var, i10);
            case 27:
                int z27 = g6.e.z(inParcel);
                while (inParcel.dataPosition() < z27) {
                    int readInt12 = inParcel.readInt();
                    if (((char) readInt12) != 1) {
                        g6.e.y(inParcel, readInt12);
                    } else {
                        bArr = g6.e.c(inParcel, readInt12);
                    }
                }
                g6.e.m(inParcel, z27);
                return new q0(bArr);
            case 28:
                int z28 = g6.e.z(inParcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr5 = null;
                ArrayList arrayList4 = null;
                Double d = null;
                ArrayList arrayList5 = null;
                m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str16 = null;
                e7.f fVar = null;
                String str17 = null;
                ResultReceiver resultReceiver = null;
                while (inParcel.dataPosition() < z28) {
                    int readInt13 = inParcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            yVar = (y) g6.e.g(inParcel, readInt13, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) g6.e.g(inParcel, readInt13, b0.CREATOR);
                            break;
                        case 4:
                            bArr5 = g6.e.b(inParcel, readInt13);
                            break;
                        case 5:
                            arrayList4 = g6.e.l(inParcel, readInt13, x.CREATOR);
                            break;
                        case 6:
                            int x10 = g6.e.x(inParcel, readInt13);
                            if (x10 == 0) {
                                d = null;
                                break;
                            } else {
                                g6.e.B(inParcel, x10, 8);
                                d = Double.valueOf(inParcel.readDouble());
                                break;
                            }
                        case 7:
                            arrayList5 = g6.e.l(inParcel, readInt13, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) g6.e.g(inParcel, readInt13, m.CREATOR);
                            break;
                        case '\t':
                            num = g6.e.v(inParcel, readInt13);
                            break;
                        case '\n':
                            h0Var = (h0) g6.e.g(inParcel, readInt13, h0.CREATOR);
                            break;
                        case 11:
                            str16 = g6.e.h(inParcel, readInt13);
                            break;
                        case '\f':
                            fVar = (e7.f) g6.e.g(inParcel, readInt13, e7.f.CREATOR);
                            break;
                        case '\r':
                            str17 = g6.e.h(inParcel, readInt13);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) g6.e.g(inParcel, readInt13, ResultReceiver.CREATOR);
                            break;
                        default:
                            g6.e.y(inParcel, readInt13);
                            break;
                    }
                }
                g6.e.m(inParcel, z28);
                return new v(yVar, b0Var, bArr5, arrayList4, d, arrayList5, mVar, num, h0Var, str16, fVar, str17, resultReceiver);
            default:
                int z29 = g6.e.z(inParcel);
                String str18 = null;
                String str19 = null;
                byte[] bArr6 = null;
                e7.j jVar = null;
                i iVar = null;
                k kVar = null;
                e7.g gVar = null;
                String str20 = null;
                while (inParcel.dataPosition() < z29) {
                    int readInt14 = inParcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            str18 = g6.e.h(inParcel, readInt14);
                            break;
                        case 2:
                            str19 = g6.e.h(inParcel, readInt14);
                            break;
                        case 3:
                            bArr6 = g6.e.b(inParcel, readInt14);
                            break;
                        case 4:
                            jVar = (e7.j) g6.e.g(inParcel, readInt14, e7.j.CREATOR);
                            break;
                        case 5:
                            iVar = (i) g6.e.g(inParcel, readInt14, i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) g6.e.g(inParcel, readInt14, k.CREATOR);
                            break;
                        case 7:
                            gVar = (e7.g) g6.e.g(inParcel, readInt14, e7.g.CREATOR);
                            break;
                        case '\b':
                            str20 = g6.e.h(inParcel, readInt14);
                            break;
                        case '\t':
                            g6.e.h(inParcel, readInt14);
                            break;
                        default:
                            g6.e.y(inParcel, readInt14);
                            break;
                    }
                }
                g6.e.m(inParcel, z29);
                return new u(str18, str19, bArr6, jVar, iVar, kVar, gVar, str20);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f57004a) {
            case 0:
                return new b[i3];
            case 1:
                return new ParcelImpl[i3];
            case 2:
                return new MediaBrowserCompat$MediaItem[i3];
            case 3:
                return new MediaDescriptionCompat[i3];
            case 4:
                return new MediaMetadataCompat[i3];
            case 5:
                return new RatingCompat[i3];
            case 6:
                return new androidx.activity.result.a[i3];
            case 7:
                return new androidx.activity.result.g[i3];
            case 8:
                return new androidx.fragment.app.b[i3];
            case 9:
                return new androidx.fragment.app.c[i3];
            case 10:
                return new f0[i3];
            case 11:
                return new l0[i3];
            case 12:
                return new o0[i3];
            case 13:
                return new GoogleSignInAccount[i3];
            case 14:
                return new GoogleSignInOptions[i3];
            case 15:
                return new SignInAccount[i3];
            case 16:
                return new c.d[i3];
            case 17:
                return new c6.a[i3];
            case 18:
                return new SignInConfiguration[i3];
            case 19:
                return new Transport[i3];
            case 20:
                return new e7.c[i3];
            case 21:
                return new z0[i3];
            case 22:
                return new m0[i3];
            case 23:
                return new n0[i3];
            case 24:
                return new t[i3];
            case 25:
                return new e7.o0[i3];
            case 26:
                return new p0[i3];
            case 27:
                return new q0[i3];
            case 28:
                return new v[i3];
            default:
                return new u[i3];
        }
    }
}
