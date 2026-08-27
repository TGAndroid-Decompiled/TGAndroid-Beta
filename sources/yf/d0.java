package yf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.q5;
import lh.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.xs;

public final class d0 {
    public static final er B = new er(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;

    public final b1 f49896a;

    public boolean f49897b;

    public boolean f49898c;
    public long d;

    public boolean f49899e;

    public boolean f49900f;

    public t0 f49901g;
    public t0 h;

    public double f49902i;

    public boolean f49903j;

    public float f49904k;

    public boolean f49905l;

    public int f49907n;

    public int f49908o;

    public double f49909p;

    public double f49910q;

    public ValueAnimator f49911r;

    public final j1 f49912s;

    public Matrix f49913t;
    public long v;

    public float f49915w;

    public ValueAnimator f49916x;

    public boolean f49918z;

    public final t0[] f49906m = new t0[3];

    public final float[] f49914u = new float[2];

    public final z f49917y = new z(this, 1);

    public d0(b1 b1Var) {
        this.f49896a = b1Var;
        Context context = b1Var.getContext();
        n6 n6Var = new n6(this, 22);
        final j1 j1Var = new j1();
        j1Var.f49960b = new ArrayList();
        j1Var.f49961c = new ArrayList();
        j1Var.f49965i = null;
        j1Var.f49966j = new AtomicBoolean(false);
        j1Var.f49967k = new AtomicBoolean(false);
        final int i10 = 0;
        j1Var.f49968l = new Runnable() {
            @Override
            public final void run() {
                e1 e1Var;
                int iE;
                double d;
                int i11;
                char c10;
                String string;
                int i12;
                switch (i10) {
                    case 0:
                        j1 j1Var2 = j1Var;
                        if (j1Var2.f49966j.get()) {
                            return;
                        }
                        j1Var2.f49967k.set(false);
                        j1Var2.f49966j.set(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (j1Var2) {
                            try {
                                if (j1Var2.f49960b.size() < 8) {
                                    j1Var2.f49966j.set(false);
                                } else {
                                    ArrayList arrayListF = j1.f(j1Var2.f49960b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((g1) arrayListF.get(0));
                                    int i13 = 1;
                                    double dA = 0.0d;
                                    while (i13 < arrayListF.size()) {
                                        g1 g1Var = (g1) arrayListF.get(i13 - 1);
                                        g1 g1Var2 = (g1) arrayListF.get(i13);
                                        g1Var.getClass();
                                        dA += g1Var.a(g1Var2.f49936a, g1Var2.f49937b);
                                        i13++;
                                        j1Var2 = j1Var2;
                                    }
                                    j1 j1Var3 = j1Var2;
                                    double d10 = dA / ((double) 47);
                                    int i14 = 1;
                                    double d11 = 0.0d;
                                    while (i14 < arrayListF.size()) {
                                        int i15 = i14 - 1;
                                        g1 g1Var3 = (g1) arrayListF.get(i15);
                                        g1 g1Var4 = (g1) arrayListF.get(i14);
                                        g1Var3.getClass();
                                        double d12 = d11;
                                        int i16 = i14;
                                        double dA2 = g1Var3.a(g1Var4.f49936a, g1Var4.f49937b);
                                        double d13 = d12 + dA2;
                                        if (d13 >= d10) {
                                            double d14 = (d10 - d12) / dA2;
                                            i11 = i16;
                                            g1 g1Var5 = new g1(((((g1) arrayListF.get(i11)).f49936a - ((g1) arrayListF.get(i15)).f49936a) * d14) + ((g1) arrayListF.get(i15)).f49936a, ((((g1) arrayListF.get(i11)).f49937b - ((g1) arrayListF.get(i15)).f49937b) * d14) + ((g1) arrayListF.get(i15)).f49937b);
                                            arrayList.add(g1Var5);
                                            arrayListF.add(i11, g1Var5);
                                            d11 = 0.0d;
                                        } else {
                                            i11 = i16;
                                            d11 = d13;
                                        }
                                        i14 = i11 + 1;
                                        d10 = d10;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    }
                                    long j10 = jCurrentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((g1) i0.a.i(1, arrayListF));
                                    }
                                    ArrayList arrayListF2 = j1.f(arrayList);
                                    g1 g1VarB = j1.b(arrayListF2);
                                    double dAtan2 = Math.atan2(g1VarB.f49937b - ((g1) arrayListF2.get(0)).f49937b, g1VarB.f49936a - ((g1) arrayListF2.get(0)).f49936a);
                                    g1 g1VarB2 = j1.b(arrayListF2);
                                    double dCos = Math.cos(dAtan2);
                                    double dSin = Math.sin(dAtan2);
                                    int i17 = 0;
                                    while (i17 < arrayListF2.size()) {
                                        g1 g1Var6 = (g1) arrayListF2.get(i17);
                                        double d15 = g1Var6.f49936a;
                                        double d16 = g1VarB2.f49936a;
                                        double d17 = d15 - d16;
                                        double d18 = dSin;
                                        double d19 = g1Var6.f49937b;
                                        double d20 = g1VarB2.f49937b;
                                        double d21 = d19 - d20;
                                        g1Var6.f49937b = (d21 * dCos) + (d17 * d18) + d20;
                                        g1Var6.f49936a = ((d17 * dCos) - (d21 * d18)) + d16;
                                        i17++;
                                        dSin = d18;
                                    }
                                    g1 g1VarB3 = j1.b(arrayListF2);
                                    double d22 = -g1VarB3.f49936a;
                                    double d23 = -g1VarB3.f49937b;
                                    for (int i18 = 0; i18 < arrayListF2.size(); i18++) {
                                        g1 g1Var7 = (g1) arrayListF2.get(i18);
                                        g1Var7.f49936a += d22;
                                        g1Var7.f49937b += d23;
                                    }
                                    h1 h1VarA = j1.a(arrayListF2);
                                    double d24 = h1VarA.f49943c - h1VarA.f49941a;
                                    double d25 = h1VarA.d - h1VarA.f49942b;
                                    for (int i19 = 0; i19 < arrayListF2.size(); i19++) {
                                        g1 g1Var8 = (g1) arrayListF2.get(i19);
                                        g1Var8.f49936a = (250.0d / d24) * g1Var8.f49936a;
                                        g1Var8.f49937b = (250.0d / d25) * g1Var8.f49937b;
                                    }
                                    g1 g1VarB4 = j1.b(arrayListF2);
                                    double d26 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < j1Var3.f49961c.size(); i22++) {
                                        ArrayList arrayList2 = ((i1) j1Var3.f49961c.get(i22)).f49952b;
                                        double dSqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d27 = -1.5707963267948966d;
                                        double d28 = 1.0d - dSqrt;
                                        double d29 = 1.5707963267948966d;
                                        double d30 = d26;
                                        double d31 = (d28 * 1.5707963267948966d) + (dSqrt * (-1.5707963267948966d));
                                        double d32 = j1.d(arrayListF2, g1VarB4, arrayList2, d31);
                                        double d33 = d31;
                                        double d34 = (dSqrt * 1.5707963267948966d) + (d28 * (-1.5707963267948966d));
                                        double d35 = j1.d(arrayListF2, g1VarB4, arrayList2, d34);
                                        double d36 = d34;
                                        double d37 = d32;
                                        double d38 = d35;
                                        while (Math.abs(d29 - d27) > 0.06981317007977318d) {
                                            if (d37 < d38) {
                                                double d39 = (d28 * d36) + (dSqrt * d27);
                                                double d40 = j1.d(arrayListF2, g1VarB4, arrayList2, d39);
                                                d = d39;
                                                d38 = d37;
                                                d37 = d40;
                                                d29 = d36;
                                                d36 = d33;
                                            } else {
                                                double d41 = (d28 * d33) + (dSqrt * d29);
                                                double d42 = j1.d(arrayListF2, g1VarB4, arrayList2, d41);
                                                d = d36;
                                                d36 = d41;
                                                d37 = d38;
                                                d38 = d42;
                                                d27 = d33;
                                            }
                                            d33 = d;
                                        }
                                        double dMin = Math.min(d37, d38);
                                        if (dMin < d30) {
                                            i20 = ((i1) j1Var3.f49961c.get(i22)).f49951a;
                                            d26 = dMin;
                                            i21 = i22;
                                        } else {
                                            d26 = d30;
                                        }
                                    }
                                    int i23 = 1.0d - (d26 / j1.f49958n) < 0.8d ? -1 : i20;
                                    if (i23 < 0 || i23 >= l.f49973b.size() || arrayList.size() < 1) {
                                        e1Var = null;
                                    } else {
                                        e1 e1Var2 = new e1(l.p(i23));
                                        if (i23 == 4) {
                                            int iE2 = j1.e(0, arrayList);
                                            if (iE2 > 0) {
                                                if (iE2 > 10) {
                                                    iE2 -= 2;
                                                }
                                                g1 g1Var9 = (g1) arrayList.get(iE2);
                                                g1 g1Var10 = (g1) arrayList.get(iE2 / 2);
                                                g1 g1Var11 = (g1) arrayList.get(0);
                                                e1Var2.f49922b = (float) g1Var9.f49936a;
                                                e1Var2.f49923c = (float) g1Var9.f49937b;
                                                e1Var2.f49927i = (float) g1Var10.f49936a;
                                                e1Var2.f49928j = (float) g1Var10.f49937b;
                                                e1Var2.d = (float) g1Var11.f49936a;
                                                e1Var2.f49924e = (float) g1Var11.f49937b;
                                                e1Var2.f49929k = 16.0f;
                                            } else {
                                                e1Var = null;
                                            }
                                        } else {
                                            g1 g1VarB5 = j1.b(arrayList);
                                            e1Var2.f49922b = (float) g1VarB5.f49936a;
                                            e1Var2.f49923c = (float) g1VarB5.f49937b;
                                            h1 h1VarA2 = j1.a(arrayList);
                                            e1Var2.d = ((float) (h1VarA2.f49943c - h1VarA2.f49941a)) / 2.0f;
                                            e1Var2.f49924e = ((float) (h1VarA2.d - h1VarA2.f49942b)) / 2.0f;
                                            if (i23 == 2 && (iE = j1.e(1, arrayList)) > 0) {
                                                g1 g1Var12 = (g1) arrayList.get(iE);
                                                e1Var2.h = (float) Math.atan2(g1Var12.f49937b - ((double) e1Var2.f49923c), g1Var12.f49936a - ((double) e1Var2.f49922b));
                                            }
                                        }
                                        e1Var = e1Var2;
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        StringBuilder sb2 = new StringBuilder("took ");
                                        sb2.append(System.currentTimeMillis() - j10);
                                        sb2.append("ms to ");
                                        sb2.append(e1Var != null ? "" : "not ");
                                        sb2.append("detect a shape");
                                        sb2.append(e1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                        Log.i("shapedetector", sb2.toString());
                                    }
                                    AndroidUtilities.runOnUIThread(new xs(j1Var3, e1Var, i21, arrayListF2, 15));
                                    j1Var3.f49966j.set(false);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    default:
                        j1 j1Var4 = j1Var;
                        try {
                            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (inputStreamOpen.available() > 5) {
                                    i1 i1Var = new i1();
                                    i1Var.f49951a = inputStreamOpen.read();
                                    int i24 = inputStreamOpen.read();
                                    int i25 = inputStreamOpen.read() - 64;
                                    int i26 = inputStreamOpen.read() - 64;
                                    if (inputStreamOpen.available() >= i24 * 2) {
                                        for (int i27 = 0; i27 < i24; i27++) {
                                            i1Var.f49952b.add(new g1((inputStreamOpen.read() - i25) - 127, (inputStreamOpen.read() - i26) - 127));
                                        }
                                        i1Var.f49953c = j1Var4.f49964g.getInt("score" + j1Var4.f49961c.size(), 0);
                                        j1Var4.f49961c.add(i1Var);
                                    }
                                }
                            }
                            if (j1Var4.h && (string = j1Var4.f49964g.getString("moretemplates", null)) != null) {
                                String[] strArrSplit = string.split("\\|");
                                int size = j1Var4.f49961c.size();
                                int i28 = 0;
                                while (i28 < strArrSplit.length) {
                                    i1 i1Var2 = new i1();
                                    String[] strArrSplit2 = strArrSplit[i28].split(",");
                                    int i29 = 1;
                                    if (strArrSplit2.length <= 1) {
                                        i12 = i28;
                                    } else {
                                        i1Var2.f49951a = Integer.parseInt(strArrSplit2[c10]);
                                        while (i29 < strArrSplit2.length) {
                                            i1Var2.f49952b.add(new g1(Double.parseDouble(strArrSplit2[i29]), Double.parseDouble(strArrSplit2[i29 + 1])));
                                            i29 += 2;
                                            i28 = i28;
                                        }
                                        i12 = i28;
                                        i1Var2.f49953c = j1Var4.f49964g.getInt("score" + (size + i12), 0);
                                        j1Var4.f49961c.add(i1Var2);
                                    }
                                    i28 = i12 + 1;
                                    c10 = 0;
                                }
                            }
                            inputStreamOpen.close();
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                }
            }
        };
        j1Var.f49963f = context;
        j1Var.f49962e = n6Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        j1Var.f49964g = sharedPreferences;
        j1Var.h = sharedPreferences.getBoolean("learning", false);
        j1Var.f49959a = sharedPreferences.getInt("scoreall", 0);
        final int i11 = 1;
        j1.f49957m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                e1 e1Var;
                int iE;
                double d;
                int i12;
                char c10;
                String string;
                int i13;
                switch (i11) {
                    case 0:
                        j1 j1Var2 = j1Var;
                        if (j1Var2.f49966j.get()) {
                            return;
                        }
                        j1Var2.f49967k.set(false);
                        j1Var2.f49966j.set(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (j1Var2) {
                            try {
                                if (j1Var2.f49960b.size() < 8) {
                                    j1Var2.f49966j.set(false);
                                } else {
                                    ArrayList arrayListF = j1.f(j1Var2.f49960b);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((g1) arrayListF.get(0));
                                    int i14 = 1;
                                    double dA = 0.0d;
                                    while (i14 < arrayListF.size()) {
                                        g1 g1Var = (g1) arrayListF.get(i14 - 1);
                                        g1 g1Var2 = (g1) arrayListF.get(i14);
                                        g1Var.getClass();
                                        dA += g1Var.a(g1Var2.f49936a, g1Var2.f49937b);
                                        i14++;
                                        j1Var2 = j1Var2;
                                    }
                                    j1 j1Var3 = j1Var2;
                                    double d10 = dA / ((double) 47);
                                    int i15 = 1;
                                    double d11 = 0.0d;
                                    while (i15 < arrayListF.size()) {
                                        int i16 = i15 - 1;
                                        g1 g1Var3 = (g1) arrayListF.get(i16);
                                        g1 g1Var4 = (g1) arrayListF.get(i15);
                                        g1Var3.getClass();
                                        double d12 = d11;
                                        int i17 = i15;
                                        double dA2 = g1Var3.a(g1Var4.f49936a, g1Var4.f49937b);
                                        double d13 = d12 + dA2;
                                        if (d13 >= d10) {
                                            double d14 = (d10 - d12) / dA2;
                                            i12 = i17;
                                            g1 g1Var5 = new g1(((((g1) arrayListF.get(i12)).f49936a - ((g1) arrayListF.get(i16)).f49936a) * d14) + ((g1) arrayListF.get(i16)).f49936a, ((((g1) arrayListF.get(i12)).f49937b - ((g1) arrayListF.get(i16)).f49937b) * d14) + ((g1) arrayListF.get(i16)).f49937b);
                                            arrayList.add(g1Var5);
                                            arrayListF.add(i12, g1Var5);
                                            d11 = 0.0d;
                                        } else {
                                            i12 = i17;
                                            d11 = d13;
                                        }
                                        i15 = i12 + 1;
                                        d10 = d10;
                                        jCurrentTimeMillis = jCurrentTimeMillis;
                                    }
                                    long j10 = jCurrentTimeMillis;
                                    if (arrayList.size() == 47) {
                                        arrayList.add((g1) i0.a.i(1, arrayListF));
                                    }
                                    ArrayList arrayListF2 = j1.f(arrayList);
                                    g1 g1VarB = j1.b(arrayListF2);
                                    double dAtan2 = Math.atan2(g1VarB.f49937b - ((g1) arrayListF2.get(0)).f49937b, g1VarB.f49936a - ((g1) arrayListF2.get(0)).f49936a);
                                    g1 g1VarB2 = j1.b(arrayListF2);
                                    double dCos = Math.cos(dAtan2);
                                    double dSin = Math.sin(dAtan2);
                                    int i18 = 0;
                                    while (i18 < arrayListF2.size()) {
                                        g1 g1Var6 = (g1) arrayListF2.get(i18);
                                        double d15 = g1Var6.f49936a;
                                        double d16 = g1VarB2.f49936a;
                                        double d17 = d15 - d16;
                                        double d18 = dSin;
                                        double d19 = g1Var6.f49937b;
                                        double d20 = g1VarB2.f49937b;
                                        double d21 = d19 - d20;
                                        g1Var6.f49937b = (d21 * dCos) + (d17 * d18) + d20;
                                        g1Var6.f49936a = ((d17 * dCos) - (d21 * d18)) + d16;
                                        i18++;
                                        dSin = d18;
                                    }
                                    g1 g1VarB3 = j1.b(arrayListF2);
                                    double d22 = -g1VarB3.f49936a;
                                    double d23 = -g1VarB3.f49937b;
                                    for (int i19 = 0; i19 < arrayListF2.size(); i19++) {
                                        g1 g1Var7 = (g1) arrayListF2.get(i19);
                                        g1Var7.f49936a += d22;
                                        g1Var7.f49937b += d23;
                                    }
                                    h1 h1VarA = j1.a(arrayListF2);
                                    double d24 = h1VarA.f49943c - h1VarA.f49941a;
                                    double d25 = h1VarA.d - h1VarA.f49942b;
                                    for (int i110 = 0; i110 < arrayListF2.size(); i110++) {
                                        g1 g1Var8 = (g1) arrayListF2.get(i110);
                                        g1Var8.f49936a = (250.0d / d24) * g1Var8.f49936a;
                                        g1Var8.f49937b = (250.0d / d25) * g1Var8.f49937b;
                                    }
                                    g1 g1VarB4 = j1.b(arrayListF2);
                                    double d26 = Double.MAX_VALUE;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < j1Var3.f49961c.size(); i22++) {
                                        ArrayList arrayList2 = ((i1) j1Var3.f49961c.get(i22)).f49952b;
                                        double dSqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                        double d27 = -1.5707963267948966d;
                                        double d28 = 1.0d - dSqrt;
                                        double d29 = 1.5707963267948966d;
                                        double d30 = d26;
                                        double d31 = (d28 * 1.5707963267948966d) + (dSqrt * (-1.5707963267948966d));
                                        double d32 = j1.d(arrayListF2, g1VarB4, arrayList2, d31);
                                        double d33 = d31;
                                        double d34 = (dSqrt * 1.5707963267948966d) + (d28 * (-1.5707963267948966d));
                                        double d35 = j1.d(arrayListF2, g1VarB4, arrayList2, d34);
                                        double d36 = d34;
                                        double d37 = d32;
                                        double d38 = d35;
                                        while (Math.abs(d29 - d27) > 0.06981317007977318d) {
                                            if (d37 < d38) {
                                                double d39 = (d28 * d36) + (dSqrt * d27);
                                                double d40 = j1.d(arrayListF2, g1VarB4, arrayList2, d39);
                                                d = d39;
                                                d38 = d37;
                                                d37 = d40;
                                                d29 = d36;
                                                d36 = d33;
                                            } else {
                                                double d41 = (d28 * d33) + (dSqrt * d29);
                                                double d42 = j1.d(arrayListF2, g1VarB4, arrayList2, d41);
                                                d = d36;
                                                d36 = d41;
                                                d37 = d38;
                                                d38 = d42;
                                                d27 = d33;
                                            }
                                            d33 = d;
                                        }
                                        double dMin = Math.min(d37, d38);
                                        if (dMin < d30) {
                                            i20 = ((i1) j1Var3.f49961c.get(i22)).f49951a;
                                            d26 = dMin;
                                            i21 = i22;
                                        } else {
                                            d26 = d30;
                                        }
                                    }
                                    int i23 = 1.0d - (d26 / j1.f49958n) < 0.8d ? -1 : i20;
                                    if (i23 < 0 || i23 >= l.f49973b.size() || arrayList.size() < 1) {
                                        e1Var = null;
                                    } else {
                                        e1 e1Var2 = new e1(l.p(i23));
                                        if (i23 == 4) {
                                            int iE2 = j1.e(0, arrayList);
                                            if (iE2 > 0) {
                                                if (iE2 > 10) {
                                                    iE2 -= 2;
                                                }
                                                g1 g1Var9 = (g1) arrayList.get(iE2);
                                                g1 g1Var10 = (g1) arrayList.get(iE2 / 2);
                                                g1 g1Var11 = (g1) arrayList.get(0);
                                                e1Var2.f49922b = (float) g1Var9.f49936a;
                                                e1Var2.f49923c = (float) g1Var9.f49937b;
                                                e1Var2.f49927i = (float) g1Var10.f49936a;
                                                e1Var2.f49928j = (float) g1Var10.f49937b;
                                                e1Var2.d = (float) g1Var11.f49936a;
                                                e1Var2.f49924e = (float) g1Var11.f49937b;
                                                e1Var2.f49929k = 16.0f;
                                            } else {
                                                e1Var = null;
                                            }
                                        } else {
                                            g1 g1VarB5 = j1.b(arrayList);
                                            e1Var2.f49922b = (float) g1VarB5.f49936a;
                                            e1Var2.f49923c = (float) g1VarB5.f49937b;
                                            h1 h1VarA2 = j1.a(arrayList);
                                            e1Var2.d = ((float) (h1VarA2.f49943c - h1VarA2.f49941a)) / 2.0f;
                                            e1Var2.f49924e = ((float) (h1VarA2.d - h1VarA2.f49942b)) / 2.0f;
                                            if (i23 == 2 && (iE = j1.e(1, arrayList)) > 0) {
                                                g1 g1Var12 = (g1) arrayList.get(iE);
                                                e1Var2.h = (float) Math.atan2(g1Var12.f49937b - ((double) e1Var2.f49923c), g1Var12.f49936a - ((double) e1Var2.f49922b));
                                            }
                                        }
                                        e1Var = e1Var2;
                                    }
                                    if (BuildVars.LOGS_ENABLED) {
                                        StringBuilder sb2 = new StringBuilder("took ");
                                        sb2.append(System.currentTimeMillis() - j10);
                                        sb2.append("ms to ");
                                        sb2.append(e1Var != null ? "" : "not ");
                                        sb2.append("detect a shape");
                                        sb2.append(e1Var != null ? " (template#" + i21 + " shape#" + i23 + ")" : "");
                                        Log.i("shapedetector", sb2.toString());
                                    }
                                    AndroidUtilities.runOnUIThread(new xs(j1Var3, e1Var, i21, arrayListF2, 15));
                                    j1Var3.f49966j.set(false);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    default:
                        j1 j1Var4 = j1Var;
                        try {
                            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (inputStreamOpen.available() > 5) {
                                    i1 i1Var = new i1();
                                    i1Var.f49951a = inputStreamOpen.read();
                                    int i24 = inputStreamOpen.read();
                                    int i25 = inputStreamOpen.read() - 64;
                                    int i26 = inputStreamOpen.read() - 64;
                                    if (inputStreamOpen.available() >= i24 * 2) {
                                        for (int i27 = 0; i27 < i24; i27++) {
                                            i1Var.f49952b.add(new g1((inputStreamOpen.read() - i25) - 127, (inputStreamOpen.read() - i26) - 127));
                                        }
                                        i1Var.f49953c = j1Var4.f49964g.getInt("score" + j1Var4.f49961c.size(), 0);
                                        j1Var4.f49961c.add(i1Var);
                                    }
                                }
                            }
                            if (j1Var4.h && (string = j1Var4.f49964g.getString("moretemplates", null)) != null) {
                                String[] strArrSplit = string.split("\\|");
                                int size = j1Var4.f49961c.size();
                                int i28 = 0;
                                while (i28 < strArrSplit.length) {
                                    i1 i1Var2 = new i1();
                                    String[] strArrSplit2 = strArrSplit[i28].split(",");
                                    int i29 = 1;
                                    if (strArrSplit2.length <= 1) {
                                        i13 = i28;
                                    } else {
                                        i1Var2.f49951a = Integer.parseInt(strArrSplit2[c10]);
                                        while (i29 < strArrSplit2.length) {
                                            i1Var2.f49952b.add(new g1(Double.parseDouble(strArrSplit2[i29]), Double.parseDouble(strArrSplit2[i29 + 1])));
                                            i29 += 2;
                                            i28 = i28;
                                        }
                                        i13 = i28;
                                        i1Var2.f49953c = j1Var4.f49964g.getInt("score" + (size + i13), 0);
                                        j1Var4.f49961c.add(i1Var2);
                                    }
                                    i28 = i13 + 1;
                                    c10 = 0;
                                }
                            }
                            inputStreamOpen.close();
                            return;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                }
            }
        });
        this.f49912s = j1Var;
    }

    public final void a(d dVar, boolean z10, v0 v0Var) {
        a1 a1Var;
        if (this.f49905l) {
            b1 b1Var = this.f49896a;
            if (b1Var.getPainting().G || this.f49901g == null) {
                return;
            }
            m currentBrush = dVar == null ? b1Var.getCurrentBrush() : dVar;
            if ((currentBrush instanceof c) || (currentBrush instanceof e)) {
                currentBrush = new f();
            }
            final m mVar = currentBrush;
            this.f49905l = false;
            if (mVar instanceof d) {
                b1Var.getPainting().E = false;
            }
            p0 painting = b1Var.getPainting();
            painting.f50015f.f(new m0(painting, 1));
            this.f49907n = 0;
            this.f49908o = 0;
            this.f49903j = false;
            this.f49897b = false;
            if (z10 && (a1Var = b1Var.f49878a) != null) {
                a1Var.f();
            }
            tu0 tu0Var = b1Var.getPainting().f50016g;
            t0 t0Var = this.f49901g;
            float fA = h7.y.a((float) t0Var.f50086a, (float) t0Var.f50087b, 0.0f, 0.0f);
            t0 t0Var2 = this.f49901g;
            float fMax = Math.max(fA, h7.y.a((float) t0Var2.f50086a, (float) t0Var2.f50087b, tu0Var.f32893a, 0.0f));
            t0 t0Var3 = this.f49901g;
            float fA2 = h7.y.a((float) t0Var3.f50086a, (float) t0Var3.f50087b, 0.0f, tu0Var.f32894b);
            t0 t0Var4 = this.f49901g;
            final float fMax2 = Math.max(fMax, Math.max(fA2, h7.y.a((float) t0Var4.f50086a, (float) t0Var4.f50087b, tu0Var.f32893a, tu0Var.f32894b))) / 0.84f;
            ValueAnimator valueAnimator = this.f49911r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f49911r = null;
            }
            ValueAnimator valueAnimator2 = this.f49916x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f49916x = null;
            }
            t0 t0Var5 = this.f49901g;
            final t0 t0Var6 = new t0(t0Var5.f50086a, t0Var5.f50087b, 1.0d);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f49916x = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    b1 b1Var2 = this.f49872a.f49896a;
                    float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                    q0 q0Var = new q0(new t0[]{t0Var6});
                    m mVar2 = mVar;
                    mVar2.getClass();
                    int currentColor = mVar2 instanceof d ? -1 : b1Var2.getCurrentColor();
                    float f10 = fFloatValue * fMax2;
                    q0Var.f50040c = currentColor;
                    q0Var.d = f10;
                    q0Var.f50041e = mVar2;
                    p0 painting2 = b1Var2.getPainting();
                    if (painting2.L != null) {
                        return;
                    }
                    boolean z11 = true;
                    painting2.f50015f.f(new q5(painting2, q0Var, z11, z11, null, 4));
                }
            });
            this.f49916x.addListener(new c0(this, t0Var6, fMax2, mVar, z10, v0Var));
            this.f49916x.setDuration(450L);
            this.f49916x.setInterpolator(er.h);
            this.f49916x.start();
            if (z10) {
                BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
            }
        }
    }

