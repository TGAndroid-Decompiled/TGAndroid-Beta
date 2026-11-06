package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
public final class e1 extends FilterInputStream {
    public final int f51117a;

    public e1(BufferedInputStream bufferedInputStream, int i7) {
        super(bufferedInputStream);
        this.f51117a = i7;
    }

    public static int a(int i7) {
        if (i7 >= 48 && i7 <= 57) {
            return i7 - 48;
        }
        if (i7 >= 65 && i7 <= 70) {
            return i7 - 55;
        }
        if (i7 >= 97 && i7 <= 102) {
            return i7 - 87;
        }
        return 0;
    }

    public void b(int i7, byte[] bArr) {
        int i10 = 0;
        while (i10 < i7) {
            int read = read(bArr, i10, i7 - i10);
            if (read > 0) {
                i10 += read;
            } else {
                throw new rc.j(i10);
            }
        }
    }

    public rc.x c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.e1.c():rc.x");
    }

    @Override
    public int read() {
        switch (this.f51117a) {
            case 0:
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
            default:
                return super.read();
        }
    }

    @Override
    public int read(byte[] bArr, int i7, int i10) {
        switch (this.f51117a) {
            case 0:
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    int read = read();
                    if (read == -1) {
                        if (i11 == 0) {
                            return -1;
                        }
                        return i11;
                    }
                    bArr[i7 + i12] = (byte) read;
                    i11++;
                }
                return i11;
            default:
                return super.read(bArr, i7, i10);
        }
    }
}
