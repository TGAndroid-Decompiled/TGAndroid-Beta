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
public final class z0 implements org.telegram.ui.Components.ao0, ei.o4, nh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.sv0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.nj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f39921a;
    public final Object f39922b;

    public z0(Object obj, int i10) {
        this.f39921a = i10;
        this.f39922b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f39922b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (k0Var = s4Var.f32507b) != null) {
            k0Var.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        }
        return r0.l1.f41806b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new m4(0, (n4) this.f39922b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        a1 a1Var = (a1) this.f39922b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.h51 G;
        Object obj;
        long j3;
        switch (this.f39921a) {
            case 7:
                b6 b6Var = (b6) this.f39922b;
                ArrayList arrayList = b6Var.f31971c;
                if (((a6) arrayList.get(i10)).f15508a == 1) {
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
                    ry ryVar = new ry(bundle);
                    ryVar.C2 = new u(2, b6Var, ryVar);
                    b6Var.presentFragment(ryVar);
                    return;
                } else if (((a6) arrayList.get(i10)).f15508a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).f31681c;
                    m80 m80Var = new m80(view.getContext(), b6Var);
                    m80Var.g(false);
                    m80Var.setParentWindow(org.telegram.ui.Components.e5.Q(b6Var, m80Var, view, f7, f10));
                    m80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                    return;
                } else if (((a6) arrayList.get(i10)).f15508a == 4) {
                    org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new fu0(b6Var, 13), null).f18409a;
                    b2Var.show();
                    b2Var.h();
                    return;
                } else {
                    return;
                }
            case 28:
                zt ztVar = (zt) this.f39922b;
                HashSet hashSet = ztVar.f40242b0;
                if (!ztVar.f40243c0 && (G = ztVar.f40244d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f18230id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f18083id;
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
                DataAutoDownloadActivity.W((DataAutoDownloadActivity) this.f39922b, view, i10, f7);
                return;
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39921a) {
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
        ei eiVar = (ei) this.f39922b;
        xn xnVar = eiVar.f32938p;
        if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
            di diVar = new di(eiVar, xnVar, xnVar.getParentActivity(), xnVar.f39370ea, arrayList);
            diVar.setCalcMandatoryInsets(xnVar.x9());
            diVar.setDimBehind(false);
            xnVar.A7(false);
            xnVar.showDialog(diVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f39921a) {
            case 4:
                i5 i5Var = (i5) this.f39922b;
                i5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    i5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                p6 p6Var = (p6) this.f39922b;
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
                org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(context, false, true, true);
                frameLayout.f36699a = p6Var2;
                org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27702g;
                p6Var2.b(0.35f, 120L, rrVar);
                p6Var2.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.h6.f18895j5;
                p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                p6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                p6Var2.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(p6Var2, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                q6 q6Var = new q6(context);
                Paint paint = new Paint(1);
                q6Var.f36298b = paint;
                Paint paint2 = new Paint(1);
                q6Var.f36299c = paint2;
                q6Var.e = new org.telegram.ui.Components.e6(q6Var, 350L, rrVar);
                int i13 = org.telegram.ui.ActionBar.h6.N6;
                paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.l1(0.2f, org.telegram.ui.ActionBar.h6.w0(null, i13, false)));
                frameLayout.f36700b = q6Var;
                frameLayout.addView(q6Var, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.z0.q(textView, org.telegram.ui.ActionBar.h6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.x5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(p6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(p6Var, zArr, jArr, (Object) f3Var, 2), 150L);
                z6 z6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, m5Var, 0);
                n6 n6Var = new n6(zArr, frameLayout, jArr, f3Var, 0);
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
                z6Var.getFileLoader().getFileLoaderQueue().postRunnable(new f6(z6Var, m6Var, n6Var, 0));
                z6Var.Y = null;
                w6 w6Var2 = z6Var.N;
                if (w6Var2 != null) {
                    w6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 12:
                ld.U((ld) this.f39922b, b2Var);
                return;
            case 15:
                ((sg) this.f39922b).run();
                return;
            case 17:
                xn xnVar = ((kj) this.f39922b).f34737b;
                xnVar.finishFragment();
                xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, xnVar.P3);
                return;
            case 21:
                xn xnVar2 = ((bm) this.f39922b).f32143a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) xnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(xnVar2.T5, true, true);
                return;
            case 22:
                sp spVar = (sp) this.f39922b;
                boolean z10 = spVar.f37386s;
                if (!z10 || spVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(spVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(spVar.f37383f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(spVar.f37383f);
                    }
                    AndroidUtilities.runOnUIThread(new ip(spVar, b2VarArr, spVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new mo(1, spVar, b2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((vq) this.f39922b).run(1);
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f39922b).get(i10)).intValue()).apply();
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = (h8) ((g) this.f39922b).f33402b;
        Paint paint = h8Var.f33769w;
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
            canvas.drawText(Integer.toString(h8Var.f33761h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f39922b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f19732a0;
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
        m3 m3Var = (m3) this.f39922b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    public void k(String str) {
        xn xnVar = ((km) this.f39922b).Q;
        if (str.startsWith("@")) {
            xnVar.getMessagesController().openByUserName(str.substring(1), xnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                xnVar.Y.b1(null, str, false, false);
                if (xnVar.Y.getFieldText() == null) {
                    xnVar.e9(false);
                    return;
                }
                return;
            }
            xnVar.xa(0, str, null, null, false);
        } else {
            ry ryVar = new ry(null);
            ryVar.f37023n2 = str;
            xnVar.presentFragment(ryVar);
        }
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f39922b;
        HandlerThread handlerThread = u9Var.d;
        handlerThread.start();
        u9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(u9Var.f37960c0, 0L);
        if (u9Var.a0()) {
            o1.k kVar = u9Var.f37968x;
            if (kVar != null) {
                kVar.c();
                u9Var.f37968x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            u9Var.f37968x = kVar2;
            kVar2.b(new m9(u9Var, 0));
            u9Var.f37968x.a(new n9(u9Var, 0));
            u9Var.f37968x.f15326u = new o1.l(500.0f);
            u9Var.f37968x.f15326u.a(0.8f);
            u9Var.f37968x.f15326u.b(250.0f);
            u9Var.f37968x.f();
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39921a;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f39921a) {
            case 13:
                de deVar = (de) this.f39922b;
                org.telegram.ui.Components.h51 h51Var = (org.telegram.ui.Components.h51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                fe feVar = deVar.f32618f;
                Object obj6 = h51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.w7.h1(deVar.getContext(), true, feVar.d, deVar.f32617c, (TL_stars.StarsTransaction) h51Var.G, deVar.f32616b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    je.h0(deVar.getContext(), deVar.f32617c, (TL_stats.BroadcastRevenueTransaction) h51Var.G, feVar.d, deVar.f32616b);
                    return;
                } else {
                    return;
                }
            default:
                ns nsVar = (ns) this.f39922b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.h51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !nsVar.X;
                        nsVar.X = z10;
                        ((org.telegram.ui.Cells.x8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
                if (user == null || nsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nsVar.getParentActivity(), 0, nsVar.f35591r);
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.b3(21, nsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public z0(jj jjVar, boolean z10) {
        this.f39921a = 18;
        this.f39922b = jjVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f39921a) {
            case 18:
                xn xnVar = ((jj) this.f39922b).f34465b.f34737b;
                xnVar.qa(xnVar.f39352d4, true);
                return;
            case 19:
                xn xnVar2 = ((ul) this.f39922b).f38128b;
                if (z10) {
                    xnVar2.Q7();
                    UndoView undoView = xnVar2.y3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                qr qrVar = ((ir) this.f39922b).f34231b;
                if (!z10 || qr.X(qrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) qr.Z(qrVar).getFragmentStack().get(qr.Y(qrVar).getFragmentStack().size() - 2);
                if (n2Var instanceof so) {
                    n2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", qrVar.N);
                    so soVar = new so(bundle);
                    soVar.l0(qrVar.f36585s);
                    ((ActionBarLayout) qr.b0(qrVar)).c(qr.a0(qrVar).getFragmentStack().size() - 1, soVar);
                    qrVar.finishFragment();
                    soVar.f37347c.j(76, 0L, null);
                    return;
                }
                qrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f39922b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }

    private final void o(View view, float f7, float f10) {
    }
}
