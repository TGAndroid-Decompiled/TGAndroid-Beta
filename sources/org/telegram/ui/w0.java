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
public final class w0 implements org.telegram.ui.Components.im0, hi.a4, ib1, r0.m, org.telegram.ui.ActionBar.r1, ug.s, org.telegram.ui.Components.cc0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.ft0, org.telegram.ui.Components.ut0, di.k9, org.telegram.ui.Components.qi0, CameraView.CameraViewDelegate, org.telegram.messenger.a20, org.telegram.messenger.oc, org.telegram.ui.Components.oh0, org.telegram.messenger.qr, org.telegram.ui.Cells.d0, ax {
    public final int f50813a;
    public final Object f50814b;

    public w0(Object obj, int i7) {
        this.f50813a = i7;
        this.f50814b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        k0 k0Var;
        ab.q qVar = (ab.q) this.f50814b;
        qVar.getClass();
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        r4 r4Var = (r4) qVar.d;
        if (r4Var == view && (k0Var = r4Var.f44189b) != null) {
            k0Var.setPadding(I0.f15120a, I0.f15121b, I0.f15122c, I0.d);
        }
        return r0.k1.f54200b;
    }

    @Override
    public void a(float f10) {
        x0 x0Var = (x0) this.f50814b;
        org.telegram.messenger.ij ijVar = x0Var.M;
        if (ijVar == null) {
            return;
        }
        ijVar.f23222b0 = f10;
        MediaController.B().i0(x0Var.M, f10);
    }

