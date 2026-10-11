package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilePathDatabase;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class x6 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f44003k0 = false;
    public static long f44004l0;
    public static Long m0;
    public static Long f44005n0;
    public static Long f44006o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public u6 N;
    public int[] O;
    public float[] P;
    public t6 Q;
    public i6 R;
    public n6 S;
    public hv T;
    public long U;
    public f6 V;
    public org.telegram.ui.ActionBar.e1 W;
    public org.telegram.ui.ActionBar.e1 X;
    public zh.b Y;
    public final ArrayList Z;
    public v6 f44007a;
    public final ArrayList f44008a0;
    public ai.w0 f44009b;
    public boolean f44010b0;
    public s4.d0 f44011c;
    public org.telegram.ui.ActionBar.y f44012c0;
    public org.telegram.ui.ActionBar.a2 d;
    public org.telegram.ui.Components.r6 f44013d0;
    public final boolean[] f44014e;
    public org.telegram.ui.Components.r6 f44015e0;
    public long f44016f;
    public TextView f44017f0;
    public ValueAnimator f44018g0;
    public long h;
    public float f44019h0;
    public boolean f44020i0;
    public float f44021j0;
    public long f44022n;
    public long f44023r;
    public long f44024s;
    public long v;
    public long f44025w;
    public long f44026x;
    public long f44027y;

    public x6() {
        super(null);
        this.f44014e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f44016f = -1L;
        this.h = -1L;
        this.f44022n = -1L;
        this.f44023r = -1L;
        this.f44024s = -1L;
        this.v = -1L;
        this.f44025w = -1L;
        this.f44026x = -1L;
        this.f44027y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.L = true;
        this.M = true;
        this.Z = new ArrayList();
        this.f44008a0 = new ArrayList();
        this.f44021j0 = 1.0f;
    }

    public static void U(x6 x6Var, boolean z10, long j3, l6 l6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.a2 a2Var = x6Var.d;
            if (a2Var != null) {
                a2Var.dismiss();
                x6Var.d = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        x6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(x6Var, j3, 20), 150L);
        MediaDataController.getInstance(x6Var.currentAccount).checkAllMedia(true);
        x6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new b6(x6Var, 1));
        l6Var.run();
    }

    public static void V(x6 x6Var, boolean z10) {
        if (x6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(x6Var.getParentActivity(), 3, null);
        x6Var.d = a2Var;
        a2Var.f20426g0 = false;
        a2Var.q(500L);
        MessagesController.getInstance(x6Var.currentAccount).clearQueryTime();
        if (z10) {
            x6Var.getMessagesStorage().fullReset();
        } else {
            x6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.x6 r22, org.telegram.ui.k6 r23, org.telegram.ui.l6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x6.W(org.telegram.ui.x6, org.telegram.ui.k6, org.telegram.ui.l6):void");
    }

    public static void X(x6 x6Var, ValueAnimator valueAnimator) {
        x6Var.f44019h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false), (int) (x6Var.f44019h0 * 255.0f)));
        x6Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false), (int) (x6Var.f44019h0 * 255.0f)));
        x6Var.fragmentView.invalidate();
    }

    public static void Y(x6 x6Var, org.telegram.ui.ActionBar.a2 a2Var) {
        FileLoader.getInstance(x6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            a2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(x6 x6Var) {
        return x6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(x6 x6Var) {
        return x6Var.actionBar;
    }

    public static void b0(x6 x6Var, boolean z10) {
        float f7;
        if (z10 != x6Var.f44020i0) {
            ValueAnimator valueAnimator = x6Var.f44018g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = x6Var.f44019h0;
            x6Var.f44020i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            x6Var.f44018g0 = ofFloat;
            ofFloat.addUpdateListener(new b3(x6Var, 2));
            x6Var.f44018g0.setInterpolator(org.telegram.ui.Components.is.h);
            x6Var.f44018g0.setDuration(380L);
            x6Var.f44018g0.start();
        }
    }

    public static String c0(x6 x6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k d0(x6 x6Var) {
        return x6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(x6 x6Var) {
        return x6Var.actionBar;
    }

    public static void f0(x6 x6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
        a2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(x6Var.f44016f))));
        a2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(5, x6Var, z10));
        x6Var.showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
        }
    }

    public static void g0(x6 x6Var) {
        String formatPluralString;
        if (x6Var.Y.f54828j.size() > 0) {
            if (x6Var.N != null) {
                if (!x6Var.Y.f54830l.isEmpty()) {
                    ArrayList arrayList = x6Var.Y.f54822b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        q6 q6Var = (q6) obj;
                        if (x6Var.Y.f54830l.contains(Long.valueOf(q6Var.f41080a))) {
                            i10 += q6Var.f41081b;
                        }
                    }
                    int size2 = x6Var.Y.f54828j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a1.g.D(LocaleController.formatPluralString("Chats", x6Var.Y.f54830l.size(), Integer.valueOf(x6Var.Y.f54830l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", x6Var.Y.f54830l.size(), Integer.valueOf(x6Var.Y.f54830l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", x6Var.Y.f54828j.size(), Integer.valueOf(x6Var.Y.f54828j.size()));
                }
                x6Var.f44013d0.c(AndroidUtilities.formatFileSize(x6Var.Y.f54829k), !LocaleController.isRTL, true);
                x6Var.f44015e0.c(formatPluralString, !LocaleController.isRTL, true);
                x6Var.N.e(true);
                return;
            }
            return;
        }
        x6Var.N.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f44004l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new mu0(callback, 15));
    }

    public static void k0(String str, int i10, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int n02 = n0(i10, str);
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
                            k0(a1.g.D(str, "/", name), i10, iArr, callback);
                        }
                    } else {
                        file2.delete();
                        int i11 = iArr[0] + 1;
                        iArr[0] = i11;
                        if (callback != null) {
                            callback.run(Float.valueOf(i11 / n02));
                        }
                    }
                }
            }
        }
    }

    public static int n0(int i10, String str) {
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
                    i11 += n0(i10, str + "/" + name);
                } else {
                    i11++;
                }
            }
        }
        return i11;
    }

    public static void p0(a5 a5Var) {
        Long l4;
        Long l10 = f44005n0;
        if (l10 != null && (l4 = f44006o0) != null) {
            a5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new mu0(a5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f44003k0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i10, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean s0(int i10, String str) {
        if (str != null && FileLoader.checkDirectory(i10) != null) {
            return str.contains(FileLoader.checkDirectory(i10).getAbsolutePath());
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.h6.x0(null, i10, false), 0));
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913i6, false), false);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 22));
        this.f44012c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44012c0.addView(frameLayout, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f44013d0 = r6Var;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        r6Var.b(0.35f, 350L, isVar);
        this.f44013d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f44013d0.setTypeface(AndroidUtilities.bold());
        this.f44013d0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        frameLayout.addView(this.f44013d0, w7.x5.a(18.0f, 0.0f, -11.0f, 18.0f, 0.0f, -1, 19));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, true, true, true);
        this.f44015e0 = r6Var2;
        r6Var2.b(0.35f, 350L, isVar);
        this.f44015e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f44015e0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21207y6, false));
        frameLayout.addView(this.f44015e0, w7.x5.a(18.0f, 0.0f, 10.0f, 18.0f, 0.0f, -1, 19));
        TextView textView = new TextView(context);
        this.f44017f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f44017f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f44017f0.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.f44017f0.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.h6.Oh));
        this.f44017f0.setTypeface(AndroidUtilities.bold());
        this.f44017f0.setGravity(17);
        this.f44017f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f44017f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f44017f0, w7.x5.a(28.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 19));
        } else {
            frameLayout.addView(this.f44017f0, w7.x5.a(28.0f, 0.0f, 0.0f, 14.0f, 0.0f, -2, 21));
        }
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.o().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.e1 e7 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e7;
        int i11 = org.telegram.ui.ActionBar.h6.f21043p7;
        e7.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        org.telegram.ui.ActionBar.e1 e1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.h6.f21062q7;
        e1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.e1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.h6.m1(0.12f, org.telegram.ui.ActionBar.h6.x0(null, i11, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f44007a = new v6(this, context);
        f6 f6Var = new f6(this, context);
        this.V = f6Var;
        this.fragmentView = f6Var;
        f6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 5);
        this.f44009b = w0Var;
        w0Var.p1();
        this.f44009b.setVerticalScrollBarEnabled(false);
        this.f44009b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f44009b.setClipToPadding(false);
        ai.w0 w0Var2 = this.f44009b;
        s4.d0 d0Var = new s4.d0(1, false);
        this.f44011c = d0Var;
        w0Var2.setLayoutManager(d0Var);
        f6Var.addView(this.f44009b, w7.x5.d(-1.0f, -1));
        this.f44009b.setAdapter(this.f44007a);
        g6 g6Var = new g6(this);
        g6Var.n(350L);
        g6Var.o(isVar);
        g6Var.C = false;
        g6Var.f47822m = false;
        this.f44009b.setItemAnimator(g6Var);
        this.f44009b.setOnItemClickListener(new a6(this));
        this.f44009b.j(new ci.s9(this, 1));
        f6Var.addView(this.actionBar, w7.x5.d(-2.0f, -1));
        this.V.setTargetListView(this.f44009b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.a2 a2Var = this.d;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.d = null;
            if (this.f44007a != null) {
                this.f44016f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.W != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.W.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Components.xw0.class, org.telegram.ui.Components.hz0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20822d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20766a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21101s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21156v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20913i6));
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.hz0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.hz0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Vi));
        int i12 = org.telegram.ui.ActionBar.h6.f21207y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.hz0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.hz0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.hz0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.xw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.xw0.class}, null, null, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44009b, 0, new Class[]{org.telegram.ui.Components.xw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.h6.f20944k0, null, null, org.telegram.ui.ActionBar.h6.f20823d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Components.fz0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20893h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f44010b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false)) <= 0.721f) {
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
        u6 u6Var = this.N;
        if (u6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            u6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.h.f29796b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(q6 q6Var, org.telegram.ui.Components.ez0[] ez0VarArr, zh.b bVar) {
        r6 r6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.ez0 ez0Var;
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, null);
        a2Var.f20426g0 = false;
        a2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((ez0VarArr != null && ((ez0Var = ez0VarArr[i10]) == null || !ez0Var.f26254c)) || (r6Var = (r6) q6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = r6Var.f41371b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = q6Var.f41082c;
                j3 = j10;
                long j12 = r6Var.f41370a;
                q6Var.f41082c = j11 - j12;
                this.H -= j12;
                this.J += j12;
                q6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f44027y -= r6Var.f41370a;
                } else if (i10 == 1) {
                    this.E -= r6Var.f41370a;
                } else if (i10 == 2) {
                    this.f44024s -= r6Var.f41370a;
                } else if (i10 == 3) {
                    this.f44026x -= r6Var.f41370a;
                } else if (i10 == 4) {
                    this.v -= r6Var.f41370a;
                } else if (i10 == 5) {
                    this.G -= r6Var.f41370a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).f54815a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f44025w -= aVar.f54817c;
                        } else if (c10 == 0) {
                            this.f44027y -= aVar.f54817c;
                        } else if (c10 == 1) {
                            this.E -= aVar.f54817c;
                        } else {
                            this.h -= aVar.f54817c;
                        }
                    }
                } else {
                    this.h -= r6Var.f41370a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (q6Var.d.size() == 0) {
            this.Y.f54822b.remove(q6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.f54828j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.H;
                    long j15 = aVar2.f54817c;
                    this.H = j14 - j15;
                    this.J += j15;
                    hashSet4.add(aVar2);
                    q6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f44027y -= aVar2.f54817c;
                    } else if (i12 == 1) {
                        this.E -= aVar2.f54817c;
                    } else if (i12 == 2) {
                        this.f44024s -= aVar2.f54817c;
                    } else if (i12 == 3) {
                        this.f44026x -= aVar2.f54817c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.f54817c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.Y;
            if (bVar2.f54828j.remove(aVar3)) {
                bVar2.f54829k -= aVar3.f54817c;
            }
            ArrayList e7 = bVar2.e(aVar3.d);
            if (e7 != null) {
                e7.remove(aVar3);
            }
        }
        org.telegram.ui.Components.sc Q = org.telegram.ui.Components.ad.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.H)));
        Q.f30841r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new q1(this, arrayList2, a2Var, 3));
    }

    public final void m0() {
        if (this.Y.f54828j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new a6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            showDialog(a2Var);
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21062q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, zh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f44003k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i11 = i10;
                    } else {
                        i11 = 3;
                    }
                    zh.a aVar = new zh.a(file2);
                    long length = file2.length();
                    aVar.f54817c = length;
                    if (fileDialogId != null) {
                        aVar.f54816b = fileDialogId.dialogId;
                        aVar.f54820g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f54816b;
                    if (j3 != 0) {
                        q6 q6Var = (q6) longSparseArray.get(j3, null);
                        if (q6Var == null) {
                            q6Var = new q6(aVar.f54816b);
                            longSparseArray.put(aVar.f54816b, q6Var);
                        }
                        q6Var.a(aVar, i11);
                    }
                    if (i11 != 6) {
                        bVar.e(i11).add(aVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        zh.b bVar = this.Y;
        if (bVar != null && !bVar.f54828j.isEmpty()) {
            if (z10) {
                this.Y.d();
                u6 u6Var = this.N;
                if (u6Var != null) {
                    u6Var.e(false);
                    this.N.d();
                }
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f44003k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f44016f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new b6(this, 2));
        this.U = System.currentTimeMillis();
        w0(false);
        v0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.a2 a2Var = this.d;
            if (a2Var != null) {
                a2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f44003k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f44009b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f44009b.setClipToPadding(false);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i10 == 4) {
            for (int i11 : iArr) {
                if (i11 != 0) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 30 && (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) != null) {
                filesMigrationBottomSheet.migrateOldFolder();
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f44007a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f44010b0) {
            this.f44010b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.f44014e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f44008a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            s6 s6Var = (s6) arrayList.get(i11);
            if (s6Var.f17211a == 11 && !s6Var.f41630i && (i10 = s6Var.f41628f) >= 0) {
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

    public final long t0(int i10) {
        switch (i10) {
            case 0:
                return this.f44027y;
            case 1:
                return this.E;
            case 2:
                return this.f44024s;
            case 3:
                return this.f44026x;
            case 4:
                return this.v;
            case 5:
                return this.f44025w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f44023r;
            case 9:
                return this.F;
            default:
                return 0L;
        }
    }

    public final void u0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.f44014e;
        ArrayList arrayList = this.f44008a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                s6 s6Var = (s6) arrayList.get(i13);
                if (s6Var.f17211a != 11 || s6Var.f41630i || (i12 = s6Var.f41628f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.M) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                s6 s6Var2 = (s6) arrayList.get(i14);
                if (s6Var2.f17211a == 11 && !s6Var2.f41630i && (i11 = s6Var2.f41628f) >= 0) {
                    zArr2[i11] = true;
                }
            }
            for (int i15 = 0; i15 < length; i15++) {
                if (!zArr2[i15]) {
                    zArr[i15] = !r02;
                }
            }
        } else {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                s6 s6Var3 = (s6) arrayList.get(i16);
                if (s6Var3.f17211a == 11 && s6Var3.f41630i && (i10 = s6Var3.f41628f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f44009b.getChildCount(); i17++) {
            View childAt = this.f44009b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f44009b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    s6 s6Var4 = (s6) arrayList.get(R);
                    if (s6Var4.f17211a == 11) {
                        int i18 = s6Var4.f41628f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        t6 t6Var = this.Q;
        long j18 = 0;
        boolean z10 = false;
        if (t6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.fd[] fdVarArr = new org.telegram.ui.Components.fd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f44008a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    s6 s6Var = (s6) arrayList.get(i10);
                    if (s6Var.f17211a == 11) {
                        int i11 = s6Var.f41628f;
                        boolean[] zArr = this.f44014e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j19 = s6Var.f41629g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f26438c = j19;
                                obj.f26437b = z12;
                                fdVarArr[10] = obj;
                            }
                        } else {
                            long j20 = s6Var.f41629g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f26438c = j20;
                            obj2.f26437b = z13;
                            fdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f26728n.d(0.0f, true);
                }
                this.Q.f(this.H, true, fdVarArr);
            } else if (z11) {
                t6Var.f(-1L, true, new org.telegram.ui.Components.fd[0]);
            } else {
                t6Var.f(0L, true, new org.telegram.ui.Components.fd[0]);
            }
        }
        n6 n6Var = this.S;
        if (n6Var != null && !this.L) {
            x6 x6Var = n6Var.d;
            boolean[] zArr2 = x6Var.f44014e;
            if (zArr2[0]) {
                j3 = x6Var.f44027y;
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
                j11 = x6Var.f44024s;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = x6Var.f44026x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = x6Var.v;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = x6Var.f44025w;
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
                j16 = x6Var.h;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = x6Var.f44023r;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = x6Var.F;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = x6Var.f44008a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    s6 s6Var2 = (s6) arrayList2.get(i12);
                    if (s6Var2.f17211a == 11) {
                        int i13 = s6Var2.f41628f;
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
            n6Var.a(j29, z10);
        }
    }

    public final void w0(boolean z10) {
        boolean z11;
        char c10;
        long j3;
        boolean z12;
        float[] fArr;
        zh.b bVar;
        if (z10 && System.currentTimeMillis() - this.U < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f44008a0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new s6(9, (String) null));
        arrayList2.add(new s6(10, (String) null));
        arrayList2.size();
        if (this.L) {
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f44027y > 0) {
                c10 = '\n';
                arrayList3.add(s6.b(0, this.f44027y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.h6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(s6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.h6.hj));
            }
            if (this.f44024s > 0) {
                arrayList3.add(s6.b(2, this.f44024s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.h6.ij));
            }
            if (this.f44026x > 0) {
                arrayList3.add(s6.b(3, this.f44026x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.v > 0) {
                j3 = 0;
                arrayList3.add(s6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.h6.mj));
            } else {
                j3 = 0;
            }
            if (this.f44025w > j3) {
                arrayList3.add(s6.b(5, this.f44025w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.h6.jj));
            }
            if (this.G > j3) {
                arrayList3.add(s6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.h6.nj));
            }
            if (this.h > j3) {
                arrayList3.add(s6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.h6.qj));
            }
            if (this.f44023r > j3) {
                arrayList3.add(s6.b(8, this.f44023r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.h6.pj));
            }
            if (this.F > j3) {
                arrayList3.add(s6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.h6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new a4.d(28));
                ((s6) arrayList3.get(arrayList3.size() - 1)).f41631j = true;
                if (this.P == null) {
                    this.P = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.P;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) t0(i10);
                    i10++;
                }
                if (this.O == null) {
                    this.O = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.O);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    int i11 = 0;
                    long j10 = j3;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((s6) arrayList3.get(i12)).f41630i = true;
                        j10 += ((s6) arrayList3.get(i12)).f41629g;
                        i11 += this.O[((s6) arrayList3.get(i12)).f41628f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(s6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.h6.kj));
                    if (!this.M) {
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
            arrayList2.add(new s6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            s6 s6Var = new s6(1);
            s6Var.f41627e = string;
            arrayList2.add(s6Var);
        }
        arrayList2.add(new s6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new s6(0, 0));
        arrayList2.add(new s6(1, 0));
        arrayList2.add(new s6(2, 0));
        arrayList2.add(new s6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        s6 s6Var2 = new s6(1);
        s6Var2.f41627e = string2;
        arrayList2.add(s6Var2);
        if (this.I > j3) {
            arrayList2.add(new s6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new s6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            s6 s6Var3 = new s6(1);
            s6Var3.f41627e = string3;
            arrayList2.add(s6Var3);
        }
        if (z12 && (bVar = this.Y) != null && !bVar.h()) {
            arrayList2.add(new s6(8, (String) null));
        }
        v6 v6Var = this.f44007a;
        if (v6Var != null) {
            if (z11) {
                v6Var.E(arrayList, arrayList2);
            } else {
                v6Var.l();
            }
        }
        u6 u6Var = this.N;
        if (u6Var != null) {
            u6Var.c();
        }
    }
}
