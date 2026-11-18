package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.jb;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f55289l;
    public static final String f55290m;
    public static final String f55291n;
    public static final String f55292o;
    public static final String f55293p;
    public static final String f55294q;
    public static final String f55295r;
    public static final String f55296s;
    public static final String f55297t;
    public static final String f55298u;
    public static final String v;
    public static final String f55299w;
    public static final String f55300x;
    public static final String f55301y;
    public final m f55302a;
    public final l1 f55303b;
    public final e2.y0 f55304c;
    public final e2.y0 d;
    public final Bundle f55305e;
    public final Bundle f55306f;
    public final g1 f55307g;
    public final h9.i0 h;
    public final h9.i0 f55308i;
    public final MediaSession.Token f55309j;
    public final h9.i0 f55310k;

    static {
        String str = h2.l0.f13786a;
        f55289l = Integer.toString(0, 36);
        f55290m = Integer.toString(1, 36);
        f55291n = Integer.toString(2, 36);
        f55292o = Integer.toString(9, 36);
        f55293p = Integer.toString(14, 36);
        f55294q = Integer.toString(13, 36);
        f55295r = Integer.toString(3, 36);
        f55296s = Integer.toString(4, 36);
        f55297t = Integer.toString(5, 36);
        f55298u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f55299w = Integer.toString(7, 36);
        f55300x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f55301y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, l1 l1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, g1 g1Var, MediaSession.Token token) {
        this.f55302a = mVar;
        this.h = i0Var;
        this.f55308i = i0Var2;
        this.f55310k = i0Var3;
        this.f55303b = l1Var;
        this.f55304c = y0Var;
        this.d = y0Var2;
        this.f55305e = bundle;
        this.f55306f = bundle2;
        this.f55307g = g1Var;
        this.f55309j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f55289l, 1010001300);
        bundle.putBinder(f55290m, this.f55302a.asBinder());
        bundle.putParcelable(f55291n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f55292o;
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
        h9.i0 i0Var2 = this.f55308i;
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
                bundle.putParcelableArrayList(f55293p, arrayList2);
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
        h9.i0 i0Var3 = this.f55310k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f55294q, arrayList4);
        }
        l1 l1Var = this.f55303b;
        l1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = l1Var.f55324a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((k1) it.next()).a());
        }
        bundle2.putParcelableArrayList(l1.f55323b, arrayList5);
        bundle.putBundle(f55295r, bundle2);
        String str2 = f55296s;
        e2.y0 y0Var = this.f55304c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f55297t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f55298u, this.f55305e);
        bundle.putBundle(v, this.f55306f);
        bundle.putBundle(f55299w, this.f55307g.e(jb.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f55300x, 9);
        MediaSession.Token token = this.f55309j;
        if (token != null) {
            bundle.putParcelable(f55301y, token);
        }
        return bundle;
    }
}
