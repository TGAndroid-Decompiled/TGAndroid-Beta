package v9;

import h7.l;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e implements s9.e {
    public static final Charset f49467f = Charset.forName("UTF-8");
    public static final s9.c f49468g = new s9.c("key", u3.c.h(u3.c.g(d.class, new a(1))));
    public static final s9.c h = new s9.c("value", u3.c.h(u3.c.g(d.class, new a(2))));
    public static final u9.a f49469i = new u9.a(1);
    public OutputStream f49470a;
    public final HashMap f49471b;
    public final HashMap f49472c;
    public final s9.d d;
    public final l f49473e = new l(this, 4);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, s9.d dVar) {
        this.f49470a = byteArrayOutputStream;
        this.f49471b = hashMap;
        this.f49472c = hashMap2;
        this.d = dVar;
    }

    public static int j(s9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f49464a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final s9.e a(s9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final s9.e b(s9.c cVar, int i10) {
        g(cVar, i10, true);
        return this;
    }

    @Override
    public final s9.e c(s9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f49464a << 3);
            l(j10);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final s9.e d(s9.c cVar, boolean z10) {
        g(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final s9.e e(s9.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void f(s9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f49470a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(s9.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f49464a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(s9.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f49467f);
                    k(bytes.length);
                    this.f49470a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f49469i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f49470a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f49464a << 3);
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
                this.f49470a.write(bArr);
            } else {
                s9.d dVar2 = (s9.d) this.f49471b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z10);
                    return;
                }
                s9.f fVar = (s9.f) this.f49472c.get(obj.getClass());
                if (fVar != null) {
                    l lVar = this.f49473e;
                    lVar.f7686b = false;
                    lVar.d = cVar;
                    lVar.f7687c = z10;
                    fVar.a(obj, lVar);
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

    public final void i(s9.d dVar, s9.c cVar, Object obj, boolean z10) {
        h7.f fVar = new h7.f(4);
        fVar.f7616b = 0L;
        try {
            OutputStream outputStream = this.f49470a;
            this.f49470a = fVar;
            dVar.a(obj, this);
            this.f49470a = outputStream;
            long j10 = fVar.f7616b;
            fVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                fVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f49470a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f49470a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f49470a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f49470a.write(((int) j10) & 127);
    }
}