    @Override
    public void b() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.f50814b;
        int i7 = ChatsWidgetConfigActivity.F;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public void c(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(9, (m4) this.f50814b, arrayList), 100L);
    }

    @Override
    public void e() {
        ((oi.q) this.f50814b).g();
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        x5 x5Var = (x5) this.f50814b;
        ArrayList arrayList = x5Var.f51772c;
        if (((w5) arrayList.get(i7)).f54531a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = x5Var.f51773e;
            if (i10 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            ww wwVar = new ww(bundle);
            wwVar.C2 = new ni.c(4, x5Var, wwVar);
            x5Var.presentFragment(wwVar);
        } else if (((w5) arrayList.get(i7)).f54531a == 2) {
            org.telegram.messenger.s2 s2Var = ((w5) arrayList.get(i7)).f50901c;
            e60 e60Var = new e60(view.getContext(), x5Var);
            e60Var.h(false);
            e60Var.setParentWindow(org.telegram.ui.Components.v4.N(x5Var, e60Var, view, f10, f11));
            e60Var.setCallback(new u5(x5Var, s2Var, 0));
        } else if (((w5) arrayList.get(i7)).f54531a == 4) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(x5Var.getParentActivity(), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131747915, null), org.telegram.messenger.id.M0(2131751599, null), new gq0(x5Var, 13), null).f27296a;
            u1Var.show();
            u1Var.i();
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        switch (this.f50813a) {
            case 4:
                g5 g5Var = (g5) this.f50814b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f25566b.getPackageName()));
                    g5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                q6 q6Var = (q6) this.f50814b;
                p6 p6Var = new p6(0, q6Var.getContext(), false);
                p6Var.N();
                p6Var.f28620b0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                bi.x5 x5Var = new bi.x5(9, context, false);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624315, 150, 150, null);
                x5Var.addView((View) imageView, c8.ha.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
                x5Var.f5026b = j6Var;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40367g;
                j6Var.b(0.35f, 120L, xqVar);
                j6Var.setGravity(1);
                int i11 = org.telegram.ui.ActionBar.k6.f27960j5;
                org.telegram.ui.ActionBar.r6.Z(j6Var, i11, null);
                j6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                j6Var.setTypeface(org.telegram.messenger.g0.o());
                x5Var.addView(j6Var, c8.ha.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f49390a = paint;
                Paint paint2 = new Paint(1);
                view.f49391b = paint2;
                view.d = new org.telegram.ui.Components.w5((View) view, 350L, xqVar);
                int i12 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, i12, false)));
                x5Var.f5027c = view;
                x5Var.addView((View) view, c8.ha.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.k5.n(textView, i11, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.id.M0(2131752046, null));
                x5Var.addView(textView, c8.ha.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
                jg.g.v(textView2, 1, 14.0f, null, 2131752045);
                x5Var.addView(textView2, c8.ha.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                x5Var.f(0.0f);
                p6Var.N = x5Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                m6 m6Var = new m6(q6Var, x5Var, fArr, zArr2, 0);
                long[] jArr = {-1};
                org.telegram.messenger.g0.i3(new m6((Object) q6Var, zArr, (Object) jArr, (Object) p6Var, 1), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var = new n6(fArr, zArr2, m6Var, 0);
                o6 o6Var = new o6(zArr, x5Var, jArr, p6Var, 0);
                ci.c cVar = y6Var.f52103d0;
                if (cVar != null) {
                    cVar.d();
                }
                i6 i6Var = y6Var.M;
                if (i6Var != null) {
                    i6Var.e();
                    y6Var.M.f(false);
                }
                y6Var.getFileLoader().c();
                y6Var.getFileLoader().getClass();
                org.telegram.messenger.w7.J.c(new e6(y6Var, n6Var, o6Var, 0));
                y6Var.f52103d0 = null;
                i6 i6Var2 = y6Var.M;
                if (i6Var2 != null) {
                    i6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                bd.Z((bd) this.f50814b, u1Var);
                return;
            case 17:
                ((xf) this.f50814b).run();
                return;
            case 19:
                an anVar = ((si) this.f50814b).f49769b;
                anVar.finishFragment();
                anVar.getNotificationCenter().k(127, anVar.f43768d4);
                return;
            case 23:
                an anVar2 = ((el) this.f50814b).f45331a.Q;
                i10 = ((org.telegram.ui.ActionBar.f2) anVar2).currentAccount;
                org.telegram.messenger.d4.f(i10).a(anVar2.f43848j6, true, true);
                return;
            case 24:
                ((wn) this.f50814b).f51468b.e0();
                return;
            case 25:
                so soVar = (so) this.f50814b;
                boolean z9 = soVar.f49794s;
                if (!z9 || soVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, soVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z9) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.qp.i1(soVar.f49791f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.qp.i1(soVar.f49791f);
                    }
                    org.telegram.messenger.g0.i3(new io(soVar, u1VarArr, soVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ld(7, soVar, u1VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((tp) this.f50814b).a(1);
                return;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = this.f50813a;
        Object obj3 = this.f50814b;
        switch (i7) {
            case 15:
                td tdVar = (td) obj3;
                org.telegram.ui.Components.x31 x31Var = (org.telegram.ui.Components.x31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                vd vdVar = tdVar.f50031f;
                Object obj4 = x31Var.G;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    bi.dd.k1(tdVar.getContext(), true, vdVar.f50646e, tdVar.f50029c, (TL_stars.StarsTransaction) x31Var.G, tdVar.f50028b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    zd.M(tdVar.getContext(), tdVar.f50029c, (TL_stats.BroadcastRevenueTransaction) x31Var.G, vdVar.f50646e, tdVar.f50028b);
                    return;
                } else {
                    return;
                }
            default:
                nr nrVar = (nr) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i10 = ((org.telegram.ui.Components.x31) obj).d;
                if (i10 == 1) {
                    TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
                    if (a22 != null && nrVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nrVar.getParentActivity(), nrVar.f48122r);
                        String M0 = org.telegram.messenger.id.M0(2131751553, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new org.telegram.ui.Components.f2(24, nrVar, a22));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    }
                    return;
                } else if (i10 == 2) {
                    boolean z9 = !nrVar.X;
                    nrVar.X = z9;
                    ((org.telegram.ui.Cells.r8) view2).setChecked(z9);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void j(ArrayList arrayList) {
        oh ohVar = (oh) this.f50814b;
        an anVar = ohVar.f48405p;
        if (anVar.getParentActivity() != null && anVar.getParentActivity() != null) {
            nh nhVar = new nh(ohVar, anVar, anVar.getParentActivity(), anVar.f44028xa, arrayList);
            boolean T9 = anVar.T9();
            nhVar.f28635h0 = T9;
            nhVar.f28640n = T9;
            nhVar.f28642o0 = false;
            anVar.O7(false);
            anVar.showDialog(nhVar);
        }
    }

    @Override
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        org.telegram.ui.ActionBar.q4 q4Var5;
        switch (this.f50813a) {
            case 20:
                an anVar = ((ri) this.f50814b).f49499b.f49769b;
                anVar.Qa(anVar.f43945r4, true);
                return;
            case 21:
                an anVar2 = ((yk) this.f50814b).f52238j1;
                if (z9) {
                    anVar2.f8();
                    UndoView undoView = anVar2.M3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                oq oqVar = ((gq) this.f50814b).f46081j1;
                if (z9) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                    if (q4Var != null) {
                        q4Var2 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                        List fragmentStack = q4Var2.getFragmentStack();
                        q4Var3 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var3.getFragmentStack().size() - 2);
                        if (f2Var instanceof pn) {
                            f2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", oqVar.M);
                            pn pnVar = new pn(bundle);
                            pnVar.q0(oqVar.f48499r);
                            q4Var4 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                            q4Var5 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                            ((ActionBarLayout) q4Var4).c(q4Var5.getFragmentStack().size() - 1, pnVar);
                            oqVar.finishFragment();
                            pnVar.f48863c.j(76, 0L, null);
                            return;
                        }
                        oqVar.finishFragment();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public RecyclerView l(View view) {
        return ((t7) this.f50814b).c(view);
    }

    @Override
    public void m(int i7) {
        org.telegram.messenger.iz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f50814b).get(i7)).intValue()).apply();
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f10) {
        h8 h8Var = ((v7) this.f50814b).f50509a;
        Paint paint = h8Var.f46286x;
        TextPaint textPaint = h8Var.f46267e;
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
            canvas.drawText(Integer.toString(h8Var.f46272h0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void onCameraInit() {
        s9 s9Var = (s9) this.f50814b;
        HandlerThread handlerThread = s9Var.f49670e;
        handlerThread.start();
        s9Var.f49672f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.i3(s9Var.f49669d0, 0L);
        if (s9Var.f0()) {
            r1.g gVar = s9Var.D;
            if (gVar != null) {
                gVar.d();
                s9Var.D = null;
            }
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            s9Var.D = gVar2;
            gVar2.b(new k9(s9Var, 0));
            s9Var.D.a(new l9(s9Var, 0));
            s9Var.D.f54267m = new r1.h(500.0f);
            s9Var.D.f54267m.a(0.8f);
            s9Var.D.f54267m.b(250.0f);
            s9Var.D.h();
        }
    }

    @Override
    public void p(org.telegram.ui.Components.ec0 ec0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f50814b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f28850a0;
        org.telegram.messenger.iz.C = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.f0();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25046o0, ec0Var);
    }

    @Override
    public void q(boolean z9) {
        k3 k3Var = (k3) this.f50814b;
        t3 t3Var = k3Var.L.K;
        if (t3Var != null) {
            k3Var.h = true;
            t3Var.a(true);
        }
    }

    @Override
    public void r(Exception exc) {
        ((org.telegram.ui.Cells.f0) this.f50814b).setClickable(false);
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public void t(String str) {
        an anVar = ((jl) this.f50814b).Q;
        if (str.startsWith("@")) {
            anVar.getMessagesController().y3(str.substring(1), anVar, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                anVar.Z.Z0(null, str, false, false);
                if (anVar.Z.getFieldText() == null) {
                    anVar.B9(false);
                    return;
                }
                return;
            }
            anVar.Wa(0, str, null, null, false);
        } else {
            ww wwVar = new ww(null);
            wwVar.f51601n2 = str;
            anVar.presentFragment(wwVar);
        }
    }

    public w0(ri riVar, boolean z9) {
        this.f50813a = 20;
        this.f50814b = riVar;
    }

    @Override
    public void d(float f10) {
    }

    @Override
    public void n() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
