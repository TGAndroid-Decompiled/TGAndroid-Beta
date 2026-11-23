package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x6 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public static volatile boolean f53566i0 = false;
    public static long f53567j0;
    public static Long f53568k0;
    public static Long f53569l0;
    public static Long m0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public i6 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public te.a T;
    public te.a U;
    public int[] V;
    public float[] W;
    public u6 X;
    public k6 Y;
    public p6 Z;
    public v6 f53570a;
    public au f53571a0;
    public di.b1 f53572b;
    public long f53573b0;
    public org.telegram.ui.ActionBar.t1 f53574c;
    public org.telegram.ui.Components.tt0 f53575c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.y0 f53576d0;
    public long f53577e;
    public ei.c f53578e0;
    public long f53579f;
    public final ArrayList f53580f0;
    public final ArrayList f53581g0;
    public long h;
    public boolean f53582h0;
    public long f53583n;
    public long f53584r;
    public long f53585s;
    public long f53586w;
    public long f53587x;
    public long f53588y;

    public x6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f53577e = -1L;
        this.f53579f = -1L;
        this.h = -1L;
        this.f53583n = -1L;
        this.f53584r = -1L;
        this.f53585s = -1L;
        this.f53586w = -1L;
        this.f53587x = -1L;
        this.f53588y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.S = -1;
        this.f53580f0 = new ArrayList();
        this.f53581g0 = new ArrayList();
    }

    public static void Z(x6 x6Var, boolean z10, long j3, n6 n6Var) {
        if (z10) {
            org.telegram.messenger.fc.D().j();
        }
        try {
            org.telegram.ui.ActionBar.t1 t1Var = x6Var.f53574c;
            if (t1Var != null) {
                t1Var.dismiss();
                x6Var.f53574c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        x6Var.getMediaDataController().A0.b();
        org.telegram.messenger.g0.h3(new bi.e4(x6Var, j3, 21), 150L);
        org.telegram.messenger.si.d0(x6Var.currentAccount).w(true);
        org.telegram.messenger.f8 f8Var = x6Var.getFileLoader().d;
        f8Var.d();
        f8Var.f23839a.c(new b6(x6Var, 1));
        n6Var.run();
    }

    public static void a0(x6 x6Var, float f10) {
        x6Var.simpleActionBar.setTitlesAlpha(f10);
        x6Var.z0();
        x6Var.fragmentView.invalidate();
    }

    public static void b0(org.telegram.ui.x6 r23, org.telegram.ui.m6 r24, org.telegram.ui.n6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x6.b0(org.telegram.ui.x6, org.telegram.ui.m6, org.telegram.ui.n6):void");
    }

    public static void c0(x6 x6Var, org.telegram.ui.ActionBar.t1 t1Var) {
        org.telegram.messenger.w7.G(x6Var.currentAccount).i();
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(x6 x6Var, boolean z10) {
        if (x6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, x6Var.getParentActivity(), null);
        x6Var.f53574c = t1Var;
        t1Var.f29999j0 = false;
        t1Var.r(500L);
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(x6Var.currentAccount);
        u12.Q1.b();
        u12.M1.b();
        u12.N1.b();
        u12.O1.b();
        u12.P1.b();
        if (z10) {
            org.telegram.messenger.ur messagesStorage = x6Var.getMessagesStorage();
            messagesStorage.f27214a.c(new org.telegram.messenger.qq(messagesStorage, 12));
            return;
        }
        org.telegram.messenger.ur messagesStorage2 = x6Var.getMessagesStorage();
        messagesStorage2.f27214a.c(new org.telegram.messenger.qq(messagesStorage2, 16));
    }

    public static org.telegram.ui.ActionBar.z4 e0(x6 x6Var) {
        return x6Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.z4 f0(x6 x6Var) {
        return x6Var.simpleActionBar;
    }

    public static void i0(x6 x6Var) {
        String G;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        boolean z13 = false;
        if (x6Var.f53578e0.f10971j.size() > 0) {
            if (x6Var.N != null) {
                if (!x6Var.f53578e0.f10973l.isEmpty()) {
                    ArrayList arrayList = x6Var.f53578e0.f10965b;
                    int size = arrayList.size();
                    int i7 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        r6 r6Var = (r6) obj;
                        if (x6Var.f53578e0.f10973l.contains(Long.valueOf(r6Var.f51495a))) {
                            i7 += r6Var.f51496b;
                        }
                    }
                    int size2 = x6Var.f53578e0.f10971j.size() - i7;
                    if (size2 > 0) {
                        G = a8.p0.E(org.telegram.messenger.hd.G(x6Var.f53578e0.f10973l.size(), "Chats", Integer.valueOf(x6Var.f53578e0.f10973l.size())), ", ", org.telegram.messenger.hd.G(size2, "Files", Integer.valueOf(size2)));
                    } else {
                        G = org.telegram.messenger.hd.G(x6Var.f53578e0.f10973l.size(), "Chats", Integer.valueOf(x6Var.f53578e0.f10973l.size()));
                    }
                } else {
                    G = org.telegram.messenger.hd.G(x6Var.f53578e0.f10971j.size(), "Files", Integer.valueOf(x6Var.f53578e0.f10971j.size()));
                }
                String i02 = org.telegram.messenger.g0.i0(x6Var.f53578e0.f10972k, false, false);
                org.telegram.ui.ActionBar.z4 z4Var = x6Var.simpleActionBar;
                boolean z14 = org.telegram.messenger.hd.f24408a0;
                z4Var.q();
                org.telegram.ui.Components.o6 o6Var = z4Var.f30297f;
                if (!z14 && z4Var.y() && z4Var.H) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o6Var.c(i02, z10, true);
                org.telegram.ui.ActionBar.z4 z4Var2 = x6Var.simpleActionBar;
                boolean z15 = org.telegram.messenger.hd.f24408a0;
                z4Var2.q();
                if (z4Var2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(z4Var2.getContext(), true, true, true);
                        z4Var2.h = o6Var2;
                        o6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        z4Var2.h.setTextColor(z4Var2.f30298f0);
                        z4Var2.h.setGravity(19);
                        z4Var2.h.setEllipsizeByGradient(true);
                        z4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.nr.h);
                        z4Var2.addView(z4Var2.h, z4Var2.indexOfChild(z4Var2.f30290b), c8.na.e(-1, 18, 51));
                        z4Var2.l();
                    }
                    x6Var.N.f(true);
                    return;
                }
                org.telegram.ui.Components.o6 o6Var3 = z4Var2.h;
                if (o6Var3 != null && o6Var3.getTag() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.o6 o6Var4 = z4Var2.h;
                if (!z15 && z4Var2.y() && z4Var2.H) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                o6Var4.c(G, z12, true);
                org.telegram.ui.Components.o6 o6Var5 = z4Var2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                o6Var5.setTag(num);
                org.telegram.ui.Components.o6 o6Var6 = z4Var2.h;
                if (o6Var6 != null && o6Var6.getTag() != null) {
                    z13 = true;
                }
                if (z11 != z13) {
                    z4Var2.requestLayout();
                }
                x6Var.N.f(true);
                return;
            }
            return;
        }
        x6Var.N.f(false);
    }

    public static String j0(x6 x6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void k0(x6 x6Var) {
        if (x6Var.f53578e0.f10971j.size() != 0 && x6Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x6Var.getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131752086, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131752083, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752089, null), new y5(x6Var, 2));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            x6Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
            }
        }
    }

    public static void l0(x6 x6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x6Var.getParentActivity());
        String N0 = org.telegram.messenger.hd.N0(2131748578, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
        t1Var.S = N0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131748580, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.f3.p("LocalDatabaseClearText2", null, 2131748579, new Object[]{org.telegram.messenger.g0.i0(x6Var.f53577e, false, false)}, spannableStringBuilder);
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752637, null), new ab.z(3, x6Var, z10));
        x6Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29588q7, null);
        }
    }

    public static void m0(org.telegram.messenger.y10 y10Var) {
        Long l10 = f53568k0;
        if (l10 != null) {
            y10Var.a(l10);
            if (System.currentTimeMillis() - f53567j0 < 5000) {
                return;
            }
        }
        Utilities.f22775f.c(new iq0(y10Var, 15));
    }

    public static void n0(String str, int i7, int[] iArr, org.telegram.messenger.y10 y10Var) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int p02 = p0(i7, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!".".equals(name)) {
                    if (i7 > 0 && name.length() >= 4) {
                        String lowerCase = name.toLowerCase();
                        if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (z10) {
                            if (i7 == 1) {
                            }
                        }
                        if (!z10) {
                            if (i7 == 2) {
                            }
                        }
                        if (z11) {
                            if (i7 == 5) {
                            }
                        }
                        if (!z11) {
                            if (i7 == 3) {
                            }
                        }
                        if (z12) {
                            if (i7 == 5) {
                            }
                        }
                        if (!z12 && i7 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            n0(a8.p0.E(str, "/", name), i7, iArr, y10Var);
                        }
                    } else {
                        file2.delete();
                        int i10 = iArr[0] + 1;
                        iArr[0] = i10;
                        if (y10Var != null) {
                            y10Var.a(Float.valueOf(i10 / p02));
                        }
                    }
                }
            }
        }
    }

    public static int p0(int i7, String str) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i10 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i7 > 0 && name.length() >= 4) {
                    String lowerCase = name.toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z10) {
                        if (i7 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i7 == 2) {
                        }
                    }
                    if (z11) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i7 == 3) {
                        }
                    }
                    if (z12) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z12 && i7 == 4) {
                    }
                }
                if (file2.isDirectory()) {
                    i10 += p0(i7, str + "/" + name);
                } else {
                    i10++;
                }
            }
        }
        return i10;
    }

    public static void r0(a5 a5Var) {
        Long l10;
        Long l11 = f53569l0;
        if (l11 != null && (l10 = m0) != null) {
            a5Var.a(l11, l10);
        } else {
            Utilities.f22775f.c(new iq0(a5Var, 14));
        }
    }

    public static long s0(File file, int i7) {
        if (file != null && !f53566i0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i7, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean u0(int i7, String str) {
        if (str != null && org.telegram.messenger.w7.j(i7) != null) {
            return str.contains(org.telegram.messenger.w7.j(i7).getAbsolutePath());
        }
        return false;
    }

    public final void A0(boolean z10) {
        boolean z11;
        boolean z12;
        long j3;
        boolean z13;
        float[] fArr;
        ei.c cVar;
        org.telegram.ui.Components.tt0 tt0Var = this.f53575c0;
        if (tt0Var != null && tt0Var.f40026f0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && System.currentTimeMillis() - this.f53573b0 < 80) {
            z12 = false;
        } else {
            z12 = z10;
        }
        ArrayList arrayList = this.f53580f0;
        arrayList.clear();
        ArrayList arrayList2 = this.f53581g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new t6(9, (String) null));
        arrayList2.add(new t6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            z13 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f53588y > 0) {
                arrayList3.add(t6.b(0, this.f53588y, org.telegram.messenger.hd.N0(2131748570, null), org.telegram.ui.ActionBar.m6.ck));
            }
            if (this.E > 0) {
                arrayList3.add(t6.b(1, this.E, org.telegram.messenger.hd.N0(2131748566, null), org.telegram.ui.ActionBar.m6.Yj));
            }
            if (this.f53584r > 0) {
                arrayList3.add(t6.b(2, this.f53584r, org.telegram.messenger.hd.N0(2131748575, null), org.telegram.ui.ActionBar.m6.Zj));
            }
            if (this.f53587x > 0) {
                j3 = 0;
                arrayList3.add(t6.b(3, this.f53587x, org.telegram.messenger.hd.N0(2131748572, null), org.telegram.ui.ActionBar.m6.gk));
            } else {
                j3 = 0;
            }
            if (this.f53585s > j3) {
                arrayList3.add(t6.b(4, this.f53585s, org.telegram.messenger.hd.N0(2131748582, null), org.telegram.ui.ActionBar.m6.dk));
            }
            if (this.f53586w > j3) {
                arrayList3.add(t6.b(5, this.f53586w, org.telegram.messenger.hd.N0(2131748567, null), org.telegram.ui.ActionBar.m6.ak));
            }
            if (this.G > j3) {
                arrayList3.add(t6.b(6, this.G, org.telegram.messenger.hd.N0(2131748568, null), org.telegram.ui.ActionBar.m6.ek));
            }
            if (this.f53579f > j3) {
                arrayList3.add(t6.b(7, this.f53579f, org.telegram.messenger.hd.N0(2131748569, null), org.telegram.ui.ActionBar.m6.hk));
            }
            if (this.f53583n > j3) {
                arrayList3.add(t6.b(8, this.f53583n, org.telegram.messenger.hd.N0(2131748573, null), org.telegram.ui.ActionBar.m6.gk));
            }
            if (this.F > j3) {
                arrayList3.add(t6.b(9, this.F, org.telegram.messenger.hd.N0(2131748574, null), org.telegram.ui.ActionBar.m6.bk));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.messenger.el(27));
                ((t6) arrayList3.get(arrayList3.size() - 1)).f52187j = true;
                if (this.W == null) {
                    this.W = new float[11];
                }
                int i7 = 0;
                while (true) {
                    fArr = this.W;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    fArr[i7] = (float) w0(i7);
                    i7++;
                }
                if (this.V == null) {
                    this.V = new int[11];
                }
                org.telegram.messenger.g0.e3(fArr, this.V);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((t6) arrayList3.get(i11)).f52186i = true;
                        j10 += ((t6) arrayList3.get(i11)).f52185g;
                        i10 += this.V[((t6) arrayList3.get(i11)).f52184f];
                    }
                    this.V[10] = i10;
                    arrayList2.add(t6.b(-1, j10, org.telegram.messenger.hd.N0(2131748571, null), org.telegram.ui.ActionBar.m6.bk));
                    if (!this.M) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z13 = true;
            } else {
                z13 = false;
            }
        }
        if (z13) {
            arrayList2.size();
            arrayList2.add(new t6(13, (String) null));
            String N0 = org.telegram.messenger.hd.N0(2131744573, null);
            t6 t6Var = new t6(1);
            t6Var.f52183e = N0;
            arrayList2.add(t6Var);
        }
        arrayList2.add(new t6(3, org.telegram.messenger.hd.N0(2131753864, null)));
        arrayList2.add(new t6(0, 0));
        arrayList2.add(new t6(1, 0));
        arrayList2.add(new t6(2, 0));
        arrayList2.add(new t6(3, 0));
        String N02 = org.telegram.messenger.hd.N0(2131748865, null);
        t6 t6Var2 = new t6(1);
        t6Var2.f52183e = N02;
        arrayList2.add(t6Var2);
        if (this.I > j3) {
            arrayList2.add(new t6(3, org.telegram.messenger.hd.N0(2131748477, null)));
            arrayList2.add(new t6(14));
            String N03 = org.telegram.messenger.hd.N0(2131748476, null);
            t6 t6Var3 = new t6(1);
            t6Var3.f52183e = N03;
            arrayList2.add(t6Var3);
        }
        this.S = -1;
        if (z13 && (cVar = this.f53578e0) != null && !cVar.h()) {
            this.S = arrayList2.size();
            arrayList2.add(new t6(8, (String) null));
        }
        v6 v6Var = this.f53570a;
        if (v6Var != null) {
            if (z12) {
                v6Var.E(arrayList, arrayList2);
            } else {
                v6Var.f();
            }
        }
        i6 i6Var = this.N;
        if (i6Var != null) {
            i6Var.d();
        }
        org.telegram.ui.Components.tt0 tt0Var2 = this.f53575c0;
        if (tt0Var2 != null) {
            if (z11 && this.S != -1) {
                tt0Var2.a();
            }
            org.telegram.ui.Components.tt0 tt0Var3 = this.f53575c0;
            tt0Var3.B();
            tt0Var3.requestLayout();
            tt0Var3.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131744575, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 29));
        this.simpleActionBar.q().c(1, 0, org.telegram.messenger.hd.N0(2131752637, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false));
        org.telegram.ui.ActionBar.y0 e10 = this.simpleActionBar.t().b(2, 2131231244).e(3, 2131232110, org.telegram.messenger.hd.N0(2131752064, null));
        this.f53576d0 = e10;
        int i7 = org.telegram.ui.ActionBar.m6.f29568p7;
        e10.setIconColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f53576d0.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29588q7, false));
        this.f53576d0.h(0.12f, i7);
        boolean z10 = org.telegram.messenger.s2.f26694a;
        if (this.f53576d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131752064, null));
            this.f53576d0.setText(spannableStringBuilder);
        }
        this.f53570a = new v6(0, context, this);
        org.telegram.ui.Components.tt0 tt0Var = new org.telegram.ui.Components.tt0(context);
        this.f53575c0 = tt0Var;
        tt0Var.setDebugLoggingEnabled(true);
        this.f53575c0.setCommonInsetsManagedExternally(true);
        this.f53575c0.setGeometry(new g6(this));
        org.telegram.ui.Components.tt0 tt0Var2 = this.f53575c0;
        this.fragmentView = tt0Var2;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, tt0Var2, null);
        di.b1 b1Var = new di.b1(7, context, this);
        this.f53572b = b1Var;
        b1Var.r1();
        this.f53572b.setClipToPadding(false);
        this.f53572b.setVerticalScrollBarEnabled(false);
        di.b1 b1Var2 = this.f53572b;
        org.telegram.ui.Components.tt0 tt0Var3 = this.f53575c0;
        tt0Var3.getClass();
        b1Var2.setLayoutManager(new jg.i0(5, tt0Var3, false));
        this.f53575c0.u(this.f53572b, new y5(this, 3));
        this.f53572b.setAdapter(this.f53570a);
        h6 h6Var = new h6(this);
        h6Var.n(350L);
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        h6Var.o(nrVar);
        h6Var.C = false;
        h6Var.f59139m = false;
        this.f53572b.setItemAnimator(h6Var);
        this.f53572b.setOnItemClickListener(new y5(this, 4));
        this.f53572b.j(new g3(this, 3));
        View view = new View(context);
        this.P = view;
        tt0Var2.addView(view, c8.na.e(-1, 0, 48));
        this.T = new te.a(0, new y5(this, 5), nrVar, 380L, false);
        this.U = new te.a(1, new y5(this, 0), nrVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(tt0Var2, this.f53572b, this.simpleActionBar, this.resourceProvider);
        i6 i6Var = new i6(this, context, this, this.glassEngine, this.f53575c0);
        this.N = i6Var;
        i6Var.E = true;
        FrameLayout frameLayout = i6Var.f51921c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        fh.g c10 = getBaseSimpleGlass().f56626c.c(this.O, null, false);
        c10.p(c8.j0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.tt0 tt0Var4 = this.f53575c0;
        i6 i6Var2 = this.N;
        org.telegram.ui.Components.j71 viewPager = i6Var2.getViewPager();
        i6 i6Var3 = this.N;
        Objects.requireNonNull(i6Var3);
        tt0Var4.x(i6Var2, viewPager, new w0(i6Var3, 8));
        this.f53575c0.y(this.O);
        this.O.setLayoutParams(c8.na.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new g6(this));
        this.N.setCacheModel(this.f53578e0);
        z5 z5Var = new z5(0, tt0Var2);
        getBaseSimpleGlass().f56636o = new di.f(3, this, z5Var);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        v0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.O4) {
            try {
                org.telegram.ui.ActionBar.t1 t1Var = this.f53574c;
                if (t1Var != null) {
                    t1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f53574c = null;
            if (this.f53570a != null) {
                this.f53577e = org.telegram.messenger.ur.a0(this.currentAccount).S();
                if (this.f53576d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131752064, null));
                    this.f53576d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        f6 f6Var = new f6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f53572b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.hu0.class, org.telegram.ui.Components.tw0.class, org.telegram.ui.Cells.o4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29347d6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f53572b, 0, new Class[]{org.telegram.ui.Components.tw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Kj));
        int i7 = org.telegram.ui.ActionBar.m6.f29739y6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f53572b, 0, new Class[]{org.telegram.ui.Components.tw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.m6.f29420h5));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ck));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.dk));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.ek));
        arrayList.add(new org.telegram.ui.ActionBar.v6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.fk));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f53582h0) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29290a7, false)) <= 0.721f) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.tt0 tt0Var;
        if (this.N == null || motionEvent == null || (tt0Var = this.f53575c0) == null || !tt0Var.c() || this.f53575c0.j(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().f36391b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(r6 r6Var, org.telegram.ui.Components.qw0[] qw0VarArr, ei.c cVar) {
        s6 s6Var;
        HashSet hashSet;
        long j3;
        char c10;
        int i7;
        long j10;
        org.telegram.ui.Components.qw0 qw0Var;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        t1Var.f29999j0 = false;
        t1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((qw0VarArr != null && ((qw0Var = qw0VarArr[i10]) == null || !qw0Var.f38962c)) || (s6Var = (s6) r6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(s6Var.f51916b);
                hashSet = hashSet2;
                long j12 = r6Var.f51497c;
                long j13 = s6Var.f51915a;
                r6Var.f51497c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                r6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f53588y -= s6Var.f51915a;
                } else if (i10 == 1) {
                    this.E -= s6Var.f51915a;
                } else if (i10 == 2) {
                    this.f53584r -= s6Var.f51915a;
                } else if (i10 == 3) {
                    this.f53587x -= s6Var.f51915a;
                } else if (i10 == 4) {
                    this.f53585s -= s6Var.f51915a;
                } else if (i10 == 5) {
                    this.G -= s6Var.f51915a;
                } else {
                    char c11 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < s6Var.f51916b.size()) {
                            ei.b bVar = (ei.b) s6Var.f51916b.get(i11);
                            String absolutePath = ((ei.b) s6Var.f51916b.get(i11)).f10958a.getAbsolutePath();
                            if (u0(6, absolutePath)) {
                                c10 = c11;
                            } else if (u0(0, absolutePath) || u0(100, absolutePath)) {
                                c10 = 0;
                            } else if (u0(2, absolutePath) || u0(101, absolutePath)) {
                                c10 = 1;
                            } else {
                                c10 = 6;
                            }
                            if (c10 == c11) {
                                i7 = i11;
                                j10 = j11;
                                this.f53586w -= bVar.f10960c;
                            } else {
                                i7 = i11;
                                j10 = j11;
                                if (c10 == 0) {
                                    this.f53588y -= bVar.f10960c;
                                } else if (c10 == 1) {
                                    this.E -= bVar.f10960c;
                                } else {
                                    this.f53579f -= bVar.f10960c;
                                }
                            }
                            i11 = i7 + 1;
                            j11 = j10;
                            c11 = 7;
                        }
                    } else {
                        j3 = j11;
                        this.f53579f -= s6Var.f51915a;
                        i10++;
                        hashSet2 = hashSet;
                        j11 = j3;
                    }
                }
            }
            j3 = j11;
            i10++;
            hashSet2 = hashSet;
            j11 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (r6Var.d.size() == 0) {
            this.f53578e0.f10965b.remove(r6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.f10971j.iterator();
            while (it.hasNext()) {
                ei.b bVar2 = (ei.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.f10960c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    r6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f53588y -= bVar2.f10960c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f10960c;
                    } else if (i12 == 2) {
                        this.f53584r -= bVar2.f10960c;
                    } else if (i12 == 3) {
                        this.f53587x -= bVar2.f10960c;
                    } else if (i12 == 4) {
                        this.f53585s -= bVar2.f10960c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ei.b bVar3 = (ei.b) it2.next();
            ei.c cVar2 = this.f53578e0;
            if (cVar2.f10971j.remove(bVar3)) {
                cVar2.f10972k -= bVar3.f10960c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(this).Q(2131624052, 36, org.telegram.messenger.hd.a0(null, null, 2131752633, org.telegram.messenger.g0.i0(j14 - this.H, false, false)));
        Q.f35497r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.f8 f8Var = getFileLoader().d;
        f8Var.getClass();
        f8Var.h(new org.telegram.messenger.z4(12, f8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.K.c(new o1(this, arrayList, t1Var, 3));
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ei.c cVar = this.f53578e0;
        if (cVar != null && !cVar.f10971j.isEmpty()) {
            if (z10) {
                this.f53578e0.d();
                i6 i6Var = this.N;
                if (i6Var != null) {
                    i6Var.f(false);
                    this.N.e();
                }
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f53566i0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.ls.O4);
        this.f53577e = org.telegram.messenger.ur.a0(this.currentAccount).S();
        Utilities.f22774e.c(new b6(this, 2));
        this.f53573b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ls.O4);
        try {
            org.telegram.ui.ActionBar.t1 t1Var = this.f53574c;
            if (t1Var != null) {
                t1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f53574c = null;
        f53566i0 = true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        v0(i10, i12);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.c9 c9Var;
        if (i7 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (c9Var = FilesMigrationService.f22609e) != null) {
                c9Var.J0();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f53570a.f();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.y0 y0Var = this.f53576d0;
            if (y0Var != null) {
                y0Var.setIconColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29568p7, false));
            }
            au auVar = this.f53571a0;
            if (auVar != null) {
                auVar.v0(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29420h5, false));
            }
            try {
                org.telegram.ui.ActionBar.y0 y0Var2 = this.f53576d0;
                if (y0Var2 != null) {
                    y0Var2.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29588q7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.f53582h0) {
            this.f53582h0 = true;
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25360u4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void q0(File file, int i7, LongSparseArray longSparseArray, ei.c cVar) {
        File[] listFiles;
        int i10;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f53566i0) {
                    break;
                }
                if (file2.isDirectory()) {
                    q0(file2, i7, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.e8 e10 = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i10 = i7;
                    } else {
                        i10 = 3;
                    }
                    ei.b bVar = new ei.b(file2);
                    long length = file2.length();
                    bVar.f10960c = length;
                    if (e10 != null) {
                        bVar.f10959b = e10.f23651a;
                        bVar.f10963g = e10.f23652b;
                        int i11 = e10.f23653c;
                        bVar.h = i11;
                        if (i11 == 23 && length > 0) {
                            i10 = 7;
                        }
                    }
                    bVar.d = i10;
                    long j3 = bVar.f10959b;
                    if (j3 != 0) {
                        r6 r6Var = (r6) longSparseArray.get(j3, null);
                        if (r6Var == null) {
                            r6Var = new r6(bVar.f10959b);
                            longSparseArray.put(bVar.f10959b, r6Var);
                        }
                        r6Var.a(bVar, i10);
                    }
                    if (i10 != 6) {
                        cVar.e(i10).add(bVar);
                    }
                }
            }
        }
    }

    public final boolean t0() {
        int i7;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53581g0;
            if (i10 >= arrayList.size()) {
                break;
            }
            t6 t6Var = (t6) arrayList.get(i10);
            if (t6Var.f56599a == 11 && !t6Var.f52186i && (i7 = t6Var.f52184f) >= 0) {
                zArr2[i7] = true;
            }
            i10++;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (!zArr2[i11] && !zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(int i7, int i10) {
        this.Q = i7;
        this.R = i10;
        di.b1 b1Var = this.f53572b;
        if (b1Var != null) {
            int D = org.telegram.messenger.o10.D(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
            int D2 = org.telegram.messenger.o10.D(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.z3(b1Var, 0, D, 0, D2);
            b1Var.setPadding(0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + i7) - D, 0, i10 - D2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.f53575c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f53572b.getLayoutParams();
                this.f53575c0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.tt0 tt0Var = this.f53575c0;
                tt0Var.B();
                tt0Var.requestLayout();
                tt0Var.invalidate();
            }
        }
    }

    public final long w0(int i7) {
        switch (i7) {
            case 0:
                return this.f53588y;
            case 1:
                return this.E;
            case 2:
                return this.f53584r;
            case 3:
                return this.f53587x;
            case 4:
                return this.f53585s;
            case 5:
                return this.f53586w;
            case 6:
                return this.G;
            case 7:
                return this.f53579f;
            case 8:
                return this.f53583n;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void x0(View view) {
        int i7;
        int i10;
        int i11;
        boolean t02 = t0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f53581g0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                t6 t6Var = (t6) arrayList.get(i12);
                if (t6Var.f56599a != 11 || t6Var.f52186i || (i11 = t6Var.f52184f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.q2.APP_ERROR.a();
            if (view != null) {
                org.telegram.messenger.g0.E3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                t6 t6Var2 = (t6) arrayList.get(i13);
                if (t6Var2.f56599a == 11 && !t6Var2.f52186i && (i10 = t6Var2.f52184f) >= 0) {
                    zArr2[i10] = true;
                }
            }
            for (int i14 = 0; i14 < length; i14++) {
                if (!zArr2[i14]) {
                    zArr[i14] = !t02;
                }
            }
        } else {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                t6 t6Var3 = (t6) arrayList.get(i15);
                if (t6Var3.f56599a == 11 && t6Var3.f52186i && (i7 = t6Var3.f52184f) >= 0) {
                    zArr[i7] = !t02;
                }
            }
        }
        for (int i16 = 0; i16 < this.f53572b.getChildCount(); i16++) {
            View childAt = this.f53572b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.d2) {
                this.f53572b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    t6 t6Var4 = (t6) arrayList.get(R);
                    if (t6Var4.f56599a == 11) {
                        int i17 = t6Var4.f52184f;
                        if (i17 < 0) {
                            ((org.telegram.ui.Cells.d2) childAt).c(!t02, true);
                        } else {
                            ((org.telegram.ui.Cells.d2) childAt).c(zArr[i17], true);
                        }
                    }
                }
            }
        }
        y0();
    }

    public final void y0() {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        u6 u6Var = this.X;
        long j18 = 0;
        boolean z10 = false;
        if (u6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.qc[] qcVarArr = new org.telegram.ui.Components.qc[11];
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f53581g0;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    t6 t6Var = (t6) arrayList.get(i7);
                    if (t6Var.f56599a == 11) {
                        int i10 = t6Var.f52184f;
                        boolean[] zArr = this.d;
                        if (i10 < 0) {
                            if (this.M) {
                                long j19 = t6Var.f52185g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f38823c = j19;
                                obj.f38822b = z12;
                                qcVarArr[10] = obj;
                            }
                        } else {
                            long j20 = t6Var.f52185g;
                            boolean z13 = zArr[i10];
                            ?? obj2 = new Object();
                            obj2.f38823c = j20;
                            obj2.f38822b = z13;
                            qcVarArr[i10] = obj2;
                        }
                    }
                    i7++;
                }
                if (System.currentTimeMillis() - this.f53573b0 < 80) {
                    this.X.f39108n.e(true, 0.0f);
                }
                this.X.f(this.H, true, qcVarArr);
            } else if (z11) {
                u6Var.f(-1L, true, new org.telegram.ui.Components.qc[0]);
            } else {
                u6Var.f(0L, true, new org.telegram.ui.Components.qc[0]);
            }
        }
        p6 p6Var = this.Z;
        if (p6Var != null && !this.L) {
            x6 x6Var = p6Var.d;
            boolean[] zArr2 = x6Var.d;
            if (zArr2[0]) {
                j3 = x6Var.f53588y;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = x6Var.E;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = x6Var.f53584r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = x6Var.f53587x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = x6Var.f53585s;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = x6Var.f53586w;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = x6Var.G;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = x6Var.f53579f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = x6Var.f53583n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = x6Var.F;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = x6Var.f53581g0;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    t6 t6Var2 = (t6) arrayList2.get(i11);
                    if (t6Var2.f56599a == 11) {
                        int i12 = t6Var2.f52184f;
                        if (i12 < 0) {
                            i12 = zArr2.length - 1;
                        }
                        if (!zArr2[i12]) {
                            break;
                        }
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            p6Var.a(j29, z10);
        }
    }

    public final void z0() {
        float f10;
        View view = this.P;
        if (view == null) {
            return;
        }
        te.a aVar = this.T;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f57665e;
        }
        te.a aVar2 = this.U;
        if (aVar2 != null) {
            f11 = aVar2.f57665e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }
}
