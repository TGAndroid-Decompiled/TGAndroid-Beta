package org.telegram.ui.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class g1 extends FileInputStream {

    public final long f43840a;

    public g1(File file, long j10, long j11) {
        super(file);
        this.f43840a = j11;
        if (j10 > 0 && skip(j10) != j10) {
            throw new RuntimeException("BoundedInputStream failed to skip");
        }
    }

    @Override
    public final int read() {
        if (getChannel().position() >= this.f43840a) {
            return -1;
        }
        return super.read();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long jPosition = getChannel().position();
        long j10 = this.f43840a;
        if (jPosition >= j10) {
            return -1;
        }
        long jPosition2 = j10 - getChannel().position();
        if (i11 > jPosition2) {
            i11 = (int) jPosition2;
        }
        return super.read(bArr, i10, i11);
    }
}