    public final void b(q0 q0Var) {
        b1 b1Var = this.f49896a;
        int currentColor = b1Var.getCurrentColor();
        float currentWeight = b1Var.getCurrentWeight();
        m currentBrush = b1Var.getCurrentBrush();
        q0Var.f50040c = currentColor;
        q0Var.d = currentWeight;
        q0Var.f50041e = currentBrush;
        if (this.f49900f) {
            this.f49902i = 0.0d;
        }
        q0Var.f50038a = this.f49902i;
        p0 painting = b1Var.getPainting();
        boolean z10 = this.f49900f;
        b0 b0Var = new b0(this, q0Var, 0);
        boolean z11 = false;
        if (painting.L == null) {
            painting.f50015f.f(new q5(painting, q0Var, z10, z11, b0Var, 4));
        }
        this.f49900f = false;
    }

    public final void c(float f10, boolean z10) {
        int i10 = this.f49907n;
        t0[] t0VarArr = this.f49906m;
        if (i10 <= 2) {
            t0[] t0VarArr2 = new t0[i10];
            System.arraycopy(t0VarArr, 0, t0VarArr2, 0, i10);
            b(new q0(t0VarArr2));
            return;
        }
        Vector vector = new Vector();
        t0 t0Var = t0VarArr[0];
        t0 t0Var2 = t0VarArr[1];
        t0 t0Var3 = t0VarArr[2];
        if (t0Var3 == null || t0Var2 == null || t0Var == null) {
            return;
        }
        t0 t0VarB = t0Var2.b(t0Var);
        t0 t0VarB2 = t0Var3.b(t0Var2);
        int iMin = (int) Math.min(48.0d, Math.max(Math.floor(t0VarB.a(t0VarB2) / 1), 24.0d));
        float f11 = 1.0f;
        float f12 = 1.0f / iMin;
        int i11 = 0;
        float f13 = 0.0f;
        while (i11 < iMin) {
            float f14 = f11 - f13;
            double d = f14;
            double dPow = Math.pow(d, 2.0d);
            double d10 = f13 * f13;
            double d11 = f14 * f14;
            double d12 = f13;
            double d13 = (t0VarB2.f50086a * d10) + (t0Var2.f50086a * 2.0d * d12 * d) + (t0VarB.f50086a * d11);
            double d14 = (t0VarB2.f50087b * d10) + (t0Var2.f50087b * 2.0d * d12 * d) + (t0VarB.f50087b * d11);
            double dLerp = ((((t0VarB2.f50088c * d10) + ((t0Var2.f50088c * ((double) ((2.0f * f14) * f13))) + (t0VarB.f50088c * dPow))) - 1.0d) * ((double) AndroidUtilities.lerp(f10, 1.0f, h7.n.a(this.f49908o / 16.0f, 0.0f, 1.0f)))) + 1.0d;
            t0 t0Var4 = new t0(d13, d14, dLerp);
            if (this.f49898c) {
                t0Var4.d = true;
                this.f49898c = false;
            }
            vector.add(t0Var4);
            this.f49909p += dLerp;
            this.f49910q += 1.0d;
            f13 += f12;
            i11++;
            f11 = 1.0f;
        }
        if (z10) {
            t0VarB2.d = true;
        }
        vector.add(t0VarB2);
        t0[] t0VarArr3 = new t0[vector.size()];
        vector.toArray(t0VarArr3);
        b(new q0(t0VarArr3));
        System.arraycopy(t0VarArr, 1, t0VarArr, 0, 2);
        if (z10) {
            this.f49907n = 0;
        } else {
            this.f49907n = 2;
        }
    }
}
