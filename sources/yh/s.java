package yh;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.cd;
import org.telegram.messenger.gs;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.io;
import org.telegram.messenger.m5;
import org.telegram.messenger.o20;
import org.telegram.messenger.p20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.z60;
import org.telegram.ui.pb1;
import org.telegram.ui.un;
import r0.g1;
import r0.j1;
public final class s implements o20, r0.m, p20 {
    public final int f54527a;
    public final a0 f54528b;

    public s(a0 a0Var, int i10) {
        this.f54527a = i10;
        this.f54528b = a0Var;
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        g1 g1Var = j1Var.f46132a;
        i0.c f7 = g1Var.f(527);
        a0 a0Var = this.f54528b;
        a0Var.K1 = f7;
        a0Var.L1 = g1Var.f(519);
        a0Var.f54454w1.j(i0.L(56.0f) + a0Var.K1.f7766b, a0Var.K1.d, false);
        a0Var.f54456y1.invalidate();
        return j1.f46131b;
    }

    @Override
    public Boolean a(a51 a51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        int i10 = a0.M1;
        Object obj = a51Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        a0 a0Var = this.f54528b;
        boolean z14 = true;
        if (z13) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j11 = -chat.f19793id;
            boolean V = w3.V(chat);
            TLRPC.Chat chat2 = a0Var.f54444m1;
            if (chat2 != null && (chat.creator || w3.y(27, chat2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            j10 = j11;
            z12 = V;
            z11 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j12 = user.f19942id;
                boolean t10 = h20.t(user);
                TLRPC.Chat chat3 = a0Var.f54444m1;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || w3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j10 = j12;
                z11 = t10;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        if (z10) {
            z60 F = z60.F(a0Var.f21589c, null, view);
            F.c(2131232086, cd.L0(2131751915, null), new io(a0Var, z11, z12, j10, 3), true);
            F.W(a0Var.f54449r1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        int i11 = this.f54527a;
        a0 a0Var = this.f54528b;
        switch (i11) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                a0Var.L0((a51) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                int i12 = a0.M1;
                a0Var.I0((a51) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f13 = (Float) serializable;
                Float f14 = (Float) serializable2;
                int i13 = a0.M1;
                a0Var.L0((a51) obj);
                return;
            case 3:
                a51 a51Var = (a51) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f15 = (Float) serializable;
                Float f16 = (Float) serializable2;
                k2 k2Var = a0Var.f54448q1;
                if (!a0Var.I0(a51Var)) {
                    int i14 = a51Var.d;
                    boolean z10 = false;
                    if (i14 == 101) {
                        a0Var.f54445n1 = !a0Var.f54445n1;
                        vp.r1(a0Var.f21583a).b5(a0Var.l1, a0Var.f54445n1);
                        if (view4 instanceof s8) {
                            ((s8) view4).getCheckBox().c(a0Var.f54445n1, true);
                            return;
                        } else {
                            a0Var.f54449r1.d.f30819f3.O(false);
                            return;
                        }
                    } else if (i14 == 100) {
                        a0Var.f54443k1.E(1);
                        a0Var.D1.e();
                        return;
                    } else {
                        Object obj3 = a51Var.G;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z10 = w3.V(chat2);
                            j10 = -chat2.f19793id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) obj3).f19942id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = f0.b(a0Var.f21583a, j10);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                u70 u70Var = new u70(a0Var.getContext(), chat, null, a0Var.f54448q1, a0Var.I0);
                                u70Var.f30862p1 = new cc((FrameLayout) a0Var.f21586b, a0Var.I0);
                                u70Var.show();
                                return;
                            } else if (b10 == 4) {
                                cc ccVar = new cc((FrameLayout) a0Var.f21586b, a0Var.I0);
                                if (z10) {
                                    i10 = 2131751930;
                                } else {
                                    i10 = 2131751927;
                                }
                                m5.n(null, i10, ccVar, 2131624006, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (k2Var instanceof un) {
                            un unVar = (un) k2Var;
                            TLRPC.Chat chat3 = unVar.e;
                            TLRPC.User j11 = unVar.j();
                            if ((chat3 != null && chat3.f19793id == (-j10)) || (j11 != null && j11.f19942id == j10)) {
                                a0Var.dismiss();
                                return;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (j10 > 0) {
                            bundle.putLong("user_id", j10);
                        } else {
                            bundle.putLong("chat_id", -j10);
                        }
                        if (w3.c0(chat)) {
                            if (w3.a(chat)) {
                                un unVar2 = new un(bundle);
                                gg.e.a(unVar2, gs.a(j10, vp.r1(a0Var.f21583a).f7.getLong(a1.g.l(chat.f19793id, "forumlasttopic"), 1L)));
                                k2Var.presentFragment(unVar2);
                            } else {
                                k2Var.presentFragment(new pb1(bundle));
                            }
                        } else {
                            k2Var.presentFragment(new un(bundle));
                        }
                        a0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
