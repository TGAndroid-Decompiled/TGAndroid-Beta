package z7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class y implements ia.e {
    public static final Charset f49077f = Charset.forName("UTF-8");
    public static final ia.c f49078g = new ia.c("key", hg.c.m(v7.j.m(w.class, new s(1))));
    public static final ia.c h = new ia.c("value", hg.c.m(v7.j.m(w.class, new s(2))));
    public static final x f49079i = x.f49061b;
    public OutputStream f49080a;
    public final HashMap f49081b;
    public final HashMap f49082c;
    public final ia.d d;
    public final la.i e = new la.i(this, 4);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ia.d dVar) {
        this.f49080a = byteArrayOutputStream;
        this.f49081b = hashMap;
        this.f49082c = hashMap2;
        this.d = dVar;
    }

    public static int i(ia.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f48981a;
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
        this.f49080a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
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
                    byte[] bytes = charSequence.toString().getBytes(f49077f);
                    k(bytes.length);
                    this.f49080a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    d(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f49079i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f49080a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    w wVar = (w) cVar.b(w.class);
                    if (wVar != null) {
                        k(((s) wVar).f48981a << 3);
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
                this.f49080a.write(bArr);
            } else {
                ia.d dVar = (ia.d) this.f49081b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ia.f fVar = (ia.f) this.f49082c.get(obj.getClass());
                if (fVar != null) {
                    la.i iVar = this.e;
                    iVar.f14185b = false;
                    iVar.d = cVar;
                    iVar.f14186c = z10;
                    fVar.a(obj, iVar);
                } else if (obj instanceof u) {
                    h(cVar, ((u) obj).zza(), true);
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
            w wVar = (w) cVar.b(w.class);
            if (wVar != null) {
                k(((s) wVar).f48981a << 3);
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
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            k(((s) wVar).f48981a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ia.d dVar, ia.c cVar, Object obj, boolean z10) {
        la.b bVar = new la.b(4);
        bVar.f14171b = 0L;
        try {
            OutputStream outputStream = this.f49080a;
            this.f49080a = bVar;
            dVar.a(obj, this);
            this.f49080a = outputStream;
            long j3 = bVar.f14171b;
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
            int i11 = i10 & 127;
            if ((i10 & (-128)) != 0) {
                this.f49080a.write(i11 | 128);
                i10 >>>= 7;
            } else {
                this.f49080a.write(i11);
                return;
            }
        }
    }

    public final void l(long j3) {
        while (true) {
            int i10 = ((int) j3) & 127;
            if (((-128) & j3) != 0) {
                this.f49080a.write(i10 | 128);
                j3 >>>= 7;
            } else {
                this.f49080a.write(i10);
                return;
            }
        }
    }
}
