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
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.l60;
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
public final class z0 implements View.OnClickListener {
    public final int f57856a;
    public final Object f57857b;
    public final Object f57858c;

    public z0(int i7, Object obj, Object obj2) {
        this.f57856a = i7;
        this.f57857b = obj;
        this.f57858c = obj2;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i7 = this.f57856a;
        int i10 = 0;
        Object obj = this.f57858c;
        Object obj2 = this.f57857b;
        switch (i7) {
            case 0:
                f1 f1Var = (f1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = f1Var.Z1;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj3;
                    l10.getClass();
                    hashSet.remove(l10);
                    f1Var.f57730f2.remove(l10);
                }
                f1Var.e1();
                f1Var.R1.b(true, hashSet, new x0(f1Var, 5), null);
                f1Var.p1(true, true);
                f1Var.f1();
                return;
            case 1:
                final f1 f1Var2 = (f1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                l60 F = l60.F(f1Var2.f28627c, f1Var2.I0, (View) view.getParent());
                F.c(2131232582, id.M0(2131745601, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    f2 f2Var = f1Var2.f36305o1;
                                    if (f2Var == null) {
                                        f2 T = LaunchActivity.T();
                                        ?? obj4 = new Object();
                                        obj4.f27408a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f27105id);
                                            T.showAsSheet(new cn(bundle), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f27105id);
                                    f2Var.presentFragment(new cn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    f2 f2Var2 = f1Var2.f36305o1;
                                    if (f2Var2 == null) {
                                        f2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj5 = new Object();
                                            obj5.f27408a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f27105id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f27105id);
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
                                    f2 f2Var = f1Var2.f36305o1;
                                    if (f2Var == null) {
                                        f2 T = LaunchActivity.T();
                                        ?? obj4 = new Object();
                                        obj4.f27408a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f27105id);
                                            T.showAsSheet(new cn(bundle), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f27105id);
                                    f2Var.presentFragment(new cn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    f2 f2Var2 = f1Var2.f36305o1;
                                    if (f2Var2 == null) {
                                        f2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj5 = new Object();
                                            obj5.f27408a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f27105id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f27105id);
                                    f2Var2.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                F.Z();
                return;
            case 2:
                final xg.f fVar = (xg.f) obj2;
                final yg.a aVar = (yg.a) obj;
                if (fVar.d) {
                    if (!aVar.f59430a.Q) {
                        aVar.b(true);
                        String str = fVar.h;
                        c20 c20Var = new c20() {
                            @Override
                            public final void a(Object obj4) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj4;
                                        aVar.b(false);
                                        b0 b0Var = (b0) fVar;
                                        g0.i3(new a0(b0Var, 0), 200L);
                                        b0Var.f57699r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        f fVar2 = fVar;
                                        wg.h.c((TLRPC.TL_error) obj4, fVar2.f58738n, fVar2.f58735c, new d(fVar2, 1));
                                        return;
                                }
                            }
                        };
                        c20 c20Var2 = new c20() {
                            @Override
                            public final void a(Object obj4) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj4;
                                        aVar.b(false);
                                        b0 b0Var = (b0) fVar;
                                        g0.i3(new a0(b0Var, 0), 200L);
                                        b0Var.f57699r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        f fVar2 = fVar;
                                        wg.h.c((TLRPC.TL_error) obj4, fVar2.f58738n, fVar2.f58735c, new d(fVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(p10.f24470s0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(c20Var2, c20Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((b0) fVar).f57699r.dismiss();
                return;
            case 3:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar2 = ((yg.g) obj2).f59464w;
                if (fVar2 != null) {
                    z zVar = ((t) fVar2).f57807a;
                    zVar.U1.remove(chat);
                    zVar.k1(true, true);
                    return;
                }
                return;
            case 4:
                ((xg.a) obj2).a((TLRPC.TL_payments_checkedGiftCode) obj);
                return;
            case 5:
                ((xg.a) obj2).a((TLRPC.Chat) obj);
                return;
            case 6:
                zh.d dVar = (zh.d) obj2;
                dVar.getClass();
                long o4 = m5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                dVar.dismiss();
                f2 T = LaunchActivity.T();
                if (T != null && !t10.A(o4)) {
                    Bundle bundle = new Bundle();
                    if (o4 > 0) {
                        bundle.putLong("user_id", o4);
                        if (o4 == p10.i(dVar.f28621a).e()) {
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
            case 7:
                m3 m3Var = (m3) obj2;
                m3Var.getClass();
                if (((r2) obj).f60529n > 0) {
                    m3Var.presentFragment(new dd());
                    return;
                }
                return;
            case 8:
                l3 l3Var = (l3) obj2;
                k3 k3Var = (k3) obj;
                l60 F2 = l60.F(l3Var.f28627c, l3Var.I0, l3Var.S1);
                F2.c(2131231890, id.M0(2131746139, null), new f3(k3Var, 3), false);
                F2.c(2131231888, id.M0(2131746143, null), new f3(k3Var, 4), false);
                F2.c(2131231889, id.M0(2131746141, null), new f3(k3Var, 5), false);
                F2.f35618t = false;
                F2.Y = true;
                F2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                F2.Z();
                return;
            case 9:
                o3 o3Var = (o3) obj2;
                d4 d4Var = (d4) obj;
                HashSet hashSet2 = o3Var.R1;
                if (!hashSet2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList3 = o3Var.Q1.f4913l;
                        int size2 = arrayList3.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size2) {
                                Object obj4 = arrayList3.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj4;
                                int i12 = savedStarGift.msg_id;
                                if (i12 != 0) {
                                    if (i12 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList2.add(savedStarGift);
                        }
                    }
                    d4Var.a(arrayList2);
                    o3Var.dismiss();
                    return;
                }
                return;
            default:
                v9 v9Var = ((n3) obj2).f60490c.Q1;
                v9Var.f4907e = !v9Var.f4907e;
                ((hp0) obj).run();
                v9Var.j(true);
                return;
        }
    }
}
