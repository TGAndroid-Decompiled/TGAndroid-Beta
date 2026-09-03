package u4;

import android.net.Uri;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l extends m {
    public static final l f45118n;
    public final List d;
    public final List e;
    public final List f45119f;
    public final List f45120g;
    public final List h;
    public final List f45121i;
    public final n0 f45122j;
    public final List f45123k;
    public final Map f45124l;
    public final List f45125m;

    static {
        List list = Collections.EMPTY_LIST;
        f45118n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, n0 n0Var, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).f45114a;
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
        this.f45119f = DesugarCollections.unmodifiableList(list3);
        this.f45120g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f45121i = DesugarCollections.unmodifiableList(list6);
        this.f45122j = n0Var;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f45123k = list9;
        this.f45124l = DesugarCollections.unmodifiableMap(map);
        this.f45125m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).f45111a;
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
                    n4.b bVar = (n4.b) list2.get(i12);
                    if (bVar.f14247b == i10 && bVar.f14248c == i11) {
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
        ArrayList c3 = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f45126a, this.f45127b, c3, list2, c(1, this.f45120g, list), c(2, this.h, list), list2, this.f45122j, this.f45123k, this.f45128c, this.f45124l, this.f45125m);
    }
}
