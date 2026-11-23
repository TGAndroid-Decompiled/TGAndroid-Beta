package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.kb;
import h9.g2;
import h9.s1;
import java.util.ArrayList;
public final class j {
    public static final String f55417l;
    public static final String f55418m;
    public static final String f55419n;
    public static final String f55420o;
    public static final String f55421p;
    public static final String f55422q;
    public static final String f55423r;
    public static final String f55424s;
    public static final String f55425t;
    public static final String f55426u;
    public static final String v;
    public static final String f55427w;
    public static final String f55428x;
    public static final String f55429y;
    public final m f55430a;
    public final k1 f55431b;
    public final e2.y0 f55432c;
    public final e2.y0 d;
    public final Bundle f55433e;
    public final Bundle f55434f;
    public final f1 f55435g;
    public final h9.i0 h;
    public final h9.i0 f55436i;
    public final MediaSession.Token f55437j;
    public final h9.i0 f55438k;

    static {
        String str = h2.l0.f13778a;
        f55417l = Integer.toString(0, 36);
        f55418m = Integer.toString(1, 36);
        f55419n = Integer.toString(2, 36);
        f55420o = Integer.toString(9, 36);
        f55421p = Integer.toString(14, 36);
        f55422q = Integer.toString(13, 36);
        f55423r = Integer.toString(3, 36);
        f55424s = Integer.toString(4, 36);
        f55425t = Integer.toString(5, 36);
        f55426u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f55427w = Integer.toString(7, 36);
        f55428x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f55429y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, k1 k1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, f1 f1Var, MediaSession.Token token) {
        this.f55430a = mVar;
        this.h = i0Var;
        this.f55436i = i0Var2;
        this.f55438k = i0Var3;
        this.f55431b = k1Var;
        this.f55432c = y0Var;
        this.d = y0Var2;
        this.f55433e = bundle;
        this.f55434f = bundle2;
        this.f55435g = f1Var;
        this.f55437j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f55417l, 1010001300);
        bundle.putBinder(f55418m, this.f55430a.asBinder());
        bundle.putParcelable(f55419n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f55420o;
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
        h9.i0 i0Var2 = this.f55436i;
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
                bundle.putParcelableArrayList(f55421p, arrayList2);
            } else {
                s1 g10 = d.g(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g10.d);
                h9.g0 listIterator = g10.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i7));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        h9.i0 i0Var3 = this.f55438k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f55422q, arrayList4);
        }
        k1 k1Var = this.f55431b;
        k1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        g2 it = k1Var.f55450a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((j1) it.next()).a());
        }
        bundle2.putParcelableArrayList(k1.f55449b, arrayList5);
        bundle.putBundle(f55423r, bundle2);
        String str2 = f55424s;
        e2.y0 y0Var = this.f55432c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f55425t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f55426u, this.f55433e);
        bundle.putBundle(v, this.f55434f);
        bundle.putBundle(f55427w, this.f55435g.e(kb.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f55428x, 9);
        MediaSession.Token token = this.f55437j;
        if (token != null) {
            bundle.putParcelable(f55429y, token);
        }
        return bundle;
    }
}
