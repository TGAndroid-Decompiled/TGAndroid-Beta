package p4;

import android.net.Uri;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public class m extends n {
    public static final m f45417n;
    public final List d;
    public final List f45418e;
    public final List f45419f;
    public final List f45420g;
    public final List h;
    public final List f45421i;
    public final t0 f45422j;
    public final List f45423k;
    public final Map f45424l;
    public final List f45425m;

    static {
        List list = Collections.EMPTY_LIST;
        f45417n = new m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public m(String str, List list, List list2, List list3, List list4, List list5, List list6, t0 t0Var, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list2.size(); i9++) {
            Uri uri = ((l) list2.get(i9)).f45412a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f45418e = DesugarCollections.unmodifiableList(list2);
        this.f45419f = DesugarCollections.unmodifiableList(list3);
        this.f45420g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f45421i = DesugarCollections.unmodifiableList(list6);
        this.f45422j = t0Var;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f45423k = list9;
        this.f45424l = DesugarCollections.unmodifiableMap(map);
        this.f45425m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            Uri uri = ((k) list.get(i9)).f45409a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i9, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    i4.b bVar = (i4.b) list2.get(i11);
                    if (bVar.f10924b == i9 && bVar.f10925c == i10) {
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
        ArrayList c10 = c(0, this.f45418e, list);
        List list2 = Collections.EMPTY_LIST;
        return new m(this.f45426a, this.f45427b, c10, list2, c(1, this.f45420g, list), c(2, this.h, list), list2, this.f45422j, this.f45423k, this.f45428c, this.f45424l, this.f45425m);
    }
}
