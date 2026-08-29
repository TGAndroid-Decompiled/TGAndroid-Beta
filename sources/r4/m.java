package r4;

import android.net.Uri;
import j$.util.DesugarCollections;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public class m extends n {
    public static final m f46998n;
    public final List d;
    public final List f46999e;
    public final List f47000f;
    public final List f47001g;
    public final List h;
    public final List f47002i;
    public final t0 f47003j;
    public final List f47004k;
    public final Map f47005l;
    public final List f47006m;

    static {
        List list = Collections.EMPTY_LIST;
        f46998n = new m("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public m(String str, List list, List list2, List list3, List list4, List list5, List list6, t0 t0Var, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((l) list2.get(i10)).f46993a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(arrayList, list3);
        b(arrayList, list4);
        b(arrayList, list5);
        b(arrayList, list6);
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.f46999e = DesugarCollections.unmodifiableList(list2);
        this.f47000f = DesugarCollections.unmodifiableList(list3);
        this.f47001g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f47002i = DesugarCollections.unmodifiableList(list6);
        this.f47003j = t0Var;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f47004k = list9;
        this.f47005l = DesugarCollections.unmodifiableMap(map);
        this.f47006m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((k) list.get(i10)).f46990a;
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
                    k4.b bVar = (k4.b) list2.get(i12);
                    if (bVar.f13447b == i10 && bVar.f13448c == i11) {
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
        ArrayList c3 = c(0, this.f46999e, list);
        List list2 = Collections.EMPTY_LIST;
        return new m(this.f47007a, this.f47008b, c3, list2, c(1, this.f47001g, list), c(2, this.h, list), list2, this.f47003j, this.f47004k, this.f47009c, this.f47005l, this.f47006m);
    }
}
