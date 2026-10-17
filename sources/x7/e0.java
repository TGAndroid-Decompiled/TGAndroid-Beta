package x7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e0 implements ja.e {
    public static final Charset f49374f = Charset.forName("UTF-8");
    public static final ja.c f49375g = new ja.c("key", i0.a.o(r.c.m(c0.class, new z(1))));
    public static final ja.c h = new ja.c("value", i0.a.o(r.c.m(c0.class, new z(2))));
    public static final d0 f49376i = d0.f49357b;
    public OutputStream f49377a;
    public final HashMap f49378b;
    public final HashMap f49379c;
    public final ja.d d;
    public final ma.h e = new ma.h(this, 3);

    public e0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ja.d dVar) {
        this.f49377a = byteArrayOutputStream;
        this.f49378b = hashMap;
        this.f49379c = hashMap2;
        this.d = dVar;
    }

    public static int i(ja.c cVar) {
        c0 c0Var = (c0) cVar.b(c0.class);
        if (c0Var != null) {
            return ((z) c0Var).f49656a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ja.e a(ja.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void b(ja.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f49377a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ja.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f49374f);
                    k(bytes.length);
                    this.f49377a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f49376i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f49377a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    c0 c0Var = (c0) cVar.b(c0.class);
                    if (c0Var != null) {
                        k(((z) c0Var).f49656a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                k(bArr.length);
                this.f49377a.write(bArr);
            } else {
                ja.d dVar = (ja.d) this.f49378b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ja.f fVar = (ja.f) this.f49379c.get(obj.getClass());
                if (fVar != null) {
                    ma.h hVar = this.e;
                    hVar.f16818b = false;
                    hVar.d = cVar;
                    hVar.f16819c = z10;
                    fVar.a(obj, hVar);
                } else if (obj instanceof a0) {
                    h(cVar, ((a0) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    @Override
    public final ja.e d(ja.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    @Override
    public final ja.e e(ja.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    @Override
    public final ja.e f(ja.c cVar, long j10) {
        if (j10 != 0) {
            c0 c0Var = (c0) cVar.b(c0.class);
            if (c0Var != null) {
                k(((z) c0Var).f49656a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final ja.e g(ja.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    public final void h(ja.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        c0 c0Var = (c0) cVar.b(c0.class);
        if (c0Var != null) {
            k(((z) c0Var).f49656a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ja.d dVar, ja.c cVar, Object obj, boolean z10) {
        ma.b bVar = new ma.b(3);
        bVar.f16807b = 0L;
        try {
            OutputStream outputStream = this.f49377a;
            this.f49377a = bVar;
            dVar.a(obj, this);
            this.f49377a = outputStream;
            long j10 = bVar.f16807b;
            bVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f49377a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f49377a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f49377a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f49377a.write(((int) j10) & 127);
    }
}
