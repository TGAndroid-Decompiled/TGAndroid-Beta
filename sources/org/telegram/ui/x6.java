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
public final class x6 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f44478g0 = false;
    public static long f44479h0;
    public static Long f44480i0;
    public static Long f44481j0;
    public static Long f44482k0;
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public final long G;
    public boolean H;
    public boolean I;
    public u6 J;
    public int[] K;
    public float[] L;
    public t6 M;
    public j6 N;
    public o6 O;
    public yu P;
    public long Q;
    public g6 R;
    public org.telegram.ui.ActionBar.g1 S;
    public org.telegram.ui.ActionBar.g1 T;
    public kh.b U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public org.telegram.ui.ActionBar.a0 Y;
    public org.telegram.ui.Components.o6 Z;
    public v6 f44483a;
    public org.telegram.ui.Components.o6 f44484a0;
    public jh.e1 f44485b;
    public TextView f44486b0;
    public f2.j0 f44487c;
    public ValueAnimator f44488c0;
    public org.telegram.ui.ActionBar.c2 d;
    public float f44489d0;
    public final boolean[] f44490e;
    public boolean f44491e0;
    public long f44492f;
    public float f44493f0;
    public long h;
    public long f44494n;
    public long f44495r;
    public long f44496s;
    public long v;
    public long f44497w;
    public long f44498x;
    public long f44499y;

    public x6() {
        super(null);
        this.f44490e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f44492f = -1L;
        this.h = -1L;
        this.f44494n = -1L;
        this.f44495r = -1L;
        this.f44496s = -1L;
        this.v = -1L;
        this.f44497w = -1L;
        this.f44498x = -1L;
        this.f44499y = -1L;
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
        this.f44493f0 = 1.0f;
    }

    public static void U(x6 x6Var, boolean z10, long j10, m6 m6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.c2 c2Var = x6Var.d;
            if (c2Var != null) {
                c2Var.dismiss();
                x6Var.d = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        x6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new eg.z1(x6Var, j10, 19), 150L);
        MediaDataController.getInstance(x6Var.currentAccount).checkAllMedia(true);
        x6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new c6(x6Var, 1));
        m6Var.run();
    }

    public static void V(x6 x6Var, boolean z10) {
        if (x6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(x6Var.getParentActivity(), 3, null);
        x6Var.d = c2Var;
        c2Var.f22783c0 = false;
        c2Var.q(500L);
        MessagesController.getInstance(x6Var.currentAccount).clearQueryTime();
        if (z10) {
            x6Var.getMessagesStorage().fullReset();
        } else {
            x6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.x6 r22, org.telegram.ui.l6 r23, org.telegram.ui.m6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x6.W(org.telegram.ui.x6, org.telegram.ui.l6, org.telegram.ui.m6):void");
    }

    public static void X(x6 x6Var, ValueAnimator valueAnimator) {
        x6Var.f44489d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), (int) (x6Var.f44489d0 * 255.0f)));
        x6Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), (int) (x6Var.f44489d0 * 255.0f)));
        x6Var.fragmentView.invalidate();
    }

    public static void Y(x6 x6Var, org.telegram.ui.ActionBar.c2 c2Var) {
        FileLoader.getInstance(x6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            c2Var.dismiss();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static org.telegram.ui.ActionBar.l Z(x6 x6Var) {
        return x6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l a0(x6 x6Var) {
        return x6Var.actionBar;
    }

    public static void b0(x6 x6Var, boolean z10) {
        float f9;
        if (z10 != x6Var.f44491e0) {
            ValueAnimator valueAnimator = x6Var.f44488c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = x6Var.f44489d0;
            x6Var.f44491e0 = z10;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            x6Var.f44488c0 = ofFloat;
            ofFloat.addUpdateListener(new g3(x6Var, 2));
            x6Var.f44488c0.setInterpolator(org.telegram.ui.Components.jr.h);
            x6Var.f44488c0.setDuration(380L);
            x6Var.f44488c0.start();
        }
    }

    public static String c0(x6 x6Var, float f9) {
        if (f9 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f9 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static void f0(x6 x6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(x6Var.f44492f))));
        c2Var.P = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new gh.q(2, x6Var, z10));
        x6Var.showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
        }
    }

    public static void g0(x6 x6Var) {
        String formatPluralString;
        if (x6Var.U.f13902j.size() > 0) {
            if (x6Var.J != null) {
                if (!x6Var.U.f13904l.isEmpty()) {
                    ArrayList arrayList = x6Var.U.f13896b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        q6 q6Var = (q6) obj;
                        if (x6Var.U.f13904l.contains(Long.valueOf(q6Var.f41543a))) {
                            i10 += q6Var.f41544b;
                        }
                    }
                    int size2 = x6Var.U.f13902j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.w.y(LocaleController.formatPluralString("Chats", x6Var.U.f13904l.size(), Integer.valueOf(x6Var.U.f13904l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", x6Var.U.f13904l.size(), Integer.valueOf(x6Var.U.f13904l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", x6Var.U.f13902j.size(), Integer.valueOf(x6Var.U.f13902j.size()));
                }
                x6Var.Z.c(AndroidUtilities.formatFileSize(x6Var.U.f13903k), !LocaleController.isRTL, true);
                x6Var.f44484a0.c(formatPluralString, !LocaleController.isRTL, true);
                x6Var.J.e(true);
                return;
            }
            return;
        }
        x6Var.J.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l10 = f44480i0;
        if (l10 != null) {
            callback.run(l10);
            if (System.currentTimeMillis() - f44479h0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new it0(callback, 15));
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
                            k0(a4.w.y(str, "/", name), i10, iArr, callback);
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

    public static void p0(b5 b5Var) {
        Long l10;
        Long l11 = f44481j0;
        if (l11 != null && (l10 = f44482k0) != null) {
            b5Var.run(l11, l10);
        } else {
            Utilities.cacheClearQueue.postRunnable(new it0(b5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f44478g0) {
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
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        lVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), false);
        th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 9));
        this.Y = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y.addView(frameLayout, i7.f6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.Z = o6Var;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        o6Var.b(0.35f, 350L, jrVar);
        this.Z.setTextSize(AndroidUtilities.dp(18.0f));
        this.Z.setTypeface(AndroidUtilities.bold());
        this.Z.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        frameLayout.addView(this.Z, i7.f6.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f44484a0 = o6Var2;
        o6Var2.b(0.35f, 350L, jrVar);
        this.f44484a0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f44484a0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
        frameLayout.addView(this.f44484a0, i7.f6.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44486b0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f44486b0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f44486b0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f44486b0.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.Oh));
        this.f44486b0.setTypeface(AndroidUtilities.bold());
        this.f44486b0.setGravity(17);
        this.f44486b0.setText(LocaleController.getString(R.string.CacheClear));
        this.f44486b0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f44486b0, i7.f6.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f44486b0, i7.f6.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e10 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.S = e10;
        int i11 = org.telegram.ui.ActionBar.g6.f23279p7;
        e10.setIconColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.S;
        int i12 = org.telegram.ui.ActionBar.g6.f23295q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.S.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e11 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.T = e11;
            e11.setIconColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.T.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
            this.T.setSelectorColor(org.telegram.ui.ActionBar.g6.l1(0.12f, org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        }
        if (this.S != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.S.setText(spannableStringBuilder);
        }
        this.f44483a = new v6(this, context);
        g6 g6Var = new g6(this, context);
        this.R = g6Var;
        this.fragmentView = g6Var;
        g6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        jh.e1 e1Var = new jh.e1(this, context, 4);
        this.f44485b = e1Var;
        e1Var.p1();
        this.f44485b.setVerticalScrollBarEnabled(false);
        this.f44485b.setPadding(0, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f44485b.setClipToPadding(false);
        jh.e1 e1Var2 = this.f44485b;
        f2.j0 j0Var = new f2.j0(1, false);
        this.f44487c = j0Var;
        e1Var2.setLayoutManager(j0Var);
        g6Var.addView(this.f44485b, i7.f6.c(-1.0f, -1));
        this.f44485b.setAdapter(this.f44483a);
        h6 h6Var = new h6(this);
        h6Var.n(350L);
        h6Var.o(jrVar);
        h6Var.C = false;
        h6Var.f6463m = false;
        this.f44485b.setItemAnimator(h6Var);
        this.f44485b.setOnItemClickListener(new b6(this));
        this.f44485b.j(new nh.s8(this, 1));
        g6Var.addView(this.actionBar, i7.f6.c(-2.0f, -1));
        this.R.setTargetListView(this.f44485b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.c2 c2Var = this.d;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.d = null;
            if (this.f44483a != null) {
                this.f44492f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.S != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.S.setText(spannableStringBuilder);
                }
                w0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        f fVar = new f(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 16, new Class[]{org.telegram.ui.Cells.y9.class, org.telegram.ui.Components.lv0.class, org.telegram.ui.Components.xx0.class, org.telegram.ui.Cells.k4.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.xx0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.xx0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vi));
        int i12 = org.telegram.ui.ActionBar.g6.f23433y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.xx0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.xx0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.xx0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f44485b, 0, new Class[]{org.telegram.ui.Components.lv0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y1.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Components.vx0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23133h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.X) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false)) <= 0.721f) {
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
        u6 u6Var = this.J;
        if (u6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            u6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.J.h.f35259b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(q6 q6Var, org.telegram.ui.Components.ux0[] ux0VarArr, kh.b bVar) {
        r6 r6Var;
        HashSet hashSet;
        long j10;
        org.telegram.ui.Components.ux0 ux0Var;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
        c2Var.f22783c0 = false;
        c2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j11 = this.D;
        int i10 = 0;
        while (i10 < 8) {
            if ((ux0VarArr != null && ((ux0Var = ux0VarArr[i10]) == null || !ux0Var.f33335c)) || (r6Var = (r6) q6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j10 = j11;
            } else {
                ArrayList arrayList = r6Var.f41979b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j12 = q6Var.f41545c;
                j10 = j11;
                long j13 = r6Var.f41978a;
                q6Var.f41545c = j12 - j13;
                this.D -= j13;
                this.F += j13;
                q6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f44499y -= r6Var.f41978a;
                } else if (i10 == 1) {
                    this.A -= r6Var.f41978a;
                } else if (i10 == 2) {
                    this.f44496s -= r6Var.f41978a;
                } else if (i10 == 3) {
                    this.f44498x -= r6Var.f41978a;
                } else if (i10 == 4) {
                    this.v -= r6Var.f41978a;
                } else if (i10 == 5) {
                    this.C -= r6Var.f41978a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        kh.a aVar = (kh.a) arrayList.get(i11);
                        String absolutePath = ((kh.a) arrayList.get(i11)).f13889a.getAbsolutePath();
                        char c3 = 6;
                        if (s0(6, absolutePath)) {
                            c3 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c3 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c3 = 1;
                        }
                        if (c3 == 7) {
                            this.f44497w -= aVar.f13891c;
                        } else if (c3 == 0) {
                            this.f44499y -= aVar.f13891c;
                        } else if (c3 == 1) {
                            this.A -= aVar.f13891c;
                        } else {
                            this.h -= aVar.f13891c;
                        }
                    }
                } else {
                    this.h -= r6Var.f41978a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j11 = j10;
        }
        HashSet hashSet3 = hashSet2;
        long j14 = j11;
        if (q6Var.d.size() == 0) {
            this.U.f13896b.remove(q6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.f13902j.iterator();
            while (it.hasNext()) {
                kh.a aVar2 = (kh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j15 = this.D;
                    long j16 = aVar2.f13891c;
                    this.D = j15 - j16;
                    this.F += j16;
                    hashSet4.add(aVar2);
                    q6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f44499y -= aVar2.f13891c;
                    } else if (i12 == 1) {
                        this.A -= aVar2.f13891c;
                    } else if (i12 == 2) {
                        this.f44496s -= aVar2.f13891c;
                    } else if (i12 == 3) {
                        this.f44498x -= aVar2.f13891c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.f13891c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            kh.a aVar3 = (kh.a) it2.next();
            kh.b bVar2 = this.U;
            if (bVar2.f13902j.remove(aVar3)) {
                bVar2.f13903k -= aVar3.f13891c;
            }
            ArrayList e10 = bVar2.e(aVar3.d);
            if (e10 != null) {
                e10.remove(aVar3);
            }
        }
        org.telegram.ui.Components.mc Q = org.telegram.ui.Components.tc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j14 - this.D)));
        Q.f30660r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new u1(this, arrayList2, c2Var, 3));
    }

    public final void m0() {
        if (this.U.f13902j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new b6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, kh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f44478g0) {
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
                    kh.a aVar = new kh.a(file2);
                    long length = file2.length();
                    aVar.f13891c = length;
                    if (fileDialogId != null) {
                        aVar.f13890b = fileDialogId.dialogId;
                        aVar.f13894g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j10 = aVar.f13890b;
                    if (j10 != 0) {
                        q6 q6Var = (q6) longSparseArray.get(j10, null);
                        if (q6Var == null) {
                            q6Var = new q6(aVar.f13890b);
                            longSparseArray.put(aVar.f13890b, q6Var);
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
        kh.b bVar = this.U;
        if (bVar != null && !bVar.f13902j.isEmpty()) {
            if (z10) {
                this.U.d();
                u6 u6Var = this.J;
                if (u6Var != null) {
                    u6Var.e(false);
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
        f44478g0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f44492f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new c6(this, 2));
        this.Q = System.currentTimeMillis();
        w0(false);
        v0();
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
        f44478g0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f44485b.setPadding(0, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f44485b.setClipToPadding(false);
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
        this.f44483a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        if (f9 > 0.5f && !this.X) {
            this.X = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f9);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.f44490e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.W;
            if (i11 >= arrayList.size()) {
                break;
            }
            s6 s6Var = (s6) arrayList.get(i11);
            if (s6Var.f50845a == 11 && !s6Var.f42286i && (i10 = s6Var.f42284f) >= 0) {
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
                return this.f44499y;
            case 1:
                return this.A;
            case 2:
                return this.f44496s;
            case 3:
                return this.f44498x;
            case 4:
                return this.v;
            case 5:
                return this.f44497w;
            case 6:
                return this.C;
            case 7:
                return this.h;
            case 8:
                return this.f44495r;
            case 9:
                return this.B;
            default:
                return 0L;
        }
    }

    public final void u0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.f44490e;
        ArrayList arrayList = this.W;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                s6 s6Var = (s6) arrayList.get(i13);
                if (s6Var.f50845a != 11 || s6Var.f42286i || (i12 = s6Var.f42284f) < 0 || !zArr[i12]) {
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
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                s6 s6Var2 = (s6) arrayList.get(i14);
                if (s6Var2.f50845a == 11 && !s6Var2.f42286i && (i11 = s6Var2.f42284f) >= 0) {
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
                if (s6Var3.f50845a == 11 && s6Var3.f42286i && (i10 = s6Var3.f42284f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f44485b.getChildCount(); i17++) {
            View childAt = this.f44485b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.y1) {
                this.f44485b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    s6 s6Var4 = (s6) arrayList.get(R);
                    if (s6Var4.f50845a == 11) {
                        int i18 = s6Var4.f42284f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.y1) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.y1) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        v0();
    }

    public final void v0() {
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        t6 t6Var = this.M;
        long j19 = 0;
        boolean z10 = false;
        if (t6Var != null) {
            boolean z11 = this.H;
            if (!z11 && this.D > 0) {
                org.telegram.ui.Components.yc[] ycVarArr = new org.telegram.ui.Components.yc[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.W;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    s6 s6Var = (s6) arrayList.get(i10);
                    if (s6Var.f50845a == 11) {
                        int i11 = s6Var.f42284f;
                        boolean[] zArr = this.f44490e;
                        if (i11 < 0) {
                            if (this.I) {
                                long j20 = s6Var.f42285g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f35043c = j20;
                                obj.f35042b = z12;
                                ycVarArr[10] = obj;
                            }
                        } else {
                            long j21 = s6Var.f42285g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f35043c = j21;
                            obj2.f35042b = z13;
                            ycVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.Q < 80) {
                    this.M.f35307n.d(0.0f, true);
                }
                this.M.f(this.D, true, ycVarArr);
            } else if (z11) {
                t6Var.f(-1L, true, new org.telegram.ui.Components.yc[0]);
            } else {
                t6Var.f(0L, true, new org.telegram.ui.Components.yc[0]);
            }
        }
        o6 o6Var = this.O;
        if (o6Var != null && !this.H) {
            x6 x6Var = o6Var.d;
            boolean[] zArr2 = x6Var.f44490e;
            if (zArr2[0]) {
                j10 = x6Var.f44499y;
            } else {
                j10 = 0;
            }
            if (zArr2[1]) {
                j11 = x6Var.A;
            } else {
                j11 = 0;
            }
            long j22 = j10 + j11;
            if (zArr2[2]) {
                j12 = x6Var.f44496s;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[3]) {
                j13 = x6Var.f44498x;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[4]) {
                j14 = x6Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[5]) {
                j15 = x6Var.f44497w;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[6]) {
                j16 = x6Var.C;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[7]) {
                j17 = x6Var.h;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[8]) {
                j18 = x6Var.f44495r;
            } else {
                j18 = 0;
            }
            long j29 = j28 + j18;
            if (zArr2[9]) {
                j19 = x6Var.B;
            }
            long j30 = j29 + j19;
            ArrayList arrayList2 = x6Var.W;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    s6 s6Var2 = (s6) arrayList2.get(i12);
                    if (s6Var2.f50845a == 11) {
                        int i13 = s6Var2.f42284f;
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
            o6Var.a(j30, z10);
        }
    }

    public final void w0(boolean z10) {
        boolean z11;
        char c3;
        long j10;
        boolean z12;
        float[] fArr;
        kh.b bVar;
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
        arrayList2.add(new s6(9, (String) null));
        arrayList2.add(new s6(10, (String) null));
        arrayList2.size();
        if (this.H) {
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            arrayList2.add(new s6(12, (String) null));
            z12 = true;
            j10 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f44499y > 0) {
                c3 = '\n';
                arrayList3.add(s6.b(0, this.f44499y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.g6.lj));
            } else {
                c3 = '\n';
            }
            if (this.A > 0) {
                arrayList3.add(s6.b(1, this.A, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.g6.hj));
            }
            if (this.f44496s > 0) {
                arrayList3.add(s6.b(2, this.f44496s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.g6.ij));
            }
            if (this.f44498x > 0) {
                arrayList3.add(s6.b(3, this.f44498x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.g6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(s6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.g6.mj));
            }
            if (this.f44497w > 0) {
                j10 = 0;
                arrayList3.add(s6.b(5, this.f44497w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.g6.jj));
            } else {
                j10 = 0;
            }
            if (this.C > j10) {
                arrayList3.add(s6.b(6, this.C, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.g6.nj));
            }
            if (this.h > j10) {
                arrayList3.add(s6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.g6.qj));
            }
            if (this.f44495r > j10) {
                arrayList3.add(s6.b(8, this.f44495r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.g6.pj));
            }
            if (this.B > j10) {
                arrayList3.add(s6.b(9, this.B, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.g6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new lh.e4(12));
                ((s6) arrayList3.get(arrayList3.size() - 1)).f42287j = true;
                if (this.L == null) {
                    this.L = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.L;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) t0(i10);
                    i10++;
                }
                if (this.K == null) {
                    this.K = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.K);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j11 = j10;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((s6) arrayList3.get(i12)).f42286i = true;
                        j11 += ((s6) arrayList3.get(i12)).f42285g;
                        i11 += this.K[((s6) arrayList3.get(i12)).f42284f];
                    }
                    this.K[c3] = i11;
                    arrayList2.add(s6.b(-1, j11, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.g6.kj));
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
            arrayList2.add(new s6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            s6 s6Var = new s6(1);
            s6Var.f42283e = string;
            arrayList2.add(s6Var);
        }
        arrayList2.add(new s6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new s6(0, 0));
        arrayList2.add(new s6(1, 0));
        arrayList2.add(new s6(2, 0));
        arrayList2.add(new s6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        s6 s6Var2 = new s6(1);
        s6Var2.f42283e = string2;
        arrayList2.add(s6Var2);
        if (this.E > j10) {
            arrayList2.add(new s6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new s6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            s6 s6Var3 = new s6(1);
            s6Var3.f42283e = string3;
            arrayList2.add(s6Var3);
        }
        if (z12 && (bVar = this.U) != null && !bVar.h()) {
            arrayList2.add(new s6(8, (String) null));
        }
        v6 v6Var = this.f44483a;
        if (v6Var != null) {
            if (z11) {
                v6Var.E(arrayList, arrayList2);
            } else {
                v6Var.l();
            }
        }
        u6 u6Var = this.J;
        if (u6Var != null) {
            u6Var.c();
        }
    }
}
