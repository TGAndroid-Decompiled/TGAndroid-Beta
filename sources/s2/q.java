package s2;

import android.net.Uri;
import e2.f1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class q extends r {
    public static final q f56980n;
    public final List d;
    public final List f56981e;
    public final List f56982f;
    public final List f56983g;
    public final List h;
    public final List f56984i;
    public final e2.u f56985j;
    public final List f56986k;
    public final Map f56987l;
    public final List f56988m;

    static {
        List list = Collections.EMPTY_LIST;
        f56980n = new q("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public q(String str, List list, List list2, List list3, List list4, List list5, List list6, e2.u uVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((p) list2.get(i7)).f56974a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f56981e = DesugarCollections.unmodifiableList(list2);
        this.f56982f = DesugarCollections.unmodifiableList(list3);
        this.f56983g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f56984i = DesugarCollections.unmodifiableList(list6);
        this.f56985j = uVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f56986k = list9;
        this.f56987l = DesugarCollections.unmodifiableMap(map);
        this.f56988m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((o) list.get(i7)).f56971a;
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
                    if (f1Var.f10392b == i7 && f1Var.f10393c == i10) {
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
        ArrayList c10 = c(0, this.f56981e, list);
        List list2 = Collections.EMPTY_LIST;
        return new q(this.f56989a, this.f56990b, c10, list2, c(1, this.f56983g, list), c(2, this.h, list), list2, this.f56985j, this.f56986k, this.f56991c, this.f56987l, this.f56988m);
    }
}
