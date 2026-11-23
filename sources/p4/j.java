package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.jb;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f55334l;
    public static final String f55335m;
    public static final String f55336n;
    public static final String f55337o;
    public static final String f55338p;
    public static final String f55339q;
    public static final String f55340r;
    public static final String f55341s;
    public static final String f55342t;
    public static final String f55343u;
    public static final String v;
    public static final String f55344w;
    public static final String f55345x;
    public static final String f55346y;
    public final m f55347a;
    public final l1 f55348b;
    public final e2.y0 f55349c;
    public final e2.y0 d;
    public final Bundle f55350e;
    public final Bundle f55351f;
    public final g1 f55352g;
    public final h9.i0 h;
    public final h9.i0 f55353i;
    public final MediaSession.Token f55354j;
    public final h9.i0 f55355k;

    static {
        String str = h2.l0.f13815a;
        f55334l = Integer.toString(0, 36);
        f55335m = Integer.toString(1, 36);
        f55336n = Integer.toString(2, 36);
        f55337o = Integer.toString(9, 36);
        f55338p = Integer.toString(14, 36);
        f55339q = Integer.toString(13, 36);
        f55340r = Integer.toString(3, 36);
        f55341s = Integer.toString(4, 36);
        f55342t = Integer.toString(5, 36);
        f55343u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f55344w = Integer.toString(7, 36);
        f55345x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f55346y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, l1 l1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, g1 g1Var, MediaSession.Token token) {
        this.f55347a = mVar;
        this.h = i0Var;
        this.f55353i = i0Var2;
        this.f55355k = i0Var3;
        this.f55348b = l1Var;
        this.f55349c = y0Var;
        this.d = y0Var2;
        this.f55350e = bundle;
        this.f55351f = bundle2;
        this.f55352g = g1Var;
        this.f55354j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f55334l, 1010001300);
        bundle.putBinder(f55335m, this.f55347a.asBinder());
        bundle.putParcelable(f55336n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f55337o;
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
        h9.i0 i0Var2 = this.f55353i;
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
                bundle.putParcelableArrayList(f55338p, arrayList2);
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
        h9.i0 i0Var3 = this.f55355k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f55339q, arrayList4);
        }
        l1 l1Var = this.f55348b;
        l1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = l1Var.f55372a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((k1) it.next()).a());
        }
        bundle2.putParcelableArrayList(l1.f55371b, arrayList5);
        bundle.putBundle(f55340r, bundle2);
        String str2 = f55341s;
        e2.y0 y0Var = this.f55349c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f55342t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f55343u, this.f55350e);
        bundle.putBundle(v, this.f55351f);
        bundle.putBundle(f55344w, this.f55352g.e(jb.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f55345x, 9);
        MediaSession.Token token = this.f55354j;
        if (token != null) {
            bundle.putParcelable(f55346y, token);
        }
        return bundle;
    }
}
