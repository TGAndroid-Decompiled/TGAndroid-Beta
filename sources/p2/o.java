package p2;

import android.net.Uri;
import b2.e1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class o extends p {
    public static final o f45328n;
    public final List d;
    public final List f45329e;
    public final List f45330f;
    public final List f45331g;
    public final List h;
    public final List f45332i;
    public final b2.s f45333j;
    public final List f45334k;
    public final Map f45335l;
    public final List f45336m;

    static {
        List list = Collections.EMPTY_LIST;
        f45328n = new o("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, b2.s sVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((n) list2.get(i10)).f45323a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f45329e = DesugarCollections.unmodifiableList(list2);
        this.f45330f = DesugarCollections.unmodifiableList(list3);
        this.f45331g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f45332i = DesugarCollections.unmodifiableList(list6);
        this.f45333j = sVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f45334k = list9;
        this.f45335l = DesugarCollections.unmodifiableMap(map);
        this.f45336m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((m) list.get(i10)).f45320a;
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
                    if (e1Var.f3295b == i10 && e1Var.f3296c == i11) {
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
        ArrayList c10 = c(0, this.f45329e, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f45337a, this.f45338b, c10, list2, c(1, this.f45331g, list), c(2, this.h, list), list2, this.f45333j, this.f45334k, this.f45339c, this.f45335l, this.f45336m);
    }
}
