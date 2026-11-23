package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.kb;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f55299l;
    public static final String f55300m;
    public static final String f55301n;
    public static final String f55302o;
    public static final String f55303p;
    public static final String f55304q;
    public static final String f55305r;
    public static final String f55306s;
    public static final String f55307t;
    public static final String f55308u;
    public static final String v;
    public static final String f55309w;
    public static final String f55310x;
    public static final String f55311y;
    public final m f55312a;
    public final l1 f55313b;
    public final e2.y0 f55314c;
    public final e2.y0 d;
    public final Bundle f55315e;
    public final Bundle f55316f;
    public final g1 f55317g;
    public final h9.i0 h;
    public final h9.i0 f55318i;
    public final MediaSession.Token f55319j;
    public final h9.i0 f55320k;

    static {
        String str = h2.l0.f13778a;
        f55299l = Integer.toString(0, 36);
        f55300m = Integer.toString(1, 36);
        f55301n = Integer.toString(2, 36);
        f55302o = Integer.toString(9, 36);
        f55303p = Integer.toString(14, 36);
        f55304q = Integer.toString(13, 36);
        f55305r = Integer.toString(3, 36);
        f55306s = Integer.toString(4, 36);
        f55307t = Integer.toString(5, 36);
        f55308u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f55309w = Integer.toString(7, 36);
        f55310x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f55311y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, l1 l1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, g1 g1Var, MediaSession.Token token) {
        this.f55312a = mVar;
        this.h = i0Var;
        this.f55318i = i0Var2;
        this.f55320k = i0Var3;
        this.f55313b = l1Var;
        this.f55314c = y0Var;
        this.d = y0Var2;
        this.f55315e = bundle;
        this.f55316f = bundle2;
        this.f55317g = g1Var;
        this.f55319j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f55299l, 1010001300);
        bundle.putBinder(f55300m, this.f55312a.asBinder());
        bundle.putParcelable(f55301n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f55302o;
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
        h9.i0 i0Var2 = this.f55318i;
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
                bundle.putParcelableArrayList(f55303p, arrayList2);
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
        h9.i0 i0Var3 = this.f55320k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f55304q, arrayList4);
        }
        l1 l1Var = this.f55313b;
        l1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = l1Var.f55334a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((k1) it.next()).a());
        }
        bundle2.putParcelableArrayList(l1.f55333b, arrayList5);
        bundle.putBundle(f55305r, bundle2);
        String str2 = f55306s;
        e2.y0 y0Var = this.f55314c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f55307t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f55308u, this.f55315e);
        bundle.putBundle(v, this.f55316f);
        bundle.putBundle(f55309w, this.f55317g.e(kb.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f55310x, 9);
        MediaSession.Token token = this.f55319j;
        if (token != null) {
            bundle.putParcelable(f55311y, token);
        }
        return bundle;
    }
}
