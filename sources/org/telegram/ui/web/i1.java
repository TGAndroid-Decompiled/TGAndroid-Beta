package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
public final class i1 extends FilterInputStream {
    public i1(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    public static int a(int i9) {
        if (i9 >= 48 && i9 <= 57) {
            return i9 - 48;
        }
        if (i9 >= 65 && i9 <= 70) {
            return i9 - 55;
        }
        if (i9 >= 97 && i9 <= 102) {
            return i9 - 87;
        }
        return 0;
    }

    @Override
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read == 61) {
            int read2 = ((FilterInputStream) this).in.read();
            int read3 = ((FilterInputStream) this).in.read();
            if (read2 == -1 || read3 == -1) {
                return -1;
            }
            if (read2 == 13 && read3 == 10) {
                return read();
            }
            return (read2 == 10 || read3 == 10) ? read3 : (a(read2) << 4) | a(read3);
        }
        return read;
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int read = read();
            if (read != -1) {
                bArr[i9 + i11] = (byte) read;
                i12++;
                i11++;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }
}
