package wg;

import android.os.Bundle;
import android.view.View;
import bi.dd;
import bi.v9;
import hi.d4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import wg.a0;
import wg.b0;
import zh.f3;
import zh.k3;
import zh.l3;
import zh.m3;
import zh.n3;
import zh.o3;
import zh.r2;
public final class a1 implements View.OnClickListener {
    public final int f57691a;
    public final Object f57692b;
    public final Object f57693c;

    public a1(int i7, Object obj, Object obj2) {
        this.f57691a = i7;
        this.f57692b = obj;
        this.f57693c = obj2;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i7 = this.f57691a;
        Object obj = this.f57693c;
        Object obj2 = this.f57692b;
        switch (i7) {
            case 0:
                final f1 f1Var = (f1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                k60 F = k60.F(f1Var.f28675c, f1Var.I0, (View) view.getParent());
                F.c(2131232582, id.M0(2131745601, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    f2 f2Var = f1Var.f35905r1;
                                    if (f2Var == null) {
                                        f2 T = LaunchActivity.T();
                                        ?? obj3 = new Object();
                                        obj3.f27388a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f27109id);
                                            T.showAsSheet(new cn(bundle), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f27109id);
                                    f2Var.presentFragment(new cn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    f2 f2Var2 = f1Var.f35905r1;
                                    if (f2Var2 == null) {
                                        f2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj4 = new Object();
                                            obj4.f27388a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f27109id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f27109id);
                                    f2Var2.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.c(2131232266, id.M0(2131747786, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    f2 f2Var = f1Var.f35905r1;
                                    if (f2Var == null) {
                                        f2 T = LaunchActivity.T();
                                        ?? obj3 = new Object();
                                        obj3.f27388a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f27109id);
                                            T.showAsSheet(new cn(bundle), obj3);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f27109id);
                                    f2Var.presentFragment(new cn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    f2 f2Var2 = f1Var.f35905r1;
                                    if (f2Var2 == null) {
                                        f2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj4 = new Object();
                                            obj4.f27388a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f27109id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f27109id);
                                    f2Var2.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.Z();
                return;
            case 1:
                final xg.f fVar = (xg.f) obj2;
                final yg.a aVar = (yg.a) obj;
                if (fVar.d) {
                    if (!aVar.f59428a.Q) {
                        aVar.b(true);
                        String str = fVar.h;
                        c20 c20Var = new c20() {
                            @Override
                            public final void a(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) fVar;
                                        g0.i3(new a0(b0Var, 0), 200L);
                                        b0Var.f57698r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        f fVar2 = fVar;
                                        wg.h.c((TLRPC.TL_error) obj3, fVar2.f58736n, fVar2.f58733c, new d(fVar2, 1));
                                        return;
                                }
                            }
                        };
                        c20 c20Var2 = new c20() {
                            @Override
                            public final void a(Object obj3) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj3;
                                        aVar.b(false);
                                        b0 b0Var = (b0) fVar;
                                        g0.i3(new a0(b0Var, 0), 200L);
                                        b0Var.f57698r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        f fVar2 = fVar;
                                        wg.h.c((TLRPC.TL_error) obj3, fVar2.f58736n, fVar2.f58733c, new d(fVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24474s0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(c20Var2, c20Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((b0) fVar).f57698r.dismiss();
                return;
            case 2:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar2 = ((yg.g) obj2).f59462w;
                if (fVar2 != null) {
                    z zVar = ((t) fVar2).f57805a;
                    zVar.X1.remove(chat);
                    zVar.k1(true, true);
                    return;
                }
                return;
            case 3:
                ((xg.a) obj2).a((TLRPC.TL_payments_checkedGiftCode) obj);
                return;
            case 4:
                ((xg.a) obj2).a((TLRPC.Chat) obj);
                return;
            case 5:
                zh.d dVar = (zh.d) obj2;
                dVar.getClass();
                long o4 = m5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                dVar.dismiss();
                f2 T = LaunchActivity.T();
                if (T != null && !t10.A(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == p10.i(dVar.f28669a).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                    } else {
                        bundle.putLong("chat_id", -o4);
                    }
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 6:
                m3 m3Var = (m3) obj2;
                m3Var.getClass();
                if (((r2) obj).f60538n > 0) {
                    m3Var.presentFragment(new dd());
                    return;
                }
                return;
            case 7:
                l3 l3Var = (l3) obj2;
                k3 k3Var = (k3) obj;
                k60 F2 = k60.F(l3Var.f28675c, l3Var.I0, l3Var.V1);
                F2.c(2131231890, id.M0(2131746139, null), new f3(k3Var, 3), false);
                F2.c(2131231888, id.M0(2131746143, null), new f3(k3Var, 4), false);
                F2.c(2131231889, id.M0(2131746141, null), new f3(k3Var, 5), false);
                F2.f35220t = false;
                F2.Y = true;
                F2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                F2.Z();
                return;
            case 8:
                o3 o3Var = (o3) obj2;
                d4 d4Var = (d4) obj;
                HashSet hashSet = o3Var.U1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = o3Var.T1.f4914l;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj3 = arrayList2.get(i10);
                                i10++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i11 = savedStarGift.msg_id;
                                if (i11 != 0) {
                                    if (i11 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                    }
                    d4Var.a(arrayList);
                    o3Var.dismiss();
                    return;
                }
                return;
            default:
                v9 v9Var = ((n3) obj2).f60497c.T1;
                v9Var.f4908e = !v9Var.f4908e;
                ((gp0) obj).run();
                v9Var.j(true);
                return;
        }
    }
}
