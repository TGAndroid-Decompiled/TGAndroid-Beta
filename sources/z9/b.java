package z9;

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ji.u4;
import ka.d;
import org.telegram.ui.Cells.p6;
import y9.a0;
import y9.a1;
import y9.a2;
import y9.b0;
import y9.b2;
import y9.c;
import y9.c0;
import y9.c2;
import y9.d0;
import y9.d2;
import y9.e;
import y9.e0;
import y9.e2;
import y9.f;
import y9.f0;
import y9.f1;
import y9.g;
import y9.g1;
import y9.h;
import y9.h0;
import y9.h1;
import y9.i;
import y9.i0;
import y9.i1;
import y9.j;
import y9.j0;
import y9.j1;
import y9.k;
import y9.k0;
import y9.k1;
import y9.l;
import y9.l0;
import y9.l1;
import y9.m;
import y9.m0;
import y9.m1;
import y9.n;
import y9.n0;
import y9.n1;
import y9.o;
import y9.o0;
import y9.o1;
import y9.p;
import y9.p0;
import y9.p1;
import y9.q;
import y9.q0;
import y9.q1;
import y9.r;
import y9.r0;
import y9.r1;
import y9.s;
import y9.s0;
import y9.s1;
import y9.t;
import y9.t0;
import y9.t1;
import y9.u;
import y9.u0;
import y9.u1;
import y9.v;
import y9.v0;
import y9.v1;
import y9.w;
import y9.w0;
import y9.w1;
import y9.x;
import y9.x0;
import y9.x1;
import y9.y;
import y9.y0;
import y9.y1;
import y9.z;
import y9.z0;
import y9.z1;
public final class b {
    public static final u4 f51377a;

    static {
        d dVar = new d();
        y9.d dVar2 = y9.d.f49722a;
        dVar.j(e2.class, dVar2);
        dVar.j(a0.class, dVar2);
        j jVar = j.f49791a;
        dVar.j(d2.class, jVar);
        dVar.j(h0.class, jVar);
        g gVar = g.f49751a;
        dVar.j(l1.class, gVar);
        dVar.j(i0.class, gVar);
        h hVar = h.f49767a;
        dVar.j(k1.class, hVar);
        dVar.j(j0.class, hVar);
        z zVar = z.f49918a;
        dVar.j(c2.class, zVar);
        dVar.j(a1.class, zVar);
        y yVar = y.f49913a;
        dVar.j(b2.class, yVar);
        dVar.j(z0.class, yVar);
        i iVar = i.f49778a;
        dVar.j(m1.class, iVar);
        dVar.j(k0.class, iVar);
        t tVar = t.f49882a;
        dVar.j(a2.class, tVar);
        dVar.j(l0.class, tVar);
        k kVar = k.f49802a;
        dVar.j(u1.class, kVar);
        dVar.j(m0.class, kVar);
        m mVar = m.f49824a;
        dVar.j(s1.class, mVar);
        dVar.j(n0.class, mVar);
        p pVar = p.f49850a;
        dVar.j(r1.class, pVar);
        dVar.j(r0.class, pVar);
        q qVar = q.f49857a;
        dVar.j(q1.class, qVar);
        dVar.j(s0.class, qVar);
        n nVar = n.f49835a;
        dVar.j(o1.class, nVar);
        dVar.j(p0.class, nVar);
        y9.b bVar = y9.b.f49693a;
        dVar.j(g1.class, bVar);
        dVar.j(b0.class, bVar);
        y9.a aVar = y9.a.f49680a;
        dVar.j(f1.class, aVar);
        dVar.j(c0.class, aVar);
        o oVar = o.f49844a;
        dVar.j(p1.class, oVar);
        dVar.j(q0.class, oVar);
        l lVar = l.f49815a;
        dVar.j(n1.class, lVar);
        dVar.j(o0.class, lVar);
        c cVar = c.f49711a;
        dVar.j(h1.class, cVar);
        dVar.j(d0.class, cVar);
        r rVar = r.f49865a;
        dVar.j(t1.class, rVar);
        dVar.j(t0.class, rVar);
        s sVar = s.f49872a;
        dVar.j(v1.class, sVar);
        dVar.j(u0.class, sVar);
        u uVar = u.f49891a;
        dVar.j(w1.class, uVar);
        dVar.j(v0.class, uVar);
        x xVar = x.f49909a;
        dVar.j(z1.class, xVar);
        dVar.j(y0.class, xVar);
        v vVar = v.f49898a;
        dVar.j(y1.class, vVar);
        dVar.j(w0.class, vVar);
        w wVar = w.f49903a;
        dVar.j(x1.class, wVar);
        dVar.j(x0.class, wVar);
        e eVar = e.f49739a;
        dVar.j(j1.class, eVar);
        dVar.j(e0.class, eVar);
        f fVar = f.f49746a;
        dVar.j(i1.class, fVar);
        dVar.j(f0.class, fVar);
        dVar.d = true;
        f51377a = new u4(dVar, 2);
    }

