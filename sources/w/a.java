package w;

import ab.z;
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
import androidx.fragment.app.e0;
import androidx.fragment.app.k0;
import androidx.fragment.app.n0;
import androidx.versionedparcelable.ParcelImpl;
import c8.wb;
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
    public final int f57576a;

    public a(int i7) {
        this.f57576a = i7;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        boolean z9 = false;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        GoogleSignInAccount googleSignInAccount = null;
        ArrayList arrayList = null;
        c.b bVar = null;
        Bundle bundle = null;
        byte[] bArr = null;
        String str3 = null;
        switch (this.f57576a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                int z12 = wb.z(inParcel);
                boolean z13 = false;
                int i10 = 0;
                boolean z14 = false;
                a6.d dVar = null;
                a6.a aVar = null;
                String str4 = null;
                a6.c cVar = null;
                a6.b bVar2 = null;
                while (inParcel.dataPosition() < z12) {
                    int readInt = inParcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            dVar = (a6.d) wb.g(inParcel, readInt, a6.d.CREATOR);
                            break;
                        case 2:
                            aVar = (a6.a) wb.g(inParcel, readInt, a6.a.CREATOR);
                            break;
                        case 3:
                            str4 = wb.h(inParcel, readInt);
                            break;
                        case 4:
                            z13 = wb.n(inParcel, readInt);
                            break;
                        case 5:
                            i10 = wb.u(inParcel, readInt);
                            break;
                        case 6:
                            cVar = (a6.c) wb.g(inParcel, readInt, a6.c.CREATOR);
                            break;
                        case 7:
                            bVar2 = (a6.b) wb.g(inParcel, readInt, a6.b.CREATOR);
                            break;
                        case '\b':
                            z14 = wb.n(inParcel, readInt);
                            break;
                        default:
                            wb.y(inParcel, readInt);
                            break;
                    }
                }
                wb.m(inParcel, z12);
                return new a6.e(dVar, aVar, str4, z13, i10, cVar, bVar2, z14);
            case 2:
                int z15 = wb.z(inParcel);
                while (inParcel.dataPosition() < z15) {
                    int readInt2 = inParcel.readInt();
                    if (((char) readInt2) != 1) {
                        wb.y(inParcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) wb.g(inParcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                wb.m(inParcel, z15);
                return new a6.f(pendingIntent);
            case 3:
                int z16 = wb.z(inParcel);
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                while (inParcel.dataPosition() < z16) {
                    int readInt3 = inParcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            z17 = wb.n(inParcel, readInt3);
                            break;
                        case 2:
                            str5 = wb.h(inParcel, readInt3);
                            break;
                        case 3:
                            str6 = wb.h(inParcel, readInt3);
                            break;
                        case 4:
                            z18 = wb.n(inParcel, readInt3);
                            break;
                        case 5:
                            str7 = wb.h(inParcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = wb.j(inParcel, readInt3);
                            break;
                        case 7:
                            z19 = wb.n(inParcel, readInt3);
                            break;
                        default:
                            wb.y(inParcel, readInt3);
                            break;
                    }
                }
                wb.m(inParcel, z16);
                return new a6.a(z17, str5, str6, z18, str7, arrayList2, z19);
            case 4:
                int z20 = wb.z(inParcel);
                while (inParcel.dataPosition() < z20) {
                    int readInt4 = inParcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            wb.y(inParcel, readInt4);
                        } else {
                            str3 = wb.h(inParcel, readInt4);
                        }
                    } else {
                        z9 = wb.n(inParcel, readInt4);
                    }
                }
                wb.m(inParcel, z20);
                return new a6.b(str3, z9);
            case 5:
                int z21 = wb.z(inParcel);
                String str8 = null;
                while (inParcel.dataPosition() < z21) {
                    int readInt5 = inParcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                wb.y(inParcel, readInt5);
                            } else {
                                str8 = wb.h(inParcel, readInt5);
                            }
                        } else {
                            bArr = wb.b(inParcel, readInt5);
                        }
                    } else {
                        z11 = wb.n(inParcel, readInt5);
                    }
                }
                wb.m(inParcel, z21);
                return new a6.c(z11, bArr, str8);
            case 6:
                int z22 = wb.z(inParcel);
                while (inParcel.dataPosition() < z22) {
                    int readInt6 = inParcel.readInt();
                    if (((char) readInt6) != 1) {
                        wb.y(inParcel, readInt6);
                    } else {
                        z10 = wb.n(inParcel, readInt6);
                    }
                }
                wb.m(inParcel, z22);
                return new a6.d(z10);
            case 7:
                int z23 = wb.z(inParcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                Uri uri = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                u uVar = null;
                while (inParcel.dataPosition() < z23) {
                    int readInt7 = inParcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str9 = wb.h(inParcel, readInt7);
                            break;
                        case 2:
                            str10 = wb.h(inParcel, readInt7);
                            break;
                        case 3:
                            str11 = wb.h(inParcel, readInt7);
                            break;
                        case 4:
                            str12 = wb.h(inParcel, readInt7);
                            break;
                        case 5:
                            uri = (Uri) wb.g(inParcel, readInt7, Uri.CREATOR);
                            break;
                        case 6:
                            str13 = wb.h(inParcel, readInt7);
                            break;
                        case 7:
                            str14 = wb.h(inParcel, readInt7);
                            break;
                        case '\b':
                            str15 = wb.h(inParcel, readInt7);
                            break;
                        case '\t':
                            uVar = (u) wb.g(inParcel, readInt7, u.CREATOR);
                            break;
                        default:
                            wb.y(inParcel, readInt7);
                            break;
                    }
                }
                wb.m(inParcel, z23);
                return new a6.g(str9, str10, str11, str12, uri, str13, str14, str15, uVar);
            case 8:
                int z24 = wb.z(inParcel);
                int i11 = 0;
                int i12 = 0;
                boolean z25 = false;
                boolean z26 = false;
                boolean z27 = false;
                int i13 = 0;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                ArrayList arrayList3 = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str16 = wb.h(inParcel, readInt8);
                            break;
                        case 3:
                            str17 = wb.h(inParcel, readInt8);
                            break;
                        case 4:
                            i11 = wb.u(inParcel, readInt8);
                            break;
                        case 5:
                            i12 = wb.u(inParcel, readInt8);
                            break;
                        case 6:
                            z25 = wb.n(inParcel, readInt8);
                            break;
                        case 7:
                            z26 = wb.n(inParcel, readInt8);
                            break;
                        case '\b':
                            str18 = wb.h(inParcel, readInt8);
                            break;
                        case '\t':
                            z27 = wb.n(inParcel, readInt8);
                            break;
                        case '\n':
                            str19 = wb.h(inParcel, readInt8);
                            break;
                        case 11:
                            str20 = wb.h(inParcel, readInt8);
                            break;
                        case '\f':
                            i13 = wb.u(inParcel, readInt8);
                            break;
                        case '\r':
                            arrayList3 = wb.j(inParcel, readInt8);
                            break;
                        default:
                            wb.y(inParcel, readInt8);
                            break;
                    }
                }
                wb.m(inParcel, z24);
                return new ConnectionConfiguration(str16, str17, i11, i12, z25, z26, str18, z27, str19, str20, i13, arrayList3);
            case 9:
                int z28 = wb.z(inParcel);
                while (inParcel.dataPosition() < z28) {
                    int readInt9 = inParcel.readInt();
                    if (((char) readInt9) != 2) {
                        wb.y(inParcel, readInt9);
                    } else {
                        bundle = wb.a(inParcel, readInt9);
                    }
                }
                wb.m(inParcel, z28);
                return new z(bundle);
            case 10:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(10);
                    public final int f1717a;
                    public final MediaDescriptionCompat f1718b;

                    {
                        this.f1717a = inParcel.readInt();
                        this.f1718b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f1717a + ", mDescription=" + this.f1718b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i14) {
                        parcel.writeInt(this.f1717a);
                        this.f1718b.writeToParcel(parcel, i14);
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
                obj.f2384a = inParcel.readString();
                obj.f2385b = inParcel.readInt();
                return obj;
            case 19:
                ?? obj2 = new Object();
                obj2.f2427e = null;
                obj2.f2428f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f2424a = inParcel.createStringArrayList();
                obj2.f2425b = inParcel.createStringArrayList();
                obj2.f2426c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.f2427e = inParcel.readString();
                obj2.f2428f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f2429n = inParcel.createTypedArrayList(e0.CREATOR);
                return obj2;
            case 20:
                return new n0(inParcel);
            case 21:
                return new ParcelImpl(inParcel);
            case 22:
                ?? obj3 = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i14 = c.c.f5215b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar = (c.b) queryLocalInterface;
                    } else {
                        ?? obj4 = new Object();
                        obj4.f5214a = readStrongBinder;
                        bVar = obj4;
                    }
                }
                obj3.f5217a = bVar;
                return obj3;
            case 23:
                int z29 = wb.z(inParcel);
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
                while (inParcel.dataPosition() < z29) {
                    int readInt10 = inParcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str21 = wb.h(inParcel, readInt10);
                            break;
                        case 3:
                            str22 = wb.h(inParcel, readInt10);
                            break;
                        case 4:
                            str23 = wb.h(inParcel, readInt10);
                            break;
                        case 5:
                            str24 = wb.h(inParcel, readInt10);
                            break;
                        case 6:
                            uri2 = (Uri) wb.g(inParcel, readInt10, Uri.CREATOR);
                            break;
                        case 7:
                            str25 = wb.h(inParcel, readInt10);
                            break;
                        case '\b':
                            j3 = wb.w(inParcel, readInt10);
                            break;
                        case '\t':
                            str26 = wb.h(inParcel, readInt10);
                            break;
                        case '\n':
                            arrayList4 = wb.l(inParcel, readInt10, Scope.CREATOR);
                            break;
                        case 11:
                            str27 = wb.h(inParcel, readInt10);
                            break;
                        case '\f':
                            str28 = wb.h(inParcel, readInt10);
                            break;
                        default:
                            wb.y(inParcel, readInt10);
                            break;
                    }
                }
                wb.m(inParcel, z29);
                return new GoogleSignInAccount(str21, str22, str23, str24, uri2, str25, j3, str26, arrayList4, str27, str28);
            case 24:
                int z30 = wb.z(inParcel);
                int i15 = 0;
                boolean z31 = false;
                boolean z32 = false;
                boolean z33 = false;
                ArrayList arrayList5 = null;
                Account account = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                while (inParcel.dataPosition() < z30) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            i15 = wb.u(inParcel, readInt11);
                            break;
                        case 2:
                            arrayList5 = wb.l(inParcel, readInt11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) wb.g(inParcel, readInt11, Account.CREATOR);
                            break;
                        case 4:
                            z31 = wb.n(inParcel, readInt11);
                            break;
                        case 5:
                            z32 = wb.n(inParcel, readInt11);
                            break;
                        case 6:
                            z33 = wb.n(inParcel, readInt11);
                            break;
                        case 7:
                            str29 = wb.h(inParcel, readInt11);
                            break;
                        case '\b':
                            str30 = wb.h(inParcel, readInt11);
                            break;
                        case '\t':
                            arrayList = wb.l(inParcel, readInt11, d6.a.CREATOR);
                            break;
                        case '\n':
                            str31 = wb.h(inParcel, readInt11);
                            break;
                        default:
                            wb.y(inParcel, readInt11);
                            break;
                    }
                }
                wb.m(inParcel, z30);
                return new GoogleSignInOptions(i15, arrayList5, account, z31, z32, z33, str29, str30, GoogleSignInOptions.c(arrayList), str31);
            case 25:
                int z34 = wb.z(inParcel);
                String str32 = "";
                String str33 = "";
                while (inParcel.dataPosition() < z34) {
                    int readInt12 = inParcel.readInt();
                    char c12 = (char) readInt12;
                    if (c12 != 4) {
                        if (c12 != 7) {
                            if (c12 != '\b') {
                                wb.y(inParcel, readInt12);
                            } else {
                                str33 = wb.h(inParcel, readInt12);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) wb.g(inParcel, readInt12, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str32 = wb.h(inParcel, readInt12);
                    }
                }
                wb.m(inParcel, z34);
                return new SignInAccount(str32, googleSignInAccount, str33);
            case 26:
                int z35 = wb.z(inParcel);
                Bundle bundle2 = null;
                int i16 = 0;
                while (inParcel.dataPosition() < z35) {
                    int readInt13 = inParcel.readInt();
                    char c13 = (char) readInt13;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                wb.y(inParcel, readInt13);
                            } else {
                                bundle2 = wb.a(inParcel, readInt13);
                            }
                        } else {
                            i16 = wb.u(inParcel, readInt13);
                        }
                    } else {
                        i7 = wb.u(inParcel, readInt13);
                    }
                }
                wb.m(inParcel, z35);
                return new d6.a(i7, i16, bundle2);
            case 27:
                int z36 = wb.z(inParcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (inParcel.dataPosition() < z36) {
                    int readInt14 = inParcel.readInt();
                    char c14 = (char) readInt14;
                    if (c14 != 2) {
                        if (c14 != 5) {
                            wb.y(inParcel, readInt14);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) wb.g(inParcel, readInt14, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str2 = wb.h(inParcel, readInt14);
                    }
                }
                wb.m(inParcel, z36);
                return new SignInConfiguration(str2, googleSignInOptions);
            case 28:
                try {
                    return Transport.a(inParcel.readString());
                } catch (d7.a e10) {
                    throw new RuntimeException(e10);
                }
            default:
                int z37 = wb.z(inParcel);
                while (inParcel.dataPosition() < z37) {
                    int readInt15 = inParcel.readInt();
                    if (((char) readInt15) != 1) {
                        wb.y(inParcel, readInt15);
                    } else {
                        str = wb.h(inParcel, readInt15);
                    }
                }
                wb.m(inParcel, z37);
                return new db.g(str);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f57576a) {
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
                return new z[i7];
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
                return new e0[i7];
            case 19:
                return new k0[i7];
            case 20:
                return new n0[i7];
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
