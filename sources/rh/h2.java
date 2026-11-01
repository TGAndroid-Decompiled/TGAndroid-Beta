package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.o20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
public final class h2 extends pp0 {
    public final e4 R2;

    public h2(e4 e4Var, Context context, String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, p6Var);
        this.R2 = e4Var;
        this.S1 = true;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (z10) {
            cc k10 = k();
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == e20.i(this.f21584a).f15524n) {
                    wb G = k10.G(2131624188, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131748896, new Object[0])));
                    G.f32209r = false;
                    G.f32211t = true;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = L0.title;
                    }
                    wb G2 = k10.G(2131624027, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131748900, str)));
                    G2.f32209r = false;
                    G2.f32211t = true;
                    G2.j();
                } else {
                    wb G3 = k10.G(2131624027, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131748900, wp.r1(this.f21584a).Z1(Long.valueOf(j10)).first_name)));
                    G3.f32209r = false;
                    G3.f32211t = true;
                    G3.j();
                }
            } else {
                wb Q = k10.Q(2131624027, 36, org.telegram.messenger.i0.W2(dd.G(hVar.m(), "LinkSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32209r = false;
                Q.f32211t = true;
                Q.j();
            }
            try {
                this.f21590c.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void S0(final View view) {
        vh.h8 h8Var;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.h7) {
                h8Var = vh.j8.b((org.telegram.ui.Cells.h7) view);
            } else {
                h8Var = null;
            }
            ArrayList arrayList = new ArrayList();
            final e4 e4Var = this.R2;
            kj kjVar = e4Var.f46854z2;
            if (kjVar != null) {
                arrayList.add(kjVar);
            } else if (e4Var.y1() instanceof TL_stars.TL_starGiftUnique) {
                long e = e20.i(e4Var.f21584a).e();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = wp.r1(e4Var.f21584a).y1(e);
                tL_messageService.from_id = wp.r1(e4Var.f21584a).y1(e);
                tL_messageService.date = ConnectionsManager.getInstance(e4Var.f21584a).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) e4Var.y1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                kj kjVar2 = new kj(e4Var.f21584a, tL_messageService, false, false);
                kjVar2.K5();
                arrayList.add(kjVar2);
            } else {
                return;
            }
            final vh.o8 D = vh.o8.D(launchActivity, e4Var.f21584a);
            D.R = new o20() {
                @Override
                public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l4 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l10 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    vh.o8 o8Var = D;
                    vh.h8 h8Var2 = null;
                    if (booleanValue) {
                        e4 e4Var2 = e4.this;
                        org.telegram.messenger.i0.g3(new n(4, e4Var2, l10));
                        o8Var.X(null);
                        h2 h2Var = e4Var2.R2;
                        if (h2Var != null) {
                            h2Var.dismiss();
                            e4Var2.R2 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.h7) && view2.isAttachedToWindow()) {
                            h8Var2 = vh.j8.b((org.telegram.ui.Cells.h7) view2);
                        }
                        o8Var.X(h8Var2);
                    }
                    org.telegram.messenger.i0.g3(runnable);
                }
            };
            D.T(h8Var, vh.n5.y(arrayList));
        }
    }
}
