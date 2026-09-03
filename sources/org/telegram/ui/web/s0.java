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
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.mo;
import org.telegram.ui.ri1;
import qh.aa;
import qh.b9;
import qh.ba;
import qh.e3;
import qh.e9;
import qh.f9;
import qh.k4;
import qh.p5;
import qh.q5;
import qh.t8;
import qh.w2;
import qh.x8;
import qh.y2;
import qh.z7;
public final class s0 implements Runnable {
    public final int f42649a;
    public final Object f42650b;

    public s0(Object obj, int i10) {
        this.f42649a = i10;
        this.f42650b = obj;
    }

    @Override
    public final void run() {
        long j10;
        String str;
        int i10;
        switch (this.f42649a) {
            case 0:
                af.g.s(((t0) this.f42650b).f42661b.f42701e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 1:
                e1 e1Var = (e1) this.f42650b;
                Utilities.searchQueue.postRunnable(new n71(e1Var, new ArrayList(e1Var.h.f42498e), e1Var.h.f42500n, 7));
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) this.f42650b);
                return;
            case 3:
                ((org.telegram.ui.Cells.n1) this.f42650b).invalidateSelf();
                return;
            case 4:
                x1 x1Var = (x1) this.f42650b;
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
            case 5:
                ((boolean[]) this.f42650b)[0] = true;
                return;
            case 6:
                ((mi) this.f42650b).hide();
                return;
            case 7:
                ph.l lVar = (ph.l) this.f42650b;
                nr0 nr0Var = lVar.T;
                d6 d6Var = lVar.f44422a;
                if (d6Var == null) {
                    str = "";
                } else {
                    str = d6Var.E;
                }
                nr0Var.a(str);
                return;
            case 8:
                ((qh.g) this.f42650b).f45352c.T = false;
                return;
            case 9:
                ((qh.j) this.f42650b).invalidateSelf();
                return;
            case 10:
                ((qh.x) this.f42650b).f46289g = -1L;
                return;
            case 11:
                qh.f0 f0Var = (qh.f0) this.f42650b;
                eg.i iVar = f0Var.f45321b.E;
                if (iVar != null) {
                    iVar.b();
                }
                f0Var.f45321b.k();
                return;
            case 12:
                ((qh.o0) this.f42650b).a(false);
                return;
            case 13:
                ic.e();
                fg.n1 n1Var = new fg.n1((p2) new fg.x1((k4) this.f42650b), 14, false);
                n1Var.setOnDismissListener(new eg.c0(7));
                n1Var.show();
                return;
            case 14:
                ((qh.f1) this.f42650b).G();
                return;
            case 15:
                qh.m1 m1Var = (qh.m1) this.f42650b;
                ArrayList arrayList = m1Var.v;
                ArrayList arrayList2 = m1Var.f45737s;
                qh.n1 n1Var2 = m1Var.K;
                qh.x1 x1Var2 = n1Var2.f45798s;
                MediaDataController mediaDataController = MediaDataController.getInstance(qh.x1.T(x1Var2));
                String str2 = m1Var.E;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    m1Var.f45739x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    m1Var.f45740y.clear();
                    m1Var.f45735n.clear();
                    m1Var.f45739x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    m1Var.f45739x = recentStickers.size() + m1Var.f45739x;
                    m1Var.F = m1Var.E;
                    m1Var.l();
                    qh.d1.v1(n1Var2.f45792b, 0, 0);
                    n1Var2.f45795f.c(false);
                    n1Var2.f45794e.n(false);
                    return;
                } else if (n1Var2.f45424a == 1 && Emoji.fullyConsistsOfEmojis(m1Var.E)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = m1Var.E;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(qh.x1.V(x1Var2)).sendRequest(tL_messages_getStickers, new ri1(1, m1Var, str2));
                    return;
                } else {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    String[] strArr = m1Var.G;
                    if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                        MediaDataController.getInstance(qh.x1.W(x1Var2)).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    m1Var.G = currentKeyboardLanguage;
                    mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, m1Var.E, false, new qh.l1(m1Var, str2, mediaDataController, 0), null, false, false, false, true, 50, false);
                    return;
                }
            case 16:
                qh.r1 r1Var = (qh.r1) ((eh.c) this.f42650b).f5618b;
                if (!r1Var.h) {
                    r1Var.f45983n.setVisibility(8);
                    return;
                }
                return;
            case 17:
                qh.u1 u1Var = (qh.u1) ((i50) this.f42650b).f27718b;
                ArrayList arrayList3 = u1Var.f46162o;
                if (!arrayList3.isEmpty()) {
                    u1Var.f46159l.d(0.0f, true);
                    int i11 = u1Var.f46158k + 1;
                    u1Var.f46158k = i11;
                    if (i11 > arrayList3.size() - 1) {
                        u1Var.f46158k = 0;
                    }
                    ng.h0 h0Var = u1Var.f46157j;
                    h0Var.e((ng.q0) arrayList3.get(u1Var.f46158k));
                    u1Var.f46157j = u1Var.f46156i;
                    u1Var.f46156i = h0Var;
                    u1Var.f46163p.invalidate();
                    return;
                }
                return;
            case 18:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.f42650b);
                return;
            case 19:
                ((w2) this.f42650b).b(null);
                return;
            case 20:
                ((y2) this.f42650b).E();
                return;
            case 21:
                t8 t8Var = (t8) this.f42650b;
                if (t8Var.F) {
                    t8Var.F = false;
                    t8Var.invalidate();
                    return;
                }
                return;
            case 22:
                q5 q5Var = ((p5) this.f42650b).f45896p;
                q5Var.N = System.currentTimeMillis();
                q5Var.O = 0L;
                q5Var.f45944o0 = true;
                ((x8) q5Var.f45925a).f46318a.G0.a(0L, true);
                q5Var.invalidate();
                return;
            case 23:
                qh.n nVar = (qh.n) this.f42650b;
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            case 24:
                qh.d dVar = (qh.d) this.f42650b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 25:
                ((z7) ((lg.j) this.f42650b).f12559n).fullScroll(130);
                return;
            case 26:
                aa aaVar = (aa) this.f42650b;
                aaVar.f45002u0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                aaVar.f45001t0.J(AndroidUtilities.emptyMotionEvent());
                return;
            case 27:
                ba baVar = ((b9) this.f42650b).f45039h0;
                baVar.v(true);
                baVar.f45116x0.setCameraThumb(baVar.A());
                return;
            case 28:
                ((e9) this.f42650b).f45309x2.f45079m1.setVisibility(8);
                return;
            default:
                f9 f9Var = (f9) this.f42650b;
                ba baVar2 = f9Var.V;
                if (!baVar2.N1 && !baVar2.M1 && baVar2.f45120y0 != null && baVar2.f45048c0 == 0 && baVar2.f45072j1 != null) {
                    if (f9Var.isFrontface()) {
                        i10 = R.string.StoryCameraSavedDualBackHint;
                    } else {
                        i10 = R.string.StoryCameraSavedDualFrontHint;
                    }
                    String string = LocaleController.getString(i10);
                    e3 e3Var = baVar2.f45072j1;
                    e3Var.h = e3.a(string, e3Var.getTextPaint());
                    baVar2.f45072j1.s(string);
                    baVar2.f45072j1.u();
                    MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                    return;
                }
                return;
        }
    }
}
