package y4;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import d5.g0;
import e7.v;
import h7.g8;
import h7.v7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public final class d {

    public final String f49564a;

    public final String f49565b;

    public final boolean f49566c;
    public final long d;

    public final long f49567e;

    public final f f49568f;

    public final String[] f49569g;
    public final String h;

    public final String f49570i;

    public final d f49571j;

    public final HashMap f49572k;

    public final HashMap f49573l;

    public ArrayList f49574m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        this.f49564a = str;
        this.f49565b = str2;
        this.f49570i = str4;
        this.f49568f = fVar;
        this.f49569g = strArr;
        this.f49566c = str2 != null;
        this.d = j10;
        this.f49567e = j11;
        str3.getClass();
        this.h = str3;
        this.f49571j = dVar;
        this.f49572k = new HashMap();
        this.f49573l = new HashMap();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            r4.b bVar = new r4.b();
            bVar.f46721a = new SpannableStringBuilder();
            treeMap.put(str, bVar);
        }
        CharSequence charSequence = ((r4.b) treeMap.get(str)).f46721a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i10) {
        ArrayList arrayList = this.f49574m;
        if (arrayList != null) {
            return (d) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f49574m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        String str = this.f49564a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f49570i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f49567e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f49574m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f49574m.size(); i10++) {
            ((d) this.f49574m.get(i10)).d(treeSet, z10 || zEquals);
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f49567e;
        long j12 = this.d;
        if (j12 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 <= j10 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j12 != -9223372036854775807L || j10 >= j11) {
            return j12 <= j10 && j10 < j11;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f49564a) && (str2 = this.f49570i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j10, str, arrayList);
        }
    }

    public final void h(long j10, Map map, HashMap map2, String str, TreeMap treeMap) {
        int i10;
        d dVar;
        boolean z10;
        int i11;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        int i13;
        int i14;
        Map map3 = map;
        if (f(j10)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry entry : this.f49573l.entrySet()) {
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f49572k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    r4.b bVar = (r4.b) treeMap.get(str4);
                    bVar.getClass();
                    e eVar = (e) map2.get(str3);
                    eVar.getClass();
                    int i15 = eVar.f49582j;
                    f fVarA = g8.a(this.f49568f, this.f49569g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.f46721a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        bVar.f46721a = spannableStringBuilder;
                    }
                    if (fVarA != null) {
                        int i16 = fVarA.h;
                        int i17 = 1;
                        if (((i16 == -1 && fVarA.f49589i == -1) ? -1 : (i16 == 1 ? (char) 1 : (char) 0) | (fVarA.f49589i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i18 = fVarA.h;
                            if (i18 != -1) {
                                if (i18 == i17) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (fVarA.f49589i == i17) {
                                    i13 = 2;
                                } else {
                                    i13 = 0;
                                }
                                i14 = i12 | i13;
                            } else if (fVarA.f49589i == -1) {
                                i17 = 1;
                                i14 = -1;
                            } else {
                                i17 = 1;
                                if (i18 == i17) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (fVarA.f49589i == i17) {
                                    i13 = 2;
                                } else {
                                    i13 = 0;
                                }
                                i14 = i12 | i13;
                            }
                            StyleSpan styleSpan = new StyleSpan(i14);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (fVarA.f49587f == i17) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (fVarA.f49588g == i17) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (fVarA.f49585c) {
                            if (!fVarA.f49585c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            v7.a(new ForegroundColorSpan(fVarA.f49584b), spannableStringBuilder, iIntValue, iIntValue2);
                        }
                        if (fVarA.f49586e) {
                            if (!fVarA.f49586e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            v7.a(new BackgroundColorSpan(fVarA.d), spannableStringBuilder, iIntValue, iIntValue2);
                        }
                        if (fVarA.f49583a != null) {
                            v7.a(new TypefaceSpan(fVarA.f49583a), spannableStringBuilder, iIntValue, iIntValue2);
                        }
                        b bVar2 = fVarA.f49598r;
                        if (bVar2 != null) {
                            if (bVar2.f49555a == -1 && i15 != 2) {
                            }
                            v7.a(new w9.d(23), spannableStringBuilder, iIntValue, iIntValue2);
                        }
                        int i19 = fVarA.f49593m;
                        if (i19 == 2) {
                            d dVar2 = this.f49571j;
                            while (true) {
                                if (dVar2 == null) {
                                    dVar2 = null;
                                    break;
                                }
                                f fVarA2 = g8.a(dVar2.f49568f, dVar2.f49569g, map3);
                                if (fVarA2 != null && fVarA2.f49593m == 1) {
                                    break;
                                } else {
                                    dVar2 = dVar2.f49571j;
                                }
                            }
                            if (dVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(dVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        dVar = null;
                                        break;
                                    }
                                    dVar = (d) arrayDeque.pop();
                                    f fVarA3 = g8.a(dVar.f49568f, dVar.f49569g, map3);
                                    if (fVarA3 != null && fVarA3.f49593m == 3) {
                                        break;
                                    }
                                    for (int iC = dVar.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(dVar.b(iC));
                                    }
                                }
                                if (dVar != null) {
                                    if (dVar.c() != 1 || dVar.b(0).f49565b == null) {
                                        d5.a.v("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = dVar.b(0).f49565b;
                                        int i20 = g0.f4795a;
                                        f fVarA4 = g8.a(dVar.f49568f, dVar.f49569g, map3);
                                        if ((fVarA4 != null ? fVarA4.f49594n : -1) == -1) {
                                            g8.a(dVar2.f49568f, dVar2.f49569g, map3);
                                        }
                                        spannableStringBuilder.setSpan(new v(23), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (fVarA.f49597q == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                v7.a(new ab.a(23), spannableStringBuilder, iIntValue, iIntValue2);
                            }
                            i11 = fVarA.f49590j;
                            if (i11 != 1) {
                                v7.a(new AbsoluteSizeSpan((int) fVarA.f49591k, true), spannableStringBuilder, iIntValue, iIntValue2);
                            } else if (i11 != 2) {
                                v7.a(new RelativeSizeSpan(fVarA.f49591k), spannableStringBuilder, iIntValue, iIntValue2);
                            } else if (i11 == 3) {
                                v7.a(new RelativeSizeSpan(fVarA.f49591k / 100.0f), spannableStringBuilder, iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.f49564a)) {
                                f10 = fVarA.f49599s;
                                if (f10 != Float.MAX_VALUE) {
                                    bVar.f46735q = (f10 * (-90.0f)) / 100.0f;
                                }
                                alignment = fVarA.f49595o;
                                if (alignment != null) {
                                    bVar.f46723c = alignment;
                                }
                                alignment2 = fVarA.f49596p;
                                if (alignment2 != null) {
                                    bVar.d = alignment2;
                                }
                            }
                        } else if (i19 == 3 || i19 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        if (fVarA.f49597q == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            v7.a(new ab.a(23), spannableStringBuilder, iIntValue, iIntValue2);
                        }
                        i11 = fVarA.f49590j;
                        if (i11 != 1) {
                            v7.a(new AbsoluteSizeSpan((int) fVarA.f49591k, true), spannableStringBuilder, iIntValue, iIntValue2);
                        } else if (i11 != 2) {
                            v7.a(new RelativeSizeSpan(fVarA.f49591k), spannableStringBuilder, iIntValue, iIntValue2);
                        } else if (i11 == 3) {
                            v7.a(new RelativeSizeSpan(fVarA.f49591k / 100.0f), spannableStringBuilder, iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f49564a)) {
                            f10 = fVarA.f49599s;
                            if (f10 != Float.MAX_VALUE) {
                                bVar.f46735q = (f10 * (-90.0f)) / 100.0f;
                            }
                            alignment = fVarA.f49595o;
                            if (alignment != null) {
                                bVar.f46723c = alignment;
                            }
                            alignment2 = fVarA.f49596p;
                            if (alignment2 != null) {
                                bVar.d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            int i21 = 0;
            while (i21 < c()) {
                b(i21).h(j10, map3, map2, str3, treeMap);
                i21++;
                map3 = map;
            }
        }
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap map = this.f49572k;
        map.clear();
        HashMap map2 = this.f49573l;
        map2.clear();
        String str2 = this.f49564a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f49566c && z10) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f49565b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((r4.b) entry.getValue()).f46721a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j10, z10 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((r4.b) entry2.getValue()).f46721a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
