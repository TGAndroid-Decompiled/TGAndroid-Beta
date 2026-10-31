package rh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.z60;
public final class e7 implements View.OnClickListener {
    public final int f46871a;
    public final Object f46872b;
    public final Object f46873c;
    public final Object d;

    public e7(Object obj, Object obj2, Object obj3, int i10) {
        this.f46871a = i10;
        this.d = obj;
        this.f46872b = obj2;
        this.f46873c = obj3;
    }

    @Override
    public final void onClick(View view) {
        vh.m mVar;
        String G;
        org.telegram.utils.twidget.v vVar;
        int i10 = this.f46871a;
        Object obj = this.f46873c;
        Object obj2 = this.f46872b;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                final org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj2;
                final vh.d dVar = (vh.d) obj;
                z2Var.f21587b0 = false;
                dVar.setLoading(true);
                ((r5) obj3).a(new q20() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                                if (booleanValue) {
                                    z2Var2.dismiss();
                                    return;
                                }
                                final vh.d dVar2 = dVar;
                                org.telegram.messenger.i0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                z2Var2.f21587b0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                z2Var2.f21587b0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var;
                                if (booleanValue2) {
                                    z2Var3.dismiss();
                                    return;
                                }
                                final vh.d dVar3 = dVar;
                                org.telegram.messenger.i0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                z2Var3.f21587b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                z2Var3.f21587b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) obj2;
                final vh.d dVar2 = (vh.d) obj;
                z2Var2.f21587b0 = false;
                dVar2.setLoading(true);
                ((p5) obj3).a(new q20() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var22 = z2Var2;
                                if (booleanValue) {
                                    z2Var22.dismiss();
                                    return;
                                }
                                final vh.d dVar22 = dVar2;
                                org.telegram.messenger.i0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                z2Var22.f21587b0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                z2Var22.f21587b0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.z2 z2Var3 = z2Var2;
                                if (booleanValue2) {
                                    z2Var3.dismiss();
                                    return;
                                }
                                final vh.d dVar3 = dVar2;
                                org.telegram.messenger.i0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                z2Var3.f21587b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                z2Var3.f21587b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 2:
                ((th.l1) obj3).a(Long.valueOf(((long[]) obj)[0]));
                ((org.telegram.ui.ActionBar.z2) obj2).dismiss();
                return;
            case 3:
                th.z2 z2Var3 = ((th.u2) obj3).f49512x;
                z2Var3.D0((vh.u6) obj2, (TL_stories.StoryItem) obj);
                th.u2 u2Var = z2Var3.f49696c1;
                if (u2Var != null) {
                    u2Var.a();
                    return;
                }
                return;
            case 4:
                th.u2 u2Var2 = (th.u2) obj3;
                th.o7 o7Var = (th.o7) obj;
                ((org.telegram.ui.ActionBar.b1) obj2).performHapticFeedback(3);
                cc X = cc.X();
                if (X != null) {
                    X.Q(2131624054, 36, org.telegram.messenger.i0.T2(cd.L0(2131745950, null), new th.o0(3, u2Var2, o7Var))).j();
                    return;
                }
                return;
            case 5:
                th.j3 j3Var = (th.j3) obj3;
                kg.q1 q1Var = new kg.q1(j3Var, 11);
                th.y3 y3Var = j3Var.f49102b;
                new cv(q1Var, y3Var.getContext(), y3Var.f49676s, (ArrayList) obj2).show();
                ((z60) obj).u();
                return;
            case 6:
                vh.e8 e8Var = (vh.e8) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                th.b bVar = (th.b) obj;
                z60 z60Var = e8Var.U0;
                if (z60Var == null || !z60Var.D()) {
                    vh.m mVar2 = new vh.m(e8Var, 0);
                    boolean q6 = d20.i(e8Var.U).q();
                    if (q6) {
                        mVar = null;
                    } else {
                        mVar = new vh.m(e8Var, 1);
                    }
                    z60 F = z60.F(frameLayout, bVar, e8Var.S0);
                    e8Var.U0 = F;
                    F.p(13, org.telegram.messenger.i0.L(200.0f), cd.M0("StoryPeriodHint"));
                    e8Var.U0.k();
                    int i11 = 0;
                    while (true) {
                        int[] iArr = vh.p.P1;
                        if (i11 < 4) {
                            int i12 = iArr[i11];
                            z60 z60Var2 = e8Var.U0;
                            if (i12 == Integer.MAX_VALUE) {
                                G = cd.M0("StoryPeriodKeep");
                            } else {
                                G = cd.G(i12 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i13 = org.telegram.ui.ActionBar.t6.E8;
                            z60Var2.b(0, null, str, i13, i13, new org.telegram.utils.twidget.v(mVar2, i12, 5));
                            if (!q6 && i12 != 86400 && i12 != Integer.MAX_VALUE) {
                                vVar = new org.telegram.utils.twidget.v(mVar, i12, 6);
                            } else {
                                vVar = null;
                            }
                            z60Var2.M(vVar);
                            if (e8Var.W0 == i11) {
                                e8Var.U0.L();
                            }
                            i11++;
                        } else {
                            z60 z60Var3 = e8Var.U0;
                            z60Var3.f32941s = 0;
                            z60Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 7:
                ef efVar = (ef) obj2;
                vh.h2 h2Var = (vh.h2) obj;
                vh.k2 k2Var = ((vh.g2) obj3).f51189c;
                ArrayList arrayList = k2Var.f51391h0;
                if (arrayList.contains(efVar)) {
                    arrayList.remove(efVar);
                } else if (arrayList.size() + 1 > k2Var.R) {
                    int i14 = -k2Var.N;
                    k2Var.N = i14;
                    org.telegram.messenger.i0.F3(i14, h2Var, null);
                    org.telegram.messenger.t2.APP_ERROR.a();
                    return;
                } else {
                    arrayList.add(efVar);
                }
                org.telegram.messenger.i0.a4(k2Var.d);
                k2Var.j();
                return;
            default:
                vh.s7 s7Var = (vh.s7) obj3;
                Context context = (Context) obj2;
                ig.s0 s0Var = (ig.s0) obj;
                if (s7Var.f50973k1) {
                    ig.u uVar = new ig.u(context, s7Var.f50981p1);
                    s7Var.C1 = uVar;
                    uVar.I0(s7Var.f50971j1.f8432a, 2);
                    uVar.f8478o1 = new androidx.activity.o(s7Var, s0Var, 10);
                    uVar.f8477n1 = new mg.f0(5, s7Var, s0Var);
                    uVar.show();
                    return;
                }
                Runnable runnable = s7Var.f50989t1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public e7(th.l1 l1Var, long[] jArr, org.telegram.ui.ActionBar.z2 z2Var) {
        this.f46871a = 2;
        this.d = l1Var;
        this.f46873c = jArr;
        this.f46872b = z2Var;
    }
}
