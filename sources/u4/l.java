package u4;

import android.net.Uri;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class l extends m {
    public static final l f48341n;
    public final List d;
    public final List f48342e;
    public final List f48343f;
    public final List f48344g;
    public final List h;
    public final List f48345i;
    public final n0 f48346j;
    public final List f48347k;
    public final Map f48348l;
    public final List f48349m;

    static {
        List list = Collections.EMPTY_LIST;
        f48341n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, n0 n0Var, List list7, boolean z4, Map map, List list8) {
        super(str, list, z4);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((k) list2.get(i10)).f48336a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f48342e = DesugarCollections.unmodifiableList(list2);
        this.f48343f = DesugarCollections.unmodifiableList(list3);
        this.f48344g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f48345i = DesugarCollections.unmodifiableList(list6);
        this.f48346j = n0Var;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f48347k = list9;
        this.f48348l = DesugarCollections.unmodifiableMap(map);
        this.f48349m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((j) list.get(i10)).f48333a;
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
                    if (bVar.f15242b == i10 && bVar.f15243c == i11) {
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
        ArrayList c3 = c(0, this.f48342e, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f48350a, this.f48351b, c3, list2, c(1, this.f48344g, list), c(2, this.h, list), list2, this.f48346j, this.f48347k, this.f48352c, this.f48348l, this.f48349m);
    }
}
