package pg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k1 {
    public static final DispatchQueue f40923m = new DispatchQueue("ShapeDetector");
    public static final double f40924n = Math.sqrt(125000.0d) / 2.0d;
    public int f40925a;
    public ArrayList f40926b;
    public ArrayList f40927c;
    public boolean d;
    public org.telegram.ui.web.b1 e;
    public Context f40928f;
    public SharedPreferences f40929g;
    public boolean h;
    public ArrayList f40930i;
    public AtomicBoolean f40931j;
    public AtomicBoolean f40932k;
    public g1 f40933l;

    public static i1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((h1) arrayList.get(0)).f40903a;
        double d10 = ((h1) arrayList.get(0)).f40904b;
        ?? obj = new Object();
        obj.f40908a = d;
        obj.f40909b = d10;
        obj.f40910c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            h1 h1Var = (h1) arrayList.get(i10);
            double d11 = h1Var.f40903a;
            double d12 = h1Var.f40904b;
            if (obj.f40908a >= d11) {
                obj.f40908a = d11;
            }
            if (obj.f40909b >= d12) {
                obj.f40909b = d12;
            }
            if (obj.f40910c <= d11) {
                obj.f40910c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static h1 b(ArrayList arrayList) {
        h1 h1Var = new h1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h1 h1Var2 = (h1) arrayList.get(i10);
            h1Var.f40903a += h1Var2.f40903a;
            h1Var.f40904b += h1Var2.f40904b;
        }
        h1Var.f40903a /= arrayList.size();
        h1Var.f40904b /= arrayList.size();
        return h1Var;
    }

    public static double d(ArrayList arrayList, h1 h1Var, ArrayList arrayList2, double d) {
        h1 h1Var2 = h1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            h1 h1Var3 = (h1) arrayList.get(i10);
            double d11 = h1Var3.f40903a;
            double d12 = cos;
            double d13 = h1Var2.f40903a;
            double d14 = d11 - d13;
            double d15 = h1Var3.f40904b;
            double d16 = h1Var2.f40904b;
            double d17 = d15 - d16;
            d10 += ((h1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            h1Var2 = h1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            h1 h1Var = (h1) arrayList.get(max - 1);
            h1 h1Var2 = (h1) arrayList.get(max);
            int i11 = max + 1;
            h1 h1Var3 = (h1) arrayList.get(i11);
            h1Var.getClass();
            double a2 = h1Var.a(h1Var2.f40903a, h1Var2.f40904b);
            double a10 = h1Var.a(h1Var3.f40903a, h1Var3.f40904b);
            double a11 = h1Var2.a(h1Var3.f40903a, h1Var3.f40904b);
            if ((Math.acos((((a10 * a10) + (a2 * a2)) - (a11 * a11)) / ((a2 * 2.0d) * a10)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i10 > 0) {
                    i10--;
                } else {
                    return max;
                }
            }
            max = i11;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h1 h1Var = (h1) arrayList.get(i10);
            arrayList2.add(new h1(h1Var.f40903a, h1Var.f40904b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f40926b.clear();
        }
        f40923m.cancelRunnable(this.f40933l);
        this.f40932k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f40930i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f40928f);
            alertDialog$Builder.f18447a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new lg.j(13, this, arrayList));
            alertDialog$Builder.o();
            this.f40930i = null;
        }
    }
}
