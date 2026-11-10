package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.ab;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53322l;
    public static final String f53323m;
    public static final String f53324n;
    public static final String f53325o;
    public static final String f53326p;
    public static final String f53327q;
    public static final String f53328r;
    public static final String f53329s;
    public static final String f53330t;
    public static final String f53331u;
    public static final String v;
    public static final String f53332w;
    public static final String f53333x;
    public static final String f53334y;
    public final m f53335a;
    public final j1 f53336b;
    public final e2.y0 f53337c;
    public final e2.y0 d;
    public final Bundle f53338e;
    public final Bundle f53339f;
    public final e1 f53340g;
    public final h9.i0 h;
    public final h9.i0 f53341i;
    public final MediaSession.Token f53342j;
    public final h9.i0 f53343k;

    static {
        String str = h2.m0.f14114a;
        f53322l = Integer.toString(0, 36);
        f53323m = Integer.toString(1, 36);
        f53324n = Integer.toString(2, 36);
        f53325o = Integer.toString(9, 36);
        f53326p = Integer.toString(14, 36);
        f53327q = Integer.toString(13, 36);
        f53328r = Integer.toString(3, 36);
        f53329s = Integer.toString(4, 36);
        f53330t = Integer.toString(5, 36);
        f53331u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53332w = Integer.toString(7, 36);
        f53333x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53334y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53335a = mVar;
        this.h = i0Var;
        this.f53341i = i0Var2;
        this.f53343k = i0Var3;
        this.f53336b = j1Var;
        this.f53337c = y0Var;
        this.d = y0Var2;
        this.f53338e = bundle;
        this.f53339f = bundle2;
        this.f53340g = e1Var;
        this.f53342j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53322l, 1010001300);
        bundle.putBinder(f53323m, this.f53335a.asBinder());
        bundle.putParcelable(f53324n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53325o;
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
        h9.i0 i0Var2 = this.f53341i;
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
                bundle.putParcelableArrayList(f53326p, arrayList2);
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
        h9.i0 i0Var3 = this.f53343k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53327q, arrayList4);
        }
        j1 j1Var = this.f53336b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53347a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53346b, arrayList5);
        bundle.putBundle(f53328r, bundle2);
        String str2 = f53329s;
        e2.y0 y0Var = this.f53337c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53330t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53331u, this.f53338e);
        bundle.putBundle(v, this.f53339f);
        bundle.putBundle(f53332w, this.f53340g.e(ab.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53333x, 9);
        MediaSession.Token token = this.f53342j;
        if (token != null) {
            bundle.putParcelable(f53334y, token);
        }
        return bundle;
    }
}
