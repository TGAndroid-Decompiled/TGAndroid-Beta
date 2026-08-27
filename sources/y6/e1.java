package y6;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

public final class e1 implements Closeable {

    public final ByteArrayInputStream f49721a;

    public d1 f49722b;

    public final byte[] f49723c = new byte[8];
    public final o0.b d = new o0.b(21);

    public e1(ByteArrayInputStream byteArrayInputStream) {
        this.f49721a = byteArrayInputStream;
    }

    public final long a() {
        h((byte) -128);
        g();
        long jF = f();
        if (jF < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (jF > 0) {
            ((ArrayDeque) this.d.f19088b).push(Long.valueOf(jF));
        }
        return jF;
    }

    public final long b() {
        boolean z10;
        d();
        byte b10 = this.f49722b.f49717a;
        if (b10 == 0) {
            z10 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(i0.a.k((this.f49722b.f49717a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z10 = false;
        }
        long jF = f();
        if (jF >= 0) {
            return z10 ? jF : ~jF;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long c() {
        h((byte) -96);
        g();
        long jF = f();
        if (jF < 0 || jF > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (jF > 0) {
            ((ArrayDeque) this.d.f19088b).push(Long.valueOf(jF + jF));
        }
        return jF;
    }

    @Override
    public final void close() throws IOException {
        this.f49721a.close();
        this.d.l();
    }

    public final y6.d1 d() {
        throw new UnsupportedOperationException("Method not decompiled: y6.e1.d():y6.d1");
    }

    public final boolean e() {
        h((byte) -32);
        if (this.f49722b.f49718b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int iF = (int) f();
        if (iF == 20) {
            return false;
        }
        if (iF == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long f() throws IOException {
        byte b10 = this.f49722b.f49718b;
        if (b10 < 24) {
            long j10 = b10;
            this.f49722b = null;
            return j10;
        }
        if (b10 == 24) {
            int i10 = this.f49721a.read();
            if (i10 == -1) {
                throw new EOFException();
            }
            this.f49722b = null;
            return ((long) i10) & 255;
        }
        byte[] bArr = this.f49723c;
        if (b10 == 25) {
            i(2, bArr);
            return ((((long) bArr[0]) & 255) << 8) | (255 & ((long) bArr[1]));
        }
        if (b10 == 26) {
            i(4, bArr);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b10 != 27) {
            d1 d1Var = this.f49722b;
            throw new IOException(a9.p.j(d1Var.f49718b, (d1Var.f49717a >> 5) & 7, "invalid additional information ", " for major type "));
        }
        i(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((((long) bArr[4]) & 255) << 24) | ((((long) bArr[5]) & 255) << 16) | ((((long) bArr[6]) & 255) << 8) | (((long) bArr[7]) & 255);
    }

    public final void g() {
        d();
        if (this.f49722b.f49718b == 31) {
            throw new IllegalStateException(i0.a.k(this.f49722b.f49718b, "expected definite length but found "));
        }
    }

    public final void h(byte b10) {
        d();
        if (this.f49722b.f49717a != b10) {
            throw new IllegalStateException(a9.p.j((b10 >> 5) & 7, (this.f49722b.f49717a >> 5) & 7, "expected major type ", " but found "));
        }
    }

    public final void i(int i10, byte[] bArr) throws IOException {
        int i11 = 0;
        while (i11 != i10) {
            int i12 = this.f49721a.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 += i12;
        }
        this.f49722b = null;
    }

    public final byte[] j() {
        g();
        long jF = f();
        if (jF < 0 || jF > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f49721a.available() < jF) {
            throw new EOFException();
        }
        int i10 = (int) jF;
        byte[] bArr = new byte[i10];
        i(i10, bArr);
        return bArr;
    }
}
