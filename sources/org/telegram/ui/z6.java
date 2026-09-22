package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
    public static volatile boolean f40125l0 = false;
    public static long m0;
    public static Long f40126n0;
    public static Long f40127o0;
    public static Long f40128p0;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;
    public final long J;
    public boolean K;
    public boolean L;
    public w6 M;
    public FrameLayout N;
    public View O;
    public int P;
    public le.b Q;
    public le.b R;
    public int[] S;
    public float[] T;
    public v6 U;
    public k6 V;
    public p6 W;
    public kv X;
    public long Y;
    public h6 Z;
    public x6 f40129a;
    public org.telegram.ui.ActionBar.f1 f40130a0;
    public ai.w0 f40131b;
    public org.telegram.ui.ActionBar.f1 f40132b0;
    public org.telegram.ui.ActionBar.b2 f40133c;
    public zh.b f40134c0;
    public final boolean[] d;
    public final ArrayList f40135d0;
    public long e;
    public final ArrayList f40136e0;
    public long f40137f;
    public boolean f40138f0;
    public org.telegram.ui.ActionBar.z f40139g0;
    public long h;
    public org.telegram.ui.Components.o6 f40140h0;
    public org.telegram.ui.Components.o6 f40141i0;
    public TextView f40142j0;
    public final g6 f40143k0;
    public long f40144n;
    public long f40145r;
    public long f40146s;
    public long v;
    public long f40147w;
    public long f40148x;
    public long f40149y;

    public z6() {
        super(null);
        this.d = new boolean[]{true, true, true, true, true, true, true, true, true, true, true};
        this.e = -1L;
        this.f40137f = -1L;
        this.h = -1L;
        this.f40144n = -1L;
        this.f40145r = -1L;
        this.f40146s = -1L;
        this.v = -1L;
        this.f40147w = -1L;
        this.f40148x = -1L;
        this.f40149y = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = true;
        this.L = true;
        this.f40135d0 = new ArrayList();
        this.f40136e0 = new ArrayList();
        this.f40143k0 = new g6(this, 0);
    }

    public static void U(z6 z6Var, boolean z10, long j3, n6 n6Var) {
        if (z10) {
            ImageLoader.getInstance().clearMemory();
        }
        try {
            org.telegram.ui.ActionBar.b2 b2Var = z6Var.f40133c;
            if (b2Var != null) {
                b2Var.dismiss();
                z6Var.f40133c = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        z6Var.getMediaDataController().ringtoneDataStore.b();
        AndroidUtilities.runOnUIThread(new ai.j(z6Var, j3, 19), 150L);
        MediaDataController.getInstance(z6Var.currentAccount).checkAllMedia(true);
        z6Var.getFileLoader().getFileDatabase().getQueue().postRunnable(new d6(z6Var, 1));
        n6Var.run();
    }

    public static void V(z6 z6Var, float f7) {
        int i10 = (int) (f7 * 255.0f);
        z6Var.actionBar.setTitleColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), i10));
        z6Var.actionBar.setGlassCenterAlpha(i10);
        z6Var.x0();
        z6Var.fragmentView.invalidate();
    }

    public static void W(z6 z6Var, org.telegram.ui.ActionBar.b2 b2Var) {
        FileLoader.getInstance(z6Var.currentAccount).checkCurrentDownloadsFiles();
        try {
            b2Var.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void X(org.telegram.ui.z6 r22, org.telegram.ui.m6 r23, org.telegram.ui.n6 r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z6.X(org.telegram.ui.z6, org.telegram.ui.m6, org.telegram.ui.n6):void");
    }

    public static void Y(z6 z6Var, boolean z10) {
        if (z6Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(z6Var.getParentActivity(), 3, null);
        z6Var.f40133c = b2Var;
        b2Var.f18705g0 = false;
        b2Var.q(500L);
        MessagesController.getInstance(z6Var.currentAccount).clearQueryTime();
        if (z10) {
            z6Var.getMessagesStorage().fullReset();
        } else {
            z6Var.getMessagesStorage().clearLocalDatabase();
        }
    }

    public static org.telegram.ui.ActionBar.k Z(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static String a0(z6 z6Var, float f7) {
        if (f7 < 0.001f) {
            return String.format("<%.1f%%", Float.valueOf(0.1f));
        }
        float round = Math.round(f7 * 100.0f);
        if (round <= 0.0f) {
            return String.format("<%d%%", 1);
        }
        return String.format("%d%%", Integer.valueOf((int) round));
    }

    public static org.telegram.ui.ActionBar.k c0(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k d0(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static void f0(z6 z6Var, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z6Var.getParentActivity());
        String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
        b2Var.R = string;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LocalDatabaseClearText));
        spannableStringBuilder.append((CharSequence) "\n\n");
        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString("LocalDatabaseClearText2", R.string.LocalDatabaseClearText2, AndroidUtilities.formatFileSize(z6Var.e))));
        b2Var.T = spannableStringBuilder;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ai.k(4, z6Var, z10));
        z6Var.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
        }
    }

    public static void h0(z6 z6Var) {
        String formatPluralString;
        if (z6Var.f40134c0.f49523j.size() > 0) {
            if (z6Var.M != null) {
                if (!z6Var.f40134c0.f49525l.isEmpty()) {
                    ArrayList arrayList = z6Var.f40134c0.f49518b;
                    int size = arrayList.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        s6 s6Var = (s6) obj;
                        if (z6Var.f40134c0.f49525l.contains(Long.valueOf(s6Var.f37324a))) {
                            i10 += s6Var.f37325b;
                        }
                    }
                    int size2 = z6Var.f40134c0.f49523j.size() - i10;
                    if (size2 > 0) {
                        formatPluralString = a4.a.C(LocaleController.formatPluralString("Chats", z6Var.f40134c0.f49525l.size(), Integer.valueOf(z6Var.f40134c0.f49525l.size())), ", ", LocaleController.formatPluralString("Files", size2, Integer.valueOf(size2)));
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Chats", z6Var.f40134c0.f49525l.size(), Integer.valueOf(z6Var.f40134c0.f49525l.size()));
                    }
                } else {
                    formatPluralString = LocaleController.formatPluralString("Files", z6Var.f40134c0.f49523j.size(), Integer.valueOf(z6Var.f40134c0.f49523j.size()));
                }
                z6Var.f40140h0.c(AndroidUtilities.formatFileSize(z6Var.f40134c0.f49524k), !LocaleController.isRTL, true);
                z6Var.f40141i0.c(formatPluralString, !LocaleController.isRTL, true);
                z6Var.M.f(true);
                return;
            }
            return;
        }
        z6Var.M.f(false);
    }

    public static org.telegram.ui.ActionBar.k i0(z6 z6Var) {
        return z6Var.actionBar;
    }

    public static void j0(Utilities.Callback callback) {
        Long l4 = f40126n0;
        if (l4 != null) {
            callback.run(l4);
            if (System.currentTimeMillis() - m0 < 5000) {
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
        Long l10 = f40127o0;
        if (l10 != null && (l4 = f40128p0) != null) {
            b5Var.run(l10, l4);
        } else {
            Utilities.cacheClearQueue.postRunnable(new mu0(b5Var, 14));
        }
    }

    public static long q0(int i10, File file) {
        if (file != null && !f40125l0) {
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
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19199i6, false), false);
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.StorageUsage));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 22));
        this.f40139g0 = this.actionBar.j(null);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40139g0.addView(frameLayout, w7.y5.m(1.0f, 0, -1, 72, 0, 0));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f40140h0 = o6Var;
        org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.h;
        o6Var.b(0.35f, 350L, qrVar);
        this.f40140h0.setTextSize(AndroidUtilities.dp(18.0f));
        this.f40140h0.setTypeface(AndroidUtilities.bold());
        this.f40140h0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        frameLayout.addView(this.f40140h0, w7.y5.d(-1, 18.0f, 19, 0.0f, -11.0f, 18.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, true, true, true);
        this.f40141i0 = o6Var2;
        o6Var2.b(0.35f, 350L, qrVar);
        this.f40141i0.setTextSize(AndroidUtilities.dp(14.0f));
        this.f40141i0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19492y6, false));
        frameLayout.addView(this.f40141i0, w7.y5.d(-1, 18.0f, 19, 0.0f, 10.0f, 18.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f40142j0 = textView;
        textView.setTextSize(1, 14.0f);
        this.f40142j0.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        this.f40142j0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f40142j0.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f40142j0.setTypeface(AndroidUtilities.bold());
        this.f40142j0.setGravity(17);
        this.f40142j0.setText(LocaleController.getString(R.string.CacheClear));
        this.f40142j0.setOnClickListener(new a(this, 5));
        if (LocaleController.isRTL) {
            frameLayout.addView(this.f40142j0, w7.y5.d(-2, 28.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        } else {
            frameLayout.addView(this.f40142j0, w7.y5.d(-2, 28.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(2, R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f1 e = a2.e(3, R.drawable.msg_delete, LocaleController.getString(R.string.ClearLocalDatabase));
        this.f40130a0 = e;
        int i11 = org.telegram.ui.ActionBar.j6.f19330p7;
        e.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.ActionBar.f1 f1Var = this.f40130a0;
        int i12 = org.telegram.ui.ActionBar.j6.f19348q7;
        f1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
        this.f40130a0.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            org.telegram.ui.ActionBar.f1 e7 = a2.e(4, R.drawable.msg_delete, "Full Reset Database");
            this.f40132b0 = e7;
            e7.setIconColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.f40132b0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
            this.f40132b0.setSelectorColor(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        }
        if (this.f40130a0 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
            this.f40130a0.setText(spannableStringBuilder);
        }
        this.f40129a = new x6(this, context);
        h6 h6Var = new h6(this, context);
        this.Z = h6Var;
        this.fragmentView = h6Var;
        h6Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false));
        ai.w0 w0Var = new ai.w0(this, context, 5);
        this.f40131b = w0Var;
        w0Var.q1();
        this.f40131b.setVerticalScrollBarEnabled(false);
        this.f40131b.setLayoutManager(new gg.j0(1, this));
        h6Var.addView(this.f40131b, w7.y5.c(-1.0f, -1));
        this.f40131b.setAdapter(this.f40129a);
        i6 i6Var = new i6(this);
        i6Var.n(350L);
        i6Var.o(qrVar);
        i6Var.C = false;
        i6Var.f43030m = false;
        this.f40131b.setItemAnimator(i6Var);
        this.f40131b.setOnItemClickListener(new b6(this, 3));
        this.f40131b.j(new ci.v9(this, 1));
        View view = new View(context);
        this.O = view;
        h6Var.addView(view, w7.y5.e(-1, 0, 48));
        this.Q = new le.b(0, new b6(this, 4), qrVar, 380L, false);
        this.R = new le.b(1, new b6(this, 0), qrVar, 380L, false);
        x0();
        h6Var.addView(this.actionBar, w7.y5.c(-2.0f, -1));
        this.Z.setOuterListView(this.f40131b);
        getBaseSimpleGlass().b(h6Var, this.f40131b, this.actionBar, this.resourceProvider);
        getBaseSimpleGlass().f14340g = new li.a(1, this, h6Var);
        this.actionBar.setGlassCenterAlpha(0);
        this.O.setBackground(this.actionBar.getBackground());
        this.actionBar.setBackground(null);
        t0(0, 0);
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didClearDatabase) {
            try {
                org.telegram.ui.ActionBar.b2 b2Var = this.f40133c;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            this.f40133c = null;
            if (this.f40129a != null) {
                this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
                if (this.f40130a0 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ClearLocalDatabase));
                    this.f40130a0.setText(spannableStringBuilder);
                }
                y0(true);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 16, new Class[]{org.telegram.ui.Cells.fa.class, org.telegram.ui.Components.gw0.class, org.telegram.ui.Components.sy0.class, org.telegram.ui.Cells.n4.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19109d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19053a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19387s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19442v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19406t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19199i6));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.I6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.sy0.class}, new String[]{"paintFill"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.sy0.class}, new String[]{"paintProgress"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vi));
        int i12 = org.telegram.ui.ActionBar.j6.f19492y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.sy0.class}, new String[]{"telegramCacheTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.sy0.class}, new String[]{"freeSizeTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.sy0.class}, new String[]{"calculationgTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, null, null, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, null, null, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f40131b, 0, new Class[]{org.telegram.ui.Components.gw0.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, new String[]{"valueTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.a2.class}, org.telegram.ui.ActionBar.j6.f19231k0, null, null, org.telegram.ui.ActionBar.j6.f19110d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Components.qy0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f19180h5));
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
        if (!this.f40138f0) {
            return super.isLightStatusBar();
        }
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19053a7, false)) <= 0.721f) {
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
        w6 w6Var = this.M;
        if (w6Var != null && motionEvent != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            w6Var.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), ((int) motionEvent.getY()) - this.actionBar.getMeasuredHeight()) && this.M.h.f30849b != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void l0(s6 s6Var, org.telegram.ui.Components.py0[] py0VarArr, zh.b bVar) {
        t6 t6Var;
        HashSet hashSet;
        long j3;
        org.telegram.ui.Components.py0 py0Var;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
        b2Var.f18705g0 = false;
        b2Var.q(500L);
        HashSet hashSet2 = new HashSet();
        long j10 = this.G;
        int i10 = 0;
        while (i10 < 8) {
            if ((py0VarArr != null && ((py0Var = py0VarArr[i10]) == null || !py0Var.f27450c)) || (t6Var = (t6) s6Var.d.get(i10)) == null) {
                hashSet = hashSet2;
                j3 = j10;
            } else {
                ArrayList arrayList = t6Var.f37661b;
                hashSet2.addAll(arrayList);
                hashSet = hashSet2;
                long j11 = s6Var.f37326c;
                j3 = j10;
                long j12 = t6Var.f37660a;
                s6Var.f37326c = j11 - j12;
                this.G -= j12;
                this.I += j12;
                s6Var.d.delete(i10);
                if (i10 == 0) {
                    this.f40148x -= t6Var.f37660a;
                } else if (i10 == 1) {
                    this.f40149y -= t6Var.f37660a;
                } else if (i10 == 2) {
                    this.f40145r -= t6Var.f37660a;
                } else if (i10 == 3) {
                    this.f40147w -= t6Var.f37660a;
                } else if (i10 == 4) {
                    this.f40146s -= t6Var.f37660a;
                } else if (i10 == 5) {
                    this.F -= t6Var.f37660a;
                } else if (i10 == 7) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        zh.a aVar = (zh.a) arrayList.get(i11);
                        String absolutePath = ((zh.a) arrayList.get(i11)).f49512a.getAbsolutePath();
                        char c10 = 6;
                        if (s0(6, absolutePath)) {
                            c10 = 7;
                        } else if (s0(0, absolutePath) || s0(100, absolutePath)) {
                            c10 = 0;
                        } else if (s0(2, absolutePath) || s0(101, absolutePath)) {
                            c10 = 1;
                        }
                        if (c10 == 7) {
                            this.v -= aVar.f49514c;
                        } else if (c10 == 0) {
                            this.f40148x -= aVar.f49514c;
                        } else if (c10 == 1) {
                            this.f40149y -= aVar.f49514c;
                        } else {
                            this.f40137f -= aVar.f49514c;
                        }
                    }
                } else {
                    this.f40137f -= t6Var.f37660a;
                }
            }
            i10++;
            hashSet2 = hashSet;
            j10 = j3;
        }
        HashSet hashSet3 = hashSet2;
        long j13 = j10;
        if (s6Var.d.size() == 0) {
            this.f40134c0.f49518b.remove(s6Var);
        }
        y0(true);
        if (bVar != null) {
            Iterator it = bVar.f49523j.iterator();
            while (it.hasNext()) {
                zh.a aVar2 = (zh.a) it.next();
                HashSet hashSet4 = hashSet3;
                if (!hashSet4.contains(aVar2)) {
                    long j14 = this.G;
                    long j15 = aVar2.f49514c;
                    this.G = j14 - j15;
                    this.I += j15;
                    hashSet4.add(aVar2);
                    s6Var.b(aVar2);
                    int i12 = aVar2.d;
                    if (i12 == 0) {
                        this.f40148x -= aVar2.f49514c;
                    } else if (i12 == 1) {
                        this.f40149y -= aVar2.f49514c;
                    } else if (i12 == 2) {
                        this.f40145r -= aVar2.f49514c;
                    } else if (i12 == 3) {
                        this.f40147w -= aVar2.f49514c;
                    } else if (i12 == 4) {
                        this.f40146s -= aVar2.f49514c;
                    }
                }
                hashSet3 = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet3;
        Iterator it2 = hashSet5.iterator();
        while (it2.hasNext()) {
            zh.a aVar3 = (zh.a) it2.next();
            zh.b bVar2 = this.f40134c0;
            if (bVar2.f49523j.remove(aVar3)) {
                bVar2.f49524k -= aVar3.f49514c;
            }
            ArrayList e = bVar2.e(aVar3.d);
            if (e != null) {
                e.remove(aVar3);
            }
        }
        org.telegram.ui.Components.pc Q = org.telegram.ui.Components.xc.a0(this).Q(R.raw.ic_delete, 36, LocaleController.formatString(R.string.CacheWasCleared, AndroidUtilities.formatFileSize(j13 - this.G)));
        Q.f27319r = false;
        Q.j();
        ArrayList arrayList2 = new ArrayList(hashSet5);
        getFileLoader().getFileDatabase().removeFiles(arrayList2);
        getFileLoader().cancelLoadAllFiles();
        getFileLoader().getFileLoaderQueue().postRunnable(new q1(this, arrayList2, b2Var, 3));
    }

    public final void m0() {
        if (this.f40134c0.f49523j.size() != 0 && getParentActivity() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ClearCache);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.ClearCacheForChats);
            alertDialog$Builder.k(LocaleController.getString(R.string.Clear), new b6(this, 2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19348q7, false));
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
                if (f40125l0) {
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
                    aVar.f49514c = length;
                    if (fileDialogId != null) {
                        aVar.f49513b = fileDialogId.dialogId;
                        aVar.f49516g = fileDialogId.messageId;
                        int i12 = fileDialogId.messageType;
                        aVar.h = i12;
                        if (i12 == 23 && length > 0) {
                            i11 = 7;
                        }
                    }
                    aVar.d = i11;
                    long j3 = aVar.f49513b;
                    if (j3 != 0) {
                        s6 s6Var = (s6) longSparseArray.get(j3, null);
                        if (s6Var == null) {
                            s6Var = new s6(aVar.f49513b);
                            longSparseArray.put(aVar.f49513b, s6Var);
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

    @Override
    public final boolean onBackPressed(boolean z10) {
        zh.b bVar = this.f40134c0;
        if (bVar != null && !bVar.f49523j.isEmpty()) {
            if (z10) {
                this.f40134c0.d();
                w6 w6Var = this.M;
                if (w6Var != null) {
                    w6Var.f(false);
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
        f40125l0 = false;
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        this.e = MessagesStorage.getInstance(this.currentAccount).getDatabaseSize();
        Utilities.globalQueue.postRunnable(new d6(this, 2));
        this.Y = System.currentTimeMillis();
        y0(false);
        w0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        try {
            org.telegram.ui.ActionBar.b2 b2Var = this.f40133c;
            if (b2Var != null) {
                b2Var.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f40133c = null;
        f40125l0 = true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        t0(i11, i13);
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
        this.f40129a.l();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        if (f7 > 0.5f && !this.f40138f0) {
            this.f40138f0 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        super.onTransitionAnimationProgress(z10, f7);
    }

    public final boolean r0() {
        int i10;
        boolean[] zArr = this.d;
        int length = zArr.length;
        boolean[] zArr2 = new boolean[length];
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f40136e0;
            if (i11 >= arrayList.size()) {
                break;
            }
            u6 u6Var = (u6) arrayList.get(i11);
            if (u6Var.f15719a == 11 && !u6Var.f37972i && (i10 = u6Var.f37970f) >= 0) {
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

    public final void t0(int i10, int i11) {
        li.b.a(this.f40131b, i10, i11, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2);
        View view = this.O;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(44.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            this.O.setLayoutParams(layoutParams);
            x0();
        }
        w6 w6Var = this.M;
        if (w6Var != null) {
            w6Var.c(AndroidUtilities.dp(56.0f), this.f40131b.getPaddingBottom());
        }
        ai.w0 w0Var = this.f40131b;
        if (w0Var != null) {
            this.P = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
        }
        z0();
    }

    public final long u0(int i10) {
        switch (i10) {
            case 0:
                return this.f40148x;
            case 1:
                return this.f40149y;
            case 2:
                return this.f40145r;
            case 3:
                return this.f40147w;
            case 4:
                return this.f40146s;
            case 5:
                return this.v;
            case 6:
                return this.F;
            case 7:
                return this.f40137f;
            case 8:
                return this.f40144n;
            case 9:
                return this.E;
            default:
                return 0L;
        }
    }

    public final void v0(View view) {
        int i10;
        int i11;
        int i12;
        boolean r02 = r0();
        boolean[] zArr = this.d;
        ArrayList arrayList = this.f40136e0;
        if (r02) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                u6 u6Var = (u6) arrayList.get(i13);
                if (u6Var.f15719a != 11 || u6Var.f37972i || (i12 = u6Var.f37970f) < 0 || !zArr[i12]) {
                }
            }
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            if (view != null) {
                AndroidUtilities.shakeViewSpring(view, -3.0f);
                return;
            }
            return;
        }
        if (this.L) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                u6 u6Var2 = (u6) arrayList.get(i14);
                if (u6Var2.f15719a == 11 && !u6Var2.f37972i && (i11 = u6Var2.f37970f) >= 0) {
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
                if (u6Var3.f15719a == 11 && u6Var3.f37972i && (i10 = u6Var3.f37970f) >= 0) {
                    zArr[i10] = !r02;
                }
            }
        }
        for (int i17 = 0; i17 < this.f40131b.getChildCount(); i17++) {
            View childAt = this.f40131b.getChildAt(i17);
            if (childAt instanceof org.telegram.ui.Cells.a2) {
                this.f40131b.getClass();
                int S = RecyclerView.S(childAt);
                if (S >= 0) {
                    u6 u6Var4 = (u6) arrayList.get(S);
                    if (u6Var4.f15719a == 11) {
                        int i18 = u6Var4.f37970f;
                        if (i18 < 0) {
                            ((org.telegram.ui.Cells.a2) childAt).c(!r02, true);
                        } else {
                            ((org.telegram.ui.Cells.a2) childAt).c(zArr[i18], true);
                        }
                    }
                }
            }
        }
        w0();
    }

    public final void w0() {
        long j3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        v6 v6Var = this.U;
        long j18 = 0;
        boolean z10 = false;
        if (v6Var != null) {
            boolean z11 = this.K;
            if (!z11 && this.G > 0) {
                org.telegram.ui.Components.cd[] cdVarArr = new org.telegram.ui.Components.cd[11];
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f40136e0;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    u6 u6Var = (u6) arrayList.get(i10);
                    if (u6Var.f15719a == 11) {
                        int i11 = u6Var.f37970f;
                        boolean[] zArr = this.d;
                        if (i11 < 0) {
                            if (this.L) {
                                long j19 = u6Var.f37971g;
                                boolean z12 = zArr[10];
                                ?? obj = new Object();
                                obj.f23346c = j19;
                                obj.f23345b = z12;
                                cdVarArr[10] = obj;
                            }
                        } else {
                            long j20 = u6Var.f37971g;
                            boolean z13 = zArr[i11];
                            ?? obj2 = new Object();
                            obj2.f23346c = j20;
                            obj2.f23345b = z13;
                            cdVarArr[i11] = obj2;
                        }
                    }
                    i10++;
                }
                if (System.currentTimeMillis() - this.Y < 80) {
                    this.U.f23657n.d(0.0f, true);
                }
                this.U.f(this.G, true, cdVarArr);
            } else if (z11) {
                v6Var.f(-1L, true, new org.telegram.ui.Components.cd[0]);
            } else {
                v6Var.f(0L, true, new org.telegram.ui.Components.cd[0]);
            }
        }
        p6 p6Var = this.W;
        if (p6Var != null && !this.K) {
            z6 z6Var = p6Var.d;
            boolean[] zArr2 = z6Var.d;
            if (zArr2[0]) {
                j3 = z6Var.f40148x;
            } else {
                j3 = 0;
            }
            if (zArr2[1]) {
                j10 = z6Var.f40149y;
            } else {
                j10 = 0;
            }
            long j21 = j3 + j10;
            if (zArr2[2]) {
                j11 = z6Var.f40145r;
            } else {
                j11 = 0;
            }
            long j22 = j21 + j11;
            if (zArr2[3]) {
                j12 = z6Var.f40147w;
            } else {
                j12 = 0;
            }
            long j23 = j22 + j12;
            if (zArr2[4]) {
                j13 = z6Var.f40146s;
            } else {
                j13 = 0;
            }
            long j24 = j23 + j13;
            if (zArr2[5]) {
                j14 = z6Var.v;
            } else {
                j14 = 0;
            }
            long j25 = j24 + j14;
            if (zArr2[6]) {
                j15 = z6Var.F;
            } else {
                j15 = 0;
            }
            long j26 = j25 + j15;
            if (zArr2[7]) {
                j16 = z6Var.f40137f;
            } else {
                j16 = 0;
            }
            long j27 = j26 + j16;
            if (zArr2[8]) {
                j17 = z6Var.f40144n;
            } else {
                j17 = 0;
            }
            long j28 = j27 + j17;
            if (zArr2[9]) {
                j18 = z6Var.E;
            }
            long j29 = j28 + j18;
            ArrayList arrayList2 = z6Var.f40136e0;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    u6 u6Var2 = (u6) arrayList2.get(i12);
                    if (u6Var2.f15719a == 11) {
                        int i13 = u6Var2.f37970f;
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

    public final void x0() {
        float f7;
        View view = this.O;
        if (view == null) {
            return;
        }
        le.b bVar = this.Q;
        float f10 = 0.0f;
        if (bVar == null) {
            f7 = 0.0f;
        } else {
            f7 = bVar.e;
        }
        le.b bVar2 = this.R;
        if (bVar2 != null) {
            f10 = bVar2.e;
        }
        view.setTranslationY(((-(1.0f - f7)) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - ((1.0f - f10) * AndroidUtilities.dp(44.0f)));
    }

    public final void y0(boolean z10) {
        boolean z11;
        char c10;
        long j3;
        boolean z12;
        float[] fArr;
        zh.b bVar;
        if (z10 && System.currentTimeMillis() - this.Y < 80) {
            z11 = false;
        } else {
            z11 = z10;
        }
        ArrayList arrayList = this.f40135d0;
        arrayList.clear();
        ArrayList arrayList2 = this.f40136e0;
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
            if (this.f40148x > 0) {
                c10 = '\n';
                arrayList3.add(u6.b(0, this.f40148x, LocaleController.getString(R.string.LocalPhotoCache), org.telegram.ui.ActionBar.j6.lj));
            } else {
                c10 = '\n';
            }
            if (this.f40149y > 0) {
                arrayList3.add(u6.b(1, this.f40149y, LocaleController.getString(R.string.LocalVideoCache), org.telegram.ui.ActionBar.j6.hj));
            }
            if (this.f40145r > 0) {
                arrayList3.add(u6.b(2, this.f40145r, LocaleController.getString(R.string.LocalDocumentCache), org.telegram.ui.ActionBar.j6.ij));
            }
            if (this.f40147w > 0) {
                arrayList3.add(u6.b(3, this.f40147w, LocaleController.getString(R.string.LocalMusicCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.f40146s > 0) {
                arrayList3.add(u6.b(4, this.f40146s, LocaleController.getString(R.string.LocalAudioCache), org.telegram.ui.ActionBar.j6.mj));
            }
            if (this.v > 0) {
                j3 = 0;
                arrayList3.add(u6.b(5, this.v, LocaleController.getString(R.string.LocalStoriesCache), org.telegram.ui.ActionBar.j6.jj));
            } else {
                j3 = 0;
            }
            if (this.F > j3) {
                arrayList3.add(u6.b(6, this.F, LocaleController.getString(R.string.LocalStickersCache), org.telegram.ui.ActionBar.j6.nj));
            }
            if (this.f40137f > j3) {
                arrayList3.add(u6.b(7, this.f40137f, LocaleController.getString(R.string.LocalProfilePhotosCache), org.telegram.ui.ActionBar.j6.qj));
            }
            if (this.f40144n > j3) {
                arrayList3.add(u6.b(8, this.f40144n, LocaleController.getString(R.string.LocalMiscellaneousCache), org.telegram.ui.ActionBar.j6.pj));
            }
            if (this.E > j3) {
                arrayList3.add(u6.b(9, this.E, LocaleController.getString(R.string.LocalLogsCache), org.telegram.ui.ActionBar.j6.kj));
            }
            if (!arrayList3.isEmpty()) {
                Collections.sort(arrayList3, new a4.e(28));
                ((u6) arrayList3.get(arrayList3.size() - 1)).f37973j = true;
                if (this.T == null) {
                    this.T = new float[11];
                }
                int i10 = 0;
                while (true) {
                    fArr = this.T;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (float) u0(i10);
                    i10++;
                }
                if (this.S == null) {
                    this.S = new int[11];
                }
                AndroidUtilities.roundPercents(fArr, this.S);
                if (arrayList3.size() > 5) {
                    arrayList2.addAll(arrayList3.subList(0, 4));
                    long j10 = j3;
                    int i11 = 0;
                    for (int i12 = 4; i12 < arrayList3.size(); i12++) {
                        ((u6) arrayList3.get(i12)).f37972i = true;
                        j10 += ((u6) arrayList3.get(i12)).f37971g;
                        i11 += this.S[((u6) arrayList3.get(i12)).f37970f];
                    }
                    this.S[c10] = i11;
                    arrayList2.add(u6.b(-1, j10, LocaleController.getString(R.string.LocalOther), org.telegram.ui.ActionBar.j6.kj));
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
            String string = LocaleController.getString(R.string.StorageUsageInfo);
            u6 u6Var = new u6(1);
            u6Var.e = string;
            arrayList2.add(u6Var);
        }
        arrayList2.add(new u6(3, LocaleController.getString(R.string.AutoDeleteCachedMedia)));
        arrayList2.add(new u6(0, 0));
        arrayList2.add(new u6(1, 0));
        arrayList2.add(new u6(2, 0));
        arrayList2.add(new u6(3, 0));
        String string2 = LocaleController.getString(R.string.KeepMediaInfoPart);
        u6 u6Var2 = new u6(1);
        u6Var2.e = string2;
        arrayList2.add(u6Var2);
        if (this.H > j3) {
            arrayList2.add(new u6(3, LocaleController.getString(R.string.MaxCacheSize)));
            arrayList2.add(new u6(14));
            String string3 = LocaleController.getString(R.string.MaxCacheSizeInfo);
            u6 u6Var3 = new u6(1);
            u6Var3.e = string3;
            arrayList2.add(u6Var3);
        }
        if (z12 && (bVar = this.f40134c0) != null && !bVar.h()) {
            arrayList2.add(new u6(8, (String) null));
        }
        x6 x6Var = this.f40129a;
        if (x6Var != null) {
            if (z11) {
                x6Var.E(arrayList, arrayList2);
            } else {
                x6Var.l();
            }
        }
        w6 w6Var = this.M;
        if (w6Var != null) {
            w6Var.d();
        }
    }

    public final void z0() {
        w6 w6Var;
        boolean z10;
        if (this.N != null && (w6Var = this.M) != null && this.Z != null) {
            if (!w6Var.isAttachedToWindow()) {
                this.N.setVisibility(4);
                le.b bVar = this.R;
                if (bVar != null && bVar.f14185f) {
                    bVar.a(false, true);
                    return;
                }
                return;
            }
            View view = this.M;
            h6 h6Var = this.Z;
            float f7 = 0.0f;
            float f10 = 0.0f;
            while (view != null && view != h6Var) {
                f10 += view.getY();
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            View view2 = this.f40131b;
            h6 h6Var2 = this.Z;
            while (view2 != null && view2 != h6Var2) {
                f7 += view2.getY();
                ViewParent parent2 = view2.getParent();
                if (parent2 instanceof View) {
                    view2 = (View) parent2;
                } else {
                    view2 = null;
                }
            }
            float f11 = f7 + this.P;
            if (f10 <= f11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = f11;
            }
            if (this.N.getTranslationY() != f10) {
                this.N.setTranslationY(f10);
            }
            if (this.N.getVisibility() != 0) {
                this.N.setVisibility(0);
            }
            le.b bVar2 = this.R;
            if (bVar2 != null && bVar2.f14185f != z10) {
                bVar2.a(z10, true);
            }
        }
    }
}
