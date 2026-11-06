package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.za;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53219l;
    public static final String f53220m;
    public static final String f53221n;
    public static final String f53222o;
    public static final String f53223p;
    public static final String f53224q;
    public static final String f53225r;
    public static final String f53226s;
    public static final String f53227t;
    public static final String f53228u;
    public static final String v;
    public static final String f53229w;
    public static final String f53230x;
    public static final String f53231y;
    public final m f53232a;
    public final j1 f53233b;
    public final e2.y0 f53234c;
    public final e2.y0 d;
    public final Bundle f53235e;
    public final Bundle f53236f;
    public final e1 f53237g;
    public final h9.i0 h;
    public final h9.i0 f53238i;
    public final MediaSession.Token f53239j;
    public final h9.i0 f53240k;

    static {
        String str = h2.m0.f14112a;
        f53219l = Integer.toString(0, 36);
        f53220m = Integer.toString(1, 36);
        f53221n = Integer.toString(2, 36);
        f53222o = Integer.toString(9, 36);
        f53223p = Integer.toString(14, 36);
        f53224q = Integer.toString(13, 36);
        f53225r = Integer.toString(3, 36);
        f53226s = Integer.toString(4, 36);
        f53227t = Integer.toString(5, 36);
        f53228u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53229w = Integer.toString(7, 36);
        f53230x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53231y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53232a = mVar;
        this.h = i0Var;
        this.f53238i = i0Var2;
        this.f53240k = i0Var3;
        this.f53233b = j1Var;
        this.f53234c = y0Var;
        this.d = y0Var2;
        this.f53235e = bundle;
        this.f53236f = bundle2;
        this.f53237g = e1Var;
        this.f53239j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53219l, 1010001300);
        bundle.putBinder(f53220m, this.f53232a.asBinder());
        bundle.putParcelable(f53221n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53222o;
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
        h9.i0 i0Var2 = this.f53238i;
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
                bundle.putParcelableArrayList(f53223p, arrayList2);
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
        h9.i0 i0Var3 = this.f53240k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53224q, arrayList4);
        }
        j1 j1Var = this.f53233b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53244a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53243b, arrayList5);
        bundle.putBundle(f53225r, bundle2);
        String str2 = f53226s;
        e2.y0 y0Var = this.f53234c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53227t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53228u, this.f53235e);
        bundle.putBundle(v, this.f53236f);
        bundle.putBundle(f53229w, this.f53237g.e(za.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53230x, 9);
        MediaSession.Token token = this.f53239j;
        if (token != null) {
            bundle.putParcelable(f53231y, token);
        }
        return bundle;
    }
}
