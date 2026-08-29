package z6;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
public final class e1 implements Closeable {
    public final ByteArrayInputStream f50704a;
    public d1 f50705b;
    public final byte[] f50706c = new byte[8];
    public final xf.h d = new xf.h();

    public e1(ByteArrayInputStream byteArrayInputStream) {
        this.f50704a = byteArrayInputStream;
    }

    public final long a() {
        h(Byte.MIN_VALUE);
        g();
        long f9 = f();
        int i10 = (f9 > 0L ? 1 : (f9 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f50134a).push(Long.valueOf(f9));
            }
            return f9;
        }
        throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.f50705b.f50700a;
        if (b10 == 0) {
            z10 = true;
        } else if (b10 == 32) {
            z10 = false;
        } else {
            throw new IllegalStateException(j7.l1.k((this.f50705b.f50700a >> 5) & 7, "expected major type 0 or 1 but found "));
        }
        long f9 = f();
        if (f9 >= 0) {
            if (z10) {
                return f9;
            }
            return ~f9;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long f9 = f();
        int i10 = (f9 > 0L ? 1 : (f9 == 0L ? 0 : -1));
        if (i10 >= 0 && f9 <= 4611686018427387903L) {
            if (i10 > 0) {
                ((ArrayDeque) this.d.f50134a).push(Long.valueOf(f9 + f9));
            }
            return f9;
        }
        throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
    }

    @Override
    public final void close() {
        this.f50704a.close();
        this.d.a();
    }

    public final z6.d1 d() {
        throw new UnsupportedOperationException("Method not decompiled: z6.e1.d():z6.d1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f50705b.f50701b <= 24) {
            int f9 = (int) f();
            if (f9 == 20) {
                return false;
            }
            if (f9 == 21) {
                return true;
            }
            throw new IllegalStateException("expected FALSE or TRUE");
        }
        throw new IllegalStateException("expected simple value");
    }

    public final long f() {
        byte b10 = this.f50705b.f50701b;
        if (b10 < 24) {
            long j10 = b10;
            this.f50705b = null;
            return j10;
        } else if (b10 == 24) {
            int read = this.f50704a.read();
            if (read != -1) {
                this.f50705b = null;
                return read & 255;
            }
            throw new EOFException();
        } else {
            byte[] bArr = this.f50706c;
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
                d1 d1Var = this.f50705b;
                throw new IOException(a4.w.k(d1Var.f50701b, (d1Var.f50700a >> 5) & 7, "invalid additional information ", " for major type "));
            }
        }
    }

    public final void g() {
        d();
        if (this.f50705b.f50701b != 31) {
            return;
        }
        throw new IllegalStateException(j7.l1.k(this.f50705b.f50701b, "expected definite length but found "));
    }

    public final void h(byte b10) {
        d();
        if (this.f50705b.f50700a == b10) {
            return;
        }
        throw new IllegalStateException(a4.w.k((b10 >> 5) & 7, (this.f50705b.f50700a >> 5) & 7, "expected major type ", " but found "));
    }

    public final void i(int i10, byte[] bArr) {
        int i11 = 0;
        while (i11 != i10) {
            int read = this.f50704a.read(bArr, i11, i10 - i11);
            if (read != -1) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        }
        this.f50705b = null;
    }

    public final byte[] j() {
        g();
        long f9 = f();
        if (f9 >= 0 && f9 <= 2147483647L) {
            if (this.f50704a.available() >= f9) {
                int i10 = (int) f9;
                byte[] bArr = new byte[i10];
                i(i10, bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
    }
}
