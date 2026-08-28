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
public final class y6 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f44731g0 = false;
    public static long f44732h0;
    public static Long f44733i0;
    public static Long f44734j0;
    public static Long f44735k0;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public final long G;
    public boolean H;
    public boolean I;
    public v6 J;
    public int[] K;
    public float[] L;
    public u6 M;
    public i6 N;
    public o6 O;
    public xu P;
    public long Q;
    public f6 R;
    public org.telegram.ui.ActionBar.g1 S;
    public org.telegram.ui.ActionBar.g1 T;
    public hh.b U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public org.telegram.ui.ActionBar.z Y;
    public org.telegram.ui.Components.j6 Z;
    public w6 f44736a;
    public org.telegram.ui.Components.j6 f44737a0;
    public gh.f1 f44738b;
    public TextView f44739b0;
    public f2.m0 f44740c;
    public ValueAnimator f44741c0;
    public org.telegram.ui.ActionBar.c2 d;
    public float f44742d0;
    public final boolean[] f44743e;
    public boolean f44744e0;
    public long f44745f;
    public float f44746f0;
    public long h;
    public long f44747n;
    public long f44748r;
    public long f44749s;
    public long v;
    public long f44750w;
    public long f44751x;
    public long f44752y;

    public y6() {
        super(null);
        this.f44743e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f44745f = -1L;
        this.h = -1L;
        this.f44747n = -1L;
        this.f44748r = -1L;
        this.f44749s = -1L;
        this.v = -1L;
        this.f44750w = -1L;
        this.f44751x = -1L;
        this.f44752y = -1L;
        this.A = -1L;
        this.B = -1L;
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = true;
        this.I = true;
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.f44746f0 = 1.0f;
    }

    public static void T(y6 y6Var, boolean z10, long j10, m6 m6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.c2 c2Var = y6Var.d;
            if (c2Var != null) {
                c2Var.dismiss();
                y6Var.d = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        y6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bg.i2(y6Var, j10, 21), 150L);
        MediaDataController.getInstance(y6Var.currentAccount).checkAllMedia(true);
        y6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new b6(y6Var, 1));
        m6Var.run();
    }

    public static void U(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(y6Var.getParentActivity(), 3, null);
        y6Var.d = c2Var;
        c2Var.f22766c0 = false;
        c2Var.q(500L);
        MessagesController.getInstance(y6Var.currentAccount).clearQueryTime();
        if (z10) {
            y6Var.getMessagesStorage().fullReset();
        } else {
            y6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void V(org.telegram.ui.y6 r22, org.telegram.ui.l6 r23, org.telegram.ui.m6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y6.V(org.telegram.ui.y6, org.telegram.ui.l6, org.telegram.ui.m6):void");
    }

    public static void W(y6 y6Var, ValueAnimator valueAnimator) {
        y6Var.f44742d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), (int) (y6Var.f44742d0 * 255.0f)));
        y6Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false), (int) (y6Var.f44742d0 * 255.0f)));
        y6Var.fragmentView.invalidate();
    }

    public static void X(y6 y6Var, org.telegram.ui.ActionBar.c2 c2Var) {
        FileLoader.getInstance(y6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static org.telegram.ui.ActionBar.k Y(y6 y6Var) {
        return y6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k Z(y6 y6Var) {
        return y6Var.actionBar;
    }

    public static void a0(y6 y6Var, boolean z10) {
        float f10;
        if (z10 != y6Var.f44744e0) {
            ValueAnimator valueAnimator = y6Var.f44741c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f11 = y6Var.f44742d0;
            y6Var.f44744e0 = z10;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            y6Var.f44741c0 = ofFloat;
            ofFloat.addUpdateListener(new f3(y6Var, 2));
            y6Var.f44741c0.setInterpolator(org.telegram.ui.Components.gr.h);
            y6Var.f44741c0.setDuration(380L);
            y6Var.f44741c0.start();
        }
    }

    public static String b0(y6 y6Var, float f10) {
        if (f10 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f10 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void e0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(y6Var.f44745f))));
        c2Var.P = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new dh.s(2, y6Var, z10));
        y6Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
        }
    }

    public static void f0(y6 y6Var) {
        String formatPluralString;
        if (y6Var.U.f10793j.size() > 0) {
            if (y6Var.J != null) {
                if (!y6Var.U.f10795l.isEmpty()) {
                    ArrayList arrayList = y6Var.U.f10787b;
                    int size = arrayList.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        r6 r6Var = (r6) obj;
                        if (y6Var.U.f10795l.contains(Long.valueOf(r6Var.f42274a))) {
                            i9 += r6Var.f42275b;
                        }
                    }
                    int size2 = y6Var.U.f10793j.size() - i9;
                    if (size2 > 0) {
                        formatPluralString = aa.d.z(LocaleController.formatPluralString("Chats", y6Var.U.f10795l.size(), Integer.valueOf(y6Var.U.f10795l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", y6Var.U.f10795l.size(), Integer.valueOf(y6Var.U.f10795l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", y6Var.U.f10793j.size(), Integer.valueOf(y6Var.U.f10793j.size()));
                }
                y6Var.Z.c(AndroidUtilities.formatFileSize(y6Var.U.f10794k), !LocaleController.isRTL, true);
                y6Var.f44737a0.c(formatPluralString, !LocaleController.isRTL, true);
                y6Var.J.e(true);
                return;
            }
            return;
        }
        y6Var.J.e(false);
    }

    public static void i0(Utilities.Callback callback) {
        Long l10 = f44733i0;
        if (l10 != null) {
            callback.run(l10);
            if (System.currentTimeMillis() - f44732h0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new kt0(callback, 15));
    }

    public static void j0(String str, int i9, int[] iArr, Utilities.Callback callback) {
        File[] listFiles;
        boolean z10;
        boolean z11;
        boolean z12;
        int m0 = m0(i9, str);
        if (iArr == null) {
            iArr = new int[]{0};
        }
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                if (!".".equals(name)) {
                    if (i9 > 0 && name.length() >= 4) {
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
                            if (i9 == 1) {
                            }
                        }
                        if (!z10) {
                            if (i9 == 2) {
                            }
                        }
                        if (z11) {
                            if (i9 == 5) {
                            }
                        }
                        if (!z11) {
                            if (i9 == 3) {
                            }
                        }
                        if (z12) {
                            if (i9 == 5) {
                            }
                        }
                        if (!z12 && i9 == 4) {
                        }
                    }
                    if (file2.isDirectory()) {
                        if (!"drafts".equals(file2.getName())) {
                            j0(aa.d.z(str, "/", name), i9, iArr, callback);
                        }
                    } else {
                        file2.delete();
                        int i10 = iArr[0] + 1;
                        iArr[0] = i10;
                        if (callback != null) {
                            callback.run(Float.valueOf(i10 / m0));
                        }
                    }
                }
            }
        }
    }

    public static int m0(int i9, String str) {
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
                if (i9 > 0 && name.length() >= 4) {
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
                        if (i9 == 1) {
                        }
                    }
                    if (!z10) {
                        if (i9 == 2) {
                        }
                    }
                    if (z11) {
                        if (i9 == 5) {
                        }
                    }
                    if (!z11) {
                        if (i9 == 3) {
                        }
                    }
                    if (z12) {
                        if (i9 == 5) {
                        }
                    }
                    if (!z12 && i9 == 4) {
                    }
                }
                if (file2.isDirectory()) {
                    i10 += m0(i9, str + "/" + name);
                } else {
                    i10++;
                }
            }
        }
        return i10;
    }

    public static void o0(a5 a5Var) {
        Long l10;
        Long l11 = f44734j0;
        if (l11 != null && (l10 = f44735k0) != null) {
            a5Var.run(l11, l10);
        } else {
            Utilities.cacheClearQueue.postRunnable(new kt0(a5Var, 14));
        }
    }

    public static long p0(int i9, File file) {
        if (file != null && !f44731g0) {
            if (file.isDirectory()) {
                return Utilities.getDirSize(file.getAbsolutePath(), i9, false);
            }
            if (file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    public static boolean r0(int i9, String str) {
        if (str != null && FileLoader.checkDirectory(i9) != null) {
            return str.contains(FileLoader.checkDirectory(i9).getAbsolutePath());
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
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), false);
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 17));
        this.Y = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y.addView(frameLayout, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.Z = j6Var;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        j6Var.b(0.35f, 350L, grVar);
        this.Z.setTextSize(AndroidUtilities.dp(18.0f));
        this.Z.setTypeface(AndroidUtilities.bold());
        this.Z.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        frameLayout.addView(this.Z, g7.e6.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.f44737a0 = j6Var2;
        j6Var2.b(0.35f, 350L, grVar);
        this.f44737a0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f44737a0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
        frameLayout.addView(this.f44737a0, g7.e6.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44739b0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f44739b0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f44739b0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        this.f44739b0.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.f6.Oh));
        this.f44739b0.setTypeface(AndroidUtilities.bold());
        this.f44739b0.setGravity(17);
        this.f44739b0.setText(LocaleController.getString(R.string.CacheClear));
        this.f44739b0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f44739b0, g7.e6.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f44739b0, g7.e6.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e10 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.S = e10;
        int i10 = org.telegram.ui.ActionBar.f6.f23212p7;
        e10.setIconColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.S;
        int i11 = org.telegram.ui.ActionBar.f6.f23230q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
        this.S.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e11 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.T = e11;
            e11.setIconColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            this.T.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
            this.T.setSelectorColor(org.telegram.ui.ActionBar.f6.l1(0.12f, org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        }
        if (this.S != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.S.setText(spannableStringBuilder);
        }
        this.f44736a = new w6(this, context);
        f6 f6Var = new f6(this, context);
        this.R = f6Var;
        this.fragmentView = f6Var;
        f6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        gh.f1 f1Var = new gh.f1(this, context, 5);
        this.f44738b = f1Var;
        f1Var.p1();
        this.f44738b.setVerticalScrollBarEnabled(false);
        this.f44738b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f44738b.setClipToPadding(false);
        gh.f1 f1Var2 = this.f44738b;
        f2.m0 m0Var = new f2.m0(1, false);
        this.f44740c = m0Var;
        f1Var2.setLayoutManager(m0Var);
        f6Var.addView(this.f44738b, g7.e6.c(-1.0f, -1));
        this.f44738b.setAdapter(this.f44736a);
        g6 g6Var = new g6(this);
        g6Var.n(350L);
        g6Var.o(grVar);
        g6Var.C = false;
        g6Var.f5532m = false;
        this.f44738b.setItemAnimator(g6Var);
        this.f44738b.setOnItemClickListener(new a6(this));
        this.f44738b.j(new kh.g9(this, 1));
        f6Var.addView(this.actionBar, g7.e6.c(-2.0f, -1));
        this.R.setTargetListView(this.f44738b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.c2 c2Var = this.d;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.d = null;
            if (this.f44736a != null) {
                this.f44745f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.S != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.S.setText(spannableStringBuilder);
                }
                v0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Components.bv0.class, org.telegram.ui.Components.mx0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.mx0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.mx0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vi));
        int i11 = org.telegram.ui.ActionBar.f6.f23369y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.mx0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.mx0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.mx0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f44738b, 0, new Class[]{org.telegram.ui.Components.bv0.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"valueTextView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Components.kx0.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23072h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.X) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false)) <= 0.721f) {
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
        v6 v6Var = this.J;
        if (v6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            v6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.J.h.f31033b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void k0(r6 r6Var, org.telegram.ui.Components.jx0[] jx0VarArr, hh.b bVar) {
        s6 s6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.jx0 jx0Var;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        c2Var.f22766c0 = false;
        c2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.D;
        int i9 = 0;
        while (i9 < 8) {
            if ((jx0VarArr != null && ((jx0Var = jx0VarArr[i9]) == null || !jx0Var.f29874c)) || (s6Var = (s6) r6Var.d.get(i9)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = s6Var.f42567b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = r6Var.f42276c;
                j10 = j11;
                long j13 = s6Var.f42566a;
                r6Var.f42276c = j12 - j13;
                this.D -= j13;
                this.F += j13;
                r6Var.d.delete(i9);
                if (i9 == 0) {
                    this.f44752y -= s6Var.f42566a;
                } else if (i9 == 1) {
                    this.A -= s6Var.f42566a;
                } else if (i9 == 2) {
                    this.f44749s -= s6Var.f42566a;
                } else if (i9 == 3) {
                    this.f44751x -= s6Var.f42566a;
                } else if (i9 == 4) {
                    this.v -= s6Var.f42566a;
                } else if (i9 == 5) {
                    this.C -= s6Var.f42566a;
                } else if (i9 == 7) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        hh.a aVar = (hh.a) arrayList.get(i10);
                        String absolutePath = ((hh.a) arrayList.get(i10)).f10780a.getAbsolutePath();
                        char c10 = 6;
                        if (r0(6, absolutePath)) {
                            c10 = 7;
                        } else if (r0(0, absolutePath) || r0(100, absolutePath)) {
                            c10 = 0;
                        } else if (r0(2, absolutePath) || r0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f44750w -= aVar.f10782c;
                        } else if (c10 == 0) {
                            this.f44752y -= aVar.f10782c;
                        } else if (c10 == 1) {
                            this.A -= aVar.f10782c;
                        } else {
                            this.h -= aVar.f10782c;
                        }
                    }
                } else {
                    this.h -= s6Var.f42566a;
                }
            }
            i9++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (r6Var.d.size() == 0) {
            this.U.f10787b.remove(r6Var);
        }
        v0(true);
        if (bVar != null) {
            Iterator it = bVar.f10793j.iterator();
            while (it.hasNext()) {
                hh.a aVar2 = (hh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.D;
                    long j16 = aVar2.f10782c;
                    this.D = j15 - j16;
                    this.F += j16;
                    hashSet4.add(aVar2);
                    r6Var.b(aVar2);
                    int i11 = aVar2.d;
                    if (i11 == 0) {
                        this.f44752y -= aVar2.f10782c;
                    } else if (i11 == 1) {
                        this.A -= aVar2.f10782c;
                    } else if (i11 == 2) {
                        this.f44749s -= aVar2.f10782c;
                    } else if (i11 == 3) {
                        this.f44751x -= aVar2.f10782c;
                    } else if (i11 == 4) {
                        this.v -= aVar2.f10782c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            hh.a aVar3 = (hh.a) it2.next();
            hh.b bVar2 = this.U;
            if (bVar2.f10793j.remove(aVar3)) {
                bVar2.f10794k -= aVar3.f10782c;
            }
            ArrayList e10 = bVar2.e(aVar3.d);
            if (e10 != null) {
                e10.remove(aVar3);
            }
        }
        org.telegram.ui.Components.gc Q = org.telegram.ui.Components.oc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.D)));
        Q.f28745r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new t1(this, arrayList2, c2Var, 3));
    }

    public final void l0() {
        if (this.U.f10793j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new a6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            }
        }
    }

    public final void n0(File file, int i9, LongSparseArray longSparseArray, hh.b bVar) {
        File[] listFiles;
        int i10;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f44731g0) {
                    break;
                }
                if (file2.isDirectory()) {
                    n0(file2, i9, longSparseArray, bVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i10 = i9;
                    } else {
                        i10 = 3;
                    }
                    hh.a aVar = new hh.a(file2);
                    long length = file2.length();
                    aVar.f10782c = length;
                    if (fileDialogId != null) {
                        aVar.f10781b = fileDialogId.dialogId;
                        aVar.f10785g = fileDialogId.messageId;
                        int i11 = fileDialogId.messageType;
                        aVar.h = i11;
                        if (i11 == 23 && length > 0) {
                            i10 = 7;
                        }
                    }
                    aVar.d = i10;
                    long j10 = aVar.f10781b;
                    if (j10 != 0) {
                        r6 r6Var = (r6) longSparseArray.get(j10, null);
                        if (r6Var == null) {
                            r6Var = new r6(aVar.f10781b);
                            longSparseArray.put(aVar.f10781b, r6Var);
                        }
                        r6Var.a(aVar, i10);
                    }
                    if (i10 != 6) {
                        bVar.e(i10).add(aVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        hh.b bVar = this.U;
        if (bVar != null && !bVar.f10793j.isEmpty()) {
            if (z10) {
                this.U.d();
                v6 v6Var = this.J;
                if (v6Var != null) {
                    v6Var.e(false);
                    this.J.d();
                }
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        f44731g0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f44745f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new b6(this, 2));
        this.Q = System.currentTimeMillis();
        v0(false);
        u0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.c2 c2Var = this.d;
            if (c2Var != null) {
                c2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f44731g0 = true;
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f44738b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i12);
        this.f44738b.setClipToPadding(false);
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i9 == 4) {
            for (int i10 : iArr) {
                if (i10 != 0) {
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
        this.f44736a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        if (f10 > 0.5f && !this.X) {
            this.X = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f10);
    }

    public final boolean q0() {
        int i9;
        boolean[] zArr = this.f44743e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.W;
            if (i10 >= arrayList.size()) {
                break;
            }
            t6 t6Var = (t6) arrayList.get(i10);
            if (t6Var.f48814a == 11 && !t6Var.f42867i && (i9 = t6Var.f42865f) >= 0) {
                zArr2[i9] = true;
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

    public final long s0(int i9) {
        switch (i9) {
            case 0:
                return this.f44752y;
            case 1:
                return this.A;
            case 2:
                return this.f44749s;
            case 3:
                return this.f44751x;
            case 4:
                return this.v;
            case 5:
                return this.f44750w;
            case 6:
                return this.C;
            case 7:
                return this.h;
            case 8:
                return this.f44748r;
            case 9:
                return this.B;
            default:
                return 0L;
        }
    }

    public final void t0(View view) {
        int i9;
        int i10;
        int i11;
        boolean q02 = q0();
        boolean[] zArr = this.f44743e;
        ArrayList arrayList = this.W;
        if (q02) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                t6 t6Var = (t6) arrayList.get(i12);
                if (t6Var.f48814a != 11 || t6Var.f42867i || (i11 = t6Var.f42865f) < 0 || !zArr[i11]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.I) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                t6 t6Var2 = (t6) arrayList.get(i13);
                if (t6Var2.f48814a == 11 && !t6Var2.f42867i && (i10 = t6Var2.f42865f) >= 0) {
                    zArr2[i10] = true;
                }
            }
            for (int i14 = 0; i14 < length; i14++) {
                if (!zArr2[i14]) {
                    zArr[i14] = !q02;
                }
            }
        } else {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                t6 t6Var3 = (t6) arrayList.get(i15);
                if (t6Var3.f48814a == 11 && t6Var3.f42867i && (i9 = t6Var3.f42865f) >= 0) {
                    zArr[i9] = !q02;
                }
            }
        }
        for (int i16 = 0; i16 < this.f44738b.getChildCount(); i16++) {
            View childAt = this.f44738b.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                this.f44738b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    t6 t6Var4 = (t6) arrayList.get(R);
                    if (t6Var4.f48814a == 11) {
                        int i17 = t6Var4.f42865f;
                        if (i17 < 0) {
                            ((org.telegram.ui.Cells.z1) childAt).c(!q02, true);
                        } else {
                            ((org.telegram.ui.Cells.z1) childAt).c(zArr[i17], true);
                        }
                    }
                }
            }
        }
        u0();
    }

    public final void u0() {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        u6 u6Var = this.M;
        long j19 = 0;
        boolean z10 = false;
        if (u6Var != null) {
            boolean z11 = this.H;
            if (!z11 && this.D > 0) {
                org.telegram.ui.Components.tc[] tcVarArr = new org.telegram.ui.Components.tc[11];
                int i9 = 0;
                while (true) {
                    ArrayList arrayList = this.W;
                    if (i9 >= arrayList.size()) {
                        break;
                    }
                    t6 t6Var = (t6) arrayList.get(i9);
                    if (t6Var.f48814a == 11) {
                        int i10 = t6Var.f42865f;
                        boolean[] zArr = this.f44743e;
                        if (i10 < 0) {
                            if (this.I) {
                                long j20 = t6Var.f42866g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f32679c = j20;
                                obj.f32678b = z12;
                                tcVarArr[10] = obj;
                            }
                        } else {
                            long j21 = t6Var.f42866g;
                            boolean z13 = zArr[i10];
                            ?? obj2 = new Object();
                            obj2.f32679c = j21;
                            obj2.f32678b = z13;
                            tcVarArr[i10] = obj2;
                        }
                    }
                    i9++;
                }
                if (System.currentTimeMillis() - this.Q < 80) {
                    this.M.f32977n.d(0.0f, true);
                }
                this.M.f(this.D, true, tcVarArr);
            } else if (z11) {
                u6Var.f(-1L, true, new org.telegram.ui.Components.tc[0]);
            } else {
                u6Var.f(0L, true, new org.telegram.ui.Components.tc[0]);
            }
        }
        o6 o6Var = this.O;
        if (o6Var != null && !this.H) {
            y6 y6Var = o6Var.d;
            boolean[] zArr2 = y6Var.f44743e;
            if (zArr2[0]) {
                j10 = y6Var.f44752y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = y6Var.A;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = y6Var.f44749s;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = y6Var.f44751x;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = y6Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = y6Var.f44750w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = y6Var.C;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = y6Var.h;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = y6Var.f44748r;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = y6Var.B;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = y6Var.W;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    t6 t6Var2 = (t6) arrayList2.get(i11);
                    if (t6Var2.f48814a == 11) {
                        int i12 = t6Var2.f42865f;
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
            o6Var.a(j30, z10);
        }
    }

    public final void v0(boolean z10) {
        boolean z11;
        char c10;
        long j10;
        boolean z12;
        float[] fArr;
        hh.b bVar;
        if (z10 && System.currentTimeMillis() - this.Q < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.V;
        arrayList.clear();
        ArrayList arrayList2 = this.W;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        arrayList2.add(new t6(9, (String) null));
        arrayList2.add(new t6(10, (String) null));
        arrayList2.size();
        if (this.H) {
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            arrayList2.add(new t6(12, (String) null));
            z12 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f44752y > 0) {
                c10 = '\n';
                arrayList3.add(t6.b(0, this.f44752y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.f6.lj));
            } else {
                c10 = '\n';
            }
            if (this.A > 0) {
                arrayList3.add(t6.b(1, this.A, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.f6.hj));
            }
            if (this.f44749s > 0) {
                arrayList3.add(t6.b(2, this.f44749s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.f6.ij));
            }
            if (this.f44751x > 0) {
                arrayList3.add(t6.b(3, this.f44751x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.f6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(t6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.f6.mj));
            }
            if (this.f44750w > 0) {
                j10 = 0;
                arrayList3.add(t6.b(5, this.f44750w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.f6.jj));
            } else {
                j10 = 0;
            }
            if (this.C > j10) {
                arrayList3.add(t6.b(6, this.C, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.f6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(t6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.f6.qj));
            }
            if (this.f44748r > j10) {
                arrayList3.add(t6.b(8, this.f44748r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.f6.pj));
            }
            if (this.B > j10) {
                arrayList3.add(t6.b(9, this.B, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.f6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new j9.a(14));
                ((t6) arrayList3.get(arrayList3.size() - 1)).f42868j = true;
                if (this.L == null) {
                    this.L = new float[11];
                }
                int i9 = 0;
                while (true) {
                    fArr = this.L;
                    if (i9 >= fArr.length) {
                        break;
                    }
                    fArr[i9] = (float) s0(i9);
                    i9++;
                }
                if (this.K == null) {
                    this.K = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.K);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i10 = 0;
                    for (int i11 = 4; i11 < arrayList3.size(); i11++) {
                        ((t6) arrayList3.get(i11)).f42867i = true;
                        j11 += ((t6) arrayList3.get(i11)).f42866g;
                        i10 += this.K[((t6) arrayList3.get(i11)).f42865f];
                    }
                    this.K[c10] = i10;
                    arrayList2.add(t6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.f6.kj));
                    if (!this.I) {
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
            arrayList2.add(new t6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            t6 t6Var = new t6(1);
            t6Var.f42864e = string;
            arrayList2.add(t6Var);
        }
        arrayList2.add(new t6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new t6(0, 0));
        arrayList2.add(new t6(1, 0));
        arrayList2.add(new t6(2, 0));
        arrayList2.add(new t6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        t6 t6Var2 = new t6(1);
        t6Var2.f42864e = string2;
        arrayList2.add(t6Var2);
        if (this.E > j10) {
            arrayList2.add(new t6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new t6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            t6 t6Var3 = new t6(1);
            t6Var3.f42864e = string3;
            arrayList2.add(t6Var3);
        }
        if (z12 && (bVar = this.U) != null && !bVar.h()) {
            arrayList2.add(new t6(8, (String) null));
        }
        w6 w6Var = this.f44736a;
        if (w6Var != null) {
            if (z11) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.l();
            }
        }
        v6 v6Var = this.J;
        if (v6Var != null) {
            v6Var.c();
        }
    }
}
