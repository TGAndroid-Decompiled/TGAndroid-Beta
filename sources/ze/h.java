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
    public static final Pattern f54627i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f54628j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f54629k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f54630l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f54631m = Pattern.compile("`+");
    public static final Pattern f54632n = Pattern.compile("^`+");
    public static final Pattern f54633o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f54634p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f54635q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f54636r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f54637s = Pattern.compile("\\s+");
    public static final Pattern f54638t = Pattern.compile(" *$");
    public final BitSet f54639a;
    public final BitSet f54640b;
    public final HashMap f54641c;
    public final z0 d;
    public String f54642e;
    public int f54643f;
    public b f54644g;
    public f6.f h;

    public h(z0 z0Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new af.a(0), new af.a(1)), hashMap);
        c((List) z0Var.f16572b, hashMap);
        this.f54641c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f54640b = bitSet;
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
        this.f54639a = bitSet2;
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
            sb2.append(sVar.f4655g);
            p pVar = (p) sVar2.f4653f;
            for (p pVar2 = (p) sVar.f4653f; pVar2 != pVar; pVar2 = (p) pVar2.f4653f) {
                sb2.append(((s) pVar2).f4655g);
                pVar2.g();
            }
            sVar.f4655g = sb2.toString();
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
                i10 = sVar2.f4655g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (p) pVar.f4653f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, cf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ze.h.a(java.lang.String, cf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f54643f >= this.f54642e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f54642e);
        matcher.region(this.f54643f, this.f54642e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f54643f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f54643f < this.f54642e.length()) {
            return this.f54642e.charAt(this.f54643f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f54644g;
        while (bVar2 != null) {
            b bVar3 = bVar2.f54597e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f54594a;
            char c10 = bVar2.f54595b;
            ff.a aVar = (ff.a) this.f54641c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e7 = aVar.e();
                b bVar4 = bVar2.f54597e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f54596c && bVar4.f54595b == e7) {
                        i10 = aVar.a(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.f54597e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.f54597e);
                        if (!bVar2.f54596c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f54598f;
                } else {
                    s sVar2 = bVar4.f54594a;
                    bVar4.f54599g -= i10;
                    bVar2.f54599g -= i10;
                    sVar2.f4655g = e2.i(i10, 0, sVar2.f4655g);
                    sVar.f4655g = e2.i(i10, 0, sVar.f4655g);
                    b bVar5 = bVar2.f54597e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.f54597e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f4653f) != sVar) {
                        f(pVar, (p) sVar.f4652e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (bVar4.f54599g == 0) {
                        bVar4.f54594a.g();
                        i(bVar4);
                    }
                    if (bVar2.f54599g == 0) {
                        b bVar7 = bVar2.f54598f;
                        sVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f54598f;
            }
        }
        while (true) {
            b bVar8 = this.f54644g;
            if (bVar8 != null && bVar8 != bVar) {
                i(bVar8);
            } else {
                return;
            }
        }
    }

    public final void i(b bVar) {
        b bVar2 = bVar.f54597e;
        if (bVar2 != null) {
            bVar2.f54598f = bVar.f54598f;
        }
        b bVar3 = bVar.f54598f;
        if (bVar3 == null) {
            this.f54644g = bVar2;
        } else {
            bVar3.f54597e = bVar2;
        }
    }
}
