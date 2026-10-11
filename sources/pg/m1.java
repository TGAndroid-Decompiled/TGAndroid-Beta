package pg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m1 {
    public static final DispatchQueue f45726m = new DispatchQueue("ShapeDetector");
    public static final double f45727n = Math.sqrt(125000.0d) / 2.0d;
    public int f45728a;
    public ArrayList f45729b;
    public ArrayList f45730c;
    public boolean d;
    public ii.q1 f45731e;
    public Context f45732f;
    public SharedPreferences f45733g;
    public boolean h;
    public ArrayList f45734i;
    public AtomicBoolean f45735j;
    public AtomicBoolean f45736k;
    public i1 f45737l;

    public static k1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((j1) arrayList.get(0)).f45702a;
        double d10 = ((j1) arrayList.get(0)).f45703b;
        ?? obj = new Object();
        obj.f45711a = d;
        obj.f45712b = d10;
        obj.f45713c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            j1 j1Var = (j1) arrayList.get(i10);
            double d11 = j1Var.f45702a;
            double d12 = j1Var.f45703b;
            if (obj.f45711a >= d11) {
                obj.f45711a = d11;
            }
            if (obj.f45712b >= d12) {
                obj.f45712b = d12;
            }
            if (obj.f45713c <= d11) {
                obj.f45713c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static j1 b(ArrayList arrayList) {
        j1 j1Var = new j1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j1 j1Var2 = (j1) arrayList.get(i10);
            j1Var.f45702a += j1Var2.f45702a;
            j1Var.f45703b += j1Var2.f45703b;
        }
        j1Var.f45702a /= arrayList.size();
        j1Var.f45703b /= arrayList.size();
        return j1Var;
    }

    public static double d(ArrayList arrayList, j1 j1Var, ArrayList arrayList2, double d) {
        j1 j1Var2 = j1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            j1 j1Var3 = (j1) arrayList.get(i10);
            double d11 = j1Var3.f45702a;
            double d12 = cos;
            double d13 = j1Var2.f45702a;
            double d14 = d11 - d13;
            double d15 = j1Var3.f45703b;
            double d16 = j1Var2.f45703b;
            double d17 = d15 - d16;
            d10 += ((j1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            j1Var2 = j1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            j1 j1Var = (j1) arrayList.get(max - 1);
            j1 j1Var2 = (j1) arrayList.get(max);
            int i11 = max + 1;
            j1 j1Var3 = (j1) arrayList.get(i11);
            j1Var.getClass();
            double a2 = j1Var.a(j1Var2.f45702a, j1Var2.f45703b);
            double a10 = j1Var.a(j1Var3.f45702a, j1Var3.f45703b);
            double a11 = j1Var2.a(j1Var3.f45702a, j1Var3.f45703b);
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
            j1 j1Var = (j1) arrayList.get(i10);
            arrayList2.add(new j1(j1Var.f45702a, j1Var.f45703b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f45729b.clear();
        }
        f45726m.cancelRunnable(this.f45737l);
        this.f45736k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f45734i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f45732f);
            alertDialog$Builder.f20368a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new lg.j(14, this, arrayList));
            alertDialog$Builder.o();
            this.f45734i = null;
        }
    }
}
