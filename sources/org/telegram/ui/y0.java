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
public final class y0 implements org.telegram.ui.Components.ip0, hi.m4, qg1, r0.n, org.telegram.ui.ActionBar.b2, tg.t, org.telegram.ui.Components.ke0, org.telegram.ui.Components.bm0, org.telegram.ui.Components.kw0, org.telegram.ui.Components.zw0, di.t9, org.telegram.ui.Components.pl0, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.nk0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.e0 {
    public final int f45808a;
    public final Object f45809b;

    public y0(Object obj, int i10) {
        this.f45808a = i10;
        this.f45809b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        k0 k0Var;
        c2.b bVar = (c2.b) this.f45809b;
        bVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        v4 v4Var = (v4) bVar.d;
        if (v4Var == view && (k0Var = v4Var.f39167b) != null) {
            k0Var.setPadding(defaultWindowInsets.f13449a, defaultWindowInsets.f13450b, defaultWindowInsets.f13451c, defaultWindowInsets.d);
        }
        return r0.k1.f47152b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(13, (q4) this.f45809b, arrayList), 100L);
    }

    @Override
    public float b(RecyclerView recyclerView) {
        return org.telegram.ui.Components.b10.c(recyclerView);
    }

    @Override
    public void c(float f7) {
        z0 z0Var = (z0) this.f45809b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d() {
        ((oi.q) this.f45809b).g();
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        c6 c6Var = (c6) this.f45809b;
        ArrayList arrayList = c6Var.f38180c;
        if (((b6) arrayList.get(i10)).f47075a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = c6Var.e;
            if (i11 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ey eyVar = new ey(bundle);
            eyVar.C2 = new m4.s0(9, c6Var, eyVar);
            c6Var.presentFragment(eyVar);
        } else if (((b6) arrayList.get(i10)).f47075a == 2) {
            CacheByChatsController.KeepMediaException keepMediaException = ((b6) arrayList.get(i10)).f37893c;
            d80 d80Var = new d80(view.getContext(), c6Var);
            d80Var.h(false);
            d80Var.setParentWindow(org.telegram.ui.Components.g5.P(c6Var, d80Var, view, f7, f10));
            d80Var.setCallback(new z5(c6Var, keepMediaException, 0));
        } else if (((b6) arrayList.get(i10)).f47075a == 4) {
            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(c6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new bu0(c6Var, 13), null).f22369a;
            e2Var.show();
            e2Var.i();
        }
    }

    @Override
    public void g(ArrayList arrayList) {
        ci ciVar = (ci) this.f45809b;
        wn wnVar = ciVar.f38367p;
        if (wnVar.getParentActivity() != null && wnVar.getParentActivity() != null) {
            bi biVar = new bi(ciVar, wnVar, wnVar.getParentActivity(), wnVar.f45309ua, arrayList);
            biVar.setCalcMandatoryInsets(wnVar.I9());
            biVar.setDimBehind(false);
            wnVar.J7(false);
            wnVar.showDialog(biVar);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        switch (this.f45808a) {
            case 4:
                k5 k5Var = (k5) this.f45809b;
                k5Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    k5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                t6 t6Var = (t6) this.f45809b;
                s6 s6Var = new s6(t6Var.getContext(), false);
                s6Var.fixNavigationBar();
                s6Var.setCanDismissWithSwipe(false);
                s6Var.setCancelable(false);
                Context context = t6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, org.telegram.ui.Components.kb1.h(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, false, true, true);
                frameLayout.f44191a = s6Var2;
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27531g;
                s6Var2.b(0.35f, 120L, dsVar);
                s6Var2.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.y6.f23465j5;
                org.telegram.ui.ActionBar.f7.Z(s6Var2, i12, null);
                s6Var2.setTextSize(AndroidUtilities.dp(24.0f));
                s6Var2.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(s6Var2, org.telegram.ui.Components.kb1.h(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f43889a = paint;
                Paint paint2 = new Paint(1);
                view.f43890b = paint2;
                view.d = new org.telegram.ui.Components.h6((View) view, 350L, dsVar);
                int i13 = org.telegram.ui.ActionBar.y6.N6;
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, i13, false)));
                frameLayout.f44192b = view;
                frameLayout.addView(view, org.telegram.ui.Components.kb1.h(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.t.r(textView, i12, null, 1, 16.0f);
                textView.setText(LocaleController.getString(R.string.ClearingCache));
                frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.f7.V(textView2, i12, null);
                textView2.setTextSize(1, 14.0f);
                textView2.setText(LocaleController.getString(R.string.ClearingCacheDescription));
                frameLayout.addView(textView2, org.telegram.ui.Components.kb1.h(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                frameLayout.a(0.0f);
                s6Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                m4.v0 v0Var = new m4.v0(t6Var, (Object) frameLayout, fArr, zArr2, 8);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new m4.v0(t6Var, zArr, jArr, s6Var, 9), 150L);
                c7 c7Var = t6Var.d;
                q6 q6Var = new q6(fArr, zArr2, v0Var, 0);
                r6 r6Var = new r6(zArr, frameLayout, jArr, s6Var, 0);
                ci.b bVar = c7Var.f38195e0;
                if (bVar != null) {
                    bVar.d();
                }
                m6 m6Var = c7Var.M;
                if (m6Var != null) {
                    m6Var.e();
                    c7Var.M.f(false);
                }
                c7Var.getFileLoader().cancelLoadAllFiles();
                c7Var.getFileLoader().getFileLoaderQueue().postRunnable(new i6(c7Var, q6Var, r6Var, 0));
                c7Var.f38195e0 = null;
                m6 m6Var2 = c7Var.M;
                if (m6Var2 != null) {
                    m6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                nd.V((nd) this.f45809b, e2Var);
                return;
            case 17:
                ((ig) this.f45809b).run();
                return;
            case 19:
                wn wnVar = ((jj) this.f45809b).f40550b;
                wnVar.finishFragment();
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, wnVar.f45062b4);
                return;
            case 23:
                wn wnVar2 = ((yl) this.f45809b).f46046a.Q;
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(wnVar2.f45168j6, true, true);
                return;
            case 24:
                pp ppVar = (pp) this.f45809b;
                boolean z10 = ppVar.f42470s;
                if (!z10 || ppVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(ppVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(ppVar.f42467f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(ppVar.f42467f);
                    }
                    AndroidUtilities.runOnUIThread(new ep(ppVar, e2VarArr, ppVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new z7(9, ppVar, e2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((rq) this.f45809b).run(1);
                return;
        }
    }

    @Override
    public RecyclerView i(View view) {
        return ((x7) this.f45809b).c(view);
    }

    @Override
    public void j(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f45809b).get(i10)).intValue()).apply();
    }

    @Override
    public void k(Canvas canvas, RectF rectF, float f7) {
        n8 n8Var = (n8) ((f) this.f45809b).f39115b;
        Paint paint = n8Var.f41673w;
        TextPaint textPaint = n8Var.e;
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
            canvas.drawText(Integer.toString(n8Var.f41660h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void l(org.telegram.ui.Components.me0 me0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f45809b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f23823a0;
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.y(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.e0();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, me0Var);
    }

    @Override
    public void n(RecyclerView recyclerView) {
        org.telegram.ui.Components.b10.b(recyclerView);
    }

    @Override
    public void o(boolean z10) {
        m3 m3Var = (m3) this.f45809b;
        v3 v3Var = m3Var.L.K;
        if (v3Var != null) {
            m3Var.h = true;
            v3Var.dismiss(true);
        }
    }

    @Override
    public void onCameraInit() {
        y9 y9Var = (y9) this.f45809b;
        HandlerThread handlerThread = y9Var.e;
        handlerThread.start();
        y9Var.f45896f = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(y9Var.f45894d0, 0L);
        if (y9Var.b0()) {
            o1.j jVar = y9Var.f45903y;
            if (jVar != null) {
                jVar.c();
                y9Var.f45903y = null;
            }
            o1.j jVar2 = new o1.j(new ac.a(0.0f));
            y9Var.f45903y = jVar2;
            jVar2.b(new q9(y9Var, 0));
            y9Var.f45903y.a(new r9(y9Var, 0));
            y9Var.f45903y.f18968u = new o1.k(500.0f);
            y9Var.f45903y.f18968u.a(0.8f);
            y9Var.f45903y.f18968u.b(250.0f);
            y9Var.f45903y.h();
        }
    }

    public void p(String str) {
        wn wnVar = ((hm) this.f45809b).Q;
        if (str.startsWith("@")) {
            wnVar.getMessagesController().openByUserName(str.substring(1), wnVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                wnVar.Y.W0(null, str, false, false);
                if (wnVar.Y.getFieldText() == null) {
                    wnVar.r9(false);
                    return;
                }
                return;
            }
            wnVar.Ja(0, str, null, null, false);
        } else {
            ey eyVar = new ey(null);
            eyVar.f39044n2 = str;
            wnVar.presentFragment(eyVar);
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f45808a) {
            case 15:
                ee eeVar = (ee) this.f45809b;
                org.telegram.ui.Components.u61 u61Var = (org.telegram.ui.Components.u61) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                ge geVar = eeVar.f38849f;
                Object obj6 = u61Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    bi.dd.g1(eeVar.getContext(), true, geVar.e, eeVar.f38848c, (TL_stars.StarsTransaction) u61Var.G, eeVar.f38847b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    ke.M(eeVar.getContext(), eeVar.f38848c, (TL_stats.BroadcastRevenueTransaction) u61Var.G, geVar.e, eeVar.f38847b);
                    return;
                } else {
                    return;
                }
            default:
                ls lsVar = (ls) this.f45809b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.u61) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !lsVar.X;
                        lsVar.X = z10;
                        ((org.telegram.ui.Cells.a9) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = lsVar.getMessagesController().getUser(Long.valueOf(lsVar.H));
                if (user == null || lsVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lsVar.getParentActivity(), 0, lsVar.f41252r);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.voip.k1(2, lsVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
        }
    }

    public y0(ij ijVar, boolean z10) {
        this.f45808a = 20;
        this.f45809b = ijVar;
    }

    @Override
    public void m() {
    }

    @Override
    public void f(float f7) {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f45808a) {
            case 20:
                wn wnVar = ((ij) this.f45809b).f40199b.f40550b;
                wnVar.Da(wnVar.f45241p4, true);
                return;
            case 21:
                wn wnVar2 = ((sl) this.f45809b).f43352b;
                if (z10) {
                    wnVar2.Z7();
                    UndoView undoView = wnVar2.K3;
                    if (undoView == null) {
                        return;
                    }
                    undoView.j(76, 0L, null);
                    return;
                }
                return;
            default:
                mr mrVar = ((er) this.f45809b).f38925b;
                if (!z10 || mr.Y(mrVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) mr.a0(mrVar).getFragmentStack().get(mr.Z(mrVar).getFragmentStack().size() - 2);
                if (r2Var instanceof oo) {
                    r2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", mrVar.M);
                    oo ooVar = new oo(bundle);
                    ooVar.m0(mrVar.f41539r);
                    ((ActionBarLayout) mr.c0(mrVar)).c(mr.b0(mrVar).getFragmentStack().size() - 1, ooVar);
                    mrVar.finishFragment();
                    ooVar.f42133c.j(76, 0L, null);
                    return;
                }
                mrVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.g0) this.f45809b).setClickable(false);
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
