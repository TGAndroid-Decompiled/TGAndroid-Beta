package sg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c1 {
    public static final q5 f55039m = new q5("ShapeDetector", true);
    public static final double f55040n = Math.sqrt(125000.0d) / 2.0d;
    public int f55041a;
    public ArrayList f55042b;
    public ArrayList f55043c;
    public boolean d;
    public ii.c f55044e;
    public Context f55045f;
    public SharedPreferences f55046g;
    public boolean h;
    public ArrayList f55047i;
    public AtomicBoolean f55048j;
    public AtomicBoolean f55049k;
    public z0 f55050l;

    public static m8.d a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((a1) arrayList.get(0)).f55024a;
        double d2 = ((a1) arrayList.get(0)).f55025b;
        m8.d dVar = new m8.d(1);
        dVar.f19938b = d;
        dVar.f19939c = d2;
        dVar.d = d;
        dVar.f19940e = d2;
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            a1 a1Var = (a1) arrayList.get(i7);
            double d10 = a1Var.f55024a;
            double d11 = a1Var.f55025b;
            if (dVar.f19938b >= d10) {
                dVar.f19938b = d10;
            }
            if (dVar.f19939c >= d11) {
                dVar.f19939c = d11;
            }
            if (dVar.d <= d10) {
                dVar.d = d10;
            }
            if (dVar.f19940e <= d11) {
                dVar.f19940e = d11;
            }
        }
        return dVar;
    }

    public static a1 b(ArrayList arrayList) {
        a1 a1Var = new a1(0.0d, 0.0d);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            a1 a1Var2 = (a1) arrayList.get(i7);
            a1Var.f55024a += a1Var2.f55024a;
            a1Var.f55025b += a1Var2.f55025b;
        }
        a1Var.f55024a /= arrayList.size();
        a1Var.f55025b /= arrayList.size();
        return a1Var;
    }

    public static double d(ArrayList arrayList, a1 a1Var, ArrayList arrayList2, double d) {
        a1 a1Var2 = a1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i7 = 0;
        while (i7 < min) {
            a1 a1Var3 = (a1) arrayList.get(i7);
            double d10 = a1Var3.f55024a;
            double d11 = cos;
            double d12 = a1Var2.f55024a;
            double d13 = d10 - d12;
            double d14 = a1Var3.f55025b;
            double d15 = a1Var2.f55025b;
            double d16 = d14 - d15;
            d2 += ((a1) arrayList2.get(i7)).a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i7++;
            a1Var2 = a1Var;
            cos = d11;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i7, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            a1 a1Var = (a1) arrayList.get(max - 1);
            a1 a1Var2 = (a1) arrayList.get(max);
            int i10 = max + 1;
            a1 a1Var3 = (a1) arrayList.get(i10);
            a1Var.getClass();
            double a10 = a1Var.a(a1Var2.f55024a, a1Var2.f55025b);
            double a11 = a1Var.a(a1Var3.f55024a, a1Var3.f55025b);
            double a12 = a1Var2.a(a1Var3.f55024a, a1Var3.f55025b);
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
            a1 a1Var = (a1) arrayList.get(i7);
            arrayList2.add(new a1(a1Var.f55024a, a1Var.f55025b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f55042b.clear();
        }
        f55039m.cancelRunnable(this.f55050l);
        this.f55049k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f55047i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f55045f);
            alertDialog$Builder.f27296a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new og.j(14, this, arrayList));
            alertDialog$Builder.p();
            this.f55047i = null;
        }
    }
}
