package qc;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.p6;
import ne.p;
import ne.s;
public final class i implements oe.a {
    public static final Pattern f44803j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f44804k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f44805l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f44806m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f44807n = Pattern.compile("\\s+");
    public final f7.b f44808a;
    public final BitSet f44809b;
    public final HashMap f44810c;
    public final HashMap d;
    public p f44811e;
    public String f44812f;
    public int f44813g;
    public ke.c h;
    public ke.b f44814i;

    public i(f7.b bVar, List list, List list2) {
        k kVar;
        this.f44808a = bVar;
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
        this.f44810c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            qe.a aVar = (qe.a) it2.next();
            char e6 = aVar.e();
            char b10 = aVar.b();
            if (e6 == b10) {
                qe.a aVar2 = (qe.a) hashMap2.get(Character.valueOf(e6));
                if (aVar2 != null && aVar2.e() == aVar2.b()) {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e6);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e6), kVar);
                } else {
                    b(e6, aVar, hashMap2);
                }
            } else {
                b(e6, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.f44810c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        for (Character ch3 : keySet2) {
            bitSet.set(ch3.charValue());
        }
        this.f44809b = bitSet;
    }

    public static void b(char c3, qe.a aVar, HashMap hashMap) {
        if (((qe.a) hashMap.put(Character.valueOf(c3), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c3 + "'");
    }

    @Override
    public final void a(java.lang.String r12, ne.p r13) {
        throw new UnsupportedOperationException("Method not decompiled: qc.i.a(java.lang.String, ne.p):void");
    }

    public final String c(Pattern pattern) {
        if (this.f44813g >= this.f44812f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f44812f);
        matcher.region(this.f44813g, this.f44812f.length());
        if (!matcher.find()) {
            return null;
        }
        this.f44813g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.f44813g < this.f44812f.length()) {
            return this.f44812f.charAt(this.f44813g);
        }
        return (char) 0;
    }

    public final void e(ke.c cVar) {
        boolean z4;
        p pVar;
        HashMap hashMap = new HashMap();
        ke.c cVar2 = this.h;
        while (cVar2 != null) {
            ke.c cVar3 = cVar2.f11112e;
            if (cVar3 == cVar) {
                break;
            }
            cVar2 = cVar3;
        }
        while (cVar2 != null) {
            s sVar = cVar2.f11109a;
            char c3 = cVar2.f11110b;
            qe.a aVar = (qe.a) this.d.get(Character.valueOf(c3));
            if (cVar2.d && aVar != null) {
                char e6 = aVar.e();
                ke.c cVar4 = cVar2.f11112e;
                int i10 = 0;
                boolean z10 = false;
                while (cVar4 != null && cVar4 != cVar && cVar4 != hashMap.get(Character.valueOf(c3))) {
                    if (cVar4.f11111c && cVar4.f11110b == e6) {
                        i10 = aVar.c(cVar4, cVar2);
                        z10 = true;
                        if (i10 > 0) {
                            z4 = true;
                            break;
                        }
                    }
                    cVar4 = cVar4.f11112e;
                }
                z4 = z10;
                z10 = false;
                if (!z10) {
                    if (!z4) {
                        hashMap.put(Character.valueOf(c3), cVar2.f11112e);
                        if (!cVar2.f11111c) {
                            f(cVar2);
                        }
                    }
                    cVar2 = cVar2.f11113f;
                } else {
                    s sVar2 = cVar4.f11109a;
                    cVar4.f11114g -= i10;
                    cVar2.f11114g -= i10;
                    sVar2.f15981g = e2.c.j(sVar2.f15981g, i10, 0);
                    sVar.f15981g = e2.c.j(sVar.f15981g, i10, 0);
                    ke.c cVar5 = cVar2.f11112e;
                    while (cVar5 != null && cVar5 != cVar4) {
                        ke.c cVar6 = cVar5.f11112e;
                        f(cVar5);
                        cVar5 = cVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f15979f) != sVar) {
                        p6.b(pVar, (p) sVar.f15978e);
                    }
                    aVar.a(sVar2, sVar, i10);
                    if (cVar4.f11114g == 0) {
                        cVar4.f11109a.g();
                        f(cVar4);
                    }
                    if (cVar2.f11114g == 0) {
                        ke.c cVar7 = cVar2.f11113f;
                        sVar.g();
                        f(cVar2);
                        cVar2 = cVar7;
                    }
                }
            } else {
                cVar2 = cVar2.f11113f;
            }
        }
        while (true) {
            ke.c cVar8 = this.h;
            if (cVar8 != null && cVar8 != cVar) {
                f(cVar8);
            } else {
                return;
            }
        }
    }

    public final void f(ke.c cVar) {
        ke.c cVar2 = cVar.f11112e;
        if (cVar2 != null) {
            cVar2.f11113f = cVar.f11113f;
        }
        ke.c cVar3 = cVar.f11113f;
        if (cVar3 == null) {
            this.h = cVar2;
        } else {
            cVar3.f11112e = cVar2;
        }
    }
}
