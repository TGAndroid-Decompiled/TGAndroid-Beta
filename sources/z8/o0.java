package z8;

import a8.bf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class o0 implements Parcelable.Creator {
    public final int f52756a;

    public o0(int i10) {
        this.f52756a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f52756a) {
            case 0:
                int z10 = bf.z(parcel);
                int i10 = 0;
                g gVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            bf.y(parcel, readInt);
                        } else {
                            gVar = (g) bf.g(parcel, readInt, g.CREATOR);
                        }
                    } else {
                        i10 = bf.u(parcel, readInt);
                    }
                }
                bf.m(parcel, z10);
                return new n0(i10, gVar);
            case 1:
                int z11 = bf.z(parcel);
                String str = null;
                long j10 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                bf.y(parcel, readInt2);
                            } else {
                                j10 = bf.w(parcel, readInt2);
                            }
                        } else {
                            str2 = bf.h(parcel, readInt2);
                        }
                    } else {
                        str = bf.h(parcel, readInt2);
                    }
                }
                bf.m(parcel, z11);
                return new p0(j10, str, str2);
            case 2:
                int z12 = bf.z(parcel);
                int i11 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            bf.y(parcel, readInt3);
                        } else {
                            str3 = bf.h(parcel, readInt3);
                        }
                    } else {
                        i11 = bf.u(parcel, readInt3);
                    }
                }
                bf.m(parcel, z12);
                return new q0(i11, str3);
            case 3:
                int z13 = bf.z(parcel);
                int i12 = 0;
                n nVar = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            bf.y(parcel, readInt4);
                        } else {
                            nVar = (n) bf.g(parcel, readInt4, n.CREATOR);
                        }
                    } else {
                        i12 = bf.u(parcel, readInt4);
                    }
                }
                bf.m(parcel, z13);
                return new r0(i12, nVar);
            case 4:
                int z14 = bf.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        bf.y(parcel, readInt5);
                    } else {
                        i13 = bf.u(parcel, readInt5);
                    }
                }
                bf.m(parcel, z14);
                return new s0(i13);
            case 5:
                int z15 = bf.z(parcel);
                int i14 = 0;
                byte[] bArr = null;
                int i15 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                bf.y(parcel, readInt6);
                            } else {
                                bArr = bf.b(parcel, readInt6);
                            }
                        } else {
                            i15 = bf.u(parcel, readInt6);
                        }
                    } else {
                        i14 = bf.u(parcel, readInt6);
                    }
                }
                bf.m(parcel, z15);
                return new t0(i14, i15, bArr);
            case 6:
                int z16 = bf.z(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            bf.y(parcel, readInt7);
                        } else {
                            i17 = bf.u(parcel, readInt7);
                        }
                    } else {
                        i16 = bf.u(parcel, readInt7);
                    }
                }
                bf.m(parcel, z16);
                return new u0(i16, i17);
            case 7:
                int z17 = bf.z(parcel);
                int i18 = 0;
                long j11 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                bf.y(parcel, readInt8);
                            } else {
                                arrayList = bf.l(parcel, readInt8, p0.CREATOR);
                            }
                        } else {
                            j11 = bf.w(parcel, readInt8);
                        }
                    } else {
                        i18 = bf.u(parcel, readInt8);
                    }
                }
                bf.m(parcel, z17);
                return new v0(i18, j11, arrayList);
            case 8:
                int z18 = bf.z(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                bf.y(parcel, readInt9);
                            } else {
                                str4 = bf.h(parcel, readInt9);
                            }
                        } else {
                            b11 = bf.p(parcel, readInt9);
                        }
                    } else {
                        b10 = bf.p(parcel, readInt9);
                    }
                }
                bf.m(parcel, z18);
                return new w0(b10, b11, str4);
            case 9:
                int z19 = bf.z(parcel);
                int i19 = 0;
                byte b12 = 0;
                byte b13 = 0;
                byte b14 = 0;
                byte b15 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i19 = bf.u(parcel, readInt10);
                            break;
                        case 3:
                            str5 = bf.h(parcel, readInt10);
                            break;
                        case 4:
                            str6 = bf.h(parcel, readInt10);
                            break;
                        case 5:
                            str7 = bf.h(parcel, readInt10);
                            break;
                        case 6:
                            str8 = bf.h(parcel, readInt10);
                            break;
                        case 7:
                            str9 = bf.h(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = bf.h(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = bf.p(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = bf.p(parcel, readInt10);
                            break;
                        case 11:
                            b14 = bf.p(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = bf.p(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = bf.h(parcel, readInt10);
                            break;
                        default:
                            bf.y(parcel, readInt10);
                            break;
                    }
                }
                bf.m(parcel, z19);
                return new c1(i19, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int z20 = bf.z(parcel);
                String str12 = null;
                String str13 = null;
                b1 b1Var = null;
                String str14 = null;
                String str15 = null;
                Float f7 = null;
                f1 f1Var = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = bf.h(parcel, readInt11);
                            break;
                        case 2:
                            str13 = bf.h(parcel, readInt11);
                            break;
                        case 3:
                            b1Var = (b1) bf.g(parcel, readInt11, b1.CREATOR);
                            break;
                        case 4:
                            str14 = bf.h(parcel, readInt11);
                            break;
                        case 5:
                            str15 = bf.h(parcel, readInt11);
                            break;
                        case 6:
                            f7 = bf.s(parcel, readInt11);
                            break;
                        case 7:
                            f1Var = (f1) bf.g(parcel, readInt11, f1.CREATOR);
                            break;
                        default:
                            bf.y(parcel, readInt11);
                            break;
                    }
                }
                bf.m(parcel, z20);
                return new d1(str12, str13, b1Var, str14, str15, f7, f1Var);
            case 11:
                int z21 = bf.z(parcel);
                int i20 = 0;
                ArrayList arrayList2 = null;
                b1 b1Var2 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                bf.y(parcel, readInt12);
                            } else {
                                b1Var2 = (b1) bf.g(parcel, readInt12, b1.CREATOR);
                            }
                        } else {
                            arrayList2 = bf.l(parcel, readInt12, d1.CREATOR);
                        }
                    } else {
                        i20 = bf.u(parcel, readInt12);
                    }
                }
                bf.m(parcel, z21);
                return new e1(i20, arrayList2, b1Var2);
            default:
                int z22 = bf.z(parcel);
                boolean z23 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            bf.y(parcel, readInt13);
                        } else {
                            arrayList3 = bf.j(parcel, readInt13);
                        }
                    } else {
                        z23 = bf.n(parcel, readInt13);
                    }
                }
                bf.m(parcel, z22);
                return new f1(arrayList3, z23);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f52756a) {
            case 0:
                return new n0[i10];
            case 1:
                return new p0[i10];
            case 2:
                return new q0[i10];
            case 3:
                return new r0[i10];
            case 4:
                return new s0[i10];
            case 5:
                return new t0[i10];
            case 6:
                return new u0[i10];
            case 7:
                return new v0[i10];
            case 8:
                return new w0[i10];
            case 9:
                return new c1[i10];
            case 10:
                return new d1[i10];
            case 11:
                return new e1[i10];
            default:
                return new f1[i10];
        }
    }
}
