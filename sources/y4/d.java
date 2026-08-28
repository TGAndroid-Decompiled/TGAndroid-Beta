package y4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
public final class d {
    public final String f49574a;
    public final String f49575b;
    public final boolean f49576c;
    public final long d;
    public final long f49577e;
    public final f f49578f;
    public final String[] f49579g;
    public final String h;
    public final String f49580i;
    public final d f49581j;
    public final HashMap f49582k;
    public final HashMap f49583l;
    public ArrayList f49584m;

    public d(String str, String str2, long j10, long j11, f fVar, String[] strArr, String str3, String str4, d dVar) {
        boolean z10;
        this.f49574a = str;
        this.f49575b = str2;
        this.f49580i = str4;
        this.f49578f = fVar;
        this.f49579g = strArr;
        if (str2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49576c = z10;
        this.d = j10;
        this.f49577e = j11;
        str3.getClass();
        this.h = str3;
        this.f49581j = dVar;
        this.f49582k = new HashMap();
        this.f49583l = new HashMap();
    }

    public static d a(String str) {
        return new d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            r4.a aVar = new r4.a();
            aVar.f47030a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((r4.a) treeMap.get(str)).f47030a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final d b(int i9) {
        ArrayList arrayList = this.f49584m;
        if (arrayList != null) {
            return (d) arrayList.get(i9);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f49584m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z10) {
        boolean z11;
        String str = this.f49574a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z10 || equals || (equals2 && this.f49580i != null)) {
            long j10 = this.d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f49577e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f49584m != null) {
            for (int i9 = 0; i9 < this.f49584m.size(); i9++) {
                d dVar = (d) this.f49584m.get(i9);
                if (!z10 && !equals) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                dVar.d(treeSet, z11);
            }
        }
    }

    public final boolean f(long j10) {
        long j11 = this.f49577e;
        long j12 = this.d;
        if (j12 != -9223372036854775807L || j11 != -9223372036854775807L) {
            if (j12 > j10 || j11 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L || j10 >= j11) {
                    if (j12 <= j10 && j10 < j11) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j10) && "div".equals(this.f49574a) && (str2 = this.f49580i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i9 = 0; i9 < c(); i9++) {
            b(i9).g(j10, str, arrayList);
        }
    }

    public final void h(long r18, java.util.Map r20, java.util.HashMap r21, java.lang.String r22, java.util.TreeMap r23) {
        throw new UnsupportedOperationException("Method not decompiled: y4.d.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j10, boolean z10, String str, TreeMap treeMap) {
        String str2;
        boolean z11;
        HashMap hashMap = this.f49582k;
        hashMap.clear();
        HashMap hashMap2 = this.f49583l;
        hashMap2.clear();
        String str3 = this.f49574a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f49576c && z10) {
                SpannableStringBuilder e10 = e(str2, treeMap);
                String str5 = this.f49575b;
                str5.getClass();
                e10.append((CharSequence) str5);
            } else if ("br".equals(str3) && z10) {
                e(str2, treeMap).append('\n');
            } else if (f(j10)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((r4.a) entry.getValue()).f47030a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i9 = 0; i9 < c(); i9++) {
                    d b10 = b(i9);
                    if (!z10 && !equals) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    b10.i(j10, z11, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e11 = e(str2, treeMap);
                    int length = e11.length() - 1;
                    while (length >= 0 && e11.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e11.charAt(length) != '\n') {
                        e11.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((r4.a) entry2.getValue()).f47030a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
