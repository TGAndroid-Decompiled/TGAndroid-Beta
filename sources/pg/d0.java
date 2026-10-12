package pg;

import ai.c8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.w21;
import v7.z6;
public final class d0 {
    public static final js B = new js(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final d1 f45497a;
    public boolean f45498b;
    public boolean f45499c;
    public long d;
    public boolean f45500e;
    public boolean f45501f;
    public v0 f45502g;
    public v0 h;
    public double f45503i;
    public boolean f45504j;
    public float f45505k;
    public boolean f45506l;
    public int f45508n;
    public int f45509o;
    public double f45510p;
    public double f45511q;
    public ValueAnimator f45512r;
    public final l1 f45513s;
    public Matrix f45514t;
    public long v;
    public float f45516w;
    public ValueAnimator f45517x;
    public boolean f45519z;
    public final v0[] f45507m = new v0[3];
    public final float[] f45515u = new float[2];
    public final z f45518y = new z(this, 1);

    public d0(d1 d1Var) {
        this.f45497a = d1Var;
        Context context = d1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f45578b = new ArrayList();
        obj.f45579c = new ArrayList();
        obj.f45583i = null;
        obj.f45584j = new AtomicBoolean(false);
        obj.f45585k = new AtomicBoolean(false);
        obj.f45586l = new Runnable() {
            @Override
            public final void run() {
                int i10;
                String str;
                String str2;
                int e7;
                double d;
                double d10;
                int i11;
                char c10;
                String string;
                int i12;
                char c11;
                switch (r2) {
                    case 0:
                        l1 l1Var = obj;
                        if (!l1Var.f45584j.get()) {
                            l1Var.f45585k.set(false);
                            l1Var.f45584j.set(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (l1Var) {
                                try {
                                    if (l1Var.f45578b.size() < 8) {
                                        l1Var.f45584j.set(false);
                                    } else {
                                        ArrayList f7 = l1.f(l1Var.f45578b);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add((i1) f7.get(0));
                                        double d11 = 0.0d;
                                        for (int i13 = 1; i13 < f7.size(); i13++) {
                                            i1 i1Var = (i1) f7.get(i13 - 1);
                                            i1 i1Var2 = (i1) f7.get(i13);
                                            i1Var.getClass();
                                            d11 += i1Var.a(i1Var2.f45553a, i1Var2.f45554b);
                                        }
                                        double d12 = d11 / 47;
                                        int i14 = 1;
                                        double d13 = 0.0d;
                                        while (i14 < f7.size()) {
                                            int i15 = i14 - 1;
                                            i1 i1Var3 = (i1) f7.get(i15);
                                            i1 i1Var4 = (i1) f7.get(i14);
                                            i1Var3.getClass();
                                            int i16 = i14;
                                            long j3 = currentTimeMillis;
                                            double a2 = i1Var3.a(i1Var4.f45553a, i1Var4.f45554b);
                                            double d14 = d13 + a2;
                                            if (d14 >= d12) {
                                                double d15 = (d12 - d13) / a2;
                                                i11 = i16;
                                                d10 = d12;
                                                i1 i1Var5 = new i1(((((i1) f7.get(i11)).f45553a - ((i1) f7.get(i15)).f45553a) * d15) + ((i1) f7.get(i15)).f45553a, ((((i1) f7.get(i11)).f45554b - ((i1) f7.get(i15)).f45554b) * d15) + ((i1) f7.get(i15)).f45554b);
                                                arrayList.add(i1Var5);
                                                f7.add(i11, i1Var5);
                                                d13 = 0.0d;
                                            } else {
                                                d10 = d12;
                                                i11 = i16;
                                                d13 = d14;
                                            }
                                            i14 = i11 + 1;
                                            currentTimeMillis = j3;
                                            d12 = d10;
                                        }
                                        long j10 = currentTimeMillis;
                                        if (arrayList.size() == 47) {
                                            arrayList.add((i1) hg.c.h(1, f7));
                                        }
                                        ArrayList f10 = l1.f(arrayList);
                                        i1 b10 = l1.b(f10);
                                        double atan2 = Math.atan2(b10.f45554b - ((i1) f10.get(0)).f45554b, b10.f45553a - ((i1) f10.get(0)).f45553a);
                                        i1 b11 = l1.b(f10);
                                        double cos = Math.cos(atan2);
                                        double sin = Math.sin(atan2);
                                        int i17 = 0;
                                        while (i17 < f10.size()) {
                                            i1 i1Var6 = (i1) f10.get(i17);
                                            double d16 = i1Var6.f45553a;
                                            double d17 = b11.f45553a;
                                            double d18 = d16 - d17;
                                            double d19 = sin;
                                            double d20 = i1Var6.f45554b;
                                            double d21 = b11.f45554b;
                                            double d22 = d20 - d21;
                                            i1Var6.f45554b = (d22 * cos) + (d18 * d19) + d21;
                                            i1Var6.f45553a = d17 + ((d18 * cos) - (d22 * d19));
                                            i17++;
                                            sin = d19;
                                        }
                                        i1 b12 = l1.b(f10);
                                        double d23 = -b12.f45553a;
                                        double d24 = -b12.f45554b;
                                        for (int i18 = 0; i18 < f10.size(); i18++) {
                                            i1 i1Var7 = (i1) f10.get(i18);
                                            i1Var7.f45553a += d23;
                                            i1Var7.f45554b += d24;
                                        }
                                        j1 a10 = l1.a(f10);
                                        double d25 = a10.f45560c - a10.f45558a;
                                        double d26 = a10.d - a10.f45559b;
                                        for (int i19 = 0; i19 < f10.size(); i19++) {
                                            i1 i1Var8 = (i1) f10.get(i19);
                                            i1Var8.f45553a = (250.0d / d25) * i1Var8.f45553a;
                                            i1Var8.f45554b = (250.0d / d26) * i1Var8.f45554b;
                                        }
                                        i1 b13 = l1.b(f10);
                                        double d27 = Double.MAX_VALUE;
                                        int i20 = -1;
                                        int i21 = -1;
                                        for (int i22 = 0; i22 < l1Var.f45579c.size(); i22++) {
                                            ArrayList arrayList2 = ((k1) l1Var.f45579c.get(i22)).f45569b;
                                            double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                            double d28 = -1.5707963267948966d;
                                            double d29 = 1.0d - sqrt;
                                            double d30 = 1.5707963267948966d;
                                            double d31 = d27;
                                            double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                            double d33 = l1.d(f10, b13, arrayList2, d32);
                                            double d34 = d32;
                                            double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                            double d36 = l1.d(f10, b13, arrayList2, d35);
                                            double d37 = d35;
                                            double d38 = d33;
                                            double d39 = d36;
                                            while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                                if (d38 < d39) {
                                                    double d40 = (d29 * d37) + (sqrt * d28);
                                                    double d41 = l1.d(f10, b13, arrayList2, d40);
                                                    d = d40;
                                                    d39 = d38;
                                                    d38 = d41;
                                                    d30 = d37;
                                                    d37 = d34;
                                                } else {
                                                    double d42 = (sqrt * d30) + (d29 * d34);
                                                    double d43 = l1.d(f10, b13, arrayList2, d42);
                                                    d = d37;
                                                    d37 = d42;
                                                    d38 = d39;
                                                    d39 = d43;
                                                    d28 = d34;
                                                }
                                                d34 = d;
                                            }
                                            double min = Math.min(d38, d39);
                                            if (min < d31) {
                                                i20 = ((k1) l1Var.f45579c.get(i22)).f45568a;
                                                d27 = min;
                                                i21 = i22;
                                            } else {
                                                d27 = d31;
                                            }
                                        }
                                        if (1.0d - (d27 / l1.f45576n) < 0.8d) {
                                            i10 = -1;
                                        } else {
                                            i10 = i20;
                                        }
                                        g1 g1Var = null;
                                        if (i10 >= 0 && i10 < l.f45571b.size() && arrayList.size() >= 1) {
                                            g1 g1Var2 = new g1(l.p(i10));
                                            if (i10 == 4) {
                                                int e10 = l1.e(0, arrayList);
                                                if (e10 > 0) {
                                                    if (e10 > 10) {
                                                        e10 -= 2;
                                                    }
                                                    i1 i1Var9 = (i1) arrayList.get(e10);
                                                    i1 i1Var10 = (i1) arrayList.get(e10 / 2);
                                                    i1 i1Var11 = (i1) arrayList.get(0);
                                                    g1Var2.f45539b = (float) i1Var9.f45553a;
                                                    g1Var2.f45540c = (float) i1Var9.f45554b;
                                                    g1Var2.f45544i = (float) i1Var10.f45553a;
                                                    g1Var2.f45545j = (float) i1Var10.f45554b;
                                                    g1Var2.d = (float) i1Var11.f45553a;
                                                    g1Var2.f45541e = (float) i1Var11.f45554b;
                                                    g1Var2.f45546k = 16.0f;
                                                }
                                            } else {
                                                i1 b14 = l1.b(arrayList);
                                                g1Var2.f45539b = (float) b14.f45553a;
                                                g1Var2.f45540c = (float) b14.f45554b;
                                                j1 a11 = l1.a(arrayList);
                                                g1Var2.d = ((float) (a11.f45560c - a11.f45558a)) / 2.0f;
                                                g1Var2.f45541e = ((float) (a11.d - a11.f45559b)) / 2.0f;
                                                if (i10 == 2 && (e7 = l1.e(1, arrayList)) > 0) {
                                                    i1 i1Var12 = (i1) arrayList.get(e7);
                                                    g1Var2.h = (float) Math.atan2(i1Var12.f45554b - g1Var2.f45540c, i1Var12.f45553a - g1Var2.f45539b);
                                                }
                                            }
                                            g1Var = g1Var2;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            if (g1Var != null) {
                                                str = "";
                                            } else {
                                                str = "not ";
                                            }
                                            sb2.append(str);
                                            sb2.append("detect a shape");
                                            if (g1Var != null) {
                                                str2 = " (template#" + i21 + " shape#" + i10 + ")";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new w21(l1Var, g1Var, i21, f10));
                                        l1Var.f45584j.set(false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        l1 l1Var2 = obj;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    k1 k1Var = new k1();
                                    k1Var.f45568a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            k1Var.f45569b.add(new i1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        k1Var.f45570c = l1Var2.f45582g.getInt("score" + l1Var2.f45579c.size(), 0);
                                        l1Var2.f45579c.add(k1Var);
                                    }
                                }
                            }
                            if (l1Var2.h && (string = l1Var2.f45582g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = l1Var2.f45579c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    k1 k1Var2 = new k1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        c11 = c10;
                                        i12 = i24;
                                    } else {
                                        k1Var2.f45568a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            k1Var2.f45569b.add(new i1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i12 = i24;
                                        c11 = 0;
                                        k1Var2.f45570c = l1Var2.f45582g.getInt("score" + (size + i12), 0);
                                        l1Var2.f45579c.add(k1Var2);
                                    }
                                    i24 = i12 + 1;
                                    c10 = c11;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                }
            }
        };
        obj.f45581f = context;
        obj.f45580e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f45582g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f45577a = sharedPreferences.getInt("scoreall", 0);
        l1.f45575m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                int i10;
                String str;
                String str2;
                int e7;
                double d;
                double d10;
                int i11;
                char c10;
                String string;
                int i12;
                char c11;
                switch (r2) {
                    case 0:
                        l1 l1Var = obj;
                        if (!l1Var.f45584j.get()) {
                            l1Var.f45585k.set(false);
                            l1Var.f45584j.set(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (l1Var) {
                                try {
                                    if (l1Var.f45578b.size() < 8) {
                                        l1Var.f45584j.set(false);
                                    } else {
                                        ArrayList f7 = l1.f(l1Var.f45578b);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add((i1) f7.get(0));
                                        double d11 = 0.0d;
                                        for (int i13 = 1; i13 < f7.size(); i13++) {
                                            i1 i1Var = (i1) f7.get(i13 - 1);
                                            i1 i1Var2 = (i1) f7.get(i13);
                                            i1Var.getClass();
                                            d11 += i1Var.a(i1Var2.f45553a, i1Var2.f45554b);
                                        }
                                        double d12 = d11 / 47;
                                        int i14 = 1;
                                        double d13 = 0.0d;
                                        while (i14 < f7.size()) {
                                            int i15 = i14 - 1;
                                            i1 i1Var3 = (i1) f7.get(i15);
                                            i1 i1Var4 = (i1) f7.get(i14);
                                            i1Var3.getClass();
                                            int i16 = i14;
                                            long j3 = currentTimeMillis;
                                            double a2 = i1Var3.a(i1Var4.f45553a, i1Var4.f45554b);
                                            double d14 = d13 + a2;
                                            if (d14 >= d12) {
                                                double d15 = (d12 - d13) / a2;
                                                i11 = i16;
                                                d10 = d12;
                                                i1 i1Var5 = new i1(((((i1) f7.get(i11)).f45553a - ((i1) f7.get(i15)).f45553a) * d15) + ((i1) f7.get(i15)).f45553a, ((((i1) f7.get(i11)).f45554b - ((i1) f7.get(i15)).f45554b) * d15) + ((i1) f7.get(i15)).f45554b);
                                                arrayList.add(i1Var5);
                                                f7.add(i11, i1Var5);
                                                d13 = 0.0d;
                                            } else {
                                                d10 = d12;
                                                i11 = i16;
                                                d13 = d14;
                                            }
                                            i14 = i11 + 1;
                                            currentTimeMillis = j3;
                                            d12 = d10;
                                        }
                                        long j10 = currentTimeMillis;
                                        if (arrayList.size() == 47) {
                                            arrayList.add((i1) hg.c.h(1, f7));
                                        }
                                        ArrayList f10 = l1.f(arrayList);
                                        i1 b10 = l1.b(f10);
                                        double atan2 = Math.atan2(b10.f45554b - ((i1) f10.get(0)).f45554b, b10.f45553a - ((i1) f10.get(0)).f45553a);
                                        i1 b11 = l1.b(f10);
                                        double cos = Math.cos(atan2);
                                        double sin = Math.sin(atan2);
                                        int i17 = 0;
                                        while (i17 < f10.size()) {
                                            i1 i1Var6 = (i1) f10.get(i17);
                                            double d16 = i1Var6.f45553a;
                                            double d17 = b11.f45553a;
                                            double d18 = d16 - d17;
                                            double d19 = sin;
                                            double d20 = i1Var6.f45554b;
                                            double d21 = b11.f45554b;
                                            double d22 = d20 - d21;
                                            i1Var6.f45554b = (d22 * cos) + (d18 * d19) + d21;
                                            i1Var6.f45553a = d17 + ((d18 * cos) - (d22 * d19));
                                            i17++;
                                            sin = d19;
                                        }
                                        i1 b12 = l1.b(f10);
                                        double d23 = -b12.f45553a;
                                        double d24 = -b12.f45554b;
                                        for (int i18 = 0; i18 < f10.size(); i18++) {
                                            i1 i1Var7 = (i1) f10.get(i18);
                                            i1Var7.f45553a += d23;
                                            i1Var7.f45554b += d24;
                                        }
                                        j1 a10 = l1.a(f10);
                                        double d25 = a10.f45560c - a10.f45558a;
                                        double d26 = a10.d - a10.f45559b;
                                        for (int i19 = 0; i19 < f10.size(); i19++) {
                                            i1 i1Var8 = (i1) f10.get(i19);
                                            i1Var8.f45553a = (250.0d / d25) * i1Var8.f45553a;
                                            i1Var8.f45554b = (250.0d / d26) * i1Var8.f45554b;
                                        }
                                        i1 b13 = l1.b(f10);
                                        double d27 = Double.MAX_VALUE;
                                        int i20 = -1;
                                        int i21 = -1;
                                        for (int i22 = 0; i22 < l1Var.f45579c.size(); i22++) {
                                            ArrayList arrayList2 = ((k1) l1Var.f45579c.get(i22)).f45569b;
                                            double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                            double d28 = -1.5707963267948966d;
                                            double d29 = 1.0d - sqrt;
                                            double d30 = 1.5707963267948966d;
                                            double d31 = d27;
                                            double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                            double d33 = l1.d(f10, b13, arrayList2, d32);
                                            double d34 = d32;
                                            double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                            double d36 = l1.d(f10, b13, arrayList2, d35);
                                            double d37 = d35;
                                            double d38 = d33;
                                            double d39 = d36;
                                            while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                                if (d38 < d39) {
                                                    double d40 = (d29 * d37) + (sqrt * d28);
                                                    double d41 = l1.d(f10, b13, arrayList2, d40);
                                                    d = d40;
                                                    d39 = d38;
                                                    d38 = d41;
                                                    d30 = d37;
                                                    d37 = d34;
                                                } else {
                                                    double d42 = (sqrt * d30) + (d29 * d34);
                                                    double d43 = l1.d(f10, b13, arrayList2, d42);
                                                    d = d37;
                                                    d37 = d42;
                                                    d38 = d39;
                                                    d39 = d43;
                                                    d28 = d34;
                                                }
                                                d34 = d;
                                            }
                                            double min = Math.min(d38, d39);
                                            if (min < d31) {
                                                i20 = ((k1) l1Var.f45579c.get(i22)).f45568a;
                                                d27 = min;
                                                i21 = i22;
                                            } else {
                                                d27 = d31;
                                            }
                                        }
                                        if (1.0d - (d27 / l1.f45576n) < 0.8d) {
                                            i10 = -1;
                                        } else {
                                            i10 = i20;
                                        }
                                        g1 g1Var = null;
                                        if (i10 >= 0 && i10 < l.f45571b.size() && arrayList.size() >= 1) {
                                            g1 g1Var2 = new g1(l.p(i10));
                                            if (i10 == 4) {
                                                int e10 = l1.e(0, arrayList);
                                                if (e10 > 0) {
                                                    if (e10 > 10) {
                                                        e10 -= 2;
                                                    }
                                                    i1 i1Var9 = (i1) arrayList.get(e10);
                                                    i1 i1Var10 = (i1) arrayList.get(e10 / 2);
                                                    i1 i1Var11 = (i1) arrayList.get(0);
                                                    g1Var2.f45539b = (float) i1Var9.f45553a;
                                                    g1Var2.f45540c = (float) i1Var9.f45554b;
                                                    g1Var2.f45544i = (float) i1Var10.f45553a;
                                                    g1Var2.f45545j = (float) i1Var10.f45554b;
                                                    g1Var2.d = (float) i1Var11.f45553a;
                                                    g1Var2.f45541e = (float) i1Var11.f45554b;
                                                    g1Var2.f45546k = 16.0f;
                                                }
                                            } else {
                                                i1 b14 = l1.b(arrayList);
                                                g1Var2.f45539b = (float) b14.f45553a;
                                                g1Var2.f45540c = (float) b14.f45554b;
                                                j1 a11 = l1.a(arrayList);
                                                g1Var2.d = ((float) (a11.f45560c - a11.f45558a)) / 2.0f;
                                                g1Var2.f45541e = ((float) (a11.d - a11.f45559b)) / 2.0f;
                                                if (i10 == 2 && (e7 = l1.e(1, arrayList)) > 0) {
                                                    i1 i1Var12 = (i1) arrayList.get(e7);
                                                    g1Var2.h = (float) Math.atan2(i1Var12.f45554b - g1Var2.f45540c, i1Var12.f45553a - g1Var2.f45539b);
                                                }
                                            }
                                            g1Var = g1Var2;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            if (g1Var != null) {
                                                str = "";
                                            } else {
                                                str = "not ";
                                            }
                                            sb2.append(str);
                                            sb2.append("detect a shape");
                                            if (g1Var != null) {
                                                str2 = " (template#" + i21 + " shape#" + i10 + ")";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new w21(l1Var, g1Var, i21, f10));
                                        l1Var.f45584j.set(false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        l1 l1Var2 = obj;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    k1 k1Var = new k1();
                                    k1Var.f45568a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            k1Var.f45569b.add(new i1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        k1Var.f45570c = l1Var2.f45582g.getInt("score" + l1Var2.f45579c.size(), 0);
                                        l1Var2.f45579c.add(k1Var);
                                    }
                                }
                            }
                            if (l1Var2.h && (string = l1Var2.f45582g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = l1Var2.f45579c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    k1 k1Var2 = new k1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        c11 = c10;
                                        i12 = i24;
                                    } else {
                                        k1Var2.f45568a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            k1Var2.f45569b.add(new i1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i12 = i24;
                                        c11 = 0;
                                        k1Var2.f45570c = l1Var2.f45582g.getInt("score" + (size + i12), 0);
                                        l1Var2.f45579c.add(k1Var2);
                                    }
                                    i24 = i12 + 1;
                                    c10 = c11;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                }
            }
        });
        this.f45513s = obj;
    }

    public final void a(d dVar, boolean z10, x0 x0Var) {
        Object obj;
        c1 c1Var;
        if (this.f45506l) {
            d1 d1Var = this.f45497a;
            if (!d1Var.getPainting().G && this.f45502g != null) {
                if (dVar == null) {
                    obj = d1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f45506l = false;
                if (r42 instanceof d) {
                    d1Var.getPainting().E = false;
                }
                r0 painting = d1Var.getPainting();
                painting.f45637f.f(new o0(painting, 1));
                this.f45508n = 0;
                this.f45509o = 0;
                this.f45504j = false;
                this.f45498b = false;
                if (z10 && (c1Var = d1Var.f45520a) != null) {
                    c1Var.f();
                }
                sw0 sw0Var = d1Var.getPainting().f45638g;
                v0 v0Var = this.f45502g;
                float a2 = z6.a((float) v0Var.f45708a, (float) v0Var.f45709b, 0.0f, 0.0f);
                v0 v0Var2 = this.f45502g;
                float max = Math.max(a2, z6.a((float) v0Var2.f45708a, (float) v0Var2.f45709b, sw0Var.f30699a, 0.0f));
                v0 v0Var3 = this.f45502g;
                float a10 = z6.a((float) v0Var3.f45708a, (float) v0Var3.f45709b, 0.0f, sw0Var.f30700b);
                v0 v0Var4 = this.f45502g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) v0Var4.f45708a, (float) v0Var4.f45709b, sw0Var.f30699a, sw0Var.f30700b))) / 0.84f;
                ValueAnimator valueAnimator = this.f45512r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f45512r = null;
                }
                ValueAnimator valueAnimator2 = this.f45517x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f45517x = null;
                }
                v0 v0Var5 = this.f45502g;
                final v0 v0Var6 = new v0(v0Var5.f45708a, v0Var5.f45709b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f45517x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        d1 d1Var2 = d0.this.f45497a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        s0 s0Var = new s0(new v0[]{v0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = d1Var2.getCurrentColor();
                        }
                        s0Var.f45667c = currentColor;
                        s0Var.d = floatValue * max2;
                        s0Var.f45668e = mVar;
                        r0 painting2 = d1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f45637f.f(new c8(painting2, s0Var, true, true, null, 4));
                    }
                });
                this.f45517x.addListener(new c0(this, v0Var6, max2, r42, z10, x0Var));
                this.f45517x.setDuration(450L);
                this.f45517x.setInterpolator(js.h);
                this.f45517x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(s0 s0Var) {
        d1 d1Var = this.f45497a;
        int currentColor = d1Var.getCurrentColor();
        float currentWeight = d1Var.getCurrentWeight();
        m currentBrush = d1Var.getCurrentBrush();
        s0Var.f45667c = currentColor;
        s0Var.d = currentWeight;
        s0Var.f45668e = currentBrush;
        if (this.f45501f) {
            this.f45503i = 0.0d;
        }
        s0Var.f45665a = this.f45503i;
        r0 painting = d1Var.getPainting();
        boolean z10 = this.f45501f;
        b0 b0Var = new b0(this, s0Var, 0);
        if (painting.L == null) {
            painting.f45637f.f(new c8(painting, s0Var, z10, false, b0Var, 4));
        }
        this.f45501f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f45508n;
        v0[] v0VarArr = this.f45507m;
        if (i10 > 2) {
            Vector vector = new Vector();
            v0 v0Var = v0VarArr[0];
            v0 v0Var2 = v0VarArr[1];
            v0 v0Var3 = v0VarArr[2];
            if (v0Var3 != null && v0Var2 != null && v0Var != null) {
                v0 b10 = v0Var2.b(v0Var);
                v0 b11 = v0Var3.b(v0Var2);
                int min = (int) Math.min(48.0d, Math.max(Math.floor(b10.a(b11) / 1), 24.0d));
                float f10 = 1.0f;
                float f11 = 1.0f / min;
                int i11 = 0;
                float f12 = 0.0f;
                while (i11 < min) {
                    float f13 = f10 - f12;
                    double d = f13;
                    double pow = Math.pow(d, 2.0d);
                    double d10 = f12 * f12;
                    double d11 = f13 * f13;
                    double d12 = f12;
                    double d13 = (b11.f45708a * d10) + (v0Var2.f45708a * 2.0d * d12 * d) + (b10.f45708a * d11);
                    double d14 = (b11.f45709b * d10) + (v0Var2.f45709b * 2.0d * d12 * d) + (b10.f45709b * d11);
                    double lerp = ((((b11.f45710c * d10) + ((v0Var2.f45710c * ((2.0f * f13) * f12)) + (b10.f45710c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.n.a(this.f45509o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    v0 v0Var4 = new v0(d13, d14, lerp);
                    if (this.f45499c) {
                        v0Var4.d = true;
                        this.f45499c = false;
                    }
                    vector.add(v0Var4);
                    this.f45510p += lerp;
                    this.f45511q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                v0[] v0VarArr2 = new v0[vector.size()];
                vector.toArray(v0VarArr2);
                b(new s0(v0VarArr2));
                System.arraycopy(v0VarArr, 1, v0VarArr, 0, 2);
                if (z10) {
                    this.f45508n = 0;
                    return;
                } else {
                    this.f45508n = 2;
                    return;
                }
            }
            return;
        }
        v0[] v0VarArr3 = new v0[i10];
        System.arraycopy(v0VarArr, 0, v0VarArr3, 0, i10);
        b(new s0(v0VarArr3));
    }
}
