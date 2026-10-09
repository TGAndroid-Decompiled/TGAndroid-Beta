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
import org.telegram.ui.ActionBar.b5;
public final class h implements df.a {
    public static final Pattern f54403i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern f54404j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern f54405k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern f54406l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern f54407m = Pattern.compile("`+");
    public static final Pattern f54408n = Pattern.compile("^`+");
    public static final Pattern f54409o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f54410p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern f54411q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern f54412r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern f54413s = Pattern.compile("\\s+");
    public static final Pattern f54414t = Pattern.compile(" *$");
    public final BitSet f54415a;
    public final BitSet f54416b;
    public final HashMap f54417c;
    public final b5 d;
    public String f54418e;
    public int f54419f;
    public b f54420g;
    public f6.f h;

    public h(b5 b5Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new af.a(0), new af.a(1)), hashMap);
        c((List) b5Var.f20461b, hashMap);
        this.f54417c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch2 : keySet) {
            bitSet.set(ch2.charValue());
        }
        this.f54416b = bitSet;
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
        this.f54415a = bitSet2;
        this.d = b5Var;
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
            sb2.append(sVar.f4657g);
            p pVar = (p) sVar2.f4655f;
            for (p pVar2 = (p) sVar.f4655f; pVar2 != pVar; pVar2 = (p) pVar2.f4655f) {
                sb2.append(((s) pVar2).f4657g);
                pVar2.g();
            }
            sVar.f4657g = sb2.toString();
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
                i10 = sVar2.f4657g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            }
            pVar = (p) pVar.f4655f;
        }
        e(sVar, sVar2, i10);
    }

    @Override
    public final void a(java.lang.String r24, cf.p r25) {
        throw new UnsupportedOperationException("Method not decompiled: ze.h.a(java.lang.String, cf.p):void");
    }

    public final String d(Pattern pattern) {
        if (this.f54419f >= this.f54418e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f54418e);
        matcher.region(this.f54419f, this.f54418e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f54419f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f54419f < this.f54418e.length()) {
            return this.f54418e.charAt(this.f54419f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        p pVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.f54420g;
        while (bVar2 != null) {
            b bVar3 = bVar2.f54373e;
            if (bVar3 == bVar) {
                break;
            }
            bVar2 = bVar3;
        }
        while (bVar2 != null) {
            s sVar = bVar2.f54370a;
            char c10 = bVar2.f54371b;
            ff.a aVar = (ff.a) this.f54417c.get(Character.valueOf(c10));
            if (bVar2.d && aVar != null) {
                char e7 = aVar.e();
                b bVar4 = bVar2.f54373e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.f54372c && bVar4.f54371b == e7) {
                        i10 = aVar.a(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.f54373e;
                }
                z10 = z11;
                z11 = false;
                if (!z11) {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.f54373e);
                        if (!bVar2.f54372c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f54374f;
                } else {
                    s sVar2 = bVar4.f54370a;
                    bVar4.f54375g -= i10;
                    bVar2.f54375g -= i10;
                    sVar2.f4657g = e2.i(i10, 0, sVar2.f4657g);
                    sVar.f4657g = e2.i(i10, 0, sVar.f4657g);
                    b bVar5 = bVar2.f54373e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.f54373e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f4655f) != sVar) {
                        f(pVar, (p) sVar.f4654e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (bVar4.f54375g == 0) {
                        bVar4.f54370a.g();
                        i(bVar4);
                    }
                    if (bVar2.f54375g == 0) {
                        b bVar7 = bVar2.f54374f;
                        sVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                }
            } else {
                bVar2 = bVar2.f54374f;
            }
        }
        while (true) {
            b bVar8 = this.f54420g;
            if (bVar8 != null && bVar8 != bVar) {
                i(bVar8);
            } else {
                return;
            }
        }
    }

    public final void i(b bVar) {
        b bVar2 = bVar.f54373e;
        if (bVar2 != null) {
            bVar2.f54374f = bVar.f54374f;
        }
        b bVar3 = bVar.f54374f;
        if (bVar3 == null) {
            this.f54420g = bVar2;
        } else {
            bVar3.f54373e = bVar2;
        }
    }
}
