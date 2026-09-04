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
    public static final Charset f51331f = Charset.forName("UTF-8");
    public static final ia.c f51332g = new ia.c("key", i2.g.n(w.f.k(w.class, new s(1))));
    public static final ia.c h = new ia.c("value", i2.g.n(w.f.k(w.class, new s(2))));
    public static final x f51333i = x.f51314b;
    public OutputStream f51334a;
    public final HashMap f51335b;
    public final HashMap f51336c;
    public final ia.d d;
    public final la.h f51337e = new la.h(this, 4);

    public y(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, ia.d dVar) {
        this.f51334a = byteArrayOutputStream;
        this.f51335b = hashMap;
        this.f51336c = hashMap2;
        this.d = dVar;
    }

    public static int i(ia.c cVar) {
        w wVar = (w) cVar.b(w.class);
        if (wVar != null) {
            return ((s) wVar).f51229a;
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
        this.f51334a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
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
                    byte[] bytes = charSequence.toString().getBytes(f51331f);
                    k(bytes.length);
                    this.f51334a.write(bytes);
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    d(cVar, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    j(f51333i, cVar, entry, false);
                }
            } else if (obj instanceof Double) {
                b(cVar, ((Double) obj).doubleValue(), z10);
            } else if (obj instanceof Float) {
                float floatValue = ((Float) obj).floatValue();
                if (!z10 || floatValue != 0.0f) {
                    k((i(cVar) << 3) | 5);
                    this.f51334a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
                }
            } else if (obj instanceof Number) {
                long longValue = ((Number) obj).longValue();
                if (!z10 || longValue != 0) {
                    w wVar = (w) cVar.b(w.class);
                    if (wVar != null) {
                        k(((s) wVar).f51229a << 3);
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
                this.f51334a.write(bArr);
            } else {
                ia.d dVar = (ia.d) this.f51335b.get(obj.getClass());
                if (dVar != null) {
                    j(dVar, cVar, obj, z10);
                    return;
                }
                ia.f fVar = (ia.f) this.f51336c.get(obj.getClass());
                if (fVar != null) {
                    la.h hVar = this.f51337e;
                    hVar.f15334b = false;
                    hVar.d = cVar;
                    hVar.f15335c = z10;
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
    public final ia.e e(ia.c cVar, int i10) {
        h(cVar, i10, true);
        return this;
    }

    @Override
    public final ia.e f(ia.c cVar, long j3) {
        if (j3 != 0) {
            w wVar = (w) cVar.b(w.class);
            if (wVar != null) {
                k(((s) wVar).f51229a << 3);
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
            k(((s) wVar).f51229a << 3);
            k(i10);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void j(ia.d dVar, ia.c cVar, Object obj, boolean z10) {
        la.b bVar = new la.b(4);
        bVar.f15322b = 0L;
        try {
            OutputStream outputStream = this.f51334a;
            this.f51334a = bVar;
            dVar.a(obj, this);
            this.f51334a = outputStream;
            long j3 = bVar.f15322b;
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
                this.f51334a.write(i11 | 128);
                i10 >>>= 7;
            } else {
                this.f51334a.write(i11);
                return;
            }
        }
    }

    public final void l(long j3) {
        while (true) {
            int i10 = ((int) j3) & 127;
            if (((-128) & j3) != 0) {
                this.f51334a.write(i10 | 128);
                j3 >>>= 7;
            } else {
                this.f51334a.write(i10);
                return;
            }
        }
    }
}
