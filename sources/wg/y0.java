package wg;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.a70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import wg.b0;
public final class y0 implements View.OnClickListener {
    public final int f59869a;
    public final Object f59870b;
    public final Object f59871c;

    public y0(int i7, Object obj, Object obj2) {
        this.f59869a = i7;
        this.f59870b = obj;
        this.f59871c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f59869a;
        int i10 = 0;
        Object obj = this.f59871c;
        Object obj2 = this.f59870b;
        switch (i7) {
            case 0:
                e1 e1Var = (e1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = e1Var.f59755c2;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj3;
                    l10.getClass();
                    hashSet.remove(l10);
                    e1Var.f59760i2.remove(l10);
                }
                e1Var.e1();
                e1Var.V1.b(true, hashSet, new x0(e1Var, 5), null);
                e1Var.m1(true, true);
                e1Var.f1();
                return;
            case 1:
                final e1 e1Var2 = (e1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                a70 G = a70.G(e1Var2.f30145c, e1Var2.J0, (View) view.getParent());
                G.c(2131232584, hd.N0(2131745405, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = e1Var2.f39491s1;
                                    if (g2Var == null) {
                                        g2 T = LaunchActivity.T();
                                        ?? obj4 = new Object();
                                        obj4.f28871a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f28547id);
                                            T.showAsSheet(new bn(bundle), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f28547id);
                                    g2Var.presentFragment(new bn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    g2 g2Var2 = e1Var2.f39491s1;
                                    if (g2Var2 == null) {
                                        g2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj5 = new Object();
                                            obj5.f28871a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f28547id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f28547id);
                                    g2Var2.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.c(2131232268, hd.N0(2131747592, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = e1Var2.f39491s1;
                                    if (g2Var == null) {
                                        g2 T = LaunchActivity.T();
                                        ?? obj4 = new Object();
                                        obj4.f28871a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f28547id);
                                            T.showAsSheet(new bn(bundle), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f28547id);
                                    g2Var.presentFragment(new bn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    g2 g2Var2 = e1Var2.f39491s1;
                                    if (g2Var2 == null) {
                                        g2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj5 = new Object();
                                            obj5.f28871a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f28547id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f28547id);
                                    g2Var2.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.a0();
                return;
            case 2:
                final xg.e eVar = (xg.e) obj2;
                final yg.a aVar = (yg.a) obj;
                if (eVar.d) {
                    if (!aVar.f61210a.R) {
                        aVar.b(true);
                        String str = eVar.h;
                        y10 y10Var = new y10() {
                            @Override
                            public final void a(Object obj4) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj4;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        g0.h3(new vg.d(b0Var, 7), 200L);
                                        b0Var.f59730r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        wg.h.c((TLRPC.TL_error) obj4, eVar2.f60498n, eVar2.f60495c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        y10 y10Var2 = new y10() {
                            @Override
                            public final void a(Object obj4) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj4;
                                        aVar.b(false);
                                        b0 b0Var = (b0) eVar;
                                        g0.h3(new vg.d(b0Var, 7), 200L);
                                        b0Var.f59730r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        wg.h.c((TLRPC.TL_error) obj4, eVar2.f60498n, eVar2.f60495c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24932t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(y10Var2, y10Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((b0) eVar).f59730r.dismiss();
                return;
            case 3:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar = ((yg.g) obj2).f61244w;
                if (fVar != null) {
                    a0 a0Var = ((u) fVar).f59836a;
                    a0Var.Y1.remove(chat);
                    a0Var.l1(true, true);
                    return;
                }
                return;
            case 4:
                ((ug.z) obj2).a((TLRPC.TL_payments_checkedGiftCode) obj);
                return;
            default:
                ((ug.z) obj2).a((TLRPC.Chat) obj);
                return;
        }
    }
}
