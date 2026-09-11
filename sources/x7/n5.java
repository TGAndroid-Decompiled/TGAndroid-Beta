package x7;

import android.os.Parcel;
import android.os.Parcelable;
public final class n5 implements Parcelable.Creator {
    public final int f49101a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f49101a) {
            case 0:
                int z10 = w7.d0.z(parcel);
                String str = null;
                String str2 = null;
                float f7 = 0.0f;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    w7.d0.y(parcel, readInt);
                                } else {
                                    i10 = w7.d0.u(parcel, readInt);
                                }
                            } else {
                                str = w7.d0.h(parcel, readInt);
                            }
                        } else {
                            f7 = w7.d0.r(parcel, readInt);
                        }
                    } else {
                        str2 = w7.d0.h(parcel, readInt);
                    }
                }
                w7.d0.m(parcel, z10);
                return new m4(f7, i10, str, str2);
            case 1:
                int z11 = w7.d0.z(parcel);
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                float f10 = 0.0f;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    w7.d0.y(parcel, readInt2);
                                } else {
                                    i13 = w7.d0.u(parcel, readInt2);
                                }
                            } else {
                                f10 = w7.d0.r(parcel, readInt2);
                            }
                        } else {
                            i12 = w7.d0.u(parcel, readInt2);
                        }
                    } else {
                        i11 = w7.d0.u(parcel, readInt2);
                    }
                }
                w7.d0.m(parcel, z11);
                return new n6(i11, i12, f10, i13);
            case 2:
                int z12 = w7.d0.z(parcel);
                String str3 = null;
                String str4 = null;
                float f11 = 0.0f;
                int i14 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    w7.d0.y(parcel, readInt3);
                                } else {
                                    i14 = w7.d0.u(parcel, readInt3);
                                }
                            } else {
                                str4 = w7.d0.h(parcel, readInt3);
                            }
                        } else {
                            f11 = w7.d0.r(parcel, readInt3);
                        }
                    } else {
                        str3 = w7.d0.h(parcel, readInt3);
                    }
                }
                w7.d0.m(parcel, z12);
                return new na(f11, i14, str3, str4);
            default:
                int z13 = w7.d0.z(parcel);
                float f12 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            w7.d0.y(parcel, readInt4);
                        } else {
                            i15 = w7.d0.u(parcel, readInt4);
                        }
                    } else {
                        f12 = w7.d0.r(parcel, readInt4);
                    }
                }
                w7.d0.m(parcel, z13);
                return new oa(f12, i15);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f49101a) {
            case 0:
                return new m4[i10];
            case 1:
                return new n6[i10];
            case 2:
                return new na[i10];
            default:
                return new oa[i10];
        }
    }
}
