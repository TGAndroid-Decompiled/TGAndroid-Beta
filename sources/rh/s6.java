package rh;

import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.j20;
import org.telegram.messenger.l20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
public final class s6 implements j20 {
    public final int f47453a;
    public final Object f47454b;
    public final Object f47455c;

    public s6(int i10, Object obj, Object obj2) {
        this.f47453a = i10;
        this.f47455c = obj;
        this.f47454b = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i10 = this.f47453a;
        boolean z11 = true;
        Object obj3 = this.f47454b;
        Object obj4 = this.f47455c;
        switch (i10) {
            case 0:
                h8.C0((h8) obj4, (a51) obj3, (Boolean) obj, (String) obj2);
                return;
            case 1:
                x7 x7Var = (x7) obj4;
                a51 a51Var = (a51) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                if (x7Var.getContext() != null) {
                    if (bool.booleanValue()) {
                        new cc((FrameLayout) x7Var.f21586b, x7Var.I0).I(2131624224, cd.L0(2131745177, null), org.telegram.messenger.i0.W2(cd.G((int) a51Var.B, "StarsAcquiredInfo", new Object[0]))).j();
                        x7Var.S1.c(true);
                        e6.y(x7Var.f21583a, false).S(true);
                        return;
                    } else if (str != null) {
                        new cc((FrameLayout) x7Var.f21586b, x7Var.I0).Q(2131624011, 36, cd.a0(null, null, 2131743903, str)).j();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                y7 y7Var = (y7) obj4;
                a51 a51Var2 = (a51) obj3;
                Boolean bool2 = (Boolean) obj;
                String str2 = (String) obj2;
                if (y7Var.getContext() != null) {
                    y7Var.dismiss();
                    e6.y(y7Var.f21583a, false).S(true);
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        if (bool2.booleanValue()) {
                            cc.a0(T).I(2131624224, cd.L0(2131745177, null), org.telegram.messenger.i0.W2(cd.G((int) a51Var2.B, "StarsAcquiredInfo", new Object[0]))).j();
                            LaunchActivity launchActivity = LaunchActivity.I1;
                            if (launchActivity != null) {
                                launchActivity.f33391x0.c(true);
                                return;
                            }
                            return;
                        } else if (str2 != null) {
                            cc.a0(T).Q(2131624011, 36, cd.a0(null, null, 2131743903, str2)).j();
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                th.p1 p1Var = (th.p1) obj4;
                TL_phone.getGroupCallStars getgroupcallstars = (TL_phone.getGroupCallStars) obj3;
                TL_phone.groupCallStars groupcallstars = (TL_phone.groupCallStars) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                th.u uVar = p1Var.V;
                int i11 = p1Var.N;
                p1Var.U = false;
                TLRPC.InputGroupCall inputGroupCall = p1Var.O;
                if (inputGroupCall != null && inputGroupCall.f19810id == getgroupcallstars.call.f19810id) {
                    if (groupcallstars != null) {
                        vp.r1(i11).V3(groupcallstars.users, false);
                        vp.r1(i11).P3(groupcallstars.chats, false);
                        int i12 = 0;
                        while (true) {
                            if (i12 < groupcallstars.top_donors.size()) {
                                if (groupcallstars.top_donors.get(i12).my) {
                                    if (groupcallstars.top_donors.get(i12).stars > 0) {
                                        z10 = true;
                                    }
                                } else {
                                    i12++;
                                }
                            }
                        }
                        z10 = false;
                        long j10 = groupcallstars.total_stars;
                        if (j10 == p1Var.Q && p1Var.S == z10) {
                            z11 = false;
                        }
                        p1Var.Q = j10;
                        p1Var.T = groupcallstars.top_donors;
                        p1Var.S = z10;
                        if (z11) {
                            p1Var.j();
                        }
                        p1Var.t();
                    }
                    if (p1Var.isAttachedToWindow()) {
                        org.telegram.messenger.i0.r(uVar);
                        org.telegram.messenger.i0.h3(uVar, 5000L);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = (ArrayList) obj3;
                Vector vector = (Vector) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                int i13 = ((th.v7) obj4).f49546a.f49593a;
                if (vector != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i14 = 0; i14 < vector.objects.size(); i14++) {
                        if (((Long) arrayList.get(i14)).longValue() > 0) {
                            TLRPC.User Z1 = vp.r1(i13).Z1((Long) arrayList.get(i14));
                            if (Z1 != null) {
                                TLRPC.TL_recentStory tL_recentStory = (TLRPC.TL_recentStory) vector.objects.get(i14);
                                Z1.stories_max_id = tL_recentStory;
                                if (tL_recentStory != null) {
                                    Z1.flags2 |= 32;
                                } else {
                                    Z1.flags2 &= -33;
                                }
                                arrayList2.add(Z1);
                            }
                        } else {
                            TLRPC.Chat L0 = vp.r1(i13).L0((Long) arrayList.get(i14));
                            if (L0 != null) {
                                TLRPC.TL_recentStory tL_recentStory2 = (TLRPC.TL_recentStory) vector.objects.get(i14);
                                L0.stories_max_id = tL_recentStory2;
                                if (tL_recentStory2 != null) {
                                    L0.flags2 |= 16;
                                } else {
                                    L0.flags2 &= -17;
                                }
                                arrayList3.add(L0);
                            }
                        }
                    }
                    hs.a0(i13).m1(arrayList2, arrayList3, true, true);
                    zs.f(i13).k(2, 0);
                    return;
                }
                return;
            case 5:
                vh.b4 b4Var = (vh.b4) obj4;
                jg.j jVar = (jg.j) obj3;
                b4Var.getClass();
                ((jg.z0) jVar).r(b4Var.f50979o1, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
                b4Var.b0(jVar);
                return;
            default:
                ((l20) obj4).a((Boolean) obj, (androidx.biometric.t) obj2, (androidx.biometric.u) obj3);
                return;
        }
    }
}
