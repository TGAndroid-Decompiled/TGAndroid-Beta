package u4;

import android.net.Uri;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l extends m {
    public static final l f45056n;
    public final List d;
    public final List e;
    public final List f45057f;
    public final List f45058g;
    public final List h;
    public final List f45059i;
    public final n0 f45060j;
    public final List f45061k;
    public final Map f45062l;
    public final List f45063m;

    static {
        List list = Collections.EMPTY_LIST;
        f45056n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, n0 n0Var, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).f45052a;
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
        this.f45057f = DesugarCollections.unmodifiableList(list3);
        this.f45058g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f45059i = DesugarCollections.unmodifiableList(list6);
        this.f45060j = n0Var;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f45061k = list9;
        this.f45062l = DesugarCollections.unmodifiableMap(map);
        this.f45063m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).f45049a;
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
                    if (bVar.f14262b == i10 && bVar.f14263c == i11) {
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
        return new l(this.f45064a, this.f45065b, c3, list2, c(1, this.f45058g, list), c(2, this.h, list), list2, this.f45060j, this.f45061k, this.f45066c, this.f45062l, this.f45063m);
    }
}
