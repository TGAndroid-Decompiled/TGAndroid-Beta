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
public final class w0 implements org.telegram.ui.Components.mm0, ki.w3, gb1, r0.m, org.telegram.ui.ActionBar.q1, ug.s, org.telegram.ui.Components.dc0, org.telegram.ui.Components.hj0, org.telegram.ui.Components.gt0, org.telegram.ui.Components.vt0, fi.d9, org.telegram.ui.Components.vi0, CameraView.CameraViewDelegate, org.telegram.messenger.x10, org.telegram.messenger.nc, org.telegram.ui.Components.sh0, org.telegram.messenger.nr, org.telegram.ui.Cells.d0, cx {
    public final int f52339a;
    public final Object f52340b;

    public w0(Object obj, int i7) {
        this.f52339a = i7;
        this.f52340b = obj;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        k0 k0Var;
        ab.q qVar = (ab.q) this.f52340b;
        qVar.getClass();
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        r4 r4Var = (r4) qVar.d;
        if (r4Var == view && (k0Var = r4Var.f45585b) != null) {
            k0Var.setPadding(I0.f15574a, I0.f15575b, I0.f15576c, I0.d);
        }
        return r0.k1.f55681b;
    }

    @Override
    public void a(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.i3(new oi.u4(28, (m4) this.f52340b, arrayList), 100L);
    }

    @Override
    public void b(boolean z10) {
        k3 k3Var = (k3) this.f52340b;
        t3 t3Var = k3Var.M.L;
        if (t3Var != null) {
            k3Var.h = true;
            t3Var.a(true);
        }
    }

    @Override
    public void c() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.f52340b;
        int i7 = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(ArrayList arrayList) {
        oh ohVar = (oh) this.f52340b;
        an anVar = ohVar.f49969p;
        if (anVar.getParentActivity() != null && anVar.getParentActivity() != null) {
            nh nhVar = new nh(ohVar, anVar, anVar.getParentActivity(), anVar.Aa, arrayList);
            boolean V9 = anVar.V9();
            nhVar.f29700i0 = V9;
            nhVar.f29707n = V9;
            nhVar.f29710p0 = false;
            anVar.P7(false);
            anVar.showDialog(nhVar);
        }
    }

