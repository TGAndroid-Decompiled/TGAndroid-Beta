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
public final class y0 implements org.telegram.ui.Components.gp0, ei.n4, vh1, r0.n, org.telegram.ui.ActionBar.z1, rg.t, org.telegram.ui.Components.se0, org.telegram.ui.Components.gm0, org.telegram.ui.Components.ww0, ai.fc, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.sk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f44245a;
    public final Object f44246b;

    public y0(Object obj, int i10) {
        this.f44245a = i10;
        this.f44246b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        j0 j0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f44246b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        q4 q4Var = (q4) mVar.d;
        if (q4Var == view && (j0Var = q4Var.f36300b) != null) {
            j0Var.setPadding(defaultWindowInsets.f11575a, defaultWindowInsets.f11576b, defaultWindowInsets.f11577c, defaultWindowInsets.d);
        }
        return r0.k1.f46900b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f44245a) {
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
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(6, (l4) this.f44246b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        z0 z0Var = (z0) this.f44246b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.q61 G;
        Object obj;
        long j3;
        switch (this.f44245a) {
            case 7:
                z5 z5Var = (z5) this.f44246b;
                ArrayList arrayList = z5Var.f44617c;
                if (((y5) arrayList.get(i10)).f17211a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = z5Var.f44618e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    sy syVar = new sy(bundle);
                    syVar.C2 = new m4.v0(4, z5Var, syVar);
                    z5Var.presentFragment(syVar);
                    return;
                } else if (((y5) arrayList.get(i10)).f17211a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((y5) arrayList.get(i10)).f44293c;
                    o80 o80Var = new o80(view.getContext(), z5Var);
                    o80Var.g(false);
                    o80Var.setParentWindow(org.telegram.ui.Components.g5.P(z5Var, o80Var, view, f7, f10));
                    o80Var.setCallback(new w5(z5Var, keepMediaException, 0));
                    return;
                } else if (((y5) arrayList.get(i10)).f17211a == 4) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(z5Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mu0(z5Var, 13), null).f20404a;
                    a2Var.show();
                    a2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                au auVar = (au) this.f44246b;
                HashSet hashSet = auVar.f36207b0;
                if (!auVar.f36208c0 && (G = auVar.f36209d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f20215id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f20068id;
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
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f44246b, view, i10, f7);
                return;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        hi hiVar = (hi) this.f44246b;
        zn znVar = hiVar.f38479p;
        if (znVar.getParentActivity() != null && znVar.getParentActivity() != null) {
            gi giVar = new gi(hiVar, znVar, znVar.getParentActivity(), znVar.f44796ea, arrayList);
            giVar.setCalcMandatoryInsets(znVar.C9());
            giVar.setDimBehind(false);
            znVar.D7(false);
            znVar.showDialog(giVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f44245a) {
            case 4:
                g5 g5Var = (g5) this.f44246b;
                g5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    g5Var.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                n6 n6Var = (n6) this.f44246b;
                ?? e3Var = new org.telegram.ui.ActionBar.e3(n6Var.getContext(), false);
                e3Var.fixNavigationBar();
                e3Var.setCanDismissWithSwipe(false);
                e3Var.setCancelable(false);
                Context context = n6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.x5.a(150.0f, 0.0f, 16.0f, 0.0f, 0.0f, 150, 49));
                imageView.d();
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true);
                frameLayout.f40799a = r6Var;
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27501g;
                r6Var.b(0.35f, 120L, isVar);
                r6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.h6.f20930j5;
                r6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                r6Var.setTextSize(AndroidUtilities.dp(24.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(r6Var, w7.x5.a(32.0f, 0.0f, 176.0f, 0.0f, 0.0f, -1, 49));
                o6 o6Var = new o6(context);
                Paint paint = new Paint(1);
                o6Var.f40460b = paint;
                Paint paint2 = new Paint(1);
                o6Var.f40461c = paint2;
                o6Var.f40462e = new org.telegram.ui.Components.g6(o6Var, 350L, isVar);
                int i13 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.m1(0.2f, org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
                frameLayout.f40800b = o6Var;
                frameLayout.addView(o6Var, w7.x5.a(5.0f, 0.0f, 226.0f, 0.0f, 0.0f, 240, 49));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.q.m(16.0f, org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, textView);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 261.0f, 0.0f, 0.0f, -1, 49));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 289.0f, 0.0f, 0.0f, 240, 49));
                frameLayout.a(0.0f);
                e3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(n6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(n6Var, zArr, jArr, (Object) e3Var, 2), 150L);
                x6 x6Var = n6Var.d;
                k6 k6Var = new k6(fArr, zArr2, l5Var, 0);
                l6 l6Var = new l6(zArr, frameLayout, jArr, e3Var, 0);
                zh.b bVar = x6Var.Y;
                if (bVar != null) {
                    bVar.d();
                }
                u6 u6Var = x6Var.N;
                if (u6Var != null) {
                    u6Var.d();
                    x6Var.N.e(false);
                }
                x6Var.getFileLoader().cancelLoadAllFiles();
                x6Var.getFileLoader().getFileLoaderQueue().postRunnable(new d6(x6Var, k6Var, l6Var, 0));
                x6Var.Y = null;
                u6 u6Var2 = x6Var.N;
                if (u6Var2 != null) {
                    u6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                ld.U((ld) this.f44246b, a2Var);
                return;
            case 15:
                ((sg) this.f44246b).run();
                return;
            case 17:
                zn znVar = ((oj) this.f44246b).f40590b;
                znVar.finishFragment();
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, znVar.P3);
                return;
            case 21:
                zn znVar2 = ((dm) this.f44246b).f37084a.Q;
                i11 = ((org.telegram.ui.ActionBar.m2) znVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(znVar2.T5, true, true);
                return;
            case 22:
                up upVar = (up) this.f44246b;
                boolean z10 = upVar.f42775s;
                if (!z10 || upVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(upVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(upVar.f42772f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(upVar.f42772f);
                    }
                    AndroidUtilities.runOnUIThread(new kp(upVar, a2VarArr, upVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new oo(1, upVar, a2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((xq) this.f44246b).run(1);
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f44246b).get(i10)).intValue()).apply();
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        f8 f8Var = (f8) ((g) this.f44246b).f37850b;
        Paint paint = f8Var.f37629w;
        TextPaint textPaint = f8Var.f37616e;
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
            canvas.drawText(Integer.toString(f8Var.f37621h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(org.telegram.ui.Components.te0 te0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f44246b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21787a0;
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
        l3 l3Var = (l3) this.f44246b;
        u3 u3Var = l3Var.K.K;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.dismiss(true);
        }
    }

    public void k(String str) {
        zn znVar = ((mm) this.f44246b).Q;
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
            sy syVar = new sy(null);
            syVar.f41986n2 = str;
            znVar.presentFragment(syVar);
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f44245a;
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f44246b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.f42452e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.f42453e0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.f42462y;
            if (kVar != null) {
                kVar.c();
                u9Var.f42462y = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.f42462y = kVar2;
            kVar2.b(new k9(u9Var, 0));
            u9Var.f42462y.a(new l9(u9Var, 0));
            u9Var.f42462y.f17024u = new o1.l(500.0f);
            u9Var.f42462y.f17024u.a(0.8f);
            u9Var.f42462y.f17024u.b(250.0f);
            u9Var.f42462y.h();
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f44245a) {
            case 13:
                de deVar = (de) this.f44246b;
                org.telegram.ui.Components.q61 q61Var = (org.telegram.ui.Components.q61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                fe feVar = deVar.f37031f;
                Object obj6 = q61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.p7.i1(deVar.getContext(), true, feVar.d, deVar.f37029c, (TL_stars.StarsTransaction) q61Var.G, deVar.f37028b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    je.h0(deVar.getContext(), deVar.f37029c, (TL_stats.BroadcastRevenueTransaction) q61Var.G, feVar.d, deVar.f37028b);
                    return;
                } else {
                    return;
                }
            default:
                ps psVar = (ps) this.f44246b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.q61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !psVar.X;
                        psVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.H));
                if (user == null || psVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getParentActivity(), 0, psVar.f40983r);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.y2(23, psVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public y0(nj njVar, boolean z10) {
        this.f44245a = 18;
        this.f44246b = njVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f44245a) {
            case 18:
                zn znVar = ((nj) this.f44246b).f40300b.f40590b;
                znVar.va(znVar.f44777d4, true);
                return;
            case 19:
                zn znVar2 = ((xl) this.f44246b).f44136b;
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
                sr srVar = ((kr) this.f44246b).f39439b;
                if (!z10 || sr.X(srVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) sr.Z(srVar).getFragmentStack().get(sr.Y(srVar).getFragmentStack().size() - 2);
                if (m2Var instanceof uo) {
                    m2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", srVar.N);
                    uo uoVar = new uo(bundle);
                    uoVar.l0(srVar.f41859s);
                    ((ActionBarLayout) sr.b0(srVar)).c(sr.a0(srVar).getFragmentStack().size() - 1, uoVar);
                    srVar.finishFragment();
                    uoVar.f42692c.j(76, 0L, null);
                    return;
                }
                srVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f44246b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
