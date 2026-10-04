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
import n7.z0;
public final class h implements cf.a {
    public static final Pattern f50890i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f50891j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f50892k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f50893l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f50894m = Pattern.compile("`+");
    public static final Pattern f50895n = Pattern.compile("^`+");
    public static final Pattern f50896o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f50897p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f50898q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f50899r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f50900s = Pattern.compile("\\s+");
    public static final Pattern f50901t = Pattern.compile(" *$");
    public final BitSet f50902a;
    public final BitSet f50903b;
    public final HashMap f50904c;
    public final z0 d;
    public String f50905e;
    public int f50906f;
    public b f50907g;
    public f6.f h;

    public h(z0 z0Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new ze.a(0), new ze.a(1)), hashMap);
        c((List) z0Var.f16847b, hashMap);
        this.f50904c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f50903b = bitSet;
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
        this.f50902a = bitSet2;
        this.d = z0Var;
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
            char e7 = aVar.e();
            char a2 = aVar.a();
            if (e7 == a2) {
                ef.a aVar2 = (ef.a) hashMap.get(Character.valueOf(e7));
                if (aVar2 != null && aVar2.e() == aVar2.a()) {
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
                b(a2, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append(sVar.f3836g);
            p pVar = (p) sVar2.f3834f;
            for (p pVar2 = (p) sVar.f3834f; pVar2 != pVar; pVar2 = (p) pVar2.f3834f) {
                sb2.append(((s) pVar2).f3836g);
                pVar2.g();
            }
            sVar.f3836g = sb2.toString();
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
                i10 = sVar2.f3836g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (p) pVar.f3834f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, bf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ye.h.a(java.lang.String, bf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f50906f >= this.f50905e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f50905e);
        matcher.region(this.f50906f, this.f50905e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f50906f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f50906f < this.f50905e.length()) {
            return this.f50905e.charAt(this.f50906f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f50907g;
        while (bVar2 != null) {
            b bVar3 = bVar2.f50860e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f50857a;
            char c10 = bVar2.f50858b;
            ef.a aVar = (ef.a) this.f50904c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e7 = aVar.e();
                b bVar4 = bVar2.f50860e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f50859c && bVar4.f50858b == e7) {
                        i10 = aVar.b(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.f50860e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.f50860e);
                        if (!bVar2.f50859c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f50861f;
                } else {
                    s sVar2 = bVar4.f50857a;
                    bVar4.f50862g -= i10;
                    bVar2.f50862g -= i10;
                    sVar2.f3836g = e2.i(i10, 0, sVar2.f3836g);
                    sVar.f3836g = e2.i(i10, 0, sVar.f3836g);
                    b bVar5 = bVar2.f50860e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.f50860e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f3834f) != sVar) {
                        f(pVar, (p) sVar.f3833e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (bVar4.f50862g == 0) {
                        bVar4.f50857a.g();
                        i(bVar4);
                    }
                    if (bVar2.f50862g == 0) {
                        b bVar7 = bVar2.f50861f;
                        sVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f50861f;
            }
        }
        while (true) {
            b bVar8 = this.f50907g;
            if (bVar8 != null && bVar8 != bVar) {
                i(bVar8);
            } else {
                return;
            }
        }
    }

    public final void i(b bVar) {
        b bVar2 = bVar.f50860e;
        if (bVar2 != null) {
            bVar2.f50861f = bVar.f50861f;
        }
        b bVar3 = bVar.f50861f;
        if (bVar3 == null) {
            this.f50907g = bVar2;
        } else {
            bVar3.f50860e = bVar2;
        }
    }
}
