package org.telegram.utils.twidget;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class i {
    public final ByteBuffer f52839a;
    public final int f52840b;
    public final boolean f52841c;
    public final int d;
    public final int[] f52842e;
    public final int[] f52843f;
    public final String[] f52844g;

    public i(ByteBuffer byteBuffer, int i7, boolean z9, int i10, int[] iArr, int[] iArr2) {
        this.f52839a = byteBuffer;
        this.f52840b = i7;
        this.f52841c = z9;
        this.d = i10;
        this.f52842e = iArr;
        this.f52843f = iArr2;
        this.f52844g = new String[iArr.length];
    }

    public static IllegalArgumentException a() {
        return new IllegalArgumentException("Display list");
    }

    public static i b(byte[] bArr) {
        boolean z9;
        if (bArr.length >= 24 && (bArr.length & 3) == 0) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            if (order.getInt(0) == 1279547220 && order.getInt(4) == 1) {
                int i7 = order.getInt(8);
                int i10 = order.getInt(12);
                long j3 = order.getInt(16) * 4;
                if (i7 >= 0 && i7 <= 200000 && j3 >= 20 && 4 + j3 <= bArr.length) {
                    int i11 = (int) j3;
                    int i12 = order.getInt(i11);
                    int i13 = i11 + 4;
                    if (i12 >= 0 && i12 <= i7 && i12 <= (bArr.length - i13) / 4) {
                        int[] iArr = new int[i12];
                        int i14 = i13;
                        int[] iArr2 = new int[i12];
                        for (int i15 = 0; i15 < i12; i15++) {
                            int i16 = i14 + 4;
                            if (i16 <= bArr.length) {
                                int i17 = order.getInt(i14);
                                if (i17 >= 0 && i17 <= (bArr.length - i14) - 4) {
                                    iArr[i15] = i16;
                                    iArr2[i15] = i17;
                                    i14 += ((i17 + 3) & (-4)) + 4;
                                } else {
                                    throw a();
                                }
                            } else {
                                throw a();
                            }
                        }
                        if (i14 <= bArr.length) {
                            if ((i10 & 1) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            return new i(order, i7, z9, i11, iArr, iArr2);
                        }
                        throw a();
                    }
                    throw a();
                }
                throw a();
            }
            throw a();
        }
        throw a();
    }
}
