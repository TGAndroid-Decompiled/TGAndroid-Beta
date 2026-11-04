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
public final class z6 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public static volatile boolean f52541i0 = false;
    public static long f52542j0;
    public static Long f52543k0;
    public static Long f52544l0;
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
    public k6 N;
    public FrameLayout O;
    public View P;
    public int Q;
    public int R;
    public int S;
    public qe.a T;
    public qe.a U;
    public int[] V;
    public float[] W;
    public w6 X;
    public m6 Y;
    public r6 Z;
    public x6 f52545a;
    public ut f52546a0;
    public ci.j1 f52547b;
    public long f52548b0;
    public org.telegram.ui.ActionBar.s1 f52549c;
    public org.telegram.ui.Components.gt0 f52550c0;
    public final boolean[] d;
    public org.telegram.ui.ActionBar.y0 f52551d0;
    public long f52552e;
    public di.c f52553e0;
    public long f52554f;
    public final ArrayList f52555f0;
    public final ArrayList f52556g0;
    public long h;
    public boolean f52557h0;
    public long f52558n;
    public long f52559r;
    public long f52560s;
    public long f52561w;
    public long f52562x;
    public long f52563y;

    public z6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f52552e = -1L;
        this.f52554f = -1L;
        this.h = -1L;
        this.f52558n = -1L;
        this.f52559r = -1L;
        this.f52560s = -1L;
        this.f52561w = -1L;
        this.f52562x = -1L;
        this.f52563y = -1L;
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
        this.f52555f0 = new ArrayList();
        this.f52556g0 = new ArrayList();
    }

    public static void Z(z6 z6Var, boolean z10, long j10, p6 p6Var) {
        if (z10) {
            org.telegram.messenger.zb.D().j();
        }
        try {
            org.telegram.ui.ActionBar.s1 s1Var = z6Var.f52549c;
            if (s1Var != null) {
                s1Var.dismiss();
                z6Var.f52549c = null;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        z6Var.getMediaDataController().A0.b();
        org.telegram.messenger.g0.i3(new ci.e3(z6Var, j10, 20), 150L);
        org.telegram.messenger.li.b0(z6Var.currentAccount).u(true);
        org.telegram.messenger.f8 f8Var = z6Var.getFileLoader().d;
        f8Var.d();
        f8Var.f22461a.c(new d6(z6Var, 1));
        p6Var.run();
    }

    public static void a0(z6 z6Var, float f10) {
        z6Var.simpleActionBar.setTitlesAlpha(f10);
        z6Var.z0();
        z6Var.fragmentView.invalidate();
    }

    public static void b0(org.telegram.ui.z6 r23, org.telegram.ui.o6 r24, org.telegram.ui.p6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z6.b0(org.telegram.ui.z6, org.telegram.ui.o6, org.telegram.ui.p6):void");
    }

    public static void c0(z6 z6Var, org.telegram.ui.ActionBar.s1 s1Var) {
        org.telegram.messenger.w7.G(z6Var.currentAccount).i();
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static void d0(z6 z6Var, boolean z10) {
        if (z6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, z6Var.getParentActivity(), null);
        z6Var.f52549c = s1Var;
        s1Var.f28546j0 = false;
        s1Var.r(500L);
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(z6Var.currentAccount);
        s12.O1.b();
        s12.K1.b();
        s12.L1.b();
        s12.M1.b();
        s12.N1.b();
        if (z10) {
            org.telegram.messenger.qr messagesStorage = z6Var.getMessagesStorage();
            messagesStorage.f24934a.c(new org.telegram.messenger.hq(messagesStorage, 12));
            return;
        }
        org.telegram.messenger.qr messagesStorage2 = z6Var.getMessagesStorage();
        messagesStorage2.f24934a.c(new org.telegram.messenger.hq(messagesStorage2, 16));
    }

    public static org.telegram.ui.ActionBar.y4 e0(z6 z6Var) {
        return z6Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.y4 f0(z6 z6Var) {
        return z6Var.simpleActionBar;
    }

    public static void i0(z6 z6Var) {
        String G;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        boolean z13 = false;
        if (z6Var.f52553e0.f9193j.size() > 0) {
            if (z6Var.N != null) {
                if (!z6Var.f52553e0.f9195l.isEmpty()) {
                    ArrayList arrayList = z6Var.f52553e0.f9187b;
                    int size = arrayList.size();
                    int i3 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        t6 t6Var = (t6) obj;
                        if (z6Var.f52553e0.f9195l.contains(Long.valueOf(t6Var.f49713a))) {
                            i3 += t6Var.f49714b;
                        }
                    }
                    int size2 = z6Var.f52553e0.f9193j.size() - i3;
                    if (size2 > 0) {
                        G = a1.g.C(org.telegram.messenger.bd.G(z6Var.f52553e0.f9195l.size(), "Chats", Integer.valueOf(z6Var.f52553e0.f9195l.size())), ", ", org.telegram.messenger.bd.G(size2, "Files", Integer.valueOf(size2)));
                    } else {
                        G = org.telegram.messenger.bd.G(z6Var.f52553e0.f9195l.size(), "Chats", Integer.valueOf(z6Var.f52553e0.f9195l.size()));
                    }
                } else {
                    G = org.telegram.messenger.bd.G(z6Var.f52553e0.f9193j.size(), "Files", Integer.valueOf(z6Var.f52553e0.f9193j.size()));
                }
                String i02 = org.telegram.messenger.g0.i0(z6Var.f52553e0.f9194k, false, false);
                org.telegram.ui.ActionBar.y4 y4Var = z6Var.simpleActionBar;
                boolean z14 = org.telegram.messenger.bd.f21784a0;
                y4Var.l();
                org.telegram.ui.Components.h6 h6Var = y4Var.f28859f;
                if (!z14 && y4Var.t() && y4Var.H) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h6Var.c(i02, z10, true);
                org.telegram.ui.ActionBar.y4 y4Var2 = z6Var.simpleActionBar;
                boolean z15 = org.telegram.messenger.bd.f21784a0;
                y4Var2.l();
                if (y4Var2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(y4Var2.getContext(), true, true, true);
                        y4Var2.h = h6Var2;
                        h6Var2.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        y4Var2.h.setTextColor(y4Var2.f28860f0);
                        y4Var2.h.setGravity(19);
                        y4Var2.h.setEllipsizeByGradient(true);
                        y4Var2.h.b(0.35f, 320L, org.telegram.ui.Components.xq.h);
                        y4Var2.addView(y4Var2.h, y4Var2.indexOfChild(y4Var2.f28852b), b8.mf.e(-1, 18, 51));
                        y4Var2.g();
                    }
                    z6Var.N.f(true);
                    return;
                }
                org.telegram.ui.Components.h6 h6Var3 = y4Var2.h;
                if (h6Var3 != null && h6Var3.getTag() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.h6 h6Var4 = y4Var2.h;
                if (!z15 && y4Var2.t() && y4Var2.H) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h6Var4.c(G, z12, true);
                org.telegram.ui.Components.h6 h6Var5 = y4Var2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                h6Var5.setTag(num);
                org.telegram.ui.Components.h6 h6Var6 = y4Var2.h;
                if (h6Var6 != null && h6Var6.getTag() != null) {
                    z13 = true;
                }
                if (z11 != z13) {
                    y4Var2.requestLayout();
                }
                z6Var.N.f(true);
                return;
            }
            return;
        }
        z6Var.N.f(false);
    }

    public static String j0(z6 z6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void k0(z6 z6Var) {
        if (z6Var.f52553e0.f9193j.size() != 0 && z6Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131752098, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131752095, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752101, null), new a6(z6Var, 2));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            z6Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        }
    }

    public static void l0(z6 z6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131748779, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131748781, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.k5.q("LocalDatabaseClearText2", null, 2131748780, new Object[]{org.telegram.messenger.g0.i0(z6Var.f52552e, false, false)}, spannableStringBuilder);
        s1Var.U = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752649, null), new ei.f(5, z6Var, z10));
        z6Var.showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
        }
    }

    public static void m0(org.telegram.messenger.u10 u10Var) {
        Long l10 = f52543k0;
        if (l10 != null) {
            u10Var.a(l10);
            if (System.currentTimeMillis() - f52542j0 < 5000) {
                return;
            }
        }
        Utilities.f21388f.c(new xp0(u10Var, 15));
    }

    public static void n0(String str, int i3, int[] iArr, org.telegram.messenger.u10 u10Var) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int p02 = p0(i3, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!".".equals(name)) {
                    if (i3 > 0 && name.length() >= 4) {
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
                            if (i3 == 1) {
                            }
                        }
                        if (!z10) {
                            if (i3 == 2) {
                            }
                        }
                        if (z11) {
                            if (i3 == 5) {
                            }
                        }
                        if (!z11) {
                            if (i3 == 3) {
                            }
                        }
                        if (z12) {
                            if (i3 == 5) {
                            }
                        }
                        if (!z12 && i3 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            n0(a1.g.C(str, "/", name), i3, iArr, u10Var);
                        }
                    } else {
                        file2.delete();
                        int i10 = iArr[0] + 1;
                        iArr[0] = i10;
                        if (u10Var != null) {
                            u10Var.a(Float.valueOf(i10 / p02));
                        }
                    }
                }
            }
        }
    }

    public static int p0(int i3, String str) {
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
                if (i3 > 0 && name.length() >= 4) {
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
                        if (i3 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i3 == 2) {
                        }
                    }
                    if (z11) {
                        if (i3 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i3 == 3) {
                        }
                    }
                    if (z12) {
                        if (i3 == 5) {
                        }
                    }
                    if (!z12 && i3 == 4) {
                    }
                }
                if (file2.isDirectory()) {
                    i10 += p0(i3, str + "/" + name);
                } else {
                    i10++;
                }
            }
        }
        return i10;
    }

    public static void r0(c5 c5Var) {
        Long l10;
        Long l11 = f52544l0;
        if (l11 != null && (l10 = m0) != null) {
            c5Var.a(l11, l10);
        } else {
            Utilities.f21388f.c(new xp0(c5Var, 14));
        }
    }

    public static long s0(File file, int i3) {
        if (file != null && !f52541i0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i3, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean u0(int i3, String str) {
        if (str != null && org.telegram.messenger.w7.j(i3) != null) {
            return str.contains(org.telegram.messenger.w7.j(i3).getAbsolutePath());
        }
        return false;
    }

    public final void A0(boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        float[] fArr;
        di.c cVar;
        org.telegram.ui.Components.gt0 gt0Var = this.f52550c0;
        if (gt0Var != null && gt0Var.f34196f0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && System.currentTimeMillis() - this.f52548b0 < 80) {
            z12 = false;
        } else {
            z12 = z10;
        }
        ArrayList arrayList = this.f52555f0;
        arrayList.clear();
        ArrayList arrayList2 = this.f52556g0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new v6(9, (String) null));
        arrayList2.add(new v6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            arrayList2.add(new v6(12, (String) null));
            z13 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f52563y > 0) {
                arrayList3.add(v6.b(0, this.f52563y, org.telegram.messenger.bd.M0(2131748771, null), org.telegram.ui.ActionBar.k6.Zj));
            }
            if (this.E > 0) {
                arrayList3.add(v6.b(1, this.E, org.telegram.messenger.bd.M0(2131748767, null), org.telegram.ui.ActionBar.k6.Vj));
            }
            if (this.f52559r > 0) {
                arrayList3.add(v6.b(2, this.f52559r, org.telegram.messenger.bd.M0(2131748776, null), org.telegram.ui.ActionBar.k6.Wj));
            }
            if (this.f52562x > 0) {
                j10 = 0;
                arrayList3.add(v6.b(3, this.f52562x, org.telegram.messenger.bd.M0(2131748773, null), org.telegram.ui.ActionBar.k6.dk));
            } else {
                j10 = 0;
            }
            if (this.f52560s > j10) {
                arrayList3.add(v6.b(4, this.f52560s, org.telegram.messenger.bd.M0(2131748783, null), org.telegram.ui.ActionBar.k6.ak));
            }
            if (this.f52561w > j10) {
                arrayList3.add(v6.b(5, this.f52561w, org.telegram.messenger.bd.M0(2131748768, null), org.telegram.ui.ActionBar.k6.Xj));
            }
            if (this.G > j10) {
                arrayList3.add(v6.b(6, this.G, org.telegram.messenger.bd.M0(2131748769, null), org.telegram.ui.ActionBar.k6.bk));
            }
            if (this.f52554f > j10) {
                arrayList3.add(v6.b(7, this.f52554f, org.telegram.messenger.bd.M0(2131748770, null), org.telegram.ui.ActionBar.k6.ek));
            }
            if (this.f52558n > j10) {
                arrayList3.add(v6.b(8, this.f52558n, org.telegram.messenger.bd.M0(2131748774, null), org.telegram.ui.ActionBar.k6.dk));
            }
            if (this.F > j10) {
                arrayList3.add(v6.b(9, this.F, org.telegram.messenger.bd.M0(2131748775, null), org.telegram.ui.ActionBar.k6.Yj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new org.telegram.messenger.tq(18));
                ((v6) arrayList3.get(arrayList3.size() - 1)).f50404j = true;
                if (this.W == null) {
                    this.W = new float[11];
                }
                int i3 = 0;
                while (true) {
                    fArr = this.W;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    fArr[i3] = (float) w0(i3);
                    i3++;
                }
                if (this.V == null) {
                    this.V = new int[11];
                }
                org.telegram.messenger.g0.f3(fArr, this.V);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((v6) arrayList3.get(i11)).f50403i = true;
                        j11 += ((v6) arrayList3.get(i11)).f50402g;
                        i10 += this.V[((v6) arrayList3.get(i11)).f50401f];
                    }
                    this.V[10] = i10;
                    arrayList2.add(v6.b(-1, j11, org.telegram.messenger.bd.M0(2131748772, null), org.telegram.ui.ActionBar.k6.Yj));
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
            arrayList2.add(new v6(13, (String) null));
            String M0 = org.telegram.messenger.bd.M0(2131744824, null);
            v6 v6Var = new v6(1);
            v6Var.f50400e = M0;
            arrayList2.add(v6Var);
        }
        arrayList2.add(new v6(3, org.telegram.messenger.bd.M0(2131753867, null)));
        arrayList2.add(new v6(0, 0));
        arrayList2.add(new v6(1, 0));
        arrayList2.add(new v6(2, 0));
        arrayList2.add(new v6(3, 0));
        String M02 = org.telegram.messenger.bd.M0(2131749066, null);
        v6 v6Var2 = new v6(1);
        v6Var2.f50400e = M02;
        arrayList2.add(v6Var2);
        if (this.I > j10) {
            arrayList2.add(new v6(3, org.telegram.messenger.bd.M0(2131748678, null)));
            arrayList2.add(new v6(14));
            String M03 = org.telegram.messenger.bd.M0(2131748677, null);
            v6 v6Var3 = new v6(1);
            v6Var3.f50400e = M03;
            arrayList2.add(v6Var3);
        }
        this.S = -1;
        if (z13 && (cVar = this.f52553e0) != null && !cVar.h()) {
            this.S = arrayList2.size();
            arrayList2.add(new v6(8, (String) null));
        }
        x6 x6Var = this.f52545a;
        if (x6Var != null) {
            if (z12) {
                x6Var.E(arrayList, arrayList2);
            } else {
                x6Var.f();
            }
        }
        k6 k6Var = this.N;
        if (k6Var != null) {
            k6Var.d();
        }
        org.telegram.ui.Components.gt0 gt0Var2 = this.f52550c0;
        if (gt0Var2 != null) {
            if (z11 && this.S != -1) {
                gt0Var2.a();
            }
            org.telegram.ui.Components.gt0 gt0Var3 = this.f52550c0;
            gt0Var3.B();
            gt0Var3.requestLayout();
            gt0Var3.invalidate();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131744826, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 27));
        this.simpleActionBar.l().c(1, 0, org.telegram.messenger.bd.M0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        org.telegram.ui.ActionBar.y0 e10 = this.simpleActionBar.o().b(2, 2131231244).e(3, 2131232108, org.telegram.messenger.bd.M0(2131752076, null));
        this.f52551d0 = e10;
        int i3 = org.telegram.ui.ActionBar.k6.f28102p7;
        e10.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.f52551d0.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false));
        this.f52551d0.h(0.12f, i3);
        boolean z10 = org.telegram.messenger.r2.f25040a;
        if (this.f52551d0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131752076, null));
            this.f52551d0.setText(spannableStringBuilder);
        }
        this.f52545a = new x6(0, context, this);
        org.telegram.ui.Components.gt0 gt0Var = new org.telegram.ui.Components.gt0(context);
        this.f52550c0 = gt0Var;
        gt0Var.setDebugLoggingEnabled(true);
        this.f52550c0.setCommonInsetsManagedExternally(true);
        this.f52550c0.setGeometry(new i6(this));
        org.telegram.ui.Components.gt0 gt0Var2 = this.f52550c0;
        this.fragmentView = gt0Var2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, gt0Var2, null);
        ci.j1 j1Var = new ci.j1(7, context, this);
        this.f52547b = j1Var;
        j1Var.r1();
        this.f52547b.setClipToPadding(false);
        this.f52547b.setVerticalScrollBarEnabled(false);
        ci.j1 j1Var2 = this.f52547b;
        org.telegram.ui.Components.gt0 gt0Var3 = this.f52550c0;
        gt0Var3.getClass();
        j1Var2.setLayoutManager(new kg.f0(5, gt0Var3, false));
        this.f52550c0.u(this.f52547b, new a6(this, 3));
        this.f52547b.setAdapter(this.f52545a);
        j6 j6Var = new j6(this);
        j6Var.n(350L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        j6Var.o(xqVar);
        j6Var.C = false;
        j6Var.f55567m = false;
        this.f52547b.setItemAnimator(j6Var);
        this.f52547b.setOnItemClickListener(new a6(this, 4));
        this.f52547b.j(new h3(this, 3));
        View view = new View(context);
        this.P = view;
        gt0Var2.addView(view, b8.mf.e(-1, 0, 48));
        this.T = new qe.a(0, new a6(this, 5), xqVar, 380L, false);
        this.U = new qe.a(1, new a6(this, 0), xqVar, 380L, false);
        z0();
        getBaseSimpleGlass().f(gt0Var2, this.f52547b, this.simpleActionBar, this.resourceProvider);
        k6 k6Var = new k6(this, context, this, this.glassEngine, this.f52550c0);
        this.N = k6Var;
        k6Var.E = true;
        FrameLayout frameLayout = k6Var.f49998c;
        org.telegram.messenger.g0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.O = frameLayout;
        gh.g c2 = getBaseSimpleGlass().f53525c.c(this.O, null, false);
        c2.p(b8.cd.m(this.resourceProvider));
        c2.q(org.telegram.messenger.g0.L(9.66f));
        c2.r(org.telegram.messenger.g0.L(18.0f));
        frameLayout.setBackground(c2);
        org.telegram.ui.Components.gt0 gt0Var4 = this.f52550c0;
        k6 k6Var2 = this.N;
        org.telegram.ui.Components.n61 viewPager = k6Var2.getViewPager();
        k6 k6Var3 = this.N;
        Objects.requireNonNull(k6Var3);
        gt0Var4.x(k6Var2, viewPager, new x0(k6Var3, 8));
        this.f52550c0.y(this.O);
        this.O.setLayoutParams(b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.O.bringToFront();
        this.N.setDelegate(new i6(this));
        this.N.setCacheModel(this.f52553e0);
        b6 b6Var = new b6(0, gt0Var2);
        getBaseSimpleGlass().f53534n = new ci.g(3, this, b6Var);
        this.P.setBackground(getBaseSimpleGlass().a(this.P));
        this.simpleActionBar.setBackground(null);
        v0(this.Q, this.R);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.L4) {
            try {
                org.telegram.ui.ActionBar.s1 s1Var = this.f52549c;
                if (s1Var != null) {
                    s1Var.dismiss();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f52549c = null;
            if (this.f52545a != null) {
                this.f52552e = org.telegram.messenger.qr.a0(this.currentAccount).S();
                if (this.f52551d0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131752076, null));
                    this.f52551d0.setText(spannableStringBuilder);
                }
                A0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        h6 h6Var = new h6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52547b, 16, new Class[]{org.telegram.ui.Cells.v9.class, org.telegram.ui.Components.ut0.class, org.telegram.ui.Components.gw0.class, org.telegram.ui.Cells.n4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27878d6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52547b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hj));
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52547b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f27954h5));
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
        if (!this.f52557h0) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27824a7, false)) <= 0.721f) {
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
        org.telegram.ui.Components.gt0 gt0Var;
        if (this.N == null || motionEvent == null || (gt0Var = this.f52550c0) == null || !gt0Var.c() || this.f52550c0.j(motionEvent.getX(), motionEvent.getY()) || this.N.getViewPager().f36384b == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(t6 t6Var, org.telegram.ui.Components.dw0[] dw0VarArr, di.c cVar) {
        u6 u6Var;
        HashSet hashSet;
        long j10;
        char c2;
        int i3;
        long j11;
        org.telegram.ui.Components.dw0 dw0Var;
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
        s1Var.f28546j0 = false;
        s1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j12 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((dw0VarArr != null && ((dw0Var = dw0VarArr[i10]) == null || !dw0Var.f33202c)) || (u6Var = (u6) t6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(u6Var.f49986b);
                hashSet = hashSet2;
                long j13 = t6Var.f49715c;
                long j14 = u6Var.f49985a;
                t6Var.f49715c = j13 - j14;
                this.H -= j14;
                this.J += j14;
                t6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f52563y -= u6Var.f49985a;
                } else if (i10 == 1) {
                    this.E -= u6Var.f49985a;
                } else if (i10 == 2) {
                    this.f52559r -= u6Var.f49985a;
                } else if (i10 == 3) {
                    this.f52562x -= u6Var.f49985a;
                } else if (i10 == 4) {
                    this.f52560s -= u6Var.f49985a;
                } else if (i10 == 5) {
                    this.G -= u6Var.f49985a;
                } else {
                    char c10 = 7;
                    if (i10 == 7) {
                        int i11 = 0;
                        while (i11 < u6Var.f49986b.size()) {
                            di.b bVar = (di.b) u6Var.f49986b.get(i11);
                            String absolutePath = ((di.b) u6Var.f49986b.get(i11)).f9180a.getAbsolutePath();
                            if (u0(6, absolutePath)) {
                                c2 = c10;
                            } else if (u0(0, absolutePath) || u0(100, absolutePath)) {
                                c2 = 0;
                            } else if (u0(2, absolutePath) || u0(101, absolutePath)) {
                                c2 = 1;
                            } else {
                                c2 = 6;
                            }
                            if (c2 == c10) {
                                i3 = i11;
                                j11 = j12;
                                this.f52561w -= bVar.f9182c;
                            } else {
                                i3 = i11;
                                j11 = j12;
                                if (c2 == 0) {
                                    this.f52563y -= bVar.f9182c;
                                } else if (c2 == 1) {
                                    this.E -= bVar.f9182c;
                                } else {
                                    this.f52554f -= bVar.f9182c;
                                }
                            }
                            i11 = i3 + 1;
                            j12 = j11;
                            c10 = 7;
                        }
                    } else {
                        j10 = j12;
                        this.f52554f -= u6Var.f49985a;
                        i10++;
                        hashSet2 = hashSet;
                        j12 = j10;
                    }
                }
            }
            j10 = j12;
            i10++;
            hashSet2 = hashSet;
            j12 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j15 = j12;
        if (t6Var.d.size() == 0) {
            this.f52553e0.f9187b.remove(t6Var);
        }
        A0(true);
        if (cVar != null) {
            Iterator it = cVar.f9193j.iterator();
            while (it.hasNext()) {
                di.b bVar2 = (di.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j16 = this.H;
                    long j17 = bVar2.f9182c;
                    this.H = j16 - j17;
                    this.J += j17;
                    hashSet4.add(bVar2);
                    t6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f52563y -= bVar2.f9182c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f9182c;
                    } else if (i12 == 2) {
                        this.f52559r -= bVar2.f9182c;
                    } else if (i12 == 3) {
                        this.f52562x -= bVar2.f9182c;
                    } else if (i12 == 4) {
                        this.f52560s -= bVar2.f9182c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            di.b bVar3 = (di.b) it2.next();
            di.c cVar2 = this.f52553e0;
            if (cVar2.f9193j.remove(bVar3)) {
                cVar2.f9194k -= bVar3.f9182c;
            }
            ArrayList e10 = cVar2.e(bVar3.d);
            if (e10 != null) {
                e10.remove(bVar3);
            }
        }
        org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(this).Q(2131624051, 36, org.telegram.messenger.bd.a0(null, null, 2131752645, org.telegram.messenger.g0.i0(j15 - this.H, false, false)));
        Q.f31800r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.f8 f8Var = getFileLoader().d;
        f8Var.getClass();
        f8Var.h(new org.telegram.messenger.y4(12, f8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.w7.K.c(new p1(this, arrayList, s1Var, 3));
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        di.c cVar = this.f52553e0;
        if (cVar != null && !cVar.f9193j.isEmpty()) {
            if (z10) {
                this.f52553e0.d();
                k6 k6Var = this.N;
                if (k6Var != null) {
                    k6Var.f(false);
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
        f52541i0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.hs.L4);
        this.f52552e = org.telegram.messenger.qr.a0(this.currentAccount).S();
        Utilities.f21387e.c(new d6(this, 2));
        this.f52548b0 = System.currentTimeMillis();
        A0(false);
        y0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.L4);
        try {
            org.telegram.ui.ActionBar.s1 s1Var = this.f52549c;
            if (s1Var != null) {
                s1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f52549c = null;
        f52541i0 = true;
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        v0(i10, i12);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        org.telegram.messenger.b9 b9Var;
        if (i3 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (b9Var = FilesMigrationService.f21222e) != null) {
                b9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f52545a.f();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.y0 y0Var = this.f52551d0;
            if (y0Var != null) {
                y0Var.setIconColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28102p7, false));
            }
            ut utVar = this.f52546a0;
            if (utVar != null) {
                utVar.v0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27954h5, false));
            }
            try {
                org.telegram.ui.ActionBar.y0 y0Var2 = this.f52551d0;
                if (y0Var2 != null) {
                    y0Var2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false));
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
        if (f10 > 0.5f && !this.f52557h0) {
            this.f52557h0 = true;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final void q0(File file, int i3, LongSparseArray longSparseArray, di.c cVar) {
        File[] listFiles;
        int i10;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f52541i0) {
                    break;
                }
                if (file2.isDirectory()) {
                    q0(file2, i3, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.e8 e10 = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i10 = i3;
                    } else {
                        i10 = 3;
                    }
                    di.b bVar = new di.b(file2);
                    long length = file2.length();
                    bVar.f9182c = length;
                    if (e10 != null) {
                        bVar.f9181b = e10.f22324a;
                        bVar.f9185g = e10.f22325b;
                        int i11 = e10.f22326c;
                        bVar.h = i11;
                        if (i11 == 23 && length > 0) {
                            i10 = 7;
                        }
                    }
                    bVar.d = i10;
                    long j10 = bVar.f9181b;
                    if (j10 != 0) {
                        t6 t6Var = (t6) longSparseArray.get(j10, null);
                        if (t6Var == null) {
                            t6Var = new t6(bVar.f9181b);
                            longSparseArray.put(bVar.f9181b, t6Var);
                        }
                        t6Var.a(bVar, i10);
                    }
                    if (i10 != 6) {
                        cVar.e(i10).add(bVar);
                    }
                }
            }
        }
    }

    public final boolean t0() {
        int i3;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52556g0;
            if (i10 >= arrayList.size()) {
                break;
            }
            v6 v6Var = (v6) arrayList.get(i10);
            if (v6Var.f54715a == 11 && !v6Var.f50403i && (i3 = v6Var.f50401f) >= 0) {
                zArr2[i3] = true;
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

    public final void v0(int i3, int i10) {
        this.Q = i3;
        this.R = i10;
        ci.j1 j1Var = this.f52547b;
        if (j1Var != null) {
            int C = org.telegram.messenger.camera.q.C(48.0f, i3, -org.telegram.messenger.g0.L(8.0f));
            int C2 = org.telegram.messenger.camera.q.C(48.0f, i10, -org.telegram.messenger.g0.L(8.0f));
            org.telegram.messenger.g0.B3(j1Var, 0, C, 0, C2);
            j1Var.setPadding(0, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + i3) - C, 0, i10 - C2);
            View view = this.P;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.L(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i3;
                this.P.setLayoutParams(layoutParams);
                z0();
            }
            if (this.f52550c0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f52547b.getLayoutParams();
                this.f52550c0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.gt0 gt0Var = this.f52550c0;
                gt0Var.B();
                gt0Var.requestLayout();
                gt0Var.invalidate();
            }
        }
    }

    public final long w0(int i3) {
        switch (i3) {
            case 0:
                return this.f52563y;
            case 1:
                return this.E;
            case 2:
                return this.f52559r;
            case 3:
                return this.f52562x;
            case 4:
                return this.f52560s;
            case 5:
                return this.f52561w;
            case 6:
                return this.G;
            case 7:
                return this.f52554f;
            case 8:
                return this.f52558n;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void x0(View view) {
        int i3;
        int i10;
        int i11;
        boolean t02 = t0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f52556g0;
        if (t02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                v6 v6Var = (v6) arrayList.get(i12);
                if (v6Var.f54715a != 11 || v6Var.f50403i || (i11 = v6Var.f50401f) < 0 || !zArr[i11]) {
                }
            }
            org.telegram.messenger.p2.APP_ERROR.a();
            if (view != null) {
                org.telegram.messenger.g0.G3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                v6 v6Var2 = (v6) arrayList.get(i13);
                if (v6Var2.f54715a == 11 && !v6Var2.f50403i && (i10 = v6Var2.f50401f) >= 0) {
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
                v6 v6Var3 = (v6) arrayList.get(i15);
                if (v6Var3.f54715a == 11 && v6Var3.f50403i && (i3 = v6Var3.f50401f) >= 0) {
                    zArr[i3] = !t02;
                }
            }
        }
        for (int i16 = 0; i16 < this.f52547b.getChildCount(); i16++) {
            View childAt = this.f52547b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.f52547b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    v6 v6Var4 = (v6) arrayList.get(R);
                    if (v6Var4.f54715a == 11) {
                        int i17 = v6Var4.f50401f;
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
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        w6 w6Var = this.X;
        long j19 = 0;
        boolean z10 = false;
        if (w6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.kc[] kcVarArr = new org.telegram.ui.Components.kc[11];
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = this.f52556g0;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    v6 v6Var = (v6) arrayList.get(i3);
                    if (v6Var.f54715a == 11) {
                        int i10 = v6Var.f50401f;
                        boolean[] zArr = this.d;
                        if (i10 < 0) {
                            if (this.M) {
                                long j20 = v6Var.f50402g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f35364c = j20;
                                obj.f35363b = z12;
                                kcVarArr[10] = obj;
                            }
                        } else {
                            long j21 = v6Var.f50402g;
                            boolean z13 = zArr[i10];
                            ?? obj2 = new Object();
                            obj2.f35364c = j21;
                            obj2.f35363b = z13;
                            kcVarArr[i10] = obj2;
                        }
                    }
                    i3++;
                }
                if (System.currentTimeMillis() - this.f52548b0 < 80) {
                    this.X.f35697n.e(true, 0.0f);
                }
                this.X.f(this.H, true, kcVarArr);
            } else if (z11) {
                w6Var.f(-1L, true, new org.telegram.ui.Components.kc[0]);
            } else {
                w6Var.f(0L, true, new org.telegram.ui.Components.kc[0]);
            }
        }
        r6 r6Var = this.Z;
        if (r6Var != null && !this.L) {
            z6 z6Var = r6Var.d;
            boolean[] zArr2 = z6Var.d;
            if (zArr2[0]) {
                j10 = z6Var.f52563y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = z6Var.E;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = z6Var.f52559r;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = z6Var.f52562x;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = z6Var.f52560s;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = z6Var.f52561w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = z6Var.G;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = z6Var.f52554f;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = z6Var.f52558n;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = z6Var.F;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = z6Var.f52556g0;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    v6 v6Var2 = (v6) arrayList2.get(i11);
                    if (v6Var2.f54715a == 11) {
                        int i12 = v6Var2.f50401f;
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
            r6Var.a(j30, z10);
        }
    }

    public final void z0() {
        float f10;
        View view = this.P;
        if (view == null) {
            return;
        }
        qe.a aVar = this.T;
        float f11 = 0.0f;
        if (aVar == null) {
            f10 = 0.0f;
        } else {
            f10 = aVar.f53840e;
        }
        qe.a aVar2 = this.U;
        if (aVar2 != null) {
            f11 = aVar2.f53840e;
        }
        view.setTranslationY(((-(1.0f - f10)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f11) * org.telegram.messenger.g0.L(44.0f)));
    }
}
