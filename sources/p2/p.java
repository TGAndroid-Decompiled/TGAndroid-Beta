package p2;

import android.net.Uri;
import b2.j1;
import b2.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class p extends q {
    public static final p f46585n;
    public final List d;
    public final List e;
    public final List f46586f;
    public final List f46587g;
    public final List h;
    public final List f46588i;
    public final x f46589j;
    public final List f46590k;
    public final Map f46591l;
    public final List f46592m;

    static {
        List list = Collections.EMPTY_LIST;
        f46585n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, x xVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((o) list2.get(i10)).f46580a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = DesugarCollections.unmodifiableList(list2);
        this.f46586f = DesugarCollections.unmodifiableList(list3);
        this.f46587g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f46588i = DesugarCollections.unmodifiableList(list6);
        this.f46589j = xVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f46590k = list9;
        this.f46591l = DesugarCollections.unmodifiableMap(map);
        this.f46592m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((n) list.get(i10)).f46577a;
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
                    j1 j1Var = (j1) list2.get(i12);
                    if (j1Var.f3244b == i10 && j1Var.f3245c == i11) {
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
        ArrayList c10 = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.f46593a, this.f46594b, c10, list2, c(1, this.f46587g, list), c(2, this.h, list), list2, this.f46589j, this.f46590k, this.f46595c, this.f46591l, this.f46592m);
    }
}
