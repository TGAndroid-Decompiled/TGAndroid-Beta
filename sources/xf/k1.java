package xf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.i9;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class k1 {
    public static final DispatchQueue f49254m = new DispatchQueue("ShapeDetector");
    public static final double f49255n = Math.sqrt(125000.0d) / 2.0d;
    public int f49256a;
    public ArrayList f49257b;
    public ArrayList f49258c;
    public boolean d;
    public i9 f49259e;
    public Context f49260f;
    public SharedPreferences f49261g;
    public boolean h;
    public ArrayList f49262i;
    public AtomicBoolean f49263j;
    public AtomicBoolean f49264k;
    public g1 f49265l;

    public static i1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((h1) arrayList.get(0)).f49234a;
        double d9 = ((h1) arrayList.get(0)).f49235b;
        ?? obj = new Object();
        obj.f49243a = d;
        obj.f49244b = d9;
        obj.f49245c = d;
        obj.d = d9;
        for (int i9 = 1; i9 < arrayList.size(); i9++) {
            h1 h1Var = (h1) arrayList.get(i9);
            double d10 = h1Var.f49234a;
            double d11 = h1Var.f49235b;
            if (obj.f49243a >= d10) {
                obj.f49243a = d10;
            }
            if (obj.f49244b >= d11) {
                obj.f49244b = d11;
            }
            if (obj.f49245c <= d10) {
                obj.f49245c = d10;
            }
            if (obj.d <= d11) {
                obj.d = d11;
            }
        }
        return obj;
    }

    public static h1 b(ArrayList arrayList) {
        h1 h1Var = new h1(0.0d, 0.0d);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            h1 h1Var2 = (h1) arrayList.get(i9);
            h1Var.f49234a += h1Var2.f49234a;
            h1Var.f49235b += h1Var2.f49235b;
        }
        h1Var.f49234a /= arrayList.size();
        h1Var.f49235b /= arrayList.size();
        return h1Var;
    }

    public static double d(ArrayList arrayList, h1 h1Var, ArrayList arrayList2, double d) {
        h1 h1Var2 = h1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d9 = 0.0d;
        int i9 = 0;
        while (i9 < min) {
            h1 h1Var3 = (h1) arrayList.get(i9);
            double d10 = h1Var3.f49234a;
            double d11 = cos;
            double d12 = h1Var2.f49234a;
            double d13 = d10 - d12;
            double d14 = h1Var3.f49235b;
            double d15 = h1Var2.f49235b;
            double d16 = d14 - d15;
            d9 += ((h1) arrayList2.get(i9)).a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i9++;
            h1Var2 = h1Var;
            cos = d11;
        }
        return d9 / arrayList.size();
    }

    public static int e(int i9, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            h1 h1Var = (h1) arrayList.get(max - 1);
            h1 h1Var2 = (h1) arrayList.get(max);
            int i10 = max + 1;
            h1 h1Var3 = (h1) arrayList.get(i10);
            h1Var.getClass();
            double a2 = h1Var.a(h1Var2.f49234a, h1Var2.f49235b);
            double a3 = h1Var.a(h1Var3.f49234a, h1Var3.f49235b);
            double a10 = h1Var2.a(h1Var3.f49234a, h1Var3.f49235b);
            if ((Math.acos((((a3 * a3) + (a2 * a2)) - (a10 * a10)) / ((a2 * 2.0d) * a3)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i9 > 0) {
                    i9--;
                } else {
                    return max;
                }
            }
            max = i10;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            h1 h1Var = (h1) arrayList.get(i9);
            arrayList2.add(new h1(h1Var.f49234a, h1Var.f49235b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f49257b.clear();
        }
        f49254m.cancelRunnable(this.f49265l);
        this.f49264k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f49262i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f49260f);
            alertDialog$Builder.f22702a.N = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new org.telegram.ui.v(13, this, arrayList));
            alertDialog$Builder.o();
            this.f49262i = null;
        }
    }
}
