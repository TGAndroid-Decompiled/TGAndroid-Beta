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
public final class y0 implements org.telegram.ui.Components.ao0, ei.o4, vh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.al0, org.telegram.ui.Components.sv0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.mj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f39716a;
    public final Object f39717b;

    public y0(Object obj, int i10) {
        this.f39716a = i10;
        this.f39717b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        j0 j0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f39717b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        r4 r4Var = (r4) mVar.d;
        if (r4Var == view && (j0Var = r4Var.f32660b) != null) {
            j0Var.setPadding(defaultWindowInsets.f10590a, defaultWindowInsets.f10591b, defaultWindowInsets.f10592c, defaultWindowInsets.d);
        }
        return r0.l1.f41850b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new l4(0, (m4) this.f39717b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        z0 z0Var = (z0) this.f39717b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.i51 G;
        Object obj;
        long j3;
        switch (this.f39716a) {
            case 7:
                b6 b6Var = (b6) this.f39717b;
                ArrayList arrayList = b6Var.f32051c;
                if (((a6) arrayList.get(i10)).f15531a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = b6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    uy uyVar = new uy(bundle);
                    uyVar.C2 = new x5(0, b6Var, uyVar);
                    b6Var.presentFragment(uyVar);
                    return;
                } else if (((a6) arrayList.get(i10)).f15531a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).f31685c;
                    p80 p80Var = new p80(view.getContext(), b6Var);
                    p80Var.g(false);
                    p80Var.setParentWindow(org.telegram.ui.Components.c5.Q(b6Var, p80Var, view, f7, f10));
                    p80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                    return;
                } else if (((a6) arrayList.get(i10)).f15531a == 4) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.c5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mu0(b6Var, 13), null).f18435a;
                    b2Var.show();
                    b2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                cu cuVar = (cu) this.f39717b;
                HashSet hashSet = cuVar.f32866b0;
                if (!cuVar.f32867c0 && (G = cuVar.f32868d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f18256id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f18109id;
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
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f39717b, view, i10, f7);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39716a) {
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
        hi hiVar = (hi) this.f39717b;
        bo boVar = hiVar.f34298p;
        if (boVar.getParentActivity() != null && boVar.getParentActivity() != null) {
            gi giVar = new gi(hiVar, boVar, boVar.getParentActivity(), boVar.f32293ea, arrayList);
            giVar.setCalcMandatoryInsets(boVar.x9());
            giVar.setDimBehind(false);
            boVar.A7(false);
            boVar.showDialog(giVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f39716a) {
            case 4:
                h5 h5Var = (h5) this.f39717b;
                h5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    h5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.f39717b;
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
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
                frameLayout.f37040a = n6Var;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27421g;
                n6Var.b(0.35f, 120L, qrVar);
                n6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.i6.f18940j5;
                n6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                n6Var.setTextSize(AndroidUtilities.dp(24.0f));
                n6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(n6Var, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                q6 q6Var = new q6(context);
                Paint paint = new Paint(1);
                q6Var.f36766b = paint;
                Paint paint2 = new Paint(1);
                q6Var.f36767c = paint2;
                q6Var.e = new org.telegram.ui.Components.c6(q6Var, 350L, qrVar);
                int i13 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(0.2f, org.telegram.ui.ActionBar.i6.w0(null, i13, false)));
                frameLayout.f37041b = q6Var;
                frameLayout.addView(q6Var, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.y0.q(textView, org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
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
                n6 n6Var2 = new n6(zArr, frameLayout, jArr, f3Var, 0);
                zh.b bVar = z6Var.Y;
                if (bVar != null) {
                    bVar.d();
                }
                w6 w6Var = z6Var.N;
                if (w6Var != null) {
                    w6Var.d();
                    z6Var.N.e(false);
                }
                z6Var.getFileLoader().cancelLoadAllFiles();
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new f6(z6Var, m6Var, n6Var2, 0));
                z6Var.Y = null;
                w6 w6Var2 = z6Var.N;
                if (w6Var2 != null) {
                    w6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                ld.U((ld) this.f39717b, b2Var);
                return;
            case 15:
                ((ug) this.f39717b).run();
                return;
            case 17:
                bo boVar = ((nj) this.f39717b).f35998b;
                boVar.finishFragment();
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, boVar.P3);
                return;
            case 21:
                bo boVar2 = ((em) this.f39717b).f33375a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) boVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(boVar2.T5, true, true);
                return;
            case 22:
                wp wpVar = (wp) this.f39717b;
                boolean z10 = wpVar.f39349s;
                if (!z10 || wpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(wpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(wpVar.f39346f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(wpVar.f39346f);
                    }
                    AndroidUtilities.runOnUIThread(new mp(wpVar, b2VarArr, wpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new qo(1, wpVar, b2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((zq) this.f39717b).run(1);
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f39717b).get(i10)).intValue()).apply();
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.f39717b).f33738b;
        Paint paint = h8Var.f34193w;
        TextPaint textPaint = h8Var.e;
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
            canvas.drawText(Integer.toString(h8Var.f34185h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f39717b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f19759a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, sd0Var);
    }

    @Override
    public void j(boolean z10) {
        l3 l3Var = (l3) this.f39717b;
        u3 u3Var = l3Var.K.K;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.dismiss(true);
        }
    }

    public void k(String str) {
        bo boVar = ((nm) this.f39717b).Q;
        if (str.startsWith("@")) {
            boVar.getMessagesController().openByUserName(str.substring(1), boVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                boVar.Y.b1(null, str, false, false);
                if (boVar.Y.getFieldText() == null) {
                    boVar.e9(false);
                    return;
                }
                return;
            }
            boVar.xa(0, str, null, null, false);
        } else {
            uy uyVar = new uy(null);
            uyVar.f38267n2 = str;
            boVar.presentFragment(uyVar);
        }
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f39717b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.f37854c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.f37862x;
            if (kVar != null) {
                kVar.c();
                u9Var.f37862x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.f37862x = kVar2;
            kVar2.b(new m9(u9Var, 0));
            u9Var.f37862x.a(new n9(u9Var, 0));
            u9Var.f37862x.f15349u = new o1.l(500.0f);
            u9Var.f37862x.f15349u.a(0.8f);
            u9Var.f37862x.f15349u.b(250.0f);
            u9Var.f37862x.f();
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39716a;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f39716a) {
            case 13:
                de deVar = (de) this.f39717b;
                org.telegram.ui.Components.i51 i51Var = (org.telegram.ui.Components.i51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                fe feVar = deVar.f33007f;
                Object obj6 = i51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.x7.h1(deVar.getContext(), true, feVar.d, deVar.f33006c, (TL_stars.StarsTransaction) i51Var.G, deVar.f33005b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    je.h0(deVar.getContext(), deVar.f33006c, (TL_stats.BroadcastRevenueTransaction) i51Var.G, feVar.d, deVar.f33005b);
                    return;
                } else {
                    return;
                }
            default:
                ss ssVar = (ss) this.f39717b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.i51) obj).d;
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ssVar.getParentActivity(), 0, ssVar.f37451r);
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(20, ssVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public y0(mj mjVar, boolean z10) {
        this.f39716a = 18;
        this.f39717b = mjVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f39716a) {
            case 18:
                bo boVar = ((mj) this.f39717b).f35760b.f35998b;
                boVar.qa(boVar.f32275d4, true);
                return;
            case 19:
                bo boVar2 = ((xl) this.f39717b).f39651b;
                if (z10) {
                    boVar2.Q7();
                    UndoView undoView = boVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                ur urVar = ((mr) this.f39717b).f35796b;
                if (!z10 || ur.X(urVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ur.Z(urVar).getFragmentStack().get(ur.Y(urVar).getFragmentStack().size() - 2);
                if (n2Var instanceof wo) {
                    n2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", urVar.N);
                    wo woVar = new wo(bundle);
                    woVar.l0(urVar.f38147s);
                    ((ActionBarLayout) ur.b0(urVar)).c(ur.a0(urVar).getFragmentStack().size() - 1, woVar);
                    urVar.finishFragment();
                    woVar.f39269c.j(76, 0L, null);
                    return;
                }
                urVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f39717b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
