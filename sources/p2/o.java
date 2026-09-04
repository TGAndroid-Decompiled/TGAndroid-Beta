package p2;

import android.net.Uri;
import b2.e1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class o extends p {
    public static final o f43738n;
    public final List d;
    public final List f43739e;
    public final List f43740f;
    public final List f43741g;
    public final List h;
    public final List f43742i;
    public final b2.s f43743j;
    public final List f43744k;
    public final Map f43745l;
    public final List f43746m;

    static {
        List list = Collections.EMPTY_LIST;
        f43738n = new o("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, b2.s sVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((n) list2.get(i10)).f43733a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f43739e = DesugarCollections.unmodifiableList(list2);
        this.f43740f = DesugarCollections.unmodifiableList(list3);
        this.f43741g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f43742i = DesugarCollections.unmodifiableList(list6);
        this.f43743j = sVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f43744k = list9;
        this.f43745l = DesugarCollections.unmodifiableMap(map);
        this.f43746m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((m) list.get(i10)).f43730a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i10, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    e1 e1Var = (e1) list2.get(i12);
                    if (e1Var.f2022b == i10 && e1Var.f2023c == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Object a(List list) {
        ArrayList c10 = c(0, this.f43739e, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f43747a, this.f43748b, c10, list2, c(1, this.f43741g, list), c(2, this.h, list), list2, this.f43743j, this.f43744k, this.f43749c, this.f43745l, this.f43746m);
    }
}
