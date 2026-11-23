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
public final class w0 implements org.telegram.ui.Components.wm0, ki.q3, kb1, r0.m, org.telegram.ui.ActionBar.q1, ug.s, org.telegram.ui.Components.oc0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.rt0, org.telegram.ui.Components.gu0, fi.a9, org.telegram.ui.Components.gj0, CameraView.CameraViewDelegate, org.telegram.messenger.w10, org.telegram.messenger.nc, org.telegram.ui.Components.di0, org.telegram.messenger.mr, org.telegram.ui.Cells.e0, gx {
    public final int f52896a;
    public final Object f52897b;

    public w0(Object obj, int i7) {
        this.f52896a = i7;
        this.f52897b = obj;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        k0 k0Var;
        ab.q qVar = (ab.q) this.f52897b;
        qVar.getClass();
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        r4 r4Var = (r4) qVar.d;
        if (r4Var == view && (k0Var = r4Var.f45731b) != null) {
            k0Var.setPadding(I0.f15883a, I0.f15884b, I0.f15885c, I0.d);
        }
        return r0.l1.f56267b;
    }

    @Override
    public void a(float f10) {
        x0 x0Var = (x0) this.f52897b;
        org.telegram.messenger.gj gjVar = x0Var.N;
        if (gjVar == null) {
            return;
        }
        gjVar.f24137b0 = f10;
        MediaController.B().i0(x0Var.N, f10);
    }

