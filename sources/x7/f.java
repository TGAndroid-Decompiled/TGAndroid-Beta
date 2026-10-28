package x7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.Components.b10;
public final class f implements ka.e {
    public static final Charset f51508f = Charset.forName("UTF-8");
    public static final ka.c f51509g = new ka.c("key", ic.a.m(b10.n(d.class, new a(1))));
    public static final ka.c h = new ka.c("value", ic.a.m(b10.n(d.class, new a(2))));
    public static final e f51510i = e.f51497b;
    public OutputStream f51511a;
    public final HashMap f51512b;
    public final HashMap f51513c;
    public final ka.d d;
    public final a8.i0 e = new a8.i0(this, 3);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ka.d dVar) {
        this.f51511a = byteArrayOutputStream;
        this.f51512b = hashMap;
        this.f51513c = hashMap2;
        this.d = dVar;
    }

    public static int i(ka.c cVar) {
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            return ((a) dVar).f51470a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ka.e a(ka.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    public final void b(ka.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f51511a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ka.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f51508f);
                    k(bytes.length);
                    this.f51511a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f51510i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f51511a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    d dVar = (d) cVar.b(d.class);
                    if (dVar != null) {
                        k(((a) dVar).f51470a << 3);
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
                this.f51511a.write(bArr);
            } else {
                ka.d dVar2 = (ka.d) this.f51512b.get(obj.getClass());
                if (dVar2 != null) {
                    j(dVar2, cVar, obj, z10);
                    return;
                }
                ka.f fVar = (ka.f) this.f51513c.get(obj.getClass());
                if (fVar != null) {
                    a8.i0 i0Var = this.e;
                    i0Var.f539b = false;
                    i0Var.d = cVar;
                    i0Var.f540c = z10;
                    fVar.a(obj, i0Var);
                } else if (obj instanceof b) {
                    h(cVar, ((b) obj).zza(), true);
                } else if (obj instanceof Enum) {
                    h(cVar, ((Enum) obj).ordinal(), true);
                } else {
                    j(this.d, cVar, obj, z10);
                }
            }
        }
    }

    @Override
    public final ka.e d(ka.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    @Override
    public final ka.e e(ka.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final ka.e f(ka.c cVar, long j10) {
        if (j10 != 0) {
            d dVar = (d) cVar.b(d.class);
            if (dVar != null) {
                k(((a) dVar).f51470a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final ka.e g(ka.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    public final void h(ka.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) cVar.b(d.class);
        if (dVar != null) {
            k(((a) dVar).f51470a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ka.d dVar, ka.c cVar, Object obj, boolean z10) {
        a8.b0 b0Var = new a8.b0(3);
        b0Var.f367b = 0L;
        try {
            OutputStream outputStream = this.f51511a;
            this.f51511a = b0Var;
            dVar.a(obj, this);
            this.f51511a = outputStream;
            long j10 = b0Var.f367b;
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

    public final void k(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f51511a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f51511a.write(i10 & 127);
    }

    public final void l(long j10) {
        while (((-128) & j10) != 0) {
            this.f51511a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f51511a.write(((int) j10) & 127);
    }
}
