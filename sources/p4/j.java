package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.jb;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f55330l;
    public static final String f55331m;
    public static final String f55332n;
    public static final String f55333o;
    public static final String f55334p;
    public static final String f55335q;
    public static final String f55336r;
    public static final String f55337s;
    public static final String f55338t;
    public static final String f55339u;
    public static final String v;
    public static final String f55340w;
    public static final String f55341x;
    public static final String f55342y;
    public final m f55343a;
    public final l1 f55344b;
    public final e2.y0 f55345c;
    public final e2.y0 d;
    public final Bundle f55346e;
    public final Bundle f55347f;
    public final g1 f55348g;
    public final h9.i0 h;
    public final h9.i0 f55349i;
    public final MediaSession.Token f55350j;
    public final h9.i0 f55351k;

    static {
        String str = h2.l0.f13812a;
        f55330l = Integer.toString(0, 36);
        f55331m = Integer.toString(1, 36);
        f55332n = Integer.toString(2, 36);
        f55333o = Integer.toString(9, 36);
        f55334p = Integer.toString(14, 36);
        f55335q = Integer.toString(13, 36);
        f55336r = Integer.toString(3, 36);
        f55337s = Integer.toString(4, 36);
        f55338t = Integer.toString(5, 36);
        f55339u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f55340w = Integer.toString(7, 36);
        f55341x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f55342y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, l1 l1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, g1 g1Var, MediaSession.Token token) {
        this.f55343a = mVar;
        this.h = i0Var;
        this.f55349i = i0Var2;
        this.f55351k = i0Var3;
        this.f55344b = l1Var;
        this.f55345c = y0Var;
        this.d = y0Var2;
        this.f55346e = bundle;
        this.f55347f = bundle2;
        this.f55348g = g1Var;
        this.f55350j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f55330l, 1010001300);
        bundle.putBinder(f55331m, this.f55343a.asBinder());
        bundle.putParcelable(f55332n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f55333o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                arrayList.add(((d) obj).k(i7));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        h9.i0 i0Var2 = this.f55349i;
        if (!i0Var2.isEmpty()) {
            if (i7 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                int size2 = i0Var2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = i0Var2.get(i11);
                    i11++;
                    arrayList2.add(((d) obj2).k(i7));
                }
                bundle.putParcelableArrayList(f55334p, arrayList2);
            } else {
                t1 g10 = d.g(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g10.d);
                h9.g0 listIterator = g10.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i7));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        h9.i0 i0Var3 = this.f55351k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f55335q, arrayList4);
        }
        l1 l1Var = this.f55344b;
        l1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = l1Var.f55368a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((k1) it.next()).a());
        }
        bundle2.putParcelableArrayList(l1.f55367b, arrayList5);
        bundle.putBundle(f55336r, bundle2);
        String str2 = f55337s;
        e2.y0 y0Var = this.f55345c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f55338t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f55339u, this.f55346e);
        bundle.putBundle(v, this.f55347f);
        bundle.putBundle(f55340w, this.f55348g.e(jb.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f55341x, 9);
        MediaSession.Token token = this.f55350j;
        if (token != null) {
            bundle.putParcelable(f55342y, token);
        }
        return bundle;
    }
}
