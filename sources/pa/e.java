package pa;

import b8.b0;
import b8.h0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import k2.p1;
public final class e implements ma.e {
    public static final Charset f53431f = Charset.forName("UTF-8");
    public static final ma.c f53432g = new ma.c("key", p1.o(p1.n(d.class, new a(1))));
    public static final ma.c h = new ma.c("value", p1.o(p1.n(d.class, new a(2))));
    public static final oa.a f53433i = new oa.a(1);
    public OutputStream f53434a;
    public final HashMap f53435b;
    public final HashMap f53436c;
    public final ma.d d;
    public final h0 f53437e = new h0(this, 1);

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ma.d dVar) {
        this.f53434a = byteArrayOutputStream;
        this.f53435b = hashMap;
        this.f53436c = hashMap2;
        this.d = dVar;
    }

    public static int j(ma.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f53428a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ma.e a(ma.c cVar, Object obj) {
        h(cVar, obj, true);
        return this;
    }

    @Override
    public final ma.e b(ma.c cVar, boolean z10) {
        g(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final ma.e c(ma.c cVar, double d) {
        d(cVar, d, true);
        return this;
    }

    public final void d(ma.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((j(cVar) << 3) | 1);
        this.f53434a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override
    public final ma.e e(ma.c cVar, int i3) {
        g(cVar, i3, true);
        return this;
    }

    @Override
    public final ma.e f(ma.c cVar, long j10) {
        if (j10 == 0) {
            return this;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f53428a << 3);
            l(j10);
            return this;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void g(ma.c cVar, int i3, boolean z10) {
        if (z10 && i3 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f53428a << 3);
            k(i3);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void h(ma.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((j(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f53431f);
                    k(bytes.length);
                    this.f53434a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    h(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i(f53433i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                d(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((j(cVar) << 3) | 5);
                    this.f53434a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f53428a << 3);
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
                this.f53434a.write(bArr);
            } else {
                ma.d dVar2 = (ma.d) this.f53435b.get(obj.getClass());
                if (dVar2 != null) {
                    i(dVar2, cVar, obj, z10);
                    return;
                }
                ma.f fVar = (ma.f) this.f53436c.get(obj.getClass());
                if (fVar != null) {
                    h0 h0Var = this.f53437e;
                    h0Var.f2645b = false;
                    h0Var.d = cVar;
                    h0Var.f2646c = z10;
                    fVar.a(obj, h0Var);
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

    public final void i(ma.d dVar, ma.c cVar, Object obj, boolean z10) {
        b0 b0Var = new b0(1);
        b0Var.f2477b = 0L;
        try {
            OutputStream outputStream = this.f53434a;
            this.f53434a = b0Var;
            dVar.a(obj, this);
            this.f53434a = outputStream;
            long j10 = b0Var.f2477b;
            b0Var.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((j(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                b0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i3) {
        while ((i3 & (-128)) != 0) {
            this.f53434a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f53434a.write(i3 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f53434a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f53434a.write(((int) j10) & 127);
    }
}
