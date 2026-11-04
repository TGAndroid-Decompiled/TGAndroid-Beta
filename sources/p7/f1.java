package p7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import k2.p1;
import org.telegram.ui.Components.nh;
public final class f1 implements Closeable {
    public final ByteArrayInputStream f53351a;
    public e1 f53352b;
    public final byte[] f53353c = new byte[8];
    public final nh d = new nh(10);

    public f1(ByteArrayInputStream byteArrayInputStream) {
        this.f53351a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f10 = f();
        int i3 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        if (i3 >= 0) {
            if (i3 > 0) {
                ((ArrayDeque) this.d.f36540b).push(Long.valueOf(f10));
            }
            return f10;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.f53352b.f53347a;
        if (b10 == 0) {
            z10 = true;
        } else if (b10 == 32) {
            z10 = false;
        } else {
            throw new IllegalStateException(p1.i((this.f53352b.f53347a >> 5) & 7, "expected major type 0 or 1 but found "));
        }
        long f10 = f();
        if (f10 >= 0) {
            if (z10) {
                return f10;
            }
            return ~f10;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f10 = f();
        int i3 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        if (i3 >= 0 && f10 <= 4611686018427387903L) {
            if (i3 > 0) {
                ((ArrayDeque) this.d.f36540b).push(Long.valueOf(f10 + f10));
            }
            return f10;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    @Override
    public final void close() {
        this.f53351a.close();
        this.d.K();
    }

    public final p7.e1 d() {
        throw new UnsupportedOperationException("Method not decompiled: p7.f1.d():p7.e1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f53352b.f53348b <= 24) {
            int f10 = (int) f();
            if (f10 == 20) {
                return false;
            }
            if (f10 == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final long f() {
        byte b10 = this.f53352b.f53348b;
        if (b10 < 24) {
            long j10 = b10;
            this.f53352b = null;
            return j10;
        } else if (b10 == 24) {
            int read = this.f53351a.read();
            if (read != -1) {
                this.f53352b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.f53353c;
            if (b10 == 25) {
                i(2, bArr);
                return ((bArr[0] & 255) << 8) | (255 & bArr[1]);
            } else if (b10 == 26) {
                i(4, bArr);
                return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            } else if (b10 == 27) {
                i(8, bArr);
                return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
            } else {
                e1 e1Var = this.f53352b;
                throw new IOException(a1.g.n(e1Var.f53348b, (e1Var.f53347a >> 5) & 7, "invalid additional information ", " for major type "));
            }
        }
    }

    public final void g() {
        d();
        if (this.f53352b.f53348b != 31) {
            return;
        }
        throw new IllegalStateException(p1.i(this.f53352b.f53348b, "expected definite length but found "));
    }

    public final void h(byte b10) {
        d();
        if (this.f53352b.f53347a == b10) {
            return;
        }
        throw new IllegalStateException(a1.g.n((b10 >> 5) & 7, (this.f53352b.f53347a >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i3, byte[] bArr) {
        int i10 = 0;
        while (i10 != i3) {
            int read = this.f53351a.read(bArr, i10, i3 - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
        this.f53352b = null;
    }

    public final byte[] j() {
        g();
        long f10 = f();
        if (f10 >= 0 && f10 <= 2147483647L) {
            if (this.f53351a.available() >= f10) {
                int i3 = (int) f10;
                byte[] bArr = new byte[i3];
                i(i3, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }
}
