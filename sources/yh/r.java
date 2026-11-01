package yh;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.dd;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.i20;
import org.telegram.messenger.jo;
import org.telegram.messenger.m5;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.u70;
import org.telegram.ui.Components.z60;
import org.telegram.ui.nb1;
import org.telegram.ui.un;
import r0.g1;
import r0.j1;
public final class r implements p20, r0.m, q20 {
    public final int f54528a;
    public final z f54529b;

    public r(z zVar, int i10) {
        this.f54528a = i10;
        this.f54529b = zVar;
    }

    @Override
    public j1 R0(View view, j1 j1Var) {
        g1 g1Var = j1Var.f46143a;
        i0.c f7 = g1Var.f(527);
        z zVar = this.f54529b;
        zVar.K1 = f7;
        zVar.L1 = g1Var.f(519);
        zVar.f54556w1.j(i0.L(56.0f) + zVar.K1.f7767b, zVar.K1.d, false);
        zVar.f54558y1.invalidate();
        return j1.f46142b;
    }

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        int i10 = z.M1;
        Object obj = b51Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        z zVar = this.f54529b;
        boolean z14 = true;
        if (z13) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j11 = -chat.f19794id;
            boolean V = w3.V(chat);
            TLRPC.Chat chat2 = zVar.f54546m1;
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
                long j12 = user.f19943id;
                boolean t10 = i20.t(user);
                TLRPC.Chat chat3 = zVar.f54546m1;
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
            z60 F = z60.F(zVar.f21590c, null, view);
            F.c(2131232086, dd.L0(2131751915, null), new jo(zVar, z11, z12, j10, 3), true);
            F.W(zVar.f54551r1.d.U0(view, true));
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
        int i11 = this.f54528a;
        z zVar = this.f54529b;
        switch (i11) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f7 = (Float) serializable;
                Float f10 = (Float) serializable2;
                zVar.L0((b51) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f11 = (Float) serializable;
                Float f12 = (Float) serializable2;
                int i12 = z.M1;
                zVar.I0((b51) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f13 = (Float) serializable;
                Float f14 = (Float) serializable2;
                int i13 = z.M1;
                zVar.L0((b51) obj);
                return;
            case 3:
                b51 b51Var = (b51) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f15 = (Float) serializable;
                Float f16 = (Float) serializable2;
                k2 k2Var = zVar.f54550q1;
                if (!zVar.I0(b51Var)) {
                    int i14 = b51Var.d;
                    boolean z10 = false;
                    if (i14 == 101) {
                        zVar.f54547n1 = !zVar.f54547n1;
                        wp.r1(zVar.f21584a).b5(zVar.l1, zVar.f54547n1);
                        if (view4 instanceof s8) {
                            ((s8) view4).getCheckBox().c(zVar.f54547n1, true);
                            return;
                        } else {
                            zVar.f54551r1.d.f31183f3.O(false);
                            return;
                        }
                    } else if (i14 == 100) {
                        zVar.f54545k1.E(1);
                        zVar.D1.e();
                        return;
                    } else {
                        Object obj3 = b51Var.G;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z10 = w3.V(chat2);
                            j10 = -chat2.f19794id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) obj3).f19943id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = e0.b(zVar.f21584a, j10);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                u70 u70Var = new u70(zVar.getContext(), chat, null, zVar.f54550q1, zVar.I0);
                                u70Var.f30890p1 = new cc((FrameLayout) zVar.f21587b, zVar.I0);
                                u70Var.show();
                                return;
                            } else if (b10 == 4) {
                                cc ccVar = new cc((FrameLayout) zVar.f21587b, zVar.I0);
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
                            if ((chat3 != null && chat3.f19794id == (-j10)) || (j11 != null && j11.f19943id == j10)) {
                                zVar.dismiss();
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
                                gg.e.a(unVar2, hs.a(j10, wp.r1(zVar.f21584a).f7.getLong(a1.g.l(chat.f19794id, "forumlasttopic"), 1L)));
                                k2Var.presentFragment(unVar2);
                            } else {
                                k2Var.presentFragment(new nb1(bundle));
                            }
                        } else {
                            k2Var.presentFragment(new un(bundle));
                        }
                        zVar.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
