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
public final class y6 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public static volatile boolean f43710h0 = false;
    public static long f43711i0;
    public static Long f43712j0;
    public static Long f43713k0;
    public static Long f43714l0;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public j6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public int Q;
    public int R;
    public fe.b S;
    public fe.b T;
    public int[] U;
    public float[] V;
    public v6 W;
    public l6 X;
    public q6 Y;
    public zu Z;
    public w6 f43715a;
    public long f43716a0;
    public ag.b1 f43717b;
    public org.telegram.ui.Components.ku0 f43718b0;
    public org.telegram.ui.ActionBar.x1 f43719c;
    public org.telegram.ui.ActionBar.b1 f43720c0;
    public final boolean[] d;
    public sh.b f43721d0;
    public long e;
    public final ArrayList f43722e0;
    public long f43723f;
    public final ArrayList f43724f0;
    public boolean f43725g0;
    public long h;
    public long f43726n;
    public long f43727r;
    public long f43728s;
    public long f43729w;
    public long f43730x;
    public long f43731y;

    public y6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f43723f = -1L;
        this.h = -1L;
        this.f43726n = -1L;
        this.f43727r = -1L;
        this.f43728s = -1L;
        this.f43729w = -1L;
        this.f43730x = -1L;
        this.f43731y = -1L;
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
        this.f43722e0 = new ArrayList();
        this.f43724f0 = new ArrayList();
    }

    public static void Y(y6 y6Var, boolean z10, long j10, o6 o6Var) {
        if (z10) {
            org.telegram.messenger.hc.D().j();
        }
        try {
            org.telegram.ui.ActionBar.x1 x1Var = y6Var.f43719c;
            if (x1Var != null) {
                x1Var.dismiss();
                y6Var.f43719c = null;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        y6Var.getMediaDataController().f18362z0.b();
        org.telegram.messenger.i0.h3(new bi.e(y6Var, j10, 9), 150L);
        org.telegram.messenger.ui.b0(y6Var.currentAccount).u(true);
        org.telegram.messenger.k8 k8Var = y6Var.getFileLoader().d;
        k8Var.d();
        k8Var.f16544a.c(new b6(y6Var, 1));
        o6Var.run();
    }

    public static void Z(y6 y6Var, float f7) {
        y6Var.simpleActionBar.setTitlesAlpha(f7);
        y6Var.y0();
        y6Var.fragmentView.invalidate();
    }

    public static void a0(org.telegram.ui.y6 r23, org.telegram.ui.n6 r24, org.telegram.ui.o6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y6.a0(org.telegram.ui.y6, org.telegram.ui.n6, org.telegram.ui.o6):void");
    }

    public static void b0(y6 y6Var, org.telegram.ui.ActionBar.x1 x1Var) {
        org.telegram.messenger.b8.G(y6Var.currentAccount).i();
        try {
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void c0(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, y6Var.getParentActivity(), null);
        y6Var.f43719c = x1Var;
        x1Var.f21488i0 = false;
        x1Var.r(500L);
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(y6Var.currentAccount);
        r12.N1.b();
        r12.J1.b();
        r12.K1.b();
        r12.L1.b();
        r12.M1.b();
        if (z10) {
            org.telegram.messenger.hs messagesStorage = y6Var.getMessagesStorage();
            messagesStorage.f15938a.c(new org.telegram.messenger.br(messagesStorage, 12));
            return;
        }
        org.telegram.messenger.hs messagesStorage2 = y6Var.getMessagesStorage();
        messagesStorage2.f15938a.c(new org.telegram.messenger.br(messagesStorage2, 15));
    }

    public static org.telegram.ui.ActionBar.i5 d0(y6 y6Var) {
        return y6Var.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.i5 e0(y6 y6Var) {
        return y6Var.simpleActionBar;
    }

    public static void h0(y6 y6Var) {
        String G;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        boolean z13 = false;
        if (y6Var.f43721d0.f48503j.size() > 0) {
            if (y6Var.M != null) {
                if (!y6Var.f43721d0.f48505l.isEmpty()) {
                    ArrayList arrayList = y6Var.f43721d0.f48498b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        s6 s6Var = (s6) obj;
                        if (y6Var.f43721d0.f48505l.contains(Long.valueOf(s6Var.f41380a))) {
                            i10 += s6Var.f41381b;
                        }
                    }
                    int size2 = y6Var.f43721d0.f48503j.size() - i10;
                    if (size2 > 0) {
                        G = a1.g.C(org.telegram.messenger.cd.G(y6Var.f43721d0.f48505l.size(), "Chats", Integer.valueOf(y6Var.f43721d0.f48505l.size())), ", ", org.telegram.messenger.cd.G(size2, "Files", Integer.valueOf(size2)));
                    } else {
                        G = org.telegram.messenger.cd.G(y6Var.f43721d0.f48505l.size(), "Chats", Integer.valueOf(y6Var.f43721d0.f48505l.size()));
                    }
                } else {
                    G = org.telegram.messenger.cd.G(y6Var.f43721d0.f48503j.size(), "Files", Integer.valueOf(y6Var.f43721d0.f48503j.size()));
                }
                String i02 = org.telegram.messenger.i0.i0(y6Var.f43721d0.f48504k, false, false);
                org.telegram.ui.ActionBar.i5 i5Var = y6Var.simpleActionBar;
                boolean z14 = org.telegram.messenger.cd.X;
                i5Var.l();
                org.telegram.ui.Components.f6 f6Var = i5Var.f20413f;
                if (!z14 && i5Var.t() && i5Var.G) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f6Var.c(i02, z10, true);
                org.telegram.ui.ActionBar.i5 i5Var2 = y6Var.simpleActionBar;
                boolean z15 = org.telegram.messenger.cd.X;
                i5Var2.l();
                if (i5Var2.h == null) {
                    if (!TextUtils.isEmpty(G)) {
                        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(i5Var2.getContext(), true, true, true);
                        i5Var2.h = f6Var2;
                        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        i5Var2.h.setTextColor(i5Var2.f20412e0);
                        i5Var2.h.setGravity(19);
                        i5Var2.h.setEllipsizeByGradient(true);
                        i5Var2.h.b(0.35f, 320L, org.telegram.ui.Components.gr.h);
                        i5Var2.addView(i5Var2.h, i5Var2.indexOfChild(i5Var2.f20407b), w7.b6.e(-1, 18, 51));
                        i5Var2.g();
                    }
                    y6Var.M.f(true);
                    return;
                }
                org.telegram.ui.Components.f6 f6Var3 = i5Var2.h;
                if (f6Var3 != null && f6Var3.getTag() != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.f6 f6Var4 = i5Var2.h;
                if (!z15 && i5Var2.t() && i5Var2.G) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f6Var4.c(G, z12, true);
                org.telegram.ui.Components.f6 f6Var5 = i5Var2.h;
                if (TextUtils.isEmpty(G)) {
                    num = null;
                } else {
                    num = 1;
                }
                f6Var5.setTag(num);
                org.telegram.ui.Components.f6 f6Var6 = i5Var2.h;
                if (f6Var6 != null && f6Var6.getTag() != null) {
                    z13 = true;
                }
                if (z11 != z13) {
                    i5Var2.requestLayout();
                }
                y6Var.M.f(true);
                return;
            }
            return;
        }
        y6Var.M.f(false);
    }

    public static String i0(y6 y6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void j0(y6 y6Var) {
        if (y6Var.f43721d0.f48503j.size() != 0 && y6Var.getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131752098, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131752095, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752101, null), new y5(y6Var, 2));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            y6Var.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
            }
        }
    }

    public static void k0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131748781, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131748783, null));
        spannableStringBuilder.append((CharSequence) "\n\n");
        org.telegram.messenger.m5.p("LocalDatabaseClearText2", null, 2131748782, new Object[]{org.telegram.messenger.i0.i0(y6Var.e, false, false)}, spannableStringBuilder);
        x1Var.T = spannableStringBuilder;
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752649, null), new ag.w0(5, y6Var, z10));
        y6Var.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
        }
    }

    public static void l0(org.telegram.messenger.q20 q20Var) {
        Long l4 = f43712j0;
        if (l4 != null) {
            q20Var.a(l4);
            if (System.currentTimeMillis() - f43711i0 < 5000) {
                return;
            }
        }
        Utilities.f14521f.c(new rr0(q20Var, 15));
    }

    public static void m0(String str, int i10, int[] iArr, org.telegram.messenger.q20 q20Var) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int o02 = o0(i10, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!".".equals(name)) {
                    if (i10 > 0 && name.length() >= 4) {
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
                            if (i10 == 1) {
                            }
                        }
                        if (!z10) {
                            if (i10 == 2) {
                            }
                        }
                        if (z11) {
                            if (i10 == 5) {
                            }
                        }
                        if (!z11) {
                            if (i10 == 3) {
                            }
                        }
                        if (z12) {
                            if (i10 == 5) {
                            }
                        }
                        if (!z12 && i10 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            m0(a1.g.C(str, "/", name), i10, iArr, q20Var);
                        }
                    } else {
                        file2.delete();
                        int i11 = iArr[0] + 1;
                        iArr[0] = i11;
                        if (q20Var != null) {
                            q20Var.a(Float.valueOf(i11 / o02));
                        }
                    }
                }
            }
        }
    }

    public static int o0(int i10, String str) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int i11 = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (!".".equals(name)) {
                if (i10 > 0 && name.length() >= 4) {
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
                        if (i10 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i10 == 2) {
                        }
                    }
                    if (z11) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i10 == 3) {
                        }
                    }
                    if (z12) {
                        if (i10 == 5) {
                        }
                    }
                    if (!z12 && i10 == 4) {
                    }
                }
                if (file2.isDirectory()) {
                    i11 += o0(i10, str + "/" + name);
                } else {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static void q0(z4 z4Var) {
        Long l4;
        Long l10 = f43713k0;
        if (l10 != null && (l4 = f43714l0) != null) {
            z4Var.a(l10, l4);
        } else {
            Utilities.f14521f.c(new rr0(z4Var, 14));
        }
    }

    public static long r0(File file, int i10) {
        if (file != null && !f43710h0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean t0(int i10, String str) {
        if (str != null && org.telegram.messenger.b8.j(i10) != null) {
            return str.contains(org.telegram.messenger.b8.j(i10).getAbsolutePath());
        }
        return false;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.N6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackground(null);
        this.simpleActionBar.setTitlesAlpha(0.0f);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131744834, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 16));
        this.simpleActionBar.l().c(1, 0, org.telegram.messenger.cd.L0(2131752649, null), null, 0, null).getTextView().setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        org.telegram.ui.ActionBar.b1 e = this.simpleActionBar.o().b(2, 2131231245).e(3, 2131232107, org.telegram.messenger.cd.L0(2131752076, null));
        this.f43720c0 = e;
        int i10 = org.telegram.ui.ActionBar.t6.f21153p7;
        e.setIconColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f43720c0.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false));
        this.f43720c0.h(0.12f, i10);
        boolean z10 = org.telegram.messenger.v2.f18448a;
        if (this.f43720c0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131752076, null));
            this.f43720c0.setText(spannableStringBuilder);
        }
        this.f43715a = new w6(0, context, this);
        org.telegram.ui.Components.ku0 ku0Var = new org.telegram.ui.Components.ku0(context);
        this.f43718b0 = ku0Var;
        ku0Var.setDebugLoggingEnabled(true);
        this.f43718b0.setCommonInsetsManagedExternally(true);
        this.f43718b0.setGeometry(new h6(this));
        org.telegram.ui.Components.ku0 ku0Var2 = this.f43718b0;
        this.fragmentView = ku0Var2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, ku0Var2, null);
        ag.b1 b1Var = new ag.b1(this, context, 2);
        this.f43717b = b1Var;
        b1Var.r1();
        this.f43717b.setClipToPadding(false);
        this.f43717b.setVerticalScrollBarEnabled(false);
        ag.b1 b1Var2 = this.f43717b;
        org.telegram.ui.Components.ku0 ku0Var3 = this.f43718b0;
        ku0Var3.getClass();
        b1Var2.setLayoutManager(new br((Object) ku0Var3, 4));
        this.f43718b0.u(this.f43717b, new y5(this, 3));
        this.f43717b.setAdapter(this.f43715a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        i6Var.o(grVar);
        i6Var.C = false;
        i6Var.f47927m = false;
        this.f43717b.setItemAnimator(i6Var);
        this.f43717b.setOnItemClickListener(new y5(this, 4));
        this.f43717b.j(new h3(this, 3));
        View view = new View(context);
        this.O = view;
        ku0Var2.addView(view, w7.b6.e(-1, 0, 48));
        this.S = new fe.b(0, new y5(this, 5), grVar, 380L, false);
        this.T = new fe.b(1, new y5(this, 0), grVar, 380L, false);
        y0();
        getBaseSimpleGlass().f(ku0Var2, this.f43717b, this.simpleActionBar, this.resourceProvider);
        j6 j6Var = new j6(this, context, this, this.glassEngine, this.f43718b0);
        this.M = j6Var;
        j6Var.D = true;
        FrameLayout frameLayout = j6Var.f41749c;
        org.telegram.messenger.i0.E2(frameLayout);
        frameLayout.setTranslationY(0.0f);
        this.N = frameLayout;
        vg.f c10 = getBaseSimpleGlass().f6599c.c(this.N, null, false);
        c10.o(w7.b9.m(this.resourceProvider));
        c10.p(org.telegram.messenger.i0.L(9.66f));
        c10.q(org.telegram.messenger.i0.L(18.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.ku0 ku0Var4 = this.f43718b0;
        j6 j6Var2 = this.M;
        org.telegram.ui.Components.w71 viewPager = j6Var2.getViewPager();
        j6 j6Var3 = this.M;
        Objects.requireNonNull(j6Var3);
        ku0Var4.x(j6Var2, viewPager, new y0(j6Var3, 8));
        this.f43718b0.y(this.N);
        this.N.setLayoutParams(w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        this.simpleActionBar.bringToFront();
        this.N.bringToFront();
        this.M.setDelegate(new h6(this));
        this.M.setCacheModel(this.f43721d0);
        z5 z5Var = new z5(0, ku0Var2);
        getBaseSimpleGlass().f6606m = new ei.a(2, this, z5Var);
        this.O.setBackground(getBaseSimpleGlass().a(this.O));
        this.simpleActionBar.setBackground(null);
        u0(this.P, this.Q);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.L4) {
            try {
                org.telegram.ui.ActionBar.x1 x1Var = this.f43719c;
                if (x1Var != null) {
                    x1Var.dismiss();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            this.f43719c = null;
            if (this.f43715a != null) {
                this.e = org.telegram.messenger.hs.a0(this.currentAccount).S();
                if (this.f43720c0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.cd.L0(2131752076, null));
                    this.f43720c0.setText(spannableStringBuilder);
                }
                z0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        g6 g6Var = new g6(0, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f43717b, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Components.yu0.class, org.telegram.ui.Components.lx0.class, org.telegram.ui.Cells.p4.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20929d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f43717b, 0, new Class[]{org.telegram.ui.Components.lx0.class}, new String[]{"paintFill"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hj));
        int i10 = org.telegram.ui.ActionBar.t6.f21311y6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f43717b, 0, new Class[]{org.telegram.ui.Components.lx0.class}, new String[]{"calculationgTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21001h5));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Vj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Zj));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ak));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.bk));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.ck));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f43725g0) {
            return super.isLightStatusBar();
        }
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false)) <= 0.721f) {
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
        org.telegram.ui.Components.ku0 ku0Var;
        if (this.M == null || motionEvent == null || (ku0Var = this.f43718b0) == null || !ku0Var.c() || this.f43718b0.j(motionEvent.getX(), motionEvent.getY()) || this.M.getViewPager().f32090b == 0) {
            return true;
        }
        return false;
    }

    public final void n0(s6 s6Var, org.telegram.ui.Components.ix0[] ix0VarArr, sh.b bVar) {
        t6 t6Var;
        HashSet hashSet;
        long j10;
        char c10;
        int i10;
        long j11;
        org.telegram.ui.Components.ix0 ix0Var;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
        x1Var.f21488i0 = false;
        x1Var.r(500L);
        HashSet hashSet2 = new HashSet();
        long j12 = this.G;
        int i11 = 0;
        while (i11 < 8) {
            if ((ix0VarArr != null && ((ix0Var = ix0VarArr[i11]) == null || !ix0Var.f27121c)) || (t6Var = (t6) s6Var.d.get(i11)) == null) {
                hashSet = hashSet2;
            } else {
                hashSet2.addAll(t6Var.f41742b);
                hashSet = hashSet2;
                long j13 = s6Var.f41382c;
                long j14 = t6Var.f41741a;
                s6Var.f41382c = j13 - j14;
                this.G -= j14;
                this.I += j14;
                s6Var.d.delete(i11);
                if (i11 == 0) {
                    this.f43731y -= t6Var.f41741a;
                } else if (i11 == 1) {
                    this.D -= t6Var.f41741a;
                } else if (i11 == 2) {
                    this.f43727r -= t6Var.f41741a;
                } else if (i11 == 3) {
                    this.f43730x -= t6Var.f41741a;
                } else if (i11 == 4) {
                    this.f43728s -= t6Var.f41741a;
                } else if (i11 == 5) {
                    this.F -= t6Var.f41741a;
                } else {
                    char c11 = 7;
                    if (i11 == 7) {
                        int i12 = 0;
                        while (i12 < t6Var.f41742b.size()) {
                            sh.a aVar = (sh.a) t6Var.f41742b.get(i12);
                            String absolutePath = ((sh.a) t6Var.f41742b.get(i12)).f48492a.getAbsolutePath();
                            if (t0(6, absolutePath)) {
                                c10 = c11;
                            } else if (t0(0, absolutePath) || t0(100, absolutePath)) {
                                c10 = 0;
                            } else if (t0(2, absolutePath) || t0(101, absolutePath)) {
                                c10 = 1;
                            } else {
                                c10 = 6;
                            }
                            if (c10 == c11) {
                                i10 = i12;
                                j11 = j12;
                                this.f43729w -= aVar.f48494c;
                            } else {
                                i10 = i12;
                                j11 = j12;
                                if (c10 == 0) {
                                    this.f43731y -= aVar.f48494c;
                                } else if (c10 == 1) {
                                    this.D -= aVar.f48494c;
                                } else {
                                    this.f43723f -= aVar.f48494c;
                                }
                            }
                            i12 = i10 + 1;
                            j12 = j11;
                            c11 = 7;
                        }
                    } else {
                        j10 = j12;
                        this.f43723f -= t6Var.f41741a;
                        i11++;
                        hashSet2 = hashSet;
                        j12 = j10;
                    }
                }
            }
            j10 = j12;
            i11++;
            hashSet2 = hashSet;
            j12 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j15 = j12;
        if (s6Var.d.size() == 0) {
            this.f43721d0.f48498b.remove(s6Var);
        }
        z0(true);
        if (bVar != null) {
            Iterator it = bVar.f48503j.iterator();
            while (it.hasNext()) {
                sh.a aVar2 = (sh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j16 = this.G;
                    long j17 = aVar2.f48494c;
                    this.G = j16 - j17;
                    this.I += j17;
                    hashSet4.add(aVar2);
                    s6Var.b(aVar2);
                    int i13 = aVar2.d;
                    if (i13 == 0) {
                        this.f43731y -= aVar2.f48494c;
                    } else if (i13 == 1) {
                        this.D -= aVar2.f48494c;
                    } else if (i13 == 2) {
                        this.f43727r -= aVar2.f48494c;
                    } else if (i13 == 3) {
                        this.f43730x -= aVar2.f48494c;
                    } else if (i13 == 4) {
                        this.f43728s -= aVar2.f48494c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            sh.a aVar3 = (sh.a) it2.next();
            sh.b bVar2 = this.f43721d0;
            if (bVar2.f48503j.remove(aVar3)) {
                bVar2.f48504k -= aVar3.f48494c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.wb Q = org.telegram.ui.Components.cc.a0(this).Q(2131624050, 36, org.telegram.messenger.cd.a0(null, null, 2131752645, org.telegram.messenger.i0.i0(j15 - this.G, false, false)));
        Q.f32143r = false;
        Q.j();
        ArrayList arrayList = new ArrayList(hashSet5);
        org.telegram.messenger.k8 k8Var = getFileLoader().d;
        k8Var.getClass();
        k8Var.h(new org.telegram.messenger.t6(10, k8Var, arrayList));
        getFileLoader().c();
        getFileLoader().getClass();
        org.telegram.messenger.b8.J.c(new p1(this, arrayList, x1Var, 3));
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        sh.b bVar = this.f43721d0;
        if (bVar != null && !bVar.f48503j.isEmpty()) {
            if (z10) {
                this.f43721d0.d();
                j6 j6Var = this.M;
                if (j6Var != null) {
                    j6Var.f(false);
                    this.M.e();
                }
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f43710h0 = false;
        getNotificationCenter().c(this, org.telegram.messenger.zs.L4);
        this.e = org.telegram.messenger.hs.a0(this.currentAccount).S();
        Utilities.e.c(new b6(this, 2));
        this.f43716a0 = System.currentTimeMillis();
        z0(false);
        x0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.L4);
        try {
            org.telegram.ui.ActionBar.x1 x1Var = this.f43719c;
            if (x1Var != null) {
                x1Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f43719c = null;
        f43710h0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        u0(i11, i13);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.messenger.h9 h9Var;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (h9Var = FilesMigrationService.e) != null) {
                h9Var.I0();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f43715a.f();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.ActionBar.b1 b1Var = this.f43720c0;
            if (b1Var != null) {
                b1Var.setIconColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21153p7, false));
            }
            zu zuVar = this.Z;
            if (zuVar != null) {
                zuVar.v0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21001h5, false));
            }
            try {
                org.telegram.ui.ActionBar.b1 b1Var2 = this.f43720c0;
                if (b1Var2 != null) {
                    b1Var2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21170q7, false));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f43725g0) {
            this.f43725g0 = true;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19681r4, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final void p0(File file, int i10, LongSparseArray longSparseArray, sh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f43710h0) {
                    break;
                }
                if (file2.isDirectory()) {
                    p0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    org.telegram.messenger.j8 e = getFileLoader().d.e(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i11 = i10;
                    } else {
                        i11 = 3;
                    }
                    sh.a aVar = new sh.a(file2);
                    long length = file2.length();
                    aVar.f48494c = length;
                    if (e != null) {
                        aVar.f48493b = e.f16227a;
                        aVar.f48496g = e.f16228b;
                        int i12 = e.f16229c;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j10 = aVar.f48493b;
                    if (j10 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j10, null);
                        if (s6Var == null) {
                            s6Var = new s6(aVar.f48493b);
                            longSparseArray.put(aVar.f48493b, s6Var);
                        }
                        s6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    public final boolean s0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f43724f0;
            if (i11 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i11);
            if (u6Var.f7680a == 11 && !u6Var.f42018i && (i10 = u6Var.f42016f) >= 0) {
                zArr2[i10] = true;
            }
            i11++;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (!zArr2[i12] && !zArr[i12]) {
                return false;
            }
        }
        return true;
    }

    public final void u0(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
        ag.b1 b1Var = this.f43717b;
        if (b1Var != null) {
            int C = org.telegram.messenger.z20.C(48.0f, i10, -org.telegram.messenger.i0.L(8.0f));
            int C2 = org.telegram.messenger.z20.C(48.0f, i11, -org.telegram.messenger.i0.L(8.0f));
            org.telegram.messenger.i0.A3(b1Var, 0, C, 0, C2);
            b1Var.setPadding(0, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + i10) - C, 0, i11 - C2);
            View view = this.O;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = org.telegram.messenger.i0.L(44.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
                this.O.setLayoutParams(layoutParams);
                y0();
            }
            if (this.f43718b0 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43717b.getLayoutParams();
                this.f43718b0.z(-marginLayoutParams.topMargin, -marginLayoutParams.bottomMargin);
                org.telegram.ui.Components.ku0 ku0Var = this.f43718b0;
                ku0Var.B();
                ku0Var.requestLayout();
                ku0Var.invalidate();
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final long v0(int i10) {
        switch (i10) {
            case 0:
                return this.f43731y;
            case 1:
                return this.D;
            case 2:
                return this.f43727r;
            case 3:
                return this.f43730x;
            case 4:
                return this.f43728s;
            case 5:
                return this.f43729w;
            case 6:
                return this.F;
            case 7:
                return this.f43723f;
            case 8:
                return this.f43726n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void w0(View view) {
        int i10;
        int i11;
        int i12;
        boolean s02 = s0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f43724f0;
        if (s02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var = (u6) arrayList.get(i13);
                if (u6Var.f7680a != 11 || u6Var.f42018i || (i12 = u6Var.f42016f) < 0 || !zArr[i12]) {
                }
            }
            org.telegram.messenger.t2.APP_ERROR.a();
            if (view != null) {
                org.telegram.messenger.i0.F3(-3.0f, view, null);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                u6 u6Var2 = (u6) arrayList.get(i14);
                if (u6Var2.f7680a == 11 && !u6Var2.f42018i && (i11 = u6Var2.f42016f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !s02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                u6 u6Var3 = (u6) arrayList.get(i16);
                if (u6Var3.f7680a == 11 && u6Var3.f42018i && (i10 = u6Var3.f42016f) >= 0) {
                    zArr[i10] = !s02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f43717b.getChildCount(); i17++) {
            View childAt = this.f43717b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.c2) {
                this.f43717b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.f7680a == 11) {
                        int i18 = u6Var4.f42016f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.c2) childAt).c(!s02, true);
                        } else {
                            ((org.telegram.ui.Cells.c2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        x0();
    }

    public final void x0() {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        v6 v6Var = this.W;
        long j19 = 0;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.hc[] hcVarArr = new org.telegram.ui.Components.hc[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f43724f0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i10);
                    if (u6Var.f7680a == 11) {
                        int i11 = u6Var.f42016f;
                        boolean[] zArr = this.d;
                        if (i11 < 0) {
                            if (this.L) {
                                long j20 = u6Var.f42017g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f26694c = j20;
                                obj.f26693b = z12;
                                hcVarArr[10] = obj;
                            }
                        } else {
                            long j21 = u6Var.f42017g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f26694c = j21;
                            obj2.f26693b = z13;
                            hcVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.f43716a0 < 80) {
                    this.W.f26959n.e(true, 0.0f);
                }
                this.W.f(this.G, true, hcVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.hc[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.hc[0]);
            }
        }
        q6 q6Var = this.Y;
        if (q6Var != null && !this.K) {
            y6 y6Var = q6Var.d;
            boolean[] zArr2 = y6Var.d;
            if (zArr2[0]) {
                j10 = y6Var.f43731y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = y6Var.D;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = y6Var.f43727r;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = y6Var.f43730x;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = y6Var.f43728s;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = y6Var.f43729w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = y6Var.F;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = y6Var.f43723f;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = y6Var.f43726n;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = y6Var.E;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = y6Var.f43724f0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    u6 u6Var2 = (u6) arrayList2.get(i12);
                    if (u6Var2.f7680a == 11) {
                        int i13 = u6Var2.f42016f;
                        if (i13 < 0) {
                            i13 = zArr2.length - 1;
                        }
                        if (!zArr2[i13]) {
                            break;
                        }
                    }
                    i12++;
                } else {
                    z10 = true;
                    break;
                }
            }
            q6Var.a(j30, z10);
        }
    }

    public final void y0() {
        float f7;
        View view = this.O;
        if (view == null) {
            return;
        }
        fe.b bVar = this.S;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        fe.b bVar2 = this.T;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - ((1.0f - f10) * org.telegram.messenger.i0.L(44.0f)));
    }

    public final void z0(boolean z10) {
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        float[] fArr;
        sh.b bVar;
        org.telegram.ui.Components.ku0 ku0Var = this.f43718b0;
        if (ku0Var != null && ku0Var.f27914e0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && System.currentTimeMillis() - this.f43716a0 < 80) {
            z12 = false;
        } else {
            z12 = z10;
        }
        ArrayList arrayList = this.f43722e0;
        arrayList.clear();
        ArrayList arrayList2 = this.f43724f0;
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
            z13 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f43731y > 0) {
                arrayList3.add(u6.b(0, this.f43731y, org.telegram.messenger.cd.L0(2131748773, null), org.telegram.ui.ActionBar.t6.Zj));
            }
            if (this.D > 0) {
                arrayList3.add(u6.b(1, this.D, org.telegram.messenger.cd.L0(2131748769, null), org.telegram.ui.ActionBar.t6.Vj));
            }
            if (this.f43727r > 0) {
                arrayList3.add(u6.b(2, this.f43727r, org.telegram.messenger.cd.L0(2131748778, null), org.telegram.ui.ActionBar.t6.Wj));
            }
            if (this.f43730x > 0) {
                j10 = 0;
                arrayList3.add(u6.b(3, this.f43730x, org.telegram.messenger.cd.L0(2131748775, null), org.telegram.ui.ActionBar.t6.dk));
            } else {
                j10 = 0;
            }
            if (this.f43728s > j10) {
                arrayList3.add(u6.b(4, this.f43728s, org.telegram.messenger.cd.L0(2131748785, null), org.telegram.ui.ActionBar.t6.ak));
            }
            if (this.f43729w > j10) {
                arrayList3.add(u6.b(5, this.f43729w, org.telegram.messenger.cd.L0(2131748770, null), org.telegram.ui.ActionBar.t6.Xj));
            }
            if (this.F > j10) {
                arrayList3.add(u6.b(6, this.F, org.telegram.messenger.cd.L0(2131748771, null), org.telegram.ui.ActionBar.t6.bk));
            }
            if (this.f43723f > j10) {
                arrayList3.add(u6.b(7, this.f43723f, org.telegram.messenger.cd.L0(2131748772, null), org.telegram.ui.ActionBar.t6.ek));
            }
            if (this.f43726n > j10) {
                arrayList3.add(u6.b(8, this.f43726n, org.telegram.messenger.cd.L0(2131748776, null), org.telegram.ui.ActionBar.t6.dk));
            }
            if (this.E > j10) {
                arrayList3.add(u6.b(9, this.E, org.telegram.messenger.cd.L0(2131748777, null), org.telegram.ui.ActionBar.t6.Yj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new f6(0));
                ((u6) arrayList3.get(arrayList3.size() - 1)).f42019j = true;
                if (this.V == null) {
                    this.V = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.V;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) v0(i10);
                    i10++;
                }
                if (this.U == null) {
                    this.U = new int[11];
                }
                org.telegram.messenger.i0.e3(fArr, this.U);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    int i11 = 0;
                    long j11 = j10;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((u6) arrayList3.get(i12)).f42018i = true;
                        j11 += ((u6) arrayList3.get(i12)).f42017g;
                        i11 += this.U[((u6) arrayList3.get(i12)).f42016f];
                    }
                    this.U[10] = i11;
                    arrayList2.add(u6.b(-1, j11, org.telegram.messenger.cd.L0(2131748774, null), org.telegram.ui.ActionBar.t6.Yj));
                    if (!this.L) {
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
            String L0 = org.telegram.messenger.cd.L0(2131744832, null);
            u6 u6Var = new u6(1);
            u6Var.e = L0;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, org.telegram.messenger.cd.L0(2131753867, null)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String L02 = org.telegram.messenger.cd.L0(2131749068, null);
        u6 u6Var2 = new u6(1);
        u6Var2.e = L02;
        arrayList2.add(u6Var2);
        if (this.H > j10) {
            arrayList2.add(new u6(3, org.telegram.messenger.cd.L0(2131748685, null)));
            arrayList2.add(new u6(14));
            String L03 = org.telegram.messenger.cd.L0(2131748684, null);
            u6 u6Var3 = new u6(1);
            u6Var3.e = L03;
            arrayList2.add(u6Var3);
        }
        this.R = -1;
        if (z13 && (bVar = this.f43721d0) != null && !bVar.h()) {
            this.R = arrayList2.size();
            arrayList2.add(new u6(8, (String) null));
        }
        w6 w6Var = this.f43715a;
        if (w6Var != null) {
            if (z12) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.f();
            }
        }
        j6 j6Var = this.M;
        if (j6Var != null) {
            j6Var.d();
        }
        org.telegram.ui.Components.ku0 ku0Var2 = this.f43718b0;
        if (ku0Var2 != null) {
            if (z11 && this.R != -1) {
                ku0Var2.a();
            }
            org.telegram.ui.Components.ku0 ku0Var3 = this.f43718b0;
            ku0Var3.B();
            ku0Var3.requestLayout();
            ku0Var3.invalidate();
        }
    }
}
