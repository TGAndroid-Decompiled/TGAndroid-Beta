package w;

import a8.h;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
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
import b7.i;
import b7.k;
import b7.l;
import b7.m;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.q;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import z5.u;
import z5.v;
public final class a implements Parcelable.Creator {
    public final int f49606a;

    public a(int i10) {
        this.f49606a = i10;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        int i10 = -1;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        c.b bVar = null;
        Status status = null;
        Bundle bundle2 = null;
        String str = null;
        String str2 = null;
        b7.g[] gVarArr = null;
        w5.a aVar = null;
        u uVar = null;
        ArrayList arrayList = null;
        switch (this.f49606a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                int A = ce.b.A(inParcel);
                int i15 = 0;
                while (inParcel.dataPosition() < A) {
                    int readInt = inParcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                ce.b.z(inParcel, readInt);
                            } else {
                                intent = (Intent) ce.b.h(inParcel, readInt, Intent.CREATOR);
                            }
                        } else {
                            i15 = ce.b.v(inParcel, readInt);
                        }
                    } else {
                        i11 = ce.b.v(inParcel, readInt);
                    }
                }
                ce.b.n(inParcel, A);
                return new a8.b(i11, i15, intent);
            case 2:
                int A2 = ce.b.A(inParcel);
                String str3 = null;
                while (inParcel.dataPosition() < A2) {
                    int readInt2 = inParcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            ce.b.z(inParcel, readInt2);
                        } else {
                            str3 = ce.b.i(inParcel, readInt2);
                        }
                    } else {
                        arrayList = ce.b.k(inParcel, readInt2);
                    }
                }
                ce.b.n(inParcel, A2);
                return new a8.f(str3, arrayList);
            case 3:
                int A3 = ce.b.A(inParcel);
                while (inParcel.dataPosition() < A3) {
                    int readInt3 = inParcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            ce.b.z(inParcel, readInt3);
                        } else {
                            uVar = (u) ce.b.h(inParcel, readInt3, u.CREATOR);
                        }
                    } else {
                        i14 = ce.b.v(inParcel, readInt3);
                    }
                }
                ce.b.n(inParcel, A3);
                return new a8.g(i14, uVar);
            case 4:
                int A4 = ce.b.A(inParcel);
                v vVar = null;
                while (inParcel.dataPosition() < A4) {
                    int readInt4 = inParcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                ce.b.z(inParcel, readInt4);
                            } else {
                                vVar = (v) ce.b.h(inParcel, readInt4, v.CREATOR);
                            }
                        } else {
                            aVar = (w5.a) ce.b.h(inParcel, readInt4, w5.a.CREATOR);
                        }
                    } else {
                        i13 = ce.b.v(inParcel, readInt4);
                    }
                }
                ce.b.n(inParcel, A4);
                return new h(i13, aVar, vVar);
            case 5:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(5);
                    public final int f760a;
                    public final MediaDescriptionCompat f761b;

                    {
                        this.f760a = inParcel.readInt();
                        this.f761b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f760a + ", mDescription=" + this.f761b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i16) {
                        parcel.writeInt(this.f760a);
                        this.f761b.writeToParcel(parcel, i16);
                    }
                };
            case 6:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(inParcel));
            case 7:
                return new MediaMetadataCompat(inParcel);
            case 8:
                return new RatingCompat(inParcel.readInt(), inParcel.readFloat());
            case 9:
                return new androidx.activity.result.a(inParcel);
            case 10:
                j.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                j.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 11:
                return new androidx.fragment.app.b(inParcel);
            case 12:
                return new androidx.fragment.app.c(inParcel);
            case 13:
                ?? obj = new Object();
                obj.f1432a = inParcel.readString();
                obj.f1433b = inParcel.readInt();
                return obj;
            case 14:
                ?? obj2 = new Object();
                obj2.f1475e = null;
                obj2.f1476f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f1472a = inParcel.createStringArrayList();
                obj2.f1473b = inParcel.createStringArrayList();
                obj2.f1474c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.f1475e = inParcel.readString();
                obj2.f1476f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f1477n = inParcel.createTypedArrayList(f0.CREATOR);
                return obj2;
            case 15:
                return new o0(inParcel);
            case 16:
                int A5 = ce.b.A(inParcel);
                String str4 = null;
                Account account = null;
                while (inParcel.dataPosition() < A5) {
                    int readInt5 = inParcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    ce.b.z(inParcel, readInt5);
                                } else {
                                    account = (Account) ce.b.h(inParcel, readInt5, Account.CREATOR);
                                }
                            } else {
                                z12 = ce.b.o(inParcel, readInt5);
                            }
                        } else {
                            str4 = ce.b.i(inParcel, readInt5);
                        }
                    } else {
                        gVarArr = (b7.g[]) ce.b.l(inParcel, readInt5, b7.g.CREATOR);
                    }
                }
                ce.b.n(inParcel, A5);
                return new b7.e(gVarArr, str4, z12, account);
            case 17:
                int A6 = ce.b.A(inParcel);
                String str5 = null;
                String str6 = null;
                while (inParcel.dataPosition() < A6) {
                    int readInt6 = inParcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                ce.b.z(inParcel, readInt6);
                            } else {
                                str6 = ce.b.i(inParcel, readInt6);
                            }
                        } else {
                            str5 = ce.b.i(inParcel, readInt6);
                        }
                    } else {
                        str2 = ce.b.i(inParcel, readInt6);
                    }
                }
                ce.b.n(inParcel, A6);
                return new b7.f(str2, str5, str6);
            case 18:
                int A7 = ce.b.A(inParcel);
                k kVar = null;
                byte[] bArr = null;
                while (inParcel.dataPosition() < A7) {
                    int readInt7 = inParcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 != 1) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                if (c14 != 5) {
                                    ce.b.z(inParcel, readInt7);
                                } else {
                                    bArr = ce.b.c(inParcel, readInt7);
                                }
                            } else {
                                i10 = ce.b.v(inParcel, readInt7);
                            }
                        } else {
                            kVar = (k) ce.b.h(inParcel, readInt7, k.CREATOR);
                        }
                    } else {
                        str = ce.b.i(inParcel, readInt7);
                    }
                }
                ce.b.n(inParcel, A7);
                return new b7.g(str, kVar, i10, bArr);
            case 19:
                int A8 = ce.b.A(inParcel);
                while (inParcel.dataPosition() < A8) {
                    int readInt8 = inParcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            ce.b.z(inParcel, readInt8);
                        } else {
                            bundle2 = ce.b.b(inParcel, readInt8);
                        }
                    } else {
                        i12 = ce.b.v(inParcel, readInt8);
                    }
                }
                ce.b.n(inParcel, A8);
                return new b7.h(i12, bundle2);
            case 20:
                int A9 = ce.b.A(inParcel);
                ArrayList arrayList2 = null;
                String[] strArr = null;
                while (inParcel.dataPosition() < A9) {
                    int readInt9 = inParcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                ce.b.z(inParcel, readInt9);
                            } else {
                                strArr = ce.b.j(inParcel, readInt9);
                            }
                        } else {
                            arrayList2 = ce.b.m(inParcel, readInt9, m.CREATOR);
                        }
                    } else {
                        status = (Status) ce.b.h(inParcel, readInt9, Status.CREATOR);
                    }
                }
                ce.b.n(inParcel, A9);
                ?? obj3 = new Object();
                obj3.f1955a = status;
                obj3.f1956b = arrayList2;
                obj3.f1957c = strArr;
                return obj3;
            case 21:
                int A10 = ce.b.A(inParcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                b7.h[] hVarArr = null;
                String str10 = null;
                l lVar = null;
                boolean z13 = false;
                int i16 = 1;
                boolean z14 = false;
                while (inParcel.dataPosition() < A10) {
                    int readInt10 = inParcel.readInt();
                    char c17 = (char) readInt10;
                    if (c17 != 11) {
                        if (c17 != '\f') {
                            switch (c17) {
                                case 1:
                                    str7 = ce.b.i(inParcel, readInt10);
                                    continue;
                                case 2:
                                    str8 = ce.b.i(inParcel, readInt10);
                                    continue;
                                case 3:
                                    z13 = ce.b.o(inParcel, readInt10);
                                    continue;
                                case 4:
                                    i16 = ce.b.v(inParcel, readInt10);
                                    continue;
                                case 5:
                                    z14 = ce.b.o(inParcel, readInt10);
                                    continue;
                                case 6:
                                    str9 = ce.b.i(inParcel, readInt10);
                                    continue;
                                case 7:
                                    hVarArr = (b7.h[]) ce.b.l(inParcel, readInt10, b7.h.CREATOR);
                                    continue;
                                default:
                                    ce.b.z(inParcel, readInt10);
                                    continue;
                            }
                        } else {
                            lVar = (l) ce.b.h(inParcel, readInt10, l.CREATOR);
                        }
                    } else {
                        str10 = ce.b.i(inParcel, readInt10);
                    }
                }
                ce.b.n(inParcel, A10);
                return new k(str7, str8, z13, i16, z14, str9, hVarArr, str10, lVar);
            case 22:
                int A11 = ce.b.A(inParcel);
                while (inParcel.dataPosition() < A11) {
                    int readInt11 = inParcel.readInt();
                    if (((char) readInt11) != 1) {
                        ce.b.z(inParcel, readInt11);
                    } else {
                        z11 = ce.b.o(inParcel, readInt11);
                    }
                }
                ce.b.n(inParcel, A11);
                return new l(z11);
            case 23:
                int A12 = ce.b.A(inParcel);
                long j10 = 0;
                b7.f fVar = null;
                String str11 = null;
                b7.e eVar = null;
                String str12 = null;
                int i17 = 0;
                boolean z15 = false;
                int i18 = -1;
                int i19 = 0;
                while (inParcel.dataPosition() < A12) {
                    int readInt12 = inParcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            fVar = (b7.f) ce.b.h(inParcel, readInt12, b7.f.CREATOR);
                            break;
                        case 2:
                            j10 = ce.b.x(inParcel, readInt12);
                            break;
                        case 3:
                            i17 = ce.b.v(inParcel, readInt12);
                            break;
                        case 4:
                            str11 = ce.b.i(inParcel, readInt12);
                            break;
                        case 5:
                            eVar = (b7.e) ce.b.h(inParcel, readInt12, b7.e.CREATOR);
                            break;
                        case 6:
                            z15 = ce.b.o(inParcel, readInt12);
                            break;
                        case 7:
                            i18 = ce.b.v(inParcel, readInt12);
                            break;
                        case '\b':
                            i19 = ce.b.v(inParcel, readInt12);
                            break;
                        case '\t':
                            str12 = ce.b.i(inParcel, readInt12);
                            break;
                        default:
                            ce.b.z(inParcel, readInt12);
                            break;
                    }
                }
                ce.b.n(inParcel, A12);
                return new m(fVar, j10, i17, str11, eVar, z15, i18, i19, str12);
            case 24:
                ?? obj4 = new Object();
                IBinder readStrongBinder = inParcel.readStrongBinder();
                int i20 = c.c.f2718b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof c.b)) {
                        bVar = (c.b) queryLocalInterface;
                    } else {
                        ?? obj5 = new Object();
                        obj5.f2717a = readStrongBinder;
                        bVar = obj5;
                    }
                }
                obj4.f2720a = bVar;
                return obj4;
            case 25:
                String readString = inParcel.readString();
                readString.getClass();
                return new c4.a(inParcel.readInt(), readString);
            case 26:
                int A13 = ce.b.A(inParcel);
                while (inParcel.dataPosition() < A13) {
                    int readInt13 = inParcel.readInt();
                    if (((char) readInt13) != 2) {
                        ce.b.z(inParcel, readInt13);
                    } else {
                        bundle = ce.b.b(inParcel, readInt13);
                    }
                }
                ce.b.n(inParcel, A13);
                return new q(bundle);
            case 27:
                return new d4.a(inParcel);
            case 28:
                int A14 = ce.b.A(inParcel);
                int i21 = 0;
                while (inParcel.dataPosition() < A14) {
                    int readInt14 = inParcel.readInt();
                    char c18 = (char) readInt14;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            ce.b.z(inParcel, readInt14);
                        } else {
                            i21 = ce.b.v(inParcel, readInt14);
                        }
                    } else {
                        z10 = ce.b.o(inParcel, readInt14);
                    }
                }
                ce.b.n(inParcel, A14);
                return new d6.a(i21, z10);
            default:
                int A15 = ce.b.A(inParcel);
                while (inParcel.dataPosition() < A15) {
                    int readInt15 = inParcel.readInt();
                    if (((char) readInt15) != 1) {
                        ce.b.z(inParcel, readInt15);
                    } else {
                        pendingIntent = (PendingIntent) ce.b.h(inParcel, readInt15, PendingIntent.CREATOR);
                    }
                }
                ce.b.n(inParcel, A15);
                return new d6.b(pendingIntent);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f49606a) {
            case 0:
                return new b[i10];
            case 1:
                return new a8.b[i10];
            case 2:
                return new a8.f[i10];
            case 3:
                return new a8.g[i10];
            case 4:
                return new h[i10];
            case 5:
                return new MediaBrowserCompat$MediaItem[i10];
            case 6:
                return new MediaDescriptionCompat[i10];
            case 7:
                return new MediaMetadataCompat[i10];
            case 8:
                return new RatingCompat[i10];
            case 9:
                return new androidx.activity.result.a[i10];
            case 10:
                return new androidx.activity.result.g[i10];
            case 11:
                return new androidx.fragment.app.b[i10];
            case 12:
                return new androidx.fragment.app.c[i10];
            case 13:
                return new f0[i10];
            case 14:
                return new l0[i10];
            case 15:
                return new o0[i10];
            case 16:
                return new b7.e[i10];
            case 17:
                return new b7.f[i10];
            case 18:
                return new b7.g[i10];
            case 19:
                return new b7.h[i10];
            case 20:
                return new i[i10];
            case 21:
                return new k[i10];
            case 22:
                return new l[i10];
            case 23:
                return new m[i10];
            case 24:
                return new c.d[i10];
            case 25:
                return new c4.a[i10];
            case 26:
                return new q[i10];
            case 27:
                return new d4.a[i10];
            case 28:
                return new d6.a[i10];
            default:
                return new d6.b[i10];
        }
    }
}
