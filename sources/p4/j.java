package p4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import c8.cb;
import h9.g2;
import h9.s1;
import java.util.ArrayList;
public final class j {
    public static final String f54728l;
    public static final String f54729m;
    public static final String f54730n;
    public static final String f54731o;
    public static final String f54732p;
    public static final String f54733q;
    public static final String f54734r;
    public static final String f54735s;
    public static final String f54736t;
    public static final String f54737u;
    public static final String v;
    public static final String f54738w;
    public static final String f54739x;
    public static final String f54740y;
    public final m f54741a;
    public final j1 f54742b;
    public final e2.y0 f54743c;
    public final e2.y0 d;
    public final Bundle f54744e;
    public final Bundle f54745f;
    public final e1 f54746g;
    public final h9.i0 h;
    public final h9.i0 f54747i;
    public final MediaSession.Token f54748j;
    public final h9.i0 f54749k;

    static {
        String str = h2.l0.f13471a;
        f54728l = Integer.toString(0, 36);
        f54729m = Integer.toString(1, 36);
        f54730n = Integer.toString(2, 36);
        f54731o = Integer.toString(9, 36);
        f54732p = Integer.toString(14, 36);
        f54733q = Integer.toString(13, 36);
        f54734r = Integer.toString(3, 36);
        f54735s = Integer.toString(4, 36);
        f54736t = Integer.toString(5, 36);
        f54737u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f54738w = Integer.toString(7, 36);
        f54739x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f54740y = Integer.toString(12, 36);
    }

    public j(m mVar, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, j1 j1Var, e2.y0 y0Var, e2.y0 y0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f54741a = mVar;
        this.h = i0Var;
        this.f54747i = i0Var2;
        this.f54749k = i0Var3;
        this.f54742b = j1Var;
        this.f54743c = y0Var;
        this.d = y0Var2;
        this.f54744e = bundle;
        this.f54745f = bundle2;
        this.f54746g = e1Var;
        this.f54748j = token;
    }

    public final Bundle a(int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(f54728l, 1010001300);
        bundle.putBinder(f54729m, this.f54741a.asBinder());
        bundle.putParcelable(f54730n, null);
        h9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f54731o;
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
        h9.i0 i0Var2 = this.f54747i;
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
                bundle.putParcelableArrayList(f54732p, arrayList2);
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
        h9.i0 i0Var3 = this.f54749k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i7));
            }
            bundle.putParcelableArrayList(f54733q, arrayList4);
        }
        j1 j1Var = this.f54742b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        g2 it = j1Var.f54753a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((i1) it.next()).a());
        }
        bundle2.putParcelableArrayList(j1.f54752b, arrayList5);
        bundle.putBundle(f54734r, bundle2);
        String str2 = f54735s;
        e2.y0 y0Var = this.f54743c;
        bundle.putBundle(str2, y0Var.b());
        String str3 = f54736t;
        e2.y0 y0Var2 = this.d;
        bundle.putBundle(str3, y0Var2.b());
        bundle.putBundle(f54737u, this.f54744e);
        bundle.putBundle(v, this.f54745f);
        bundle.putBundle(f54738w, this.f54746g.e(cb.a(y0Var, y0Var2), false, false).f(i7));
        bundle.putInt(f54739x, 9);
        MediaSession.Token token = this.f54748j;
        if (token != null) {
            bundle.putParcelable(f54740y, token);
        }
        return bundle;
    }
}
