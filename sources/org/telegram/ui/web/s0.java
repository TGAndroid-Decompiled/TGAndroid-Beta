package org.telegram.ui.web;

import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import oh.d6;
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
import org.telegram.ui.Components.i50;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.li1;
import org.telegram.ui.mo;
import qh.a8;
import qh.ba;
import qh.c9;
import qh.ca;
import qh.f3;
import qh.f9;
import qh.g9;
import qh.l4;
import qh.q5;
import qh.r5;
import qh.u8;
import qh.x2;
import qh.y8;
import qh.z2;
public final class s0 implements Runnable {
    public final int f42686a;
    public final Object f42687b;

    public s0(Object obj, int i10) {
        this.f42686a = i10;
        this.f42687b = obj;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        int i10;
        switch (this.f42686a) {
            case 0:
                af.g.s(((t0) this.f42687b).f42698b.f42738e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                e1 e1Var = (e1) this.f42687b;
                Utilities.searchQueue.postRunnable(new o71(e1Var, new ArrayList(e1Var.h.f42535e), e1Var.h.f42537n, 7));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f42687b);
                return;
            case 3:
                ((org.telegram.ui.Cells.n1) this.f42687b).invalidateSelf();
                return;
            case 4:
                y1 y1Var = (y1) this.f42687b;
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
                AndroidUtilities.runOnUIThread(new mo(y1Var, j10, j11, 1));
                return;
            case 5:
                ((boolean[]) this.f42687b)[0] = true;
                return;
            case 6:
                ((mi) this.f42687b).hide();
                return;
            case 7:
                ph.l lVar = (ph.l) this.f42687b;
                or0 or0Var = lVar.T;
                d6 d6Var = lVar.f44391a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                or0Var.a(str);
                return;
            case 8:
                ((qh.g) this.f42687b).f45348c.T = false;
                return;
            case 9:
                ((qh.j) this.f42687b).invalidateSelf();
                return;
            case 10:
                ((qh.x) this.f42687b).f46249g = -1L;
                return;
            case 11:
                qh.f0 f0Var = (qh.f0) this.f42687b;
                eg.i iVar = f0Var.f45273b.E;
                if (iVar != null) {
                    iVar.b();
                }
                f0Var.f45273b.k();
                return;
            case 12:
                ((qh.o0) this.f42687b).a(false);
                return;
            case 13:
                ic.e();
                fg.n1 n1Var = new fg.n1((p2) new fg.x1((l4) this.f42687b), 14, false);
                n1Var.setOnDismissListener(new eg.c0(7));
                n1Var.show();
                return;
            case 14:
                ((qh.g1) this.f42687b).G();
                return;
            case 15:
                qh.n1 n1Var2 = (qh.n1) this.f42687b;
                ArrayList arrayList = n1Var2.v;
                ArrayList arrayList2 = n1Var2.f45760s;
                qh.o1 o1Var = n1Var2.K;
                qh.y1 y1Var2 = o1Var.f45826s;
                MediaDataController mediaDataController = MediaDataController.getInstance(qh.y1.T(y1Var2));
                String str2 = n1Var2.E;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    n1Var2.f45762x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    n1Var2.f45763y.clear();
                    n1Var2.f45758n.clear();
                    n1Var2.f45762x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    n1Var2.f45762x = recentStickers.size() + n1Var2.f45762x;
                    n1Var2.F = n1Var2.E;
                    n1Var2.l();
                    qh.d1.w1(o1Var.f45820b, 0, 0);
                    o1Var.f45823f.c(false);
                    o1Var.f45822e.n(false);
                    return;
                } else if (o1Var.f45454a == 1 && Emoji.fullyConsistsOfEmojis(n1Var2.E)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = n1Var2.E;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(qh.y1.V(y1Var2)).sendRequest(tL_messages_getStickers, new li1(1, n1Var2, str2));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = n1Var2.G;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(qh.y1.W(y1Var2)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    n1Var2.G = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, n1Var2.E, false, new qh.m1(n1Var2, str2, mediaDataController, 0), null, false, false, false, true, 50, false);
                    return;
                }
            case 16:
                qh.s1 s1Var = (qh.s1) ((eh.c) this.f42687b).f5618b;
                if (!s1Var.h) {
                    s1Var.f46032n.setVisibility(8);
                    return;
                }
                return;
            case 17:
                qh.v1 v1Var = (qh.v1) ((i50) this.f42687b).f27674b;
                ArrayList arrayList3 = v1Var.f46186o;
                if (!arrayList3.isEmpty()) {
                    v1Var.f46183l.d(0.0f, true);
                    int i11 = v1Var.f46182k + 1;
                    v1Var.f46182k = i11;
                    if (i11 > arrayList3.size() - 1) {
                        v1Var.f46182k = 0;
                    }
                    ng.h0 h0Var = v1Var.f46181j;
                    h0Var.e((ng.q0) arrayList3.get(v1Var.f46182k));
                    v1Var.f46181j = v1Var.f46180i;
                    v1Var.f46180i = h0Var;
                    v1Var.f46187p.invalidate();
                    return;
                }
                return;
            case 18:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f42687b);
                return;
            case 19:
                ((x2) this.f42687b).b(null);
                return;
            case 20:
                ((z2) this.f42687b).E();
                return;
            case 21:
                u8 u8Var = (u8) this.f42687b;
                if (u8Var.F) {
                    u8Var.F = false;
                    u8Var.invalidate();
                    return;
                }
                return;
            case 22:
                r5 r5Var = ((q5) this.f42687b).f45914p;
                r5Var.N = System.currentTimeMillis();
                r5Var.O = 0L;
                r5Var.f45965o0 = true;
                ((y8) r5Var.f45946a).f46362a.G0.a(0L, true);
                r5Var.invalidate();
                return;
            case 23:
                qh.n nVar = (qh.n) this.f42687b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 24:
                qh.d dVar = (qh.d) this.f42687b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 25:
                ((a8) ((lg.j) this.f42687b).f12557n).fullScroll(130);
                return;
            case 26:
                ba baVar = (ba) this.f42687b;
                baVar.f45025u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                baVar.f45024t0.J(AndroidUtilities.emptyMotionEvent());
                return;
            case 27:
                ca caVar = ((c9) this.f42687b).f45073h0;
                caVar.v(true);
                caVar.f45150x0.setCameraThumb(caVar.A());
                return;
            case 28:
                ((f9) this.f42687b).f45335x2.f45113m1.setVisibility(8);
                return;
            default:
                g9 g9Var = (g9) this.f42687b;
                ca caVar2 = g9Var.V;
                if (!caVar2.N1 && !caVar2.M1 && caVar2.f45154y0 != null && caVar2.f45082c0 == 0 && caVar2.f45106j1 != null) {
                    if (g9Var.isFrontface()) {
                        i10 = R.string.StoryCameraSavedDualBackHint;
                    } else {
                        i10 = R.string.StoryCameraSavedDualFrontHint;
                    }
                    String string = LocaleController.getString(i10);
                    f3 f3Var = caVar2.f45106j1;
                    f3Var.h = f3.a(string, f3Var.getTextPaint());
                    caVar2.f45106j1.t(string);
                    caVar2.f45106j1.v();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    return;
                }
                return;
        }
    }
}
