package q1;

import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.z;
import c8.qb;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;
import m1.g1;
import m1.y0;
public final class h implements y0 {
    public static final h f53701a = new Object();

    @Override
    public final Object a() {
        return new b(true);
    }

    @Override
    public final Object b(FileInputStream fileInputStream) {
        int i7;
        byte[] bArr;
        try {
            p1.c o4 = p1.c.o(fileInputStream);
            b bVar = new b(false);
            f[] pairs = (f[]) Arrays.copyOf(new f[0], 0);
            j.e(pairs, "pairs");
            bVar.b();
            if (pairs.length <= 0) {
                Map m10 = o4.m();
                j.d(m10, "preferencesProto.preferencesMap");
                for (Map.Entry entry : m10.entrySet()) {
                    String name = (String) entry.getKey();
                    p1.h value = (p1.h) entry.getValue();
                    j.d(name, "name");
                    j.d(value, "value");
                    int C = value.C();
                    if (C == 0) {
                        i7 = -1;
                    } else {
                        i7 = g.f53700a[p1.g.c(C)];
                    }
                    switch (i7) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            bVar.e(new e(name), Boolean.valueOf(value.t()));
                            break;
                        case 2:
                            bVar.e(new e(name), Float.valueOf(value.x()));
                            break;
                        case 3:
                            bVar.e(new e(name), Double.valueOf(value.w()));
                            break;
                        case 4:
                            bVar.e(new e(name), Integer.valueOf(value.y()));
                            break;
                        case 5:
                            bVar.e(new e(name), Long.valueOf(value.z()));
                            break;
                        case 6:
                            e a10 = qb.a(name);
                            String A = value.A();
                            j.d(A, "value.string");
                            bVar.e(a10, A);
                            break;
                        case 7:
                            e b10 = qb.b(name);
                            b0 n10 = value.B().n();
                            j.d(n10, "value.stringSet.stringsList");
                            bVar.e(b10, hd.f.o(n10));
                            break;
                        case 8:
                            e eVar = new e(name);
                            androidx.datastore.preferences.protobuf.h u10 = value.u();
                            int size = u10.size();
                            if (size == 0) {
                                bArr = c0.f2157b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                u10.k(size, bArr2);
                                bArr = bArr2;
                            }
                            j.d(bArr, "value.bytes.toByteArray()");
                            bVar.e(eVar, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new b(new LinkedHashMap(bVar.a()), true);
            }
            f fVar = pairs[0];
            throw null;
        } catch (e0 e10) {
            throw new IOException("Unable to parse preferences proto.", e10);
        }
    }

    @Override
    public final void c(Object obj, g1 g1Var) {
        z a10;
        Map a11 = ((b) obj).a();
        p1.a n10 = p1.c.n();
        for (Map.Entry entry : a11.entrySet()) {
            Object value = entry.getValue();
            String str = ((e) entry.getKey()).f53699a;
            if (value instanceof Boolean) {
                p1.f D = p1.h.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D.c();
                p1.h.q((p1.h) D.f2287b, booleanValue);
                a10 = D.a();
            } else if (value instanceof Float) {
                p1.f D2 = p1.h.D();
                float floatValue = ((Number) value).floatValue();
                D2.c();
                p1.h.r((p1.h) D2.f2287b, floatValue);
                a10 = D2.a();
            } else if (value instanceof Double) {
                p1.f D3 = p1.h.D();
                double doubleValue = ((Number) value).doubleValue();
                D3.c();
                p1.h.o((p1.h) D3.f2287b, doubleValue);
                a10 = D3.a();
            } else if (value instanceof Integer) {
                p1.f D4 = p1.h.D();
                int intValue = ((Number) value).intValue();
                D4.c();
                p1.h.s((p1.h) D4.f2287b, intValue);
                a10 = D4.a();
            } else if (value instanceof Long) {
                p1.f D5 = p1.h.D();
                long longValue = ((Number) value).longValue();
                D5.c();
                p1.h.l((p1.h) D5.f2287b, longValue);
                a10 = D5.a();
            } else if (value instanceof String) {
                p1.f D6 = p1.h.D();
                D6.c();
                p1.h.m((p1.h) D6.f2287b, (String) value);
                a10 = D6.a();
            } else if (value instanceof Set) {
                p1.f D7 = p1.h.D();
                p1.d o4 = p1.e.o();
                o4.c();
                p1.e.l((p1.e) o4.f2287b, (Set) value);
                D7.c();
                p1.h.n((p1.h) D7.f2287b, (p1.e) o4.a());
                a10 = D7.a();
            } else if (value instanceof byte[]) {
                p1.f D8 = p1.h.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.h j3 = androidx.datastore.preferences.protobuf.h.j(0, bArr.length, bArr);
                D8.c();
                p1.h.p((p1.h) D8.f2287b, j3);
                a10 = D8.a();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            n10.getClass();
            str.getClass();
            n10.c();
            p1.c.l((p1.c) n10.f2287b).put(str, (p1.h) a10);
        }
        p1.c cVar = (p1.c) n10.a();
        int a12 = cVar.a(null);
        Logger logger = m.f2215f;
        if (a12 > 4096) {
            a12 = 4096;
        }
        m mVar = new m(g1Var, a12);
        cVar.b(mVar);
        if (mVar.d > 0) {
            mVar.l();
        }
    }
}
