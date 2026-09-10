package y8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class n0 implements Parcelable.Creator {
    public final int f46544a;

    public n0(int i10) {
        this.f46544a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f46544a) {
            case 0:
                int z10 = w7.d0.z(parcel);
                int i10 = 0;
                f fVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            w7.d0.y(parcel, readInt);
                        } else {
                            fVar = (f) w7.d0.g(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        i10 = w7.d0.u(parcel, readInt);
                    }
                }
                w7.d0.m(parcel, z10);
                return new m0(i10, fVar);
            case 1:
                int z11 = w7.d0.z(parcel);
                String str = null;
                long j3 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                w7.d0.y(parcel, readInt2);
                            } else {
                                j3 = w7.d0.w(parcel, readInt2);
                            }
                        } else {
                            str2 = w7.d0.h(parcel, readInt2);
                        }
                    } else {
                        str = w7.d0.h(parcel, readInt2);
                    }
                }
                w7.d0.m(parcel, z11);
                return new o0(j3, str, str2);
            case 2:
                int z12 = w7.d0.z(parcel);
                int i11 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            w7.d0.y(parcel, readInt3);
                        } else {
                            str3 = w7.d0.h(parcel, readInt3);
                        }
                    } else {
                        i11 = w7.d0.u(parcel, readInt3);
                    }
                }
                w7.d0.m(parcel, z12);
                return new p0(i11, str3);
            case 3:
                int z13 = w7.d0.z(parcel);
                int i12 = 0;
                m mVar = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            w7.d0.y(parcel, readInt4);
                        } else {
                            mVar = (m) w7.d0.g(parcel, readInt4, m.CREATOR);
                        }
                    } else {
                        i12 = w7.d0.u(parcel, readInt4);
                    }
                }
                w7.d0.m(parcel, z13);
                return new q0(i12, mVar);
            case 4:
                int z14 = w7.d0.z(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        w7.d0.y(parcel, readInt5);
                    } else {
                        i13 = w7.d0.u(parcel, readInt5);
                    }
                }
                w7.d0.m(parcel, z14);
                return new r0(i13);
            case 5:
                int z15 = w7.d0.z(parcel);
                int i14 = 0;
                byte[] bArr = null;
                int i15 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                w7.d0.y(parcel, readInt6);
                            } else {
                                bArr = w7.d0.b(parcel, readInt6);
                            }
                        } else {
                            i15 = w7.d0.u(parcel, readInt6);
                        }
                    } else {
                        i14 = w7.d0.u(parcel, readInt6);
                    }
                }
                w7.d0.m(parcel, z15);
                return new s0(i14, i15, bArr);
            case 6:
                int z16 = w7.d0.z(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            w7.d0.y(parcel, readInt7);
                        } else {
                            i17 = w7.d0.u(parcel, readInt7);
                        }
                    } else {
                        i16 = w7.d0.u(parcel, readInt7);
                    }
                }
                w7.d0.m(parcel, z16);
                return new t0(i16, i17);
            case 7:
                int z17 = w7.d0.z(parcel);
                int i18 = 0;
                long j10 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                w7.d0.y(parcel, readInt8);
                            } else {
                                arrayList = w7.d0.l(parcel, readInt8, o0.CREATOR);
                            }
                        } else {
                            j10 = w7.d0.w(parcel, readInt8);
                        }
                    } else {
                        i18 = w7.d0.u(parcel, readInt8);
                    }
                }
                w7.d0.m(parcel, z17);
                return new u0(i18, j10, arrayList);
            case 8:
                int z18 = w7.d0.z(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                w7.d0.y(parcel, readInt9);
                            } else {
                                str4 = w7.d0.h(parcel, readInt9);
                            }
                        } else {
                            b11 = w7.d0.p(parcel, readInt9);
                        }
                    } else {
                        b10 = w7.d0.p(parcel, readInt9);
                    }
                }
                w7.d0.m(parcel, z18);
                return new v0(b10, b11, str4);
            case 9:
                int z19 = w7.d0.z(parcel);
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i19 = 0;
                byte b12 = 0;
                byte b13 = 0;
                byte b14 = 0;
                byte b15 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i19 = w7.d0.u(parcel, readInt10);
                            break;
                        case 3:
                            str5 = w7.d0.h(parcel, readInt10);
                            break;
                        case 4:
                            str6 = w7.d0.h(parcel, readInt10);
                            break;
                        case 5:
                            str7 = w7.d0.h(parcel, readInt10);
                            break;
                        case 6:
                            str8 = w7.d0.h(parcel, readInt10);
                            break;
                        case 7:
                            str9 = w7.d0.h(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = w7.d0.h(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = w7.d0.p(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = w7.d0.p(parcel, readInt10);
                            break;
                        case 11:
                            b14 = w7.d0.p(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = w7.d0.p(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = w7.d0.h(parcel, readInt10);
                            break;
                        default:
                            w7.d0.y(parcel, readInt10);
                            break;
                    }
                }
                w7.d0.m(parcel, z19);
                return new b1(i19, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int z20 = w7.d0.z(parcel);
                String str12 = null;
                String str13 = null;
                a1 a1Var = null;
                String str14 = null;
                String str15 = null;
                Float f7 = null;
                e1 e1Var = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = w7.d0.h(parcel, readInt11);
                            break;
                        case 2:
                            str13 = w7.d0.h(parcel, readInt11);
                            break;
                        case 3:
                            a1Var = (a1) w7.d0.g(parcel, readInt11, a1.CREATOR);
                            break;
                        case 4:
                            str14 = w7.d0.h(parcel, readInt11);
                            break;
                        case 5:
                            str15 = w7.d0.h(parcel, readInt11);
                            break;
                        case 6:
                            f7 = w7.d0.s(parcel, readInt11);
                            break;
                        case 7:
                            e1Var = (e1) w7.d0.g(parcel, readInt11, e1.CREATOR);
                            break;
                        default:
                            w7.d0.y(parcel, readInt11);
                            break;
                    }
                }
                w7.d0.m(parcel, z20);
                return new c1(str12, str13, a1Var, str14, str15, f7, e1Var);
            case 11:
                int z21 = w7.d0.z(parcel);
                int i20 = 0;
                ArrayList arrayList2 = null;
                a1 a1Var2 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                w7.d0.y(parcel, readInt12);
                            } else {
                                a1Var2 = (a1) w7.d0.g(parcel, readInt12, a1.CREATOR);
                            }
                        } else {
                            arrayList2 = w7.d0.l(parcel, readInt12, c1.CREATOR);
                        }
                    } else {
                        i20 = w7.d0.u(parcel, readInt12);
                    }
                }
                w7.d0.m(parcel, z21);
                return new d1(i20, arrayList2, a1Var2);
            default:
                int z22 = w7.d0.z(parcel);
                boolean z23 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            w7.d0.y(parcel, readInt13);
                        } else {
                            arrayList3 = w7.d0.j(parcel, readInt13);
                        }
                    } else {
                        z23 = w7.d0.n(parcel, readInt13);
                    }
                }
                w7.d0.m(parcel, z22);
                return new e1(arrayList3, z23);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f46544a) {
            case 0:
                return new m0[i10];
            case 1:
                return new o0[i10];
            case 2:
                return new p0[i10];
            case 3:
                return new q0[i10];
            case 4:
                return new r0[i10];
            case 5:
                return new s0[i10];
            case 6:
                return new t0[i10];
            case 7:
                return new u0[i10];
            case 8:
                return new v0[i10];
            case 9:
                return new b1[i10];
            case 10:
                return new c1[i10];
            case 11:
                return new d1[i10];
            default:
                return new e1[i10];
        }
    }
}
