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
public final class z0 implements org.telegram.ui.Components.no0, ei.o4, nh1, r0.n, org.telegram.ui.ActionBar.z1, rg.t, org.telegram.ui.Components.be0, org.telegram.ui.Components.ll0, org.telegram.ui.Components.dw0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.xj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f40300a;
    public final Object f40301b;

    public z0(Object obj, int i10) {
        this.f40300a = i10;
        this.f40301b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f40301b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        r4 r4Var = (r4) mVar.d;
        if (r4Var == view && (k0Var = r4Var.f32562b) != null) {
            k0Var.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        }
        return r0.l1.f42140b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(5, (m4) this.f40301b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        a1 a1Var = (a1) this.f40301b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.v51 G;
        Object obj;
        long j3;
        switch (this.f40300a) {
            case 7:
                a6 a6Var = (a6) this.f40301b;
                ArrayList arrayList = a6Var.f31993c;
                if (((z5) arrayList.get(i10)).f15715a == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("onlySelect", true);
                    bundle.putBoolean("checkCanWrite", false);
                    int i11 = a6Var.e;
                    if (i11 == 1) {
                        bundle.putInt("dialogsType", 6);
                    } else if (i11 == 2) {
                        bundle.putInt("dialogsType", 5);
                    } else {
                        bundle.putInt("dialogsType", 4);
                    }
                    bundle.putBoolean("allowGlobalSearch", false);
                    qy qyVar = new qy(bundle);
                    qyVar.C2 = new o(3, a6Var, qyVar);
                    a6Var.presentFragment(qyVar);
                    return;
                } else if (((z5) arrayList.get(i10)).f15715a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((z5) arrayList.get(i10)).f40338c;
                    k80 k80Var = new k80(view.getContext(), a6Var);
                    k80Var.g(false);
                    k80Var.setParentWindow(org.telegram.ui.Components.e5.Q(a6Var, k80Var, view, f7, f10));
                    k80Var.setCallback(new x5(a6Var, keepMediaException, 0));
                    return;
                } else if (((z5) arrayList.get(i10)).f15715a == 4) {
                    org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.e5.O(a6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new eu0(a6Var, 13), null).f18662a;
                    a2Var.show();
                    a2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                yt ytVar = (yt) this.f40301b;
                HashSet hashSet = ytVar.f40248b0;
                if (!ytVar.f40249c0 && (G = ytVar.f40250d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f18483id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f18336id;
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
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f40301b, view, i10, f7);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f40300a) {
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
        ei eiVar = (ei) this.f40301b;
        wn wnVar = eiVar.f33425p;
        if (wnVar.getParentActivity() != null && wnVar.getParentActivity() != null) {
            di diVar = new di(eiVar, wnVar, wnVar.getParentActivity(), wnVar.f39470ea, arrayList);
            diVar.setCalcMandatoryInsets(wnVar.x9());
            diVar.setDimBehind(false);
            wnVar.A7(false);
            wnVar.showDialog(diVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        switch (this.f40300a) {
            case 4:
                h5 h5Var = (h5) this.f40301b;
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
                o6 o6Var = (o6) this.f40301b;
                ?? e3Var = new org.telegram.ui.ActionBar.e3(o6Var.getContext(), false);
                e3Var.fixNavigationBar();
                e3Var.setCanDismissWithSwipe(false);
                e3Var.setCancelable(false);
                Context context = o6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.y5.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
                frameLayout.f36803a = p6Var;
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f28032g;
                p6Var.b(0.35f, 120L, rrVar);
                p6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.h6.f19166j5;
                p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                p6Var.setTextSize(AndroidUtilities.dp(24.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(p6Var, w7.y5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                p6 p6Var2 = new p6(context);
                Paint paint = new Paint(1);
                p6Var2.f36405b = paint;
                Paint paint2 = new Paint(1);
                p6Var2.f36406c = paint2;
                p6Var2.e = new org.telegram.ui.Components.e6(p6Var2, 350L, rrVar);
                int i13 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.l1(0.2f, org.telegram.ui.ActionBar.h6.w0(null, i13, false)));
                frameLayout.f36804b = p6Var2;
                frameLayout.addView(p6Var2, w7.y5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.y5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                e3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(o6Var, frameLayout, fArr, zArr2, 2);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(o6Var, zArr, jArr, e3Var, 3), 150L);
                z6 z6Var = o6Var.d;
                l6 l6Var = new l6(fArr, zArr2, l5Var, 0);
                m6 m6Var = new m6(zArr, frameLayout, jArr, e3Var, 0);
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
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new e6(z6Var, l6Var, m6Var, 0));
                z6Var.Y = null;
                w6 w6Var2 = z6Var.N;
                if (w6Var2 != null) {
                    w6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                ld.U((ld) this.f40301b, a2Var);
                return;
            case 15:
                ((rg) this.f40301b).run();
                return;
            case 17:
                wn wnVar = ((kj) this.f40301b).f35078b;
                wnVar.finishFragment();
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, wnVar.P3);
                return;
            case 21:
                wn wnVar2 = ((am) this.f40301b).f32198a.Q;
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(wnVar2.T5, true, true);
                return;
            case 22:
                rp rpVar = (rp) this.f40301b;
                boolean z10 = rpVar.f37433s;
                if (!z10 || rpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(rpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(rpVar.f37430f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(rpVar.f37430f);
                    }
                    AndroidUtilities.runOnUIThread(new hp(rpVar, a2VarArr, rpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new lo(1, rpVar, a2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((uq) this.f40301b).run(1);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.Components.ce0 ce0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f40301b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f19987a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ce0Var);
    }

    @Override
    public void h(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f40301b).get(i10)).intValue()).apply();
    }

    @Override
    public void i(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.f40301b).f33787b;
        Paint paint = h8Var.f34157w;
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
            canvas.drawText(Integer.toString(h8Var.f34149h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void j(boolean z10) {
        m3 m3Var = (m3) this.f40301b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    public void k(String str) {
        wn wnVar = ((jm) this.f40301b).Q;
        if (str.startsWith("@")) {
            wnVar.getMessagesController().openByUserName(str.substring(1), wnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                wnVar.Y.a1(null, str, false, false);
                if (wnVar.Y.getFieldText() == null) {
                    wnVar.e9(false);
                    return;
                }
                return;
            }
            wnVar.xa(0, str, null, null, false);
        } else {
            qy qyVar = new qy(null);
            qyVar.f37079n2 = str;
            wnVar.presentFragment(qyVar);
        }
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f40301b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.f38361c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.f38369x;
            if (kVar != null) {
                kVar.c();
                u9Var.f38369x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.f38369x = kVar2;
            kVar2.b(new m9(u9Var, 0));
            u9Var.f38369x.a(new n9(u9Var, 0));
            u9Var.f38369x.f15533u = new o1.l(500.0f);
            u9Var.f38369x.f15533u.a(0.8f);
            u9Var.f38369x.f15533u.b(250.0f);
            u9Var.f38369x.f();
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f40300a;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f40300a) {
            case 13:
                de deVar = (de) this.f40301b;
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                fe feVar = deVar.f33087f;
                Object obj6 = v51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.w7.h1(deVar.getContext(), true, feVar.d, deVar.f33086c, (TL_stars.StarsTransaction) v51Var.G, deVar.f33085b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    je.h0(deVar.getContext(), deVar.f33086c, (TL_stats.BroadcastRevenueTransaction) v51Var.G, feVar.d, deVar.f33085b);
                    return;
                } else {
                    return;
                }
            default:
                ms msVar = (ms) this.f40301b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.v51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !msVar.X;
                        msVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
                if (user == null || msVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(msVar.getParentActivity(), 0, msVar.f35658r);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(22, msVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public z0(jj jjVar, boolean z10) {
        this.f40300a = 18;
        this.f40301b = jjVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void n() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f40300a) {
            case 18:
                wn wnVar = ((jj) this.f40301b).f34817b.f35078b;
                wnVar.qa(wnVar.f39452d4, true);
                return;
            case 19:
                wn wnVar2 = ((tl) this.f40301b).f38149b;
                if (z10) {
                    wnVar2.Q7();
                    UndoView undoView = wnVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                pr prVar = ((hr) this.f40301b).f34274b;
                if (!z10 || pr.X(prVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) pr.Z(prVar).getFragmentStack().get(pr.Y(prVar).getFragmentStack().size() - 2);
                if (m2Var instanceof ro) {
                    m2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", prVar.N);
                    ro roVar = new ro(bundle);
                    roVar.l0(prVar.f36650s);
                    ((ActionBarLayout) pr.b0(prVar)).c(pr.a0(prVar).getFragmentStack().size() - 1, roVar);
                    prVar.finishFragment();
                    roVar.f37394c.j(76, 0L, null);
                    return;
                }
                prVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f40301b).setClickable(false);
    }

    private final void l(View view, float f7, float f10) {
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
