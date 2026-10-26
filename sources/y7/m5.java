package y7;

import a8.bf;
import android.os.Parcel;
import android.os.Parcelable;
public final class m5 implements Parcelable.Creator {
    public final int f52232a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f52232a) {
            case 0:
                int z10 = bf.z(parcel);
                String str = null;
                int i10 = 0;
                float f7 = 0.0f;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    bf.y(parcel, readInt);
                                } else {
                                    i10 = bf.u(parcel, readInt);
                                }
                            } else {
                                str = bf.h(parcel, readInt);
                            }
                        } else {
                            f7 = bf.r(parcel, readInt);
                        }
                    } else {
                        str2 = bf.h(parcel, readInt);
                    }
                }
                bf.m(parcel, z10);
                return new l4(f7, i10, str, str2);
            case 1:
                int z11 = bf.z(parcel);
                int i11 = 0;
                int i12 = 0;
                float f10 = 0.0f;
                int i13 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    bf.y(parcel, readInt2);
                                } else {
                                    i12 = bf.u(parcel, readInt2);
                                }
                            } else {
                                f10 = bf.r(parcel, readInt2);
                            }
                        } else {
                            i13 = bf.u(parcel, readInt2);
                        }
                    } else {
                        i11 = bf.u(parcel, readInt2);
                    }
                }
                bf.m(parcel, z11);
                return new m6(i11, i13, f10, i12);
            case 2:
                int z12 = bf.z(parcel);
                String str3 = null;
                int i14 = 0;
                float f11 = 0.0f;
                String str4 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    bf.y(parcel, readInt3);
                                } else {
                                    i14 = bf.u(parcel, readInt3);
                                }
                            } else {
                                str4 = bf.h(parcel, readInt3);
                            }
                        } else {
                            f11 = bf.r(parcel, readInt3);
                        }
                    } else {
                        str3 = bf.h(parcel, readInt3);
                    }
                }
                bf.m(parcel, z12);
                return new ka(f11, i14, str3, str4);
            default:
                int z13 = bf.z(parcel);
                float f12 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            bf.y(parcel, readInt4);
                        } else {
                            i15 = bf.u(parcel, readInt4);
                        }
                    } else {
                        f12 = bf.r(parcel, readInt4);
                    }
                }
                bf.m(parcel, z13);
                return new la(f12, i15);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f52232a) {
            case 0:
                return new l4[i10];
            case 1:
                return new m6[i10];
            case 2:
                return new ka[i10];
            default:
                return new la[i10];
        }
    }
}