    @Override
    public void b() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.f52897b;
        int i7 = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.h3(new oi.s2(24, (m4) this.f52897b, arrayList), 100L);
    }

    @Override
    public void d(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        org.telegram.ui.ActionBar.r4 r4Var5;
        switch (this.f52896a) {
            case 20:
                bn bnVar = ((si) this.f52897b).f52019b.f52284b;
                bnVar.Ta(bnVar.f46144s4, true);
                return;
            case 21:
                bn bnVar2 = ((zk) this.f52897b).n1;
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
                rq rqVar = ((jq) this.f52897b).n1;
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
                            rnVar.q0(rqVar.f51762r);
                            r4Var4 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                            r4Var5 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                            ((ActionBarLayout) r4Var4).c(r4Var5.getFragmentStack().size() - 1, rnVar);
                            rqVar.finishFragment();
                            rnVar.f51679c.j(76, 0L, null);
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
    public void e(ArrayList arrayList) {
        nh nhVar = (nh) this.f52897b;
        bn bnVar = nhVar.f50198p;
        if (bnVar.getParentActivity() != null && bnVar.getParentActivity() != null) {
            mh mhVar = new mh(nhVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
            boolean V9 = bnVar.V9();
            mhVar.f30160i0 = V9;
            mhVar.f30167n = V9;
            mhVar.f30170p0 = false;
            bnVar.P7(false);
            bnVar.showDialog(mhVar);
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        x5 x5Var = (x5) this.f52897b;
        ArrayList arrayList = x5Var.f53556c;
        if (((w5) arrayList.get(i7)).f56599a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = x5Var.f53557e;
            if (i10 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            cx cxVar = new cx(bundle);
            cxVar.E2 = new oi.e0(6, x5Var, cxVar);
            x5Var.presentFragment(cxVar);
        } else if (((w5) arrayList.get(i7)).f56599a == 2) {
            org.telegram.messenger.t2 t2Var = ((w5) arrayList.get(i7)).f52941c;
            f60 f60Var = new f60(view.getContext(), x5Var);
            f60Var.h(false);
            f60Var.setParentWindow(org.telegram.ui.Components.c5.N(x5Var, f60Var, view, f10, f11));
            f60Var.setCallback(new u5(x5Var, t2Var, 0));
        } else if (((w5) arrayList.get(i7)).f56599a == 4) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.L(x5Var.getParentActivity(), org.telegram.messenger.hd.N0(2131747719, null), org.telegram.messenger.hd.N0(2131747720, null), org.telegram.messenger.hd.N0(2131751586, null), new iq0(x5Var, 13), null).f28743a;
            t1Var.show();
            t1Var.i();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.f52896a) {
            case 4:
                g5 g5Var = (g5) this.f52897b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26895b.getPackageName()));
                    g5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                p6 p6Var = (p6) this.f52897b;
                o6 o6Var = new o6(0, p6Var.getContext(), false);
                o6Var.O();
                o6Var.f30146c0 = false;
                o6Var.setCancelable(false);
                Context context = p6Var.getContext();
                ai.g0 g0Var = new ai.g0(12, context, false);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624316, 150, 150, null);
                g0Var.addView((View) imageView, c8.na.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(context, false, true, true);
                g0Var.f1199b = o6Var2;
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f37918g;
                o6Var2.b(0.35f, 120L, nrVar);
                o6Var2.setGravity(1);
                int i11 = org.telegram.ui.ActionBar.m6.f29455j5;
                org.telegram.ui.ActionBar.t6.Y(o6Var2, i11, null);
                o6Var2.setTextSize(org.telegram.messenger.g0.L(24.0f));
                o6Var2.setTypeface(org.telegram.messenger.g0.o());
                g0Var.addView(o6Var2, c8.na.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f51018a = paint;
                Paint paint2 = new Paint(1);
                view.f51019b = paint2;
                view.d = new org.telegram.ui.Components.d6((View) view, 350L, nrVar);
                int i12 = org.telegram.ui.ActionBar.m6.N6;
                paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
                paint2.setColor(org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, i12, false)));
                g0Var.f1200c = view;
                g0Var.addView((View) view, c8.na.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.f3.l(textView, i11, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.hd.N0(2131752034, null));
                g0Var.addView(textView, c8.na.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.t6.U(textView2, i11, null);
                i5.c.r(14.0f, 1, 2131752033, textView2, null);
                g0Var.addView(textView2, c8.na.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                g0Var.f(0.0f);
                o6Var.O = g0Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.messenger.camera.i iVar = new org.telegram.messenger.camera.i(p6Var, g0Var, fArr, zArr2, 5);
                long[] jArr = {-1};
                org.telegram.messenger.g0.h3(new org.telegram.messenger.camera.i(p6Var, zArr, jArr, o6Var, 6), 150L);
                x6 x6Var = p6Var.d;
                m6 m6Var = new m6(fArr, zArr2, iVar, 0);
                n6 n6Var = new n6(zArr, g0Var, jArr, o6Var, 0);
                ei.c cVar = x6Var.f53578e0;
                if (cVar != null) {
                    cVar.d();
                }
                i6 i6Var = x6Var.N;
                if (i6Var != null) {
                    i6Var.e();
                    x6Var.N.f(false);
                }
                x6Var.getFileLoader().c();
                x6Var.getFileLoader().getClass();
                org.telegram.messenger.w7.K.c(new e6(x6Var, m6Var, n6Var, 0));
                x6Var.f53578e0 = null;
                i6 i6Var2 = x6Var.N;
                if (i6Var2 != null) {
                    i6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                ad.Z((ad) this.f52897b, t1Var);
                return;
            case 17:
                ((vf) this.f52897b).run();
                return;
            case 19:
                bn bnVar = ((ti) this.f52897b).f52284b;
                bnVar.finishFragment();
                bnVar.getNotificationCenter().k(127, bnVar.f45963e4);
                return;
            case 23:
                bn bnVar2 = ((fl) this.f52897b).f47726a.R;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                org.telegram.messenger.f4.f(i10).a(bnVar2.f46056l6, true, true);
                return;
            case 24:
                ((yn) this.f52897b).f54211b.e0();
                return;
            case 25:
                uo uoVar = (uo) this.f52897b;
                boolean z10 = uoVar.f52604s;
                if (!z10 || uoVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, uoVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.np.k1(uoVar.f52601f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.np.k1(uoVar.f52601f);
                    }
                    org.telegram.messenger.g0.h3(new ko(uoVar, t1VarArr, uoVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new u7(9, uoVar, t1VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((wp) this.f52897b).a(1);
                return;
        }
    }

    @Override
    public void i() {
        ((ri.q) this.f52897b).g();
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public void k(int i7) {
        org.telegram.messenger.cz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f52897b).get(i7)).intValue()).apply();
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = this.f52896a;
        Object obj3 = this.f52897b;
        switch (i7) {
            case 15:
                rd rdVar = (rd) obj3;
                org.telegram.ui.Components.o41 o41Var = (org.telegram.ui.Components.o41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                td tdVar = rdVar.f51592f;
                Object obj4 = o41Var.H;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    di.pb.l1(rdVar.getContext(), true, tdVar.f52255e, rdVar.f51590c, (TL_stars.StarsTransaction) o41Var.H, rdVar.f51589b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    xd.M(rdVar.getContext(), rdVar.f51590c, (TL_stats.BroadcastRevenueTransaction) o41Var.H, tdVar.f52255e, rdVar.f51589b);
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
                int i10 = ((org.telegram.ui.Components.o41) obj).d;
                if (i10 == 1) {
                    TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                    if (c22 != null && qrVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qrVar.getParentActivity(), qrVar.f51276r);
                        String N0 = org.telegram.messenger.hd.N0(2131751540, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.hd.N0(2131754100, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new org.telegram.ui.Components.h2(27, qrVar, c22));
                        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    }
                    return;
                } else if (i10 == 2) {
                    boolean z10 = !qrVar.Y;
                    qrVar.Y = z10;
                    ((org.telegram.ui.Cells.s8) view2).setChecked(z10);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void m(Canvas canvas, RectF rectF, float f10) {
        i8 i8Var = ((v7) this.f52897b).f52723a;
        Paint paint = i8Var.f48618x;
        TextPaint textPaint = i8Var.f48598e;
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
            canvas.drawText(Integer.toString(i8Var.f48604i0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public RecyclerView n(View view) {
        return ((s7) this.f52897b).c(view);
    }

    @Override
    public void onCameraInit() {
        t9 t9Var = (t9) this.f52897b;
        HandlerThread handlerThread = t9Var.f52219e;
        handlerThread.start();
        t9Var.f52221f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.h3(t9Var.f52220e0, 0L);
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
            t9Var.E.f56333m = new r1.h(500.0f);
            t9Var.E.f56333m.a(0.8f);
            t9Var.E.f56333m.b(250.0f);
            t9Var.E.h();
        }
    }

    @Override
    public void p(org.telegram.ui.Components.qc0 qc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f52897b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f30335b0;
        org.telegram.messenger.cz.C = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.f0();
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25318o0, qc0Var);
    }

    @Override
    public void q(Exception exc) {
        ((org.telegram.ui.Cells.g0) this.f52897b).setClickable(false);
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override
    public void s(boolean z10) {
        k3 k3Var = (k3) this.f52897b;
        t3 t3Var = k3Var.M.L;
        if (t3Var != null) {
            k3Var.h = true;
            t3Var.a(true);
        }
    }

    public void t(String str) {
        bn bnVar = ((kl) this.f52897b).R;
        if (str.startsWith("@")) {
            bnVar.getMessagesController().F3(str.substring(1), bnVar, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                bnVar.f45903a0.C1(null, str, false, false);
                if (bnVar.f45903a0.getFieldText() == null) {
                    bnVar.D9(false);
                    return;
                }
                return;
            }
            bnVar.Za(0, str, null, null, false);
        } else {
            cx cxVar = new cx(null);
            cxVar.f46731p2 = str;
            bnVar.presentFragment(cxVar);
        }
    }

    public w0(si siVar, boolean z10) {
        this.f52896a = 20;
        this.f52897b = siVar;
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void o() {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
