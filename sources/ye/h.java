package ye;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n7.a1;
public final class h implements cf.a {
    public static final Pattern f46890i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f46891j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f46892k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f46893l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f46894m = Pattern.compile("`+");
    public static final Pattern f46895n = Pattern.compile("^`+");
    public static final Pattern f46896o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f46897p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f46898q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f46899r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f46900s = Pattern.compile("\\s+");
    public static final Pattern f46901t = Pattern.compile(" *$");
    public final BitSet f46902a;
    public final BitSet f46903b;
    public final HashMap f46904c;
    public final a1 d;
    public String e;
    public int f46905f;
    public b f46906g;
    public f6.f h;

    public h(a1 a1Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new ze.a(0), new ze.a(1)), hashMap);
        c((List) a1Var.f13938b, hashMap);
        this.f46904c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f46903b = bitSet;
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
        this.f46902a = bitSet2;
        this.d = a1Var;
    }

    public static void b(char c10, ef.a aVar, HashMap hashMap) {
        if (((ef.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        n nVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ef.a aVar = (ef.a) it.next();
            char e = aVar.e();
            char a2 = aVar.a();
            if (e == a2) {
                ef.a aVar2 = (ef.a) hashMap.get(Character.valueOf(e));
                if (aVar2 != null && aVar2.e() == aVar2.a()) {
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
                b(a2, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f2249g);
            p pVar = (p) sVar2.f2247f;
            for (p pVar2 = (p) sVar.f2247f; pVar2 != pVar; pVar2 = (p) pVar2.f2247f) {
                sb2.append(((s) pVar2).f2249g);
                pVar2.g();
            }
            sVar.f2249g = sb2.toString();
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
                i10 = sVar2.f2249g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (p) pVar.f2247f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, bf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ye.h.a(java.lang.String, bf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f46905f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f46905f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f46905f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f46905f < this.e.length()) {
            return this.e.charAt(this.f46905f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f46906g;
        while (bVar2 != null) {
            b bVar3 = bVar2.e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f46860a;
            char c10 = bVar2.f46861b;
            ef.a aVar = (ef.a) this.f46904c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e = aVar.e();
                b bVar4 = bVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f46862c && bVar4.f46861b == e) {
                        i10 = aVar.b(bVar4, bVar2);
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
                        if (!bVar2.f46862c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f46863f;
                } else {
                    s sVar2 = bVar4.f46860a;
                    bVar4.f46864g -= i10;
                    bVar2.f46864g -= i10;
                    sVar2.f2249g = e2.h(i10, 0, sVar2.f2249g);
                    sVar.f2249g = e2.h(i10, 0, sVar.f2249g);
                    b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f2247f) != sVar) {
                        f(pVar, (p) sVar.e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (bVar4.f46864g == 0) {
                        bVar4.f46860a.g();
                        i(bVar4);
                    }
                    if (bVar2.f46864g == 0) {
                        b bVar7 = bVar2.f46863f;
                        sVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f46863f;
            }
        }
        while (true) {
            b bVar8 = this.f46906g;
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
            bVar2.f46863f = bVar.f46863f;
        }
        b bVar3 = bVar.f46863f;
        if (bVar3 == null) {
            this.f46906g = bVar2;
        } else {
            bVar3.e = bVar2;
        }
    }
}
