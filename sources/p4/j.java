package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.ab;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53217l;
    public static final String f53218m;
    public static final String f53219n;
    public static final String f53220o;
    public static final String f53221p;
    public static final String f53222q;
    public static final String f53223r;
    public static final String f53224s;
    public static final String f53225t;
    public static final String f53226u;
    public static final String v;
    public static final String f53227w;
    public static final String f53228x;
    public static final String f53229y;
    public final m f53230a;
    public final j1 f53231b;
    public final e2.y0 f53232c;
    public final e2.y0 d;
    public final Bundle f53233e;
    public final Bundle f53234f;
    public final e1 f53235g;
    public final h9.i0 h;
    public final h9.i0 f53236i;
    public final MediaSession.Token f53237j;
    public final h9.i0 f53238k;

    static {
        String str = h2.m0.f14112a;
        f53217l = Integer.toString(0, 36);
        f53218m = Integer.toString(1, 36);
        f53219n = Integer.toString(2, 36);
        f53220o = Integer.toString(9, 36);
        f53221p = Integer.toString(14, 36);
        f53222q = Integer.toString(13, 36);
        f53223r = Integer.toString(3, 36);
        f53224s = Integer.toString(4, 36);
        f53225t = Integer.toString(5, 36);
        f53226u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53227w = Integer.toString(7, 36);
        f53228x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53229y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53230a = mVar;
        this.h = i0Var;
        this.f53236i = i0Var2;
        this.f53238k = i0Var3;
        this.f53231b = j1Var;
        this.f53232c = y0Var;
        this.d = y0Var2;
        this.f53233e = bundle;
        this.f53234f = bundle2;
        this.f53235g = e1Var;
        this.f53237j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53217l, 1010001300);
        bundle.putBinder(f53218m, this.f53230a.asBinder());
        bundle.putParcelable(f53219n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53220o;
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
        h9.i0 i0Var2 = this.f53236i;
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
                bundle.putParcelableArrayList(f53221p, arrayList2);
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
        h9.i0 i0Var3 = this.f53238k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53222q, arrayList4);
        }
        j1 j1Var = this.f53231b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53242a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53241b, arrayList5);
        bundle.putBundle(f53223r, bundle2);
        String str2 = f53224s;
        e2.y0 y0Var = this.f53232c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53225t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53226u, this.f53233e);
        bundle.putBundle(v, this.f53234f);
        bundle.putBundle(f53227w, this.f53235g.e(ab.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53228x, 9);
        MediaSession.Token token = this.f53237j;
        if (token != null) {
            bundle.putParcelable(f53229y, token);
        }
        return bundle;
    }
}
