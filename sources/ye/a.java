package ye;

import cf.p;
import java.util.ArrayList;
import q3.h;
import xe.c;
import ze.d;
public final class a extends ef.a {
    public final ArrayList f52197c;
    public final ArrayList d;
    public final xe.a f52195a = new p();
    public final ArrayList f52196b = new ArrayList();
    public boolean f52198e = true;

    public a(ArrayList arrayList, ArrayList arrayList2) {
        this.f52197c = arrayList;
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
        if (this.f52198e) {
            this.f52198e = false;
        } else {
            this.f52196b.add(charSequence);
        }
    }

    @Override
    public final cf.a e() {
        return this.f52195a;
    }

    @Override
    public final void g(df.a aVar) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? pVar = new p();
        ?? r32 = this.f52195a;
        r32.b(pVar);
        ?? pVar2 = new p();
        pVar.b(pVar2);
        int i10 = 0;
        while (true) {
            arrayList = this.f52197c;
            if (i10 >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i10);
            ?? pVar3 = new p();
            if (i10 < arrayList.size()) {
                pVar3.h = (c) arrayList.get(i10);
            }
            aVar.a(str2.trim(), pVar3);
            pVar3.f51208g = true;
            pVar2.b(pVar3);
            i10++;
        }
        ArrayList arrayList3 = this.f52196b;
        int size2 = arrayList3.size();
        ?? r52 = 0;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList3.get(i11);
            i11++;
            ArrayList i12 = i((CharSequence) obj);
            ?? pVar4 = new p();
            for (int i13 = 0; i13 < size; i13++) {
                if (i13 < i12.size()) {
                    str = (String) i12.get(i13);
                } else {
                    str = "";
                }
                ?? pVar5 = new p();
                if (i13 < arrayList.size()) {
                    pVar5.h = (c) arrayList.get(i13);
                }
                aVar.a(str.trim(), pVar5);
                pVar4.b(pVar5);
            }
            if (r52 == 0) {
                r52 = new p();
                r32.b(r52);
            }
            r52.b(pVar4);
            r52 = r52;
        }
    }

    @Override
    public final h h(d dVar) {
        if (dVar.f54467a.toString().contains("|")) {
            return h.a(dVar.f54468b);
        }
        return null;
    }
}
