package w;

import ab.a0;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.net.Uri;
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
import androidx.versionedparcelable.ParcelImpl;
import c8.xb;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.wearable.ConnectionConfiguration;
import f7.u;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
public final class a implements Parcelable.Creator {
    public final int f59015a;

    public a(int i7) {
        this.f59015a = i7;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        boolean z10 = false;
        int i7 = 0;
        boolean z11 = false;
        boolean z12 = false;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayList = null;
        c.b bVar = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str3 = null;
        switch (this.f59015a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                int z13 = xb.z(inParcel);
                boolean z14 = false;
                int i10 = 0;
                boolean z15 = false;
                a6.d dVar = null;
                a6.a aVar = null;
                String str4 = null;
                a6.c cVar = null;
                a6.b bVar2 = null;
                while (inParcel.dataPosition() < z13) {
                    int readInt = inParcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            dVar = (a6.d) xb.g(inParcel, readInt, a6.d.CREATOR);
                            break;
                        case 2:
                            aVar = (a6.a) xb.g(inParcel, readInt, a6.a.CREATOR);
                            break;
                        case 3:
                            str4 = xb.h(inParcel, readInt);
                            break;
                        case 4:
                            z14 = xb.n(inParcel, readInt);
                            break;
                        case 5:
                            i10 = xb.u(inParcel, readInt);
                            break;
                        case 6:
                            cVar = (a6.c) xb.g(inParcel, readInt, a6.c.CREATOR);
                            break;
                        case 7:
                            bVar2 = (a6.b) xb.g(inParcel, readInt, a6.b.CREATOR);
                            break;
                        case '\b':
                            z15 = xb.n(inParcel, readInt);
                            break;
                        default:
                            xb.y(inParcel, readInt);
                            break;
                    }
                }
                xb.m(inParcel, z13);
                return new a6.e(dVar, aVar, str4, z14, i10, cVar, bVar2, z15);
            case 2:
                int z16 = xb.z(inParcel);
                while (inParcel.dataPosition() < z16) {
                    int readInt2 = inParcel.readInt();
                    if (((char) readInt2) != 1) {
                        xb.y(inParcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) xb.g(inParcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                xb.m(inParcel, z16);
                return new a6.f(pendingIntent);
            case 3:
                int z17 = xb.z(inParcel);
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                while (inParcel.dataPosition() < z17) {
                    int readInt3 = inParcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            z18 = xb.n(inParcel, readInt3);
                            break;
                        case 2:
                            str5 = xb.h(inParcel, readInt3);
                            break;
                        case 3:
                            str6 = xb.h(inParcel, readInt3);
                            break;
                        case 4:
                            z19 = xb.n(inParcel, readInt3);
                            break;
                        case 5:
                            str7 = xb.h(inParcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = xb.j(inParcel, readInt3);
                            break;
                        case 7:
                            z20 = xb.n(inParcel, readInt3);
                            break;
                        default:
                            xb.y(inParcel, readInt3);
                            break;
                    }
                }
                xb.m(inParcel, z17);
                return new a6.a(z18, str5, str6, z19, str7, arrayList2, z20);
            case 4:
                int z21 = xb.z(inParcel);
                while (inParcel.dataPosition() < z21) {
                    int readInt4 = inParcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            xb.y(inParcel, readInt4);
                        } else {
                            str3 = xb.h(inParcel, readInt4);
                        }
                    } else {
                        z10 = xb.n(inParcel, readInt4);
                    }
                }
                xb.m(inParcel, z21);
                return new a6.b(str3, z10);
            case 5:
                int z22 = xb.z(inParcel);
                String str8 = null;
                while (inParcel.dataPosition() < z22) {
                    int readInt5 = inParcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                xb.y(inParcel, readInt5);
                            } else {
                                str8 = xb.h(inParcel, readInt5);
                            }
                        } else {
                            bArr = xb.b(inParcel, readInt5);
                        }
                    } else {
                        z12 = xb.n(inParcel, readInt5);
                    }
                }
                xb.m(inParcel, z22);
                return new a6.c(z12, bArr, str8);
            case 6:
                int z23 = xb.z(inParcel);
                while (inParcel.dataPosition() < z23) {
                    int readInt6 = inParcel.readInt();
                    if (((char) readInt6) != 1) {
                        xb.y(inParcel, readInt6);
                    } else {
                        z11 = xb.n(inParcel, readInt6);
                    }
                }
                xb.m(inParcel, z23);
                return new a6.d(z11);
            case 7:
                int z24 = xb.z(inParcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                Uri uri = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                u uVar = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt7 = inParcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str9 = xb.h(inParcel, readInt7);
                            break;
                        case 2:
                            str10 = xb.h(inParcel, readInt7);
                            break;
                        case 3:
                            str11 = xb.h(inParcel, readInt7);
                            break;
                        case 4:
                            str12 = xb.h(inParcel, readInt7);
                            break;
                        case 5:
                            uri = (Uri) xb.g(inParcel, readInt7, Uri.CREATOR);
                            break;
                        case 6:
                            str13 = xb.h(inParcel, readInt7);
                            break;
                        case 7:
                            str14 = xb.h(inParcel, readInt7);
                            break;
                        case '\b':
                            str15 = xb.h(inParcel, readInt7);
                            break;
                        case '\t':
                            uVar = (u) xb.g(inParcel, readInt7, u.CREATOR);
                            break;
                        default:
                            xb.y(inParcel, readInt7);
                            break;
                    }
                }
                xb.m(inParcel, z24);
                return new a6.g(str9, str10, str11, str12, uri, str13, str14, str15, uVar);
            case 8:
                int z25 = xb.z(inParcel);
                int i11 = 0;
                int i12 = 0;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                int i13 = 0;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                ArrayList arrayList3 = null;
                while (inParcel.dataPosition() < z25) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str16 = xb.h(inParcel, readInt8);
                            break;
                        case 3:
                            str17 = xb.h(inParcel, readInt8);
                            break;
                        case 4:
                            i11 = xb.u(inParcel, readInt8);
                            break;
                        case 5:
                            i12 = xb.u(inParcel, readInt8);
                            break;
                        case 6:
                            z26 = xb.n(inParcel, readInt8);
                            break;
                        case 7:
                            z27 = xb.n(inParcel, readInt8);
                            break;
                        case '\b':
                            str18 = xb.h(inParcel, readInt8);
                            break;
                        case '\t':
                            z28 = xb.n(inParcel, readInt8);
                            break;
                        case '\n':
                            str19 = xb.h(inParcel, readInt8);
                            break;
                        case 11:
                            str20 = xb.h(inParcel, readInt8);
                            break;
                        case '\f':
                            i13 = xb.u(inParcel, readInt8);
                            break;
                        case '\r':
                            arrayList3 = xb.j(inParcel, readInt8);
                            break;
                        default:
                            xb.y(inParcel, readInt8);
                            break;
                    }
                }
                xb.m(inParcel, z25);
                return new ConnectionConfiguration(str16, str17, i11, i12, z26, z27, str18, z28, str19, str20, i13, arrayList3);
            case 9:
                int z29 = xb.z(inParcel);
                while (inParcel.dataPosition() < z29) {
                    int readInt9 = inParcel.readInt();
                    if (((char) readInt9) != 2) {
                        xb.y(inParcel, readInt9);
                    } else {
                        bundle = xb.a(inParcel, readInt9);
                    }
                }
                xb.m(inParcel, z29);
                return new a0(bundle);
            case 10:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(10);
                    public final int f1667a;
                    public final MediaDescriptionCompat f1668b;

                    {
                        this.f1667a = inParcel.readInt();
                        this.f1668b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f1667a + ", mDescription=" + this.f1668b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i14) {
                        parcel.writeInt(this.f1667a);
                        this.f1668b.writeToParcel(parcel, i14);
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
                j.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 16:
                return new androidx.fragment.app.b(inParcel);
            case 17:
                return new androidx.fragment.app.c(inParcel);
            case 18:
                ?? obj = new Object();
                obj.f2342a = inParcel.readString();
                obj.f2343b = inParcel.readInt();
                return obj;
            case 19:
                ?? obj2 = new Object();
                obj2.f2385e = null;
                obj2.f2386f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f2382a = inParcel.createStringArrayList();
                obj2.f2383b = inParcel.createStringArrayList();
                obj2.f2384c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.f2385e = inParcel.readString();
                obj2.f2386f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f2387n = inParcel.createTypedArrayList(f0.CREATOR);
                return obj2;
            case 20:
                return new o0(inParcel);
            case 21:
                return new ParcelImpl(inParcel);
            case 22:
                ?? obj3 = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i14 = c.c.f4039b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar = (c.b) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        obj4.f4038a = readStrongBinder;
                        bVar = obj4;
                    }
                }
                obj3.f4041a = bVar;
                return obj3;
            case 23:
                int z30 = xb.z(inParcel);
                long j3 = 0;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                Uri uri2 = null;
                String str25 = null;
                String str26 = null;
                ArrayList arrayList4 = null;
                String str27 = null;
                String str28 = null;
                while (inParcel.dataPosition() < z30) {
                    int readInt10 = inParcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str21 = xb.h(inParcel, readInt10);
                            break;
                        case 3:
                            str22 = xb.h(inParcel, readInt10);
                            break;
                        case 4:
                            str23 = xb.h(inParcel, readInt10);
                            break;
                        case 5:
                            str24 = xb.h(inParcel, readInt10);
                            break;
                        case 6:
                            uri2 = (Uri) xb.g(inParcel, readInt10, Uri.CREATOR);
                            break;
                        case 7:
                            str25 = xb.h(inParcel, readInt10);
                            break;
                        case '\b':
                            j3 = xb.w(inParcel, readInt10);
                            break;
                        case '\t':
                            str26 = xb.h(inParcel, readInt10);
                            break;
                        case '\n':
                            arrayList4 = xb.l(inParcel, readInt10, Scope.CREATOR);
                            break;
                        case 11:
                            str27 = xb.h(inParcel, readInt10);
                            break;
                        case '\f':
                            str28 = xb.h(inParcel, readInt10);
                            break;
                        default:
                            xb.y(inParcel, readInt10);
                            break;
                    }
                }
                xb.m(inParcel, z30);
                return new GoogleSignInAccount(str21, str22, str23, str24, uri2, str25, j3, str26, arrayList4, str27, str28);
            case 24:
                int z31 = xb.z(inParcel);
                int i15 = 0;
                boolean z32 = false;
                boolean z33 = false;
                boolean z34 = false;
                ArrayList arrayList5 = null;
                Account account = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                while (inParcel.dataPosition() < z31) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i15 = xb.u(inParcel, readInt11);
                            break;
                        case 2:
                            arrayList5 = xb.l(inParcel, readInt11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) xb.g(inParcel, readInt11, Account.CREATOR);
                            break;
                        case 4:
                            z32 = xb.n(inParcel, readInt11);
                            break;
                        case 5:
                            z33 = xb.n(inParcel, readInt11);
                            break;
                        case 6:
                            z34 = xb.n(inParcel, readInt11);
                            break;
                        case 7:
                            str29 = xb.h(inParcel, readInt11);
                            break;
                        case '\b':
                            str30 = xb.h(inParcel, readInt11);
                            break;
                        case '\t':
                            arrayList = xb.l(inParcel, readInt11, d6.a.CREATOR);
                            break;
                        case '\n':
                            str31 = xb.h(inParcel, readInt11);
                            break;
                        default:
                            xb.y(inParcel, readInt11);
                            break;
                    }
                }
                xb.m(inParcel, z31);
                return new GoogleSignInOptions(i15, arrayList5, account, z32, z33, z34, str29, str30, GoogleSignInOptions.c(arrayList), str31);
            case 25:
                int z35 = xb.z(inParcel);
                String str32 = "";
                String str33 = "";
                while (inParcel.dataPosition() < z35) {
                    int readInt12 = inParcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 != 4) {
                        if (c12 != 7) {
                            if (c12 != '\b') {
                                xb.y(inParcel, readInt12);
                            } else {
                                str33 = xb.h(inParcel, readInt12);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) xb.g(inParcel, readInt12, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str32 = xb.h(inParcel, readInt12);
                    }
                }
                xb.m(inParcel, z35);
                return new SignInAccount(str32, googleSignInAccount, str33);
            case 26:
                int z36 = xb.z(inParcel);
                Bundle bundle2 = null;
                int i16 = 0;
                while (inParcel.dataPosition() < z36) {
                    int readInt13 = inParcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                xb.y(inParcel, readInt13);
                            } else {
                                bundle2 = xb.a(inParcel, readInt13);
                            }
                        } else {
                            i16 = xb.u(inParcel, readInt13);
                        }
                    } else {
                        i7 = xb.u(inParcel, readInt13);
                    }
                }
                xb.m(inParcel, z36);
                return new d6.a(i7, i16, bundle2);
            case 27:
                int z37 = xb.z(inParcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < z37) {
                    int readInt14 = inParcel.readInt();
                    char c14 = (char) readInt14;
                    if (c14 != 2) {
                        if (c14 != 5) {
                            xb.y(inParcel, readInt14);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) xb.g(inParcel, readInt14, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str2 = xb.h(inParcel, readInt14);
                    }
                }
                xb.m(inParcel, z37);
                return new SignInConfiguration(str2, googleSignInOptions);
            case 28:
                try {
                    return Transport.a(inParcel.readString());
                } catch (d7.a e10) {
                    throw new RuntimeException(e10);
                }
            default:
                int z38 = xb.z(inParcel);
                while (inParcel.dataPosition() < z38) {
                    int readInt15 = inParcel.readInt();
                    if (((char) readInt15) != 1) {
                        xb.y(inParcel, readInt15);
                    } else {
                        str = xb.h(inParcel, readInt15);
                    }
                }
                xb.m(inParcel, z38);
                return new db.g(str);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f59015a) {
            case 0:
                return new b[i7];
            case 1:
                return new a6.e[i7];
            case 2:
                return new a6.f[i7];
            case 3:
                return new a6.a[i7];
            case 4:
                return new a6.b[i7];
            case 5:
                return new a6.c[i7];
            case 6:
                return new a6.d[i7];
            case 7:
                return new a6.g[i7];
            case 8:
                return new ConnectionConfiguration[i7];
            case 9:
                return new a0[i7];
            case 10:
                return new MediaBrowserCompat$MediaItem[i7];
            case 11:
                return new MediaDescriptionCompat[i7];
            case 12:
                return new MediaMetadataCompat[i7];
            case 13:
                return new RatingCompat[i7];
            case 14:
                return new androidx.activity.result.a[i7];
            case 15:
                return new androidx.activity.result.g[i7];
            case 16:
                return new androidx.fragment.app.b[i7];
            case 17:
                return new androidx.fragment.app.c[i7];
            case 18:
                return new f0[i7];
            case 19:
                return new l0[i7];
            case 20:
                return new o0[i7];
            case 21:
                return new ParcelImpl[i7];
            case 22:
                return new c.d[i7];
            case 23:
                return new GoogleSignInAccount[i7];
            case 24:
                return new GoogleSignInOptions[i7];
            case 25:
                return new SignInAccount[i7];
            case 26:
                return new d6.a[i7];
            case 27:
                return new SignInConfiguration[i7];
            case 28:
                return new Transport[i7];
            default:
                return new db.g[i7];
        }
    }
}
