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
public final class z6 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public static volatile boolean f43299k0 = false;
    public static long f43300l0;
    public static Long m0;
    public static Long f43301n0;
    public static Long f43302o0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public long J;
    public final long K;
    public boolean L;
    public boolean M;
    public w6 N;
    public int[] O;
    public float[] P;
    public v6 Q;
    public k6 R;
    public p6 S;
    public kv T;
    public long U;
    public h6 V;
    public org.telegram.ui.ActionBar.f1 W;
    public org.telegram.ui.ActionBar.f1 X;
    public ai.c Y;
    public final ArrayList Z;
    public x6 f43303a;
    public final ArrayList f43304a0;
    public bi.o0 f43305b;
    public boolean f43306b0;
    public s4.c0 f43307c;
    public org.telegram.ui.ActionBar.z f43308c0;
    public org.telegram.ui.ActionBar.b2 d;
    public org.telegram.ui.Components.q6 f43309d0;
    public final boolean[] f43310e;
    public org.telegram.ui.Components.q6 f43311e0;
    public long f43312f;
    public TextView f43313f0;
    public ValueAnimator f43314g0;
    public long h;
    public float f43315h0;
    public boolean f43316i0;
    public float f43317j0;
    public long f43318n;
    public long f43319r;
    public long f43320s;
    public long v;
    public long f43321w;
    public long f43322x;
    public long f43323y;

    public z6() {
        super(null);
        this.f43310e = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.f43312f = -1L;
        this.h = -1L;
        this.f43318n = -1L;
        this.f43319r = -1L;
        this.f43320s = -1L;
        this.v = -1L;
        this.f43321w = -1L;
        this.f43322x = -1L;
        this.f43323y = -1L;
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
        this.f43304a0 = new ArrayList();
        this.f43317j0 = 1.0f;
    }

    public static void U(z6 z6Var, boolean z10, long j3, n6 n6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = z6Var.d;
            if (b2Var != null) {
                b2Var.dismiss();
                z6Var.d = null;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        z6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new bi.g(z6Var, j3, 19), 150L);
        MediaDataController.getInstance(z6Var.currentAccount).checkAllMedia(true);
        z6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new c6(z6Var, 1));
        n6Var.run();
    }

    public static void V(z6 z6Var, boolean z10) {
        if (z6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(z6Var.getParentActivity(), 3, null);
        z6Var.d = b2Var;
        b2Var.f20237g0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(z6Var.currentAccount).clearQueryTime();
        if (z10) {
            z6Var.getMessagesStorage().fullReset();
        } else {
            z6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static void W(org.telegram.ui.z6 r22, org.telegram.ui.m6 r23, org.telegram.ui.n6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z6.W(org.telegram.ui.z6, org.telegram.ui.m6, org.telegram.ui.n6):void");
    }

    public static void X(z6 z6Var, ValueAnimator valueAnimator) {
        z6Var.f43315h0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), (int) (z6Var.f43315h0 * 255.0f)));
        z6Var.actionBar.setBackgroundColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false), (int) (z6Var.f43315h0 * 255.0f)));
        z6Var.fragmentView.invalidate();
    }

    public static void Y(z6 z6Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(z6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static org.telegram.ui.ActionBar.k Z(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k a0(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static void b0(z6 z6Var, boolean z10) {
        float f7;
        if (z10 != z6Var.f43316i0) {
            ValueAnimator valueAnimator = z6Var.f43314g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f10 = z6Var.f43315h0;
            z6Var.f43316i0 = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            z6Var.f43314g0 = ofFloat;
            ofFloat.addUpdateListener(new c3(z6Var, 2));
            z6Var.f43314g0.setInterpolator(org.telegram.ui.Components.pr.h);
            z6Var.f43314g0.setDuration(380L);
            z6Var.f43314g0.start();
        }
    }

    public static String c0(z6 z6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k d0(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k e0(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static void f0(z6 z6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(z6Var.f43312f))));
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new bi.h(4, z6Var, z10));
        z6Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
        }
    }

    public static void g0(z6 z6Var) {
        String formatPluralString;
        if (z6Var.Y.f751j.size() > 0) {
            if (z6Var.N != null) {
                if (!z6Var.Y.f753l.isEmpty()) {
                    ArrayList arrayList = z6Var.Y.f745b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        s6 s6Var = (s6) obj;
                        if (z6Var.Y.f753l.contains(Long.valueOf(s6Var.f40312a))) {
                            i10 += s6Var.f40313b;
                        }
                    }
                    int size2 = z6Var.Y.f751j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.a.C(LocaleController.formatPluralString("Chats", z6Var.Y.f753l.size(), Integer.valueOf(z6Var.Y.f753l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", z6Var.Y.f753l.size(), Integer.valueOf(z6Var.Y.f753l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", z6Var.Y.f751j.size(), Integer.valueOf(z6Var.Y.f751j.size()));
                }
                z6Var.f43309d0.c(AndroidUtilities.formatFileSize(z6Var.Y.f752k), !LocaleController.isRTL, true);
                z6Var.f43311e0.c(formatPluralString, !LocaleController.isRTL, true);
                z6Var.N.e(true);
                return;
            }
            return;
        }
        z6Var.N.e(false);
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = m0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - f43300l0 < 5000) {
                return;
            }
        }
        Utilities.cacheClearQueue.postRunnable(new lu0(callback, 15));
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
        Long l10 = f43301n0;
        if (l10 != null && (l4 = f43302o0) != null) {
            b5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new lu0(b5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f43299k0) {
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 0));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), false);
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 23));
        this.f43308c0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43308c0.addView(frameLayout, w7.x5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f43309d0 = q6Var;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        q6Var.b(0.35f, 350L, prVar);
        this.f43309d0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f43309d0.setTypeface(AndroidUtilities.bold());
        this.f43309d0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        frameLayout.addView(this.f43309d0, w7.x5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(context, true, true, true);
        this.f43311e0 = q6Var2;
        q6Var2.b(0.35f, 350L, prVar);
        this.f43311e0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f43311e0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21042y6, false));
        frameLayout.addView(this.f43311e0, w7.x5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f43313f0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f43313f0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f43313f0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f43313f0.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f43313f0.setTypeface(AndroidUtilities.bold());
        this.f43313f0.setGravity(17);
        this.f43313f0.setText(LocaleController.getString(R.string.CacheClear));
        this.f43313f0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f43313f0, w7.x5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f43313f0, w7.x5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f1 e7 = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.W = e7;
        int i11 = org.telegram.ui.ActionBar.j6.f20880p7;
        e7.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.ActionBar.f1 f1Var = this.W;
        int i12 = org.telegram.ui.ActionBar.j6.f20898q7;
        f1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.W.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.f1 e10 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.X = e10;
            e10.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.X.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.X.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        }
        if (this.W != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.W.setText(spannableStringBuilder);
        }
        this.f43303a = new x6(this, context);
        h6 h6Var = new h6(this, context);
        this.V = h6Var;
        this.fragmentView = h6Var;
        h6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        bi.o0 o0Var = new bi.o0(this, context, 5);
        this.f43305b = o0Var;
        o0Var.o1();
        this.f43305b.setVerticalScrollBarEnabled(false);
        this.f43305b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, 0);
        this.f43305b.setClipToPadding(false);
        bi.o0 o0Var2 = this.f43305b;
        s4.c0 c0Var = new s4.c0(1, false);
        this.f43307c = c0Var;
        o0Var2.setLayoutManager(c0Var);
        h6Var.addView(this.f43305b, w7.x5.c(-1.0f, -1));
        this.f43305b.setAdapter(this.f43303a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        i6Var.o(prVar);
        i6Var.C = false;
        i6Var.f45777m = false;
        this.f43305b.setItemAnimator(i6Var);
        this.f43305b.setOnItemClickListener(new b6(this));
        this.f43305b.j(new di.u9(this, 1));
        h6Var.addView(this.actionBar, w7.x5.c(-2.0f, -1));
        this.V.setTargetListView(this.f43305b);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.d;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            this.d = null;
            if (this.f43303a != null) {
                this.f43312f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
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
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Components.sv0.class, org.telegram.ui.Components.ey0.class, org.telegram.ui.Cells.l4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.ey0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.ey0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.f21042y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.ey0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.ey0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.ey0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.sv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.sv0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f43305b, 0, new Class[]{org.telegram.ui.Components.sv0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.z1.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.cy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20734h5));
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
        if (!this.f43306b0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false)) <= 0.721f) {
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
        w6 w6Var = this.N;
        if (w6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            w6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.N.h.f27015b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(s6 s6Var, org.telegram.ui.Components.by0[] by0VarArr, ai.c cVar) {
        t6 t6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.by0 by0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.f20237g0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.H;
        int i10 = 0;
        while (i10 < 8) {
            if ((by0VarArr != null && ((by0Var = by0VarArr[i10]) == null || !by0Var.f24822c)) || (t6Var = (t6) s6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = t6Var.f40633b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = s6Var.f40314c;
                j3 = j10;
                long j12 = t6Var.f40632a;
                s6Var.f40314c = j11 - j12;
                this.H -= j12;
                this.J += j12;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f43323y -= t6Var.f40632a;
                } else if (i10 == 1) {
                    this.E -= t6Var.f40632a;
                } else if (i10 == 2) {
                    this.f43320s -= t6Var.f40632a;
                } else if (i10 == 3) {
                    this.f43322x -= t6Var.f40632a;
                } else if (i10 == 4) {
                    this.v -= t6Var.f40632a;
                } else if (i10 == 5) {
                    this.G -= t6Var.f40632a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        ai.b bVar = (ai.b) arrayList.get(i11);
                        String absolutePath = ((ai.b) arrayList.get(i11)).f738a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.f43321w -= bVar.f740c;
                        } else if (c10 == 0) {
                            this.f43323y -= bVar.f740c;
                        } else if (c10 == 1) {
                            this.E -= bVar.f740c;
                        } else {
                            this.h -= bVar.f740c;
                        }
                    }
                } else {
                    this.h -= t6Var.f40632a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (s6Var.d.size() == 0) {
            this.Y.f745b.remove(s6Var);
        }
        w0(true);
        if (cVar != null) {
            Iterator it = cVar.f751j.iterator();
            while (it.hasNext()) {
                ai.b bVar2 = (ai.b) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(bVar2)) {
                    long j14 = this.H;
                    long j15 = bVar2.f740c;
                    this.H = j14 - j15;
                    this.J += j15;
                    hashSet4.add(bVar2);
                    s6Var.b(bVar2);
                    int i12 = bVar2.d;
                    if (i12 == 0) {
                        this.f43323y -= bVar2.f740c;
                    } else if (i12 == 1) {
                        this.E -= bVar2.f740c;
                    } else if (i12 == 2) {
                        this.f43320s -= bVar2.f740c;
                    } else if (i12 == 3) {
                        this.f43322x -= bVar2.f740c;
                    } else if (i12 == 4) {
                        this.v -= bVar2.f740c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            ai.b bVar3 = (ai.b) it2.next();
            ai.c cVar2 = this.Y;
            if (cVar2.f751j.remove(bVar3)) {
                cVar2.f752k -= bVar3.f740c;
            }
            ArrayList e7 = cVar2.e(bVar3.d);
            if (e7 != null) {
                e7.remove(bVar3);
            }
        }
        org.telegram.ui.Components.qc Q = org.telegram.ui.Components.yc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.H)));
        Q.f29687r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new r1(this, arrayList2, b2Var, 3));
    }

    public final void m0() {
        if (this.Y.f751j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new b6(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    public final void o0(File file, int i10, LongSparseArray longSparseArray, ai.c cVar) {
        File[] listFiles;
        int i11;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (f43299k0) {
                    break;
                }
                if (file2.isDirectory()) {
                    o0(file2, i10, longSparseArray, cVar);
                } else if (!file2.getName().equals(".nomedia")) {
                    FilePathDatabase.FileMeta fileDialogId = getFileLoader().getFileDatabase().getFileDialogId(file2, null);
                    String lowerCase = file2.getName().toLowerCase();
                    if (!lowerCase.endsWith(".mp3") && !lowerCase.endsWith(".m4a")) {
                        i11 = i10;
                    } else {
                        i11 = 3;
                    }
                    ai.b bVar = new ai.b(file2);
                    long length = file2.length();
                    bVar.f740c = length;
                    if (fileDialogId != null) {
                        bVar.f739b = fileDialogId.dialogId;
                        bVar.f743g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        bVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    bVar.d = i11;
                    long j3 = bVar.f739b;
                    if (j3 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j3, null);
                        if (s6Var == null) {
                            s6Var = new s6(bVar.f739b);
                            longSparseArray.put(bVar.f739b, s6Var);
                        }
                        s6Var.a(bVar, i11);
                    }
                    if (i11 != 6) {
                        cVar.e(i11).add(bVar);
                    }
                }
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        ai.c cVar = this.Y;
        if (cVar != null && !cVar.f751j.isEmpty()) {
            if (z10) {
                this.Y.d();
                w6 w6Var = this.N;
                if (w6Var != null) {
                    w6Var.e(false);
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
        f43299k0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.f43312f = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new c6(this, 2));
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
            org.telegram.ui.ActionBar.b2 b2Var = this.d;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.d = null;
        f43299k0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f43305b.setPadding(0, (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + AndroidUtilities.statusBarHeight, 0, i13);
        this.f43305b.setClipToPadding(false);
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
        this.f43303a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f43306b0) {
            this.f43306b0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.f43310e;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f43304a0;
            if (i11 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i11);
            if (u6Var.f44071a == 11 && !u6Var.f40945i && (i10 = u6Var.f40943f) >= 0) {
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
                return this.f43323y;
            case 1:
                return this.E;
            case 2:
                return this.f43320s;
            case 3:
                return this.f43322x;
            case 4:
                return this.v;
            case 5:
                return this.f43321w;
            case 6:
                return this.G;
            case 7:
                return this.h;
            case 8:
                return this.f43319r;
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
        boolean[] zArr = this.f43310e;
        ArrayList arrayList = this.f43304a0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var = (u6) arrayList.get(i13);
                if (u6Var.f44071a != 11 || u6Var.f40945i || (i12 = u6Var.f40943f) < 0 || !zArr[i12]) {
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
                u6 u6Var2 = (u6) arrayList.get(i14);
                if (u6Var2.f44071a == 11 && !u6Var2.f40945i && (i11 = u6Var2.f40943f) >= 0) {
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
                u6 u6Var3 = (u6) arrayList.get(i16);
                if (u6Var3.f44071a == 11 && u6Var3.f40945i && (i10 = u6Var3.f40943f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f43305b.getChildCount(); i17++) {
            View childAt = this.f43305b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.z1) {
                this.f43305b.getClass();
                int R = RecyclerView.R(childAt);
                if (R >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(R);
                    if (u6Var4.f44071a == 11) {
                        int i18 = u6Var4.f40943f;
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
        v6 v6Var = this.Q;
        long j18 = 0;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.L;
            if (!z11 && this.H > 0) {
                org.telegram.ui.Components.dd[] ddVarArr = new org.telegram.ui.Components.dd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f43304a0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i10);
                    if (u6Var.f44071a == 11) {
                        int i11 = u6Var.f40943f;
                        boolean[] zArr = this.f43310e;
                        if (i11 < 0) {
                            if (this.M) {
                                long j19 = u6Var.f40944g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f25370c = j19;
                                obj.f25369b = z12;
                                ddVarArr[10] = obj;
                            }
                        } else {
                            long j20 = u6Var.f40944g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f25370c = j20;
                            obj2.f25369b = z13;
                            ddVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.U < 80) {
                    this.Q.f25648n.d(0.0f, true);
                }
                this.Q.f(this.H, true, ddVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.dd[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.dd[0]);
            }
        }
        p6 p6Var = this.S;
        if (p6Var != null && !this.L) {
            z6 z6Var = p6Var.d;
            boolean[] zArr2 = z6Var.f43310e;
            if (zArr2[0]) {
                j3 = z6Var.f43323y;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = z6Var.E;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = z6Var.f43320s;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = z6Var.f43322x;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = z6Var.v;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = z6Var.f43321w;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = z6Var.G;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = z6Var.h;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = z6Var.f43319r;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = z6Var.F;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = z6Var.f43304a0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    u6 u6Var2 = (u6) arrayList2.get(i12);
                    if (u6Var2.f44071a == 11) {
                        int i13 = u6Var2.f40943f;
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
        ai.c cVar;
        if (z10 && System.currentTimeMillis() - this.U < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.Z;
        arrayList.clear();
        ArrayList arrayList2 = this.f43304a0;
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
            z12 = true;
            j3 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList();
            if (this.f43323y > 0) {
                c10 = '\n';
                arrayList3.add(u6.b(0, this.f43323y, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c10 = '\n';
            }
            if (this.E > 0) {
                arrayList3.add(u6.b(1, this.E, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.f43320s > 0) {
                arrayList3.add(u6.b(2, this.f43320s, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.f43322x > 0) {
                arrayList3.add(u6.b(3, this.f43322x, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.v > 0) {
                arrayList3.add(u6.b(4, this.v, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.f43321w > 0) {
                j3 = 0;
                arrayList3.add(u6.b(5, this.f43321w, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j3 = 0;
            }
            if (this.G > j3) {
                arrayList3.add(u6.b(6, this.G, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.h > j3) {
                arrayList3.add(u6.b(7, this.h, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.f43319r > j3) {
                arrayList3.add(u6.b(8, this.f43319r, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.F > j3) {
                arrayList3.add(u6.b(9, this.F, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new f6(0));
                ((u6) arrayList3.get(arrayList3.size() - 1)).f40946j = true;
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
                        ((u6) arrayList3.get(i12)).f40945i = true;
                        j10 += ((u6) arrayList3.get(i12)).f40944g;
                        i11 += this.O[((u6) arrayList3.get(i12)).f40943f];
                    }
                    this.O[c10] = i11;
                    arrayList2.add(u6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
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
            arrayList2.add(new u6(13, (String) null));
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            u6 u6Var = new u6(1);
            u6Var.f40942e = string;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        u6 u6Var2 = new u6(1);
        u6Var2.f40942e = string2;
        arrayList2.add(u6Var2);
        if (this.I > j3) {
            arrayList2.add(new u6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new u6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            u6 u6Var3 = new u6(1);
            u6Var3.f40942e = string3;
            arrayList2.add(u6Var3);
        }
        if (z12 && (cVar = this.Y) != null && !cVar.h()) {
            arrayList2.add(new u6(8, (String) null));
        }
        x6 x6Var = this.f43303a;
        if (x6Var != null) {
            if (z11) {
                x6Var.E(arrayList, arrayList2);
            } else {
                x6Var.l();
            }
        }
        w6 w6Var = this.N;
        if (w6Var != null) {
            w6Var.c();
        }
    }
}
