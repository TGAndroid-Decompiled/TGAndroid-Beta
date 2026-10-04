package x7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class e0 implements ia.e {
    public static final Charset f49445f = Charset.forName("UTF-8");
    public static final ia.c f49446g = new ia.c("key", hg.k0.m(t8.b.n(c0.class, new z(1))));
    public static final ia.c h = new ia.c("value", hg.k0.m(t8.b.n(c0.class, new z(2))));
    public static final d0 f49447i = d0.f49427b;
    public OutputStream f49448a;
    public final HashMap f49449b;
    public final HashMap f49450c;
    public final ia.d d;
    public final la.i f49451e = new la.i(this, 3);

    public e0(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ia.d dVar) {
        this.f49448a = byteArrayOutputStream;
        this.f49449b = hashMap;
        this.f49450c = hashMap2;
        this.d = dVar;
    }

    public static int i(ia.c cVar) {
        c0 c0Var = (c0) cVar.b(c0.class);
        if (c0Var != null) {
            return ((z) c0Var).f49749a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ia.e a(ia.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final void b(ia.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f49448a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override
    public final ia.e c(ia.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void d(ia.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f49445f);
                    k(bytes.length);
                    this.f49448a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    d(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f49447i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f49448a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    c0 c0Var = (c0) cVar.b(c0.class);
                    if (c0Var != null) {
                        k(((z) c0Var).f49749a << 3);
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
                this.f49448a.write(bArr);
            } else {
                ia.d dVar = (ia.d) this.f49449b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ia.f fVar = (ia.f) this.f49450c.get(obj.getClass());
                if (fVar != null) {
                    la.i iVar = this.f49451e;
                    iVar.f15400b = false;
                    iVar.d = cVar;
                    iVar.f15401c = z10;
                    fVar.a(obj, iVar);
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
    public final ia.e e(ia.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final ia.e f(ia.c cVar, long j3) {
        if (j3 != 0) {
            c0 c0Var = (c0) cVar.b(c0.class);
            if (c0Var != null) {
                k(((z) c0Var).f49749a << 3);
                l(j3);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final ia.e g(ia.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ia.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        c0 c0Var = (c0) cVar.b(c0.class);
        if (c0Var != null) {
            k(((z) c0Var).f49749a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ia.d dVar, ia.c cVar, Object obj, boolean z10) {
        la.b bVar = new la.b(3);
        bVar.f15385b = 0L;
        try {
            OutputStream outputStream = this.f49448a;
            this.f49448a = bVar;
            dVar.a(obj, this);
            this.f49448a = outputStream;
            long j3 = bVar.f15385b;
            bVar.close();
            if (z10 && j3 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j3);
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
        while (true) {
            int i11 = ((i10 & (-128)) > 0L ? 1 : ((i10 & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f49448a;
            if (i11 != 0) {
                outputStream.write((i10 & 127) | 128);
                i10 >>>= 7;
            } else {
                outputStream.write(i10 & 127);
                return;
            }
        }
    }

    public final void l(long j3) {
        while (true) {
            int i10 = (((-128) & j3) > 0L ? 1 : (((-128) & j3) == 0L ? 0 : -1));
            OutputStream outputStream = this.f49448a;
            if (i10 != 0) {
                outputStream.write((((int) j3) & 127) | 128);
                j3 >>>= 7;
            } else {
                outputStream.write(((int) j3) & 127);
                return;
            }
        }
    }
}
