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
    public static final Pattern f46995i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f46996j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f46997k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f46998l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f46999m = Pattern.compile("`+");
    public static final Pattern f47000n = Pattern.compile("^`+");
    public static final Pattern f47001o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f47002p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f47003q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f47004r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f47005s = Pattern.compile("\\s+");
    public static final Pattern f47006t = Pattern.compile(" *$");
    public final BitSet f47007a;
    public final BitSet f47008b;
    public final HashMap f47009c;
    public final z0 d;
    public String e;
    public int f47010f;
    public b f47011g;
    public f6.f h;

    public h(z0 z0Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new ze.a(0), new ze.a(1)), hashMap);
        c((List) z0Var.f15367b, hashMap);
        this.f47009c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f47008b = bitSet;
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
        this.f47007a = bitSet2;
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
            sb2.append(sVar.f3556g);
            p pVar = (p) sVar2.f3554f;
            for (p pVar2 = (p) sVar.f3554f; pVar2 != pVar; pVar2 = (p) pVar2.f3554f) {
                sb2.append(((s) pVar2).f3556g);
                pVar2.g();
            }
            sVar.f3556g = sb2.toString();
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
                i10 = sVar2.f3556g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (p) pVar.f3554f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, bf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ye.h.a(java.lang.String, bf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f47010f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f47010f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f47010f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f47010f < this.e.length()) {
            return this.e.charAt(this.f47010f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f47011g;
        while (bVar2 != null) {
            b bVar3 = bVar2.e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f46965a;
            char c10 = bVar2.f46966b;
            ef.a aVar = (ef.a) this.f47009c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e = aVar.e();
                b bVar4 = bVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f46967c && bVar4.f46966b == e) {
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
                        if (!bVar2.f46967c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f46968f;
                } else {
                    s sVar2 = bVar4.f46965a;
                    bVar4.f46969g -= i10;
                    bVar2.f46969g -= i10;
                    sVar2.f3556g = e2.i(i10, 0, sVar2.f3556g);
                    sVar.f3556g = e2.i(i10, 0, sVar.f3556g);
                    b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f3554f) != sVar) {
                        f(pVar, (p) sVar.e);
                    }
                    aVar.d(sVar2, sVar, i10);
                    if (bVar4.f46969g == 0) {
                        bVar4.f46965a.g();
                        i(bVar4);
                    }
                    if (bVar2.f46969g == 0) {
                        b bVar7 = bVar2.f46968f;
                        sVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f46968f;
            }
        }
        while (true) {
            b bVar8 = this.f47011g;
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
            bVar2.f46968f = bVar.f46968f;
        }
        b bVar3 = bVar.f46968f;
        if (bVar3 == null) {
            this.f47011g = bVar2;
        } else {
            bVar3.e = bVar2;
        }
    }
}
