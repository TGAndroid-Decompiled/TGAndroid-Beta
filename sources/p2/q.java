package p2;

import android.net.Uri;
import b2.i1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
public final class q extends r {
    public static final q f44027n;
    public final List d;
    public final List e;
    public final List f44028f;
    public final List f44029g;
    public final List h;
    public final List f44030i;
    public final b2.w f44031j;
    public final List f44032k;
    public final Map f44033l;
    public final List f44034m;

    static {
        List list = Collections.EMPTY_LIST;
        f44027n = new q("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public q(String str, List list, List list2, List list3, List list4, List list5, List list6, b2.w wVar, List list7, boolean z10, Map map, List list8) {
        super(str, list, z10);
        List list9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = ((p) list2.get(i10)).f44022a;
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
        this.f44028f = DesugarCollections.unmodifiableList(list3);
        this.f44029g = DesugarCollections.unmodifiableList(list4);
        this.h = DesugarCollections.unmodifiableList(list5);
        this.f44030i = DesugarCollections.unmodifiableList(list6);
        this.f44031j = wVar;
        if (list7 != null) {
            list9 = DesugarCollections.unmodifiableList(list7);
        } else {
            list9 = null;
        }
        this.f44032k = list9;
        this.f44033l = DesugarCollections.unmodifiableMap(map);
        this.f44034m = DesugarCollections.unmodifiableList(list8);
    }

    public static void b(ArrayList arrayList, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((o) list.get(i10)).f44019a;
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
                    if (i1Var.f3786b == i10 && i1Var.f3787c == i11) {
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
        return new q(this.f44035a, this.f44036b, c10, list2, c(1, this.f44029g, list), c(2, this.h, list), list2, this.f44031j, this.f44032k, this.f44037c, this.f44033l, this.f44034m);
    }
}
