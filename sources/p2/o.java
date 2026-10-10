package p2;

import android.net.Uri;
import b2.e1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class o extends p {
    public static final o f45304n;
    public final List d;
    public final List f45305e;
    public final List f45306f;
    public final List f45307g;
    public final List h;
    public final List f45308i;
    public final b2.s f45309j;
    public final List f45310k;
    public final Map f45311l;
    public final List f45312m;

    static {
        List list = Collections.EMPTY_LIST;
        f45304n = new o("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public o(String str, List list, List list2, List list3, List list4, List list5, List list6, b2.s sVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((n) list2.get(i10)).f45299a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f45305e = DesugarCollections.unmodifiableList(list2);
        this.f45306f = DesugarCollections.unmodifiableList(list3);
        this.f45307g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f45308i = DesugarCollections.unmodifiableList(list6);
        this.f45309j = sVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f45310k = list9;
        this.f45311l = DesugarCollections.unmodifiableMap(map);
        this.f45312m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((m) list.get(i10)).f45296a;
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
        ArrayList c10 = c(0, this.f45305e, list);
        List list2 = Collections.EMPTY_LIST;
        return new o(this.f45313a, this.f45314b, c10, list2, c(1, this.f45307g, list), c(2, this.h, list), list2, this.f45309j, this.f45310k, this.f45315c, this.f45311l, this.f45312m);
    }
}