    public static s0 a(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f4797b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    obj.f4796a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f4798c = jsonReader.nextString();
                    break;
                case 4:
                    obj.f4799e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.l();
    }

    public static d0 b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new d0(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static b0 c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f6657i = d(jsonReader, new a(0));
                    break;
                case 1:
                    obj.f6651a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    obj.f6654e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f6655f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    obj.f6656g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f6652b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 6:
                    obj.f6653c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 7:
                    obj.h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, a aVar) {
        Object c0Var;
        char c10;
        char c11;
        String str;
        Object obj;
        char c12;
        char c13;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str2 = " name";
            String str3 = "";
            String str4 = null;
            Long l4 = null;
            String str5 = null;
            String str6 = null;
            switch (aVar.f51376a) {
                case 0:
                    jsonReader.beginObject();
                    String str7 = null;
                    String str8 = null;
                    while (jsonReader.hasNext()) {
                        String nextName = jsonReader.nextName();
                        nextName.getClass();
                        switch (nextName.hashCode()) {
                            case -609862170:
                                if (nextName.equals("libraryName")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3002454:
                                if (nextName.equals("arch")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 230943785:
                                if (nextName.equals("buildId")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                str7 = jsonReader.nextString();
                                if (str7 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null libraryName");
                                }
                            case 1:
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    str4 = nextString;
                                    break;
                                } else {
                                    throw new NullPointerException("Null arch");
                                }
                            case 2:
                                str8 = jsonReader.nextString();
                                if (str8 != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null buildId");
                                }
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str4 == null) {
                        str3 = " arch";
                    }
                    if (str7 == null) {
                        str3 = str3.concat(" libraryName");
                    }
                    if (str8 == null) {
                        str3 = p6.t(str3, " buildId");
                    }
                    if (str3.isEmpty()) {
                        c0Var = new c0(str4, str7, str8);
                        continue;
                        arrayList.add(c0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 1:
                    jsonReader.beginObject();
                    byte[] bArr = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("filename")) {
                            if (!nextName2.equals("contents")) {
                                jsonReader.skipValue();
                            } else {
                                bArr = Base64.decode(jsonReader.nextString(), 2);
                                if (bArr == null) {
                                    throw new NullPointerException("Null contents");
                                }
                            }
                        } else {
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 != null) {
                                str6 = nextString2;
                            } else {
                                throw new NullPointerException("Null filename");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (str6 == null) {
                        str3 = " filename";
                    }
                    if (bArr == null) {
                        str3 = str3.concat(" contents");
                    }
                    if (str3.isEmpty()) {
                        obj = new f0(str6, bArr);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 2:
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(13, false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -1536268810:
                                if (nextName3.equals("parameterKey")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1027290370:
                                if (nextName3.equals("templateVersion")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1098747284:
                                if (nextName3.equals("rolloutVariant")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1124454216:
                                if (nextName3.equals("parameterValue")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                String nextString3 = jsonReader.nextString();
                                if (nextString3 != null) {
                                    sVar.f6391b = nextString3;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterKey");
                                }
                            case 1:
                                sVar.f6393e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                String str9 = null;
                                String str10 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    if (!nextName4.equals("variantId")) {
                                        if (!nextName4.equals("rolloutId")) {
                                            jsonReader.skipValue();
                                        } else {
                                            str9 = jsonReader.nextString();
                                            if (str9 == null) {
                                                throw new NullPointerException("Null rolloutId");
                                            }
                                        }
                                    } else {
                                        str10 = jsonReader.nextString();
                                        if (str10 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    }
                                }
                                jsonReader.endObject();
                                if (str9 != null) {
                                    str = "";
                                } else {
                                    str = " rolloutId";
                                }
                                if (str10 == null) {
                                    str = str.concat(" variantId");
                                }
                                if (str.isEmpty()) {
                                    sVar.f6392c = new x0(str9, str10);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 3:
                                String nextString4 = jsonReader.nextString();
                                if (nextString4 != null) {
                                    sVar.d = nextString4;
                                    break;
                                } else {
                                    throw new NullPointerException("Null parameterValue");
                                }
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0Var = sVar.a();
                    continue;
                    arrayList.add(c0Var);
                case 3:
                    jsonReader.beginObject();
                    Integer num = null;
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        switch (nextName5.hashCode()) {
                            case -1266514778:
                                if (nextName5.equals("frames")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3373707:
                                if (nextName5.equals("name")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 2125650548:
                                if (nextName5.equals("importance")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                list = d(jsonReader, new a(5));
                                if (list != null) {
                                    break;
                                } else {
                                    throw new NullPointerException("Null frames");
                                }
                            case 1:
                                String nextString5 = jsonReader.nextString();
                                if (nextString5 != null) {
                                    str5 = nextString5;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case 2:
                                num = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (str5 != null) {
                        str2 = "";
                    }
                    if (num == null) {
                        str2 = str2.concat(" importance");
                    }
                    if (list == null) {
                        str2 = p6.t(str2, " frames");
                    }
                    if (str2.isEmpty()) {
                        obj = new r0(str5, num.intValue(), list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str2));
                    }
                case 4:
                    jsonReader.beginObject();
                    Long l10 = null;
                    String str11 = null;
                    String str12 = null;
                    while (jsonReader.hasNext()) {
                        String nextName6 = jsonReader.nextName();
                        nextName6.getClass();
                        switch (nextName6.hashCode()) {
                            case 3373707:
                                if (nextName6.equals("name")) {
                                    c13 = 0;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 3530753:
                                if (nextName6.equals("size")) {
                                    c13 = 1;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 3601339:
                                if (nextName6.equals("uuid")) {
                                    c13 = 2;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            case 1153765347:
                                if (nextName6.equals("baseAddress")) {
                                    c13 = 3;
                                    break;
                                }
                                c13 = 65535;
                                break;
                            default:
                                c13 = 65535;
                                break;
                        }
                        switch (c13) {
                            case 0:
                                String nextString6 = jsonReader.nextString();
                                if (nextString6 != null) {
                                    str11 = nextString6;
                                    break;
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            case 1:
                                l10 = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 2:
                                str12 = new String(Base64.decode(jsonReader.nextString(), 2), e2.f49745a);
                                break;
                            case 3:
                                l4 = Long.valueOf(jsonReader.nextLong());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (l4 == null) {
                        str3 = " baseAddress";
                    }
                    if (l10 == null) {
                        str3 = str3.concat(" size");
                    }
                    if (str11 == null) {
                        str3 = p6.t(str3, " name");
                    }
                    if (str3.isEmpty()) {
                        c0Var = new o0(str11, l4.longValue(), l10.longValue(), str12);
                        continue;
                        arrayList.add(c0Var);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                default:
                    c0Var = a(jsonReader);
                    continue;
                    arrayList.add(c0Var);
            }
            c0Var = obj;
            arrayList.add(c0Var);
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static l0 e(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        t0 t0Var;
        String str;
        char c13;
        t0 t0Var2;
        String str2;
        char c14;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i10 = 4;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = "";
            switch (c10) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                obj2.f6374a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.f6375b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 2:
                                obj2.d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 3:
                                obj2.f6378f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                obj2.f6377e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 5:
                                obj2.f6376c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.d = obj2.j();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List d = d(jsonReader, new a(2));
                            if (d != null) {
                                list = d;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        str3 = " rolloutAssignments";
                    }
                    if (str3.isEmpty()) {
                        obj.f6378f = new y0(list);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 2:
                    jsonReader.beginObject();
                    n0 n0Var = null;
                    List list2 = null;
                    t0 t0Var3 = null;
                    List list3 = null;
                    Integer num = null;
                    List list4 = null;
                    Boolean bool = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c12 = 5;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c12 = 6;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                t0Var = t0Var3;
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = DesugarCollections.unmodifiableList(arrayList);
                                t0Var3 = t0Var;
                                break;
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                p0 p0Var = null;
                                b0 b0Var = null;
                                q0 q0Var = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            t0Var2 = t0Var3;
                                            b0Var = c(jsonReader);
                                            break;
                                        case 1:
                                            t0Var2 = t0Var3;
                                            list5 = d(jsonReader, new a(3));
                                            break;
                                        case 2:
                                            jsonReader.beginObject();
                                            String str4 = null;
                                            String str5 = null;
                                            Long l4 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c14 = 0;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c14 = 1;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c14 = 2;
                                                            break;
                                                        }
                                                        c14 = 65535;
                                                        break;
                                                    default:
                                                        c14 = 65535;
                                                        break;
                                                }
                                                switch (c14) {
                                                    case 0:
                                                        l4 = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case 1:
                                                        str5 = jsonReader.nextString();
                                                        if (str5 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                    case 2:
                                                        str4 = jsonReader.nextString();
                                                        if (str4 != null) {
                                                            break;
                                                        } else {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (str4 != null) {
                                                str2 = "";
                                            } else {
                                                str2 = " name";
                                            }
                                            if (str5 == null) {
                                                str2 = str2.concat(" code");
                                            }
                                            if (l4 == null) {
                                                str2 = p6.t(str2, " address");
                                            }
                                            if (str2.isEmpty()) {
                                                t0Var2 = t0Var3;
                                                q0Var = new q0(l4.longValue(), str4, str5);
                                                break;
                                            } else {
                                                throw new IllegalStateException("Missing required properties:".concat(str2));
                                            }
                                        case 3:
                                            list6 = d(jsonReader, new a(i10));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            t0Var2 = t0Var3;
                                            break;
                                        case 4:
                                            p0Var = f(jsonReader);
                                            t0Var2 = t0Var3;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            t0Var2 = t0Var3;
                                            break;
                                    }
                                    t0Var3 = t0Var2;
                                    i10 = 4;
                                }
                                t0Var = t0Var3;
                                jsonReader.endObject();
                                if (q0Var != null) {
                                    str = "";
                                } else {
                                    str = " signal";
                                }
                                if (list6 == null) {
                                    str = str.concat(" binaries");
                                }
                                if (str.isEmpty()) {
                                    n0Var = new n0(list5, p0Var, b0Var, q0Var, list6);
                                    t0Var3 = t0Var;
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = DesugarCollections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = DesugarCollections.unmodifiableList(arrayList3);
                                break;
                            case 5:
                                num = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case 6:
                                t0Var3 = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        i10 = 4;
                    }
                    t0 t0Var4 = t0Var3;
                    jsonReader.endObject();
                    if (n0Var == null) {
                        str3 = " execution";
                    }
                    if (num == null) {
                        str3 = str3.concat(" uiOrientation");
                    }
                    if (str3.isEmpty()) {
                        obj.f6376c = new m0(n0Var, list2, list4, bool, t0Var4, list3, num.intValue());
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 3:
                    jsonReader.beginObject();
                    String str6 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str6 = nextString;
                            } else {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str6 == null) {
                        str3 = " content";
                    }
                    if (str3.isEmpty()) {
                        obj.f6377e = new v0(str6);
                        break;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str3));
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f6375b = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.f6374a = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.i();
    }

    public static p0 f(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        p0 p0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    List d = d(jsonReader, new a(5));
                    if (d != null) {
                        list = d;
                        break;
                    } else {
                        throw new NullPointerException("Null frames");
                    }
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        str2 = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    p0Var = f(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " type";
        } else {
            str = "";
        }
        if (list == null) {
            str = str.concat(" frames");
        }
        if (num == null) {
            str = p6.t(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new p0(str2, str3, list, p0Var, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static t0 g(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    obj.f9493b = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f9492a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    obj.d = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case 3:
                    obj.f9494c = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.g();
    }

    public static a0 h(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        String str;
        char c14;
        String str2;
        Charset charset = e2.f49745a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str3 = "";
            switch (c10) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str4 = jsonReader.nextString();
                            }
                        } else {
                            list = d(jsonReader, new a(1));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        str3 = " files";
                    }
                    String str5 = str3;
                    if (str5.isEmpty()) {
                        obj.h = new e0(str4, list);
                        continue;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str5));
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f47406a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.f47409e = jsonReader.nextString();
                    break;
                case 3:
                    obj.f47413j = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f47414k = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f47407b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 6:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.f47408c = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 7:
                    obj.d = jsonReader.nextString();
                    break;
                case '\b':
                    obj.f47412i = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\t':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f47410f = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case '\n':
                    ?? obj2 = new Object();
                    obj2.f49761f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c11 = 6;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c11 = 7;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c11 = '\b';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c11 = '\t';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c11 = '\n';
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c11 = 11;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                                obj2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                obj2.f49759c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f49758b = new String(Base64.decode(jsonReader.nextString(), 2), e2.f49745a);
                                break;
                            case 3:
                                obj2.f49760e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c12 = 0;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c12 = 1;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c12 = 4;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c12 = 5;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c12 = 6;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c12 = 7;
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c12 = '\b';
                                                break;
                                            }
                                            c12 = 65535;
                                            break;
                                        default:
                                            c12 = 65535;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            obj3.f6655f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            obj3.f6651a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            obj3.f6654e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            obj3.f6653c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f6652b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.f6656g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f6657i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f49764j = obj3.b();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f49765k = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.f9494c = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            obj4.d = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.f9493b = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            obj4.f9492a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f49763i = obj4.h();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str6 = null;
                                String str7 = null;
                                String str8 = null;
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c14 = 4;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c14 = 5;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            str6 = jsonReader.nextString();
                                            if (str6 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            str10 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str11 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str7 = jsonReader.nextString();
                                            if (str7 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            str9 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str8 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str6 != null) {
                                    str = "";
                                } else {
                                    str = " identifier";
                                }
                                if (str7 == null) {
                                    str = str.concat(" version");
                                }
                                if (str.isEmpty()) {
                                    obj2.f49762g = new i0(str6, str7, str8, str9, str10, str11);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str));
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str12 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str12 = jsonReader.nextString();
                                        if (str12 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str12 != null) {
                                    str2 = "";
                                } else {
                                    str2 = " identifier";
                                }
                                if (str2.isEmpty()) {
                                    obj2.h = new a1(str12);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str2));
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f49757a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f49761f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 11:
                                obj2.f49766l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.f47411g = obj2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static a0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            a0 h = h(jsonReader);
            jsonReader.close();
            return h;
        } catch (IllegalStateException e7) {
            throw new IOException(e7);
        }
    }
}
