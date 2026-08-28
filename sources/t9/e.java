package t9;

import f7.l;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e implements q9.e {
    public static final Charset f47737f = Charset.forName("UTF-8");
    public static final q9.c f47738g = new q9.c("key", ta.b.g(ta.b.f(d.class, new a(1))));
    public static final q9.c h = new q9.c("value", ta.b.g(ta.b.f(d.class, new a(2))));
    public static final s9.a f47739i = new s9.a(1);
    public OutputStream f47740a;
    public final HashMap f47741b;
    public final HashMap f47742c;
    public final q9.d d;
    public final l f47743e = new l(this, 4);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, q9.d dVar) {
        this.f47740a = byteArrayOutputStream;
        this.f47741b = hashMap;
        this.f47742c = hashMap2;
        this.d = dVar;
    }

    public static int j(q9.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f47734a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final q9.e a(q9.c cVar, boolean z10) {
        f(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final q9.e b(q9.c cVar, double d) {
        e(cVar, d, true);
        return this;
    }

    @Override
    public final q9.e c(q9.c cVar, int i9) {
        f(cVar, i9, true);
        return this;
    }

    @Override
    public final q9.e d(q9.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f47734a << 3);
            l(j10);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void e(q9.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f47740a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void f(q9.c cVar, int i9, boolean z10) {
        if (z10 && i9 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f47734a << 3);
            k(i9);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final q9.e g(q9.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    public final void h(q9.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f47737f);
                    k(bytes.length);
                    this.f47740a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f47739i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                e(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f47740a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f47734a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                f(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z10 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f47740a.write(bArr);
            } else {
                q9.d dVar2 = (q9.d) this.f47741b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z10);
                    return;
                }
                q9.f fVar = (q9.f) this.f47742c.get(obj.getClass());
                if (fVar != null) {
                    l lVar = this.f47743e;
                    lVar.f5735b = false;
                    lVar.d = cVar;
                    lVar.f5736c = z10;
                    fVar.a(obj, lVar);
                } else if (obj instanceof b) {
                    f(cVar, ((b) obj).a(), true);
                } else if (obj instanceof Enum) {
                    f(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void i(q9.d dVar, q9.c cVar, Object obj, boolean z10) {
        f7.f fVar = new f7.f(4);
        fVar.f5655b = 0L;
        try {
            OutputStream outputStream = this.f47740a;
            this.f47740a = fVar;
            dVar.a(obj, this);
            this.f47740a = outputStream;
            long j10 = fVar.f5655b;
            fVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th) {
            try {
                fVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(int i9) {
        while ((i9 & (-128)) != 0) {
            this.f47740a.write((i9 & 127) | 128);
            i9 >>>= 7;
        }
        this.f47740a.write(i9 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f47740a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f47740a.write(((int) j10) & 127);
    }
}
