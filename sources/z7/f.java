package z7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class f implements na.e {
    public static final Charset f59764f = Charset.forName("UTF-8");
    public static final na.c f59765g = new na.c("key", jg.g.q(rf.b.l(d.class, new a(1))));
    public static final na.c h = new na.c("value", jg.g.q(rf.b.l(d.class, new a(2))));
    public static final e f59766i = e.f59753b;
    public OutputStream f59767a;
    public final HashMap f59768b;
    public final HashMap f59769c;
    public final na.d d;
    public final a8.r0 f59770e = new a8.r0(this, 4);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, na.d dVar) {
        this.f59767a = byteArrayOutputStream;
        this.f59768b = hashMap;
        this.f59769c = hashMap2;
        this.d = dVar;
    }

    public static int i(na.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f59724a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final na.e a(na.c cVar, Object obj) {
        g(cVar, obj, true);
        return this;
    }

    @Override
    public final na.e b(na.c cVar, double d) {
        f(cVar, d, true);
        return this;
    }

    @Override
    public final na.e c(na.c cVar, boolean z9) {
        h(cVar, z9 ? 1 : 0, true);
        return this;
    }

    @Override
    public final na.e d(na.c cVar, int i7) {
        h(cVar, i7, true);
        return this;
    }

    @Override
    public final na.e e(na.c cVar, long j3) {
        if (j3 != 0) {
            d dVar = (d) cVar.b(d.class);
            if (dVar != null) {
                k(((a) dVar).f59724a << 3);
                l(j3);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    public final void f(na.c cVar, double d, boolean z9) {
        if (z9 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f59767a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void g(na.c cVar, Object obj, boolean z9) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z9 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f59764f);
                    k(bytes.length);
                    this.f59767a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    g(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f59766i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                f(cVar, ((Double) obj).doubleValue(), z9);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z9 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f59767a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z9 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f59724a << 3);
                        l(longValue);
                        return;
                    }
                    throw new RuntimeException("Field has no @Protobuf config");
                }
            } else if (obj instanceof Boolean) {
                h(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z9);
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z9 && bArr.length == 0) {
                    return;
                }
                k((i(cVar) << 3) | 2);
                k(bArr.length);
                this.f59767a.write(bArr);
            } else {
                na.d dVar2 = (na.d) this.f59768b.get(obj.getClass());
                if (dVar2 != null) {
                    j(dVar2, cVar, obj, z9);
                    return;
                }
                na.f fVar = (na.f) this.f59769c.get(obj.getClass());
                if (fVar != null) {
                    a8.r0 r0Var = this.f59770e;
                    r0Var.f601b = false;
                    r0Var.d = cVar;
                    r0Var.f602c = z9;
                    fVar.a(obj, r0Var);
                } else if (obj instanceof b) {
                    h(cVar, ((b) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z9);
                }
            }
        }
    }

    public final void h(na.c cVar, int i7, boolean z9) {
        if (z9 && i7 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f59724a << 3);
            k(i7);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(na.d dVar, na.c cVar, Object obj, boolean z9) {
        a8.k0 k0Var = new a8.k0(4);
        k0Var.f501b = 0L;
        try {
            OutputStream outputStream = this.f59767a;
            this.f59767a = k0Var;
            dVar.a(obj, this);
            this.f59767a = outputStream;
            long j3 = k0Var.f501b;
            k0Var.close();
            if (z9 && j3 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j3);
            dVar.a(obj, this);
        } catch (Throwable th2) {
            try {
                k0Var.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    public final void k(int i7) {
        while ((i7 & (-128)) != 0) {
            this.f59767a.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.f59767a.write(i7 & 127);
    }

    public final void l(long j3) {
        while (((-128) & j3) != 0) {
            this.f59767a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f59767a.write(((int) j3) & 127);
    }
}
