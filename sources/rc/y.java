package rc;

import java.io.BufferedOutputStream;
public final class y extends BufferedOutputStream {
    public final void a(x xVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        int length;
        int i13;
        int length2;
        byte[] bArr;
        if (xVar.f54414a) {
            i7 = 128;
        } else {
            i7 = 0;
        }
        if (xVar.f54415b) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        int i14 = i7 | i10;
        if (xVar.f54416c) {
            i11 = 32;
        } else {
            i11 = 0;
        }
        int i15 = i14 | i11;
        if (xVar.d) {
            i12 = 16;
        } else {
            i12 = 0;
        }
        write(i15 | i12 | (xVar.f54417e & 15));
        byte[] bArr2 = xVar.f54419g;
        if (bArr2 == null) {
            length = 0;
        } else {
            length = bArr2.length;
        }
        if (length <= 125) {
            i13 = length | 128;
        } else if (length <= 65535) {
            i13 = 254;
        } else {
            i13 = 255;
        }
        write(i13);
        byte[] bArr3 = xVar.f54419g;
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
                for (int i16 = 7; i16 >= 0; i16--) {
                    bArr[i16] = (byte) (length2 & 255);
                    length2 >>>= 8;
                }
            }
            write(bArr);
        }
        byte[] bArr4 = new byte[4];
        k.f54367a.nextBytes(bArr4);
        write(bArr4);
        byte[] bArr5 = xVar.f54419g;
        if (bArr5 == null) {
            return;
        }
        byte[] bArr6 = new byte[bArr5.length];
        for (int i17 = 0; i17 < bArr5.length; i17++) {
            bArr6[i17] = (byte) ((bArr5[i17] ^ bArr4[i17 % 4]) & 255);
        }
        write(bArr6);
    }
}
