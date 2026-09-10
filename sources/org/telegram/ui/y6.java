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
public final class y6 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f38903k0 = false;
    public static long f38904l0;
    public static Long m0;
    public static Long f38905n0;
    public static Long f38906o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public v6 N;
    public int[] O;
    public float[] P;
    public u6 Q;
    public k6 R;
    public p6 S;
    public lv T;
    public long U;
    public h6 V;
    public org.telegram.ui.ActionBar.g1 W;
    public org.telegram.ui.ActionBar.g1 X;
    public yh.b Y;
    public final ArrayList Z;
    public w6 f38907a;
    public final ArrayList f38908a0;
    public bi.y1 f38909b;
    public boolean f38910b0;
    public s4.c0 f38911c;
    public org.telegram.ui.ActionBar.z f38912c0;
    public org.telegram.ui.ActionBar.d2 d;
    public org.telegram.ui.Components.o6 f38913d0;
    public final boolean[] e;
    public org.telegram.ui.Components.o6 f38914e0;
    public long f38915f;
    public TextView f38916f0;
    public ValueAnimator f38917g0;
    public long h;
    public float f38918h0;
    public boolean f38919i0;
    public float f38920j0;
    public long f38921n;
    public long f38922r;
    public long f38923s;
    public long v;
    public long f38924w;
    public long f38925x;
    public long f38926y;

    public y6() {
        super(null);
        this.e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f38915f = -1L;
        this.h = -1L;
        this.f38921n = -1L;
        this.f38922r = -1L;
        this.f38923s = -1L;
        this.v = -1L;
        this.f38924w = -1L;
        this.f38925x = -1L;
        this.f38926y = -1L;
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
        this.f38908a0 = new ArrayList();
        this.f38920j0 = 1.0f;
    }

    public static void U(y6 y6Var, boolean z10, long j3, n6 n6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.d2 d2Var = y6Var.d;
            if (d2Var != null) {
                d2Var.dismiss();
                y6Var.d = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        y6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bi.va(y6Var, j3, 14), 150L);
        MediaDataController.getInstance(y6Var.currentAccount).checkAllMedia(true);
        y6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new d6(y6Var, 1));
        n6Var.run();
    }

    public static void V(y6 y6Var, boolean z10) {
        if (y6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(y6Var.getParentActivity(), 3, null);
        y6Var.d = d2Var;
        d2Var.f17621g0 = false;
        d2Var.q(500L);
        MessagesController.getInstance(y6Var.currentAccount).clearQueryTime();
        if (z10) {
            y6Var.getMessagesStorage().fullReset();
        } else {
            y6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.y6 r22, org.telegram.ui.m6 r23, org.telegram.ui.n6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y6.W(org.telegram.ui.y6, org.telegram.ui.m6, org.telegram.ui.n6):void");
    }

    public static void X(y6 y6Var, ValueAnimator valueAnimator) {
        y6Var.f38918h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), (int) (y6Var.f38918h0 * 255.0f)));
        y6Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false), (int) (y6Var.f38918h0 * 255.0f)));
        y6Var.fragmentView.invalidate();
    }

    public static void Y(y6 y6Var, org.telegram.ui.ActionBar.d2 d2Var) {
        FileLoader.getInstance(y6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            d2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static org.telegram.ui.ActionBar.l Z(y6 y6Var) {
        return y6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l a0(y6 y6Var) {
        return y6Var.actionBar;
    }

    public static void b0(y6 y6Var, boolean z10) {
        float f7;
        if (z10 != y6Var.f38919i0) {
            ValueAnimator valueAnimator = y6Var.f38917g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = y6Var.f38918h0;
            y6Var.f38919i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            y6Var.f38917g0 = ofFloat;
            ofFloat.addUpdateListener(new d3(y6Var, 2));
            y6Var.f38917g0.setInterpolator(org.telegram.ui.Components.wr.h);
            y6Var.f38917g0.setDuration(380L);
            y6Var.f38917g0.start();
        }
    }

    public static String c0(y6 y6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.l d0(y6 y6Var) {
        return y6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l e0(y6 y6Var) {
        return y6Var.actionBar;
    }

    public static void f0(y6 y6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(y6Var.f38915f))));
        d2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new gg.d0(3, y6Var, z10));
        y6Var.showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
        }
    }

    public static void g0(y6 y6Var) {
        String formatPluralString;
        if (y6Var.Y.f47178j.size() > 0) {
            if (y6Var.N != null) {
                if (!y6Var.Y.f47180l.isEmpty()) {
                    ArrayList arrayList = y6Var.Y.f47173b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        r6 r6Var = (r6) obj;
                        if (y6Var.Y.f47180l.contains(Long.valueOf(r6Var.f36238a))) {
                            i10 += r6Var.f36239b;
                        }
                    }
                    int size2 = y6Var.Y.f47178j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.a.C(LocaleController.formatPluralString("Chats", y6Var.Y.f47180l.size(), Integer.valueOf(y6Var.Y.f47180l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", y6Var.Y.f47180l.size(), Integer.valueOf(y6Var.Y.f47180l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", y6Var.Y.f47178j.size(), Integer.valueOf(y6Var.Y.f47178j.size()));
                }
                y6Var.f38913d0.c(AndroidUtilities.formatFileSize(y6Var.Y.f47179k), !LocaleController.isRTL, true);
                y6Var.f38914e0.c(formatPluralString, !LocaleController.isRTL, true);
                y6Var.N.e(true);
                return;
            }
            return;
        }
        y6Var.N.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f38904l0 < 5000) {
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
                            k0(a4.a.C(str, "/", name), i10, iArr, callback);
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
        Long l4;
        Long l10 = f38905n0;
        if (l10 != null && (l4 = f38906o0) != null) {
            b5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new mu0(b5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f38903k0) {
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), false);
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 22));
        this.f38912c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38912c0.addView(frameLayout, w7.a6.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f38913d0 = o6Var;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        o6Var.b(0.35f, 350L, wrVar);
        this.f38913d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f38913d0.setTypeface(AndroidUtilities.bold());
        this.f38913d0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        frameLayout.addView(this.f38913d0, w7.a6.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f38914e0 = o6Var2;
        o6Var2.b(0.35f, 350L, wrVar);
        this.f38914e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f38914e0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false));
        frameLayout.addView(this.f38914e0, w7.a6.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f38916f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f38916f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f38916f0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f38916f0.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f38916f0.setTypeface(AndroidUtilities.bold());
        this.f38916f0.setGravity(17);
        this.f38916f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f38916f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f38916f0, w7.a6.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f38916f0, w7.a6.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.g1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e;
        int i11 = org.telegram.ui.ActionBar.j6.f18144p7;
        e.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.ActionBar.g1 g1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.j6.f18162q7;
        g1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.g1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f38907a = new w6(this, context);
        h6 h6Var = new h6(this, context);
        this.V = h6Var;
        this.fragmentView = h6Var;
        h6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        bi.y1 y1Var = new bi.y1(this, context, 4);
        this.f38909b = y1Var;
        y1Var.o1();
        this.f38909b.setVerticalScrollBarEnabled(false);
        this.f38909b.setPadding(0, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f38909b.setClipToPadding(false);
        bi.y1 y1Var2 = this.f38909b;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f38911c = c0Var;
        y1Var2.setLayoutManager(c0Var);
        h6Var.addView(this.f38909b, w7.a6.c(-1.0f, -1));
        this.f38909b.setAdapter(this.f38907a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        i6Var.o(wrVar);
        i6Var.C = false;
        i6Var.f41645m = false;
        this.f38909b.setItemAnimator(i6Var);
        this.f38909b.setOnItemClickListener(new c6(this));
        this.f38909b.j(new bi.eb(this, 1));
        h6Var.addView(this.actionBar, w7.a6.c(-2.0f, -1));
        this.V.setTargetListView(this.f38909b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.d2 d2Var = this.d;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.d = null;
            if (this.f38907a != null) {
                this.f38915f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 16, new Class[]{org.telegram.ui.Cells.ga.class, org.telegram.ui.Components.ew0.class, org.telegram.ui.Components.ry0.class, org.telegram.ui.Cells.m4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17928d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f18201s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f18256v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f18220t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.f18306y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ry0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38909b, 0, new Class[]{org.telegram.ui.Components.ew0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.py0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f17998h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ij));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.lj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.nj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.oj));
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (!this.f38910b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false)) <= 0.721f) {
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
        v6 v6Var = this.N;
        if (v6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            v6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.h.f27886b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(r6 r6Var, org.telegram.ui.Components.oy0[] oy0VarArr, yh.b bVar) {
        s6 s6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.oy0 oy0Var;
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
        d2Var.f17621g0 = false;
        d2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((oy0VarArr != null && ((oy0Var = oy0VarArr[i10]) == null || !oy0Var.f25942c)) || (s6Var = (s6) r6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = s6Var.f36560b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = r6Var.f36240c;
                j3 = j10;
                long j12 = s6Var.f36559a;
                r6Var.f36240c = j11 - j12;
                this.H -= j12;
                this.J += j12;
                r6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f38926y -= s6Var.f36559a;
                } else if (i10 == 1) {
                    this.E -= s6Var.f36559a;
                } else if (i10 == 2) {
                    this.f38923s -= s6Var.f36559a;
                } else if (i10 == 3) {
                    this.f38925x -= s6Var.f36559a;
                } else if (i10 == 4) {
                    this.v -= s6Var.f36559a;
                } else if (i10 == 5) {
                    this.G -= s6Var.f36559a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        yh.a aVar = (yh.a) arrayList.get(i11);
                        String absolutePath = ((yh.a) arrayList.get(i11)).f47167a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f38924w -= aVar.f47169c;
                        } else if (c10 == 0) {
                            this.f38926y -= aVar.f47169c;
                        } else if (c10 == 1) {
                            this.E -= aVar.f47169c;
                        } else {
                            this.h -= aVar.f47169c;
                        }
                    }
                } else {
                    this.h -= s6Var.f36559a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (r6Var.d.size() == 0) {
            this.Y.f47173b.remove(r6Var);
        }
        w0(true);
        if (bVar != null) {
            Iterator it = bVar.f47178j.iterator();
            while (it.hasNext()) {
                yh.a aVar2 = (yh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.H;
                    long j15 = aVar2.f47169c;
                    this.H = j14 - j15;
                    this.J += j15;
                    hashSet4.add(aVar2);
                    r6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f38926y -= aVar2.f47169c;
                    } else if (i12 == 1) {
                        this.E -= aVar2.f47169c;
                    } else if (i12 == 2) {
                        this.f38923s -= aVar2.f47169c;
                    } else if (i12 == 3) {
                        this.f38925x -= aVar2.f47169c;
                    } else if (i12 == 4) {
                        this.v -= aVar2.f47169c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            yh.a aVar3 = (yh.a) it2.next();
            yh.b bVar2 = this.Y;
            if (bVar2.f47178j.remove(aVar3)) {
                bVar2.f47179k -= aVar3.f47169c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.pc Q = org.telegram.ui.Components.wc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.H)));
        Q.f26089r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new s1(this, arrayList2, d2Var, 3));
    }

    public final void m0() {
        if (this.Y.f47178j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new c6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, yh.b bVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f38903k0) {
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
                    yh.a aVar = new yh.a(file2);
                    long length = file2.length();
                    aVar.f47169c = length;
                    if (fileDialogId != null) {
                        aVar.f47168b = fileDialogId.dialogId;
                        aVar.f47171g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f47168b;
                    if (j3 != 0) {
                        r6 r6Var = (r6) longSparseArray.get(j3, null);
                        if (r6Var == null) {
                            r6Var = new r6(aVar.f47168b);
                            longSparseArray.put(aVar.f47168b, r6Var);
                        }
                        r6Var.a(aVar, i11);
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
        yh.b bVar = this.Y;
        if (bVar != null && !bVar.f47178j.isEmpty()) {
            if (z10) {
                this.Y.d();
                v6 v6Var = this.N;
                if (v6Var != null) {
                    v6Var.e(false);
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
        f38903k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f38915f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new d6(this, 2));
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
            org.telegram.ui.ActionBar.d2 d2Var = this.d;
            if (d2Var != null) {
                d2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f38903k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f38909b.setPadding(0, (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f38909b.setClipToPadding(false);
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
        this.f38907a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f38910b0) {
            this.f38910b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f38908a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            t6 t6Var = (t6) arrayList.get(i11);
            if (t6Var.f14046a == 11 && !t6Var.f36847i && (i10 = t6Var.f36845f) >= 0) {
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
                return this.f38926y;
            case 1:
                return this.E;
            case 2:
                return this.f38923s;
            case 3:
                return this.f38925x;
            case 4:
                return this.v;
            case 5:
                return this.f38924w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f38922r;
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
        boolean[] zArr = this.e;
        ArrayList arrayList = this.f38908a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                t6 t6Var = (t6) arrayList.get(i13);
                if (t6Var.f14046a != 11 || t6Var.f36847i || (i12 = t6Var.f36845f) < 0 || !zArr[i12]) {
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
                t6 t6Var2 = (t6) arrayList.get(i14);
                if (t6Var2.f14046a == 11 && !t6Var2.f36847i && (i11 = t6Var2.f36845f) >= 0) {
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
                t6 t6Var3 = (t6) arrayList.get(i16);
                if (t6Var3.f14046a == 11 && t6Var3.f36847i && (i10 = t6Var3.f36845f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f38909b.getChildCount(); i17++) {
            View childAt = this.f38909b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                this.f38909b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    t6 t6Var4 = (t6) arrayList.get(R);
                    if (t6Var4.f14046a == 11) {
                        int i18 = t6Var4.f36845f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.z1) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.z1) childAt).c(zArr[i18], true);
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
        u6 u6Var = this.Q;
        long j18 = 0;
        boolean z10 = false;
        if (u6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.bd[] bdVarArr = new org.telegram.ui.Components.bd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f38908a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    t6 t6Var = (t6) arrayList.get(i10);
                    if (t6Var.f14046a == 11) {
                        int i11 = t6Var.f36845f;
                        boolean[] zArr = this.e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j19 = t6Var.f36846g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f21804c = j19;
                                obj.f21803b = z12;
                                bdVarArr[10] = obj;
                            }
                        } else {
                            long j20 = t6Var.f36846g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f21804c = j20;
                            obj2.f21803b = z13;
                            bdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f22109n.d(0.0f, true);
                }
                this.Q.f(this.H, true, bdVarArr);
            } else if (z11) {
                u6Var.f(-1L, true, new org.telegram.ui.Components.bd[0]);
            } else {
                u6Var.f(0L, true, new org.telegram.ui.Components.bd[0]);
            }
        }
        p6 p6Var = this.S;
        if (p6Var != null && !this.L) {
            y6 y6Var = p6Var.d;
            boolean[] zArr2 = y6Var.e;
            if (zArr2[0]) {
                j3 = y6Var.f38926y;
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
                j11 = y6Var.f38923s;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = y6Var.f38925x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = y6Var.v;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = y6Var.f38924w;
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
                j16 = y6Var.h;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = y6Var.f38922r;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = y6Var.F;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = y6Var.f38908a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    t6 t6Var2 = (t6) arrayList2.get(i12);
                    if (t6Var2.f14046a == 11) {
                        int i13 = t6Var2.f36845f;
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
            p6Var.a(j29, z10);
        }
    }

    public final void w0(boolean z10) {
        boolean z11;
        char c10;
        long j3;
        boolean z12;
        float[] fArr;
        yh.b bVar;
        if (z10 && System.currentTimeMillis() - this.U < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f38908a0;
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
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f38926y > 0) {
                c10 = '\n';
                arrayList3.add(t6.b(0, this.f38926y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(t6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.f38923s > 0) {
                arrayList3.add(t6.b(2, this.f38923s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.f38925x > 0) {
                arrayList3.add(t6.b(3, this.f38925x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(t6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.f38924w > 0) {
                j3 = 0;
                arrayList3.add(t6.b(5, this.f38924w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j3 = 0;
            }
            if (this.G > j3) {
                arrayList3.add(t6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.h > j3) {
                arrayList3.add(t6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.f38922r > j3) {
                arrayList3.add(t6.b(8, this.f38922r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.F > j3) {
                arrayList3.add(t6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new a4.e(21));
                ((t6) arrayList3.get(arrayList3.size() - 1)).f36848j = true;
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
                    long j10 = j3;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((t6) arrayList3.get(i12)).f36847i = true;
                        j10 += ((t6) arrayList3.get(i12)).f36846g;
                        i11 += this.O[((t6) arrayList3.get(i12)).f36845f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(t6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
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
            arrayList2.add(new t6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            t6 t6Var = new t6(1);
            t6Var.e = string;
            arrayList2.add(t6Var);
        }
        arrayList2.add(new t6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new t6(0, 0));
        arrayList2.add(new t6(1, 0));
        arrayList2.add(new t6(2, 0));
        arrayList2.add(new t6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        t6 t6Var2 = new t6(1);
        t6Var2.e = string2;
        arrayList2.add(t6Var2);
        if (this.I > j3) {
            arrayList2.add(new t6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new t6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            t6 t6Var3 = new t6(1);
            t6Var3.e = string3;
            arrayList2.add(t6Var3);
        }
        if (z12 && (bVar = this.Y) != null && !bVar.h()) {
            arrayList2.add(new t6(8, (String) null));
        }
        w6 w6Var = this.f38907a;
        if (w6Var != null) {
            if (z11) {
                w6Var.E(arrayList, arrayList2);
            } else {
                w6Var.l();
            }
        }
        v6 v6Var = this.N;
        if (v6Var != null) {
            v6Var.c();
        }
    }
}
