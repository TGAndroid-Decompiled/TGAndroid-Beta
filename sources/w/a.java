package w;

import a8.h;
import a8.i;
import android.accounts.Account;
import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.f0;
import androidx.fragment.app.o0;
import b6.g0;
import b6.k;
import b6.o;
import b6.p;
import b6.v;
import b6.w;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import j$.util.Objects;
import j7.f5;
import j7.l0;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
public final class a implements Parcelable.Creator {
    public final int f46344a;

    public a(int i10) {
        this.f46344a = i10;
    }

    public static void a(b6.f fVar, Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = fVar.f1573a;
        f5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = fVar.f1574b;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i12);
        int i13 = fVar.f1575c;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i13);
        f5.l(parcel, 4, fVar.d);
        f5.f(parcel, 5, fVar.e);
        f5.o(parcel, 6, fVar.f1576f, i10);
        f5.b(parcel, 7, fVar.h);
        f5.k(parcel, 8, fVar.f1577n, i10);
        f5.o(parcel, 10, fVar.f1578r, i10);
        f5.o(parcel, 11, fVar.f1579s, i10);
        boolean z4 = fVar.v;
        f5.s(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i14 = fVar.f1580w;
        f5.s(parcel, 13, 4);
        parcel.writeInt(i14);
        boolean z10 = fVar.f1581x;
        f5.s(parcel, 14, 4);
        parcel.writeInt(z10 ? 1 : 0);
        f5.l(parcel, 15, fVar.f1582y);
        f5.r(parcel, q10);
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        switch (this.f46344a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                int z4 = l0.z(inParcel);
                int i10 = 0;
                Uri uri = null;
                int i11 = 0;
                int i12 = 0;
                while (inParcel.dataPosition() < z4) {
                    int readInt = inParcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    l0.y(inParcel, readInt);
                                } else {
                                    i12 = l0.u(inParcel, readInt);
                                }
                            } else {
                                i11 = l0.u(inParcel, readInt);
                            }
                        } else {
                            uri = (Uri) l0.g(inParcel, readInt, Uri.CREATOR);
                        }
                    } else {
                        i10 = l0.u(inParcel, readInt);
                    }
                }
                l0.m(inParcel, z4);
                return new a6.a(i10, uri, i11, i12);
            case 2:
                int z10 = l0.z(inParcel);
                String str = null;
                while (inParcel.dataPosition() < z10) {
                    int readInt2 = inParcel.readInt();
                    if (((char) readInt2) != 2) {
                        l0.y(inParcel, readInt2);
                    } else {
                        str = l0.h(inParcel, readInt2);
                    }
                }
                l0.m(inParcel, z10);
                return new a8.f(str);
            case 3:
                int z11 = l0.z(inParcel);
                String str2 = null;
                byte[] bArr = null;
                int i13 = 0;
                while (inParcel.dataPosition() < z11) {
                    int readInt3 = inParcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                l0.y(inParcel, readInt3);
                            } else {
                                i13 = l0.u(inParcel, readInt3);
                            }
                        } else {
                            bArr = l0.b(inParcel, readInt3);
                        }
                    } else {
                        str2 = l0.h(inParcel, readInt3);
                    }
                }
                l0.m(inParcel, z11);
                return new a8.a(str2, bArr, i13);
            case 4:
                int z12 = l0.z(inParcel);
                long j10 = 0;
                a8.a[] aVarArr = null;
                int i14 = 0;
                boolean z13 = false;
                while (inParcel.dataPosition() < z12) {
                    int readInt4 = inParcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    l0.y(inParcel, readInt4);
                                } else {
                                    z13 = l0.n(inParcel, readInt4);
                                }
                            } else {
                                i14 = l0.u(inParcel, readInt4);
                            }
                        } else {
                            aVarArr = (a8.a[]) l0.k(inParcel, readInt4, a8.a.CREATOR);
                        }
                    } else {
                        j10 = l0.w(inParcel, readInt4);
                    }
                }
                l0.m(inParcel, z12);
                return new a8.g(j10, aVarArr, i14, z13);
            case 5:
                int z14 = l0.z(inParcel);
                String str3 = null;
                while (inParcel.dataPosition() < z14) {
                    int readInt5 = inParcel.readInt();
                    if (((char) readInt5) != 2) {
                        l0.y(inParcel, readInt5);
                    } else {
                        str3 = l0.h(inParcel, readInt5);
                    }
                }
                l0.m(inParcel, z14);
                return new h(str3);
            case 6:
                int z15 = l0.z(inParcel);
                int i15 = 0;
                boolean z16 = false;
                while (inParcel.dataPosition() < z15) {
                    int readInt6 = inParcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            l0.y(inParcel, readInt6);
                        } else {
                            z16 = l0.n(inParcel, readInt6);
                        }
                    } else {
                        i15 = l0.u(inParcel, readInt6);
                    }
                }
                l0.m(inParcel, z15);
                return new i(i15, z16);
            case 7:
                int z17 = l0.z(inParcel);
                String str4 = null;
                byte[] bArr2 = null;
                long j11 = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (inParcel.dataPosition() < z17) {
                    int readInt7 = inParcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            if (c13 != 4) {
                                if (c13 != 5) {
                                    if (c13 != 6) {
                                        l0.y(inParcel, readInt7);
                                    } else {
                                        bArr2 = l0.b(inParcel, readInt7);
                                    }
                                } else {
                                    j11 = l0.w(inParcel, readInt7);
                                }
                            } else {
                                parcelFileDescriptor = (ParcelFileDescriptor) l0.g(inParcel, readInt7, ParcelFileDescriptor.CREATOR);
                            }
                        } else {
                            dataHolder = (DataHolder) l0.g(inParcel, readInt7, DataHolder.CREATOR);
                        }
                    } else {
                        str4 = l0.h(inParcel, readInt7);
                    }
                }
                l0.m(inParcel, z17);
                ?? obj = new Object();
                obj.f130a = str4;
                obj.f131b = dataHolder;
                obj.f132c = parcelFileDescriptor;
                obj.d = j11;
                obj.e = bArr2;
                return obj;
            case 8:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(8);
                    public final int f205a;
                    public final MediaDescriptionCompat f206b;

                    {
                        this.f205a = inParcel.readInt();
                        this.f206b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f205a + ", mDescription=" + this.f206b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i16) {
                        parcel.writeInt(this.f205a);
                        this.f206b.writeToParcel(parcel, i16);
                    }
                };
            case 9:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 10:
                return new MediaMetadataCompat(inParcel);
            case 11:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 12:
                return new androidx.activity.result.a(inParcel);
            case 13:
                j.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 14:
                return new androidx.fragment.app.b(inParcel);
            case 15:
                return new androidx.fragment.app.c(inParcel);
            case 16:
                ?? obj2 = new Object();
                obj2.f843a = inParcel.readString();
                obj2.f844b = inParcel.readInt();
                return obj2;
            case 17:
                ?? obj3 = new Object();
                obj3.e = null;
                obj3.f884f = new ArrayList();
                obj3.h = new ArrayList();
                obj3.f881a = inParcel.createStringArrayList();
                obj3.f882b = inParcel.createStringArrayList();
                obj3.f883c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj3.d = inParcel.readInt();
                obj3.e = inParcel.readString();
                obj3.f884f = inParcel.createStringArrayList();
                obj3.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj3.f885n = inParcel.createTypedArrayList(f0.CREATOR);
                return obj3;
            case 18:
                return new o0(inParcel);
            case 19:
                int z18 = l0.z(inParcel);
                String str5 = null;
                int i16 = 0;
                while (inParcel.dataPosition() < z18) {
                    int readInt8 = inParcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            l0.y(inParcel, readInt8);
                        } else {
                            str5 = l0.h(inParcel, readInt8);
                        }
                    } else {
                        i16 = l0.u(inParcel, readInt8);
                    }
                }
                l0.m(inParcel, z18);
                return new b6.d(i16, str5);
            case 20:
                int z19 = l0.z(inParcel);
                ArrayList arrayList = null;
                int i17 = 0;
                while (inParcel.dataPosition() < z19) {
                    int readInt9 = inParcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            l0.y(inParcel, readInt9);
                        } else {
                            arrayList = l0.l(inParcel, readInt9, k.CREATOR);
                        }
                    } else {
                        i17 = l0.u(inParcel, readInt9);
                    }
                }
                l0.m(inParcel, z19);
                return new p(i17, arrayList);
            case 21:
                int z20 = l0.z(inParcel);
                String str6 = null;
                String str7 = null;
                long j12 = 0;
                long j13 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = -1;
                while (inParcel.dataPosition() < z20) {
                    int readInt10 = inParcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i18 = l0.u(inParcel, readInt10);
                            break;
                        case 2:
                            i19 = l0.u(inParcel, readInt10);
                            break;
                        case 3:
                            i20 = l0.u(inParcel, readInt10);
                            break;
                        case 4:
                            j12 = l0.w(inParcel, readInt10);
                            break;
                        case 5:
                            j13 = l0.w(inParcel, readInt10);
                            break;
                        case 6:
                            str6 = l0.h(inParcel, readInt10);
                            break;
                        case 7:
                            str7 = l0.h(inParcel, readInt10);
                            break;
                        case '\b':
                            i21 = l0.u(inParcel, readInt10);
                            break;
                        case '\t':
                            i22 = l0.u(inParcel, readInt10);
                            break;
                        default:
                            l0.y(inParcel, readInt10);
                            break;
                    }
                }
                l0.m(inParcel, z20);
                return new k(i18, i19, i20, j12, j13, str6, str7, i21, i22);
            case 22:
                int z21 = l0.z(inParcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i23 = 0;
                int i24 = 0;
                while (inParcel.dataPosition() < z21) {
                    int readInt11 = inParcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                if (c16 != 4) {
                                    l0.y(inParcel, readInt11);
                                } else {
                                    googleSignInAccount = (GoogleSignInAccount) l0.g(inParcel, readInt11, GoogleSignInAccount.CREATOR);
                                }
                            } else {
                                i24 = l0.u(inParcel, readInt11);
                            }
                        } else {
                            account = (Account) l0.g(inParcel, readInt11, Account.CREATOR);
                        }
                    } else {
                        i23 = l0.u(inParcel, readInt11);
                    }
                }
                l0.m(inParcel, z21);
                return new v(i23, account, i24, googleSignInAccount);
            case 23:
                int z22 = l0.z(inParcel);
                IBinder iBinder = null;
                y5.a aVar = null;
                int i25 = 0;
                boolean z23 = false;
                boolean z24 = false;
                while (inParcel.dataPosition() < z22) {
                    int readInt12 = inParcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 != 1) {
                        if (c17 != 2) {
                            if (c17 != 3) {
                                if (c17 != 4) {
                                    if (c17 != 5) {
                                        l0.y(inParcel, readInt12);
                                    } else {
                                        z24 = l0.n(inParcel, readInt12);
                                    }
                                } else {
                                    z23 = l0.n(inParcel, readInt12);
                                }
                            } else {
                                aVar = (y5.a) l0.g(inParcel, readInt12, y5.a.CREATOR);
                            }
                        } else {
                            iBinder = l0.t(inParcel, readInt12);
                        }
                    } else {
                        i25 = l0.u(inParcel, readInt12);
                    }
                }
                l0.m(inParcel, z22);
                return new w(i25, iBinder, aVar, z23, z24);
            case 24:
                int z25 = l0.z(inParcel);
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                boolean z26 = false;
                boolean z27 = false;
                while (inParcel.dataPosition() < z25) {
                    int readInt13 = inParcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                if (c18 != 4) {
                                    if (c18 != 5) {
                                        l0.y(inParcel, readInt13);
                                    } else {
                                        i28 = l0.u(inParcel, readInt13);
                                    }
                                } else {
                                    i27 = l0.u(inParcel, readInt13);
                                }
                            } else {
                                z27 = l0.n(inParcel, readInt13);
                            }
                        } else {
                            z26 = l0.n(inParcel, readInt13);
                        }
                    } else {
                        i26 = l0.u(inParcel, readInt13);
                    }
                }
                l0.m(inParcel, z25);
                return new o(i26, i27, i28, z26, z27);
            case 25:
                return new BinderWrapper(inParcel);
            case 26:
                int z28 = l0.z(inParcel);
                Bundle bundle = null;
                y5.c[] cVarArr = null;
                b6.e eVar = null;
                int i29 = 0;
                while (inParcel.dataPosition() < z28) {
                    int readInt14 = inParcel.readInt();
                    char c19 = (char) readInt14;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            if (c19 != 3) {
                                if (c19 != 4) {
                                    l0.y(inParcel, readInt14);
                                } else {
                                    eVar = (b6.e) l0.g(inParcel, readInt14, b6.e.CREATOR);
                                }
                            } else {
                                i29 = l0.u(inParcel, readInt14);
                            }
                        } else {
                            cVarArr = (y5.c[]) l0.k(inParcel, readInt14, y5.c.CREATOR);
                        }
                    } else {
                        bundle = l0.a(inParcel, readInt14);
                    }
                }
                l0.m(inParcel, z28);
                ?? obj4 = new Object();
                obj4.f1594a = bundle;
                obj4.f1595b = cVarArr;
                obj4.f1596c = i29;
                obj4.d = eVar;
                return obj4;
            case 27:
                int z29 = l0.z(inParcel);
                o oVar = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z30 = false;
                boolean z31 = false;
                int i30 = 0;
                while (inParcel.dataPosition() < z29) {
                    int readInt15 = inParcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            oVar = (o) l0.g(inParcel, readInt15, o.CREATOR);
                            break;
                        case 2:
                            z30 = l0.n(inParcel, readInt15);
                            break;
                        case 3:
                            z31 = l0.n(inParcel, readInt15);
                            break;
                        case 4:
                            iArr = l0.d(inParcel, readInt15);
                            break;
                        case 5:
                            i30 = l0.u(inParcel, readInt15);
                            break;
                        case 6:
                            iArr2 = l0.d(inParcel, readInt15);
                            break;
                        default:
                            l0.y(inParcel, readInt15);
                            break;
                    }
                }
                l0.m(inParcel, z29);
                return new b6.e(oVar, z30, z31, iArr, i30, iArr2);
            case 28:
                int z32 = l0.z(inParcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = b6.f.B;
                String str8 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str9 = null;
                y5.c[] cVarArr2 = b6.f.C;
                y5.c[] cVarArr3 = cVarArr2;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                boolean z33 = false;
                int i34 = 0;
                boolean z34 = false;
                while (inParcel.dataPosition() < z32) {
                    int readInt16 = inParcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i31 = l0.u(inParcel, readInt16);
                            break;
                        case 2:
                            i32 = l0.u(inParcel, readInt16);
                            break;
                        case 3:
                            i33 = l0.u(inParcel, readInt16);
                            break;
                        case 4:
                            str8 = l0.h(inParcel, readInt16);
                            break;
                        case 5:
                            iBinder2 = l0.t(inParcel, readInt16);
                            break;
                        case 6:
                            scopeArr = (Scope[]) l0.k(inParcel, readInt16, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = l0.a(inParcel, readInt16);
                            break;
                        case '\b':
                            account2 = (Account) l0.g(inParcel, readInt16, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            l0.y(inParcel, readInt16);
                            break;
                        case '\n':
                            cVarArr2 = (y5.c[]) l0.k(inParcel, readInt16, y5.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (y5.c[]) l0.k(inParcel, readInt16, y5.c.CREATOR);
                            break;
                        case '\f':
                            z33 = l0.n(inParcel, readInt16);
                            break;
                        case '\r':
                            i34 = l0.u(inParcel, readInt16);
                            break;
                        case 14:
                            z34 = l0.n(inParcel, readInt16);
                            break;
                        case 15:
                            str9 = l0.h(inParcel, readInt16);
                            break;
                    }
                }
                l0.m(inParcel, z32);
                return new b6.f(i31, i32, i33, str8, iBinder2, scopeArr, bundle2, account2, cVarArr2, cVarArr3, z33, i34, z34, str9);
            default:
                int z35 = l0.z(inParcel);
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                b9.a aVar2 = null;
                String str14 = null;
                Bundle bundle3 = null;
                while (inParcel.dataPosition() < z35) {
                    int readInt17 = inParcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            str10 = l0.h(inParcel, readInt17);
                            break;
                        case 2:
                            str11 = l0.h(inParcel, readInt17);
                            break;
                        case 3:
                            str12 = l0.h(inParcel, readInt17);
                            break;
                        case 4:
                            str13 = l0.h(inParcel, readInt17);
                            break;
                        case 5:
                            aVar2 = (b9.a) l0.g(inParcel, readInt17, b9.a.CREATOR);
                            break;
                        case 6:
                            str14 = l0.h(inParcel, readInt17);
                            break;
                        case 7:
                            bundle3 = l0.a(inParcel, readInt17);
                            break;
                        default:
                            l0.y(inParcel, readInt17);
                            break;
                    }
                }
                l0.m(inParcel, z35);
                return new b9.b(str10, str11, str12, str13, aVar2, str14, bundle3);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f46344a) {
            case 0:
                return new b[i10];
            case 1:
                return new a6.a[i10];
            case 2:
                return new a8.f[i10];
            case 3:
                return new a8.a[i10];
            case 4:
                return new a8.g[i10];
            case 5:
                return new h[i10];
            case 6:
                return new i[i10];
            case 7:
                return new a8.b[i10];
            case 8:
                return new MediaBrowserCompat$MediaItem[i10];
            case 9:
                return new MediaDescriptionCompat[i10];
            case 10:
                return new MediaMetadataCompat[i10];
            case 11:
                return new RatingCompat[i10];
            case 12:
                return new androidx.activity.result.a[i10];
            case 13:
                return new androidx.activity.result.g[i10];
            case 14:
                return new androidx.fragment.app.b[i10];
            case 15:
                return new androidx.fragment.app.c[i10];
            case 16:
                return new f0[i10];
            case 17:
                return new androidx.fragment.app.l0[i10];
            case 18:
                return new o0[i10];
            case 19:
                return new b6.d[i10];
            case 20:
                return new p[i10];
            case 21:
                return new k[i10];
            case 22:
                return new v[i10];
            case 23:
                return new w[i10];
            case 24:
                return new o[i10];
            case 25:
                return new BinderWrapper[i10];
            case 26:
                return new g0[i10];
            case 27:
                return new b6.e[i10];
            case 28:
                return new b6.f[i10];
            default:
                return new b9.b[i10];
        }
    }
}
