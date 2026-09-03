package org.telegram.ui.web;

import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.oo;
import org.telegram.ui.qi1;
import ph.a9;
import ph.b8;
import ph.ca;
import ph.da;
import ph.e9;
import ph.f3;
import ph.h9;
import ph.i9;
import ph.l4;
import ph.r5;
import ph.s5;
import ph.v8;
import ph.x2;
import ph.z2;
public final class q0 implements Runnable {
    public final int f39560a;
    public final Object f39561b;

    public q0(Object obj, int i10) {
        this.f39560a = i10;
        this.f39561b = obj;
    }

    @Override
    public final void run() {
        long j10;
        int i10;
        switch (this.f39560a) {
            case 0:
                ((ut) this.f39561b).requestFocus();
                return;
            case 1:
                ze.d.s(((u0) this.f39561b).f39592b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                f1 f1Var = (f1) this.f39561b;
                Utilities.searchQueue.postRunnable(new m71(f1Var, new ArrayList(f1Var.h.e), f1Var.h.f39450n, 6));
                return;
            case 3:
                HttpGetFileTask.a((HttpGetFileTask) this.f39561b);
                return;
            case 4:
                ((org.telegram.ui.Cells.m1) this.f39561b).invalidateSelf();
                return;
            case 5:
                y1 y1Var = (y1) this.f39561b;
                File databasePath = ApplicationLoader.applicationContext.getDatabasePath("webview.db");
                long j11 = 0;
                if (databasePath != null && databasePath.exists()) {
                    j10 = databasePath.length();
                } else {
                    j10 = 0;
                }
                File databasePath2 = ApplicationLoader.applicationContext.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    j10 += databasePath2.length();
                }
                File file = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    j10 += y1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += y1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = y1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new oo(y1Var, j10, j11, 1));
                return;
            case 6:
                ((boolean[]) this.f39561b)[0] = true;
                return;
            case 7:
                ((ph.g) this.f39561b).f41712c.T = false;
                return;
            case 8:
                ((ph.j) this.f39561b).invalidateSelf();
                return;
            case 9:
                ((ph.x) this.f39561b).f42556g = -1L;
                return;
            case 10:
                ph.f0 f0Var = (ph.f0) this.f39561b;
                dg.i iVar = f0Var.f41634b.E;
                if (iVar != null) {
                    iVar.b();
                }
                f0Var.f41634b.k();
                return;
            case 11:
                ((ph.o0) this.f39561b).a(false);
                return;
            case 12:
                ic.e();
                eg.o1 o1Var = new eg.o1((p2) new eg.y1((l4) this.f39561b), 14, false);
                o1Var.setOnDismissListener(new dg.e0(7));
                o1Var.show();
                return;
            case 13:
                ((ph.f1) this.f39561b).G();
                return;
            case 14:
                ph.m1 m1Var = (ph.m1) this.f39561b;
                ArrayList arrayList = m1Var.v;
                ArrayList arrayList2 = m1Var.f42001s;
                ph.n1 n1Var = m1Var.K;
                ph.y1 y1Var2 = n1Var.f42040s;
                MediaDataController mediaDataController = MediaDataController.getInstance(ph.y1.T(y1Var2));
                String str = m1Var.E;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    m1Var.f42003x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    m1Var.f42004y.clear();
                    m1Var.f41999n.clear();
                    m1Var.f42003x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    m1Var.f42003x = recentStickers.size() + m1Var.f42003x;
                    m1Var.F = m1Var.E;
                    m1Var.l();
                    ph.d1.v1(n1Var.f42035b, 0, 0);
                    n1Var.f42037f.c(false);
                    n1Var.e.n(false);
                    return;
                } else if (n1Var.f41768a == 1 && Emoji.fullyConsistsOfEmojis(m1Var.E)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = m1Var.E;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(ph.y1.V(y1Var2)).sendRequest(tL_messages_getStickers, new qi1(1, m1Var, str));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = m1Var.G;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(ph.y1.W(y1Var2)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    m1Var.G = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, m1Var.E, false, new ph.l1(m1Var, str, mediaDataController, 0), null, false, false, false, true, 50, false);
                    return;
                }
            case 15:
                ph.r1 r1Var = (ph.r1) ((dh.c) this.f39561b).f4892b;
                if (!r1Var.h) {
                    r1Var.f42271n.setVisibility(8);
                    return;
                }
                return;
            case 16:
                ph.v1 v1Var = (ph.v1) ((h50) this.f39561b).f25318b;
                ArrayList arrayList3 = v1Var.f42504o;
                if (!arrayList3.isEmpty()) {
                    v1Var.f42501l.d(0.0f, true);
                    int i11 = v1Var.f42500k + 1;
                    v1Var.f42500k = i11;
                    if (i11 > arrayList3.size() - 1) {
                        v1Var.f42500k = 0;
                    }
                    mg.h0 h0Var = v1Var.f42499j;
                    h0Var.e((mg.q0) arrayList3.get(v1Var.f42500k));
                    v1Var.f42499j = v1Var.f42498i;
                    v1Var.f42498i = h0Var;
                    v1Var.f42505p.invalidate();
                    return;
                }
                return;
            case 17:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f39561b);
                return;
            case 18:
                ((x2) this.f39561b).b(null);
                return;
            case 19:
                ((z2) this.f39561b).E();
                return;
            case 20:
                v8 v8Var = (v8) this.f39561b;
                if (v8Var.F) {
                    v8Var.F = false;
                    v8Var.invalidate();
                    return;
                }
                return;
            case 21:
                s5 s5Var = ((r5) this.f39561b).f42287p;
                s5Var.N = System.currentTimeMillis();
                s5Var.O = 0L;
                s5Var.f42356o0 = true;
                ((a9) s5Var.f42338a).f41310a.G0.a(0L, true);
                s5Var.invalidate();
                return;
            case 22:
                ph.n nVar = (ph.n) this.f39561b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 23:
                ph.d dVar = (ph.d) this.f39561b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 24:
                ((b8) ((kg.j) this.f39561b).f10544n).fullScroll(130);
                return;
            case 25:
                ca caVar = (ca) this.f39561b;
                caVar.f41445u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                caVar.f41444t0.w2(AndroidUtilities.emptyMotionEvent());
                return;
            case 26:
                da daVar = ((e9) this.f39561b).f41630h0;
                daVar.v(true);
                daVar.f41585x0.setCameraThumb(daVar.A());
                return;
            case 27:
                ((h9) this.f39561b).f41755x2.f41548m1.setVisibility(8);
                return;
            case 28:
                i9 i9Var = (i9) this.f39561b;
                da daVar2 = i9Var.V;
                if (!daVar2.N1 && !daVar2.M1 && daVar2.f41589y0 != null && daVar2.f41518c0 == 0 && daVar2.f41541j1 != null) {
                    if (i9Var.isFrontface()) {
                        i10 = R.string.StoryCameraSavedDualBackHint;
                    } else {
                        i10 = R.string.StoryCameraSavedDualFrontHint;
                    }
                    String string = LocaleController.getString(i10);
                    f3 f3Var = daVar2.f41541j1;
                    f3Var.h = f3.a(string, f3Var.getTextPaint());
                    daVar2.f41541j1.s(string);
                    daVar2.f41541j1.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    return;
                }
                return;
            default:
                ((p9) this.f39561b).setVisibility(8);
                return;
        }
    }
}
