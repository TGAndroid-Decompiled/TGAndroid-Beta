package tg;

import android.content.Context;
import android.content.SharedPreferences;
import gi.j8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class b1 {
    public static final q5 f55131m = new q5("ShapeDetector", true);
    public static final double f55132n = Math.sqrt(125000.0d) / 2.0d;
    public int f55133a;
    public ArrayList f55134b;
    public ArrayList f55135c;
    public boolean d;
    public j8 f55136e;
    public Context f55137f;
    public SharedPreferences f55138g;
    public boolean h;
    public ArrayList f55139i;
    public AtomicBoolean f55140j;
    public AtomicBoolean f55141k;
    public y0 f55142l;

    public static l8.d a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((z0) arrayList.get(0)).f55379a;
        double d10 = ((z0) arrayList.get(0)).f55380b;
        l8.d dVar = new l8.d(1);
        dVar.f18106b = d;
        dVar.f18107c = d10;
        dVar.d = d;
        dVar.f18108e = d10;
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            z0 z0Var = (z0) arrayList.get(i3);
            double d11 = z0Var.f55379a;
            double d12 = z0Var.f55380b;
            if (dVar.f18106b >= d11) {
                dVar.f18106b = d11;
            }
            if (dVar.f18107c >= d12) {
                dVar.f18107c = d12;
            }
            if (dVar.d <= d11) {
                dVar.d = d11;
            }
            if (dVar.f18108e <= d12) {
                dVar.f18108e = d12;
            }
        }
        return dVar;
    }

    public static z0 b(ArrayList arrayList) {
        z0 z0Var = new z0(0.0d, 0.0d);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            z0 z0Var2 = (z0) arrayList.get(i3);
            z0Var.f55379a += z0Var2.f55379a;
            z0Var.f55380b += z0Var2.f55380b;
        }
        z0Var.f55379a /= arrayList.size();
        z0Var.f55380b /= arrayList.size();
        return z0Var;
    }

    public static double d(ArrayList arrayList, z0 z0Var, ArrayList arrayList2, double d) {
        z0 z0Var2 = z0Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i3 = 0;
        while (i3 < min) {
            z0 z0Var3 = (z0) arrayList.get(i3);
            double d11 = z0Var3.f55379a;
            double d12 = cos;
            double d13 = z0Var2.f55379a;
            double d14 = d11 - d13;
            double d15 = z0Var3.f55380b;
            double d16 = z0Var2.f55380b;
            double d17 = d15 - d16;
            d10 += ((z0) arrayList2.get(i3)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i3++;
            z0Var2 = z0Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i3, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            z0 z0Var = (z0) arrayList.get(max - 1);
            z0 z0Var2 = (z0) arrayList.get(max);
            int i10 = max + 1;
            z0 z0Var3 = (z0) arrayList.get(i10);
            z0Var.getClass();
            double a10 = z0Var.a(z0Var2.f55379a, z0Var2.f55380b);
            double a11 = z0Var.a(z0Var3.f55379a, z0Var3.f55380b);
            double a12 = z0Var2.a(z0Var3.f55379a, z0Var3.f55380b);
            if ((Math.acos((((a11 * a11) + (a10 * a10)) - (a12 * a12)) / ((a10 * 2.0d) * a11)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i3 > 0) {
                    i3--;
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
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            z0 z0Var = (z0) arrayList.get(i3);
            arrayList2.add(new z0(z0Var.f55379a, z0Var.f55380b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f55134b.clear();
        }
        f55131m.cancelRunnable(this.f55142l);
        this.f55141k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f55139i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f55137f);
            alertDialog$Builder.f27343a.S = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new org.telegram.ui.u(14, this, arrayList));
            alertDialog$Builder.p();
            this.f55139i = null;
        }
    }
}
