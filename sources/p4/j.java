package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.za;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53193l;
    public static final String f53194m;
    public static final String f53195n;
    public static final String f53196o;
    public static final String f53197p;
    public static final String f53198q;
    public static final String f53199r;
    public static final String f53200s;
    public static final String f53201t;
    public static final String f53202u;
    public static final String v;
    public static final String f53203w;
    public static final String f53204x;
    public static final String f53205y;
    public final m f53206a;
    public final j1 f53207b;
    public final e2.y0 f53208c;
    public final e2.y0 d;
    public final Bundle f53209e;
    public final Bundle f53210f;
    public final e1 f53211g;
    public final h9.i0 h;
    public final h9.i0 f53212i;
    public final MediaSession.Token f53213j;
    public final h9.i0 f53214k;

    static {
        String str = h2.m0.f14112a;
        f53193l = Integer.toString(0, 36);
        f53194m = Integer.toString(1, 36);
        f53195n = Integer.toString(2, 36);
        f53196o = Integer.toString(9, 36);
        f53197p = Integer.toString(14, 36);
        f53198q = Integer.toString(13, 36);
        f53199r = Integer.toString(3, 36);
        f53200s = Integer.toString(4, 36);
        f53201t = Integer.toString(5, 36);
        f53202u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53203w = Integer.toString(7, 36);
        f53204x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53205y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53206a = mVar;
        this.h = i0Var;
        this.f53212i = i0Var2;
        this.f53214k = i0Var3;
        this.f53207b = j1Var;
        this.f53208c = y0Var;
        this.d = y0Var2;
        this.f53209e = bundle;
        this.f53210f = bundle2;
        this.f53211g = e1Var;
        this.f53213j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53193l, 1010001300);
        bundle.putBinder(f53194m, this.f53206a.asBinder());
        bundle.putParcelable(f53195n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53196o;
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
        h9.i0 i0Var2 = this.f53212i;
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
                bundle.putParcelableArrayList(f53197p, arrayList2);
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
        h9.i0 i0Var3 = this.f53214k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53198q, arrayList4);
        }
        j1 j1Var = this.f53207b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53218a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53217b, arrayList5);
        bundle.putBundle(f53199r, bundle2);
        String str2 = f53200s;
        e2.y0 y0Var = this.f53208c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53201t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53202u, this.f53209e);
        bundle.putBundle(v, this.f53210f);
        bundle.putBundle(f53203w, this.f53211g.e(za.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53204x, 9);
        MediaSession.Token token = this.f53213j;
        if (token != null) {
            bundle.putParcelable(f53205y, token);
        }
        return bundle;
    }
}
