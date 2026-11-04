package z7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class d0 implements ma.e {
    public static final Charset f59826f = Charset.forName("UTF-8");
    public static final ma.c f59827g = new ma.c("key", k2.p1.o(t4.c.k(b0.class, new y(1))));
    public static final ma.c h = new ma.c("value", k2.p1.o(t4.c.k(b0.class, new y(2))));
    public static final c0 f59828i = c0.f59810b;
    public OutputStream f59829a;
    public final HashMap f59830b;
    public final HashMap f59831c;
    public final ma.d d;
    public final b8.h0 f59832e = new b8.h0(this, 4);

    public d0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ma.d dVar) {
        this.f59829a = byteArrayOutputStream;
        this.f59830b = hashMap;
        this.f59831c = hashMap2;
        this.d = dVar;
    }

    public static int i(ma.c cVar) {
        b0 b0Var = (b0) cVar.b(b0.class);
        if (b0Var != null) {
            return ((y) b0Var).f60132a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ma.e a(ma.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    @Override
    public final ma.e b(ma.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
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
        k((i(cVar) << 3) | 1);
        this.f59829a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override
    public final ma.e e(ma.c cVar, int i3) {
        h(cVar, i3, true);
        return this;
    }

    @Override
    public final ma.e f(ma.c cVar, long j10) {
        if (j10 != 0) {
            b0 b0Var = (b0) cVar.b(b0.class);
            if (b0Var != null) {
                k(((y) b0Var).f60132a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    public final void g(ma.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f59826f);
                    k(bytes.length);
                    this.f59829a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f59828i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                d(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f59829a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    b0 b0Var = (b0) cVar.b(b0.class);
                    if (b0Var != null) {
                        k(((y) b0Var).f60132a << 3);
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
                this.f59829a.write(bArr);
            } else {
                ma.d dVar = (ma.d) this.f59830b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ma.f fVar = (ma.f) this.f59831c.get(obj.getClass());
                if (fVar != null) {
                    b8.h0 h0Var = this.f59832e;
                    h0Var.f2645b = false;
                    h0Var.d = cVar;
                    h0Var.f2646c = z10;
                    fVar.a(obj, h0Var);
                } else if (obj instanceof z) {
                    h(cVar, ((z) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    public final void h(ma.c cVar, int i3, boolean z10) {
        if (z10 && i3 == 0) {
            return;
        }
        b0 b0Var = (b0) cVar.b(b0.class);
        if (b0Var != null) {
            k(((y) b0Var).f60132a << 3);
            k(i3);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ma.d dVar, ma.c cVar, Object obj, boolean z10) {
        b8.b0 b0Var = new b8.b0(4);
        b0Var.f2477b = 0L;
        try {
            OutputStream outputStream = this.f59829a;
            this.f59829a = b0Var;
            dVar.a(obj, this);
            this.f59829a = outputStream;
            long j10 = b0Var.f2477b;
            b0Var.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j10);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                b0Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i3) {
        while ((i3 & (-128)) != 0) {
            this.f59829a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f59829a.write(i3 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f59829a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f59829a.write(((int) j10) & 127);
    }
}
