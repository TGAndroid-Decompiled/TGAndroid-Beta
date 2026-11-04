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
public final class x0 implements org.telegram.ui.Components.lm0, ii.b4, ab1, r0.m, org.telegram.ui.ActionBar.p1, vg.s, org.telegram.ui.Components.xb0, org.telegram.ui.Components.gj0, org.telegram.ui.Components.et0, org.telegram.ui.Components.tt0, ei.m9, org.telegram.ui.Components.ui0, CameraView.CameraViewDelegate, org.telegram.messenger.s10, org.telegram.messenger.ic, org.telegram.ui.Components.rh0, org.telegram.messenger.ir, org.telegram.ui.Cells.d0, yw {
    public final int f51671a;
    public final Object f51672b;

    public x0(Object obj, int i3) {
        this.f51671a = i3;
        this.f51672b = obj;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        l0 l0Var;
        b4.n nVar = (b4.n) this.f51672b;
        nVar.getClass();
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        t4 t4Var = (t4) nVar.d;
        if (t4Var == view && (l0Var = t4Var.f44552b) != null) {
            l0Var.setPadding(I0.f14495a, I0.f14496b, I0.f14497c, I0.d);
        }
        return r0.k1.f54025b;
    }

    @Override
    public void a(boolean z10) {
        l3 l3Var = (l3) this.f51672b;
        u3 u3Var = l3Var.M.L;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.a(true);
        }
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        z5 z5Var = (z5) this.f51672b;
        ArrayList arrayList = z5Var.f52535c;
        if (((y5) arrayList.get(i3)).f54715a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = z5Var.f52536e;
            if (i10 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            uw uwVar = new uw(bundle);
            uwVar.D2 = new mi.d4(14, z5Var, uwVar);
            z5Var.presentFragment(uwVar);
        } else if (((y5) arrayList.get(i3)).f54715a == 2) {
            org.telegram.messenger.s2 s2Var = ((y5) arrayList.get(i3)).f52193c;
            y50 y50Var = new y50(view.getContext(), z5Var);
            y50Var.h(false);
            y50Var.setParentWindow(org.telegram.ui.Components.t4.P(z5Var, y50Var, view, f10, f11));
            y50Var.setCallback(new w5(z5Var, s2Var, 0));
        } else if (((y5) arrayList.get(i3)).f54715a == 4) {
            org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.N(z5Var.getParentActivity(), org.telegram.messenger.bd.M0(2131747921, null), org.telegram.messenger.bd.M0(2131747922, null), org.telegram.messenger.bd.M0(2131751599, null), new xp0(z5Var, 13), null).f27343a;
            s1Var.show();
            s1Var.i();
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(float f10) {
        y0 y0Var = (y0) this.f51672b;
        org.telegram.messenger.zi ziVar = y0Var.N;
        if (ziVar == null) {
            return;
        }
        ziVar.f26828b0 = f10;
        MediaController.B().i0(y0Var.N, f10);
    }

    @Override
    public void e(int i3, ArrayList arrayList) {
        org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(14, (o4) this.f51672b, arrayList), 100L);
    }

    @Override
    public void f(Canvas canvas, RectF rectF, float f10) {
        i8 i8Var = ((w7) this.f51672b).f50725a;
        Paint paint = i8Var.f46190x;
        TextPaint textPaint = i8Var.f46170e;
        paint.setAlpha((int) (80.0f * f10));
        float T1 = org.telegram.messenger.g0.T1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f10);
        canvas.drawRoundRect(rectF, T1, T1, paint);
        float i3 = Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i3 > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i3));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / org.telegram.messenger.g0.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(i8Var.f46176i0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        switch (this.f51671a) {
            case 4:
                i5 i5Var = (i5) this.f51672b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25457b.getPackageName()));
                    i5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                r6 r6Var = (r6) this.f51672b;
                q6 q6Var = new q6(0, r6Var.getContext(), false);
                q6Var.N();
                q6Var.f28590c0 = false;
                q6Var.setCancelable(false);
                Context context = r6Var.getContext();
                ai.c0 c0Var = new ai.c0(10, context, false);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624315, 150, 150, null);
                c0Var.addView((View) imageView, b8.mf.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
                c0Var.f536b = h6Var;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40453g;
                h6Var.b(0.35f, 120L, xqVar);
                h6Var.setGravity(1);
                int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
                org.telegram.ui.ActionBar.r6.Z(h6Var, i11, null);
                h6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                c0Var.addView(h6Var, b8.mf.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f49371a = paint;
                Paint paint2 = new Paint(1);
                view.f49372b = paint2;
                view.d = new org.telegram.ui.Components.u5((View) view, 350L, xqVar);
                int i12 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, i12, false)));
                c0Var.f537c = view;
                c0Var.addView((View) view, b8.mf.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.k5.n(textView, i11, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.bd.M0(2131752046, null));
                c0Var.addView(textView, b8.mf.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
                k2.p1.u(textView2, 1, 14.0f, null, 2131752045);
                c0Var.addView(textView2, b8.mf.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                c0Var.f(0.0f);
                q6Var.O = c0Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                o4.b1 b1Var = new o4.b1(r6Var, c0Var, fArr, zArr2, 6);
                long[] jArr = {-1};
                org.telegram.messenger.g0.i3(new o4.b1(r6Var, zArr, jArr, q6Var, 7), 150L);
                z6 z6Var = r6Var.d;
                o6 o6Var = new o6(fArr, zArr2, b1Var, 0);
                p6 p6Var = new p6(zArr, c0Var, jArr, q6Var, 0);
                di.c cVar = z6Var.f52553e0;
                if (cVar != null) {
                    cVar.d();
                }
                k6 k6Var = z6Var.N;
                if (k6Var != null) {
                    k6Var.e();
                    z6Var.N.f(false);
                }
                z6Var.getFileLoader().c();
                z6Var.getFileLoader().getClass();
                org.telegram.messenger.w7.K.c(new g6(z6Var, o6Var, p6Var, 0));
                z6Var.f52553e0 = null;
                k6 k6Var2 = z6Var.N;
                if (k6Var2 != null) {
                    k6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                ad.Z((ad) this.f51672b, s1Var);
                return;
            case 17:
                ((tf) this.f51672b).run();
                return;
            case 19:
                wm wmVar = ((oi) this.f51672b).f48298b;
                wmVar.finishFragment();
                wmVar.getNotificationCenter().k(127, wmVar.f51297e4);
                return;
            case 23:
                wm wmVar2 = ((al) this.f51672b).f43794a.R;
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar2).currentAccount;
                org.telegram.messenger.d4.f(i10).a(wmVar2.f51376k6, true, true);
                return;
            case 24:
                ((sn) this.f51672b).f49574b.e0();
                return;
            case 25:
                qo qoVar = (qo) this.f51672b;
                boolean z10 = qoVar.f48927s;
                if (!z10 || qoVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, qoVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.hp.i1(qoVar.f48924f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.hp.i1(qoVar.f48924f);
                    }
                    org.telegram.messenger.g0.i3(new eo(qoVar, s1VarArr, qoVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new org.telegram.ui.ActionBar.h6(10, qoVar, s1VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((rp) this.f51672b).a(1);
                return;
        }
    }

    @Override
    public void h() {
        ((pi.q) this.f51672b).g();
    }

    @Override
    public float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i3 = this.f51671a;
        Object obj3 = this.f51672b;
        switch (i3) {
            case 15:
                rd rdVar = (rd) obj3;
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                td tdVar = rdVar.f49203f;
                Object obj4 = r31Var.G;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    ci.wb.k1(rdVar.getContext(), true, tdVar.f49778e, rdVar.f49201c, (TL_stars.StarsTransaction) r31Var.G, rdVar.f49200b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    xd.M(rdVar.getContext(), rdVar.f49201c, (TL_stats.BroadcastRevenueTransaction) r31Var.G, tdVar.f49778e, rdVar.f49200b);
                    return;
                } else {
                    return;
                }
            default:
                lr lrVar = (lr) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i10 = ((org.telegram.ui.Components.r31) obj).d;
                if (i10 == 1) {
                    TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
                    if (a22 != null && lrVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lrVar.getParentActivity(), lrVar.f47421r);
                        String M0 = org.telegram.messenger.bd.M0(2131751553, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.Components.i41(4, lrVar, a22));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    }
                    return;
                } else if (i10 == 2) {
                    boolean z10 = !lrVar.Y;
                    lrVar.Y = z10;
                    ((org.telegram.ui.Cells.q8) view2).setChecked(z10);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void k(ArrayList arrayList) {
        kh khVar = (kh) this.f51672b;
        wm wmVar = khVar.f46947p;
        if (wmVar.getParentActivity() != null && wmVar.getParentActivity() != null) {
            jh jhVar = new jh(khVar, wmVar, wmVar.getParentActivity(), wmVar.f51557ya, arrayList);
            boolean T9 = wmVar.T9();
            jhVar.f28604i0 = T9;
            jhVar.f28608n = T9;
            jhVar.f28611p0 = false;
            wmVar.O7(false);
            wmVar.showDialog(jhVar);
        }
    }

    @Override
    public void l(int i3) {
        org.telegram.messenger.az.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f51672b).get(i3)).intValue()).apply();
    }

    @Override
    public RecyclerView m(View view) {
        return ((u7) this.f51672b).c(view);
    }

    @Override
    public void n() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.f51672b;
        int i3 = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public void o(boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        org.telegram.ui.ActionBar.q4 q4Var5;
        switch (this.f51671a) {
            case 20:
                wm wmVar = ((ni) this.f51672b).f48010b.f48298b;
                wmVar.Qa(wmVar.f51475s4, true);
                return;
            case 21:
                wm wmVar2 = ((uk) this.f51672b).k1;
                if (z10) {
                    wmVar2.f8();
                    UndoView undoView = wmVar2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                nq nqVar = ((eq) this.f51672b).k1;
                if (z10) {
                    q4Var = ((org.telegram.ui.ActionBar.d2) nqVar).parentLayout;
                    if (q4Var != null) {
                        q4Var2 = ((org.telegram.ui.ActionBar.d2) nqVar).parentLayout;
                        List fragmentStack = q4Var2.getFragmentStack();
                        q4Var3 = ((org.telegram.ui.ActionBar.d2) nqVar).parentLayout;
                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(q4Var3.getFragmentStack().size() - 2);
                        if (d2Var instanceof ln) {
                            d2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", nqVar.N);
                            ln lnVar = new ln(bundle);
                            lnVar.q0(nqVar.f48083r);
                            q4Var4 = ((org.telegram.ui.ActionBar.d2) nqVar).parentLayout;
                            q4Var5 = ((org.telegram.ui.ActionBar.d2) nqVar).parentLayout;
                            ((ActionBarLayout) q4Var4).c(q4Var5.getFragmentStack().size() - 1, lnVar);
                            nqVar.finishFragment();
                            lnVar.f47368c.j(76, 0L, null);
                            return;
                        }
                        nqVar.finishFragment();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onCameraInit() {
        s9 s9Var = (s9) this.f51672b;
        HandlerThread handlerThread = s9Var.f49429e;
        handlerThread.start();
        s9Var.f49431f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.i3(s9Var.f49430e0, 0L);
        if (s9Var.f0()) {
            q1.g gVar = s9Var.E;
            if (gVar != null) {
                gVar.d();
                s9Var.E = null;
            }
            q1.g gVar2 = new q1.g(new q1.f(0.0f));
            s9Var.E = gVar2;
            gVar2.b(new j9(s9Var, 0));
            s9Var.E.a(new k9(s9Var, 0));
            s9Var.E.f53653m = new q1.h(500.0f);
            s9Var.E.f53653m.a(0.8f);
            s9Var.E.f53653m.b(250.0f);
            s9Var.E.h();
        }
    }

    @Override
    public void q(org.telegram.ui.Components.zb0 zb0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f51672b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f28907b0;
        org.telegram.messenger.az.C = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.f0();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23274o0, zb0Var);
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override
    public void s(Exception exc) {
        ((org.telegram.ui.Cells.f0) this.f51672b).setClickable(false);
    }

    public void t(String str) {
        wm wmVar = ((fl) this.f51672b).R;
        if (str.startsWith("@")) {
            wmVar.getMessagesController().y3(str.substring(1), wmVar, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                wmVar.f51237a0.Z0(null, str, false, false);
                if (wmVar.f51237a0.getFieldText() == null) {
                    wmVar.B9(false);
                    return;
                }
                return;
            }
            wmVar.Wa(0, str, null, null, false);
        } else {
            uw uwVar = new uw(null);
            uwVar.f50273o2 = str;
            wmVar.presentFragment(uwVar);
        }
    }

    public x0(ni niVar, boolean z10) {
        this.f51671a = 20;
        this.f51672b = niVar;
    }

    @Override
    public void d(float f10) {
    }

    @Override
    public void p() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
