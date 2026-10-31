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
    public static final Charset f55172f = Charset.forName("UTF-8");
    public static final ja.c f55173g = new ja.c("key", i0.a.o(sc.e.n(w.class, new s(1))));
    public static final ja.c h = new ja.c("value", i0.a.o(sc.e.n(w.class, new s(2))));
    public static final x f55174i = x.f55141b;
    public OutputStream f55175a;
    public final HashMap f55176b;
    public final HashMap f55177c;
    public final ja.d d;
    public final ma.h e = new ma.h(this, 4);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ja.d dVar) {
        this.f55175a = byteArrayOutputStream;
        this.f55176b = hashMap;
        this.f55177c = hashMap2;
        this.d = dVar;
    }

    public static int i(ja.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f55078a;
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
        this.f55175a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(ja.c cVar, Object obj, boolean z10) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    k((i(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f55172f);
                    k(bytes.length);
                    this.f55175a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    c(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f55174i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f55175a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    w wVar = (w) cVar.b(w.class);
                    if (wVar != null) {
                        k(((s) wVar).f55078a << 3);
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
                this.f55175a.write(bArr);
            } else {
                ja.d dVar = (ja.d) this.f55176b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ja.f fVar = (ja.f) this.f55177c.get(obj.getClass());
                if (fVar != null) {
                    ma.h hVar = this.e;
                    hVar.f13046b = false;
                    hVar.d = cVar;
                    hVar.f13047c = z10;
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
                k(((s) wVar).f55078a << 3);
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
            k(((s) wVar).f55078a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ja.d dVar, ja.c cVar, Object obj, boolean z10) {
        ma.b bVar = new ma.b(4);
        bVar.f13035b = 0L;
        try {
            OutputStream outputStream = this.f55175a;
            this.f55175a = bVar;
            dVar.a(obj, this);
            this.f55175a = outputStream;
            long j10 = bVar.f13035b;
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
                this.f55175a.write(i11 | 128);
                i10 >>>= 7;
            } else {
                this.f55175a.write(i11);
                return;
            }
        }
    }

    public final void l(long j10) {
        while (true) {
            int i10 = ((int) j10) & 127;
            if (((-128) & j10) != 0) {
                this.f55175a.write(i10 | 128);
                j10 >>>= 7;
            } else {
                this.f55175a.write(i10);
                return;
            }
        }
    }
}
