package qg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.util.Log;
import bi.n7;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.m21;
import v7.f7;
public final class d0 {
    public static final es B = new es(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final c1 f43407a;
    public boolean f43408b;
    public boolean f43409c;
    public long d;
    public boolean e;
    public boolean f43410f;
    public u0 f43411g;
    public u0 h;
    public double f43412i;
    public boolean f43413j;
    public float f43414k;
    public boolean f43415l;
    public int f43417n;
    public int f43418o;
    public double f43419p;
    public double f43420q;
    public ValueAnimator f43421r;
    public final k1 f43422s;
    public Matrix f43423t;
    public long v;
    public float f43425w;
    public ValueAnimator f43426x;
    public boolean f43428z;
    public final u0[] f43416m = new u0[3];
    public final float[] f43424u = new float[2];
    public final z f43427y = new z(this, 1);

    public d0(c1 c1Var) {
        this.f43407a = c1Var;
        Context context = c1Var.getContext();
        ji.p1 p1Var = new ji.p1(this, 6);
        final ?? obj = new Object();
        obj.f43472b = new ArrayList();
        obj.f43473c = new ArrayList();
        obj.f43476i = null;
        obj.f43477j = new AtomicBoolean(false);
        obj.f43478k = new AtomicBoolean(false);
        obj.f43479l = new Runnable() {
            @Override
            public final void run() {
                int i10;
                String str;
                String str2;
                int e;
                double d;
                double d10;
                int i11;
                char c10;
                String string;
                int i12;
                char c11;
                switch (r2) {
                    case 0:
                        k1 k1Var = obj;
                        if (!k1Var.f43477j.get()) {
                            k1Var.f43478k.set(false);
                            k1Var.f43477j.set(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (k1Var) {
                                try {
                                    if (k1Var.f43472b.size() < 8) {
                                        k1Var.f43477j.set(false);
                                    } else {
                                        ArrayList f7 = k1.f(k1Var.f43472b);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add((h1) f7.get(0));
                                        double d11 = 0.0d;
                                        for (int i13 = 1; i13 < f7.size(); i13++) {
                                            h1 h1Var = (h1) f7.get(i13 - 1);
                                            h1 h1Var2 = (h1) f7.get(i13);
                                            h1Var.getClass();
                                            d11 += h1Var.a(h1Var2.f43449a, h1Var2.f43450b);
                                        }
                                        double d12 = d11 / 47;
                                        int i14 = 1;
                                        double d13 = 0.0d;
                                        while (i14 < f7.size()) {
                                            int i15 = i14 - 1;
                                            h1 h1Var3 = (h1) f7.get(i15);
                                            h1 h1Var4 = (h1) f7.get(i14);
                                            h1Var3.getClass();
                                            int i16 = i14;
                                            long j10 = currentTimeMillis;
                                            double a2 = h1Var3.a(h1Var4.f43449a, h1Var4.f43450b);
                                            double d14 = d13 + a2;
                                            if (d14 >= d12) {
                                                double d15 = (d12 - d13) / a2;
                                                i11 = i16;
                                                d10 = d12;
                                                h1 h1Var5 = new h1(((((h1) f7.get(i11)).f43449a - ((h1) f7.get(i15)).f43449a) * d15) + ((h1) f7.get(i15)).f43449a, ((((h1) f7.get(i11)).f43450b - ((h1) f7.get(i15)).f43450b) * d15) + ((h1) f7.get(i15)).f43450b);
                                                arrayList.add(h1Var5);
                                                f7.add(i11, h1Var5);
                                                d13 = 0.0d;
                                            } else {
                                                d10 = d12;
                                                i11 = i16;
                                                d13 = d14;
                                            }
                                            i14 = i11 + 1;
                                            currentTimeMillis = j10;
                                            d12 = d10;
                                        }
                                        long j11 = currentTimeMillis;
                                        if (arrayList.size() == 47) {
                                            arrayList.add((h1) i2.d.g(1, f7));
                                        }
                                        ArrayList f10 = k1.f(arrayList);
                                        h1 b10 = k1.b(f10);
                                        double atan2 = Math.atan2(b10.f43450b - ((h1) f10.get(0)).f43450b, b10.f43449a - ((h1) f10.get(0)).f43449a);
                                        h1 b11 = k1.b(f10);
                                        double cos = Math.cos(atan2);
                                        double sin = Math.sin(atan2);
                                        int i17 = 0;
                                        while (i17 < f10.size()) {
                                            h1 h1Var6 = (h1) f10.get(i17);
                                            double d16 = h1Var6.f43449a;
                                            double d17 = b11.f43449a;
                                            double d18 = d16 - d17;
                                            double d19 = sin;
                                            double d20 = h1Var6.f43450b;
                                            double d21 = b11.f43450b;
                                            double d22 = d20 - d21;
                                            h1Var6.f43450b = (d22 * cos) + (d18 * d19) + d21;
                                            h1Var6.f43449a = d17 + ((d18 * cos) - (d22 * d19));
                                            i17++;
                                            sin = d19;
                                        }
                                        h1 b12 = k1.b(f10);
                                        double d23 = -b12.f43449a;
                                        double d24 = -b12.f43450b;
                                        for (int i18 = 0; i18 < f10.size(); i18++) {
                                            h1 h1Var7 = (h1) f10.get(i18);
                                            h1Var7.f43449a += d23;
                                            h1Var7.f43450b += d24;
                                        }
                                        i1 a10 = k1.a(f10);
                                        double d25 = a10.f43456c - a10.f43454a;
                                        double d26 = a10.d - a10.f43455b;
                                        for (int i19 = 0; i19 < f10.size(); i19++) {
                                            h1 h1Var8 = (h1) f10.get(i19);
                                            h1Var8.f43449a = (250.0d / d25) * h1Var8.f43449a;
                                            h1Var8.f43450b = (250.0d / d26) * h1Var8.f43450b;
                                        }
                                        h1 b13 = k1.b(f10);
                                        double d27 = Double.MAX_VALUE;
                                        int i20 = -1;
                                        int i21 = -1;
                                        for (int i22 = 0; i22 < k1Var.f43473c.size(); i22++) {
                                            ArrayList arrayList2 = ((j1) k1Var.f43473c.get(i22)).f43464b;
                                            double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                            double d28 = -1.5707963267948966d;
                                            double d29 = 1.0d - sqrt;
                                            double d30 = 1.5707963267948966d;
                                            double d31 = d27;
                                            double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                            double d33 = k1.d(f10, b13, arrayList2, d32);
                                            double d34 = d32;
                                            double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                            double d36 = k1.d(f10, b13, arrayList2, d35);
                                            double d37 = d35;
                                            double d38 = d33;
                                            double d39 = d36;
                                            while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                                if (d38 < d39) {
                                                    double d40 = (d29 * d37) + (sqrt * d28);
                                                    double d41 = k1.d(f10, b13, arrayList2, d40);
                                                    d = d40;
                                                    d39 = d38;
                                                    d38 = d41;
                                                    d30 = d37;
                                                    d37 = d34;
                                                } else {
                                                    double d42 = (sqrt * d30) + (d29 * d34);
                                                    double d43 = k1.d(f10, b13, arrayList2, d42);
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
                                                i20 = ((j1) k1Var.f43473c.get(i22)).f43463a;
                                                d27 = min;
                                                i21 = i22;
                                            } else {
                                                d27 = d31;
                                            }
                                        }
                                        if (1.0d - (d27 / k1.f43470n) < 0.8d) {
                                            i10 = -1;
                                        } else {
                                            i10 = i20;
                                        }
                                        f1 f1Var = null;
                                        if (i10 >= 0 && i10 < l.f43480b.size() && arrayList.size() >= 1) {
                                            f1 f1Var2 = new f1(l.p(i10));
                                            if (i10 == 4) {
                                                int e7 = k1.e(0, arrayList);
                                                if (e7 > 0) {
                                                    if (e7 > 10) {
                                                        e7 -= 2;
                                                    }
                                                    h1 h1Var9 = (h1) arrayList.get(e7);
                                                    h1 h1Var10 = (h1) arrayList.get(e7 / 2);
                                                    h1 h1Var11 = (h1) arrayList.get(0);
                                                    f1Var2.f43436b = (float) h1Var9.f43449a;
                                                    f1Var2.f43437c = (float) h1Var9.f43450b;
                                                    f1Var2.f43440i = (float) h1Var10.f43449a;
                                                    f1Var2.f43441j = (float) h1Var10.f43450b;
                                                    f1Var2.d = (float) h1Var11.f43449a;
                                                    f1Var2.e = (float) h1Var11.f43450b;
                                                    f1Var2.f43442k = 16.0f;
                                                }
                                            } else {
                                                h1 b14 = k1.b(arrayList);
                                                f1Var2.f43436b = (float) b14.f43449a;
                                                f1Var2.f43437c = (float) b14.f43450b;
                                                i1 a11 = k1.a(arrayList);
                                                f1Var2.d = ((float) (a11.f43456c - a11.f43454a)) / 2.0f;
                                                f1Var2.e = ((float) (a11.d - a11.f43455b)) / 2.0f;
                                                if (i10 == 2 && (e = k1.e(1, arrayList)) > 0) {
                                                    h1 h1Var12 = (h1) arrayList.get(e);
                                                    f1Var2.h = (float) Math.atan2(h1Var12.f43450b - f1Var2.f43437c, h1Var12.f43449a - f1Var2.f43436b);
                                                }
                                            }
                                            f1Var = f1Var2;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            if (f1Var != null) {
                                                str = "";
                                            } else {
                                                str = "not ";
                                            }
                                            sb2.append(str);
                                            sb2.append("detect a shape");
                                            if (f1Var != null) {
                                                str2 = " (template#" + i21 + " shape#" + i10 + ")";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new m21(k1Var, f1Var, i21, f10));
                                        k1Var.f43477j.set(false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        k1 k1Var2 = obj;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    j1 j1Var = new j1();
                                    j1Var.f43463a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            j1Var.f43464b.add(new h1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        j1Var.f43465c = k1Var2.f43475g.getInt("score" + k1Var2.f43473c.size(), 0);
                                        k1Var2.f43473c.add(j1Var);
                                    }
                                }
                            }
                            if (k1Var2.h && (string = k1Var2.f43475g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = k1Var2.f43473c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    j1 j1Var2 = new j1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        c11 = c10;
                                        i12 = i24;
                                    } else {
                                        j1Var2.f43463a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            j1Var2.f43464b.add(new h1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i12 = i24;
                                        c11 = 0;
                                        j1Var2.f43465c = k1Var2.f43475g.getInt("score" + (size + i12), 0);
                                        k1Var2.f43473c.add(j1Var2);
                                    }
                                    i24 = i12 + 1;
                                    c10 = c11;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        };
        obj.f43474f = context;
        obj.e = p1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f43475g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f43471a = sharedPreferences.getInt("scoreall", 0);
        k1.f43469m.postRunnable(new Runnable() {
            @Override
            public final void run() {
                int i10;
                String str;
                String str2;
                int e;
                double d;
                double d10;
                int i11;
                char c10;
                String string;
                int i12;
                char c11;
                switch (r2) {
                    case 0:
                        k1 k1Var = obj;
                        if (!k1Var.f43477j.get()) {
                            k1Var.f43478k.set(false);
                            k1Var.f43477j.set(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (k1Var) {
                                try {
                                    if (k1Var.f43472b.size() < 8) {
                                        k1Var.f43477j.set(false);
                                    } else {
                                        ArrayList f7 = k1.f(k1Var.f43472b);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add((h1) f7.get(0));
                                        double d11 = 0.0d;
                                        for (int i13 = 1; i13 < f7.size(); i13++) {
                                            h1 h1Var = (h1) f7.get(i13 - 1);
                                            h1 h1Var2 = (h1) f7.get(i13);
                                            h1Var.getClass();
                                            d11 += h1Var.a(h1Var2.f43449a, h1Var2.f43450b);
                                        }
                                        double d12 = d11 / 47;
                                        int i14 = 1;
                                        double d13 = 0.0d;
                                        while (i14 < f7.size()) {
                                            int i15 = i14 - 1;
                                            h1 h1Var3 = (h1) f7.get(i15);
                                            h1 h1Var4 = (h1) f7.get(i14);
                                            h1Var3.getClass();
                                            int i16 = i14;
                                            long j10 = currentTimeMillis;
                                            double a2 = h1Var3.a(h1Var4.f43449a, h1Var4.f43450b);
                                            double d14 = d13 + a2;
                                            if (d14 >= d12) {
                                                double d15 = (d12 - d13) / a2;
                                                i11 = i16;
                                                d10 = d12;
                                                h1 h1Var5 = new h1(((((h1) f7.get(i11)).f43449a - ((h1) f7.get(i15)).f43449a) * d15) + ((h1) f7.get(i15)).f43449a, ((((h1) f7.get(i11)).f43450b - ((h1) f7.get(i15)).f43450b) * d15) + ((h1) f7.get(i15)).f43450b);
                                                arrayList.add(h1Var5);
                                                f7.add(i11, h1Var5);
                                                d13 = 0.0d;
                                            } else {
                                                d10 = d12;
                                                i11 = i16;
                                                d13 = d14;
                                            }
                                            i14 = i11 + 1;
                                            currentTimeMillis = j10;
                                            d12 = d10;
                                        }
                                        long j11 = currentTimeMillis;
                                        if (arrayList.size() == 47) {
                                            arrayList.add((h1) i2.d.g(1, f7));
                                        }
                                        ArrayList f10 = k1.f(arrayList);
                                        h1 b10 = k1.b(f10);
                                        double atan2 = Math.atan2(b10.f43450b - ((h1) f10.get(0)).f43450b, b10.f43449a - ((h1) f10.get(0)).f43449a);
                                        h1 b11 = k1.b(f10);
                                        double cos = Math.cos(atan2);
                                        double sin = Math.sin(atan2);
                                        int i17 = 0;
                                        while (i17 < f10.size()) {
                                            h1 h1Var6 = (h1) f10.get(i17);
                                            double d16 = h1Var6.f43449a;
                                            double d17 = b11.f43449a;
                                            double d18 = d16 - d17;
                                            double d19 = sin;
                                            double d20 = h1Var6.f43450b;
                                            double d21 = b11.f43450b;
                                            double d22 = d20 - d21;
                                            h1Var6.f43450b = (d22 * cos) + (d18 * d19) + d21;
                                            h1Var6.f43449a = d17 + ((d18 * cos) - (d22 * d19));
                                            i17++;
                                            sin = d19;
                                        }
                                        h1 b12 = k1.b(f10);
                                        double d23 = -b12.f43449a;
                                        double d24 = -b12.f43450b;
                                        for (int i18 = 0; i18 < f10.size(); i18++) {
                                            h1 h1Var7 = (h1) f10.get(i18);
                                            h1Var7.f43449a += d23;
                                            h1Var7.f43450b += d24;
                                        }
                                        i1 a10 = k1.a(f10);
                                        double d25 = a10.f43456c - a10.f43454a;
                                        double d26 = a10.d - a10.f43455b;
                                        for (int i19 = 0; i19 < f10.size(); i19++) {
                                            h1 h1Var8 = (h1) f10.get(i19);
                                            h1Var8.f43449a = (250.0d / d25) * h1Var8.f43449a;
                                            h1Var8.f43450b = (250.0d / d26) * h1Var8.f43450b;
                                        }
                                        h1 b13 = k1.b(f10);
                                        double d27 = Double.MAX_VALUE;
                                        int i20 = -1;
                                        int i21 = -1;
                                        for (int i22 = 0; i22 < k1Var.f43473c.size(); i22++) {
                                            ArrayList arrayList2 = ((j1) k1Var.f43473c.get(i22)).f43464b;
                                            double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                            double d28 = -1.5707963267948966d;
                                            double d29 = 1.0d - sqrt;
                                            double d30 = 1.5707963267948966d;
                                            double d31 = d27;
                                            double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                            double d33 = k1.d(f10, b13, arrayList2, d32);
                                            double d34 = d32;
                                            double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                            double d36 = k1.d(f10, b13, arrayList2, d35);
                                            double d37 = d35;
                                            double d38 = d33;
                                            double d39 = d36;
                                            while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                                if (d38 < d39) {
                                                    double d40 = (d29 * d37) + (sqrt * d28);
                                                    double d41 = k1.d(f10, b13, arrayList2, d40);
                                                    d = d40;
                                                    d39 = d38;
                                                    d38 = d41;
                                                    d30 = d37;
                                                    d37 = d34;
                                                } else {
                                                    double d42 = (sqrt * d30) + (d29 * d34);
                                                    double d43 = k1.d(f10, b13, arrayList2, d42);
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
                                                i20 = ((j1) k1Var.f43473c.get(i22)).f43463a;
                                                d27 = min;
                                                i21 = i22;
                                            } else {
                                                d27 = d31;
                                            }
                                        }
                                        if (1.0d - (d27 / k1.f43470n) < 0.8d) {
                                            i10 = -1;
                                        } else {
                                            i10 = i20;
                                        }
                                        f1 f1Var = null;
                                        if (i10 >= 0 && i10 < l.f43480b.size() && arrayList.size() >= 1) {
                                            f1 f1Var2 = new f1(l.p(i10));
                                            if (i10 == 4) {
                                                int e7 = k1.e(0, arrayList);
                                                if (e7 > 0) {
                                                    if (e7 > 10) {
                                                        e7 -= 2;
                                                    }
                                                    h1 h1Var9 = (h1) arrayList.get(e7);
                                                    h1 h1Var10 = (h1) arrayList.get(e7 / 2);
                                                    h1 h1Var11 = (h1) arrayList.get(0);
                                                    f1Var2.f43436b = (float) h1Var9.f43449a;
                                                    f1Var2.f43437c = (float) h1Var9.f43450b;
                                                    f1Var2.f43440i = (float) h1Var10.f43449a;
                                                    f1Var2.f43441j = (float) h1Var10.f43450b;
                                                    f1Var2.d = (float) h1Var11.f43449a;
                                                    f1Var2.e = (float) h1Var11.f43450b;
                                                    f1Var2.f43442k = 16.0f;
                                                }
                                            } else {
                                                h1 b14 = k1.b(arrayList);
                                                f1Var2.f43436b = (float) b14.f43449a;
                                                f1Var2.f43437c = (float) b14.f43450b;
                                                i1 a11 = k1.a(arrayList);
                                                f1Var2.d = ((float) (a11.f43456c - a11.f43454a)) / 2.0f;
                                                f1Var2.e = ((float) (a11.d - a11.f43455b)) / 2.0f;
                                                if (i10 == 2 && (e = k1.e(1, arrayList)) > 0) {
                                                    h1 h1Var12 = (h1) arrayList.get(e);
                                                    f1Var2.h = (float) Math.atan2(h1Var12.f43450b - f1Var2.f43437c, h1Var12.f43449a - f1Var2.f43436b);
                                                }
                                            }
                                            f1Var = f1Var2;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j11);
                                            sb2.append("ms to ");
                                            if (f1Var != null) {
                                                str = "";
                                            } else {
                                                str = "not ";
                                            }
                                            sb2.append(str);
                                            sb2.append("detect a shape");
                                            if (f1Var != null) {
                                                str2 = " (template#" + i21 + " shape#" + i10 + ")";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new m21(k1Var, f1Var, i21, f10));
                                        k1Var.f43477j.set(false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        k1 k1Var2 = obj;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    j1 j1Var = new j1();
                                    j1Var.f43463a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            j1Var.f43464b.add(new h1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        j1Var.f43465c = k1Var2.f43475g.getInt("score" + k1Var2.f43473c.size(), 0);
                                        k1Var2.f43473c.add(j1Var);
                                    }
                                }
                            }
                            if (k1Var2.h && (string = k1Var2.f43475g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = k1Var2.f43473c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    j1 j1Var2 = new j1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        c11 = c10;
                                        i12 = i24;
                                    } else {
                                        j1Var2.f43463a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            j1Var2.f43464b.add(new h1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i12 = i24;
                                        c11 = 0;
                                        j1Var2.f43465c = k1Var2.f43475g.getInt("score" + (size + i12), 0);
                                        k1Var2.f43473c.add(j1Var2);
                                    }
                                    i24 = i12 + 1;
                                    c10 = c11;
                                }
                            }
                            open.close();
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                }
            }
        });
        this.f43422s = obj;
    }

    public final void a(d dVar, boolean z10, w0 w0Var) {
        Object obj;
        b1 b1Var;
        if (this.f43415l) {
            c1 c1Var = this.f43407a;
            if (!c1Var.getPainting().G && this.f43411g != null) {
                if (dVar == null) {
                    obj = c1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f43415l = false;
                if (r42 instanceof d) {
                    c1Var.getPainting().E = false;
                }
                q0 painting = c1Var.getPainting();
                painting.f43524f.f(new n0(painting, 1));
                this.f43417n = 0;
                this.f43418o = 0;
                this.f43413j = false;
                this.f43408b = false;
                if (z10 && (b1Var = c1Var.f43397a) != null) {
                    b1Var.f();
                }
                iw0 iw0Var = c1Var.getPainting().f43525g;
                u0 u0Var = this.f43411g;
                float a2 = f7.a((float) u0Var.f43588a, (float) u0Var.f43589b, 0.0f, 0.0f);
                u0 u0Var2 = this.f43411g;
                float max = Math.max(a2, f7.a((float) u0Var2.f43588a, (float) u0Var2.f43589b, iw0Var.f26116a, 0.0f));
                u0 u0Var3 = this.f43411g;
                float a10 = f7.a((float) u0Var3.f43588a, (float) u0Var3.f43589b, 0.0f, iw0Var.f26117b);
                u0 u0Var4 = this.f43411g;
                final float max2 = Math.max(max, Math.max(a10, f7.a((float) u0Var4.f43588a, (float) u0Var4.f43589b, iw0Var.f26116a, iw0Var.f26117b))) / 0.84f;
                ValueAnimator valueAnimator = this.f43421r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f43421r = null;
                }
                ValueAnimator valueAnimator2 = this.f43426x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f43426x = null;
                }
                u0 u0Var5 = this.f43411g;
                final u0 u0Var6 = new u0(u0Var5.f43588a, u0Var5.f43589b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f43426x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        c1 c1Var2 = d0.this.f43407a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        r0 r0Var = new r0(new u0[]{u0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = c1Var2.getCurrentColor();
                        }
                        r0Var.f43551c = currentColor;
                        r0Var.d = floatValue * max2;
                        r0Var.e = mVar;
                        q0 painting2 = c1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f43524f.f(new n7(painting2, r0Var, true, true, null, 5));
                    }
                });
                this.f43426x.addListener(new c0(this, u0Var6, max2, r42, z10, w0Var));
                this.f43426x.setDuration(450L);
                this.f43426x.setInterpolator(es.h);
                this.f43426x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(r0 r0Var) {
        c1 c1Var = this.f43407a;
        int currentColor = c1Var.getCurrentColor();
        float currentWeight = c1Var.getCurrentWeight();
        m currentBrush = c1Var.getCurrentBrush();
        r0Var.f43551c = currentColor;
        r0Var.d = currentWeight;
        r0Var.e = currentBrush;
        if (this.f43410f) {
            this.f43412i = 0.0d;
        }
        r0Var.f43549a = this.f43412i;
        q0 painting = c1Var.getPainting();
        boolean z10 = this.f43410f;
        b0 b0Var = new b0(this, r0Var, 0);
        if (painting.L == null) {
            painting.f43524f.f(new n7(painting, r0Var, z10, false, b0Var, 5));
        }
        this.f43410f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f43417n;
        u0[] u0VarArr = this.f43416m;
        if (i10 > 2) {
            Vector vector = new Vector();
            u0 u0Var = u0VarArr[0];
            u0 u0Var2 = u0VarArr[1];
            u0 u0Var3 = u0VarArr[2];
            if (u0Var3 != null && u0Var2 != null && u0Var != null) {
                u0 b10 = u0Var2.b(u0Var);
                u0 b11 = u0Var3.b(u0Var2);
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
                    double d13 = (b11.f43588a * d10) + (u0Var2.f43588a * 2.0d * d12 * d) + (b10.f43588a * d11);
                    double d14 = (b11.f43589b * d10) + (u0Var2.f43589b * 2.0d * d12 * d) + (b10.f43589b * d11);
                    double lerp = ((((b11.f43590c * d10) + ((u0Var2.f43590c * ((2.0f * f13) * f12)) + (b10.f43590c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.s.a(this.f43418o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    u0 u0Var4 = new u0(d13, d14, lerp);
                    if (this.f43409c) {
                        u0Var4.d = true;
                        this.f43409c = false;
                    }
                    vector.add(u0Var4);
                    this.f43419p += lerp;
                    this.f43420q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                u0[] u0VarArr2 = new u0[vector.size()];
                vector.toArray(u0VarArr2);
                b(new r0(u0VarArr2));
                System.arraycopy(u0VarArr, 1, u0VarArr, 0, 2);
                if (z10) {
                    this.f43417n = 0;
                    return;
                } else {
                    this.f43417n = 2;
                    return;
                }
            }
            return;
        }
        u0[] u0VarArr3 = new u0[i10];
        System.arraycopy(u0VarArr, 0, u0VarArr3, 0, i10);
        b(new r0(u0VarArr3));
    }
}
