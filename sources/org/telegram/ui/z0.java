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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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
public final class z0 implements org.telegram.ui.Components.so0, ei.p4, nh1, r0.n, org.telegram.ui.ActionBar.a2, rg.t, org.telegram.ui.Components.de0, org.telegram.ui.Components.nl0, org.telegram.ui.Components.yv0, org.telegram.ui.Components.ow0, ai.ec, org.telegram.ui.Components.al0, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.zj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f43661a;
    public final Object f43662b;

    public z0(Object obj, int i10) {
        this.f43661a = i10;
        this.f43662b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        k0 k0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f43662b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        s4 s4Var = (s4) mVar.d;
        if (s4Var == view && (k0Var = s4Var.f35640b) != null) {
            k0Var.setPadding(defaultWindowInsets.f11525a, defaultWindowInsets.f11526b, defaultWindowInsets.f11527c, defaultWindowInsets.d);
        }
        return r0.l1.f45609b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(4, (n4) this.f43662b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        a1 a1Var = (a1) this.f43662b;
        MessageObject messageObject = a1Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(a1Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        b6 b6Var = (b6) this.f43662b;
        ArrayList arrayList = b6Var.f34999c;
        if (((a6) arrayList.get(i10)).f17183a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = b6Var.f35000e;
            if (i11 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            uy uyVar = new uy(bundle);
            uyVar.C2 = new o(3, b6Var, uyVar);
            b6Var.presentFragment(uyVar);
        } else if (((a6) arrayList.get(i10)).f17183a == 2) {
            CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).f34673c;
            o80 o80Var = new o80(view.getContext(), b6Var);
            o80Var.g(false);
            o80Var.setParentWindow(org.telegram.ui.Components.e5.Q(b6Var, o80Var, view, f7, f10));
            o80Var.setCallback(new y5(b6Var, keepMediaException, 0));
        } else if (((a6) arrayList.get(i10)).f17183a == 4) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new hu0(b6Var, 13), null).f20368a;
            b2Var.show();
            b2Var.h();
        }
    }

    @Override
    public void e() {
        ((li.m) this.f43662b).g();
    }

    @Override
    public void f(ArrayList arrayList) {
        fi fiVar = (fi) this.f43662b;
        yn ynVar = fiVar.f36333p;
        if (ynVar.getParentActivity() != null && ynVar.getParentActivity() != null) {
            ei eiVar = new ei(fiVar, ynVar, ynVar.getParentActivity(), ynVar.f43300ca, arrayList);
            eiVar.setCalcMandatoryInsets(ynVar.w9());
            eiVar.setDimBehind(false);
            ynVar.A7(false);
            ynVar.showDialog(eiVar);
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        switch (this.f43661a) {
            case 4:
                i5 i5Var = (i5) this.f43662b;
                i5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    i5Var.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 9:
                r6 r6Var = (r6) this.f43662b;
                ?? f3Var = new org.telegram.ui.ActionBar.f3(r6Var.getContext(), false);
                f3Var.fixNavigationBar();
                f3Var.setCanDismissWithSwipe(false);
                f3Var.setCancelable(false);
                Context context = r6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.z5.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
                frameLayout.f40692a = p6Var;
                org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.f31142g;
                p6Var.b(0.35f, 120L, trVar);
                p6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.i6.f20926j5;
                p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                p6Var.setTextSize(AndroidUtilities.dp(24.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(p6Var, w7.z5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                s6 s6Var = new s6(context);
                Paint paint = new Paint(1);
                s6Var.f40367b = paint;
                Paint paint2 = new Paint(1);
                s6Var.f40368c = paint2;
                s6Var.f40369e = new org.telegram.ui.Components.e6(s6Var, 350L, trVar);
                int i13 = org.telegram.ui.ActionBar.i6.N6;
                paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.i6.l1(0.2f, org.telegram.ui.ActionBar.i6.w0(null, i13, false)));
                frameLayout.f40693b = s6Var;
                frameLayout.addView(s6Var, w7.z5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.f0.q(textView, org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, w7.z5.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                f3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(r6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(r6Var, zArr, jArr, (Object) f3Var, 2), 150L);
                a7 a7Var = r6Var.d;
                o6 o6Var = new o6(fArr, zArr2, m5Var, 0);
                p6 p6Var2 = new p6(zArr, frameLayout, jArr, f3Var, 0);
                zh.b bVar = a7Var.f34686e0;
                if (bVar != null) {
                    bVar.d();
                }
                k6 k6Var = a7Var.M;
                if (k6Var != null) {
                    k6Var.e();
                    a7Var.M.f(false);
                }
                a7Var.getFileLoader().cancelLoadAllFiles();
                a7Var.getFileLoader().getFileLoaderQueue().postRunnable(new h6(a7Var, o6Var, p6Var2, 0));
                a7Var.f34686e0 = null;
                k6 k6Var2 = a7Var.M;
                if (k6Var2 != null) {
                    k6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                nd.S((nd) this.f43662b, b2Var);
                return;
            case 17:
                ((ug) this.f43662b).run();
                return;
            case 19:
                yn ynVar = ((lj) this.f43662b).f38279b;
                ynVar.finishFragment();
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, ynVar.N3);
                return;
            case 23:
                yn ynVar2 = ((am) this.f43662b).f34862a.Q;
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(ynVar2.R5, true, true);
                return;
            case 24:
                tp tpVar = (tp) this.f43662b;
                boolean z10 = tpVar.f40927s;
                if (!z10 || tpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(tpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(tpVar.f40924f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(tpVar.f40924f);
                    }
                    AndroidUtilities.runOnUIThread(new jp(tpVar, b2VarArr, tpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new no(1, tpVar, b2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((wq) this.f43662b).run(1);
                return;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c1.c(recyclerView);
    }

    @Override
    public RecyclerView i(View view) {
        ((v7) this.f43662b).getClass();
        return v7.c(view);
    }

    @Override
    public void j(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f43662b).get(i10)).intValue()).apply();
    }

    @Override
    public void k(Canvas canvas, RectF rectF, float f7) {
        k8 k8Var = (k8) ((g) this.f43662b).f36451b;
        Paint paint = k8Var.f37875w;
        TextPaint textPaint = k8Var.f37860e;
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
            canvas.drawText(Integer.toString(k8Var.f37865h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void m(org.telegram.ui.Components.ee0 ee0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f43662b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21754a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.c0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, ee0Var);
    }

    @Override
    public void n(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c1.b(recyclerView);
    }

    @Override
    public void o(boolean z10) {
        m3 m3Var = (m3) this.f43662b;
        v3 v3Var = m3Var.K.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    @Override
    public void onCameraInit() {
        w9 w9Var = (w9) this.f43662b;
        HandlerThread handlerThread = w9Var.d;
        handlerThread.start();
        w9Var.f41968e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(w9Var.f41966c0, 0L);
        if (w9Var.Z()) {
            o1.k kVar = w9Var.f41975x;
            if (kVar != null) {
                kVar.c();
                w9Var.f41975x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            w9Var.f41975x = kVar2;
            kVar2.b(new o9(w9Var, 0));
            w9Var.f41975x.a(new p9(w9Var, 0));
            w9Var.f41975x.f16984u = new o1.l(500.0f);
            w9Var.f41975x.f16984u.a(0.8f);
            w9Var.f41975x.f16984u.b(250.0f);
            w9Var.f41975x.f();
        }
    }

    public void p(String str) {
        yn ynVar = ((jm) this.f43662b).Q;
        if (str.startsWith("@")) {
            ynVar.getMessagesController().openByUserName(str.substring(1), ynVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                ynVar.W.Z0(null, str, false, false);
                if (ynVar.W.getFieldText() == null) {
                    ynVar.f9(false);
                    return;
                }
                return;
            }
            ynVar.wa(0, str, null, null, false);
        } else {
            uy uyVar = new uy(null);
            uyVar.f41438n2 = str;
            ynVar.presentFragment(uyVar);
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f43661a) {
            case 15:
                ge geVar = (ge) this.f43662b;
                org.telegram.ui.Components.g61 g61Var = (org.telegram.ui.Components.g61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ie ieVar = geVar.f36602f;
                Object obj6 = g61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.x7.n1(geVar.getContext(), true, ieVar.f37403e, geVar.f36600c, (TL_stars.StarsTransaction) g61Var.G, geVar.f36599b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    me.F0(geVar.getContext(), geVar.f36600c, (TL_stats.BroadcastRevenueTransaction) g61Var.G, ieVar.f37403e, geVar.f36599b);
                    return;
                } else {
                    return;
                }
            default:
                qs qsVar = (qs) this.f43662b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.g61) obj).d;
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qsVar.getParentActivity(), 0, qsVar.f39809r);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.w2(23, qsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public z0(kj kjVar, boolean z10) {
        this.f43661a = 20;
        this.f43662b = kjVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f43661a) {
            case 20:
                yn ynVar = ((kj) this.f43662b).f37994b.f38279b;
                ynVar.pa(ynVar.f43280b4, true);
                return;
            case 21:
                yn ynVar2 = ((tl) this.f43662b).f40870b;
                if (z10) {
                    ynVar2.Q7();
                    UndoView undoView = ynVar2.f43542w3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                rr rrVar = ((jr) this.f43662b).f37741b;
                if (!z10 || rr.W(rrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) rr.Y(rrVar).getFragmentStack().get(rr.X(rrVar).getFragmentStack().size() - 2);
                if (n2Var instanceof to) {
                    n2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", rrVar.N);
                    to toVar = new to(bundle);
                    toVar.l0(rrVar.f40225s);
                    ((ActionBarLayout) rr.b0(rrVar)).c(rr.Z(rrVar).getFragmentStack().size() - 1, toVar);
                    rrVar.finishFragment();
                    toVar.f40886c.j(76, 0L, null);
                    return;
                }
                rrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f43662b).setClickable(false);
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
