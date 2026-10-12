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
public final class z0 implements org.telegram.ui.Components.lp0, ei.n4, yh1, r0.n, org.telegram.ui.ActionBar.z1, rg.t, org.telegram.ui.Components.we0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.bx0, ai.fc, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.uk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f44585a;
    public final Object f44586b;

    public z0(Object obj, int i10) {
        this.f44585a = i10;
        this.f44586b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f44586b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        u4 u4Var = (u4) mVar.d;
        if (u4Var == view && (k0Var = u4Var.f37629b) != null) {
            k0Var.setPadding(defaultWindowInsets.f11574a, defaultWindowInsets.f11575b, defaultWindowInsets.f11576c, defaultWindowInsets.d);
        }
        return r0.k1.f46999b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f44585a) {
            case 7:
                return false;
            case 28:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(4, (p4) this.f44586b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        a1 a1Var = (a1) this.f44586b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.u61 G;
        Object obj;
        long j3;
        switch (this.f44585a) {
            case 7:
                d6 d6Var = (d6) this.f44586b;
                ArrayList arrayList = d6Var.f36656c;
                if (((c6) arrayList.get(i10)).f16877a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = d6Var.f36657e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    vy vyVar = new vy(bundle);
                    vyVar.C2 = new o(3, d6Var, vyVar);
                    d6Var.presentFragment(vyVar);
                    return;
                } else if (((c6) arrayList.get(i10)).f16877a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((c6) arrayList.get(i10)).f36334c;
                    r80 r80Var = new r80(view.getContext(), d6Var);
                    r80Var.g(false);
                    r80Var.setParentWindow(org.telegram.ui.Components.g5.P(d6Var, r80Var, view, f7, f10));
                    r80Var.setCallback(new a6(d6Var, keepMediaException, 0));
                    return;
                } else if (((c6) arrayList.get(i10)).f16877a == 4) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(d6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new pu0(d6Var, 13), null).f20142a;
                    a2Var.show();
                    a2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                eu euVar = (eu) this.f44586b;
                HashSet hashSet = euVar.f37552b0;
                if (!euVar.f37553c0 && (G = euVar.f37554d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f19950id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f19803id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof xg.l) {
                        ((xg.l) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        return;
                    }
                    return;
                }
                return;
            default:
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f44586b, view, i10, f7);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        li liVar = (li) this.f44586b;
        eo eoVar = liVar.f39767p;
        if (eoVar.getParentActivity() != null && eoVar.getParentActivity() != null) {
            ki kiVar = new ki(liVar, eoVar, eoVar.getParentActivity(), eoVar.f37256ea, arrayList);
            kiVar.setCalcMandatoryInsets(eoVar.C9());
            kiVar.setDimBehind(false);
            eoVar.D7(false);
            eoVar.showDialog(kiVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f44585a) {
            case 4:
                k5 k5Var = (k5) this.f44586b;
                k5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    k5Var.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                r6 r6Var = (r6) this.f44586b;
                ?? e3Var = new org.telegram.ui.ActionBar.e3(r6Var.getContext(), false);
                e3Var.fixNavigationBar();
                e3Var.setCanDismissWithSwipe(false);
                e3Var.setCancelable(false);
                Context context = r6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.w5.a(150.0f, 0.0f, 16.0f, 0.0f, 0.0f, 150, 49));
                imageView.d();
                org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(context, false, true, true);
                frameLayout.f42106a = r6Var2;
                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27635g;
                r6Var2.b(0.35f, 120L, jsVar);
                r6Var2.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.h6.f20668j5;
                r6Var2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                r6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                r6Var2.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(r6Var2, w7.w5.a(32.0f, 0.0f, 176.0f, 0.0f, 0.0f, -1, 49));
                s6 s6Var = new s6(context);
                Paint paint = new Paint(1);
                s6Var.f41816b = paint;
                Paint paint2 = new Paint(1);
                s6Var.f41817c = paint2;
                s6Var.f41818e = new org.telegram.ui.Components.g6(s6Var, 350L, jsVar);
                int i13 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(0.2f, org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
                frameLayout.f42107b = s6Var;
                frameLayout.addView(s6Var, w7.w5.a(5.0f, 0.0f, 226.0f, 0.0f, 0.0f, 240, 49));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.v0.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.w5.a(-2.0f, 0.0f, 261.0f, 0.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.w5.a(-2.0f, 0.0f, 289.0f, 0.0f, 0.0f, 240, 49));
                frameLayout.a(0.0f);
                e3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(r6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(r6Var, zArr, jArr, (Object) e3Var, 2), 150L);
                b7 b7Var = r6Var.d;
                o6 o6Var = new o6(fArr, zArr2, l5Var, 0);
                p6 p6Var = new p6(zArr, frameLayout, jArr, e3Var, 0);
                zh.b bVar = b7Var.Y;
                if (bVar != null) {
                    bVar.d();
                }
                y6 y6Var = b7Var.N;
                if (y6Var != null) {
                    y6Var.d();
                    b7Var.N.e(false);
                }
                b7Var.getFileLoader().cancelLoadAllFiles();
                b7Var.getFileLoader().getFileLoaderQueue().postRunnable(new h6(b7Var, o6Var, p6Var, 0));
                b7Var.Y = null;
                y6 y6Var2 = b7Var.N;
                if (y6Var2 != null) {
                    y6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                qd.U((qd) this.f44586b, a2Var);
                return;
            case 15:
                ((wg) this.f44586b).run();
                return;
            case 17:
                eo eoVar = ((sj) this.f44586b).f41941b;
                eoVar.finishFragment();
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, eoVar.P3);
                return;
            case 21:
                eo eoVar2 = ((hm) this.f44586b).f38467a.Q;
                i11 = ((org.telegram.ui.ActionBar.m2) eoVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(eoVar2.T5, true, true);
                return;
            case 22:
                xp xpVar = (xp) this.f44586b;
                boolean z10 = xpVar.f44139s;
                if (!z10 || xpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(xpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(xpVar.f44136f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(xpVar.f44136f);
                    }
                    AndroidUtilities.runOnUIThread(new np(xpVar, a2VarArr, xpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new so(1, xpVar, a2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((ar) this.f44586b).run(1);
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f44586b).get(i10)).intValue()).apply();
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        j8 j8Var = (j8) ((g) this.f44586b).f37877b;
        Paint paint = j8Var.f39146w;
        TextPaint textPaint = j8Var.f39133e;
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
            canvas.drawText(Integer.toString(j8Var.f39138h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(org.telegram.ui.Components.xe0 xe0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f44586b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21526a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, xe0Var);
    }

    @Override
    public void j(boolean z10) {
        m3 m3Var = (m3) this.f44586b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    public void k(String str) {
        eo eoVar = ((qm) this.f44586b).Q;
        if (str.startsWith("@")) {
            eoVar.getMessagesController().openByUserName(str.substring(1), eoVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                eoVar.Y.c1(null, str, false, false);
                if (eoVar.Y.getFieldText() == null) {
                    eoVar.j9(false);
                    return;
                }
                return;
            }
            eoVar.Ba(0, str, null, null, false);
        } else {
            vy vyVar = new vy(null);
            vyVar.f42950n2 = str;
            eoVar.presentFragment(vyVar);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f44585a;
    }

    @Override
    public void onCameraInit() {
        y9 y9Var = (y9) this.f44586b;
        HandlerThread handlerThread = y9Var.d;
        handlerThread.start();
        y9Var.f44338e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(y9Var.f44339e0, 0L);
        if (y9Var.a0()) {
            o1.k kVar = y9Var.f44348y;
            if (kVar != null) {
                kVar.c();
                y9Var.f44348y = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            y9Var.f44348y = kVar2;
            kVar2.b(new o9(y9Var, 0));
            y9Var.f44348y.a(new p9(y9Var, 0));
            y9Var.f44348y.f16691u = new o1.l(500.0f);
            y9Var.f44348y.f16691u.a(0.8f);
            y9Var.f44348y.f16691u.b(250.0f);
            y9Var.f44348y.h();
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f44585a) {
            case 13:
                ie ieVar = (ie) this.f44586b;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ke keVar = ieVar.f38887f;
                Object obj6 = u61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.p7.i1(ieVar.getContext(), true, keVar.d, ieVar.f38885c, (TL_stars.StarsTransaction) u61Var.G, ieVar.f38884b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    oe.h0(ieVar.getContext(), ieVar.f38885c, (TL_stats.BroadcastRevenueTransaction) u61Var.G, keVar.d, ieVar.f38884b);
                    return;
                } else {
                    return;
                }
            default:
                ts tsVar = (ts) this.f44586b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.u61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !tsVar.X;
                        tsVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
                if (user == null || tsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tsVar.getParentActivity(), 0, tsVar.f42281r);
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(22, tsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public z0(rj rjVar, boolean z10) {
        this.f44585a = 18;
        this.f44586b = rjVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f44585a) {
            case 18:
                eo eoVar = ((rj) this.f44586b).f41667b.f41941b;
                eoVar.va(eoVar.f37237d4, true);
                return;
            case 19:
                eo eoVar2 = ((bm) this.f44586b).f36206b;
                if (z10) {
                    eoVar2.T7();
                    UndoView undoView = eoVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                wr wrVar = ((nr) this.f44586b).f40465b;
                if (!z10 || wr.X(wrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) wr.Z(wrVar).getFragmentStack().get(wr.Y(wrVar).getFragmentStack().size() - 2);
                if (m2Var instanceof xo) {
                    m2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", wrVar.N);
                    xo xoVar = new xo(bundle);
                    xoVar.l0(wrVar.f43654s);
                    ((ActionBarLayout) wr.b0(wrVar)).c(wr.a0(wrVar).getFragmentStack().size() - 1, xoVar);
                    wrVar.finishFragment();
                    xoVar.f44056c.j(76, 0L, null);
                    return;
                }
                wrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f44586b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
