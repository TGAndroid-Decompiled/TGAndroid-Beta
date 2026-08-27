package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public final class j1 extends FilterInputStream {
    public j1(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    public static int a(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 < 97 || i10 > 102) {
            return 0;
        }
        return i10 - 87;
    }

    @Override
    public final int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != 61) {
            return i10;
        }
        int i11 = ((FilterInputStream) this).in.read();
        int i12 = ((FilterInputStream) this).in.read();
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        if (i11 == 13 && i12 == 10) {
            return read();
        }
        return (i11 == 10 || i12 == 10) ? i12 : (a(i11) << 4) | a(i12);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = read();
            if (i14 != -1) {
                bArr[i10 + i13] = (byte) i14;
                i12++;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }
}
