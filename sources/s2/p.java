package s2;

import android.net.Uri;
import e2.f1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class p extends q {
    public static final p f56899n;
    public final List d;
    public final List f56900e;
    public final List f56901f;
    public final List f56902g;
    public final List h;
    public final List f56903i;
    public final e2.u f56904j;
    public final List f56905k;
    public final Map f56906l;
    public final List f56907m;

    static {
        List list = Collections.EMPTY_LIST;
        f56899n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, e2.u uVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((o) list2.get(i7)).f56893a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f56900e = DesugarCollections.unmodifiableList(list2);
        this.f56901f = DesugarCollections.unmodifiableList(list3);
        this.f56902g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f56903i = DesugarCollections.unmodifiableList(list6);
        this.f56904j = uVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f56905k = list9;
        this.f56906l = DesugarCollections.unmodifiableMap(map);
        this.f56907m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((n) list.get(i7)).f56890a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i7, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    f1 f1Var = (f1) list2.get(i11);
                    if (f1Var.f10431b == i7 && f1Var.f10432c == i10) {
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
        ArrayList c10 = c(0, this.f56900e, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.f56908a, this.f56909b, c10, list2, c(1, this.f56902g, list), c(2, this.h, list), list2, this.f56904j, this.f56905k, this.f56910c, this.f56906l, this.f56907m);
    }
}
