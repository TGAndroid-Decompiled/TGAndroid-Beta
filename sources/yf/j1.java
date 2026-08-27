package yf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.n6;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class j1 {

    public static final DispatchQueue f49957m = new DispatchQueue("ShapeDetector");

    public static final double f49958n = Math.sqrt(125000.0d) / 2.0d;

    public int f49959a;

    public ArrayList f49960b;

    public ArrayList f49961c;
    public boolean d;

    public n6 f49962e;

    public Context f49963f;

    public SharedPreferences f49964g;
    public boolean h;

    public ArrayList f49965i;

    public AtomicBoolean f49966j;

    public AtomicBoolean f49967k;

    public f1 f49968l;

    public static h1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((g1) arrayList.get(0)).f49936a;
        double d10 = ((g1) arrayList.get(0)).f49937b;
        h1 h1Var = new h1();
        h1Var.f49941a = d;
        h1Var.f49942b = d10;
        h1Var.f49943c = d;
        h1Var.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            g1 g1Var = (g1) arrayList.get(i10);
            double d11 = g1Var.f49936a;
            double d12 = g1Var.f49937b;
            if (h1Var.f49941a >= d11) {
                h1Var.f49941a = d11;
            }
            if (h1Var.f49942b >= d12) {
                h1Var.f49942b = d12;
            }
            if (h1Var.f49943c <= d11) {
                h1Var.f49943c = d11;
            }
            if (h1Var.d <= d12) {
                h1Var.d = d12;
            }
        }
        return h1Var;
    }

    public static g1 b(ArrayList arrayList) {
        g1 g1Var = new g1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g1 g1Var2 = (g1) arrayList.get(i10);
            g1Var.f49936a += g1Var2.f49936a;
            g1Var.f49937b += g1Var2.f49937b;
        }
        g1Var.f49936a /= (double) arrayList.size();
        g1Var.f49937b /= (double) arrayList.size();
        return g1Var;
    }

    public static double d(ArrayList arrayList, g1 g1Var, ArrayList arrayList2, double d) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        double dA = 0.0d;
        int i10 = 0;
        while (i10 < iMin) {
            g1 g1Var2 = (g1) arrayList.get(i10);
            g1 g1Var3 = (g1) arrayList2.get(i10);
            double d10 = g1Var2.f49936a;
            double d11 = dCos;
            double d12 = g1Var.f49936a;
            double d13 = d10 - d12;
            double d14 = g1Var2.f49937b;
            double d15 = g1Var.f49937b;
            double d16 = d14 - d15;
            dA += g1Var3.a(((d13 * d11) - (d16 * dSin)) + d12, (d16 * d11) + (d13 * dSin) + d15);
            i10++;
            dCos = d11;
        }
        return dA / ((double) arrayList.size());
    }

    public static int e(int i10, ArrayList arrayList) {
        int iMax = Math.max(1, arrayList.size() / 4);
        while (iMax < arrayList.size() - 1) {
            g1 g1Var = (g1) arrayList.get(iMax - 1);
            g1 g1Var2 = (g1) arrayList.get(iMax);
            int i11 = iMax + 1;
            g1 g1Var3 = (g1) arrayList.get(i11);
            g1Var.getClass();
            double dA = g1Var.a(g1Var2.f49936a, g1Var2.f49937b);
            double dA2 = g1Var.a(g1Var3.f49936a, g1Var3.f49937b);
            double dA3 = g1Var2.a(g1Var3.f49936a, g1Var3.f49937b);
            if ((Math.acos((((dA2 * dA2) + (dA * dA)) - (dA3 * dA3)) / ((dA * 2.0d) * dA2)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i10 <= 0) {
                    return iMax;
                }
                i10--;
            }
            iMax = i11;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g1 g1Var = (g1) arrayList.get(i10);
            arrayList2.add(new g1(g1Var.f49936a, g1Var.f49937b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.f49960b.clear();
        }
        f49957m.cancelRunnable(this.f49968l);
        this.f49967k.set(false);
        this.d = false;
        if (!this.h || (arrayList = this.f49965i) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f49963f);
        alertDialog$Builder.f22702a.N = "Shape?";
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new org.telegram.ui.w(13, this, arrayList));
        alertDialog$Builder.o();
        this.f49965i = null;
    }
}
