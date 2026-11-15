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
public final class y6 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
    public static volatile boolean f53430i0 = false;
    public static long f53431j0;
    public static Long f53432k0;
    public static Long f53433l0;
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
    public j6 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public te.a T;
    public te.a U;
    public int[] V;
    public float[] W;
    public v6 X;
    public l6 Y;
    public q6 Z;
    public w6 f53434a;
    public yt f53435a0;
    public di.c1 f53436b;
    public long f53437b0;
    public org.telegram.ui.ActionBar.t1 f53438c;
    public org.telegram.ui.Components.it0 f53439c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.z0 f53440d0;
    public long f53441e;
    public ei.c f53442e0;
    public long f53443f;
    public final ArrayList f53444f0;
    public final ArrayList f53445g0;
    public long h;
    public boolean f53446h0;
    public long f53447n;
    public long f53448r;
    public long f53449s;
    public long f53450w;
    public long f53451x;
    public long f53452y;

    public y6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f53441e = -1L;
        this.f53443f = -1L;
        this.h = -1L;
        this.f53447n = -1L;
        this.f53448r = -1L;
        this.f53449s = -1L;
        this.f53450w = -1L;
        this.f53451x = -1L;
        this.f53452y = -1L;
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
        this.f53444f0 = new ArrayList();
        this.f53445g0 = new ArrayList();
    }

    public static void Z(y6 y6Var, boolean z10, long j3, o6 o6Var) {
        if (z10) {
            org.telegram.messenger.fc.D().j();
        }
        try {
            org.telegram.ui.ActionBar.t1 t1Var = y6Var.f53438c;
            if (t1Var != null) {
                t1Var.dismiss();
                y6Var.f53438c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        y6Var.getMediaDataController().A0.b();
        org.telegram.messenger.g0.i3(new di.x2(y6Var, j3, 20), 150L);
        org.telegram.messenger.si.b0(y6Var.currentAccount).u(true);
        org.telegram.messenger.f8 f8Var = y6Var.getFileLoader().d;
        f8Var.d();
        f8Var.f23450a.c(new c6(y6Var, 1));
        o6Var.run();
    }

    public static void a0(y6 y6Var, float f10) {
        y6Var.simpleActionBar.setTitlesAlpha(f10);
        y6Var.z0();
        y6Var.fragmentView.invalidate();
    }

    public static void b0(org.telegram.ui.y6 r23, org.telegram.ui.n6 r24, org.telegram.ui.o6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y6.b0(org.telegram.ui.y6, org.telegram.ui.n6, org.telegram.ui.o6):void");
    }

    public static void c0(y6 y6Var, org.telegram.ui.ActionBar.t1 t1Var) {
        org.telegram.messenger.w7.G(y6Var.currentAccount).i();
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, y6Var.getParentActivity(), null);
        y6Var.f53438c = t1Var;
        t1Var.f29637j0 = false;
        t1Var.r(500L);
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(y6Var.currentAccount);
        s12.O1.b();
        s12.K1.b();
        s12.L1.b();
        s12.M1.b();
        s12.N1.b();
        if (z10) {
            org.telegram.messenger.vr messagesStorage = y6Var.getMessagesStorage();
            messagesStorage.f27220a.c(new org.telegram.messenger.oq(messagesStorage, 12));
            return;
        }
        org.telegram.messenger.vr messagesStorage2 = y6Var.getMessagesStorage();
        messagesStorage2.f27220a.c(new org.telegram.messenger.oq(messagesStorage2, 15));
    }

    public static org.telegram.ui.ActionBar.w4 e0(y6 y6Var) {
        return y6Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.w4 f0(y6 y6Var) {
        return y6Var.simpleActionBar;
    }

    public static void i0(y6 y6Var) {
        String G;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        boolean z13 = false;
        if (y6Var.f53442e0.f10659j.size() > 0) {
            if (y6Var.N != null) {
                if (!y6Var.f53442e0.f10661l.isEmpty()) {
                    ArrayList arrayList = y6Var.f53442e0.f10653b;
                    int size = arrayList.size();
                    int i7 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        s6 s6Var = (s6) obj;
                        if (y6Var.f53442e0.f10661l.contains(Long.valueOf(s6Var.f51116a))) {
                            i7 += s6Var.f51117b;
                        }
                    }
                    int size2 = y6Var.f53442e0.f10659j.size() - i7;
                    if (size2 > 0) {
                        G = a8.p0.E(org.telegram.messenger.hd.G(y6Var.f53442e0.f10661l.size(), "Chats", Integer.valueOf(y6Var.f53442e0.f10661l.size())), ", ", org.telegram.messenger.hd.G(size2, "Files", Integer.valueOf(size2)));
                    } else {
                        G = org.telegram.messenger.hd.G(y6Var.f53442e0.f10661l.size(), "Chats", Integer.valueOf(y6Var.f53442e0.f10661l.size()));
                    }
                } else {
                    G = org.telegram.messenger.hd.G(y6Var.f53442e0.f10659j.size(), "Files", Integer.valueOf(y6Var.f53442e0.f10659j.size()));
                }
                String i02 = org.telegram.messenger.g0.i0(y6Var.f53442e0.f10660k, false, false);
                org.telegram.ui.ActionBar.w4 w4Var = y6Var.simpleActionBar;
                boolean z14 = org.telegram.messenger.hd.f24101a0;
                w4Var.o();
                org.telegram.ui.Components.h6 h6Var = w4Var.f29815f;
                if (!z14 && w4Var.w() && w4Var.H) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var.c(i02, z10, true);
                org.telegram.ui.ActionBar.w4 w4Var2 = y6Var.simpleActionBar;
                boolean z15 = org.telegram.messenger.hd.f24101a0;
                w4Var2.o();
                if (w4Var2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(w4Var2.getContext(), true, true, true);
                        w4Var2.h = h6Var2;
                        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        w4Var2.h.setTextColor(w4Var2.f29816f0);
                        w4Var2.h.setGravity(19);
                        w4Var2.h.setEllipsizeByGradient(true);
                        w4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.er.h);
                        w4Var2.addView(w4Var2.h, w4Var2.indexOfChild(w4Var2.f29808b), c8.ja.e(-1, 18, 51));
                        w4Var2.j();
                    }
                    y6Var.N.f(true);
                    return;
                }
                org.telegram.ui.Components.h6 h6Var3 = w4Var2.h;
                if (h6Var3 != null && h6Var3.getTag() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.h6 h6Var4 = w4Var2.h;
                if (!z15 && w4Var2.w() && w4Var2.H) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h6Var4.c(G, z12, true);
                org.telegram.ui.Components.h6 h6Var5 = w4Var2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                h6Var5.setTag(num);
                org.telegram.ui.Components.h6 h6Var6 = w4Var2.h;
                if (h6Var6 != null && h6Var6.getTag() != null) {
                    z13 = true;
                }
                if (z11 != z13) {
                    w4Var2.requestLayout();
                }
                y6Var.N.f(true);
                return;
            }
            return;
        }
        y6Var.N.f(false);
    }

    public static String j0(y6 y6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void k0(y6 y6Var) {
        if (y6Var.f53442e0.f10659j.size() != 0 && y6Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131752098, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131752095, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new z5(y6Var, 2));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            y6Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
            }
        }
    }

    public static void l0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131748771, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748773, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.k5.p("LocalDatabaseClearText2", null, 2131748772, new Object[]{org.telegram.messenger.g0.i0(y6Var.f53441e, false, false)}, spannableStringBuilder);
        t1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752649, null), new ab.z(3, y6Var, z10));
        y6Var.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
        }
    }

    public static void m0(org.telegram.messenger.z10 z10Var) {
        Long l10 = f53432k0;
        if (l10 != null) {
            z10Var.a(l10);
            if (System.currentTimeMillis() - f53431j0 < 5000) {
                return;
            }
        }
        Utilities.f22417f.c(new fq0(z10Var, 15));
    }

    public static void n0(String str, int i7, int[] iArr, org.telegram.messenger.z10 z10Var) {
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
                            n0(a8.p0.E(str, "/", name), i7, iArr, z10Var);
                        }
                    } else {
                        file2.delete();
                        int i10 = iArr[0] + 1;
                        iArr[0] = i10;
                        if (z10Var != null) {
                            z10Var.a(Float.valueOf(i10 / p02));
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
        Long l11 = f53433l0;
        if (l11 != null && (l10 = m0) != null) {
            a5Var.a(l11, l10);
        } else {
            Utilities.f22417f.c(new fq0(a5Var, 14));
        }
    }

    public static long s0(File file, int i7) {
        if (file != null && !f53430i0) {
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
        org.telegram.ui.Components.it0 it0Var = this.f53439c0;
        if (it0Var != null && it0Var.f35726f0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && System.currentTimeMillis() - this.f53437b0 < 80) {
            z12 = false;
        } else {
            z12 = z10;
        }
        ArrayList arrayList = this.f53444f0;
        arrayList.clear();
        ArrayList arrayList2 = this.f53445g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new u6(9, (String) null));
        arrayList2.add(new u6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            z13 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f53452y > 0) {
                arrayList3.add(u6.b(0, this.f53452y, org.telegram.messenger.hd.M0(2131748763, null), org.telegram.ui.ActionBar.j6.ck));
            }
            if (this.E > 0) {
                arrayList3.add(u6.b(1, this.E, org.telegram.messenger.hd.M0(2131748759, null), org.telegram.ui.ActionBar.j6.Yj));
            }
            if (this.f53448r > 0) {
                arrayList3.add(u6.b(2, this.f53448r, org.telegram.messenger.hd.M0(2131748768, null), org.telegram.ui.ActionBar.j6.Zj));
            }
            if (this.f53451x > 0) {
                j3 = 0;
                arrayList3.add(u6.b(3, this.f53451x, org.telegram.messenger.hd.M0(2131748765, null), org.telegram.ui.ActionBar.j6.gk));
            } else {
                j3 = 0;
            }
            if (this.f53449s > j3) {
                arrayList3.add(u6.b(4, this.f53449s, org.telegram.messenger.hd.M0(2131748775, null), org.telegram.ui.ActionBar.j6.dk));
            }
            if (this.f53450w > j3) {
                arrayList3.add(u6.b(5, this.f53450w, org.telegram.messenger.hd.M0(2131748760, null), org.telegram.ui.ActionBar.j6.ak));
            }
            if (this.G > j3) {
                arrayList3.add(u6.b(6, this.G, org.telegram.messenger.hd.M0(2131748761, null), org.telegram.ui.ActionBar.j6.ek));
            }
            if (this.f53443f > j3) {
                arrayList3.add(u6.b(7, this.f53443f, org.telegram.messenger.hd.M0(2131748762, null), org.telegram.ui.ActionBar.j6.hk));
            }
            if (this.f53447n > j3) {
                arrayList3.add(u6.b(8, this.f53447n, org.telegram.messenger.hd.M0(2131748766, null), org.telegram.ui.ActionBar.j6.gk));
            }
            if (this.F > j3) {
                arrayList3.add(u6.b(9, this.F, org.telegram.messenger.hd.M0(2131748767, null), org.telegram.ui.ActionBar.j6.bk));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.messenger.gl(27));
                ((u6) arrayList3.get(arrayList3.size() - 1)).f51777j = true;
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
                org.telegram.messenger.g0.f3(fArr, this.V);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((u6) arrayList3.get(i11)).f51776i = true;
                        j10 += ((u6) arrayList3.get(i11)).f51775g;
                        i10 += this.V[((u6) arrayList3.get(i11)).f51774f];
                    }
                    this.V[10] = i10;
                    arrayList2.add(u6.b(-1, j10, org.telegram.messenger.hd.M0(2131748764, null), org.telegram.ui.ActionBar.j6.bk));
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
            arrayList2.add(new u6(13, (String) null));
            String M0 = org.telegram.messenger.hd.M0(2131744814, null);
            u6 u6Var = new u6(1);
            u6Var.f51773e = M0;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, org.telegram.messenger.hd.M0(2131753867, null)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String M02 = org.telegram.messenger.hd.M0(2131749058, null);
        u6 u6Var2 = new u6(1);
        u6Var2.f51773e = M02;
        arrayList2.add(u6Var2);
        if (this.I > j3) {
            arrayList2.add(new u6(3, org.telegram.messenger.hd.M0(2131748670, null)));
            arrayList2.add(new u6(14));
            String M03 = org.telegram.messenger.hd.M0(2131748669, null);
            u6 u6Var3 = new u6(1);
            u6Var3.f51773e = M03;
            arrayList2.add(u6Var3);
        }
        this.S = -1;
        if (z13 && (cVar = this.f53442e0) != null && !cVar.h()) {
            this.S = arrayList2.size();
            arrayList2.add(new u6(8, (String) null));
        }
        w6 w6Var = this.f53434a;
        if (w6Var != null) {
            if (z12) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.f();
            }
        }
        j6 j6Var = this.N;
        if (j6Var != null) {
            j6Var.d();
        }
        org.telegram.ui.Components.it0 it0Var2 = this.f53439c0;
        if (it0Var2 != null) {
            if (z11 && this.S != -1) {
                it0Var2.a();
            }
            org.telegram.ui.Components.it0 it0Var3 = this.f53439c0;
            it0Var3.B();
            it0Var3.requestLayout();
            it0Var3.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Mj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131744816, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 27));
        this.simpleActionBar.o().c(1, 0, org.telegram.messenger.hd.M0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Fi, false));
        org.telegram.ui.ActionBar.z0 e10 = this.simpleActionBar.r().b(2, 2131231244).e(3, 2131232109, org.telegram.messenger.hd.M0(2131752076, null));
        this.f53440d0 = e10;
        int i7 = org.telegram.ui.ActionBar.j6.f29070p7;
        e10.setIconColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f53440d0.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false));
        this.f53440d0.h(0.12f, i7);
        boolean z10 = org.telegram.messenger.r2.f26198a;
        if (this.f53440d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752076, null));
            this.f53440d0.setText(spannableStringBuilder);
        }
        this.f53434a = new w6(0, context, this);
        org.telegram.ui.Components.it0 it0Var = new org.telegram.ui.Components.it0(context);
        this.f53439c0 = it0Var;
        it0Var.setDebugLoggingEnabled(true);
        this.f53439c0.setCommonInsetsManagedExternally(true);
        this.f53439c0.setGeometry(new h6(this));
        org.telegram.ui.Components.it0 it0Var2 = this.f53439c0;
        this.fragmentView = it0Var2;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, it0Var2, null);
        di.c1 c1Var = new di.c1(7, context, this);
        this.f53436b = c1Var;
        c1Var.r1();
        this.f53436b.setClipToPadding(false);
        this.f53436b.setVerticalScrollBarEnabled(false);
        di.c1 c1Var2 = this.f53436b;
        org.telegram.ui.Components.it0 it0Var3 = this.f53439c0;
        it0Var3.getClass();
        c1Var2.setLayoutManager(new jg.i0(5, it0Var3, false));
        this.f53439c0.u(this.f53436b, new z5(this, 3));
        this.f53436b.setAdapter(this.f53434a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        i6Var.o(erVar);
        i6Var.C = false;
        i6Var.f58564m = false;
        this.f53436b.setItemAnimator(i6Var);
        this.f53436b.setOnItemClickListener(new z5(this, 4));
        this.f53436b.j(new g3(this, 3));
        View view = new View(context);
        this.P = view;
        it0Var2.addView(view, c8.ja.e(-1, 0, 48));
        this.T = new te.a(0, new z5(this, 5), erVar, 380L, false);
        this.U = new te.a(1, new z5(this, 0), erVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(it0Var2, this.f53436b, this.simpleActionBar, this.resourceProvider);
        j6 j6Var = new j6(this, context, this, this.glassEngine, this.f53439c0);
        this.N = j6Var;
        j6Var.E = true;
        FrameLayout frameLayout = j6Var.f51398c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        fh.g c10 = getBaseSimpleGlass().f56042c.c(this.O, null, false);
        c10.p(c8.g0.l(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.it0 it0Var4 = this.f53439c0;
        j6 j6Var2 = this.N;
        org.telegram.ui.Components.w61 viewPager = j6Var2.getViewPager();
        j6 j6Var3 = this.N;
        Objects.requireNonNull(j6Var3);
        it0Var4.x(j6Var2, viewPager, new w0(j6Var3, 8));
        this.f53439c0.y(this.O);
        this.O.setLayoutParams(c8.ja.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new h6(this));
        this.N.setCacheModel(this.f53442e0);
        a6 a6Var = new a6(0, it0Var2);
        getBaseSimpleGlass().f56052o = new di.f(3, this, a6Var);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        v0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.L4) {
            try {
                org.telegram.ui.ActionBar.t1 t1Var = this.f53438c;
                if (t1Var != null) {
                    t1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f53438c = null;
            if (this.f53434a != null) {
                this.f53441e = org.telegram.messenger.vr.a0(this.currentAccount).S();
                if (this.f53440d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752076, null));
                    this.f53440d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53436b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Components.wt0.class, org.telegram.ui.Components.kw0.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28849d6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53436b, 0, new Class[]{org.telegram.ui.Components.kw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Kj));
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53436b, 0, new Class[]{org.telegram.ui.Components.kw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.j6.f28922h5));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ck));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.dk));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ek));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.fk));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f53446h0) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28792a7, false)) <= 0.721f) {
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
        org.telegram.ui.Components.it0 it0Var;
        if (this.N == null || motionEvent == null || (it0Var = this.f53439c0) == null || !it0Var.c() || this.f53439c0.j(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().f41295b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(s6 s6Var, org.telegram.ui.Components.hw0[] hw0VarArr, ei.c cVar) {
        t6 t6Var;
        HashSet hashSet;
        long j3;
        char c10;
        int i7;
        long j10;
        org.telegram.ui.Components.hw0 hw0Var;
        org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
        t1Var.f29637j0 = false;
        t1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((hw0VarArr != null && ((hw0Var = hw0VarArr[i10]) == null || !hw0Var.f35366c)) || (t6Var = (t6) s6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(t6Var.f51389b);
                hashSet = hashSet2;
                long j12 = s6Var.f51118c;
                long j13 = t6Var.f51388a;
                s6Var.f51118c = j12 - j13;
                this.H -= j13;
                this.J += j13;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f53452y -= t6Var.f51388a;
                } else if (i10 == 1) {
                    this.E -= t6Var.f51388a;
                } else if (i10 == 2) {
                    this.f53448r -= t6Var.f51388a;
                } else if (i10 == 3) {
                    this.f53451x -= t6Var.f51388a;
                } else if (i10 == 4) {
                    this.f53449s -= t6Var.f51388a;
                } else if (i10 == 5) {
                    this.G -= t6Var.f51388a;
                } else {
                    char c11 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < t6Var.f51389b.size()) {
                            ei.b bVar = (ei.b) t6Var.f51389b.get(i11);
                            String absolutePath = ((ei.b) t6Var.f51389b.get(i11)).f10646a.getAbsolutePath();
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
                                this.f53450w -= bVar.f10648c;
                            } else {
                                i7 = i11;
                                j10 = j11;
                                if (c10 == 0) {
                                    this.f53452y -= bVar.f10648c;
                                } else if (c10 == 1) {
                                    this.E -= bVar.f10648c;
                                } else {
                                    this.f53443f -= bVar.f10648c;
                                }
                            }
                            i11 = i7 + 1;
                            j11 = j10;
                            c11 = 7;
                        }
                    } else {
                        j3 = j11;
                        this.f53443f -= t6Var.f51388a;
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
        if (s6Var.d.size() == 0) {
            this.f53442e0.f10653b.remove(s6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.f10659j.iterator();
            while (it.hasNext()) {
                ei.b bVar2 = (ei.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.H;
                    long j16 = bVar2.f10648c;
                    this.H = j15 - j16;
                    this.J += j16;
                    hashSet4.add(bVar2);
                    s6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f53452y -= bVar2.f10648c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f10648c;
                    } else if (i12 == 2) {
                        this.f53448r -= bVar2.f10648c;
                    } else if (i12 == 3) {
                        this.f53451x -= bVar2.f10648c;
                    } else if (i12 == 4) {
                        this.f53449s -= bVar2.f10648c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ei.b bVar3 = (ei.b) it2.next();
            ei.c cVar2 = this.f53442e0;
            if (cVar2.f10659j.remove(bVar3)) {
                cVar2.f10660k -= bVar3.f10648c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.xb Q = org.telegram.ui.Components.cc.a0(this).Q(2131624052, 36, org.telegram.messenger.hd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j14 - this.H, false, false)));
        Q.f41651r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.f8 f8Var = getFileLoader().d;
        f8Var.getClass();
        f8Var.h(new org.telegram.messenger.x4(12, f8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.K.c(new o1(this, arrayList, t1Var, 3));
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ei.c cVar = this.f53442e0;
        if (cVar != null && !cVar.f10659j.isEmpty()) {
            if (z10) {
                this.f53442e0.d();
                j6 j6Var = this.N;
                if (j6Var != null) {
                    j6Var.f(false);
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
        f53430i0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.ns.L4);
        this.f53441e = org.telegram.messenger.vr.a0(this.currentAccount).S();
        Utilities.f22416e.c(new c6(this, 2));
        this.f53437b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ns.L4);
        try {
            org.telegram.ui.ActionBar.t1 t1Var = this.f53438c;
            if (t1Var != null) {
                t1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f53438c = null;
        f53430i0 = true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        v0(i10, i12);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i7 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (b9Var = FilesMigrationService.f22251e) != null) {
                b9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f53434a.f();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.z0 z0Var = this.f53440d0;
            if (z0Var != null) {
                z0Var.setIconColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29070p7, false));
            }
            yt ytVar = this.f53435a0;
            if (ytVar != null) {
                ytVar.v0(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
            }
            try {
                org.telegram.ui.ActionBar.z0 z0Var2 = this.f53440d0;
                if (z0Var2 != null) {
                    z0Var2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29090q7, false));
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
        if (f10 > 0.5f && !this.f53446h0) {
            this.f53446h0 = true;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25564r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void q0(File file, int i7, LongSparseArray longSparseArray, ei.c cVar) {
        File[] listFiles;
        int i10;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f53430i0) {
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
                    bVar.f10648c = length;
                    if (e10 != null) {
                        bVar.f10647b = e10.f23272a;
                        bVar.f10651g = e10.f23273b;
                        int i11 = e10.f23274c;
                        bVar.h = i11;
                        if (i11 == 23 && length > 0) {
                            i10 = 7;
                        }
                    }
                    bVar.d = i10;
                    long j3 = bVar.f10647b;
                    if (j3 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j3, null);
                        if (s6Var == null) {
                            s6Var = new s6(bVar.f10647b);
                            longSparseArray.put(bVar.f10647b, s6Var);
                        }
                        s6Var.a(bVar, i10);
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
            ArrayList arrayList = this.f53445g0;
            if (i10 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i10);
            if (u6Var.f56015a == 11 && !u6Var.f51776i && (i7 = u6Var.f51774f) >= 0) {
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
        di.c1 c1Var = this.f53436b;
        if (c1Var != null) {
            int C = org.telegram.messenger.i20.C(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.i20.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.A3(c1Var, 0, C, 0, C2);
            c1Var.setPadding(0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + i7) - C, 0, i10 - C2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.f53439c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f53436b.getLayoutParams();
                this.f53439c0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.it0 it0Var = this.f53439c0;
                it0Var.B();
                it0Var.requestLayout();
                it0Var.invalidate();
            }
        }
    }

    public final long w0(int i7) {
        switch (i7) {
            case 0:
                return this.f53452y;
            case 1:
                return this.E;
            case 2:
                return this.f53448r;
            case 3:
                return this.f53451x;
            case 4:
                return this.f53449s;
            case 5:
                return this.f53450w;
            case 6:
                return this.G;
            case 7:
                return this.f53443f;
            case 8:
                return this.f53447n;
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
        ArrayList arrayList = this.f53445g0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                u6 u6Var = (u6) arrayList.get(i12);
                if (u6Var.f56015a != 11 || u6Var.f51776i || (i11 = u6Var.f51774f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.p2.APP_ERROR.a();
            if (view != null) {
                org.telegram.messenger.g0.F3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var2 = (u6) arrayList.get(i13);
                if (u6Var2.f56015a == 11 && !u6Var2.f51776i && (i10 = u6Var2.f51774f) >= 0) {
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
                u6 u6Var3 = (u6) arrayList.get(i15);
                if (u6Var3.f56015a == 11 && u6Var3.f51776i && (i7 = u6Var3.f51774f) >= 0) {
                    zArr[i7] = !t02;
                }
            }
        }
        for (int i16 = 0; i16 < this.f53436b.getChildCount(); i16++) {
            View childAt = this.f53436b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.f53436b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.f56015a == 11) {
                        int i17 = u6Var4.f51774f;
                        if (i17 < 0) {
                            ((org.telegram.ui.Cells.c2) childAt).c(!t02, true);
                        } else {
                            ((org.telegram.ui.Cells.c2) childAt).c(zArr[i17], true);
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
        v6 v6Var = this.X;
        long j18 = 0;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.hc[] hcVarArr = new org.telegram.ui.Components.hc[11];
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f53445g0;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i7);
                    if (u6Var.f56015a == 11) {
                        int i10 = u6Var.f51774f;
                        boolean[] zArr = this.d;
                        if (i10 < 0) {
                            if (this.M) {
                                long j19 = u6Var.f51775g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f35223c = j19;
                                obj.f35222b = z12;
                                hcVarArr[10] = obj;
                            }
                        } else {
                            long j20 = u6Var.f51775g;
                            boolean z13 = zArr[i10];
                            ?? obj2 = new Object();
                            obj2.f35223c = j20;
                            obj2.f35222b = z13;
                            hcVarArr[i10] = obj2;
                        }
                    }
                    i7++;
                }
                if (System.currentTimeMillis() - this.f53437b0 < 80) {
                    this.X.f35590n.e(true, 0.0f);
                }
                this.X.f(this.H, true, hcVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.hc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.hc[0]);
            }
        }
        q6 q6Var = this.Z;
        if (q6Var != null && !this.L) {
            y6 y6Var = q6Var.d;
            boolean[] zArr2 = y6Var.d;
            if (zArr2[0]) {
                j3 = y6Var.f53452y;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = y6Var.E;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = y6Var.f53448r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = y6Var.f53451x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = y6Var.f53449s;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = y6Var.f53450w;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = y6Var.G;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = y6Var.f53443f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = y6Var.f53447n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = y6Var.F;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = y6Var.f53445g0;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    u6 u6Var2 = (u6) arrayList2.get(i11);
                    if (u6Var2.f56015a == 11) {
                        int i12 = u6Var2.f51774f;
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
            q6Var.a(j29, z10);
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
            f10 = aVar.f57081e;
        }
        te.a aVar2 = this.U;
        if (aVar2 != null) {
            f11 = aVar2.f57081e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }
}
