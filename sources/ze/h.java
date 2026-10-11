package ze;

import cf.p;
import cf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.z0;
public final class h implements df.a {
    public static final Pattern f54524i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f54525j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f54526k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f54527l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f54528m = Pattern.compile("`+");
    public static final Pattern f54529n = Pattern.compile("^`+");
    public static final Pattern f54530o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f54531p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f54532q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f54533r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f54534s = Pattern.compile("\\s+");
    public static final Pattern f54535t = Pattern.compile(" *$");
    public final BitSet f54536a;
    public final BitSet f54537b;
    public final HashMap f54538c;
    public final z0 d;
    public String f54539e;
    public int f54540f;
    public b f54541g;
    public f6.f h;

    public h(z0 z0Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new af.a(0), new af.a(1)), hashMap);
        c((List) z0Var.f16905b, hashMap);
        this.f54538c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f54537b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f54536a = bitSet2;
        this.d = z0Var;
    }

    public static void b(char c10, ff.a aVar, HashMap hashMap) {
        if (((ff.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        n nVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ff.a aVar = (ff.a) it.next();
            char e7 = aVar.e();
            char c10 = aVar.c();
            if (e7 == c10) {
                ff.a aVar2 = (ff.a) hashMap.get(Character.valueOf(e7));
                if (aVar2 != null && aVar2.e() == aVar2.c()) {
                    if (aVar2 instanceof n) {
                        nVar = (n) aVar2;
                    } else {
                        n nVar2 = new n(e7);
                        nVar2.f(aVar2);
                        nVar = nVar2;
                    }
                    nVar.f(aVar);
                    hashMap.put(Character.valueOf(e7), nVar);
                } else {
                    b(e7, aVar, hashMap);
                }
            } else {
                b(e7, aVar, hashMap);
                b(c10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f4656g);
            p pVar = (p) sVar2.f4654f;
            for (p pVar2 = (p) sVar.f4654f; pVar2 != pVar; pVar2 = (p) pVar2.f4654f) {
                sb2.append(((s) pVar2).f4656g);
                pVar2.g();
            }
            sVar.f4656g = sb2.toString();
        }
    }

    public static void f(p pVar, p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.f4656g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (p) pVar.f4654f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, cf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ze.h.a(java.lang.String, cf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f54540f >= this.f54539e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f54539e);
        matcher.region(this.f54540f, this.f54539e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f54540f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f54540f < this.f54539e.length()) {
            return this.f54539e.charAt(this.f54540f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f54541g;
        while (bVar2 != null) {
            b bVar3 = bVar2.f54494e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f54491a;
            char c10 = bVar2.f54492b;
            ff.a aVar = (ff.a) this.f54538c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e7 = aVar.e();
                b bVar4 = bVar2.f54494e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f54493c && bVar4.f54492b == e7) {
                        i10 = aVar.a(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.f54494e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.f54494e);
                        if (!bVar2.f54493c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f54495f;
                } else {
                    s sVar2 = bVar4.f54491a;
                    bVar4.f54496g -= i10;
                    bVar2.f54496g -= i10;
                    sVar2.f4656g = e2.i(i10, 0, sVar2.f4656g);
                    sVar.f4656g = e2.i(i10, 0, sVar.f4656g);
                    b bVar5 = bVar2.f54494e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.f54494e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f4654f) != sVar) {
                        f(pVar, (p) sVar.f4653e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (bVar4.f54496g == 0) {
                        bVar4.f54491a.g();
                        i(bVar4);
                    }
                    if (bVar2.f54496g == 0) {
                        b bVar7 = bVar2.f54495f;
                        sVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f54495f;
            }
        }
        while (true) {
            b bVar8 = this.f54541g;
            if (bVar8 != null && bVar8 != bVar) {
                i(bVar8);
            } else {
                return;
            }
        }
    }

    public final void i(b bVar) {
        b bVar2 = bVar.f54494e;
        if (bVar2 != null) {
            bVar2.f54495f = bVar.f54495f;
        }
        b bVar3 = bVar.f54495f;
        if (bVar3 == null) {
            this.f54541g = bVar2;
        } else {
            bVar3.f54494e = bVar2;
        }
    }
}
