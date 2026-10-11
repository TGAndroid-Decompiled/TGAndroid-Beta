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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.s21;
import v7.z6;
public final class d0 {
    public static final is B = new is(0.0d, 0.5d, 0.0d, 1.0d);
    public m A;
    public final e1 f45643a;
    public boolean f45644b;
    public boolean f45645c;
    public long d;
    public boolean f45646e;
    public boolean f45647f;
    public w0 f45648g;
    public w0 h;
    public double f45649i;
    public boolean f45650j;
    public float f45651k;
    public boolean f45652l;
    public int f45654n;
    public int f45655o;
    public double f45656p;
    public double f45657q;
    public ValueAnimator f45658r;
    public final m1 f45659s;
    public Matrix f45660t;
    public long v;
    public float f45662w;
    public ValueAnimator f45663x;
    public boolean f45665z;
    public final w0[] f45653m = new w0[3];
    public final float[] f45661u = new float[2];
    public final z f45664y = new z(this, 1);

    public d0(e1 e1Var) {
        this.f45643a = e1Var;
        Context context = e1Var.getContext();
        ii.q1 q1Var = new ii.q1(this, 6);
        final ?? obj = new Object();
        obj.f45729b = new ArrayList();
        obj.f45730c = new ArrayList();
        obj.f45734i = null;
        obj.f45735j = new AtomicBoolean(false);
        obj.f45736k = new AtomicBoolean(false);
        obj.f45737l = new Runnable() {
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
                        m1 m1Var = obj;
                        if (!m1Var.f45735j.get()) {
                            m1Var.f45736k.set(false);
                            m1Var.f45735j.set(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (m1Var) {
                                try {
                                    if (m1Var.f45729b.size() < 8) {
                                        m1Var.f45735j.set(false);
                                    } else {
                                        ArrayList f7 = m1.f(m1Var.f45729b);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add((j1) f7.get(0));
                                        double d11 = 0.0d;
                                        for (int i13 = 1; i13 < f7.size(); i13++) {
                                            j1 j1Var = (j1) f7.get(i13 - 1);
                                            j1 j1Var2 = (j1) f7.get(i13);
                                            j1Var.getClass();
                                            d11 += j1Var.a(j1Var2.f45702a, j1Var2.f45703b);
                                        }
                                        double d12 = d11 / 47;
                                        int i14 = 1;
                                        double d13 = 0.0d;
                                        while (i14 < f7.size()) {
                                            int i15 = i14 - 1;
                                            j1 j1Var3 = (j1) f7.get(i15);
                                            j1 j1Var4 = (j1) f7.get(i14);
                                            j1Var3.getClass();
                                            int i16 = i14;
                                            long j3 = currentTimeMillis;
                                            double a2 = j1Var3.a(j1Var4.f45702a, j1Var4.f45703b);
                                            double d14 = d13 + a2;
                                            if (d14 >= d12) {
                                                double d15 = (d12 - d13) / a2;
                                                i11 = i16;
                                                d10 = d12;
                                                j1 j1Var5 = new j1(((((j1) f7.get(i11)).f45702a - ((j1) f7.get(i15)).f45702a) * d15) + ((j1) f7.get(i15)).f45702a, ((((j1) f7.get(i11)).f45703b - ((j1) f7.get(i15)).f45703b) * d15) + ((j1) f7.get(i15)).f45703b);
                                                arrayList.add(j1Var5);
                                                f7.add(i11, j1Var5);
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
                                            arrayList.add((j1) hg.c.g(1, f7));
                                        }
                                        ArrayList f10 = m1.f(arrayList);
                                        j1 b10 = m1.b(f10);
                                        double atan2 = Math.atan2(b10.f45703b - ((j1) f10.get(0)).f45703b, b10.f45702a - ((j1) f10.get(0)).f45702a);
                                        j1 b11 = m1.b(f10);
                                        double cos = Math.cos(atan2);
                                        double sin = Math.sin(atan2);
                                        int i17 = 0;
                                        while (i17 < f10.size()) {
                                            j1 j1Var6 = (j1) f10.get(i17);
                                            double d16 = j1Var6.f45702a;
                                            double d17 = b11.f45702a;
                                            double d18 = d16 - d17;
                                            double d19 = sin;
                                            double d20 = j1Var6.f45703b;
                                            double d21 = b11.f45703b;
                                            double d22 = d20 - d21;
                                            j1Var6.f45703b = (d22 * cos) + (d18 * d19) + d21;
                                            j1Var6.f45702a = d17 + ((d18 * cos) - (d22 * d19));
                                            i17++;
                                            sin = d19;
                                        }
                                        j1 b12 = m1.b(f10);
                                        double d23 = -b12.f45702a;
                                        double d24 = -b12.f45703b;
                                        for (int i18 = 0; i18 < f10.size(); i18++) {
                                            j1 j1Var7 = (j1) f10.get(i18);
                                            j1Var7.f45702a += d23;
                                            j1Var7.f45703b += d24;
                                        }
                                        k1 a10 = m1.a(f10);
                                        double d25 = a10.f45713c - a10.f45711a;
                                        double d26 = a10.d - a10.f45712b;
                                        for (int i19 = 0; i19 < f10.size(); i19++) {
                                            j1 j1Var8 = (j1) f10.get(i19);
                                            j1Var8.f45702a = (250.0d / d25) * j1Var8.f45702a;
                                            j1Var8.f45703b = (250.0d / d26) * j1Var8.f45703b;
                                        }
                                        j1 b13 = m1.b(f10);
                                        double d27 = Double.MAX_VALUE;
                                        int i20 = -1;
                                        int i21 = -1;
                                        for (int i22 = 0; i22 < m1Var.f45730c.size(); i22++) {
                                            ArrayList arrayList2 = ((l1) m1Var.f45730c.get(i22)).f45720b;
                                            double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                            double d28 = -1.5707963267948966d;
                                            double d29 = 1.0d - sqrt;
                                            double d30 = 1.5707963267948966d;
                                            double d31 = d27;
                                            double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                            double d33 = m1.d(f10, b13, arrayList2, d32);
                                            double d34 = d32;
                                            double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                            double d36 = m1.d(f10, b13, arrayList2, d35);
                                            double d37 = d35;
                                            double d38 = d33;
                                            double d39 = d36;
                                            while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                                if (d38 < d39) {
                                                    double d40 = (d29 * d37) + (sqrt * d28);
                                                    double d41 = m1.d(f10, b13, arrayList2, d40);
                                                    d = d40;
                                                    d39 = d38;
                                                    d38 = d41;
                                                    d30 = d37;
                                                    d37 = d34;
                                                } else {
                                                    double d42 = (sqrt * d30) + (d29 * d34);
                                                    double d43 = m1.d(f10, b13, arrayList2, d42);
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
                                                i20 = ((l1) m1Var.f45730c.get(i22)).f45719a;
                                                d27 = min;
                                                i21 = i22;
                                            } else {
                                                d27 = d31;
                                            }
                                        }
                                        if (1.0d - (d27 / m1.f45727n) < 0.8d) {
                                            i10 = -1;
                                        } else {
                                            i10 = i20;
                                        }
                                        h1 h1Var = null;
                                        if (i10 >= 0 && i10 < l.f45714b.size() && arrayList.size() >= 1) {
                                            h1 h1Var2 = new h1(l.p(i10));
                                            if (i10 == 4) {
                                                int e10 = m1.e(0, arrayList);
                                                if (e10 > 0) {
                                                    if (e10 > 10) {
                                                        e10 -= 2;
                                                    }
                                                    j1 j1Var9 = (j1) arrayList.get(e10);
                                                    j1 j1Var10 = (j1) arrayList.get(e10 / 2);
                                                    j1 j1Var11 = (j1) arrayList.get(0);
                                                    h1Var2.f45688b = (float) j1Var9.f45702a;
                                                    h1Var2.f45689c = (float) j1Var9.f45703b;
                                                    h1Var2.f45693i = (float) j1Var10.f45702a;
                                                    h1Var2.f45694j = (float) j1Var10.f45703b;
                                                    h1Var2.d = (float) j1Var11.f45702a;
                                                    h1Var2.f45690e = (float) j1Var11.f45703b;
                                                    h1Var2.f45695k = 16.0f;
                                                }
                                            } else {
                                                j1 b14 = m1.b(arrayList);
                                                h1Var2.f45688b = (float) b14.f45702a;
                                                h1Var2.f45689c = (float) b14.f45703b;
                                                k1 a11 = m1.a(arrayList);
                                                h1Var2.d = ((float) (a11.f45713c - a11.f45711a)) / 2.0f;
                                                h1Var2.f45690e = ((float) (a11.d - a11.f45712b)) / 2.0f;
                                                if (i10 == 2 && (e7 = m1.e(1, arrayList)) > 0) {
                                                    j1 j1Var12 = (j1) arrayList.get(e7);
                                                    h1Var2.h = (float) Math.atan2(j1Var12.f45703b - h1Var2.f45689c, j1Var12.f45702a - h1Var2.f45688b);
                                                }
                                            }
                                            h1Var = h1Var2;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            if (h1Var != null) {
                                                str = "";
                                            } else {
                                                str = "not ";
                                            }
                                            sb2.append(str);
                                            sb2.append("detect a shape");
                                            if (h1Var != null) {
                                                str2 = " (template#" + i21 + " shape#" + i10 + ")";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new s21(m1Var, h1Var, i21, f10));
                                        m1Var.f45735j.set(false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        m1 m1Var2 = obj;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    l1 l1Var = new l1();
                                    l1Var.f45719a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            l1Var.f45720b.add(new j1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        l1Var.f45721c = m1Var2.f45733g.getInt("score" + m1Var2.f45730c.size(), 0);
                                        m1Var2.f45730c.add(l1Var);
                                    }
                                }
                            }
                            if (m1Var2.h && (string = m1Var2.f45733g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = m1Var2.f45730c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    l1 l1Var2 = new l1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        c11 = c10;
                                        i12 = i24;
                                    } else {
                                        l1Var2.f45719a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            l1Var2.f45720b.add(new j1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i12 = i24;
                                        c11 = 0;
                                        l1Var2.f45721c = m1Var2.f45733g.getInt("score" + (size + i12), 0);
                                        m1Var2.f45730c.add(l1Var2);
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
        obj.f45732f = context;
        obj.f45731e = q1Var;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        obj.f45733g = sharedPreferences;
        obj.h = sharedPreferences.getBoolean("learning", false);
        obj.f45728a = sharedPreferences.getInt("scoreall", 0);
        m1.f45726m.postRunnable(new Runnable() {
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
                        m1 m1Var = obj;
                        if (!m1Var.f45735j.get()) {
                            m1Var.f45736k.set(false);
                            m1Var.f45735j.set(true);
                            long currentTimeMillis = System.currentTimeMillis();
                            synchronized (m1Var) {
                                try {
                                    if (m1Var.f45729b.size() < 8) {
                                        m1Var.f45735j.set(false);
                                    } else {
                                        ArrayList f7 = m1.f(m1Var.f45729b);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add((j1) f7.get(0));
                                        double d11 = 0.0d;
                                        for (int i13 = 1; i13 < f7.size(); i13++) {
                                            j1 j1Var = (j1) f7.get(i13 - 1);
                                            j1 j1Var2 = (j1) f7.get(i13);
                                            j1Var.getClass();
                                            d11 += j1Var.a(j1Var2.f45702a, j1Var2.f45703b);
                                        }
                                        double d12 = d11 / 47;
                                        int i14 = 1;
                                        double d13 = 0.0d;
                                        while (i14 < f7.size()) {
                                            int i15 = i14 - 1;
                                            j1 j1Var3 = (j1) f7.get(i15);
                                            j1 j1Var4 = (j1) f7.get(i14);
                                            j1Var3.getClass();
                                            int i16 = i14;
                                            long j3 = currentTimeMillis;
                                            double a2 = j1Var3.a(j1Var4.f45702a, j1Var4.f45703b);
                                            double d14 = d13 + a2;
                                            if (d14 >= d12) {
                                                double d15 = (d12 - d13) / a2;
                                                i11 = i16;
                                                d10 = d12;
                                                j1 j1Var5 = new j1(((((j1) f7.get(i11)).f45702a - ((j1) f7.get(i15)).f45702a) * d15) + ((j1) f7.get(i15)).f45702a, ((((j1) f7.get(i11)).f45703b - ((j1) f7.get(i15)).f45703b) * d15) + ((j1) f7.get(i15)).f45703b);
                                                arrayList.add(j1Var5);
                                                f7.add(i11, j1Var5);
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
                                            arrayList.add((j1) hg.c.g(1, f7));
                                        }
                                        ArrayList f10 = m1.f(arrayList);
                                        j1 b10 = m1.b(f10);
                                        double atan2 = Math.atan2(b10.f45703b - ((j1) f10.get(0)).f45703b, b10.f45702a - ((j1) f10.get(0)).f45702a);
                                        j1 b11 = m1.b(f10);
                                        double cos = Math.cos(atan2);
                                        double sin = Math.sin(atan2);
                                        int i17 = 0;
                                        while (i17 < f10.size()) {
                                            j1 j1Var6 = (j1) f10.get(i17);
                                            double d16 = j1Var6.f45702a;
                                            double d17 = b11.f45702a;
                                            double d18 = d16 - d17;
                                            double d19 = sin;
                                            double d20 = j1Var6.f45703b;
                                            double d21 = b11.f45703b;
                                            double d22 = d20 - d21;
                                            j1Var6.f45703b = (d22 * cos) + (d18 * d19) + d21;
                                            j1Var6.f45702a = d17 + ((d18 * cos) - (d22 * d19));
                                            i17++;
                                            sin = d19;
                                        }
                                        j1 b12 = m1.b(f10);
                                        double d23 = -b12.f45702a;
                                        double d24 = -b12.f45703b;
                                        for (int i18 = 0; i18 < f10.size(); i18++) {
                                            j1 j1Var7 = (j1) f10.get(i18);
                                            j1Var7.f45702a += d23;
                                            j1Var7.f45703b += d24;
                                        }
                                        k1 a10 = m1.a(f10);
                                        double d25 = a10.f45713c - a10.f45711a;
                                        double d26 = a10.d - a10.f45712b;
                                        for (int i19 = 0; i19 < f10.size(); i19++) {
                                            j1 j1Var8 = (j1) f10.get(i19);
                                            j1Var8.f45702a = (250.0d / d25) * j1Var8.f45702a;
                                            j1Var8.f45703b = (250.0d / d26) * j1Var8.f45703b;
                                        }
                                        j1 b13 = m1.b(f10);
                                        double d27 = Double.MAX_VALUE;
                                        int i20 = -1;
                                        int i21 = -1;
                                        for (int i22 = 0; i22 < m1Var.f45730c.size(); i22++) {
                                            ArrayList arrayList2 = ((l1) m1Var.f45730c.get(i22)).f45720b;
                                            double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                            double d28 = -1.5707963267948966d;
                                            double d29 = 1.0d - sqrt;
                                            double d30 = 1.5707963267948966d;
                                            double d31 = d27;
                                            double d32 = (d29 * 1.5707963267948966d) + (sqrt * (-1.5707963267948966d));
                                            double d33 = m1.d(f10, b13, arrayList2, d32);
                                            double d34 = d32;
                                            double d35 = (sqrt * 1.5707963267948966d) + (d29 * (-1.5707963267948966d));
                                            double d36 = m1.d(f10, b13, arrayList2, d35);
                                            double d37 = d35;
                                            double d38 = d33;
                                            double d39 = d36;
                                            while (Math.abs(d30 - d28) > 0.06981317007977318d) {
                                                if (d38 < d39) {
                                                    double d40 = (d29 * d37) + (sqrt * d28);
                                                    double d41 = m1.d(f10, b13, arrayList2, d40);
                                                    d = d40;
                                                    d39 = d38;
                                                    d38 = d41;
                                                    d30 = d37;
                                                    d37 = d34;
                                                } else {
                                                    double d42 = (sqrt * d30) + (d29 * d34);
                                                    double d43 = m1.d(f10, b13, arrayList2, d42);
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
                                                i20 = ((l1) m1Var.f45730c.get(i22)).f45719a;
                                                d27 = min;
                                                i21 = i22;
                                            } else {
                                                d27 = d31;
                                            }
                                        }
                                        if (1.0d - (d27 / m1.f45727n) < 0.8d) {
                                            i10 = -1;
                                        } else {
                                            i10 = i20;
                                        }
                                        h1 h1Var = null;
                                        if (i10 >= 0 && i10 < l.f45714b.size() && arrayList.size() >= 1) {
                                            h1 h1Var2 = new h1(l.p(i10));
                                            if (i10 == 4) {
                                                int e10 = m1.e(0, arrayList);
                                                if (e10 > 0) {
                                                    if (e10 > 10) {
                                                        e10 -= 2;
                                                    }
                                                    j1 j1Var9 = (j1) arrayList.get(e10);
                                                    j1 j1Var10 = (j1) arrayList.get(e10 / 2);
                                                    j1 j1Var11 = (j1) arrayList.get(0);
                                                    h1Var2.f45688b = (float) j1Var9.f45702a;
                                                    h1Var2.f45689c = (float) j1Var9.f45703b;
                                                    h1Var2.f45693i = (float) j1Var10.f45702a;
                                                    h1Var2.f45694j = (float) j1Var10.f45703b;
                                                    h1Var2.d = (float) j1Var11.f45702a;
                                                    h1Var2.f45690e = (float) j1Var11.f45703b;
                                                    h1Var2.f45695k = 16.0f;
                                                }
                                            } else {
                                                j1 b14 = m1.b(arrayList);
                                                h1Var2.f45688b = (float) b14.f45702a;
                                                h1Var2.f45689c = (float) b14.f45703b;
                                                k1 a11 = m1.a(arrayList);
                                                h1Var2.d = ((float) (a11.f45713c - a11.f45711a)) / 2.0f;
                                                h1Var2.f45690e = ((float) (a11.d - a11.f45712b)) / 2.0f;
                                                if (i10 == 2 && (e7 = m1.e(1, arrayList)) > 0) {
                                                    j1 j1Var12 = (j1) arrayList.get(e7);
                                                    h1Var2.h = (float) Math.atan2(j1Var12.f45703b - h1Var2.f45689c, j1Var12.f45702a - h1Var2.f45688b);
                                                }
                                            }
                                            h1Var = h1Var2;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            StringBuilder sb2 = new StringBuilder("took ");
                                            sb2.append(System.currentTimeMillis() - j10);
                                            sb2.append("ms to ");
                                            if (h1Var != null) {
                                                str = "";
                                            } else {
                                                str = "not ";
                                            }
                                            sb2.append(str);
                                            sb2.append("detect a shape");
                                            if (h1Var != null) {
                                                str2 = " (template#" + i21 + " shape#" + i10 + ")";
                                            } else {
                                                str2 = "";
                                            }
                                            sb2.append(str2);
                                            Log.i("shapedetector", sb2.toString());
                                        }
                                        AndroidUtilities.runOnUIThread(new s21(m1Var, h1Var, i21, f10));
                                        m1Var.f45735j.set(false);
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        m1 m1Var2 = obj;
                        try {
                            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c10 = 0;
                                if (open.available() > 5) {
                                    l1 l1Var = new l1();
                                    l1Var.f45719a = open.read();
                                    int read = open.read();
                                    int read2 = open.read() - 64;
                                    int read3 = open.read() - 64;
                                    if (open.available() >= read * 2) {
                                        for (int i23 = 0; i23 < read; i23++) {
                                            l1Var.f45720b.add(new j1((open.read() - read2) - 127, (open.read() - read3) - 127));
                                        }
                                        l1Var.f45721c = m1Var2.f45733g.getInt("score" + m1Var2.f45730c.size(), 0);
                                        m1Var2.f45730c.add(l1Var);
                                    }
                                }
                            }
                            if (m1Var2.h && (string = m1Var2.f45733g.getString("moretemplates", null)) != null) {
                                String[] split = string.split("\\|");
                                int size = m1Var2.f45730c.size();
                                int i24 = 0;
                                while (i24 < split.length) {
                                    l1 l1Var2 = new l1();
                                    String[] split2 = split[i24].split(",");
                                    int i25 = 1;
                                    if (split2.length <= 1) {
                                        c11 = c10;
                                        i12 = i24;
                                    } else {
                                        l1Var2.f45719a = Integer.parseInt(split2[c10]);
                                        while (i25 < split2.length) {
                                            l1Var2.f45720b.add(new j1(Double.parseDouble(split2[i25]), Double.parseDouble(split2[i25 + 1])));
                                            i25 += 2;
                                            i24 = i24;
                                        }
                                        i12 = i24;
                                        c11 = 0;
                                        l1Var2.f45721c = m1Var2.f45733g.getInt("score" + (size + i12), 0);
                                        m1Var2.f45730c.add(l1Var2);
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
        this.f45659s = obj;
    }

    public final void a(d dVar, boolean z10, y0 y0Var) {
        Object obj;
        d1 d1Var;
        if (this.f45652l) {
            e1 e1Var = this.f45643a;
            if (!e1Var.getPainting().G && this.f45648g != null) {
                if (dVar == null) {
                    obj = e1Var.getCurrentBrush();
                } else {
                    obj = dVar;
                }
                if ((obj instanceof c) || (obj instanceof e)) {
                    obj = new Object();
                }
                final ?? r42 = obj;
                this.f45652l = false;
                if (r42 instanceof d) {
                    e1Var.getPainting().E = false;
                }
                s0 painting = e1Var.getPainting();
                painting.f45793f.f(new p0(painting, 1));
                this.f45654n = 0;
                this.f45655o = 0;
                this.f45650j = false;
                this.f45644b = false;
                if (z10 && (d1Var = e1Var.f45667a) != null) {
                    d1Var.f();
                }
                ow0 ow0Var = e1Var.getPainting().f45794g;
                w0 w0Var = this.f45648g;
                float a2 = z6.a((float) w0Var.f45863a, (float) w0Var.f45864b, 0.0f, 0.0f);
                w0 w0Var2 = this.f45648g;
                float max = Math.max(a2, z6.a((float) w0Var2.f45863a, (float) w0Var2.f45864b, ow0Var.f29541a, 0.0f));
                w0 w0Var3 = this.f45648g;
                float a10 = z6.a((float) w0Var3.f45863a, (float) w0Var3.f45864b, 0.0f, ow0Var.f29542b);
                w0 w0Var4 = this.f45648g;
                final float max2 = Math.max(max, Math.max(a10, z6.a((float) w0Var4.f45863a, (float) w0Var4.f45864b, ow0Var.f29541a, ow0Var.f29542b))) / 0.84f;
                ValueAnimator valueAnimator = this.f45658r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f45658r = null;
                }
                ValueAnimator valueAnimator2 = this.f45663x;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.f45663x = null;
                }
                w0 w0Var5 = this.f45648g;
                final w0 w0Var6 = new w0(w0Var5.f45863a, w0Var5.f45864b, 1.0d);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f45663x = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        int currentColor;
                        e1 e1Var2 = d0.this.f45643a;
                        float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        t0 t0Var = new t0(new w0[]{w0Var6});
                        m mVar = r42;
                        mVar.getClass();
                        if (mVar instanceof d) {
                            currentColor = -1;
                        } else {
                            currentColor = e1Var2.getCurrentColor();
                        }
                        t0Var.f45824c = currentColor;
                        t0Var.d = floatValue * max2;
                        t0Var.f45825e = mVar;
                        s0 painting2 = e1Var2.getPainting();
                        if (painting2.L != null) {
                            return;
                        }
                        painting2.f45793f.f(new c8(painting2, t0Var, true, true, null, 4));
                    }
                });
                this.f45663x.addListener(new c0(this, w0Var6, max2, r42, z10, y0Var));
                this.f45663x.setDuration(450L);
                this.f45663x.setInterpolator(is.h);
                this.f45663x.start();
                if (z10) {
                    BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
                }
            }
        }
    }

    public final void b(t0 t0Var) {
        e1 e1Var = this.f45643a;
        int currentColor = e1Var.getCurrentColor();
        float currentWeight = e1Var.getCurrentWeight();
        m currentBrush = e1Var.getCurrentBrush();
        t0Var.f45824c = currentColor;
        t0Var.d = currentWeight;
        t0Var.f45825e = currentBrush;
        if (this.f45647f) {
            this.f45649i = 0.0d;
        }
        t0Var.f45822a = this.f45649i;
        s0 painting = e1Var.getPainting();
        boolean z10 = this.f45647f;
        b0 b0Var = new b0(this, t0Var, 0);
        if (painting.L == null) {
            painting.f45793f.f(new c8(painting, t0Var, z10, false, b0Var, 4));
        }
        this.f45647f = false;
    }

    public final void c(float f7, boolean z10) {
        int i10 = this.f45654n;
        w0[] w0VarArr = this.f45653m;
        if (i10 > 2) {
            Vector vector = new Vector();
            w0 w0Var = w0VarArr[0];
            w0 w0Var2 = w0VarArr[1];
            w0 w0Var3 = w0VarArr[2];
            if (w0Var3 != null && w0Var2 != null && w0Var != null) {
                w0 b10 = w0Var2.b(w0Var);
                w0 b11 = w0Var3.b(w0Var2);
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
                    double d13 = (b11.f45863a * d10) + (w0Var2.f45863a * 2.0d * d12 * d) + (b10.f45863a * d11);
                    double d14 = (b11.f45864b * d10) + (w0Var2.f45864b * 2.0d * d12 * d) + (b10.f45864b * d11);
                    double lerp = ((((b11.f45865c * d10) + ((w0Var2.f45865c * ((2.0f * f13) * f12)) + (b10.f45865c * pow))) - 1.0d) * AndroidUtilities.lerp(f7, 1.0f, w7.o.a(this.f45655o / 16.0f, 0.0f, 1.0f))) + 1.0d;
                    w0 w0Var4 = new w0(d13, d14, lerp);
                    if (this.f45645c) {
                        w0Var4.d = true;
                        this.f45645c = false;
                    }
                    vector.add(w0Var4);
                    this.f45656p += lerp;
                    this.f45657q += 1.0d;
                    f12 += f11;
                    i11++;
                    f10 = 1.0f;
                }
                if (z10) {
                    b11.d = true;
                }
                vector.add(b11);
                w0[] w0VarArr2 = new w0[vector.size()];
                vector.toArray(w0VarArr2);
                b(new t0(w0VarArr2));
                System.arraycopy(w0VarArr, 1, w0VarArr, 0, 2);
                if (z10) {
                    this.f45654n = 0;
                    return;
                } else {
                    this.f45654n = 2;
                    return;
                }
            }
            return;
        }
        w0[] w0VarArr3 = new w0[i10];
        System.arraycopy(w0VarArr, 0, w0VarArr3, 0, i10);
        b(new t0(w0VarArr3));
    }
}
