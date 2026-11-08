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
import jg.g;
public final class e implements na.e {
    public static final Charset f54051f = Charset.forName("UTF-8");
    public static final na.c f54052g = new na.c("key", g.q(g.p(d.class, new a(1))));
    public static final na.c h = new na.c("value", g.q(g.p(d.class, new a(2))));
    public static final pa.a f54053i = new pa.a(1);
    public OutputStream f54054a;
    public final HashMap f54055b;
    public final HashMap f54056c;
    public final na.d d;
    public final r0 f54057e = new r0(this, 2);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, na.d dVar) {
        this.f54054a = byteArrayOutputStream;
        this.f54055b = hashMap;
        this.f54056c = hashMap2;
        this.d = dVar;
    }

    public static int j(na.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f54048a;
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
    public final na.e c(na.c cVar, boolean z9) {
        g(cVar, z9 ? 1 : 0, true);
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
            k(((a) dVar).f54048a << 3);
            l(j3);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void f(na.c cVar, double d, boolean z9) {
        if (z9 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f54054a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(na.c cVar, int i7, boolean z9) {
        if (z9 && i7 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f54048a << 3);
            k(i7);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(na.c cVar, Object obj, boolean z9) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f54051f);
                    k(bytes.length);
                    this.f54054a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f54053i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z9);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z9 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f54054a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z9 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f54048a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z9 && bArr.length == 0) {
                    return;
                }
                k((j(cVar) << 3) | 2);
                k(bArr.length);
                this.f54054a.write(bArr);
            } else {
                na.d dVar2 = (na.d) this.f54055b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z9);
                    return;
                }
                na.f fVar = (na.f) this.f54056c.get(obj.getClass());
                if (fVar != null) {
                    r0 r0Var = this.f54057e;
                    r0Var.f601b = false;
                    r0Var.d = cVar;
                    r0Var.f602c = z9;
                    fVar.a(obj, r0Var);
                } else if (obj instanceof b) {
                    g(cVar, ((b) obj).a(), true);
                } else if (obj instanceof Enum) {
                    g(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    i(this.d, cVar, obj, z9);
                }
            }
        }
    }

    public final void i(na.d dVar, na.c cVar, Object obj, boolean z9) {
        k0 k0Var = new k0(2);
        k0Var.f501b = 0L;
        try {
            OutputStream outputStream = this.f54054a;
            this.f54054a = k0Var;
            dVar.a(obj, this);
            this.f54054a = outputStream;
            long j3 = k0Var.f501b;
            k0Var.close();
            if (z9 && j3 == 0) {
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
            this.f54054a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f54054a.write(i7 & 127);
    }

    public final void l(long j3) {
        while (((-128) & j3) != 0) {
            this.f54054a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f54054a.write(((int) j3) & 127);
    }
}
