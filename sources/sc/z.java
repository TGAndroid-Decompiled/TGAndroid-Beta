package sc;

import java.io.BufferedOutputStream;
public final class z extends BufferedOutputStream {
    public final void a(y yVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int length;
        int i14;
        int length2;
        byte[] bArr;
        if (yVar.f47959a) {
            i10 = 128;
        } else {
            i10 = 0;
        }
        if (yVar.f47960b) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        int i15 = i10 | i11;
        if (yVar.f47961c) {
            i12 = 32;
        } else {
            i12 = 0;
        }
        int i16 = i15 | i12;
        if (yVar.d) {
            i13 = 16;
        } else {
            i13 = 0;
        }
        write(i16 | i13 | (yVar.f47962e & 15));
        byte[] bArr2 = yVar.f47964g;
        if (bArr2 == null) {
            length = 0;
        } else {
            length = bArr2.length;
        }
        if (length <= 125) {
            i14 = length | 128;
        } else if (length <= 65535) {
            i14 = 254;
        } else {
            i14 = 255;
        }
        write(i14);
        byte[] bArr3 = yVar.f47964g;
        if (bArr3 == null) {
            length2 = 0;
        } else {
            length2 = bArr3.length;
        }
        if (length2 > 125) {
            if (length2 <= 65535) {
                bArr = new byte[]{(byte) ((length2 >> 8) & 255), (byte) (length2 & 255)};
            } else {
                bArr = new byte[8];
                for (int i17 = 7; i17 >= 0; i17--) {
                    bArr[i17] = (byte) (length2 & 255);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        k.f47912a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = yVar.f47964g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i18 = 0; i18 < bArr5.length; i18++) {
            bArr6[i18] = (byte) ((bArr5[i18] ^ bArr4[i18 % 4]) & 255);
        }
        write(bArr6);
    }
}
