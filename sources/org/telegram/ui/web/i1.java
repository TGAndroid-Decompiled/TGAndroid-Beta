package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;
public final class i1 extends FileInputStream {
    public final long f42631a;

    public i1(long j10, long j11, File file) {
        super(file);
        this.f42631a = j11;
        if (j10 > 0 && skip(j10) != j10) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override
    public final int read() {
        if (getChannel().position() >= this.f42631a) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        long position = getChannel().position();
        long j10 = this.f42631a;
        if (position >= j10) {
            return -1;
        }
        long position2 = j10 - getChannel().position();
        if (i11 > position2) {
            i11 = (int) position2;
        }
        return super.read(bArr, i10, i11);
    }
}
