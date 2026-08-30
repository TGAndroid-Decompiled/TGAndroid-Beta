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
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.ii1;
import org.telegram.ui.mo;
import ph.a9;
import ph.c8;
import ph.ca;
import ph.da;
import ph.e9;
import ph.f3;
import ph.h9;
import ph.i9;
import ph.l4;
import ph.s5;
import ph.t5;
import ph.w8;
import ph.x2;
import ph.z2;
public final class o0 implements Runnable {
    public final int f39592a;
    public final Object f39593b;

    public o0(Object obj, int i10) {
        this.f39592a = i10;
        this.f39593b = obj;
    }

    @Override
    public final void run() {
        long j10;
        int i10;
        switch (this.f39592a) {
            case 0:
                ((vt) this.f39593b).requestFocus();
                return;
            case 1:
                af.g.s(((s0) this.f39593b).f39626b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 2:
                d1 d1Var = (d1) this.f39593b;
                Utilities.searchQueue.postRunnable(new m71(d1Var, new ArrayList(d1Var.h.e), d1Var.h.f39477n, 7));
                return;
            case 3:
                HttpGetFileTask.a((HttpGetFileTask) this.f39593b);
                return;
            case 4:
                ((org.telegram.ui.Cells.n1) this.f39593b).invalidateSelf();
                return;
            case 5:
                x1 x1Var = (x1) this.f39593b;
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
                    j10 += x1.Z(file, Boolean.FALSE);
                }
                File file2 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    j10 += x1.Z(file2, null);
                }
                File file3 = new File(ApplicationLoader.applicationContext.getApplicationInfo().dataDir, "app_webview");
                if (file3.exists()) {
                    j11 = x1.Z(file3, Boolean.TRUE);
                }
                AndroidUtilities.runOnUIThread(new mo(x1Var, j10, j11, 1));
                return;
            case 6:
                ((boolean[]) this.f39593b)[0] = true;
                return;
            case 7:
                ((ph.g) this.f39593b).f41671c.T = false;
                return;
            case 8:
                ((ph.j) this.f39593b).invalidateSelf();
                return;
            case 9:
                ((ph.x) this.f39593b).f42522g = -1L;
                return;
            case 10:
                ph.f0 f0Var = (ph.f0) this.f39593b;
                dg.i iVar = f0Var.f41594b.E;
                if (iVar != null) {
                    iVar.b();
                }
                f0Var.f41594b.k();
                return;
            case 11:
                ((ph.o0) this.f39593b).a(false);
                return;
            case 12:
                ic.e();
                eg.o1 o1Var = new eg.o1((p2) new eg.y1((l4) this.f39593b), 14, false);
                o1Var.setOnDismissListener(new dg.e0(7));
                o1Var.show();
                return;
            case 13:
                ((ph.g1) this.f39593b).G();
                return;
            case 14:
                ph.n1 n1Var = (ph.n1) this.f39593b;
                ArrayList arrayList = n1Var.v;
                ArrayList arrayList2 = n1Var.f42000s;
                ph.o1 o1Var2 = n1Var.K;
                ph.y1 y1Var = o1Var2.f42043s;
                MediaDataController mediaDataController = MediaDataController.getInstance(ph.y1.T(y1Var));
                String str = n1Var.E;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    n1Var.f42002x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    n1Var.f42003y.clear();
                    n1Var.f41998n.clear();
                    n1Var.f42002x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    n1Var.f42002x = recentStickers.size() + n1Var.f42002x;
                    n1Var.F = n1Var.E;
                    n1Var.l();
                    ph.d1.w1(o1Var2.f42038b, 0, 0);
                    o1Var2.f42040f.c(false);
                    o1Var2.e.n(false);
                    return;
                } else if (o1Var2.f41774a == 1 && Emoji.fullyConsistsOfEmojis(n1Var.E)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = n1Var.E;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(ph.y1.V(y1Var)).sendRequest(tL_messages_getStickers, new ii1(1, n1Var, str));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = n1Var.G;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(ph.y1.W(y1Var)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    n1Var.G = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, n1Var.E, false, new ph.m1(n1Var, str, mediaDataController, 0), null, false, false, false, true, 50, false);
                    return;
                }
            case 15:
                ph.s1 s1Var = (ph.s1) ((dh.c) this.f39593b).f4886b;
                if (!s1Var.h) {
                    s1Var.f42300n.setVisibility(8);
                    return;
                }
                return;
            case 16:
                ph.v1 v1Var = (ph.v1) ((g50) this.f39593b).f25049b;
                ArrayList arrayList3 = v1Var.f42472o;
                if (!arrayList3.isEmpty()) {
                    v1Var.f42469l.d(0.0f, true);
                    int i11 = v1Var.f42468k + 1;
                    v1Var.f42468k = i11;
                    if (i11 > arrayList3.size() - 1) {
                        v1Var.f42468k = 0;
                    }
                    mg.h0 h0Var = v1Var.f42467j;
                    h0Var.e((mg.q0) arrayList3.get(v1Var.f42468k));
                    v1Var.f42467j = v1Var.f42466i;
                    v1Var.f42466i = h0Var;
                    v1Var.f42473p.invalidate();
                    return;
                }
                return;
            case 17:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f39593b);
                return;
            case 18:
                ((x2) this.f39593b).b(null);
                return;
            case 19:
                ((z2) this.f39593b).E();
                return;
            case 20:
                w8 w8Var = (w8) this.f39593b;
                if (w8Var.F) {
                    w8Var.F = false;
                    w8Var.invalidate();
                    return;
                }
                return;
            case 21:
                t5 t5Var = ((s5) this.f39593b).f42308p;
                t5Var.N = System.currentTimeMillis();
                t5Var.O = 0L;
                t5Var.f42350o0 = true;
                ((a9) t5Var.f42332a).f41281a.G0.a(0L, true);
                t5Var.invalidate();
                return;
            case 22:
                ph.n nVar = (ph.n) this.f39593b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 23:
                ph.d dVar = (ph.d) this.f39593b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 24:
                ((c8) ((kg.j) this.f39593b).f10434n).fullScroll(130);
                return;
            case 25:
                ca caVar = (ca) this.f39593b;
                caVar.f41395u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                caVar.f41394t0.v0(AndroidUtilities.emptyMotionEvent());
                return;
            case 26:
                da daVar = ((e9) this.f39593b).f41590h0;
                daVar.v(true);
                daVar.f41547x0.setCameraThumb(daVar.A());
                return;
            case 27:
                ((h9) this.f39593b).f41720x2.f41510m1.setVisibility(8);
                return;
            case 28:
                i9 i9Var = (i9) this.f39593b;
                da daVar2 = i9Var.V;
                if (!daVar2.N1 && !daVar2.M1 && daVar2.f41551y0 != null && daVar2.f41480c0 == 0 && daVar2.f41503j1 != null) {
                    if (i9Var.isFrontface()) {
                        i10 = R.string.StoryCameraSavedDualBackHint;
                    } else {
                        i10 = R.string.StoryCameraSavedDualFrontHint;
                    }
                    String string = LocaleController.getString(i10);
                    f3 f3Var = daVar2.f41503j1;
                    f3Var.h = f3.a(string, f3Var.getTextPaint());
                    daVar2.f41503j1.t(string);
                    daVar2.f41503j1.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    return;
                }
                return;
            default:
                ((p9) this.f39593b).setVisibility(8);
                return;
        }
    }
}
