package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class z0 implements org.telegram.ui.Components.ao0, fi.p4, vh1, r0.n, org.telegram.ui.ActionBar.a2, sg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.al0, org.telegram.ui.Components.rv0, bi.kb, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.mj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f43277a;
    public final Object f43278b;

    public z0(Object obj, int i10) {
        this.f43277a = i10;
        this.f43278b = obj;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        j0 j0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f43278b;
        mVar.getClass();
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (j0Var = s4Var.f35022b) != null) {
            j0Var.setPadding(defaultWindowInsets.f11451a, defaultWindowInsets.f11452b, defaultWindowInsets.f11453c, defaultWindowInsets.d);
        }
        return r0.l1.f44738b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(6, (n4) this.f43278b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        a1 a1Var = (a1) this.f43278b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.h51 G;
        Object obj;
        long j3;
        switch (this.f43277a) {
            case 7:
                a6 a6Var = (a6) this.f43278b;
                ArrayList arrayList = a6Var.f34367c;
                if (((z5) arrayList.get(i10)).f44098a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = a6Var.f34368e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uy uyVar = new uy(bundle);
                    uyVar.C2 = new m4(1, a6Var, uyVar);
                    a6Var.presentFragment(uyVar);
                    return;
                } else if (((z5) arrayList.get(i10)).f44098a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f43321c;
                    p80 p80Var = new p80(view.getContext(), a6Var);
                    p80Var.g(false);
                    p80Var.setParentWindow(org.telegram.ui.Components.e5.Q(a6Var, p80Var, view, f7, f10));
                    p80Var.setCallback(new x5(a6Var, keepMediaException, 0));
                    return;
                } else if (((z5) arrayList.get(i10)).f44098a == 4) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new lu0(a6Var, 13), null).f20225a;
                    b2Var.show();
                    b2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                du duVar = (du) this.f43278b;
                HashSet hashSet = duVar.f35888b0;
                if (!duVar.f35889c0 && (G = duVar.f35890d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f20043id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f19896id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof yg.l) {
                        ((yg.l) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f43278b, view, i10, f7);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f43277a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        hi hiVar = (hi) this.f43278b;
        co coVar = hiVar.f37061p;
        if (coVar.getParentActivity() != null && coVar.getParentActivity() != null) {
            gi giVar = new gi(hiVar, coVar, coVar.getParentActivity(), coVar.f35274ea, arrayList);
            giVar.setCalcMandatoryInsets(coVar.x9());
            giVar.setDimBehind(false);
            coVar.A7(false);
            coVar.showDialog(giVar);
        }
    }

    @Override
    public void f(boolean z10) {
        m3 m3Var = (m3) this.f43278b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f43277a) {
            case 4:
                h5 h5Var = (h5) this.f43278b;
                h5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    h5Var.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.f43278b;
                ?? f3Var = new org.telegram.ui.ActionBar.f3(p6Var.getContext(), false);
                f3Var.fixNavigationBar();
                f3Var.setCanDismissWithSwipe(false);
                f3Var.setCancelable(false);
                Context context = p6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.x5.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true);
                frameLayout.f40106a = q6Var;
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f29494g;
                q6Var.b(0.35f, 120L, prVar);
                q6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.j6.f20797j5;
                q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                q6Var.setTextSize(AndroidUtilities.dp(24.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(q6Var, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                q6 q6Var2 = new q6(context);
                Paint paint = new Paint(1);
                q6Var2.f39767b = paint;
                Paint paint2 = new Paint(1);
                q6Var2.f39768c = paint2;
                q6Var2.f39769e = new org.telegram.ui.Components.e6(q6Var2, 350L, prVar);
                int i13 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
                frameLayout.f40107b = q6Var2;
                frameLayout.addView(q6Var2, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.w1.q(textView, org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.x5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(p6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(p6Var, zArr, jArr, (Object) f3Var, 2), 150L);
                z6 z6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, n5Var, 0);
                n6 n6Var = new n6(zArr, frameLayout, jArr, f3Var, 0);
                ai.c cVar = z6Var.Y;
                if (cVar != null) {
                    cVar.d();
                }
                w6 w6Var = z6Var.N;
                if (w6Var != null) {
                    w6Var.d();
                    z6Var.N.e(false);
                }
                z6Var.getFileLoader().cancelLoadAllFiles();
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(z6Var, m6Var, n6Var, 0));
                z6Var.Y = null;
                w6 w6Var2 = z6Var.N;
                if (w6Var2 != null) {
                    w6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                md.U((md) this.f43278b, b2Var);
                return;
            case 15:
                ((ug) this.f43278b).run();
                return;
            case 17:
                co coVar = ((nj) this.f43278b).f38994b;
                coVar.finishFragment();
                coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, coVar.P3);
                return;
            case 21:
                co coVar2 = ((fm) this.f43278b).f36459a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) coVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(coVar2.T5, true, true);
                return;
            case 22:
                xp xpVar = (xp) this.f43278b;
                boolean z10 = xpVar.f42881s;
                if (!z10 || xpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(xpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(xpVar.f42878f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(xpVar.f42878f);
                    }
                    AndroidUtilities.runOnUIThread(new np(xpVar, b2VarArr, xpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ro(1, xpVar, b2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((ar) this.f43278b).run(1);
                return;
        }
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.f43278b).f36542b;
        Paint paint = h8Var.f36943w;
        TextPaint textPaint = h8Var.f36930e;
        paint.setAlpha((int) (80.0f * f7));
        float lerp = AndroidUtilities.lerp(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        float clamp = Utilities.clamp((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (clamp > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * clamp));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / AndroidUtilities.dp(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(h8Var.f36935h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f43278b).get(i10)).intValue()).apply();
    }

    @Override
    public void j(org.telegram.ui.Components.sd0 sd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f43278b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21603a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    public void k(String str) {
        co coVar = ((om) this.f43278b).Q;
        if (str.startsWith("@")) {
            coVar.getMessagesController().openByUserName(str.substring(1), coVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                coVar.Y.a1(null, str, false, false);
                if (coVar.Y.getFieldText() == null) {
                    coVar.e9(false);
                    return;
                }
                return;
            }
            coVar.xa(0, str, null, null, false);
        } else {
            uy uyVar = new uy(null);
            uyVar.f41331n2 = str;
            coVar.presentFragment(uyVar);
        }
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f43278b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.f41011e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.f41009c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.f41018x;
            if (kVar != null) {
                kVar.c();
                u9Var.f41018x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.f41018x = kVar2;
            kVar2.b(new m9(u9Var, 0));
            u9Var.f41018x.a(new n9(u9Var, 0));
            u9Var.f41018x.f16852u = new o1.l(500.0f);
            u9Var.f41018x.f16852u.a(0.8f);
            u9Var.f41018x.f16852u.b(250.0f);
            u9Var.f41018x.f();
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f43277a;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f43277a) {
            case 13:
                ee eeVar = (ee) this.f43278b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f36036f;
                Object obj6 = h51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    zh.v7.h1(eeVar.getContext(), true, geVar.d, eeVar.f36034c, (TL_stars.StarsTransaction) h51Var.G, eeVar.f36033b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    ke.h0(eeVar.getContext(), eeVar.f36034c, (TL_stats.BroadcastRevenueTransaction) h51Var.G, geVar.d, eeVar.f36033b);
                    return;
                } else {
                    return;
                }
            default:
                ss ssVar = (ss) this.f43278b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.h51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !ssVar.X;
                        ssVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
                if (user == null || ssVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ssVar.getParentActivity(), 0, ssVar.f40543r);
                alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(21, ssVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public z0(mj mjVar, boolean z10) {
        this.f43277a = 18;
        this.f43278b = mjVar;
    }

    @Override
    public void c(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f43277a) {
            case 18:
                co coVar = ((mj) this.f43278b).f38748b.f38994b;
                coVar.qa(coVar.f35255d4, true);
                return;
            case 19:
                co coVar2 = ((xl) this.f43278b).f42779b;
                if (z10) {
                    coVar2.Q7();
                    UndoView undoView = coVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                vr vrVar = ((nr) this.f43278b).f39035b;
                if (!z10 || vr.X(vrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) vr.Z(vrVar).getFragmentStack().get(vr.Y(vrVar).getFragmentStack().size() - 2);
                if (n2Var instanceof xo) {
                    n2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", vrVar.N);
                    xo xoVar = new xo(bundle);
                    xoVar.l0(vrVar.f41697s);
                    ((ActionBarLayout) vr.b0(vrVar)).c(vr.a0(vrVar).getFragmentStack().size() - 1, xoVar);
                    vrVar.finishFragment();
                    xoVar.f42798c.j(76, 0L, null);
                    return;
                }
                vrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f43278b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
