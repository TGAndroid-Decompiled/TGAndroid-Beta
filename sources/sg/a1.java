package sg;

import android.content.Context;
import android.content.SharedPreferences;
import hi.c7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.r5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class a1 {
    public static final r5 f57281m = new r5("ShapeDetector", true);
    public static final double f57282n = Math.sqrt(125000.0d) / 2.0d;
    public int f57283a;
    public ArrayList f57284b;
    public ArrayList f57285c;
    public boolean d;
    public c7 f57286e;
    public Context f57287f;
    public SharedPreferences f57288g;
    public boolean h;
    public ArrayList f57289i;
    public AtomicBoolean f57290j;
    public AtomicBoolean f57291k;
    public x0 f57292l;

    public static m8.d a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((y0) arrayList.get(0)).f57527a;
        double d2 = ((y0) arrayList.get(0)).f57528b;
        m8.d dVar = new m8.d(1);
        dVar.f20989b = d;
        dVar.f20990c = d2;
        dVar.d = d;
        dVar.f20991e = d2;
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            y0 y0Var = (y0) arrayList.get(i7);
            double d10 = y0Var.f57527a;
            double d11 = y0Var.f57528b;
            if (dVar.f20989b >= d10) {
                dVar.f20989b = d10;
            }
            if (dVar.f20990c >= d11) {
                dVar.f20990c = d11;
            }
            if (dVar.d <= d10) {
                dVar.d = d10;
            }
            if (dVar.f20991e <= d11) {
                dVar.f20991e = d11;
            }
        }
        return dVar;
    }

    public static y0 b(ArrayList arrayList) {
        y0 y0Var = new y0(0.0d, 0.0d);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            y0 y0Var2 = (y0) arrayList.get(i7);
            y0Var.f57527a += y0Var2.f57527a;
            y0Var.f57528b += y0Var2.f57528b;
        }
        y0Var.f57527a /= arrayList.size();
        y0Var.f57528b /= arrayList.size();
        return y0Var;
    }

    public static double d(ArrayList arrayList, y0 y0Var, ArrayList arrayList2, double d) {
        y0 y0Var2 = y0Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i7 = 0;
        while (i7 < min) {
            y0 y0Var3 = (y0) arrayList.get(i7);
            double d10 = y0Var3.f57527a;
            double d11 = cos;
            double d12 = y0Var2.f57527a;
            double d13 = d10 - d12;
            double d14 = y0Var3.f57528b;
            double d15 = y0Var2.f57528b;
            double d16 = d14 - d15;
            d2 += ((y0) arrayList2.get(i7)).a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i7++;
            y0Var2 = y0Var;
            cos = d11;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i7, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            y0 y0Var = (y0) arrayList.get(max - 1);
            y0 y0Var2 = (y0) arrayList.get(max);
            int i10 = max + 1;
            y0 y0Var3 = (y0) arrayList.get(i10);
            y0Var.getClass();
            double a10 = y0Var.a(y0Var2.f57527a, y0Var2.f57528b);
            double a11 = y0Var.a(y0Var3.f57527a, y0Var3.f57528b);
            double a12 = y0Var2.a(y0Var3.f57527a, y0Var3.f57528b);
            if ((Math.acos((((a11 * a11) + (a10 * a10)) - (a12 * a12)) / ((a10 * 2.0d) * a11)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i7 > 0) {
                    i7--;
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
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            y0 y0Var = (y0) arrayList.get(i7);
            arrayList2.add(new y0(y0Var.f57527a, y0Var.f57528b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f57284b.clear();
        }
        f57281m.cancelRunnable(this.f57292l);
        this.f57291k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f57289i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f57287f);
            alertDialog$Builder.f28835a.S = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new og.j(14, this, arrayList));
            alertDialog$Builder.p();
            this.f57289i = null;
        }
    }
}
