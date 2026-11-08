package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.ab;
import h9.h2;
import h9.t1;
import java.util.ArrayList;
public final class j {
    public static final String f53311l;
    public static final String f53312m;
    public static final String f53313n;
    public static final String f53314o;
    public static final String f53315p;
    public static final String f53316q;
    public static final String f53317r;
    public static final String f53318s;
    public static final String f53319t;
    public static final String f53320u;
    public static final String v;
    public static final String f53321w;
    public static final String f53322x;
    public static final String f53323y;
    public final m f53324a;
    public final j1 f53325b;
    public final e2.y0 f53326c;
    public final e2.y0 d;
    public final Bundle f53327e;
    public final Bundle f53328f;
    public final e1 f53329g;
    public final h9.i0 h;
    public final h9.i0 f53330i;
    public final MediaSession.Token f53331j;
    public final h9.i0 f53332k;

    static {
        String str = h2.m0.f14112a;
        f53311l = Integer.toString(0, 36);
        f53312m = Integer.toString(1, 36);
        f53313n = Integer.toString(2, 36);
        f53314o = Integer.toString(9, 36);
        f53315p = Integer.toString(14, 36);
        f53316q = Integer.toString(13, 36);
        f53317r = Integer.toString(3, 36);
        f53318s = Integer.toString(4, 36);
        f53319t = Integer.toString(5, 36);
        f53320u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f53321w = Integer.toString(7, 36);
        f53322x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f53323y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f53324a = mVar;
        this.h = i0Var;
        this.f53330i = i0Var2;
        this.f53332k = i0Var3;
        this.f53325b = j1Var;
        this.f53326c = y0Var;
        this.d = y0Var2;
        this.f53327e = bundle;
        this.f53328f = bundle2;
        this.f53329g = e1Var;
        this.f53331j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f53311l, 1010001300);
        bundle.putBinder(f53312m, this.f53324a.asBinder());
        bundle.putParcelable(f53313n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f53314o;
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
        h9.i0 i0Var2 = this.f53330i;
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
                bundle.putParcelableArrayList(f53315p, arrayList2);
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
        h9.i0 i0Var3 = this.f53332k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f53316q, arrayList4);
        }
        j1 j1Var = this.f53325b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        h2 it = j1Var.f53336a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f53335b, arrayList5);
        bundle.putBundle(f53317r, bundle2);
        String str2 = f53318s;
        e2.y0 y0Var = this.f53326c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f53319t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f53320u, this.f53327e);
        bundle.putBundle(v, this.f53328f);
        bundle.putBundle(f53321w, this.f53329g.e(ab.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f53322x, 9);
        MediaSession.Token token = this.f53331j;
        if (token != null) {
            bundle.putParcelable(f53323y, token);
        }
        return bundle;
    }
}
