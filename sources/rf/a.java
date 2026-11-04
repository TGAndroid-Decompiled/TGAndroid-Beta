package rf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
public class a extends FilterInputStream {
    public final int f54500a = 0;
    public long f54501b;
    public long f54502c;

    public a(FilterInputStream filterInputStream) {
        this(filterInputStream, 0L);
    }

    private final synchronized void a(int i3) {
        this.f54502c = this.f54501b;
        super.mark(i3);
    }

    private final synchronized void b(int i3) {
        ((FilterInputStream) this).in.mark(i3);
        this.f54502c = this.f54501b;
    }

    private final synchronized void c() {
        super.reset();
        this.f54501b = this.f54502c;
    }

    private final synchronized void d() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f54502c != -1) {
                ((FilterInputStream) this).in.reset();
                this.f54501b = this.f54502c;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override
    public int available() {
        switch (this.f54500a) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f54501b);
            default:
                return super.available();
        }
    }

    @Override
    public final synchronized void mark(int i3) {
        switch (this.f54500a) {
            case 0:
                a(i3);
                return;
            default:
                b(i3);
                return;
        }
    }

    @Override
    public int read(byte[] bArr) {
        switch (this.f54500a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return super.read(bArr);
        }
    }

    @Override
    public final synchronized void reset() {
        switch (this.f54500a) {
            case 0:
                c();
                return;
            default:
                d();
                return;
        }
    }

    @Override
    public long skip(long j10) {
        switch (this.f54500a) {
            case 0:
                long j11 = this.f54501b;
                long skip = super.skip(j10);
                this.f54501b = j11 + skip;
                return skip;
            default:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j10, this.f54501b));
                this.f54501b -= skip2;
                return skip2;
        }
    }

    public a(InputStream inputStream, long j10) {
        super(inputStream);
        this.f54501b = j10;
    }

    @Override
    public int read() {
        switch (this.f54500a) {
            case 0:
                int read = super.read();
                if (read >= 0) {
                    this.f54501b++;
                }
                return read;
            default:
                if (this.f54501b == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f54501b--;
                }
                return read2;
        }
    }

    public a(InputStream inputStream) {
        super(inputStream);
        this.f54502c = -1L;
        this.f54501b = 1048577L;
    }

    @Override
    public int read(byte[] bArr, int i3, int i10) {
        switch (this.f54500a) {
            case 0:
                long j10 = this.f54501b;
                int read = super.read(bArr, i3, i10);
                if (read > 0) {
                    this.f54501b = j10 + read;
                }
                return read;
            default:
                long j11 = this.f54501b;
                if (j11 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i3, (int) Math.min(i10, j11));
                if (read2 != -1) {
                    this.f54501b -= read2;
                }
                return read2;
        }
    }
}
