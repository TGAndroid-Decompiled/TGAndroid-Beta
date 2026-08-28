package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;
public final class f1 extends FileInputStream {
    public final long f43853a;

    public f1(File file, long j10, long j11) {
        super(file);
        this.f43853a = j11;
        if (j10 > 0 && skip(j10) != j10) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override
    public final int read() {
        if (getChannel().position() >= this.f43853a) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final int read(byte[] bArr, int i9, int i10) {
        long position = getChannel().position();
        long j10 = this.f43853a;
        if (position >= j10) {
            return -1;
        }
        long position2 = j10 - getChannel().position();
        if (i10 > position2) {
            i10 = (int) position2;
        }
        return super.read(bArr, i9, i10);
    }
}
