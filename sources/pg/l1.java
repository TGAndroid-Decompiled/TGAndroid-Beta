package pg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class l1 {
    public static final DispatchQueue f45570m = new DispatchQueue("ShapeDetector");
    public static final double f45571n = Math.sqrt(125000.0d) / 2.0d;
    public int f45572a;
    public ArrayList f45573b;
    public ArrayList f45574c;
    public boolean d;
    public ii.q1 f45575e;
    public Context f45576f;
    public SharedPreferences f45577g;
    public boolean h;
    public ArrayList f45578i;
    public AtomicBoolean f45579j;
    public AtomicBoolean f45580k;
    public h1 f45581l;

    public static j1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((i1) arrayList.get(0)).f45548a;
        double d10 = ((i1) arrayList.get(0)).f45549b;
        ?? obj = new Object();
        obj.f45553a = d;
        obj.f45554b = d10;
        obj.f45555c = d;
        obj.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            i1 i1Var = (i1) arrayList.get(i10);
            double d11 = i1Var.f45548a;
            double d12 = i1Var.f45549b;
            if (obj.f45553a >= d11) {
                obj.f45553a = d11;
            }
            if (obj.f45554b >= d12) {
                obj.f45554b = d12;
            }
            if (obj.f45555c <= d11) {
                obj.f45555c = d11;
            }
            if (obj.d <= d12) {
                obj.d = d12;
            }
        }
        return obj;
    }

    public static i1 b(ArrayList arrayList) {
        i1 i1Var = new i1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i1 i1Var2 = (i1) arrayList.get(i10);
            i1Var.f45548a += i1Var2.f45548a;
            i1Var.f45549b += i1Var2.f45549b;
        }
        i1Var.f45548a /= arrayList.size();
        i1Var.f45549b /= arrayList.size();
        return i1Var;
    }

    public static double d(ArrayList arrayList, i1 i1Var, ArrayList arrayList2, double d) {
        i1 i1Var2 = i1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            i1 i1Var3 = (i1) arrayList.get(i10);
            double d11 = i1Var3.f45548a;
            double d12 = cos;
            double d13 = i1Var2.f45548a;
            double d14 = d11 - d13;
            double d15 = i1Var3.f45549b;
            double d16 = i1Var2.f45549b;
            double d17 = d15 - d16;
            d10 += ((i1) arrayList2.get(i10)).a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            i1Var2 = i1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            i1 i1Var = (i1) arrayList.get(max - 1);
            i1 i1Var2 = (i1) arrayList.get(max);
            int i11 = max + 1;
            i1 i1Var3 = (i1) arrayList.get(i11);
            i1Var.getClass();
            double a2 = i1Var.a(i1Var2.f45548a, i1Var2.f45549b);
            double a10 = i1Var.a(i1Var3.f45548a, i1Var3.f45549b);
            double a11 = i1Var2.a(i1Var3.f45548a, i1Var3.f45549b);
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
            i1 i1Var = (i1) arrayList.get(i10);
            arrayList2.add(new i1(i1Var.f45548a, i1Var.f45549b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f45573b.clear();
        }
        f45570m.cancelRunnable(this.f45581l);
        this.f45580k.set(false);
        this.d = false;
        if (this.h && (arrayList = this.f45578i) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f45576f);
            alertDialog$Builder.f20141a.R = "Shape?";
            alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new lg.j(14, this, arrayList));
            alertDialog$Builder.o();
            this.f45578i = null;
        }
    }
}
