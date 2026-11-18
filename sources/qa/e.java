package qa;

import a8.k0;
import a8.r0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e implements na.e {
    public static final Charset f56074f = Charset.forName("UTF-8");
    public static final na.c f56075g = new na.c("key", i5.c.p(i5.c.o(d.class, new a(1))));
    public static final na.c h = new na.c("value", i5.c.p(i5.c.o(d.class, new a(2))));
    public static final pa.a f56076i = new pa.a(1);
    public OutputStream f56077a;
    public final HashMap f56078b;
    public final HashMap f56079c;
    public final na.d d;
    public final r0 f56080e = new r0(this, 2);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, na.d dVar) {
        this.f56077a = byteArrayOutputStream;
        this.f56078b = hashMap;
        this.f56079c = hashMap2;
        this.d = dVar;
    }

    public static int j(na.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f56071a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final na.e a(na.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override
    public final na.e b(na.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final na.e c(na.c cVar, boolean z10) {
        g(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final na.e d(na.c cVar, int i7) {
        g(cVar, i7, true);
        return this;
    }

    @Override
    public final na.e e(na.c cVar, long j3) {
        if (j3 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f56071a << 3);
            l(j3);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void f(na.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f56077a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(na.c cVar, int i7, boolean z10) {
        if (z10 && i7 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f56071a << 3);
            k(i7);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(na.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f56074f);
                    k(bytes.length);
                    this.f56077a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f56076i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f56077a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f56071a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f56077a.write(bArr);
            } else {
                na.d dVar2 = (na.d) this.f56078b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z10);
                    return;
                }
                na.f fVar = (na.f) this.f56079c.get(obj.getClass());
                if (fVar != null) {
                    r0 r0Var = this.f56080e;
                    r0Var.f604b = false;
                    r0Var.d = cVar;
                    r0Var.f605c = z10;
                    fVar.a(obj, r0Var);
                } else if (obj instanceof b) {
                    g(cVar, ((b) obj).a(), true);
                } else if (obj instanceof Enum) {
                    g(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void i(na.d dVar, na.c cVar, Object obj, boolean z10) {
        k0 k0Var = new k0(2);
        k0Var.f506b = 0L;
        try {
            OutputStream outputStream = this.f56077a;
            this.f56077a = k0Var;
            dVar.a(obj, this);
            this.f56077a = outputStream;
            long j3 = k0Var.f506b;
            k0Var.close();
            if (z10 && j3 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j3);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                k0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f56077a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f56077a.write(i7 & 127);
    }

    public final void l(long j3) {
        while (((-128) & j3) != 0) {
            this.f56077a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f56077a.write(((int) j3) & 127);
    }
}
