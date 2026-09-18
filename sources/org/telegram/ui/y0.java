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
public final class y0 implements org.telegram.ui.Components.bo0, ei.o4, uh1, r0.n, org.telegram.ui.ActionBar.b2, rg.t, org.telegram.ui.Components.rd0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.tv0, ai.ec, CameraView.CameraViewDelegate, Utilities.Callback5, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.nj0, MessagesStorage.BooleanCallback, org.telegram.ui.Cells.f0 {
    public final int f39745a;
    public final Object f39746b;

    public y0(Object obj, int i10) {
        this.f39745a = i10;
        this.f39746b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        j0 j0Var;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.f39746b;
        mVar.getClass();
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        r4 r4Var = (r4) mVar.d;
        if (r4Var == view && (j0Var = r4Var.f32672b) != null) {
            j0Var.setPadding(defaultWindowInsets.f10591a, defaultWindowInsets.f10592b, defaultWindowInsets.f10593c, defaultWindowInsets.d);
        }
        return r0.l1.f41881b;
    }

    @Override
    public void a(int i10, ArrayList arrayList) {
        AndroidUtilities.runOnUIThread(new l4(0, (m4) this.f39746b, arrayList), 100L);
    }

    @Override
    public void b(float f7) {
        z0 z0Var = (z0) this.f39746b;
        MessageObject messageObject = z0Var.M;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(z0Var.M, f7);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.j51 G;
        Object obj;
        long j3;
        switch (this.f39745a) {
            case 7:
                b6 b6Var = (b6) this.f39746b;
                ArrayList arrayList = b6Var.f32059c;
                if (((a6) arrayList.get(i10)).f15543a == 1) {
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
                    wy wyVar = new wy(bundle);
                    wyVar.C2 = new x5(0, b6Var, wyVar);
                    b6Var.presentFragment(wyVar);
                    return;
                } else if (((a6) arrayList.get(i10)).f15543a == 2) {
                    CacheByChatsController.KeepMediaException keepMediaException = ((a6) arrayList.get(i10)).f31729c;
                    r80 r80Var = new r80(view.getContext(), b6Var);
                    r80Var.g(false);
                    r80Var.setParentWindow(org.telegram.ui.Components.c5.Q(b6Var, r80Var, view, f7, f10));
                    r80Var.setCallback(new y5(b6Var, keepMediaException, 0));
                    return;
                } else if (((a6) arrayList.get(i10)).f15543a == 4) {
                    org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(b6Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ou0(b6Var, 13), null).f18447a;
                    c2Var.show();
                    c2Var.h();
                    return;
                } else {
                    return;
                }
            default:
                eu euVar = (eu) this.f39746b;
                HashSet hashSet = euVar.f33475b0;
                if (!euVar.f33476c0 && (G = euVar.f33477d0.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f18268id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f18121id;
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
        }
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39745a) {
            case 7:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(ArrayList arrayList) {
        ii iiVar = (ii) this.f39746b;
        bo boVar = iiVar.f34606p;
        if (boVar.getParentActivity() != null && boVar.getParentActivity() != null) {
            hi hiVar = new hi(iiVar, boVar, boVar.getParentActivity(), boVar.f32279ea, arrayList);
            hiVar.setCalcMandatoryInsets(boVar.x9());
            hiVar.setDimBehind(false);
            boVar.A7(false);
            boVar.showDialog(hiVar);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        switch (this.f39745a) {
            case 4:
                h5 h5Var = (h5) this.f39746b;
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
                q6 q6Var = (q6) this.f39746b;
                ?? g3Var = new org.telegram.ui.ActionBar.g3(q6Var.getContext(), false);
                g3Var.fixNavigationBar();
                g3Var.setCanDismissWithSwipe(false);
                g3Var.setCancelable(false);
                Context context = q6Var.getContext();
                ?? frameLayout = new FrameLayout(context);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(R.raw.utyan_cache, 150, 150, null);
                frameLayout.addView(imageView, w7.x5.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
                frameLayout.f37394a = n6Var;
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27384g;
                n6Var.b(0.35f, 120L, qrVar);
                n6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.j6.f18970j5;
                n6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                n6Var.setTextSize(AndroidUtilities.dp(24.0f));
                n6Var.setTypeface(AndroidUtilities.bold());
                frameLayout.addView(n6Var, w7.x5.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                r6 r6Var = new r6(context);
                Paint paint = new Paint(1);
                r6Var.f37094b = paint;
                Paint paint2 = new Paint(1);
                r6Var.f37095c = paint2;
                r6Var.e = new org.telegram.ui.Components.c6(r6Var, 350L, qrVar);
                int i13 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.l1(0.2f, org.telegram.ui.ActionBar.j6.w0(null, i13, false)));
                frameLayout.f37395b = r6Var;
                frameLayout.addView(r6Var, w7.x5.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
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
                g3Var.setCustomView(frameLayout);
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.o5 o5Var = new org.telegram.ui.ActionBar.o5(q6Var, (Object) frameLayout, fArr, zArr2, 1);
                long[] jArr = {-1};
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(q6Var, zArr, jArr, (Object) g3Var, 2), 150L);
                a7 a7Var = q6Var.d;
                n6 n6Var2 = new n6(fArr, zArr2, o5Var, 0);
                o6 o6Var = new o6(zArr, frameLayout, jArr, g3Var, 0);
                zh.b bVar = a7Var.f31741c0;
                if (bVar != null) {
                    bVar.d();
                }
                x6 x6Var = a7Var.M;
                if (x6Var != null) {
                    x6Var.e();
                    a7Var.M.f(false);
                }
                a7Var.getFileLoader().cancelLoadAllFiles();
                a7Var.getFileLoader().getFileLoaderQueue().postRunnable(new g6(a7Var, n6Var2, o6Var, 0));
                a7Var.f31741c0 = null;
                x6 x6Var2 = a7Var.M;
                if (x6Var2 != null) {
                    x6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 13:
                nd.U((nd) this.f39746b, c2Var);
                return;
            case 16:
                ((wg) this.f39746b).run();
                return;
            case 18:
                bo boVar = ((oj) this.f39746b).f36367b;
                boVar.finishFragment();
                boVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteBusinessLink, boVar.P3);
                return;
            case 22:
                bo boVar2 = ((em) this.f39746b).f33445a.Q;
                i11 = ((org.telegram.ui.ActionBar.o2) boVar2).currentAccount;
                ChatThemeController.getInstance(i11).clearWallpaper(boVar2.T5, true, true);
                return;
            case 23:
                wp wpVar = (wp) this.f39746b;
                boolean z10 = wpVar.f39128s;
                if (!z10 || wpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(wpVar.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = MessagesController.getInputChannel(wpVar.f39125f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = MessagesController.getInputChannel(wpVar.f39125f);
                    }
                    AndroidUtilities.runOnUIThread(new mp(wpVar, c2VarArr, wpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new qo(1, wpVar, c2VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((zq) this.f39746b).run(1);
                return;
        }
    }

    @Override
    public void g(int i10) {
        SharedConfig.getPreferences().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f39746b).get(i10)).intValue()).apply();
    }

    @Override
    public void h(Canvas canvas, RectF rectF, float f7) {
        j8 j8Var = (j8) ((g) this.f39746b).f33810b;
        Paint paint = j8Var.f34815w;
        TextPaint textPaint = j8Var.e;
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
            canvas.drawText(Integer.toString(j8Var.f34807h0 + 1), rectF.centerX(), rectF.centerY() + AndroidUtilities.dp(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void i(org.telegram.ui.Components.sd0 sd0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f39746b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f19774a0;
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
        l3 l3Var = (l3) this.f39746b;
        u3 u3Var = l3Var.K.K;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.dismiss(true);
        }
    }

    public void k(String str) {
        bo boVar = ((nm) this.f39746b).Q;
        if (str.startsWith("@")) {
            boVar.getMessagesController().openByUserName(str.substring(1), boVar, 0);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                boVar.Y.a1(null, str, false, false);
                if (boVar.Y.getFieldText() == null) {
                    boVar.e9(false);
                    return;
                }
                return;
            }
            boVar.xa(0, str, null, null, false);
        } else {
            wy wyVar = new wy(null);
            wyVar.f39266n2 = str;
            boVar.presentFragment(wyVar);
        }
    }

    @Override
    public void onCameraInit() {
        w9 w9Var = (w9) this.f39746b;
        HandlerThread handlerThread = w9Var.d;
        handlerThread.start();
        w9Var.e = new Handler(handlerThread.getLooper());
        AndroidUtilities.runOnUIThread(w9Var.f38610c0, 0L);
        if (w9Var.a0()) {
            o1.k kVar = w9Var.f38618x;
            if (kVar != null) {
                kVar.c();
                w9Var.f38618x = null;
            }
            o1.k kVar2 = new o1.k(new o1.j(0.0f));
            w9Var.f38618x = kVar2;
            kVar2.b(new o9(w9Var, 0));
            w9Var.f38618x.a(new p9(w9Var, 0));
            w9Var.f38618x.f15361u = new o1.l(500.0f);
            w9Var.f38618x.f15361u.a(0.8f);
            w9Var.f38618x.f15361u.b(250.0f);
            w9Var.f38618x.f();
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39745a;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.f39745a) {
            case 14:
                fe feVar = (fe) this.f39746b;
                org.telegram.ui.Components.j51 j51Var = (org.telegram.ui.Components.j51) obj;
                View view = (View) obj2;
                ((Integer) obj3).intValue();
                ((Float) obj4).floatValue();
                ((Float) obj5).floatValue();
                he heVar = feVar.f33627f;
                Object obj6 = j51Var.G;
                if (obj6 instanceof TL_stars.StarsTransaction) {
                    yh.y7.h1(feVar.getContext(), true, heVar.d, feVar.f33626c, (TL_stars.StarsTransaction) j51Var.G, feVar.f33625b);
                    return;
                } else if (obj6 instanceof TL_stats.BroadcastRevenueTransaction) {
                    le.h0(feVar.getContext(), feVar.f33626c, (TL_stats.BroadcastRevenueTransaction) j51Var.G, heVar.d, feVar.f33625b);
                    return;
                } else {
                    return;
                }
            default:
                us usVar = (us) this.f39746b;
                View view2 = (View) obj2;
                ((Integer) obj3).getClass();
                ((Float) obj4).getClass();
                ((Float) obj5).getClass();
                int i10 = ((org.telegram.ui.Components.j51) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !usVar.X;
                        usVar.X = z10;
                        ((org.telegram.ui.Cells.w8) view2).setChecked(z10);
                        return;
                    }
                    return;
                }
                TLRPC.User user = usVar.getMessagesController().getUser(Long.valueOf(usVar.H));
                if (user == null || usVar.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(usVar.getParentActivity(), 0, usVar.f38191r);
                alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.DeleteContact);
                alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.Components.mf(20, usVar, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
        }
    }

    public y0(nj njVar, boolean z10) {
        this.f39745a = 19;
        this.f39746b = njVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void l() {
    }

    @Override
    public void run(boolean z10) {
        switch (this.f39745a) {
            case 19:
                bo boVar = ((nj) this.f39746b).f36121b.f36367b;
                boVar.qa(boVar.f32261d4, true);
                return;
            case 20:
                bo boVar2 = ((xl) this.f39746b).f39666b;
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
                ur urVar = ((mr) this.f39746b).f35877b;
                if (!z10 || ur.X(urVar) == null) {
                    return;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) ur.Z(urVar).getFragmentStack().get(ur.Y(urVar).getFragmentStack().size() - 2);
                if (o2Var instanceof wo) {
                    o2Var.removeSelfFromStack();
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", urVar.N);
                    wo woVar = new wo(bundle);
                    woVar.l0(urVar.f38162s);
                    ((ActionBarLayout) ur.b0(urVar)).c(ur.a0(urVar).getFragmentStack().size() - 1, woVar);
                    urVar.finishFragment();
                    woVar.f39091c.j(76, 0L, null);
                    return;
                }
                urVar.finishFragment();
                return;
        }
    }

    @Override
    public void run(Exception exc) {
        ((org.telegram.ui.Cells.h0) this.f39746b).setClickable(false);
    }

    private final void m(View view, float f7, float f10) {
    }

    private final void n(View view, float f7, float f10) {
    }
}
