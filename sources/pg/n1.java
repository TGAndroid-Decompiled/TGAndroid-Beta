package pg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class n1 {
    public static final DispatchQueue f41178m = new DispatchQueue("ShapeDetector");
    public static final double f41179n = Math.sqrt(125000.0d) / 2.0d;
    public int f41180a;
    public ArrayList f41181b;
    public ArrayList f41182c;
    public boolean d;
    public ii.q1 e;
    public Context f41183f;
    public SharedPreferences f41184g;
    public boolean h;
    public ArrayList f41185i;
    public AtomicBoolean f41186j;
    public AtomicBoolean f41187k;
    public j1 f41188l;

    public static l1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((k1) arrayList.get(0)).f41159a;
        double d10 = ((k1) arrayList.get(0)).f41160b;
        ?? obj = new Object();
        obj.f41165a = d;
        obj.f41166b = d10;
        obj.f41167c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            k1 k1Var = (k1) arrayList.get(i10);
            double d11 = k1Var.f41159a;
            double d12 = k1Var.f41160b;
            if (obj.f41165a >= d11) {
                obj.f41165a = d11;
            }
            if (obj.f41166b >= d12) {
                obj.f41166b = d12;
            }
            if (obj.f41167c <= d11) {
                obj.f41167c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static k1 b(ArrayList arrayList) {
        k1 k1Var = new k1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k1 k1Var2 = (k1) arrayList.get(i10);
            k1Var.f41159a += k1Var2.f41159a;
            k1Var.f41160b += k1Var2.f41160b;
        }
        k1Var.f41159a /= arrayList.size();
        k1Var.f41160b /= arrayList.size();
        return k1Var;
    }

    public static double d(ArrayList arrayList, k1 k1Var, ArrayList arrayList2, double d) {
        k1 k1Var2 = k1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            k1 k1Var3 = (k1) arrayList.get(i10);
            double d11 = k1Var3.f41159a;
            double d12 = cos;
            double d13 = k1Var2.f41159a;
            double d14 = d11 - d13;
            double d15 = k1Var3.f41160b;
            double d16 = k1Var2.f41160b;
            double d17 = d15 - d16;
            d10 += ((k1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            k1Var2 = k1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            k1 k1Var = (k1) arrayList.get(max - 1);
            k1 k1Var2 = (k1) arrayList.get(max);
            int i11 = max + 1;
            k1 k1Var3 = (k1) arrayList.get(i11);
            k1Var.getClass();
            double a2 = k1Var.a(k1Var2.f41159a, k1Var2.f41160b);
            double a10 = k1Var.a(k1Var3.f41159a, k1Var3.f41160b);
            double a11 = k1Var2.a(k1Var3.f41159a, k1Var3.f41160b);
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
            k1 k1Var = (k1) arrayList.get(i10);
            arrayList2.add(new k1(k1Var.f41159a, k1Var.f41160b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f41181b.clear();
        }
        f41178m.cancelRunnable(this.f41188l);
        this.f41187k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f41185i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41183f);
            alertDialog$Builder.f18661a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new lg.j(14, this, arrayList));
            alertDialog$Builder.o();
            this.f41185i = null;
        }
    }
}