    @Override
    public void e(float f10) {
        x0 x0Var = (x0) this.f52340b;
        org.telegram.messenger.gj gjVar = x0Var.N;
        if (gjVar == null) {
            return;
        }
        gjVar.f23777b0 = f10;
        MediaController.B().i0(x0Var.N, f10);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        y5 y5Var = (y5) this.f52340b;
        ArrayList arrayList = y5Var.f53415c;
        if (((x5) arrayList.get(i7)).f56015a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i10 = y5Var.f53416e;
            if (i10 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i10 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            yw ywVar = new yw(bundle);
            ywVar.E2 = new m2.d(8, y5Var, ywVar);
            y5Var.presentFragment(ywVar);
        } else if (((x5) arrayList.get(i7)).f56015a == 2) {
            org.telegram.messenger.s2 s2Var = ((x5) arrayList.get(i7)).f53097c;
            d60 d60Var = new d60(view.getContext(), y5Var);
            d60Var.h(false);
            d60Var.setParentWindow(org.telegram.ui.Components.t4.N(y5Var, d60Var, view, f10, f11));
            d60Var.setCallback(new v5(y5Var, s2Var, 0));
        } else if (((x5) arrayList.get(i7)).f56015a == 4) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.L(y5Var.getParentActivity(), org.telegram.messenger.hd.M0(2131747913, null), org.telegram.messenger.hd.M0(2131747914, null), org.telegram.messenger.hd.M0(2131751598, null), new fq0(y5Var, 13), null).f28392a;
            t1Var.show();
            t1Var.i();
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.f52339a) {
            case 4:
                g5 g5Var = (g5) this.f52340b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.f26600b.getPackageName()));
                    g5Var.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                q6 q6Var = (q6) this.f52340b;
                p6 p6Var = new p6(0, q6Var.getContext(), false);
                p6Var.O();
                p6Var.f29686c0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                ai.j0 j0Var = new ai.j0(11, context, false);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624316, 150, 150, null);
                j0Var.addView((View) imageView, c8.ja.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true);
                j0Var.f1265b = h6Var;
                org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f34421g;
                h6Var.b(0.35f, 120L, erVar);
                h6Var.setGravity(1);
                int i11 = org.telegram.ui.ActionBar.j6.f28957j5;
                org.telegram.ui.ActionBar.q6.Y(h6Var, i11, null);
                h6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                h6Var.setTypeface(org.telegram.messenger.g0.o());
                j0Var.addView(h6Var, c8.ja.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f50852a = paint;
                Paint paint2 = new Paint(1);
                view.f50853b = paint2;
                view.d = new org.telegram.ui.Components.u5((View) view, 350L, erVar);
                int i12 = org.telegram.ui.ActionBar.j6.N6;
                paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, i12, false));
                paint2.setColor(org.telegram.ui.ActionBar.j6.r1(0.2f, org.telegram.ui.ActionBar.j6.x0(null, i12, false)));
                j0Var.f1266c = view;
                j0Var.addView((View) view, c8.ja.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.k5.m(textView, i11, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.hd.M0(2131752046, null));
                j0Var.addView(textView, c8.ja.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.q6.U(textView2, i11, null);
                i5.c.w(textView2, 1, 14.0f, null, 2131752045);
                j0Var.addView(textView2, c8.ja.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                j0Var.f(0.0f);
                p6Var.O = j0Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(q6Var, j0Var, fArr, zArr2, 1);
                long[] jArr = {-1};
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.m5(q6Var, zArr, jArr, p6Var, 2), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var = new n6(fArr, zArr2, m5Var, 0);
                o6 o6Var = new o6(zArr, j0Var, jArr, p6Var, 0);
                ei.c cVar = y6Var.f53442e0;
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
                org.telegram.messenger.w7.K.c(new f6(y6Var, n6Var, o6Var, 0));
                y6Var.f53442e0 = null;
                j6 j6Var2 = y6Var.N;
                if (j6Var2 != null) {
                    j6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                ad.Z((ad) this.f52340b, t1Var);
                return;
            case 17:
                ((uf) this.f52340b).run();
                return;
            case 19:
                an anVar = ((si) this.f52340b).f51228b;
                anVar.finishFragment();
                anVar.getNotificationCenter().k(127, anVar.f45178e4);
                return;
            case 23:
                an anVar2 = ((el) this.f52340b).f46862a.R;
                i10 = ((org.telegram.ui.ActionBar.e2) anVar2).currentAccount;
                org.telegram.messenger.d4.f(i10).a(anVar2.f45259k6, true, true);
                return;
            case 24:
                ((xn) this.f52340b).f53265b.e0();
                return;
            case 25:
                to toVar = (to) this.f52340b;
                boolean z10 = toVar.f51624s;
                if (!z10 || toVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, toVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.np.i1(toVar.f51621f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.np.i1(toVar.f51621f);
                    }
                    org.telegram.messenger.g0.i3(new jo(toVar, t1VarArr, toVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new v7(9, toVar, t1VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((vp) this.f52340b).a(1);
                return;
        }
    }

    @Override
    public void i() {
        ((ri.q) this.f52340b).g();
    }

    @Override
    public void j(boolean z10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        org.telegram.ui.ActionBar.o4 o4Var3;
        org.telegram.ui.ActionBar.o4 o4Var4;
        org.telegram.ui.ActionBar.o4 o4Var5;
        switch (this.f52339a) {
            case 20:
                an anVar = ((ri) this.f52340b).f50958b.f51228b;
                anVar.Ta(anVar.f45358s4, true);
                return;
            case 21:
                an anVar2 = ((yk) this.f52340b).n1;
                if (z10) {
                    anVar2.h8();
                    UndoView undoView = anVar2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                qq qqVar = ((iq) this.f52340b).n1;
                if (z10) {
                    o4Var = ((org.telegram.ui.ActionBar.e2) qqVar).parentLayout;
                    if (o4Var != null) {
                        o4Var2 = ((org.telegram.ui.ActionBar.e2) qqVar).parentLayout;
                        List fragmentStack = o4Var2.getFragmentStack();
                        o4Var3 = ((org.telegram.ui.ActionBar.e2) qqVar).parentLayout;
                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) fragmentStack.get(o4Var3.getFragmentStack().size() - 2);
                        if (e2Var instanceof qn) {
                            e2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qqVar.N);
                            qn qnVar = new qn(bundle);
                            qnVar.q0(qqVar.f50746r);
                            o4Var4 = ((org.telegram.ui.ActionBar.e2) qqVar).parentLayout;
                            o4Var5 = ((org.telegram.ui.ActionBar.e2) qqVar).parentLayout;
                            ((ActionBarLayout) o4Var4).c(o4Var5.getFragmentStack().size() - 1, qnVar);
                            qqVar.finishFragment();
                            qnVar.f50665c.j(76, 0L, null);
                            return;
                        }
                        qqVar.finishFragment();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override
    public void l(int i7) {
        org.telegram.messenger.gz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f52340b).get(i7)).intValue()).apply();
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = this.f52339a;
        Object obj3 = this.f52340b;
        switch (i7) {
            case 15:
                rd rdVar = (rd) obj3;
                org.telegram.ui.Components.b41 b41Var = (org.telegram.ui.Components.b41) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                td tdVar = rdVar.f50932f;
                Object obj4 = b41Var.G;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    di.mb.k1(rdVar.getContext(), true, tdVar.f51557e, rdVar.f50930c, (TL_stars.StarsTransaction) b41Var.G, rdVar.f50929b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    xd.M(rdVar.getContext(), rdVar.f50930c, (TL_stats.BroadcastRevenueTransaction) b41Var.G, tdVar.f51557e, rdVar.f50929b);
                    return;
                } else {
                    return;
                }
            default:
                pr prVar = (pr) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i10 = ((org.telegram.ui.Components.b41) obj).d;
                if (i10 == 1) {
                    TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.I));
                    if (a22 != null && prVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, prVar.getParentActivity(), prVar.f50351r);
                        String M0 = org.telegram.messenger.hd.M0(2131751552, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.Components.f1(28, prVar, a22));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    }
                    return;
                } else if (i10 == 2) {
                    boolean z10 = !prVar.Y;
                    prVar.Y = z10;
                    ((org.telegram.ui.Cells.q8) view2).setChecked(z10);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public RecyclerView n(View view) {
        return ((t7) this.f52340b).c(view);
    }

    @Override
    public void o(Canvas canvas, RectF rectF, float f10) {
        i8 i8Var = ((w7) this.f52340b).f52476a;
        Paint paint = i8Var.f47965x;
        TextPaint textPaint = i8Var.f47945e;
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
            canvas.drawText(Integer.toString(i8Var.f47951i0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void onCameraInit() {
        t9 t9Var = (t9) this.f52340b;
        HandlerThread handlerThread = t9Var.f51499e;
        handlerThread.start();
        t9Var.f51501f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.i3(t9Var.f51500e0, 0L);
        if (t9Var.f0()) {
            r1.g gVar = t9Var.E;
            if (gVar != null) {
                gVar.d();
                t9Var.E = null;
            }
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            t9Var.E = gVar2;
            gVar2.b(new k9(t9Var, 0));
            t9Var.E.a(new l9(t9Var, 0));
            t9Var.E.f55748m = new r1.h(500.0f);
            t9Var.E.f55748m.a(0.8f);
            t9Var.E.f55748m.b(250.0f);
            t9Var.E.h();
        }
    }

    @Override
    public void q(org.telegram.ui.Components.fc0 fc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f52340b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f29963b0;
        org.telegram.messenger.gz.C = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.f0();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25542o0, fc0Var);
    }

    @Override
    public void r(Exception exc) {
        ((org.telegram.ui.Cells.f0) this.f52340b).setClickable(false);
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    public void t(String str) {
        an anVar = ((jl) this.f52340b).R;
        if (str.startsWith("@")) {
            anVar.getMessagesController().y3(str.substring(1), anVar, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                anVar.f45118a0.q1(null, str, false, false);
                if (anVar.f45118a0.getFieldText() == null) {
                    anVar.D9(false);
                    return;
                }
                return;
            }
            anVar.Za(0, str, null, null, false);
        } else {
            yw ywVar = new yw(null);
            ywVar.f53721p2 = str;
            anVar.presentFragment(ywVar);
        }
    }

    public w0(ri riVar, boolean z10) {
        this.f52339a = 20;
        this.f52340b = riVar;
    }

    @Override
    public void g(float f10) {
    }

    @Override
    public void p() {
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
