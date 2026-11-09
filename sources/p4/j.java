package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.ab;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53323l;
    public static final String f53324m;
    public static final String f53325n;
    public static final String f53326o;
    public static final String f53327p;
    public static final String f53328q;
    public static final String f53329r;
    public static final String f53330s;
    public static final String f53331t;
    public static final String f53332u;
    public static final String v;
    public static final String f53333w;
    public static final String f53334x;
    public static final String f53335y;
    public final m f53336a;
    public final j1 f53337b;
    public final e2.y0 f53338c;
    public final e2.y0 d;
    public final Bundle f53339e;
    public final Bundle f53340f;
    public final e1 f53341g;
    public final h9.i0 h;
    public final h9.i0 f53342i;
    public final MediaSession.Token f53343j;
    public final h9.i0 f53344k;

    static {
        String str = h2.m0.f14112a;
        f53323l = Integer.toString(0, 36);
        f53324m = Integer.toString(1, 36);
        f53325n = Integer.toString(2, 36);
        f53326o = Integer.toString(9, 36);
        f53327p = Integer.toString(14, 36);
        f53328q = Integer.toString(13, 36);
        f53329r = Integer.toString(3, 36);
        f53330s = Integer.toString(4, 36);
        f53331t = Integer.toString(5, 36);
        f53332u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53333w = Integer.toString(7, 36);
        f53334x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53335y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53336a = mVar;
        this.h = i0Var;
        this.f53342i = i0Var2;
        this.f53344k = i0Var3;
        this.f53337b = j1Var;
        this.f53338c = y0Var;
        this.d = y0Var2;
        this.f53339e = bundle;
        this.f53340f = bundle2;
        this.f53341g = e1Var;
        this.f53343j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53323l, 1010001300);
        bundle.putBinder(f53324m, this.f53336a.asBinder());
        bundle.putParcelable(f53325n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53326o;
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
        h9.i0 i0Var2 = this.f53342i;
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
                bundle.putParcelableArrayList(f53327p, arrayList2);
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
        h9.i0 i0Var3 = this.f53344k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53328q, arrayList4);
        }
        j1 j1Var = this.f53337b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53348a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53347b, arrayList5);
        bundle.putBundle(f53329r, bundle2);
        String str2 = f53330s;
        e2.y0 y0Var = this.f53338c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53331t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53332u, this.f53339e);
        bundle.putBundle(v, this.f53340f);
        bundle.putBundle(f53333w, this.f53341g.e(ab.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53334x, 9);
        MediaSession.Token token = this.f53343j;
        if (token != null) {
            bundle.putParcelable(f53335y, token);
        }
        return bundle;
    }
}
