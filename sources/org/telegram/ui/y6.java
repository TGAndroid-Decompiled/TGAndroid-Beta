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
public final class y6 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public static volatile boolean f52080h0 = false;
    public static long f52081i0;
    public static Long f52082j0;
    public static Long f52083k0;
    public static Long f52084l0;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public i6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public te.a S;
    public te.a T;
    public int[] U;
    public float[] V;
    public v6 W;
    public k6 X;
    public q6 Y;
    public wt Z;
    public w6 f52085a;
    public long f52086a0;
    public bi.q1 f52087b;
    public org.telegram.ui.Components.ht0 f52088b0;
    public org.telegram.ui.ActionBar.u1 f52089c;
    public org.telegram.ui.ActionBar.z0 f52090c0;
    public final boolean[] d;
    public ci.c f52091d0;
    public long f52092e;
    public final ArrayList f52093e0;
    public long f52094f;
    public final ArrayList f52095f0;
    public boolean f52096g0;
    public long h;
    public long f52097n;
    public long f52098r;
    public long f52099s;
    public long f52100w;
    public long f52101x;
    public long f52102y;

    public y6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f52092e = -1L;
        this.f52094f = -1L;
        this.h = -1L;
        this.f52097n = -1L;
        this.f52098r = -1L;
        this.f52099s = -1L;
        this.f52100w = -1L;
        this.f52101x = -1L;
        this.f52102y = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.R = -1;
        this.f52093e0 = new ArrayList();
        this.f52095f0 = new ArrayList();
    }

    public static void Z(y6 y6Var, boolean z9, long j3, o6 o6Var) {
        if (z9) {
            org.telegram.messenger.gc.D().j();
        }
        try {
            org.telegram.ui.ActionBar.u1 u1Var = y6Var.f52089c;
            if (u1Var != null) {
                u1Var.dismiss();
                y6Var.f52089c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        y6Var.getMediaDataController().f25846z0.b();
        org.telegram.messenger.g0.i3(new bi.r3(y6Var, j3, 20), 150L);
        org.telegram.messenger.ui.b0(y6Var.currentAccount).u(true);
        org.telegram.messenger.f8 f8Var = y6Var.getFileLoader().d;
        f8Var.d();
        f8Var.f22352a.c(new b6(y6Var, 1));
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

    public static void c0(y6 y6Var, org.telegram.ui.ActionBar.u1 u1Var) {
        org.telegram.messenger.w7.G(y6Var.currentAccount).i();
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(y6 y6Var, boolean z9) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, y6Var.getParentActivity(), null);
        y6Var.f52089c = u1Var;
        u1Var.f28568i0 = false;
        u1Var.r(500L);
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(y6Var.currentAccount);
        s12.N1.b();
        s12.J1.b();
        s12.K1.b();
        s12.L1.b();
        s12.M1.b();
        if (z9) {
            org.telegram.messenger.yr messagesStorage = y6Var.getMessagesStorage();
            messagesStorage.f26688a.c(new org.telegram.messenger.qq(messagesStorage, 12));
            return;
        }
        org.telegram.messenger.yr messagesStorage2 = y6Var.getMessagesStorage();
        messagesStorage2.f26688a.c(new org.telegram.messenger.qq(messagesStorage2, 16));
    }

    public static org.telegram.ui.ActionBar.y4 e0(y6 y6Var) {
        return y6Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.y4 f0(y6 y6Var) {
        return y6Var.simpleActionBar;
    }

    public static void i0(y6 y6Var) {
        String G;
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        boolean z12 = false;
        if (y6Var.f52091d0.f6430j.size() > 0) {
            if (y6Var.M != null) {
                if (!y6Var.f52091d0.f6432l.isEmpty()) {
                    ArrayList arrayList = y6Var.f52091d0.f6424b;
                    int size = arrayList.size();
                    int i7 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        s6 s6Var = (s6) obj;
                        if (y6Var.f52091d0.f6432l.contains(Long.valueOf(s6Var.f49640a))) {
                            i7 += s6Var.f49641b;
                        }
                    }
                    int size2 = y6Var.f52091d0.f6430j.size() - i7;
                    if (size2 > 0) {
                        G = a8.p0.D(org.telegram.messenger.hd.G(y6Var.f52091d0.f6432l.size(), "Chats", Integer.valueOf(y6Var.f52091d0.f6432l.size())), ", ", org.telegram.messenger.hd.G(size2, "Files", Integer.valueOf(size2)));
                    } else {
                        G = org.telegram.messenger.hd.G(y6Var.f52091d0.f6432l.size(), "Chats", Integer.valueOf(y6Var.f52091d0.f6432l.size()));
                    }
                } else {
                    G = org.telegram.messenger.hd.G(y6Var.f52091d0.f6430j.size(), "Files", Integer.valueOf(y6Var.f52091d0.f6430j.size()));
                }
                String i02 = org.telegram.messenger.g0.i0(y6Var.f52091d0.f6431k, false, false);
                org.telegram.ui.ActionBar.y4 y4Var = y6Var.simpleActionBar;
                boolean z13 = org.telegram.messenger.hd.f22871a0;
                y4Var.l();
                org.telegram.ui.Components.j6 j6Var = y4Var.f28786f;
                if (!z13 && y4Var.t() && y4Var.G) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j6Var.c(i02, z9, true);
                org.telegram.ui.ActionBar.y4 y4Var2 = y6Var.simpleActionBar;
                boolean z14 = org.telegram.messenger.hd.f22871a0;
                y4Var2.l();
                if (y4Var2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(y4Var2.getContext(), true, true, true);
                        y4Var2.h = j6Var2;
                        j6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        y4Var2.h.setTextColor(y4Var2.f28785e0);
                        y4Var2.h.setGravity(19);
                        y4Var2.h.setEllipsizeByGradient(true);
                        y4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.xq.h);
                        y4Var2.addView(y4Var2.h, y4Var2.indexOfChild(y4Var2.f28779b), c8.ha.e(-1, 18, 51));
                        y4Var2.g();
                    }
                    y6Var.M.f(true);
                    return;
                }
                org.telegram.ui.Components.j6 j6Var3 = y4Var2.h;
                if (j6Var3 != null && j6Var3.getTag() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.j6 j6Var4 = y4Var2.h;
                if (!z14 && y4Var2.t() && y4Var2.G) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j6Var4.c(G, z11, true);
                org.telegram.ui.Components.j6 j6Var5 = y4Var2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                j6Var5.setTag(num);
                org.telegram.ui.Components.j6 j6Var6 = y4Var2.h;
                if (j6Var6 != null && j6Var6.getTag() != null) {
                    z12 = true;
                }
                if (z10 != z12) {
                    y4Var2.requestLayout();
                }
                y6Var.M.f(true);
                return;
            }
            return;
        }
        y6Var.M.f(false);
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
        if (y6Var.f52091d0.f6430j.size() != 0 && y6Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131752098, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131752095, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752101, null), new y5(y6Var, 2));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            y6Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
            }
        }
    }

    public static void l0(y6 y6Var, boolean z9) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131748770, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
        u1Var.R = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748772, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.k5.q("LocalDatabaseClearText2", null, 2131748771, new Object[]{org.telegram.messenger.g0.i0(y6Var.f52092e, false, false)}, spannableStringBuilder);
        u1Var.T = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752649, null), new ab.y(3, y6Var, z9));
        y6Var.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28089q7, null);
        }
    }

    public static void m0(org.telegram.messenger.c20 c20Var) {
        Long l10 = f52082j0;
        if (l10 != null) {
            c20Var.a(l10);
            if (System.currentTimeMillis() - f52081i0 < 5000) {
                return;
            }
        }
        Utilities.f21334f.c(new fq0(c20Var, 15));
    }

    public static void n0(String str, int i7, int[] iArr, org.telegram.messenger.c20 c20Var) {
        File[] listFiles;
        boolean z9;
        boolean z10;
        boolean z11;
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
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z9) {
                            if (i7 == 1) {
                            }
                        }
                        if (!z9) {
                            if (i7 == 2) {
                            }
                        }
                        if (z10) {
                            if (i7 == 5) {
                            }
                        }
                        if (!z10) {
                            if (i7 == 3) {
                            }
                        }
                        if (z11) {
                            if (i7 == 5) {
                            }
                        }
                        if (!z11 && i7 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            n0(a8.p0.D(str, "/", name), i7, iArr, c20Var);
                        }
                    } else {
                        file2.delete();
                        int i10 = iArr[0] + 1;
                        iArr[0] = i10;
                        if (c20Var != null) {
                            c20Var.a(Float.valueOf(i10 / p02));
                        }
                    }
                }
            }
        }
    }

    public static int p0(int i7, String str) {
        File[] listFiles;
        boolean z9;
        boolean z10;
        boolean z11;
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
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (!lowerCase.endsWith(".tgs") && !lowerCase.endsWith(".webm")) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!lowerCase.endsWith(".tmp") && !lowerCase.endsWith(".temp") && !lowerCase.endsWith(".preload")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z9) {
                        if (i7 == 1) {
                        }
                    }
                    if (!z9) {
                        if (i7 == 2) {
                        }
                    }
                    if (z10) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z10) {
                        if (i7 == 3) {
                        }
                    }
                    if (z11) {
                        if (i7 == 5) {
                        }
                    }
                    if (!z11 && i7 == 4) {
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
        Long l11 = f52083k0;
        if (l11 != null && (l10 = f52084l0) != null) {
            a5Var.a(l11, l10);
        } else {
            Utilities.f21334f.c(new fq0(a5Var, 14));
        }
    }

    public static long s0(File file, int i7) {
        if (file != null && !f52080h0) {
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

    public final void A0(boolean z9) {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12;
        float[] fArr;
        ci.c cVar;
        org.telegram.ui.Components.ht0 ht0Var = this.f52088b0;
        if (ht0Var != null && ht0Var.f34422e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && System.currentTimeMillis() - this.f52086a0 < 80) {
            z11 = false;
        } else {
            z11 = z9;
        }
        ArrayList arrayList = this.f52093e0;
        arrayList.clear();
        ArrayList arrayList2 = this.f52095f0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new u6(9, (String) null));
        arrayList2.add(new u6(10, (String) null));
        arrayList2.size();
        if (this.K) {
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            arrayList2.add(new u6(12, (String) null));
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f52102y > 0) {
                arrayList3.add(u6.b(0, this.f52102y, org.telegram.messenger.hd.M0(2131748762, null), org.telegram.ui.ActionBar.k6.Zj));
            }
            if (this.D > 0) {
                arrayList3.add(u6.b(1, this.D, org.telegram.messenger.hd.M0(2131748758, null), org.telegram.ui.ActionBar.k6.Vj));
            }
            if (this.f52098r > 0) {
                arrayList3.add(u6.b(2, this.f52098r, org.telegram.messenger.hd.M0(2131748767, null), org.telegram.ui.ActionBar.k6.Wj));
            }
            if (this.f52101x > 0) {
                j3 = 0;
                arrayList3.add(u6.b(3, this.f52101x, org.telegram.messenger.hd.M0(2131748764, null), org.telegram.ui.ActionBar.k6.dk));
            } else {
                j3 = 0;
            }
            if (this.f52099s > j3) {
                arrayList3.add(u6.b(4, this.f52099s, org.telegram.messenger.hd.M0(2131748774, null), org.telegram.ui.ActionBar.k6.ak));
            }
            if (this.f52100w > j3) {
                arrayList3.add(u6.b(5, this.f52100w, org.telegram.messenger.hd.M0(2131748759, null), org.telegram.ui.ActionBar.k6.Xj));
            }
            if (this.F > j3) {
                arrayList3.add(u6.b(6, this.F, org.telegram.messenger.hd.M0(2131748760, null), org.telegram.ui.ActionBar.k6.bk));
            }
            if (this.f52094f > j3) {
                arrayList3.add(u6.b(7, this.f52094f, org.telegram.messenger.hd.M0(2131748761, null), org.telegram.ui.ActionBar.k6.ek));
            }
            if (this.f52097n > j3) {
                arrayList3.add(u6.b(8, this.f52097n, org.telegram.messenger.hd.M0(2131748765, null), org.telegram.ui.ActionBar.k6.dk));
            }
            if (this.E > j3) {
                arrayList3.add(u6.b(9, this.E, org.telegram.messenger.hd.M0(2131748766, null), org.telegram.ui.ActionBar.k6.Yj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.messenger.vj(28));
                ((u6) arrayList3.get(arrayList3.size() - 1)).f50225j = true;
                if (this.V == null) {
                    this.V = new float[11];
                }
                int i7 = 0;
                while (true) {
                    fArr = this.V;
                    if (i7 >= fArr.length) {
                        break;
                    }
                    fArr[i7] = (float) w0(i7);
                    i7++;
                }
                if (this.U == null) {
                    this.U = new int[11];
                }
                org.telegram.messenger.g0.f3(fArr, this.U);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((u6) arrayList3.get(i11)).f50224i = true;
                        j10 += ((u6) arrayList3.get(i11)).f50223g;
                        i10 += this.U[((u6) arrayList3.get(i11)).f50222f];
                    }
                    this.U[10] = i10;
                    arrayList2.add(u6.b(-1, j10, org.telegram.messenger.hd.M0(2131748763, null), org.telegram.ui.ActionBar.k6.Yj));
                    if (!this.L) {
                        arrayList2.addAll(arrayList3.subList(4, arrayList3.size()));
                    }
                } else {
                    arrayList2.addAll(arrayList3);
                }
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (z12) {
            arrayList2.size();
            arrayList2.add(new u6(13, (String) null));
            String M0 = org.telegram.messenger.hd.M0(2131744815, null);
            u6 u6Var = new u6(1);
            u6Var.f50221e = M0;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, org.telegram.messenger.hd.M0(2131753867, null)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String M02 = org.telegram.messenger.hd.M0(2131749057, null);
        u6 u6Var2 = new u6(1);
        u6Var2.f50221e = M02;
        arrayList2.add(u6Var2);
        if (this.H > j3) {
            arrayList2.add(new u6(3, org.telegram.messenger.hd.M0(2131748669, null)));
            arrayList2.add(new u6(14));
            String M03 = org.telegram.messenger.hd.M0(2131748668, null);
            u6 u6Var3 = new u6(1);
            u6Var3.f50221e = M03;
            arrayList2.add(u6Var3);
        }
        this.R = -1;
        if (z12 && (cVar = this.f52091d0) != null && !cVar.h()) {
            this.R = arrayList2.size();
            arrayList2.add(new u6(8, (String) null));
        }
        w6 w6Var = this.f52085a;
        if (w6Var != null) {
            if (z11) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.f();
            }
        }
        i6 i6Var = this.M;
        if (i6Var != null) {
            i6Var.d();
        }
        org.telegram.ui.Components.ht0 ht0Var2 = this.f52088b0;
        if (ht0Var2 != null) {
            if (z10 && this.R != -1) {
                ht0Var2.a();
            }
            org.telegram.ui.Components.ht0 ht0Var3 = this.f52088b0;
            ht0Var3.B();
            ht0Var3.requestLayout();
            ht0Var3.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131744817, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 26));
        this.simpleActionBar.l().c(1, 0, org.telegram.messenger.hd.M0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        org.telegram.ui.ActionBar.z0 e10 = this.simpleActionBar.o().b(2, 2131231244).e(3, 2131232108, org.telegram.messenger.hd.M0(2131752076, null));
        this.f52090c0 = e10;
        int i7 = org.telegram.ui.ActionBar.k6.f28069p7;
        e10.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f52090c0.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28089q7, false));
        this.f52090c0.h(0.12f, i7);
        boolean z9 = org.telegram.messenger.r2.f25191a;
        if (this.f52090c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752076, null));
            this.f52090c0.setText(spannableStringBuilder);
        }
        this.f52085a = new w6(0, context, this);
        org.telegram.ui.Components.ht0 ht0Var = new org.telegram.ui.Components.ht0(context);
        this.f52088b0 = ht0Var;
        ht0Var.setDebugLoggingEnabled(true);
        this.f52088b0.setCommonInsetsManagedExternally(true);
        this.f52088b0.setGeometry(new g6(this));
        org.telegram.ui.Components.ht0 ht0Var2 = this.f52088b0;
        this.fragmentView = ht0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, ht0Var2, null);
        bi.q1 q1Var = new bi.q1(7, context, this);
        this.f52087b = q1Var;
        q1Var.r1();
        this.f52087b.setClipToPadding(false);
        this.f52087b.setVerticalScrollBarEnabled(false);
        bi.q1 q1Var2 = this.f52087b;
        org.telegram.ui.Components.ht0 ht0Var3 = this.f52088b0;
        ht0Var3.getClass();
        q1Var2.setLayoutManager(new jg.i0(5, ht0Var3, false));
        this.f52088b0.u(this.f52087b, new y5(this, 3));
        this.f52087b.setAdapter(this.f52085a);
        h6 h6Var = new h6(this);
        h6Var.n(350L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        h6Var.o(xqVar);
        h6Var.C = false;
        h6Var.f56954m = false;
        this.f52087b.setItemAnimator(h6Var);
        this.f52087b.setOnItemClickListener(new y5(this, 4));
        this.f52087b.j(new g3(this, 3));
        View view = new View(context);
        this.O = view;
        ht0Var2.addView(view, c8.ha.e(-1, 0, 48));
        this.S = new te.a(0, new y5(this, 5), xqVar, 380L, false);
        this.T = new te.a(1, new y5(this, 0), xqVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(ht0Var2, this.f52087b, this.simpleActionBar, this.resourceProvider);
        i6 i6Var = new i6(this, context, this, this.glassEngine, this.f52088b0);
        this.M = i6Var;
        i6Var.D = true;
        FrameLayout frameLayout = i6Var.f49938c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.N = frameLayout;
        fh.g c10 = getBaseSimpleGlass().f21018c.c(this.N, null, false);
        c10.p(c8.g0.m(this.resourceProvider));
        c10.q(org.telegram.messenger.g0.L(9.66f));
        c10.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.ht0 ht0Var4 = this.f52088b0;
        i6 i6Var2 = this.M;
        org.telegram.ui.Components.p61 viewPager = i6Var2.getViewPager();
        i6 i6Var3 = this.M;
        Objects.requireNonNull(i6Var3);
        ht0Var4.x(i6Var2, viewPager, new w0(i6Var3, 8));
        this.f52088b0.y(this.N);
        this.N.setLayoutParams(c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new g6(this));
        this.M.setCacheModel(this.f52091d0);
        z5 z5Var = new z5(0, ht0Var2);
        getBaseSimpleGlass().f21028o = new bi.g(5, this, z5Var);
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.simpleActionBar.setBackground(null);
        v0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.L4) {
            try {
                org.telegram.ui.ActionBar.u1 u1Var = this.f52089c;
                if (u1Var != null) {
                    u1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f52089c = null;
            if (this.f52085a != null) {
                this.f52092e = org.telegram.messenger.yr.a0(this.currentAccount).S();
                if (this.f52090c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131752076, null));
                    this.f52090c0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        f6 f6Var = new f6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52087b, 16, new Class[]{org.telegram.ui.Cells.w9.class, org.telegram.ui.Components.vt0.class, org.telegram.ui.Components.hw0.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27848d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52087b, 0, new Class[]{org.telegram.ui.Components.hw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hj));
        int i7 = org.telegram.ui.ActionBar.k6.f28240y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52087b, 0, new Class[]{org.telegram.ui.Components.hw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.f27921h5));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ck));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f52096g0) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27792a7, false)) <= 0.721f) {
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
        org.telegram.ui.Components.ht0 ht0Var;
        if (this.M == null || motionEvent == null || (ht0Var = this.f52088b0) == null || !ht0Var.c() || this.f52088b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().f36904b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(s6 s6Var, org.telegram.ui.Components.ew0[] ew0VarArr, ci.c cVar) {
        t6 t6Var;
        HashSet hashSet;
        long j3;
        char c10;
        int i7;
        long j10;
        org.telegram.ui.Components.ew0 ew0Var;
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
        u1Var.f28568i0 = false;
        u1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((ew0VarArr != null && ((ew0Var = ew0VarArr[i10]) == null || !ew0Var.f33345c)) || (t6Var = (t6) s6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(t6Var.f49926b);
                hashSet = hashSet2;
                long j12 = s6Var.f49642c;
                long j13 = t6Var.f49925a;
                s6Var.f49642c = j12 - j13;
                this.G -= j13;
                this.I += j13;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f52102y -= t6Var.f49925a;
                } else if (i10 == 1) {
                    this.D -= t6Var.f49925a;
                } else if (i10 == 2) {
                    this.f52098r -= t6Var.f49925a;
                } else if (i10 == 3) {
                    this.f52101x -= t6Var.f49925a;
                } else if (i10 == 4) {
                    this.f52099s -= t6Var.f49925a;
                } else if (i10 == 5) {
                    this.F -= t6Var.f49925a;
                } else {
                    char c11 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < t6Var.f49926b.size()) {
                            ci.b bVar = (ci.b) t6Var.f49926b.get(i11);
                            String absolutePath = ((ci.b) t6Var.f49926b.get(i11)).f6417a.getAbsolutePath();
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
                                this.f52100w -= bVar.f6419c;
                            } else {
                                i7 = i11;
                                j10 = j11;
                                if (c10 == 0) {
                                    this.f52102y -= bVar.f6419c;
                                } else if (c10 == 1) {
                                    this.D -= bVar.f6419c;
                                } else {
                                    this.f52094f -= bVar.f6419c;
                                }
                            }
                            i11 = i7 + 1;
                            j11 = j10;
                            c11 = 7;
                        }
                    } else {
                        j3 = j11;
                        this.f52094f -= t6Var.f49925a;
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
            this.f52091d0.f6424b.remove(s6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.f6430j.iterator();
            while (it.hasNext()) {
                ci.b bVar2 = (ci.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j15 = this.G;
                    long j16 = bVar2.f6419c;
                    this.G = j15 - j16;
                    this.I += j16;
                    hashSet4.add(bVar2);
                    s6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f52102y -= bVar2.f6419c;
                    } else if (i12 == 1) {
                        this.D -= bVar2.f6419c;
                    } else if (i12 == 2) {
                        this.f52098r -= bVar2.f6419c;
                    } else if (i12 == 3) {
                        this.f52101x -= bVar2.f6419c;
                    } else if (i12 == 4) {
                        this.f52099s -= bVar2.f6419c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ci.b bVar3 = (ci.b) it2.next();
            ci.c cVar2 = this.f52091d0;
            if (cVar2.f6430j.remove(bVar3)) {
                cVar2.f6431k -= bVar3.f6419c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(this).Q(2131624051, 36, org.telegram.messenger.hd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j14 - this.G, false, false)));
        Q.f32531r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.f8 f8Var = getFileLoader().d;
        f8Var.getClass();
        f8Var.h(new org.telegram.messenger.y4(12, f8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.J.c(new o1(this, arrayList, u1Var, 3));
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        ci.c cVar = this.f52091d0;
        if (cVar != null && !cVar.f6430j.isEmpty()) {
            if (z9) {
                this.f52091d0.d();
                i6 i6Var = this.M;
                if (i6Var != null) {
                    i6Var.f(false);
                    this.M.e();
                }
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f52080h0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.qs.L4);
        this.f52092e = org.telegram.messenger.yr.a0(this.currentAccount).S();
        Utilities.f21333e.c(new b6(this, 2));
        this.f52086a0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.L4);
        try {
            org.telegram.ui.ActionBar.u1 u1Var = this.f52089c;
            if (u1Var != null) {
                u1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f52089c = null;
        f52080h0 = true;
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
            if (Build.VERSION.SDK_INT >= 30 && (c9Var = FilesMigrationService.f21169e) != null) {
                c9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f52085a.f();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.z0 z0Var = this.f52090c0;
            if (z0Var != null) {
                z0Var.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28069p7, false));
            }
            wt wtVar = this.Z;
            if (wtVar != null) {
                wtVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27921h5, false));
            }
            try {
                org.telegram.ui.ActionBar.z0 z0Var2 = this.f52090c0;
                if (z0Var2 != null) {
                    z0Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28089q7, false));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        if (f10 > 0.5f && !this.f52096g0) {
            this.f52096g0 = true;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25051r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z9, f10);
    }

    public final void q0(File file, int i7, LongSparseArray longSparseArray, ci.c cVar) {
        File[] listFiles;
        int i10;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f52080h0) {
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
                    ci.b bVar = new ci.b(file2);
                    long length = file2.length();
                    bVar.f6419c = length;
                    if (e10 != null) {
                        bVar.f6418b = e10.f22165a;
                        bVar.f6422g = e10.f22166b;
                        int i11 = e10.f22167c;
                        bVar.h = i11;
                        if (i11 == 23 && length > 0) {
                            i10 = 7;
                        }
                    }
                    bVar.d = i10;
                    long j3 = bVar.f6418b;
                    if (j3 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j3, null);
                        if (s6Var == null) {
                            s6Var = new s6(bVar.f6418b);
                            longSparseArray.put(bVar.f6418b, s6Var);
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
            ArrayList arrayList = this.f52095f0;
            if (i10 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i10);
            if (u6Var.f54415a == 11 && !u6Var.f50224i && (i7 = u6Var.f50222f) >= 0) {
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
        this.P = i7;
        this.Q = i10;
        bi.q1 q1Var = this.f52087b;
        if (q1Var != null) {
            int C = org.telegram.messenger.camera.q.C(48.0f, i7, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.B3(q1Var, 0, C, 0, C2);
            q1Var.setPadding(0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + i7) - C, 0, i10 - C2);
            View view = this.O;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7;
                this.O.setLayoutParams(layoutParams);
                z0();
            }
            if (this.f52088b0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f52087b.getLayoutParams();
                this.f52088b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.ht0 ht0Var = this.f52088b0;
                ht0Var.B();
                ht0Var.requestLayout();
                ht0Var.invalidate();
            }
        }
    }

    public final long w0(int i7) {
        switch (i7) {
            case 0:
                return this.f52102y;
            case 1:
                return this.D;
            case 2:
                return this.f52098r;
            case 3:
                return this.f52101x;
            case 4:
                return this.f52099s;
            case 5:
                return this.f52100w;
            case 6:
                return this.F;
            case 7:
                return this.f52094f;
            case 8:
                return this.f52097n;
            case 9:
                return this.E;
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
        ArrayList arrayList = this.f52095f0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                u6 u6Var = (u6) arrayList.get(i12);
                if (u6Var.f54415a != 11 || u6Var.f50224i || (i11 = u6Var.f50222f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.p2.APP_ERROR.a();
            if (view != null) {
                org.telegram.messenger.g0.G3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var2 = (u6) arrayList.get(i13);
                if (u6Var2.f54415a == 11 && !u6Var2.f50224i && (i10 = u6Var2.f50222f) >= 0) {
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
                if (u6Var3.f54415a == 11 && u6Var3.f50224i && (i7 = u6Var3.f50222f) >= 0) {
                    zArr[i7] = !t02;
                }
            }
        }
        for (int i16 = 0; i16 < this.f52087b.getChildCount(); i16++) {
            View childAt = this.f52087b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.f52087b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.f54415a == 11) {
                        int i17 = u6Var4.f50222f;
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
        v6 v6Var = this.W;
        long j18 = 0;
        boolean z9 = false;
        if (v6Var != null) {
            boolean z10 = this.K;
            if (!z10 && this.G > 0) {
                org.telegram.ui.Components.mc[] mcVarArr = new org.telegram.ui.Components.mc[11];
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f52095f0;
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i7);
                    if (u6Var.f54415a == 11) {
                        int i10 = u6Var.f50222f;
                        boolean[] zArr = this.d;
                        if (i10 < 0) {
                            if (this.L) {
                                long j19 = u6Var.f50223g;
                                boolean z11 = zArr[10];
                                ?? obj = new Object();
                                obj.f35980c = j19;
                                obj.f35979b = z11;
                                mcVarArr[10] = obj;
                            }
                        } else {
                            long j20 = u6Var.f50223g;
                            boolean z12 = zArr[i10];
                            ?? obj2 = new Object();
                            obj2.f35980c = j20;
                            obj2.f35979b = z12;
                            mcVarArr[i10] = obj2;
                        }
                    }
                    i7++;
                }
                if (System.currentTimeMillis() - this.f52086a0 < 80) {
                    this.W.f36375n.e(true, 0.0f);
                }
                this.W.f(this.G, true, mcVarArr);
            } else if (z10) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.mc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.mc[0]);
            }
        }
        q6 q6Var = this.Y;
        if (q6Var != null && !this.K) {
            y6 y6Var = q6Var.d;
            boolean[] zArr2 = y6Var.d;
            if (zArr2[0]) {
                j3 = y6Var.f52102y;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = y6Var.D;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = y6Var.f52098r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = y6Var.f52101x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = y6Var.f52099s;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = y6Var.f52100w;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = y6Var.F;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = y6Var.f52094f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = y6Var.f52097n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = y6Var.E;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = y6Var.f52095f0;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    u6 u6Var2 = (u6) arrayList2.get(i11);
                    if (u6Var2.f54415a == 11) {
                        int i12 = u6Var2.f50222f;
                        if (i12 < 0) {
                            i12 = zArr2.length - 1;
                        }
                        if (!zArr2[i12]) {
                            break;
                        }
                    }
                    i11++;
                } else {
                    z9 = true;
                    break;
                }
            }
            q6Var.a(j29, z9);
        }
    }

    public final void z0() {
        float f10;
        View view = this.O;
        if (view == null) {
            return;
        }
        te.a aVar = this.S;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f55370e;
        }
        te.a aVar2 = this.T;
        if (aVar2 != null) {
            f11 = aVar2.f55370e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }
}
