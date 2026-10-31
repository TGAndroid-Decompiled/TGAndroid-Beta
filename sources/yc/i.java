package yc;

import c3.i0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve.r;
import w7.h9;
public final class i implements we.a {
    public static final Pattern f54377j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f54378k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f54379l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f54380m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f54381n = Pattern.compile("\\s+");
    public final m5.e f54382a;
    public final BitSet f54383b;
    public final HashMap f54384c;
    public final HashMap d;
    public df.c e;
    public String f54385f;
    public int f54386g;
    public se.b h;
    public f6.f f54387i;

    public i(m5.e eVar, List list, List list2) {
        k kVar;
        this.f54382a = eVar;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            char d = hVar.d();
            List list3 = (List) hashMap.get(Character.valueOf(d));
            if (list3 == null) {
                list3 = new ArrayList(1);
                hashMap.put(Character.valueOf(d), list3);
            }
            list3.add(hVar);
        }
        this.f54384c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ye.a aVar = (ye.a) it2.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                ye.a aVar2 = (ye.a) hashMap2.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e), kVar);
                } else {
                    b(e, aVar, hashMap2);
                }
            } else {
                b(e, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f54384c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f54383b = bitSet;
    }

    public static void b(char c10, ye.a aVar, HashMap hashMap) {
        if (((ye.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    @Override
    public final void a(java.lang.String r12, df.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: yc.i.a(java.lang.String, df.c):void");
    }

    public final String c(Pattern pattern) {
        if (this.f54386g >= this.f54385f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f54385f);
        matcher.region(this.f54386g, this.f54385f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f54386g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f54386g < this.f54385f.length()) {
            return this.f54385f.charAt(this.f54386g);
        }
        return (char) 0;
    }

    public final void e(se.b bVar) {
        boolean z10;
        df.c cVar;
        HashMap hashMap = new HashMap();
        se.b bVar2 = this.h;
        while (bVar2 != null) {
            se.b bVar3 = bVar2.e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            r rVar = bVar2.f48188a;
            char c10 = bVar2.f48189b;
            ye.a aVar = (ye.a) this.d.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e = aVar.e();
                se.b bVar4 = bVar2.e;
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
                            f(bVar2);
                        }
                    }
                    bVar2 = bVar2.f48191f;
                } else {
                    r rVar2 = bVar4.f48188a;
                    bVar4.f48192g -= i10;
                    bVar2.f48192g -= i10;
                    rVar2.f50811g = i0.m(i10, 0, rVar2.f50811g);
                    rVar.f50811g = i0.m(i10, 0, rVar.f50811g);
                    se.b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        se.b bVar6 = bVar5.e;
                        f(bVar5);
                        bVar5 = bVar6;
                    }
                    if (rVar2 != rVar && (cVar = (df.c) rVar2.f5879f) != rVar) {
                        h9.b(cVar, (df.c) rVar.e);
                    }
                    aVar.c(rVar2, rVar, i10);
                    if (bVar4.f48192g == 0) {
                        bVar4.f48188a.g();
                        f(bVar4);
                    }
                    if (bVar2.f48192g == 0) {
                        se.b bVar7 = bVar2.f48191f;
                        rVar.g();
                        f(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f48191f;
            }
        }
        while (true) {
            se.b bVar8 = this.h;
            if (bVar8 != null && bVar8 != bVar) {
                f(bVar8);
            } else {
                return;
            }
        }
    }

    public final void f(se.b bVar) {
        se.b bVar2 = bVar.e;
        if (bVar2 != null) {
            bVar2.f48191f = bVar.f48191f;
        }
        se.b bVar3 = bVar.f48191f;
        if (bVar3 == null) {
            this.h = bVar2;
        } else {
            bVar3.e = bVar2;
        }
    }
}
