package xe;

import android.content.Context;
import h7.u;
import java.io.EOFException;
public final class b implements a3.b {
    public final Object f46987a;

    public b(Object obj) {
        this.f46987a = obj;
    }

    public byte a() {
        int read = ((com.google.firebase.messaging.d) this.f46987a).read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public int b() {
        return ((a() & 255) << 24) | ((a() & 255) << 16) | ((a() & 255) << 8) | (a() & 255);
    }

    public int c() {
        return ((a() & Byte.MAX_VALUE) << 21) | ((a() & Byte.MAX_VALUE) << 14) | ((a() & Byte.MAX_VALUE) << 7) | (a() & Byte.MAX_VALUE);
    }

    public void d(long j10) {
        long j11 = 0;
        while (j11 < j10) {
            long skip = ((com.google.firebase.messaging.d) this.f46987a).skip(j10 - j11);
            if (skip > 0) {
                j11 += skip;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public Object mo28get() {
        return new s5.m((Context) ((a3.c) this.f46987a).f45a, new u(7), new db.a(7), 13);
    }
}
