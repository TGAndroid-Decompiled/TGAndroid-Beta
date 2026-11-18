package y8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.ac;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;
public final class v implements Parcelable.Creator {
    public final int f61120a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f61120a) {
            case 0:
                int z10 = ac.z(parcel);
                String str = null;
                String str2 = null;
                r rVar = null;
                String str3 = null;
                q qVar = null;
                q qVar2 = null;
                String[] strArr = null;
                UserAddress userAddress = null;
                UserAddress userAddress2 = null;
                d[] dVarArr = null;
                k kVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str = ac.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = ac.h(parcel, readInt);
                            break;
                        case 4:
                            rVar = (r) ac.g(parcel, readInt, r.CREATOR);
                            break;
                        case 5:
                            str3 = ac.h(parcel, readInt);
                            break;
                        case 6:
                            qVar = (q) ac.g(parcel, readInt, q.CREATOR);
                            break;
                        case 7:
                            qVar2 = (q) ac.g(parcel, readInt, q.CREATOR);
                            break;
                        case '\b':
                            strArr = ac.i(parcel, readInt);
                            break;
                        case '\t':
                            userAddress = (UserAddress) ac.g(parcel, readInt, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress2 = (UserAddress) ac.g(parcel, readInt, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (d[]) ac.k(parcel, readInt, d.CREATOR);
                            break;
                        case '\f':
                            kVar = (k) ac.g(parcel, readInt, k.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt);
                            break;
                    }
                }
                ac.m(parcel, z10);
                ?? obj = new Object();
                obj.f7387a = str;
                obj.f7388b = str2;
                obj.f7389c = rVar;
                obj.d = str3;
                obj.f7390e = qVar;
                obj.f7391f = qVar2;
                obj.h = strArr;
                obj.f7392n = userAddress;
                obj.f7393r = userAddress2;
                obj.f7394s = dVarArr;
                obj.f7395w = kVar;
                return obj;
            case 1:
                int z11 = ac.z(parcel);
                String str4 = null;
                int i7 = 0;
                String str5 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                ac.y(parcel, readInt2);
                            } else {
                                i7 = ac.u(parcel, readInt2);
                            }
                        } else {
                            str5 = ac.h(parcel, readInt2);
                        }
                    } else {
                        str4 = ac.h(parcel, readInt2);
                    }
                }
                ac.m(parcel, z11);
                ?? obj2 = new Object();
                obj2.f61048a = str4;
                obj2.f61049b = str5;
                obj2.f61050c = i7;
                return obj2;
            case 2:
                int z12 = ac.z(parcel);
                ArrayList arrayList = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                boolean z13 = false;
                String str8 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            arrayList = ac.e(parcel, readInt3);
                            break;
                        case 3:
                        default:
                            ac.y(parcel, readInt3);
                            break;
                        case 4:
                            str8 = ac.h(parcel, readInt3);
                            break;
                        case 5:
                            str6 = ac.h(parcel, readInt3);
                            break;
                        case 6:
                            arrayList2 = ac.e(parcel, readInt3);
                            break;
                        case 7:
                            z13 = ac.n(parcel, readInt3);
                            break;
                        case '\b':
                            str7 = ac.h(parcel, readInt3);
                            break;
                    }
                }
                ac.m(parcel, z12);
                ?? obj3 = new Object();
                obj3.f61051a = arrayList;
                obj3.f61052b = str8;
                obj3.f61053c = str6;
                obj3.d = arrayList2;
                obj3.f61054e = z13;
                obj3.f61055f = str7;
                return obj3;
            case 3:
                int z14 = ac.z(parcel);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String str9 = null;
                ArrayList arrayList6 = arrayList4;
                ArrayList arrayList7 = arrayList5;
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                z8.f fVar = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                z8.c cVar = null;
                int i10 = 0;
                boolean z15 = false;
                String str20 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    z8.f fVar2 = fVar;
                    switch ((char) readInt4) {
                        case 2:
                            str9 = ac.h(parcel, readInt4);
                            break;
                        case 3:
                            str20 = ac.h(parcel, readInt4);
                            break;
                        case 4:
                            str12 = ac.h(parcel, readInt4);
                            break;
                        case 5:
                            str13 = ac.h(parcel, readInt4);
                            break;
                        case 6:
                            str14 = ac.h(parcel, readInt4);
                            break;
                        case 7:
                            str15 = ac.h(parcel, readInt4);
                            break;
                        case '\b':
                            str16 = ac.h(parcel, readInt4);
                            break;
                        case '\t':
                            str17 = ac.h(parcel, readInt4);
                            break;
                        case '\n':
                            str11 = ac.h(parcel, readInt4);
                            break;
                        case 11:
                            str10 = ac.h(parcel, readInt4);
                            break;
                        case '\f':
                            i10 = ac.u(parcel, readInt4);
                            break;
                        case '\r':
                            arrayList3 = ac.l(parcel, readInt4, z8.h.CREATOR);
                            break;
                        case 14:
                            fVar = (z8.f) ac.g(parcel, readInt4, z8.f.CREATOR);
                            continue;
                        case 15:
                            arrayList6 = ac.l(parcel, readInt4, LatLng.CREATOR);
                            break;
                        case 16:
                            str18 = ac.h(parcel, readInt4);
                            break;
                        case 17:
                            str19 = ac.h(parcel, readInt4);
                            break;
                        case 18:
                            arrayList7 = ac.l(parcel, readInt4, z8.b.CREATOR);
                            break;
                        case 19:
                            z15 = ac.n(parcel, readInt4);
                            break;
                        case 20:
                            arrayList8 = ac.l(parcel, readInt4, z8.g.CREATOR);
                            break;
                        case 21:
                            arrayList9 = ac.l(parcel, readInt4, z8.e.CREATOR);
                            break;
                        case 22:
                            arrayList10 = ac.l(parcel, readInt4, z8.g.CREATOR);
                            break;
                        case 23:
                            cVar = (z8.c) ac.g(parcel, readInt4, z8.c.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt4);
                            break;
                    }
                    fVar = fVar2;
                }
                ac.m(parcel, z14);
                ?? obj4 = new Object();
                obj4.f61056a = str9;
                obj4.f61057b = str20;
                obj4.f61058c = str12;
                obj4.d = str13;
                obj4.f61059e = str14;
                obj4.f61060f = str15;
                obj4.h = str16;
                obj4.f61061n = str17;
                obj4.f61062r = str11;
                obj4.f61063s = str10;
                obj4.f61064w = i10;
                obj4.f61065x = arrayList3;
                obj4.f61066y = fVar;
                obj4.E = arrayList6;
                obj4.F = str18;
                obj4.G = str19;
                obj4.H = arrayList7;
                obj4.I = z15;
                obj4.J = arrayList8;
                obj4.K = arrayList9;
                obj4.L = arrayList10;
                obj4.M = cVar;
                return obj4;
            case 4:
                int z16 = ac.z(parcel);
                String str21 = null;
                String str22 = null;
                String[] strArr2 = null;
                String str23 = null;
                q qVar3 = null;
                q qVar4 = null;
                f[] fVarArr = null;
                g[] gVarArr = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                d[] dVarArr2 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            str21 = ac.h(parcel, readInt5);
                            break;
                        case 3:
                            str22 = ac.h(parcel, readInt5);
                            break;
                        case 4:
                            strArr2 = ac.i(parcel, readInt5);
                            break;
                        case 5:
                            str23 = ac.h(parcel, readInt5);
                            break;
                        case 6:
                            qVar3 = (q) ac.g(parcel, readInt5, q.CREATOR);
                            break;
                        case 7:
                            qVar4 = (q) ac.g(parcel, readInt5, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (f[]) ac.k(parcel, readInt5, f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g[]) ac.k(parcel, readInt5, g.CREATOR);
                            break;
                        case '\n':
                            userAddress3 = (UserAddress) ac.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress4 = (UserAddress) ac.g(parcel, readInt5, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (d[]) ac.k(parcel, readInt5, d.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt5);
                            break;
                    }
                }
                ac.m(parcel, z16);
                ?? obj5 = new Object();
                obj5.f7396a = str21;
                obj5.f7397b = str22;
                obj5.f7398c = strArr2;
                obj5.d = str23;
                obj5.f7399e = qVar3;
                obj5.f7400f = qVar4;
                obj5.h = fVarArr;
                obj5.f7401n = gVarArr;
                obj5.f7402r = userAddress3;
                obj5.f7403s = userAddress4;
                obj5.f7404w = dVarArr2;
                return obj5;
            case 5:
                int z17 = ac.z(parcel);
                int i11 = 0;
                String str24 = null;
                String str25 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    ac.y(parcel, readInt6);
                                } else {
                                    commonWalletObject = (CommonWalletObject) ac.g(parcel, readInt6, CommonWalletObject.CREATOR);
                                }
                            } else {
                                str25 = ac.h(parcel, readInt6);
                            }
                        } else {
                            str24 = ac.h(parcel, readInt6);
                        }
                    } else {
                        i11 = ac.u(parcel, readInt6);
                    }
                }
                ac.m(parcel, z17);
                return new g(i11, str24, str25, commonWalletObject);
            case 6:
                int z18 = ac.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        ac.y(parcel, readInt7);
                    } else {
                        pendingIntent = (PendingIntent) ac.g(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                ac.m(parcel, z18);
                ?? obj6 = new Object();
                obj6.f61070a = pendingIntent;
                return obj6;
            case 7:
                int z19 = ac.z(parcel);
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                String str26 = null;
                ArrayList arrayList14 = arrayList13;
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                String str27 = null;
                String str28 = null;
                z8.f fVar3 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                int i12 = 0;
                boolean z20 = false;
                String str35 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt8 = parcel.readInt();
                    String str36 = str28;
                    switch ((char) readInt8) {
                        case 2:
                            str26 = ac.h(parcel, readInt8);
                            break;
                        case 3:
                            str35 = ac.h(parcel, readInt8);
                            break;
                        case 4:
                            str29 = ac.h(parcel, readInt8);
                            break;
                        case 5:
                            str30 = ac.h(parcel, readInt8);
                            break;
                        case 6:
                            str31 = ac.h(parcel, readInt8);
                            break;
                        case 7:
                            str32 = ac.h(parcel, readInt8);
                            break;
                        case '\b':
                            str33 = ac.h(parcel, readInt8);
                            break;
                        case '\t':
                            str27 = ac.h(parcel, readInt8);
                            break;
                        case '\n':
                            i12 = ac.u(parcel, readInt8);
                            break;
                        case 11:
                            arrayList11 = ac.l(parcel, readInt8, z8.h.CREATOR);
                            break;
                        case '\f':
                            fVar3 = (z8.f) ac.g(parcel, readInt8, z8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList12 = ac.l(parcel, readInt8, LatLng.CREATOR);
                            break;
                        case 14:
                            str28 = ac.h(parcel, readInt8);
                            continue;
                        case 15:
                            str34 = ac.h(parcel, readInt8);
                            break;
                        case 16:
                            arrayList14 = ac.l(parcel, readInt8, z8.b.CREATOR);
                            break;
                        case 17:
                            z20 = ac.n(parcel, readInt8);
                            break;
                        case 18:
                            arrayList15 = ac.l(parcel, readInt8, z8.g.CREATOR);
                            break;
                        case 19:
                            arrayList16 = ac.l(parcel, readInt8, z8.e.CREATOR);
                            break;
                        case 20:
                            arrayList17 = ac.l(parcel, readInt8, z8.g.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt8);
                            break;
                    }
                    str28 = str36;
                }
                ac.m(parcel, z19);
                ?? obj7 = new Object();
                obj7.f7405a = str26;
                obj7.f7406b = str35;
                obj7.f7407c = str29;
                obj7.d = str30;
                obj7.f7408e = str31;
                obj7.f7409f = str32;
                obj7.h = str33;
                obj7.f7410n = str27;
                obj7.f7411r = i12;
                obj7.f7412s = arrayList11;
                obj7.f7413w = fVar3;
                obj7.f7414x = arrayList12;
                obj7.f7415y = str28;
                obj7.E = str34;
                obj7.F = arrayList14;
                obj7.G = z20;
                obj7.H = arrayList15;
                obj7.I = arrayList16;
                obj7.J = arrayList17;
                return obj7;
            case 8:
                int z21 = ac.z(parcel);
                String str37 = null;
                String str38 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            ac.y(parcel, readInt9);
                        } else {
                            str38 = ac.h(parcel, readInt9);
                        }
                    } else {
                        str37 = ac.h(parcel, readInt9);
                    }
                }
                ac.m(parcel, z21);
                ?? obj8 = new Object();
                obj8.f61771a = str37;
                obj8.f61772b = str38;
                return obj8;
            case 9:
                int z22 = ac.z(parcel);
                ArrayList arrayList18 = new ArrayList();
                String str39 = null;
                String str40 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            if (c13 != 4) {
                                ac.y(parcel, readInt10);
                            } else {
                                arrayList18 = ac.l(parcel, readInt10, z8.a.CREATOR);
                            }
                        } else {
                            str40 = ac.h(parcel, readInt10);
                        }
                    } else {
                        str39 = ac.h(parcel, readInt10);
                    }
                }
                ac.m(parcel, z22);
                ?? obj9 = new Object();
                obj9.f61773a = str39;
                obj9.f61774b = str40;
                obj9.f61775c = arrayList18;
                return obj9;
            case 10:
                int z23 = ac.z(parcel);
                int i13 = 0;
                String str41 = null;
                int i14 = -1;
                long j3 = 0;
                double d = 0.0d;
                String str42 = null;
                while (parcel.dataPosition() < z23) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 2:
                            i13 = ac.u(parcel, readInt11);
                            break;
                        case 3:
                            str41 = ac.h(parcel, readInt11);
                            break;
                        case 4:
                            d = ac.q(parcel, readInt11);
                            break;
                        case 5:
                            str42 = ac.h(parcel, readInt11);
                            break;
                        case 6:
                            j3 = ac.w(parcel, readInt11);
                            break;
                        case 7:
                            i14 = ac.u(parcel, readInt11);
                            break;
                        default:
                            ac.y(parcel, readInt11);
                            break;
                    }
                }
                ac.m(parcel, z23);
                ?? obj10 = new Object();
                obj10.f61779a = i13;
                obj10.f61780b = str41;
                obj10.f61781c = d;
                obj10.d = str42;
                obj10.f61782e = j3;
                obj10.f61783f = i14;
                return obj10;
            case 11:
                int z24 = ac.z(parcel);
                String str43 = null;
                z8.d dVar = null;
                z8.f fVar4 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 5) {
                                ac.y(parcel, readInt12);
                            } else {
                                fVar4 = (z8.f) ac.g(parcel, readInt12, z8.f.CREATOR);
                            }
                        } else {
                            dVar = (z8.d) ac.g(parcel, readInt12, z8.d.CREATOR);
                        }
                    } else {
                        str43 = ac.h(parcel, readInt12);
                    }
                }
                ac.m(parcel, z24);
                ?? obj11 = new Object();
                obj11.f61776a = str43;
                obj11.f61777b = dVar;
                obj11.f61778c = fVar4;
                return obj11;
            case 12:
                int z25 = ac.z(parcel);
                String str44 = null;
                String str45 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            ac.y(parcel, readInt13);
                        } else {
                            str45 = ac.h(parcel, readInt13);
                        }
                    } else {
                        str44 = ac.h(parcel, readInt13);
                    }
                }
                ac.m(parcel, z25);
                ?? obj12 = new Object();
                obj12.f61784a = str44;
                obj12.f61785b = str45;
                return obj12;
            case 13:
                int z26 = ac.z(parcel);
                long j10 = 0;
                long j11 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            ac.y(parcel, readInt14);
                        } else {
                            j11 = ac.w(parcel, readInt14);
                        }
                    } else {
                        j10 = ac.w(parcel, readInt14);
                    }
                }
                ac.m(parcel, z26);
                ?? obj13 = new Object();
                obj13.f61786a = j10;
                obj13.f61787b = j11;
                return obj13;
            case 14:
                int z27 = ac.z(parcel);
                String str46 = null;
                String str47 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            ac.y(parcel, readInt15);
                        } else {
                            str47 = ac.h(parcel, readInt15);
                        }
                    } else {
                        str46 = ac.h(parcel, readInt15);
                    }
                }
                ac.m(parcel, z27);
                ?? obj14 = new Object();
                obj14.f61788a = str46;
                obj14.f61789b = str47;
                return obj14;
            default:
                int z28 = ac.z(parcel);
                String str48 = null;
                String str49 = null;
                z8.f fVar5 = null;
                z8.g gVar = null;
                z8.g gVar2 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 != 2) {
                        if (c18 != 3) {
                            if (c18 != 4) {
                                if (c18 != 5) {
                                    if (c18 != 6) {
                                        ac.y(parcel, readInt16);
                                    } else {
                                        gVar2 = (z8.g) ac.g(parcel, readInt16, z8.g.CREATOR);
                                    }
                                } else {
                                    gVar = (z8.g) ac.g(parcel, readInt16, z8.g.CREATOR);
                                }
                            } else {
                                fVar5 = (z8.f) ac.g(parcel, readInt16, z8.f.CREATOR);
                            }
                        } else {
                            str49 = ac.h(parcel, readInt16);
                        }
                    } else {
                        str48 = ac.h(parcel, readInt16);
                    }
                }
                ac.m(parcel, z28);
                ?? obj15 = new Object();
                obj15.f61790a = str48;
                obj15.f61791b = str49;
                obj15.f61792c = fVar5;
                obj15.d = gVar;
                obj15.f61793e = gVar2;
                return obj15;
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f61120a) {
            case 0:
                return new FullWallet[i7];
            case 1:
                return new d[i7];
            case 2:
                return new e[i7];
            case 3:
                return new f[i7];
            case 4:
                return new MaskedWallet[i7];
            case 5:
                return new g[i7];
            case 6:
                return new h[i7];
            case 7:
                return new CommonWalletObject[i7];
            case 8:
                return new z8.a[i7];
            case 9:
                return new z8.b[i7];
            case 10:
                return new z8.d[i7];
            case 11:
                return new z8.c[i7];
            case 12:
                return new z8.e[i7];
            case 13:
                return new z8.f[i7];
            case 14:
                return new z8.g[i7];
            default:
                return new z8.h[i7];
        }
    }
}
