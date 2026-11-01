package z7;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public final class y implements ja.e {
    public static final Charset f55190f = Charset.forName("UTF-8");
    public static final ja.c f55191g = new ja.c("key", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c h = new ja.c("value", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final x f55192i = x.f55159b;
    public OutputStream f55193a;
    public final HashMap f55194b;
    public final HashMap f55195c;
    public final ja.d d;
    public final ma.h e = new ma.h(this, 4);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ja.d dVar) {
        this.f55193a = byteArrayOutputStream;
        this.f55194b = hashMap;
        this.f55195c = hashMap2;
        this.d = dVar;
    }

    public static int i(ja.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f55096a;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    @Override
    public final ja.e a(ja.c cVar, boolean z10) {
        h(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void b(ja.c cVar, double d, boolean z10) {
        if (z10 && d == 0.0d) {
            return;
        }
        k((i(cVar) << 3) | 1);
        this.f55193a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ja.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f55190f);
                    k(bytes.length);
                    this.f55193a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f55192i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f55193a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    w wVar = (w) cVar.b(w.class);
                    if (wVar != null) {
                        k(((s) wVar).f55096a << 3);
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
                this.f55193a.write(bArr);
            } else {
                ja.d dVar = (ja.d) this.f55194b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ja.f fVar = (ja.f) this.f55195c.get(obj.getClass());
                if (fVar != null) {
                    ma.h hVar = this.e;
                    hVar.f13047b = false;
                    hVar.d = cVar;
                    hVar.f13048c = z10;
                    fVar.a(obj, hVar);
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
    public final ja.e d(ja.c cVar, Object obj) {
        c(cVar, obj, true);
        return this;
    }

    @Override
    public final ja.e e(ja.c cVar, double d) {
        b(cVar, d, true);
        return this;
    }

    @Override
    public final ja.e f(ja.c cVar, long j10) {
        if (j10 != 0) {
            w wVar = (w) cVar.b(w.class);
            if (wVar != null) {
                k(((s) wVar).f55096a << 3);
                l(j10);
                return this;
            }
            throw new RuntimeException("Field has no @Protobuf config");
        }
        return this;
    }

    @Override
    public final ja.e g(ja.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    public final void h(ja.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return;
        }
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            k(((s) wVar).f55096a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ja.d dVar, ja.c cVar, Object obj, boolean z10) {
        ma.b bVar = new ma.b(4);
        bVar.f13036b = 0L;
        try {
            OutputStream outputStream = this.f55193a;
            this.f55193a = bVar;
            dVar.a(obj, this);
            this.f55193a = outputStream;
            long j10 = bVar.f13036b;
            bVar.close();
            if (z10 && j10 == 0) {
                return;
            }
            k((i(cVar) << 3) | 2);
            l(j10);
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
                this.f55193a.write(i11 | 128);
                i10 >>>= 7;
            } else {
                this.f55193a.write(i11);
                return;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) != 0) {
                this.f55193a.write(i10 | 128);
                j10 >>>= 7;
            } else {
                this.f55193a.write(i10);
                return;
            }
        }
    }
}
