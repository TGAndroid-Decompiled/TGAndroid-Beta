package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.ab;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53310l;
    public static final String f53311m;
    public static final String f53312n;
    public static final String f53313o;
    public static final String f53314p;
    public static final String f53315q;
    public static final String f53316r;
    public static final String f53317s;
    public static final String f53318t;
    public static final String f53319u;
    public static final String v;
    public static final String f53320w;
    public static final String f53321x;
    public static final String f53322y;
    public final m f53323a;
    public final j1 f53324b;
    public final e2.y0 f53325c;
    public final e2.y0 d;
    public final Bundle f53326e;
    public final Bundle f53327f;
    public final e1 f53328g;
    public final h9.i0 h;
    public final h9.i0 f53329i;
    public final MediaSession.Token f53330j;
    public final h9.i0 f53331k;

    static {
        String str = h2.m0.f14112a;
        f53310l = Integer.toString(0, 36);
        f53311m = Integer.toString(1, 36);
        f53312n = Integer.toString(2, 36);
        f53313o = Integer.toString(9, 36);
        f53314p = Integer.toString(14, 36);
        f53315q = Integer.toString(13, 36);
        f53316r = Integer.toString(3, 36);
        f53317s = Integer.toString(4, 36);
        f53318t = Integer.toString(5, 36);
        f53319u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53320w = Integer.toString(7, 36);
        f53321x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53322y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53323a = mVar;
        this.h = i0Var;
        this.f53329i = i0Var2;
        this.f53331k = i0Var3;
        this.f53324b = j1Var;
        this.f53325c = y0Var;
        this.d = y0Var2;
        this.f53326e = bundle;
        this.f53327f = bundle2;
        this.f53328g = e1Var;
        this.f53330j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53310l, 1010001300);
        bundle.putBinder(f53311m, this.f53323a.asBinder());
        bundle.putParcelable(f53312n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53313o;
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
        h9.i0 i0Var2 = this.f53329i;
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
                bundle.putParcelableArrayList(f53314p, arrayList2);
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
        h9.i0 i0Var3 = this.f53331k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53315q, arrayList4);
        }
        j1 j1Var = this.f53324b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53335a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53334b, arrayList5);
        bundle.putBundle(f53316r, bundle2);
        String str2 = f53317s;
        e2.y0 y0Var = this.f53325c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53318t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53319u, this.f53326e);
        bundle.putBundle(v, this.f53327f);
        bundle.putBundle(f53320w, this.f53328g.e(ab.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53321x, 9);
        MediaSession.Token token = this.f53330j;
        if (token != null) {
            bundle.putParcelable(f53322y, token);
        }
        return bundle;
    }
}
