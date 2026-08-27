package p4;

import android.net.Uri;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class m extends n {

    public static final m f45423n;
    public final List d;

    public final List f45424e;

    public final List f45425f;

    public final List f45426g;
    public final List h;

    public final List f45427i;

    public final t0 f45428j;

    public final List f45429k;

    public final Map f45430l;

    public final List f45431m;

    static {
        List list = Collections.EMPTY_LIST;
        f45423n = new m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public m(String str, List list, List list2, List list3, List list4, List list5, List list6, t0 t0Var, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((l) list2.get(i10)).f45418a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f45424e = DesugarCollections.unmodifiableList(list2);
        this.f45425f = DesugarCollections.unmodifiableList(list3);
        this.f45426g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f45427i = DesugarCollections.unmodifiableList(list6);
        this.f45428j = t0Var;
        this.f45429k = list7 != null ? DesugarCollections.unmodifiableList(list7) : null;
        this.f45430l = DesugarCollections.unmodifiableMap(map);
        this.f45431m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((k) list.get(i10)).f45415a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i10, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                i4.b bVar = (i4.b) list2.get(i12);
                if (bVar.f10564b == i10 && bVar.f10565c == i11) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override
    public final Object a(List list) {
        ArrayList arrayListC = c(0, this.f45424e, list);
        List list2 = Collections.EMPTY_LIST;
        return new m(this.f45432a, this.f45433b, arrayListC, list2, c(1, this.f45426g, list), c(2, this.h, list), list2, this.f45428j, this.f45429k, this.f45434c, this.f45430l, this.f45431m);
    }
}
