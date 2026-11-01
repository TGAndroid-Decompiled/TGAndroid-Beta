package re;

import df.c;
import java.util.ArrayList;
import q3.h;
import se.d;
public final class b extends xe.a {
    public final ArrayList f46498c;
    public final ArrayList d;
    public final qe.a f46496a = new c();
    public final ArrayList f46497b = new ArrayList();
    public boolean e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f46498c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < trim.length()) {
            char charAt = trim.charAt(i10);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb2.append(charAt);
                } else {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else {
                int i11 = i10 + 1;
                if (i11 < trim.length() && trim.charAt(i11) == '|') {
                    sb2.append('|');
                    i10 = i11;
                } else {
                    sb2.append('\\');
                }
            }
            i10++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.f46497b.add(charSequence);
        }
    }

    @Override
    public final ve.a e() {
        return this.f46496a;
    }

    @Override
    public final void g(we.a aVar) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? cVar = new c();
        ?? r32 = this.f46496a;
        r32.b(cVar);
        ?? cVar2 = new c();
        cVar.b(cVar2);
        int i10 = 0;
        while (true) {
            arrayList = this.f46498c;
            if (i10 >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i10);
            ?? cVar3 = new c();
            if (i10 < arrayList.size()) {
                cVar3.h = (qe.c) arrayList.get(i10);
            }
            aVar.a(str2.trim(), cVar3);
            cVar3.f45530g = true;
            cVar2.b(cVar3);
            i10++;
        }
        ArrayList arrayList3 = this.f46497b;
        int size2 = arrayList3.size();
        ?? r52 = 0;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList3.get(i11);
            i11++;
            ArrayList i12 = i((CharSequence) obj);
            ?? cVar4 = new c();
            for (int i13 = 0; i13 < size; i13++) {
                if (i13 < i12.size()) {
                    str = (String) i12.get(i13);
                } else {
                    str = "";
                }
                ?? cVar5 = new c();
                if (i13 < arrayList.size()) {
                    cVar5.h = (qe.c) arrayList.get(i13);
                }
                aVar.a(str.trim(), cVar5);
                cVar4.b(cVar5);
            }
            if (r52 == 0) {
                r52 = new c();
                r32.b(r52);
            }
            r52.b(cVar4);
            r52 = r52;
        }
    }

    @Override
    public final h h(d dVar) {
        if (dVar.f48208a.toString().contains("|")) {
            return h.a(dVar.f48209b);
        }
        return null;
    }
}
