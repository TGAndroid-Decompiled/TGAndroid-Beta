package z7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class cg implements Parcelable.Creator {
    public final int f50845a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f50845a) {
            case 0:
                int z10 = w7.d0.z(parcel);
                long j3 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 != 5) {
                                        w7.d0.y(parcel, readInt);
                                    } else {
                                        j3 = w7.d0.w(parcel, readInt);
                                    }
                                } else {
                                    i13 = w7.d0.u(parcel, readInt);
                                }
                            } else {
                                i12 = w7.d0.u(parcel, readInt);
                            }
                        } else {
                            i11 = w7.d0.u(parcel, readInt);
                        }
                    } else {
                        i10 = w7.d0.u(parcel, readInt);
                    }
                }
                w7.d0.m(parcel, z10);
                return new ag(i10, i11, i12, j3, i13);
            case 1:
                int z11 = w7.d0.z(parcel);
                float[] fArr = null;
                Bitmap bitmap = null;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            int x10 = w7.d0.x(parcel, readInt2);
                            int dataPosition = parcel.dataPosition();
                            if (x10 == 0) {
                                fArr = null;
                                break;
                            } else {
                                fArr = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition + x10);
                                break;
                            }
                        case 2:
                            bitmap = (Bitmap) w7.d0.g(parcel, readInt2, Bitmap.CREATOR);
                            break;
                        case 3:
                            i14 = w7.d0.u(parcel, readInt2);
                            break;
                        case 4:
                            i15 = w7.d0.u(parcel, readInt2);
                            break;
                        case 5:
                            i16 = w7.d0.u(parcel, readInt2);
                            break;
                        case 6:
                            i17 = w7.d0.u(parcel, readInt2);
                            break;
                        case 7:
                            i18 = w7.d0.u(parcel, readInt2);
                            break;
                        default:
                            w7.d0.y(parcel, readInt2);
                            break;
                    }
                }
                w7.d0.m(parcel, z11);
                return new hg(fArr, bitmap, i14, i15, i16, i17, i18);
            case 2:
                int z12 = w7.d0.z(parcel);
                ArrayList arrayList = null;
                float[] fArr2 = null;
                Bitmap bitmap2 = null;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    w7.d0.y(parcel, readInt3);
                                } else {
                                    int x11 = w7.d0.x(parcel, readInt3);
                                    int dataPosition2 = parcel.dataPosition();
                                    if (x11 == 0) {
                                        arrayList2 = null;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int readInt4 = parcel.readInt();
                                        for (int i19 = 0; i19 < readInt4; i19++) {
                                            arrayList3.add(Float.valueOf(parcel.readFloat()));
                                        }
                                        parcel.setDataPosition(dataPosition2 + x11);
                                        arrayList2 = arrayList3;
                                    }
                                }
                            } else {
                                bitmap2 = (Bitmap) w7.d0.g(parcel, readInt3, Bitmap.CREATOR);
                            }
                        } else {
                            int x12 = w7.d0.x(parcel, readInt3);
                            int dataPosition3 = parcel.dataPosition();
                            if (x12 == 0) {
                                fArr2 = null;
                            } else {
                                float[] createFloatArray = parcel.createFloatArray();
                                parcel.setDataPosition(dataPosition3 + x12);
                                fArr2 = createFloatArray;
                            }
                        }
                    } else {
                        arrayList = w7.d0.l(parcel, readInt3, hg.CREATOR);
                    }
                }
                w7.d0.m(parcel, z12);
                return new ig(arrayList, fArr2, bitmap2, arrayList2);
            default:
                int z13 = w7.d0.z(parcel);
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    if (c12 != 5) {
                                        w7.d0.y(parcel, readInt5);
                                    } else {
                                        z18 = w7.d0.n(parcel, readInt5);
                                    }
                                } else {
                                    z17 = w7.d0.n(parcel, readInt5);
                                }
                            } else {
                                z16 = w7.d0.n(parcel, readInt5);
                            }
                        } else {
                            z15 = w7.d0.n(parcel, readInt5);
                        }
                    } else {
                        z14 = w7.d0.n(parcel, readInt5);
                    }
                }
                w7.d0.m(parcel, z13);
                return new jg(z14, z15, z16, z17, z18);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f50845a) {
            case 0:
                return new ag[i10];
            case 1:
                return new hg[i10];
            case 2:
                return new ig[i10];
            default:
                return new jg[i10];
        }
    }
}
