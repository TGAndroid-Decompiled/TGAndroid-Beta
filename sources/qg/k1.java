package qg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k1 {
    public static final DispatchQueue f44492m = new DispatchQueue("ShapeDetector");
    public static final double f44493n = Math.sqrt(125000.0d) / 2.0d;
    public int f44494a;
    public ArrayList f44495b;
    public ArrayList f44496c;
    public boolean d;
    public org.telegram.ui.web.b1 f44497e;
    public Context f44498f;
    public SharedPreferences f44499g;
    public boolean h;
    public ArrayList f44500i;
    public AtomicBoolean f44501j;
    public AtomicBoolean f44502k;
    public g1 f44503l;

    public static i1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((h1) arrayList.get(0)).f44471a;
        double d10 = ((h1) arrayList.get(0)).f44472b;
        ?? obj = new Object();
        obj.f44476a = d;
        obj.f44477b = d10;
        obj.f44478c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            h1 h1Var = (h1) arrayList.get(i10);
            double d11 = h1Var.f44471a;
            double d12 = h1Var.f44472b;
            if (obj.f44476a >= d11) {
                obj.f44476a = d11;
            }
            if (obj.f44477b >= d12) {
                obj.f44477b = d12;
            }
            if (obj.f44478c <= d11) {
                obj.f44478c = d11;
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
            h1Var.f44471a += h1Var2.f44471a;
            h1Var.f44472b += h1Var2.f44472b;
        }
        h1Var.f44471a /= arrayList.size();
        h1Var.f44472b /= arrayList.size();
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
            double d11 = h1Var3.f44471a;
            double d12 = cos;
            double d13 = h1Var2.f44471a;
            double d14 = d11 - d13;
            double d15 = h1Var3.f44472b;
            double d16 = h1Var2.f44472b;
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
            double a2 = h1Var.a(h1Var2.f44471a, h1Var2.f44472b);
            double a10 = h1Var.a(h1Var3.f44471a, h1Var3.f44472b);
            double a11 = h1Var2.a(h1Var3.f44471a, h1Var3.f44472b);
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
            arrayList2.add(new h1(h1Var.f44471a, h1Var.f44472b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f44495b.clear();
        }
        f44492m.cancelRunnable(this.f44503l);
        this.f44502k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f44500i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f44498f);
            alertDialog$Builder.f20226a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new mg.j(13, this, arrayList));
            alertDialog$Builder.o();
            this.f44500i = null;
        }
    }
}
