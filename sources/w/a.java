package w;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.media.MediaDescription;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.f0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import b8.h;
import b8.j;
import b8.k;
import b8.l;
import b8.m;
import g7.o8;
import j$.util.Objects;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
public final class a implements Parcelable.Creator {
    public final int f48415a;

    public a(int i9) {
        this.f48415a = i9;
    }

    @Override
    public final Object createFromParcel(final Parcel inParcel) {
        switch (this.f48415a) {
            case 0:
                Bundle readBundle = inParcel.readBundle(a.class.getClassLoader());
                Objects.requireNonNull(readBundle);
                return new b(readBundle);
            case 1:
                String readString = inParcel.readString();
                readString.getClass();
                return new a4.a(inParcel.readInt(), readString);
            case 2:
                return new Parcelable(inParcel) {
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new w.a(2);
                    public final int f263a;
                    public final MediaDescriptionCompat f264b;

                    {
                        this.f263a = inParcel.readInt();
                        this.f264b = MediaDescriptionCompat.CREATOR.createFromParcel(inParcel);
                    }

                    @Override
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f263a + ", mDescription=" + this.f264b + '}';
                    }

                    @Override
                    public final void writeToParcel(Parcel parcel, int i9) {
                        parcel.writeInt(this.f263a);
                        this.f264b.writeToParcel(parcel, i9);
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
                i.e(inParcel, "inParcel");
                Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
                i.b(readParcelable);
                return new androidx.activity.result.g((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 8:
                return new androidx.fragment.app.b(inParcel);
            case 9:
                return new androidx.fragment.app.c(inParcel);
            case 10:
                ?? obj = new Object();
                obj.f936a = inParcel.readString();
                obj.f937b = inParcel.readInt();
                return obj;
            case 11:
                ?? obj2 = new Object();
                obj2.f979e = null;
                obj2.f980f = new ArrayList();
                obj2.h = new ArrayList();
                obj2.f976a = inParcel.createStringArrayList();
                obj2.f977b = inParcel.createStringArrayList();
                obj2.f978c = (androidx.fragment.app.b[]) inParcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                obj2.d = inParcel.readInt();
                obj2.f979e = inParcel.readString();
                obj2.f980f = inParcel.createStringArrayList();
                obj2.h = inParcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                obj2.f981n = inParcel.createTypedArrayList(f0.CREATOR);
                return obj2;
            case 12:
                return new o0(inParcel);
            case 13:
                return new b4.a(inParcel);
            case 14:
                int z10 = o8.z(inParcel);
                boolean z11 = false;
                int i9 = 0;
                while (inParcel.dataPosition() < z10) {
                    int readInt = inParcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            o8.y(inParcel, readInt);
                        } else {
                            i9 = o8.u(inParcel, readInt);
                        }
                    } else {
                        z11 = o8.n(inParcel, readInt);
                    }
                }
                o8.m(inParcel, z10);
                return new b6.a(i9, z11);
            case 15:
                int z12 = o8.z(inParcel);
                PendingIntent pendingIntent = null;
                while (inParcel.dataPosition() < z12) {
                    int readInt2 = inParcel.readInt();
                    if (((char) readInt2) != 1) {
                        o8.y(inParcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) o8.g(inParcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                o8.m(inParcel, z12);
                return new b6.b(pendingIntent);
            case 16:
                int z13 = o8.z(inParcel);
                int i10 = 0;
                boolean z14 = false;
                while (inParcel.dataPosition() < z13) {
                    int readInt3 = inParcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            o8.y(inParcel, readInt3);
                        } else {
                            z14 = o8.n(inParcel, readInt3);
                        }
                    } else {
                        i10 = o8.u(inParcel, readInt3);
                    }
                }
                o8.m(inParcel, z13);
                return new b6.c(i10, z14);
            case 17:
                int z15 = o8.z(inParcel);
                int i11 = 0;
                String[] strArr = null;
                while (inParcel.dataPosition() < z15) {
                    int readInt4 = inParcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            o8.y(inParcel, readInt4);
                        } else {
                            strArr = o8.i(inParcel, readInt4);
                        }
                    } else {
                        i11 = o8.u(inParcel, readInt4);
                    }
                }
                o8.m(inParcel, z15);
                ?? obj3 = new Object();
                obj3.f1595a = i11;
                obj3.f1596b = strArr;
                return obj3;
            case 18:
                int z16 = o8.z(inParcel);
                int i12 = 0;
                String str = null;
                String str2 = null;
                Point[] pointArr = null;
                b8.f fVar = null;
                b8.i iVar = null;
                j jVar = null;
                l lVar = null;
                k kVar = null;
                b8.g gVar = null;
                byte[] bArr = null;
                b8.d dVar = null;
                b8.c cVar = null;
                b8.e eVar = null;
                int i13 = 0;
                boolean z17 = false;
                while (inParcel.dataPosition() < z16) {
                    int readInt5 = inParcel.readInt();
                    b8.g gVar2 = gVar;
                    switch ((char) readInt5) {
                        case 2:
                            i12 = o8.u(inParcel, readInt5);
                            break;
                        case 3:
                            str = o8.h(inParcel, readInt5);
                            break;
                        case 4:
                            str2 = o8.h(inParcel, readInt5);
                            break;
                        case 5:
                            i13 = o8.u(inParcel, readInt5);
                            break;
                        case 6:
                            pointArr = (Point[]) o8.k(inParcel, readInt5, Point.CREATOR);
                            break;
                        case 7:
                            fVar = (b8.f) o8.g(inParcel, readInt5, b8.f.CREATOR);
                            break;
                        case '\b':
                            iVar = (b8.i) o8.g(inParcel, readInt5, b8.i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) o8.g(inParcel, readInt5, j.CREATOR);
                            break;
                        case '\n':
                            lVar = (l) o8.g(inParcel, readInt5, l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) o8.g(inParcel, readInt5, k.CREATOR);
                            break;
                        case '\f':
                            gVar = (b8.g) o8.g(inParcel, readInt5, b8.g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (b8.c) o8.g(inParcel, readInt5, b8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (b8.d) o8.g(inParcel, readInt5, b8.d.CREATOR);
                            break;
                        case 15:
                            eVar = (b8.e) o8.g(inParcel, readInt5, b8.e.CREATOR);
                            break;
                        case 16:
                            bArr = o8.b(inParcel, readInt5);
                            break;
                        case 17:
                            z17 = o8.n(inParcel, readInt5);
                            break;
                        default:
                            o8.y(inParcel, readInt5);
                            break;
                    }
                    gVar = gVar2;
                }
                o8.m(inParcel, z16);
                ?? obj4 = new Object();
                obj4.f1643a = i12;
                obj4.f1644b = str;
                obj4.A = bArr;
                obj4.f1645c = str2;
                obj4.d = i13;
                obj4.f1646e = pointArr;
                obj4.B = z17;
                obj4.f1647f = fVar;
                obj4.h = iVar;
                obj4.f1648n = jVar;
                obj4.f1649r = lVar;
                obj4.f1650s = kVar;
                obj4.v = gVar;
                obj4.f1651w = cVar;
                obj4.f1652x = dVar;
                obj4.f1653y = eVar;
                return obj4;
            case 19:
                int z18 = o8.z(inParcel);
                int i14 = 0;
                String str3 = null;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z19 = false;
                while (inParcel.dataPosition() < z18) {
                    int readInt6 = inParcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            i14 = o8.u(inParcel, readInt6);
                            break;
                        case 3:
                            i15 = o8.u(inParcel, readInt6);
                            break;
                        case 4:
                            i16 = o8.u(inParcel, readInt6);
                            break;
                        case 5:
                            i17 = o8.u(inParcel, readInt6);
                            break;
                        case 6:
                            i18 = o8.u(inParcel, readInt6);
                            break;
                        case 7:
                            i19 = o8.u(inParcel, readInt6);
                            break;
                        case '\b':
                            z19 = o8.n(inParcel, readInt6);
                            break;
                        case '\t':
                            str3 = o8.h(inParcel, readInt6);
                            break;
                        default:
                            o8.y(inParcel, readInt6);
                            break;
                    }
                }
                o8.m(inParcel, z18);
                ?? obj5 = new Object();
                obj5.f1597a = i14;
                obj5.f1598b = i15;
                obj5.f1599c = i16;
                obj5.d = i17;
                obj5.f1600e = i18;
                obj5.f1601f = i19;
                obj5.h = z19;
                obj5.f1602n = str3;
                return obj5;
            case 20:
                int z20 = o8.z(inParcel);
                h hVar = null;
                String str4 = null;
                String str5 = null;
                b8.i[] iVarArr = null;
                b8.f[] fVarArr = null;
                String[] strArr2 = null;
                b8.a[] aVarArr = null;
                while (inParcel.dataPosition() < z20) {
                    int readInt7 = inParcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            hVar = (h) o8.g(inParcel, readInt7, h.CREATOR);
                            break;
                        case 3:
                            str4 = o8.h(inParcel, readInt7);
                            break;
                        case 4:
                            str5 = o8.h(inParcel, readInt7);
                            break;
                        case 5:
                            iVarArr = (b8.i[]) o8.k(inParcel, readInt7, b8.i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (b8.f[]) o8.k(inParcel, readInt7, b8.f.CREATOR);
                            break;
                        case 7:
                            strArr2 = o8.i(inParcel, readInt7);
                            break;
                        case '\b':
                            aVarArr = (b8.a[]) o8.k(inParcel, readInt7, b8.a.CREATOR);
                            break;
                        default:
                            o8.y(inParcel, readInt7);
                            break;
                    }
                }
                o8.m(inParcel, z20);
                ?? obj6 = new Object();
                obj6.f1608a = hVar;
                obj6.f1609b = str4;
                obj6.f1610c = str5;
                obj6.d = iVarArr;
                obj6.f1611e = fVarArr;
                obj6.f1612f = strArr2;
                obj6.h = aVarArr;
                return obj6;
            case 21:
                int z21 = o8.z(inParcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                b8.b bVar = null;
                b8.b bVar2 = null;
                while (inParcel.dataPosition() < z21) {
                    int readInt8 = inParcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str6 = o8.h(inParcel, readInt8);
                            break;
                        case 3:
                            str7 = o8.h(inParcel, readInt8);
                            break;
                        case 4:
                            str8 = o8.h(inParcel, readInt8);
                            break;
                        case 5:
                            str9 = o8.h(inParcel, readInt8);
                            break;
                        case 6:
                            str10 = o8.h(inParcel, readInt8);
                            break;
                        case 7:
                            bVar = (b8.b) o8.g(inParcel, readInt8, b8.b.CREATOR);
                            break;
                        case '\b':
                            bVar2 = (b8.b) o8.g(inParcel, readInt8, b8.b.CREATOR);
                            break;
                        default:
                            o8.y(inParcel, readInt8);
                            break;
                    }
                }
                o8.m(inParcel, z21);
                ?? obj7 = new Object();
                obj7.f1603a = str6;
                obj7.f1604b = str7;
                obj7.f1605c = str8;
                obj7.d = str9;
                obj7.f1606e = str10;
                obj7.f1607f = bVar;
                obj7.h = bVar2;
                return obj7;
            case 22:
                int z22 = o8.z(inParcel);
                int i20 = 0;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (inParcel.dataPosition() < z22) {
                    int readInt9 = inParcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            if (c13 != 4) {
                                if (c13 != 5) {
                                    o8.y(inParcel, readInt9);
                                } else {
                                    str13 = o8.h(inParcel, readInt9);
                                }
                            } else {
                                str12 = o8.h(inParcel, readInt9);
                            }
                        } else {
                            str11 = o8.h(inParcel, readInt9);
                        }
                    } else {
                        i20 = o8.u(inParcel, readInt9);
                    }
                }
                o8.m(inParcel, z22);
                ?? obj8 = new Object();
                obj8.f1624a = i20;
                obj8.f1625b = str11;
                obj8.f1626c = str12;
                obj8.d = str13;
                return obj8;
            case 23:
                int z23 = o8.z(inParcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (inParcel.dataPosition() < z23) {
                    int readInt10 = inParcel.readInt();
                    String str28 = str26;
                    switch ((char) readInt10) {
                        case 2:
                            str14 = o8.h(inParcel, readInt10);
                            break;
                        case 3:
                            str15 = o8.h(inParcel, readInt10);
                            break;
                        case 4:
                            str16 = o8.h(inParcel, readInt10);
                            break;
                        case 5:
                            str17 = o8.h(inParcel, readInt10);
                            break;
                        case 6:
                            str18 = o8.h(inParcel, readInt10);
                            break;
                        case 7:
                            str19 = o8.h(inParcel, readInt10);
                            break;
                        case '\b':
                            str20 = o8.h(inParcel, readInt10);
                            break;
                        case '\t':
                            str21 = o8.h(inParcel, readInt10);
                            break;
                        case '\n':
                            str22 = o8.h(inParcel, readInt10);
                            break;
                        case 11:
                            str23 = o8.h(inParcel, readInt10);
                            break;
                        case '\f':
                            str24 = o8.h(inParcel, readInt10);
                            break;
                        case '\r':
                            str25 = o8.h(inParcel, readInt10);
                            break;
                        case 14:
                            str26 = o8.h(inParcel, readInt10);
                            continue;
                        case 15:
                            str27 = o8.h(inParcel, readInt10);
                            break;
                        default:
                            o8.y(inParcel, readInt10);
                            break;
                    }
                    str26 = str28;
                }
                o8.m(inParcel, z23);
                ?? obj9 = new Object();
                obj9.f1613a = str14;
                obj9.f1614b = str15;
                obj9.f1615c = str16;
                obj9.d = str17;
                obj9.f1616e = str18;
                obj9.f1617f = str19;
                obj9.h = str20;
                obj9.f1618n = str21;
                obj9.f1619r = str22;
                obj9.f1620s = str23;
                obj9.v = str24;
                obj9.f1621w = str25;
                obj9.f1622x = str26;
                obj9.f1623y = str27;
                return obj9;
            case 24:
                int z24 = o8.z(inParcel);
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                while (inParcel.dataPosition() < z24) {
                    int readInt11 = inParcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            str29 = o8.h(inParcel, readInt11);
                            break;
                        case 3:
                            str30 = o8.h(inParcel, readInt11);
                            break;
                        case 4:
                            str31 = o8.h(inParcel, readInt11);
                            break;
                        case 5:
                            str32 = o8.h(inParcel, readInt11);
                            break;
                        case 6:
                            str33 = o8.h(inParcel, readInt11);
                            break;
                        case 7:
                            str34 = o8.h(inParcel, readInt11);
                            break;
                        case '\b':
                            str35 = o8.h(inParcel, readInt11);
                            break;
                        default:
                            o8.y(inParcel, readInt11);
                            break;
                    }
                }
                o8.m(inParcel, z24);
                ?? obj10 = new Object();
                obj10.f1629a = str29;
                obj10.f1630b = str30;
                obj10.f1631c = str31;
                obj10.d = str32;
                obj10.f1632e = str33;
                obj10.f1633f = str34;
                obj10.h = str35;
                return obj10;
            case 25:
                int z25 = o8.z(inParcel);
                double d = 0.0d;
                double d9 = 0.0d;
                while (inParcel.dataPosition() < z25) {
                    int readInt12 = inParcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            o8.y(inParcel, readInt12);
                        } else {
                            d9 = o8.q(inParcel, readInt12);
                        }
                    } else {
                        d = o8.q(inParcel, readInt12);
                    }
                }
                o8.m(inParcel, z25);
                ?? obj11 = new Object();
                obj11.f1627a = d;
                obj11.f1628b = d9;
                return obj11;
            case 26:
                int z26 = o8.z(inParcel);
                String str36 = null;
                String str37 = null;
                while (inParcel.dataPosition() < z26) {
                    int readInt13 = inParcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            o8.y(inParcel, readInt13);
                        } else {
                            str37 = o8.h(inParcel, readInt13);
                        }
                    } else {
                        str36 = o8.h(inParcel, readInt13);
                    }
                }
                o8.m(inParcel, z26);
                ?? obj12 = new Object();
                obj12.f1636a = str36;
                obj12.f1637b = str37;
                return obj12;
            case 27:
                int z27 = o8.z(inParcel);
                int i21 = 0;
                String str38 = null;
                while (inParcel.dataPosition() < z27) {
                    int readInt14 = inParcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            o8.y(inParcel, readInt14);
                        } else {
                            str38 = o8.h(inParcel, readInt14);
                        }
                    } else {
                        i21 = o8.u(inParcel, readInt14);
                    }
                }
                o8.m(inParcel, z27);
                ?? obj13 = new Object();
                obj13.f1634a = i21;
                obj13.f1635b = str38;
                return obj13;
            case 28:
                int z28 = o8.z(inParcel);
                String str39 = null;
                String str40 = null;
                int i22 = 0;
                while (inParcel.dataPosition() < z28) {
                    int readInt15 = inParcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                o8.y(inParcel, readInt15);
                            } else {
                                i22 = o8.u(inParcel, readInt15);
                            }
                        } else {
                            str40 = o8.h(inParcel, readInt15);
                        }
                    } else {
                        str39 = o8.h(inParcel, readInt15);
                    }
                }
                o8.m(inParcel, z28);
                ?? obj14 = new Object();
                obj14.f1640a = str39;
                obj14.f1641b = str40;
                obj14.f1642c = i22;
                return obj14;
            default:
                int z29 = o8.z(inParcel);
                String str41 = null;
                String str42 = null;
                while (inParcel.dataPosition() < z29) {
                    int readInt16 = inParcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 != 2) {
                        if (c18 != 3) {
                            o8.y(inParcel, readInt16);
                        } else {
                            str42 = o8.h(inParcel, readInt16);
                        }
                    } else {
                        str41 = o8.h(inParcel, readInt16);
                    }
                }
                o8.m(inParcel, z29);
                ?? obj15 = new Object();
                obj15.f1638a = str41;
                obj15.f1639b = str42;
                return obj15;
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f48415a) {
            case 0:
                return new b[i9];
            case 1:
                return new a4.a[i9];
            case 2:
                return new MediaBrowserCompat$MediaItem[i9];
            case 3:
                return new MediaDescriptionCompat[i9];
            case 4:
                return new MediaMetadataCompat[i9];
            case 5:
                return new RatingCompat[i9];
            case 6:
                return new androidx.activity.result.a[i9];
            case 7:
                return new androidx.activity.result.g[i9];
            case 8:
                return new androidx.fragment.app.b[i9];
            case 9:
                return new androidx.fragment.app.c[i9];
            case 10:
                return new f0[i9];
            case 11:
                return new l0[i9];
            case 12:
                return new o0[i9];
            case 13:
                return new b4.a[i9];
            case 14:
                return new b6.a[i9];
            case 15:
                return new b6.b[i9];
            case 16:
                return new b6.c[i9];
            case 17:
                return new b8.a[i9];
            case 18:
                return new m[i9];
            case 19:
                return new b8.b[i9];
            case 20:
                return new b8.d[i9];
            case 21:
                return new b8.c[i9];
            case 22:
                return new b8.f[i9];
            case 23:
                return new b8.e[i9];
            case 24:
                return new h[i9];
            case 25:
                return new b8.g[i9];
            case 26:
                return new j[i9];
            case 27:
                return new b8.i[i9];
            case 28:
                return new l[i9];
            default:
                return new k[i9];
        }
    }
}
