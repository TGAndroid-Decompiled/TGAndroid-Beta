package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;
public final class k1 extends FileInputStream {
    public final long f39114a;

    public k1(long j3, long j10, File file) {
        super(file);
        this.f39114a = j10;
        if (j3 > 0 && skip(j3) != j3) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override
    public final int read() {
        if (getChannel().position() >= this.f39114a) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long position = getChannel().position();
        long j3 = this.f39114a;
        if (position >= j3) {
            return -1;
        }
        long position2 = j3 - getChannel().position();
        if (i11 > position2) {
            i11 = (int) position2;
        }
        return super.read(bArr, i10, i11);
    }
}
