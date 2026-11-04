package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;
public final class a1 extends FileInputStream {
    public final long f50811a;

    public a1(long j10, long j11, File file) {
        super(file);
        this.f50811a = j11;
        if (j10 > 0 && skip(j10) != j10) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override
    public final int read() {
        if (getChannel().position() >= this.f50811a) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final int read(byte[] bArr, int i3, int i10) {
        long position = getChannel().position();
        long j10 = this.f50811a;
        if (position >= j10) {
            return -1;
        }
        long position2 = j10 - getChannel().position();
        if (i10 > position2) {
            i10 = (int) position2;
        }
        return super.read(bArr, i3, i10);
    }
}
