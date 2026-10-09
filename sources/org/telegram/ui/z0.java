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
public final class z0 implements org.telegram.ui.Components.fp0, ei.n4, wh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.se0, org.telegram.ui.Components.fm0, org.telegram.ui.Components.vw0, ai.fc, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.rk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f44436a;
    public final Object f44437b;

    public z0(Object obj, int i10) {
        this.f44436a = i10;
        this.f44437b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f44437b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        r4 r4Var = (r4) mVar.d;
        if (r4Var == view && (k0Var = r4Var.f36518b) != null) {
            k0Var.setPadding(defaultWindowInsets.f11576a, defaultWindowInsets.f11577b, defaultWindowInsets.f11578c, defaultWindowInsets.d);
        }
        return r0.k1.f46774b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f44436a) {
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
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(7, (m4) this.f44437b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        a1 a1Var = (a1) this.f44437b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.p61 G;
        Object obj;
        long j3;
        switch (this.f44436a) {
            case 7:
                a6 a6Var = (a6) this.f44437b;
                ArrayList arrayList = a6Var.f35839c;
                if (((z5) arrayList.get(i10)).f17125a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = a6Var.f35840e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    ty tyVar = new ty(bundle);
                    tyVar.C2 = new o(3, a6Var, tyVar);
                    a6Var.presentFragment(tyVar);
                    return;
                } else if (((z5) arrayList.get(i10)).f17125a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f44484c;
                    p80 p80Var = new p80(view.getContext(), a6Var);
                    p80Var.g(false);
                    p80Var.setParentWindow(org.telegram.ui.Components.g5.P(a6Var, p80Var, view, f7, f10));
                    p80Var.setCallback(new x5(a6Var, keepMediaException, 0));
                    return;
                } else if (((z5) arrayList.get(i10)).f17125a == 4) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.g5.N(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new nu0(a6Var, 13), null).f20374a;
                    b2Var.show();
                    b2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                bu buVar = (bu) this.f44437b;
                HashSet hashSet = buVar.f36429b0;
                if (!buVar.f36430c0 && (G = buVar.f36431d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f20185id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f20038id;
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
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f44437b, view, i10, f7);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        hi hiVar = (hi) this.f44437b;
        zn znVar = hiVar.f38348p;
        if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
            gi giVar = new gi(hiVar, znVar, znVar.getParentActivity(), znVar.f44761ea, arrayList);
            giVar.setCalcMandatoryInsets(znVar.C9());
            giVar.setDimBehind(false);
            znVar.D7(false);
            znVar.showDialog(giVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f44436a) {
            case 4:
                h5 h5Var = (h5) this.f44437b;
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
                o6 o6Var = (o6) this.f44437b;
                ?? f3Var = new org.telegram.ui.ActionBar.f3(o6Var.getContext(), false);
                f3Var.fixNavigationBar();
                f3Var.setCanDismissWithSwipe(false);
                f3Var.setCancelable(false);
                Context context = o6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.x5.a(150.0f, 0.0f, 16.0f, 0.0f, 0.0f, 150, 49));
                imageView.d();
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
                frameLayout.f41025a = r6Var;
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.f27119g;
                r6Var.b(0.35f, 120L, hsVar);
                r6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.i6.f20905j5;
                r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                r6Var.setTextSize(AndroidUtilities.dp(24.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(r6Var, w7.x5.a(32.0f, 0.0f, 176.0f, 0.0f, 0.0f, -1, 49));
                p6 p6Var = new p6(context);
                Paint paint = new Paint(1);
                p6Var.f40678b = paint;
                Paint paint2 = new Paint(1);
                p6Var.f40679c = paint2;
                p6Var.f40680e = new org.telegram.ui.Components.g6(p6Var, 350L, hsVar);
                int i13 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.m1(0.2f, org.telegram.ui.ActionBar.i6.x0(null, i13, false)));
                frameLayout.f41026b = p6Var;
                frameLayout.addView(p6Var, w7.x5.a(5.0f, 0.0f, 226.0f, 0.0f, 0.0f, 240, 49));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.i6.x0(null, i12, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 261.0f, 0.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 289.0f, 0.0f, 0.0f, 240, 49));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(o6Var, frameLayout, fArr, zArr2, 2);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(o6Var, zArr, jArr, f3Var, 3), 150L);
                y6 y6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, n5Var, 0);
                m6 m6Var = new m6(zArr, frameLayout, jArr, f3Var, 0);
                zh.b bVar = y6Var.Y;
                if (bVar != null) {
                    bVar.d();
                }
                v6 v6Var = y6Var.N;
                if (v6Var != null) {
                    v6Var.d();
                    y6Var.N.e(false);
                }
                y6Var.getFileLoader().cancelLoadAllFiles();
                y6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(y6Var, l6Var, m6Var, 0));
                y6Var.Y = null;
                v6 v6Var2 = y6Var.N;
                if (v6Var2 != null) {
                    v6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                md.U((md) this.f44437b, b2Var);
                return;
            case 15:
                ((tg) this.f44437b).run();
                return;
            case 17:
                zn znVar = ((oj) this.f44437b).f40543b;
                znVar.finishFragment();
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, znVar.P3);
                return;
            case 21:
                zn znVar2 = ((dm) this.f44437b).f37048a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(znVar2.T5, true, true);
                return;
            case 22:
                up upVar = (up) this.f44437b;
                boolean z10 = upVar.f42505s;
                if (!z10 || upVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(upVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(upVar.f42502f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(upVar.f42502f);
                    }
                    AndroidUtilities.runOnUIThread(new kp(upVar, b2VarArr, upVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new oo(1, upVar, b2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((xq) this.f44437b).run(1);
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f44437b).get(i10)).intValue()).apply();
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        g8 g8Var = (g8) ((g) this.f44437b).f37729b;
        Paint paint = g8Var.f37931w;
        TextPaint textPaint = g8Var.f37918e;
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
            canvas.drawText(Integer.toString(g8Var.f37923h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(org.telegram.ui.Components.te0 te0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f44437b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21759a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, te0Var);
    }

    @Override
    public void j(boolean z10) {
        m3 m3Var = (m3) this.f44437b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    public void k(String str) {
        zn znVar = ((mm) this.f44437b).Q;
        if (str.startsWith("@")) {
            znVar.getMessagesController().openByUserName(str.substring(1), znVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                znVar.Y.Y0(null, str, false, false);
                if (znVar.Y.getFieldText() == null) {
                    znVar.j9(false);
                    return;
                }
                return;
            }
            znVar.Ba(0, str, null, null, false);
        } else {
            ty tyVar = new ty(null);
            tyVar.f42217n2 = str;
            znVar.presentFragment(tyVar);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f44436a;
    }

    @Override
    public void onCameraInit() {
        v9 v9Var = (v9) this.f44437b;
        HandlerThread handlerThread = v9Var.d;
        handlerThread.start();
        v9Var.f42716e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(v9Var.f42717e0, 0L);
        if (v9Var.a0()) {
            o1.k kVar = v9Var.f42726y;
            if (kVar != null) {
                kVar.c();
                v9Var.f42726y = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            v9Var.f42726y = kVar2;
            kVar2.b(new l9(v9Var, 0));
            v9Var.f42726y.a(new m9(v9Var, 0));
            v9Var.f42726y.f16938u = new o1.l(500.0f);
            v9Var.f42726y.f16938u.a(0.8f);
            v9Var.f42726y.f16938u.b(250.0f);
            v9Var.f42726y.h();
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f44436a) {
            case 13:
                ee eeVar = (ee) this.f44437b;
                org.telegram.ui.Components.p61 p61Var = (org.telegram.ui.Components.p61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f37241f;
                Object obj6 = p61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.p7.i1(eeVar.getContext(), true, geVar.d, eeVar.f37239c, (TL_stars.StarsTransaction) p61Var.G, eeVar.f37238b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    ke.h0(eeVar.getContext(), eeVar.f37239c, (TL_stats.BroadcastRevenueTransaction) p61Var.G, geVar.d, eeVar.f37238b);
                    return;
                } else {
                    return;
                }
            default:
                qs qsVar = (qs) this.f44437b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.p61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !qsVar.X;
                        qsVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
                if (user == null || qsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qsVar.getParentActivity(), 0, qsVar.f41176r);
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(22, qsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public z0(nj njVar, boolean z10) {
        this.f44436a = 18;
        this.f44437b = njVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f44436a) {
            case 18:
                zn znVar = ((nj) this.f44437b).f40222b.f40543b;
                znVar.va(znVar.f44742d4, true);
                return;
            case 19:
                zn znVar2 = ((xl) this.f44437b).f44058b;
                if (z10) {
                    znVar2.T7();
                    UndoView undoView = znVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                tr trVar = ((kr) this.f44437b).f39338b;
                if (!z10 || tr.X(trVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) tr.Z(trVar).getFragmentStack().get(tr.Y(trVar).getFragmentStack().size() - 2);
                if (n2Var instanceof uo) {
                    n2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", trVar.N);
                    uo uoVar = new uo(bundle);
                    uoVar.l0(trVar.f42091s);
                    ((ActionBarLayout) tr.b0(trVar)).c(tr.a0(trVar).getFragmentStack().size() - 1, uoVar);
                    trVar.finishFragment();
                    uoVar.f42466c.j(76, 0L, null);
                    return;
                }
                trVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f44437b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
