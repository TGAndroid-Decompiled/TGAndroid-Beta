package se;

import c3.i0;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve.r;
public final class h implements we.a {
    public static final Pattern f48218i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f48219j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f48220k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f48221l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f48222m = Pattern.compile("`+");
    public static final Pattern f48223n = Pattern.compile("^`+");
    public static final Pattern f48224o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f48225p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f48226q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f48227r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f48228s = Pattern.compile("\\s+");
    public static final Pattern f48229t = Pattern.compile(" *$");
    public final BitSet f48230a;
    public final BitSet f48231b;
    public final HashMap f48232c;
    public final m5.e d;
    public String e;
    public int f48233f;
    public b f48234g;
    public f6.f h;

    public h(m5.e eVar) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new te.a(0), new te.a(1)), hashMap);
        c((List) eVar.f13013b, hashMap);
        this.f48232c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f48231b = bitSet;
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
        this.f48230a = bitSet2;
        this.d = eVar;
    }

    public static void b(char c10, ye.a aVar, HashMap hashMap) {
        if (((ye.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        n nVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ye.a aVar = (ye.a) it.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                ye.a aVar2 = (ye.a) hashMap.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof n) {
                        nVar = (n) aVar2;
                    } else {
                        n nVar2 = new n(e);
                        nVar2.f(aVar2);
                        nVar = nVar2;
                    }
                    nVar.f(aVar);
                    hashMap.put(Character.valueOf(e), nVar);
                } else {
                    b(e, aVar, hashMap);
                }
            } else {
                b(e, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(r rVar, r rVar2, int i10) {
        if (rVar != null && rVar2 != null && rVar != rVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(rVar.f50811g);
            df.c cVar = (df.c) rVar2.f5879f;
            for (df.c cVar2 = (df.c) rVar.f5879f; cVar2 != cVar; cVar2 = (df.c) cVar2.f5879f) {
                sb2.append(((r) cVar2).f50811g);
                cVar2.g();
            }
            rVar.f50811g = sb2.toString();
        }
    }

    public static void f(df.c cVar, df.c cVar2) {
        r rVar = null;
        r rVar2 = null;
        int i10 = 0;
        while (cVar != null) {
            if (cVar instanceof r) {
                rVar2 = (r) cVar;
                if (rVar == null) {
                    rVar = rVar2;
                }
                i10 = rVar2.f50811g.length() + i10;
            } else {
                e(rVar, rVar2, i10);
                rVar = null;
                rVar2 = null;
                i10 = 0;
            }
            if (cVar == cVar2) {
                break;
            }
            cVar = (df.c) cVar.f5879f;
        }
        e(rVar, rVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, df.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: se.h.a(java.lang.String, df.c):void");
    }

    public final String d(Pattern pattern) {
        if (this.f48233f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f48233f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f48233f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f48233f < this.e.length()) {
            return this.e.charAt(this.f48233f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        df.c cVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f48234g;
        while (bVar2 != null) {
            b bVar3 = bVar2.e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            r rVar = bVar2.f48188a;
            char c10 = bVar2.f48189b;
            ye.a aVar = (ye.a) this.f48232c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e = aVar.e();
                b bVar4 = bVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f48190c && bVar4.f48189b == e) {
                        i10 = aVar.a(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.e);
                        if (!bVar2.f48190c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f48191f;
                } else {
                    r rVar2 = bVar4.f48188a;
                    bVar4.f48192g -= i10;
                    bVar2.f48192g -= i10;
                    rVar2.f50811g = i0.m(i10, 0, rVar2.f50811g);
                    rVar.f50811g = i0.m(i10, 0, rVar.f50811g);
                    b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (rVar2 != rVar && (cVar = (df.c) rVar2.f5879f) != rVar) {
                        f(cVar, (df.c) rVar.e);
                    }
                    aVar.c(rVar2, rVar, i10);
                    if (bVar4.f48192g == 0) {
                        bVar4.f48188a.g();
                        i(bVar4);
                    }
                    if (bVar2.f48192g == 0) {
                        b bVar7 = bVar2.f48191f;
                        rVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f48191f;
            }
        }
        while (true) {
            b bVar8 = this.f48234g;
            if (bVar8 != null && bVar8 != bVar) {
                i(bVar8);
            } else {
                return;
            }
        }
    }

    public final void i(b bVar) {
        b bVar2 = bVar.e;
        if (bVar2 != null) {
            bVar2.f48191f = bVar.f48191f;
        }
        b bVar3 = bVar.f48191f;
        if (bVar3 == null) {
            this.f48234g = bVar2;
        } else {
            bVar3.e = bVar2;
        }
    }
}
