package p2;

import android.net.Uri;
import b2.i1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class p extends q {
    public static final p f44022n;
    public final List d;
    public final List e;
    public final List f44023f;
    public final List f44024g;
    public final List h;
    public final List f44025i;
    public final b2.w f44026j;
    public final List f44027k;
    public final Map f44028l;
    public final List f44029m;

    static {
        List list = Collections.EMPTY_LIST;
        f44022n = new p("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public p(String str, List list, List list2, List list3, List list4, List list5, List list6, b2.w wVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((o) list2.get(i10)).f44017a;
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
        this.f44023f = DesugarCollections.unmodifiableList(list3);
        this.f44024g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f44025i = DesugarCollections.unmodifiableList(list6);
        this.f44026j = wVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f44027k = list9;
        this.f44028l = DesugarCollections.unmodifiableMap(map);
        this.f44029m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((n) list.get(i10)).f44014a;
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
                    i1 i1Var = (i1) list2.get(i12);
                    if (i1Var.f3790b == i10 && i1Var.f3791c == i11) {
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
        ArrayList c10 = c(0, this.e, list);
        List list2 = Collections.EMPTY_LIST;
        return new p(this.f44030a, this.f44031b, c10, list2, c(1, this.f44024g, list), c(2, this.h, list), list2, this.f44026j, this.f44027k, this.f44032c, this.f44028l, this.f44029m);
    }
}
