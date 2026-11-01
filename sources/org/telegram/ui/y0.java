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
public final class y0 implements org.telegram.ui.Components.kn0, xh.h3, bd1, r0.m, org.telegram.ui.ActionBar.u1, kg.w, org.telegram.ui.Components.xc0, org.telegram.ui.Components.ik0, org.telegram.ui.Components.ju0, org.telegram.ui.Components.yu0, th.j7, org.telegram.ui.Components.vj0, CameraView.CameraViewDelegate, org.telegram.messenger.p20, org.telegram.messenger.qc, org.telegram.ui.Components.ti0, org.telegram.messenger.as, org.telegram.ui.Cells.d0 {
    public final int f43493a;
    public final Object f43494b;

    public y0(Object obj, int i10) {
        this.f43493a = i10;
        this.f43494b = obj;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        l0 l0Var;
        ac.a aVar = (ac.a) this.f43494b;
        aVar.getClass();
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        r4 r4Var = (r4) aVar.d;
        if (r4Var == view && (l0Var = r4Var.f35564b) != null) {
            l0Var.setPadding(I0.f7766a, I0.f7767b, I0.f7768c, I0.d);
        }
        return r0.j1.f46142b;
    }

    @Override
    public void a(boolean z10) {
        l3 l3Var = (l3) this.f43494b;
        u3 u3Var = l3Var.L.K;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.a(true);
        }
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        x5 x5Var = (x5) this.f43494b;
        ArrayList arrayList = x5Var.f43245c;
        if (((w5) arrayList.get(i10)).f7681a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i11 = x5Var.e;
            if (i11 == 1) {
                bundle.putInt("dialogsType", 6);
            } else if (i11 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            zx zxVar = new zx(bundle);
            zxVar.C2 = new ng.d(4, x5Var, zxVar);
            x5Var.presentFragment(zxVar);
        } else if (((w5) arrayList.get(i10)).f7681a == 2) {
            org.telegram.messenger.w2 w2Var = ((w5) arrayList.get(i10)).f42673c;
            d70 d70Var = new d70(view.getContext(), x5Var);
            d70Var.h(false);
            d70Var.setParentWindow(org.telegram.ui.Components.s4.P(x5Var, d70Var, view, f7, f10));
            d70Var.setCallback(new u5(x5Var, w2Var, 0));
        } else if (((w5) arrayList.get(i10)).f7681a == 4) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(x5Var.getParentActivity(), org.telegram.messenger.dd.L0(2131747929, null), org.telegram.messenger.dd.L0(2131747930, null), org.telegram.messenger.dd.L0(2131751599, null), new qr0(x5Var, 13), null).f20135a;
            x1Var.show();
            x1Var.i();
        }
    }

    @Override
    public void c(float f7) {
        z0 z0Var = (z0) this.f43494b;
        org.telegram.messenger.kj kjVar = z0Var.M;
        if (kjVar == null) {
            return;
        }
        kjVar.f16652b0 = f7;
        MediaController.B().i0(z0Var.M, f7);
    }

    @Override
    public void e(int i10, ArrayList arrayList) {
        org.telegram.messenger.i0.h3(new h0(3, (m4) this.f43494b, arrayList), 100L);
    }

    @Override
    public float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void g() {
        ((ei.r) this.f43494b).g();
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        switch (this.f43493a) {
            case 4:
                f5 f5Var = (f5) this.f43494b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f18945b.getPackageName()));
                    f5Var.startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 9:
                q6 q6Var = (q6) this.f43494b;
                p6 p6Var = new p6(0, q6Var.getContext(), false);
                p6Var.O();
                p6Var.f21588b0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                fg.i iVar = new fg.i(context, 7);
                ?? imageView = new ImageView(context);
                imageView.setAutoRepeat(true);
                imageView.f(2131624313, 150, 150, null);
                iVar.addView((View) imageView, w7.b6.d(150, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                imageView.d();
                org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
                iVar.f7078b = f6Var;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26524g;
                f6Var.b(0.35f, 120L, grVar);
                f6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.t6.f21038j5;
                org.telegram.ui.ActionBar.a7.Z(f6Var, i12, null);
                f6Var.setTextSize(org.telegram.messenger.i0.L(24.0f));
                f6Var.setTypeface(org.telegram.messenger.i0.o());
                iVar.addView(f6Var, w7.b6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                ?? view = new View(context);
                Paint paint = new Paint(1);
                view.f40977a = paint;
                Paint paint2 = new Paint(1);
                view.f40978b = paint2;
                view.d = new org.telegram.ui.Components.t5((View) view, 350L, grVar);
                int i13 = org.telegram.ui.ActionBar.t6.N6;
                paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, i13, false)));
                iVar.f7079c = view;
                iVar.addView((View) view, w7.b6.d(240, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.m5.m(textView, i12, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.dd.L0(2131752046, null));
                iVar.addView(textView, w7.b6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
                sc.e.u(textView2, 1, 14.0f, null, 2131752045);
                iVar.addView(textView2, w7.b6.d(240, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                iVar.d(0.0f);
                p6Var.N = iVar;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                ag.q0 q0Var = new ag.q0(q6Var, iVar, fArr, zArr2, 20);
                long[] jArr = {-1};
                org.telegram.messenger.i0.h3(new ag.q0(q6Var, zArr, jArr, p6Var, 21), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var = new n6(fArr, zArr2, q0Var, 0);
                o6 o6Var = new o6(zArr, iVar, jArr, p6Var, 0);
                sh.b bVar = y6Var.f43577d0;
                if (bVar != null) {
                    bVar.d();
                }
                j6 j6Var = y6Var.M;
                if (j6Var != null) {
                    j6Var.e();
                    y6Var.M.f(false);
                }
                y6Var.getFileLoader().c();
                y6Var.getFileLoader().getClass();
                org.telegram.messenger.b8.J.c(new e6(y6Var, n6Var, o6Var, 0));
                y6Var.f43577d0 = null;
                j6 j6Var2 = y6Var.M;
                if (j6Var2 != null) {
                    j6Var2.setCacheModel(null);
                    return;
                }
                return;
            case 14:
                kd.Z((kd) this.f43494b, x1Var);
                return;
            case 17:
                ((ng) this.f43494b).run();
                return;
            case 19:
                un unVar = ((nj) this.f43494b).f39917b;
                unVar.finishFragment();
                unVar.getNotificationCenter().k(127, unVar.f42034d4);
                return;
            case 23:
                un unVar2 = ((am) this.f43494b).f35805a.Q;
                i11 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                org.telegram.messenger.g4.f(i11).a(unVar2.f42108j6, true, true);
                return;
            case 24:
                qp qpVar = (qp) this.f43494b;
                boolean z10 = qpVar.f40875s;
                if (!z10 || qpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, qpVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.wp.h1(qpVar.f40872f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.wp.h1(qpVar.f40872f);
                    }
                    org.telegram.messenger.i0.h3(new ep(qpVar, x1VarArr, qpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ag.k0(21, qpVar, x1VarArr)), 0), 500L);
                    return;
                }
                return;
            default:
                ((sq) this.f43494b).a(1);
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        org.telegram.ui.ActionBar.z4 z4Var4;
        org.telegram.ui.ActionBar.z4 z4Var5;
        switch (this.f43493a) {
            case 20:
                un unVar = ((mj) this.f43494b).f39543b.f39917b;
                unVar.La(unVar.f42205r4, true);
                return;
            case 21:
                un unVar2 = ((vl) this.f43494b).f42564j1;
                if (z10) {
                    unVar2.c8();
                    UndoView undoView = unVar2.M3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                pr prVar = ((hr) this.f43494b).f37852j1;
                if (z10) {
                    z4Var = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                    if (z4Var != null) {
                        z4Var2 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                        List fragmentStack = z4Var2.getFragmentStack();
                        z4Var3 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var3.getFragmentStack().size() - 2);
                        if (k2Var instanceof oo) {
                            k2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", prVar.M);
                            oo ooVar = new oo(bundle);
                            ooVar.q0(prVar.f40562r);
                            z4Var4 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                            z4Var5 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                            ((ActionBarLayout) z4Var4).c(z4Var5.getFragmentStack().size() - 1, ooVar);
                            prVar.finishFragment();
                            ooVar.f40207c.j(76, 0L, null);
                            return;
                        }
                        prVar.finishFragment();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public RecyclerView j(View view) {
        return ((t7) this.f43494b).c(view);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10 = this.f43493a;
        Object obj3 = this.f43494b;
        switch (i10) {
            case 15:
                fe feVar = (fe) obj3;
                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                he heVar = feVar.f37115f;
                Object obj4 = b51Var.G;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    rh.h8.k1(feVar.getContext(), true, heVar.e, feVar.f37114c, (TL_stars.StarsTransaction) b51Var.G, feVar.f37113b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    le.M(feVar.getContext(), feVar.f37114c, (TL_stats.BroadcastRevenueTransaction) b51Var.G, heVar.e, feVar.f37113b);
                    return;
                } else {
                    return;
                }
            default:
                ns nsVar = (ns) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                int i11 = ((org.telegram.ui.Components.b51) obj).d;
                if (i11 == 1) {
                    TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
                    if (Z1 != null && nsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nsVar.getParentActivity(), nsVar.f39967r);
                        String L0 = org.telegram.messenger.dd.L0(2131751553, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.dd.L0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.Components.f2(25, nsVar, Z1));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        return;
                    }
                    return;
                } else if (i11 == 2) {
                    boolean z10 = !nsVar.X;
                    nsVar.X = z10;
                    ((org.telegram.ui.Cells.t8) view2).setChecked(z10);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void l(ArrayList arrayList) {
        ki kiVar = (ki) this.f43494b;
        un unVar = kiVar.f38895p;
        if (unVar.getParentActivity() != null && unVar.getParentActivity() != null) {
            ji jiVar = new ji(kiVar, unVar, unVar.getParentActivity(), unVar.f42288xa, arrayList);
            boolean O9 = unVar.O9();
            jiVar.f21602h0 = O9;
            jiVar.f21607n = O9;
            jiVar.f21609o0 = false;
            unVar.M7(false);
            unVar.showDialog(jiVar);
        }
    }

    @Override
    public void m(int i10) {
        org.telegram.messenger.uz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.f43494b).get(i10)).intValue()).apply();
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = ((v7) this.f43494b).f42427a;
        Paint paint = h8Var.f37748x;
        TextPaint textPaint = h8Var.e;
        paint.setAlpha((int) (80.0f * f7));
        float T1 = org.telegram.messenger.i0.T1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, T1, T1, paint);
        float i10 = Utilities.i((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i10 > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i10));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / org.telegram.messenger.i0.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(h8Var.f37734h0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.i0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.f43494b;
        BubbleActivity bubbleActivity2 = BubbleActivity.f21641a0;
        org.telegram.messenger.uz.C = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.e0();
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14755o0, zc0Var);
    }

    @Override
    public void onCameraInit() {
        u9 u9Var = (u9) this.f43494b;
        HandlerThread handlerThread = u9Var.e;
        handlerThread.start();
        u9Var.f41887f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.i0.h3(u9Var.f41885d0, 0L);
        if (u9Var.f0()) {
            o1.j jVar = u9Var.D;
            if (jVar != null) {
                jVar.d();
                u9Var.D = null;
            }
            o1.j jVar2 = new o1.j(new o1.i(0.0f));
            u9Var.D = jVar2;
            jVar2.b(new l9(u9Var, 0));
            u9Var.D.a(new m9(u9Var, 0));
            u9Var.D.f13958m = new o1.k(500.0f);
            u9Var.D.f13958m.a(0.8f);
            u9Var.D.f13958m.b(250.0f);
            u9Var.D.h();
        }
    }

    @Override
    public void p(Exception exc) {
        ((org.telegram.ui.Cells.f0) this.f43494b).setClickable(false);
    }

    @Override
    public void q(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public void s(String str) {
        un unVar = ((fm) this.f43494b).Q;
        if (str.startsWith("@")) {
            unVar.getMessagesController().v3(str.substring(1), unVar, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                unVar.Z.Y0(null, str, false, false);
                if (unVar.Z.getFieldText() == null) {
                    unVar.w9(false);
                    return;
                }
                return;
            }
            unVar.Ra(0, str, null, null, false);
        } else {
            zx zxVar = new zx(null);
            zxVar.f44183n2 = str;
            unVar.presentFragment(zxVar);
        }
    }

    public y0(mj mjVar, boolean z10) {
        this.f43493a = 20;
        this.f43494b = mjVar;
    }

    @Override
    public void d(float f7) {
    }

    @Override
    public void r() {
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
