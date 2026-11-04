package r2;

import android.net.Uri;
import d2.h1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class p extends q {
    public static final p f54180n;
    public final List d;
    public final List f54181e;
    public final List f54182f;
    public final List f54183g;
    public final List h;
    public final List f54184i;
    public final d2.v f54185j;
    public final List f54186k;
    public final Map f54187l;
    public final List f54188m;

    static {
        List list = Collections.EMPTY_LIST;
        f54180n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, d2.v vVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Uri uri = ((o) list2.get(i3)).f54174a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f54181e = DesugarCollections.unmodifiableList(list2);
        this.f54182f = DesugarCollections.unmodifiableList(list3);
        this.f54183g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f54184i = DesugarCollections.unmodifiableList(list6);
        this.f54185j = vVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f54186k = list9;
        this.f54187l = DesugarCollections.unmodifiableMap(map);
        this.f54188m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            Uri uri = ((n) list.get(i3)).f54171a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i3, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    h1 h1Var = (h1) list2.get(i11);
                    if (h1Var.f8128b == i3 && h1Var.f8129c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Object a(List list) {
        ArrayList c2 = c(0, this.f54181e, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.f54189a, this.f54190b, c2, list2, c(1, this.f54183g, list), c(2, this.h, list), list2, this.f54185j, this.f54186k, this.f54191c, this.f54187l, this.f54188m);
    }
}
