package qi;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ki.l1;
import p4.r0;
public abstract class j {
    public static int f56312c;
    public static final p f56310a = new p(new r0(24), new r0(25));
    public static final LinkedHashMap f56311b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList f56313e = new ArrayList();

    public static void a(Spannable spannable, int i7, s0 s0Var) {
        Object[] spans;
        c[] cVarArr;
        Object[] spans2;
        h[] hVarArr;
        if (i7 != 0) {
            boolean z10 = spannable instanceof d;
            if (z10) {
                spans = d.a((d) spannable, i7, c.class);
            } else {
                spans = spannable.getSpans(0, i7, c.class);
            }
            for (c cVar : (c[]) spans) {
                d(spannable, i7, cVar);
                spannable.removeSpan(cVar);
            }
            if (z10) {
                spans2 = d.a((d) spannable, i7, h.class);
            } else {
                spans2 = spannable.getSpans(0, i7, h.class);
            }
            for (h hVar : (h[]) spans2) {
                d(spannable, i7, hVar);
                spannable.removeSpan(hVar);
            }
            if (s0Var != null) {
                int[] b10 = s0Var.b();
                for (int i10 = 0; i10 < b10.length; i10 += 3) {
                    int i11 = b10[i10];
                    int i12 = b10[i10 + 1];
                    int i13 = b10[i10 + 2];
                    if (i11 >= 0 && i12 <= i7 && i11 < i12) {
                        int i14 = i13 & 255;
                        if (i14 != 0) {
                            spannable.setSpan(new c(i14), i11, i12, 33);
                        }
                        if ((i13 & 768) != 0) {
                            spannable.setSpan(new h(i13), i11, i12, 33);
                        }
                    }
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        boolean z10;
        if (charSequence == null) {
            charSequence = "";
        }
        String b10 = p.b(str);
        if (!b10.isEmpty() && charSequence.length() != 0) {
            String charSequence2 = charSequence.toString();
            b bVar = new b(b10, charSequence2);
            if (!(charSequence instanceof Spanned) && charSequence2.length() <= 65536) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinkedHashMap linkedHashMap = f56311b;
            synchronized (linkedHashMap) {
                if (z10) {
                    try {
                        SpannableString spannableString = (SpannableString) linkedHashMap.get(bVar);
                        if (spannableString != null) {
                            return spannableString;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                d dVar = new d(charSequence);
                if (z10) {
                    linkedHashMap.put(bVar, dVar);
                    f56312c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = f56311b;
                        if (linkedHashMap2.size() <= 8 && f56312c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        f56312c -= ((b) entry.getKey()).f56296b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(dVar, dVar.length(), b10);
                return dVar;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i7, String str) {
        i iVar;
        i iVar2;
        o oVar;
        if (spannable == null) {
            return;
        }
        if (i7 >= 0 && i7 <= spannable.length()) {
            f fVar = new f(spannable.subSequence(0, i7).toString());
            long j3 = (0 << 32) | (i7 & 4294967295L);
            synchronized (d) {
                try {
                    ArrayList arrayList = f56313e;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            iVar = (i) it.next();
                            Spannable spannable2 = (Spannable) iVar.f56308a.get();
                            if (spannable2 == null) {
                                it.remove();
                            } else if (spannable2 == spannable) {
                                break;
                            }
                        } else {
                            iVar = new i(spannable);
                            arrayList.add(iVar);
                            break;
                        }
                    }
                    iVar2 = iVar;
                    f fVar2 = (f) iVar2.f56309b.put(Long.valueOf(j3), fVar);
                    if (fVar2 != null && (oVar = fVar2.f56301b) != null) {
                        oVar.f56321a = null;
                    }
                } finally {
                }
            }
            o d2 = f56310a.d(fVar.f56300a, str, new l1(i7, 4, j3, iVar2, fVar));
            synchronized (d) {
                try {
                    if (iVar2.f56309b.get(Long.valueOf(j3)) == fVar) {
                        fVar.f56301b = d2;
                    } else {
                        d2.f56321a = null;
                    }
                } finally {
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void d(Spannable spannable, int i7, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        Object hVar;
        Object hVar2;
        if (spannable instanceof d) {
            d dVar = (d) spannable;
            spanStart = d.b(dVar, characterStyle);
            spanEnd = d.c(dVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            if (characterStyle instanceof c) {
                hVar2 = new c(((c) characterStyle).f56297a);
            } else {
                hVar2 = new h(((h) characterStyle).f56307b);
            }
            spannable.setSpan(hVar2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i7) {
            if (characterStyle instanceof c) {
                hVar = new c(((c) characterStyle).f56297a);
            } else {
                hVar = new h(((h) characterStyle).f56307b);
            }
            spannable.setSpan(hVar, Math.max(i7, spanStart), spanEnd, 33);
        }
    }
}
