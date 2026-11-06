package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;
public final class b1 extends FileInputStream {
    public final long f51093a;

    public b1(long j3, long j10, File file) {
        super(file);
        this.f51093a = j10;
        if (j3 > 0 && skip(j3) != j3) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override
    public final int read() {
        if (getChannel().position() >= this.f51093a) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final int read(byte[] bArr, int i7, int i10) {
        long position = getChannel().position();
        long j3 = this.f51093a;
        if (position >= j3) {
            return -1;
        }
        long position2 = j3 - getChannel().position();
        if (i10 > position2) {
            i10 = (int) position2;
        }
        return super.read(bArr, i7, i10);
    }
}
