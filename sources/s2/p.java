package s2;

import android.net.Uri;
import e2.f1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class p extends q {
    public static final p f54714n;
    public final List d;
    public final List f54715e;
    public final List f54716f;
    public final List f54717g;
    public final List h;
    public final List f54718i;
    public final e2.u f54719j;
    public final List f54720k;
    public final Map f54721l;
    public final List f54722m;

    static {
        List list = Collections.EMPTY_LIST;
        f54714n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, e2.u uVar, List list7, boolean z9, Map map, List list8) {
        super(str, list, z9);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list2.size(); i7++) {
            Uri uri = ((o) list2.get(i7)).f54708a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f54715e = DesugarCollections.unmodifiableList(list2);
        this.f54716f = DesugarCollections.unmodifiableList(list3);
        this.f54717g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f54718i = DesugarCollections.unmodifiableList(list6);
        this.f54719j = uVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f54720k = list9;
        this.f54721l = DesugarCollections.unmodifiableMap(map);
        this.f54722m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            Uri uri = ((n) list.get(i7)).f54705a;
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
                    if (f1Var.f10248b == i7 && f1Var.f10249c == i10) {
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
        ArrayList c10 = c(0, this.f54715e, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.f54723a, this.f54724b, c10, list2, c(1, this.f54717g, list), c(2, this.h, list), list2, this.f54719j, this.f54720k, this.f54725c, this.f54721l, this.f54722m);
    }
}
