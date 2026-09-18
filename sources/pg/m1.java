package pg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m1 {
    public static final DispatchQueue f41162m = new DispatchQueue("ShapeDetector");
    public static final double f41163n = Math.sqrt(125000.0d) / 2.0d;
    public int f41164a;
    public ArrayList f41165b;
    public ArrayList f41166c;
    public boolean d;
    public org.telegram.ui.web.b1 e;
    public Context f41167f;
    public SharedPreferences f41168g;
    public boolean h;
    public ArrayList f41169i;
    public AtomicBoolean f41170j;
    public AtomicBoolean f41171k;
    public i1 f41172l;

    public static k1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((j1) arrayList.get(0)).f41140a;
        double d10 = ((j1) arrayList.get(0)).f41141b;
        ?? obj = new Object();
        obj.f41148a = d;
        obj.f41149b = d10;
        obj.f41150c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            j1 j1Var = (j1) arrayList.get(i10);
            double d11 = j1Var.f41140a;
            double d12 = j1Var.f41141b;
            if (obj.f41148a >= d11) {
                obj.f41148a = d11;
            }
            if (obj.f41149b >= d12) {
                obj.f41149b = d12;
            }
            if (obj.f41150c <= d11) {
                obj.f41150c = d11;
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
            j1Var.f41140a += j1Var2.f41140a;
            j1Var.f41141b += j1Var2.f41141b;
        }
        j1Var.f41140a /= arrayList.size();
        j1Var.f41141b /= arrayList.size();
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
            double d11 = j1Var3.f41140a;
            double d12 = cos;
            double d13 = j1Var2.f41140a;
            double d14 = d11 - d13;
            double d15 = j1Var3.f41141b;
            double d16 = j1Var2.f41141b;
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
            double a2 = j1Var.a(j1Var2.f41140a, j1Var2.f41141b);
            double a10 = j1Var.a(j1Var3.f41140a, j1Var3.f41141b);
            double a11 = j1Var2.a(j1Var3.f41140a, j1Var3.f41141b);
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
            arrayList2.add(new j1(j1Var.f41140a, j1Var.f41141b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f41165b.clear();
        }
        f41162m.cancelRunnable(this.f41172l);
        this.f41171k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f41169i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f41167f);
            alertDialog$Builder.f18622a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new lg.j(13, this, arrayList));
            alertDialog$Builder.o();
            this.f41169i = null;
        }
    }
}
