package p2;

import android.net.Uri;
import b2.e1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class o extends p {
    public static final o f43739n;
    public final List d;
    public final List f43740e;
    public final List f43741f;
    public final List f43742g;
    public final List h;
    public final List f43743i;
    public final b2.s f43744j;
    public final List f43745k;
    public final Map f43746l;
    public final List f43747m;

    static {
        List list = Collections.EMPTY_LIST;
        f43739n = new o("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, b2.s sVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((n) list2.get(i10)).f43734a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f43740e = DesugarCollections.unmodifiableList(list2);
        this.f43741f = DesugarCollections.unmodifiableList(list3);
        this.f43742g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f43743i = DesugarCollections.unmodifiableList(list6);
        this.f43744j = sVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f43745k = list9;
        this.f43746l = DesugarCollections.unmodifiableMap(map);
        this.f43747m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((m) list.get(i10)).f43731a;
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
        ArrayList c10 = c(0, this.f43740e, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f43748a, this.f43749b, c10, list2, c(1, this.f43742g, list), c(2, this.h, list), list2, this.f43744j, this.f43745k, this.f43750c, this.f43746l, this.f43747m);
    }
}
