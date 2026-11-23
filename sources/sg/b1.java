package sg;

import android.content.Context;
import android.content.SharedPreferences;
import hi.t6;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.r5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b1 {
    public static final r5 f57173m = new r5("ShapeDetector", true);
    public static final double f57174n = Math.sqrt(125000.0d) / 2.0d;
    public int f57175a;
    public ArrayList f57176b;
    public ArrayList f57177c;
    public boolean d;
    public t6 f57178e;
    public Context f57179f;
    public SharedPreferences f57180g;
    public boolean h;
    public ArrayList f57181i;
    public AtomicBoolean f57182j;
    public AtomicBoolean f57183k;
    public y0 f57184l;

    public static m8.d a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((z0) arrayList.get(0)).f57422a;
        double d2 = ((z0) arrayList.get(0)).f57423b;
        m8.d dVar = new m8.d(1);
        dVar.f20893b = d;
        dVar.f20894c = d2;
        dVar.d = d;
        dVar.f20895e = d2;
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            z0 z0Var = (z0) arrayList.get(i7);
            double d10 = z0Var.f57422a;
            double d11 = z0Var.f57423b;
            if (dVar.f20893b >= d10) {
                dVar.f20893b = d10;
            }
            if (dVar.f20894c >= d11) {
                dVar.f20894c = d11;
            }
            if (dVar.d <= d10) {
                dVar.d = d10;
            }
            if (dVar.f20895e <= d11) {
                dVar.f20895e = d11;
            }
        }
        return dVar;
    }

    public static z0 b(ArrayList arrayList) {
        z0 z0Var = new z0(0.0d, 0.0d);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            z0 z0Var2 = (z0) arrayList.get(i7);
            z0Var.f57422a += z0Var2.f57422a;
            z0Var.f57423b += z0Var2.f57423b;
        }
        z0Var.f57422a /= arrayList.size();
        z0Var.f57423b /= arrayList.size();
        return z0Var;
    }

    public static double d(ArrayList arrayList, z0 z0Var, ArrayList arrayList2, double d) {
        z0 z0Var2 = z0Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i7 = 0;
        while (i7 < min) {
            z0 z0Var3 = (z0) arrayList.get(i7);
            double d10 = z0Var3.f57422a;
            double d11 = cos;
            double d12 = z0Var2.f57422a;
            double d13 = d10 - d12;
            double d14 = z0Var3.f57423b;
            double d15 = z0Var2.f57423b;
            double d16 = d14 - d15;
            d2 += ((z0) arrayList2.get(i7)).a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i7++;
            z0Var2 = z0Var;
            cos = d11;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i7, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            z0 z0Var = (z0) arrayList.get(max - 1);
            z0 z0Var2 = (z0) arrayList.get(max);
            int i10 = max + 1;
            z0 z0Var3 = (z0) arrayList.get(i10);
            z0Var.getClass();
            double a10 = z0Var.a(z0Var2.f57422a, z0Var2.f57423b);
            double a11 = z0Var.a(z0Var3.f57422a, z0Var3.f57423b);
            double a12 = z0Var2.a(z0Var3.f57422a, z0Var3.f57423b);
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
            z0 z0Var = (z0) arrayList.get(i7);
            arrayList2.add(new z0(z0Var.f57422a, z0Var.f57423b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f57176b.clear();
        }
        f57173m.cancelRunnable(this.f57184l);
        this.f57183k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f57181i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f57179f);
            alertDialog$Builder.f28743a.S = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new og.j(14, this, arrayList));
            alertDialog$Builder.p();
            this.f57181i = null;
        }
    }
}
