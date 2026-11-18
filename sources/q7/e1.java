package q7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.of;
public final class e1 implements Closeable {
    public final ByteArrayInputStream f55991a;
    public d1 f55992b;
    public final byte[] f55993c = new byte[8];
    public final of d = new of(12);

    public e1(ByteArrayInputStream byteArrayInputStream) {
        this.f55991a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f10 = f();
        int i7 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        if (i7 >= 0) {
            if (i7 > 0) {
                ((ArrayDeque) this.d.f38076b).push(Long.valueOf(f10));
            }
            return f10;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.f55992b.f55987a;
        if (b10 == 0) {
            z10 = true;
        } else if (b10 == 32) {
            z10 = false;
        } else {
            throw new IllegalStateException(i5.c.i((this.f55992b.f55987a >> 5) & 7, "expected major type 0 or 1 but found "));
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
        int i7 = (f10 > 0L ? 1 : (f10 == 0L ? 0 : -1));
        if (i7 >= 0 && f10 <= 4611686018427387903L) {
            if (i7 > 0) {
                ((ArrayDeque) this.d.f38076b).push(Long.valueOf(f10 + f10));
            }
            return f10;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    @Override
    public final void close() {
        this.f55991a.close();
        this.d.A0();
    }

    public final q7.d1 d() {
        throw new UnsupportedOperationException("Method not decompiled: q7.e1.d():q7.d1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f55992b.f55988b <= 24) {
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
        byte b10 = this.f55992b.f55988b;
        if (b10 < 24) {
            long j3 = b10;
            this.f55992b = null;
            return j3;
        } else if (b10 == 24) {
            int read = this.f55991a.read();
            if (read != -1) {
                this.f55992b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.f55993c;
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
                d1 d1Var = this.f55992b;
                throw new IOException(a8.p0.m(d1Var.f55988b, (d1Var.f55987a >> 5) & 7, "invalid additional information ", " for major type "));
            }
        }
    }

    public final void g() {
        d();
        if (this.f55992b.f55988b != 31) {
            return;
        }
        throw new IllegalStateException(i5.c.i(this.f55992b.f55988b, "expected definite length but found "));
    }

    public final void h(byte b10) {
        d();
        if (this.f55992b.f55987a == b10) {
            return;
        }
        throw new IllegalStateException(a8.p0.m((b10 >> 5) & 7, (this.f55992b.f55987a >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i7, byte[] bArr) {
        int i10 = 0;
        while (i10 != i7) {
            int read = this.f55991a.read(bArr, i10, i7 - i10);
            if (read != -1) {
                i10 += read;
            } else {
                throw new EOFException();
            }
        }
        this.f55992b = null;
    }

    public final byte[] j() {
        g();
        long f10 = f();
        if (f10 >= 0 && f10 <= 2147483647L) {
            if (this.f55991a.available() >= f10) {
                int i7 = (int) f10;
                byte[] bArr = new byte[i7];
                i(i7, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }
}
