package org.telegram.ui.web;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
public final class m1 extends FilterInputStream {
    public final int f43440a;

    public m1(BufferedInputStream bufferedInputStream, int i10) {
        super(bufferedInputStream);
        this.f43440a = i10;
    }

    public static int a(int i10) {
        if (i10 >= 48 && i10 <= 57) {
            return i10 - 48;
        }
        if (i10 >= 65 && i10 <= 70) {
            return i10 - 55;
        }
        if (i10 >= 97 && i10 <= 102) {
            return i10 - 87;
        }
        return 0;
    }

    public void b(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 < i10) {
            int read = read(bArr, i11, i10 - i11);
            if (read > 0) {
                i11 += read;
            } else {
                throw new sc.j(i11);
            }
        }
    }

    public sc.y c() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m1.c():sc.y");
    }

    @Override
    public int read() {
        switch (this.f43440a) {
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
    public int read(byte[] bArr, int i10, int i11) {
        switch (this.f43440a) {
            case 0:
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    int read = read();
                    if (read == -1) {
                        if (i12 == 0) {
                            return -1;
                        }
                        return i12;
                    }
                    bArr[i10 + i13] = (byte) read;
                    i12++;
                }
                return i12;
            default:
                return super.read(bArr, i10, i11);
        }
    }
}
