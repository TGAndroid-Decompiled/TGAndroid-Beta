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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class w0 implements org.telegram.ui.Components.wm0, ki.r3, ib1, r0.m, org.telegram.ui.ActionBar.q1, ug.s, org.telegram.ui.Components.mc0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.qt0, org.telegram.ui.Components.fu0, fi.a9, org.telegram.ui.Components.gj0, CameraView.CameraViewDelegate, org.telegram.messenger.u10, org.telegram.messenger.mc, org.telegram.ui.Components.di0, org.telegram.messenger.lr, org.telegram.ui.Cells.e0, fx {
    public final int f53062a;
    public final Object f53063b;

    public w0(Object obj, int i7) {
        this.f53062a = i7;
        this.f53063b = obj;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.h3(new n2.c0(28, (m4) this.f53063b, arrayList), 100L);
    }

    @Override
    public void b(boolean z10) {
        k3 k3Var = (k3) this.f53063b;
        t3 t3Var = k3Var.M.L;
        if (t3Var != null) {
            k3Var.h = true;
            t3Var.a(true);
        }
    }

    @Override
    public void c() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.f53063b;
        int i7 = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public void d(ArrayList arrayList) {
        oh ohVar = (oh) this.f53063b;
        bn bnVar = ohVar.f50696p;
        if (bnVar.getParentActivity() != null && bnVar.getParentActivity() != null) {
            nh nhVar = new nh(ohVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
            boolean V9 = bnVar.V9();
            nhVar.f30244i0 = V9;
            nhVar.f30251n = V9;
            nhVar.f30254p0 = false;
            bnVar.P7(false);
            bnVar.showDialog(nhVar);
        }
    }

    @Override
    public void e(float f10) {
        x0 x0Var = (x0) this.f53063b;
        org.telegram.messenger.fj fjVar = x0Var.N;
        if (fjVar == null) {
            return;
        }
        fjVar.f24033b0 = f10;
        MediaController.B().i0(x0Var.N, f10);
    }

    @Override
    public void f() {
        ((ri.q) this.f53063b).g();
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        y5 y5Var = (y5) this.f53063b;
        ArrayList arrayList = y5Var.f54226c;
        if (((x5) arrayList.get(i7)).f56712a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = y5Var.f54227e;
            if (i10 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            bx bxVar = new bx(bundle);
            bxVar.E2 = new oi.f0(6, y5Var, bxVar);
            y5Var.presentFragment(bxVar);
        } else if (((x5) arrayList.get(i7)).f56712a == 2) {
            org.telegram.messenger.t2 t2Var = ((x5) arrayList.get(i7)).f53856c;
            f60 f60Var = new f60(view.getContext(), y5Var);
            f60Var.h(false);
            f60Var.setParentWindow(org.telegram.ui.Components.b5.N(y5Var, f60Var, view, f10, f11));
            f60Var.setCallback(new v5(y5Var, t2Var, 0));
        } else if (((x5) arrayList.get(i7)).f56712a == 4) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.L(y5Var.getParentActivity(), org.telegram.messenger.gd.N0(2131747719, null), org.telegram.messenger.gd.N0(2131747720, null), org.telegram.messenger.gd.N0(2131751586, null), new hq0(y5Var, 13), null).f28835a;
            t1Var.show();
            t1Var.i();
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.f53062a) {
            case 4:
                g5 g5Var = (g5) this.f53063b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f27013b.getPackageName()));
                    g5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                q6 q6Var = (q6) this.f53063b;
                p6 p6Var = new p6(0, q6Var.getContext(), false);
                p6Var.O();
                p6Var.f30230c0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                ai.h0 h0Var = new ai.h0(12, context, false);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624316, 150, 150, null);
                h0Var.addView((View) imageView, c8.na.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
                h0Var.f1214b = n6Var;
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36859g;
                n6Var.b(0.35f, 120L, krVar);
                n6Var.setGravity(1);
                int i11 = org.telegram.ui.ActionBar.n6.f29559j5;
                org.telegram.ui.ActionBar.u6.Y(n6Var, i11, null);
                n6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                n6Var.setTypeface(org.telegram.messenger.g0.o());
                h0Var.addView(n6Var, c8.na.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f51634a = paint;
                Paint paint2 = new Paint(1);
                view.f51635b = paint2;
                view.d = new org.telegram.ui.Components.c6((View) view, 350L, krVar);
                int i12 = org.telegram.ui.ActionBar.n6.N6;
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i12, false));
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.2f, org.telegram.ui.ActionBar.n6.x0(null, i12, false)));
                h0Var.f1215c = view;
                h0Var.addView((View) view, c8.na.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.f3.l(textView, i11, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.gd.N0(2131752034, null));
                h0Var.addView(textView, c8.na.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.u6.U(textView2, i11, null);
                i5.c.r(14.0f, 1, 2131752033, textView2, null);
                h0Var.addView(textView2, c8.na.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                h0Var.f(0.0f);
                p6Var.O = h0Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                oi.h hVar = new oi.h(q6Var, h0Var, fArr, zArr2, 6);
                long[] jArr = {-1};
                org.telegram.messenger.g0.h3(new oi.h(q6Var, zArr, jArr, p6Var, 7), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var2 = new n6(fArr, zArr2, hVar, 0);
                o6 o6Var = new o6(zArr, h0Var, jArr, p6Var, 0);
                ei.c cVar = y6Var.f54248e0;
                if (cVar != null) {
                    cVar.d();
                }
                j6 j6Var = y6Var.N;
                if (j6Var != null) {
                    j6Var.e();
                    y6Var.N.f(false);
                }
                y6Var.getFileLoader().c();
                y6Var.getFileLoader().getClass();
                org.telegram.messenger.w7.K.c(new f6(y6Var, n6Var2, o6Var, 0));
                y6Var.f54248e0 = null;
                j6 j6Var2 = y6Var.N;
                if (j6Var2 != null) {
                    j6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                ad.Z((ad) this.f53063b, t1Var);
                return;
            case 17:
                ((vf) this.f53063b).run();
                return;
            case 19:
                bn bnVar = ((ti) this.f53063b).f52410b;
                bnVar.finishFragment();
                bnVar.getNotificationCenter().k(127, bnVar.f46178e4);
                return;
            case 23:
                bn bnVar2 = ((fl) this.f53063b).f47911a.R;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                org.telegram.messenger.f4.f(i10).a(bnVar2.f46271l6, true, true);
                return;
            case 24:
                ((yn) this.f53063b).f54401b.e0();
                return;
            case 25:
                uo uoVar = (uo) this.f53063b;
                boolean z10 = uoVar.f52703s;
                if (!z10 || uoVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, uoVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.mp.k1(uoVar.f52700f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.mp.k1(uoVar.f52700f);
                    }
                    org.telegram.messenger.g0.h3(new ko(uoVar, t1VarArr, uoVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new v7(9, uoVar, t1VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((wp) this.f53063b).a(1);
                return;
        }
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = this.f53062a;
        Object obj3 = this.f53063b;
        switch (i7) {
            case 15:
                rd rdVar = (rd) obj3;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                td tdVar = rdVar.f51707f;
                Object obj4 = n41Var.H;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    di.pb.l1(rdVar.getContext(), true, tdVar.f52365e, rdVar.f51705c, (TL_stars.StarsTransaction) n41Var.H, rdVar.f51704b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    xd.M(rdVar.getContext(), rdVar.f51705c, (TL_stats.BroadcastRevenueTransaction) n41Var.H, tdVar.f52365e, rdVar.f51704b);
                    return;
                } else {
                    return;
                }
            default:
                qr qrVar = (qr) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i10 = ((org.telegram.ui.Components.n41) obj).d;
                if (i10 == 1) {
                    TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                    if (c22 != null && qrVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qrVar.getParentActivity(), qrVar.f51524r);
                        String N0 = org.telegram.messenger.gd.N0(2131751540, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131754100, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.Components.g2(27, qrVar, c22));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    }
                    return;
                } else if (i10 == 2) {
                    boolean z10 = !qrVar.Y;
                    qrVar.Y = z10;
                    ((org.telegram.ui.Cells.r8) view2).setChecked(z10);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public RecyclerView l(View view) {
        return ((t7) this.f53063b).c(view);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        k0 k0Var;
        ab.q qVar = (ab.q) this.f53063b;
        qVar.getClass();
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        r4 r4Var = (r4) qVar.d;
        if (r4Var == view && (k0Var = r4Var.f45913b) != null) {
            k0Var.setPadding(I0.f15978a, I0.f15979b, I0.f15980c, I0.d);
        }
        return r0.l1.f56380b;
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f10) {
        j8 j8Var = ((w7) this.f53063b).f53183a;
        Paint paint = j8Var.f49040x;
        TextPaint textPaint = j8Var.f49020e;
        paint.setAlpha((int) (80.0f * f10));
        float T1 = org.telegram.messenger.g0.T1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f10);
        canvas.drawRoundRect(rectF, T1, T1, paint);
        float i7 = Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i7 > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i7));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / org.telegram.messenger.g0.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(j8Var.f49026i0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void n(int i7) {
        org.telegram.messenger.bz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f53063b).get(i7)).intValue()).apply();
    }

    @Override
    public void onCameraInit() {
        t9 t9Var = (t9) this.f53063b;
        HandlerThread handlerThread = t9Var.f52303e;
        handlerThread.start();
        t9Var.f52305f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.h3(t9Var.f52304e0, 0L);
        if (t9Var.f0()) {
            r1.g gVar = t9Var.E;
            if (gVar != null) {
                gVar.d();
                t9Var.E = null;
            }
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            t9Var.E = gVar2;
            gVar2.b(new l9(t9Var, 0));
            t9Var.E.a(new m9(t9Var, 0));
            t9Var.E.f56446m = new r1.h(500.0f);
            t9Var.E.f56446m.a(0.8f);
            t9Var.E.f56446m.b(250.0f);
            t9Var.E.h();
        }
    }

    @Override
    public void p(org.telegram.ui.Components.oc0 oc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f53063b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f30428b0;
        org.telegram.messenger.bz.C = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.f0();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25259o0, oc0Var);
    }

    @Override
    public void q(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        org.telegram.ui.ActionBar.r4 r4Var5;
        switch (this.f53062a) {
            case 20:
                bn bnVar = ((si) this.f53063b).f52092b.f52410b;
                bnVar.Ta(bnVar.f46359s4, true);
                return;
            case 21:
                bn bnVar2 = ((zk) this.f53063b).n1;
                if (z10) {
                    bnVar2.h8();
                    UndoView undoView = bnVar2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                rq rqVar = ((jq) this.f53063b).n1;
                if (z10) {
                    r4Var = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                    if (r4Var != null) {
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                        List fragmentStack = r4Var2.getFragmentStack();
                        r4Var3 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var3.getFragmentStack().size() - 2);
                        if (g2Var instanceof rn) {
                            g2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rqVar.N);
                            rn rnVar = new rn(bundle);
                            rnVar.q0(rqVar.f51847r);
                            r4Var4 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                            r4Var5 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                            ((ActionBarLayout) r4Var4).c(r4Var5.getFragmentStack().size() - 1, rnVar);
                            rqVar.finishFragment();
                            rnVar.f51768c.j(76, 0L, null);
                            return;
                        }
                        rqVar.finishFragment();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override
    public void s(Exception exc) {
        ((org.telegram.ui.Cells.g0) this.f53063b).setClickable(false);
    }

    public void t(String str) {
        bn bnVar = ((kl) this.f53063b).R;
        if (str.startsWith("@")) {
            bnVar.getMessagesController().F3(str.substring(1), bnVar, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                bnVar.f46118a0.D1(null, str, false, false);
                if (bnVar.f46118a0.getFieldText() == null) {
                    bnVar.D9(false);
                    return;
                }
                return;
            }
            bnVar.Za(0, str, null, null, false);
        } else {
            bx bxVar = new bx(null);
            bxVar.f46597p2 = str;
            bnVar.presentFragment(bxVar);
        }
    }

    public w0(si siVar, boolean z10) {
        this.f53062a = 20;
        this.f53063b = siVar;
    }

    @Override
    public void h(float f10) {
    }

    @Override
    public void o() {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
