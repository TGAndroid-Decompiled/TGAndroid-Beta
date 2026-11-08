package sg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.q5;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d1 {
    public static final q5 f55031m = new q5("ShapeDetector", true);
    public static final double f55032n = Math.sqrt(125000.0d) / 2.0d;
    public int f55033a;
    public ArrayList f55034b;
    public ArrayList f55035c;
    public boolean d;
    public ii.c f55036e;
    public Context f55037f;
    public SharedPreferences f55038g;
    public boolean h;
    public ArrayList f55039i;
    public AtomicBoolean f55040j;
    public AtomicBoolean f55041k;
    public a1 f55042l;

    public static m8.d a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((b1) arrayList.get(0)).f55021a;
        double d2 = ((b1) arrayList.get(0)).f55022b;
        m8.d dVar = new m8.d(1);
        dVar.f19938b = d;
        dVar.f19939c = d2;
        dVar.d = d;
        dVar.f19940e = d2;
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            b1 b1Var = (b1) arrayList.get(i7);
            double d10 = b1Var.f55021a;
            double d11 = b1Var.f55022b;
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

    public static b1 b(ArrayList arrayList) {
        b1 b1Var = new b1(0.0d, 0.0d);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b1 b1Var2 = (b1) arrayList.get(i7);
            b1Var.f55021a += b1Var2.f55021a;
            b1Var.f55022b += b1Var2.f55022b;
        }
        b1Var.f55021a /= arrayList.size();
        b1Var.f55022b /= arrayList.size();
        return b1Var;
    }

    public static double d(ArrayList arrayList, b1 b1Var, ArrayList arrayList2, double d) {
        b1 b1Var2 = b1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i7 = 0;
        while (i7 < min) {
            b1 b1Var3 = (b1) arrayList.get(i7);
            double d10 = b1Var3.f55021a;
            double d11 = cos;
            double d12 = b1Var2.f55021a;
            double d13 = d10 - d12;
            double d14 = b1Var3.f55022b;
            double d15 = b1Var2.f55022b;
            double d16 = d14 - d15;
            d2 += ((b1) arrayList2.get(i7)).a(((d13 * d11) - (d16 * sin)) + d12, (d16 * d11) + (d13 * sin) + d15);
            i7++;
            b1Var2 = b1Var;
            cos = d11;
        }
        return d2 / arrayList.size();
    }

    public static int e(int i7, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            b1 b1Var = (b1) arrayList.get(max - 1);
            b1 b1Var2 = (b1) arrayList.get(max);
            int i10 = max + 1;
            b1 b1Var3 = (b1) arrayList.get(i10);
            b1Var.getClass();
            double a10 = b1Var.a(b1Var2.f55021a, b1Var2.f55022b);
            double a11 = b1Var.a(b1Var3.f55021a, b1Var3.f55022b);
            double a12 = b1Var2.a(b1Var3.f55021a, b1Var3.f55022b);
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
            b1 b1Var = (b1) arrayList.get(i7);
            arrayList2.add(new b1(b1Var.f55021a, b1Var.f55022b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f55034b.clear();
        }
        f55031m.cancelRunnable(this.f55042l);
        this.f55041k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f55039i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f55037f);
            alertDialog$Builder.f27296a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new og.j(14, this, arrayList));
            alertDialog$Builder.p();
            this.f55039i = null;
        }
    }
}
