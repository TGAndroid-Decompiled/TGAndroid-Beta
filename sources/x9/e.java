package x9;

import j7.l;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e implements u9.e {
    public static final Charset f50503f = Charset.forName("UTF-8");
    public static final u9.c f50504g = new u9.c("key", w.c.h(w.c.g(d.class, new a(1))));
    public static final u9.c h = new u9.c("value", w.c.h(w.c.g(d.class, new a(2))));
    public static final w9.a f50505i = new w9.a(1);
    public OutputStream f50506a;
    public final HashMap f50507b;
    public final HashMap f50508c;
    public final u9.d d;
    public final l f50509e = new l(this, 4);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, u9.d dVar) {
        this.f50506a = byteArrayOutputStream;
        this.f50507b = hashMap;
        this.f50508c = hashMap2;
        this.d = dVar;
    }

    public static int j(u9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f50500a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final u9.e a(u9.c cVar, int i10) {
        g(cVar, i10, true);
        return this;
    }

    @Override
    public final u9.e b(u9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f50500a << 3);
            l(j10);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final u9.e c(u9.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final u9.e d(u9.c cVar, boolean z4) {
        g(cVar, z4 ? 1 : 0, true);
        return this;
    }

    @Override
    public final u9.e e(u9.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void f(u9.c cVar, double d, boolean z4) {
        if (z4 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f50506a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(u9.c cVar, int i10, boolean z4) {
        if (z4 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f50500a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(u9.c cVar, Object obj, boolean z4) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z4 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f50503f);
                    k(bytes.length);
                    this.f50506a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f50505i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z4);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z4 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f50506a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z4 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f50500a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z4);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z4 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f50506a.write(bArr);
            } else {
                u9.d dVar2 = (u9.d) this.f50507b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z4);
                    return;
                }
                u9.f fVar = (u9.f) this.f50508c.get(obj.getClass());
                if (fVar != null) {
                    l lVar = this.f50509e;
                    lVar.f9686b = false;
                    lVar.d = cVar;
                    lVar.f9687c = z4;
                    fVar.a(obj, lVar);
                } else if (obj instanceof b) {
                    g(cVar, ((b) obj).a(), true);
                } else if (obj instanceof Enum) {
                    g(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z4);
                }
            }
        }
    }

    public final void i(u9.d dVar, u9.c cVar, Object obj, boolean z4) {
        j7.f fVar = new j7.f(4);
        fVar.f9602b = 0L;
        try {
            OutputStream outputStream = this.f50506a;
            this.f50506a = fVar;
            dVar.a(obj, this);
            this.f50506a = outputStream;
            long j10 = fVar.f9602b;
            fVar.close();
            if (z4 && j10 == 0) {
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
            this.f50506a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f50506a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f50506a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f50506a.write(((int) j10) & 127);
    }
}
