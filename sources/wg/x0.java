package wg;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import ug.u1;
import wg.a0;
public final class x0 implements View.OnClickListener {
    public final int f59964a;
    public final Object f59965b;
    public final Object f59966c;

    public x0(int i7, Object obj, Object obj2) {
        this.f59964a = i7;
        this.f59965b = obj;
        this.f59966c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f59964a;
        int i10 = 0;
        Object obj = this.f59966c;
        Object obj2 = this.f59965b;
        switch (i7) {
            case 0:
                d1 d1Var = (d1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                HashSet hashSet = d1Var.f59850c2;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj3 = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj3;
                    l10.getClass();
                    hashSet.remove(l10);
                    d1Var.f59855i2.remove(l10);
                }
                d1Var.e1();
                d1Var.V1.b(true, hashSet, new w0(d1Var, 5), null);
                d1Var.m1(true, true);
                d1Var.f1();
                return;
            case 1:
                final d1 d1Var2 = (d1) obj2;
                final TLRPC.User user = (TLRPC.User) obj;
                x60 G = x60.G(d1Var2.f30229c, d1Var2.J0, (View) view.getParent());
                G.c(2131232587, gd.N0(2131745405, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = d1Var2.f39250s1;
                                    if (g2Var == null) {
                                        g2 T = LaunchActivity.T();
                                        ?? obj4 = new Object();
                                        obj4.f28948a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f28641id);
                                            T.showAsSheet(new bn(bundle), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f28641id);
                                    g2Var.presentFragment(new bn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    g2 g2Var2 = d1Var2.f39250s1;
                                    if (g2Var2 == null) {
                                        g2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj5 = new Object();
                                            obj5.f28948a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f28641id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f28641id);
                                    g2Var2.presentFragment(new ProfileActivity(bundle4, null));
                                    return;
                                }
                                return;
                        }
                    }
                }, false);
                G.c(2131232271, gd.N0(2131747592, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                TLRPC.User user2 = user;
                                if (user2 != null) {
                                    g2 g2Var = d1Var2.f39250s1;
                                    if (g2Var == null) {
                                        g2 T = LaunchActivity.T();
                                        ?? obj4 = new Object();
                                        obj4.f28948a = true;
                                        if (T != 0) {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("user_id", user2.f28641id);
                                            T.showAsSheet(new bn(bundle), obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.f28641id);
                                    g2Var.presentFragment(new bn(bundle2));
                                    return;
                                }
                                return;
                            default:
                                TLRPC.User user3 = user;
                                if (user3 != null) {
                                    g2 g2Var2 = d1Var2.f39250s1;
                                    if (g2Var2 == null) {
                                        g2 T2 = LaunchActivity.T();
                                        if (T2 != 0) {
                                            ?? obj5 = new Object();
                                            obj5.f28948a = true;
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("user_id", user3.f28641id);
                                            T2.showAsSheet(new ProfileActivity(bundle3, null), obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.f28641id);
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
                    if (!aVar.f61329a.R) {
                        aVar.b(true);
                        String str = eVar.h;
                        w10 w10Var = new w10() {
                            @Override
                            public final void a(Object obj4) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj4;
                                        aVar.b(false);
                                        a0 a0Var = (a0) eVar;
                                        g0.h3(new u1(a0Var, 9), 200L);
                                        a0Var.f59824r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        wg.h.c((TLRPC.TL_error) obj4, eVar2.f60616n, eVar2.f60613c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        w10 w10Var2 = new w10() {
                            @Override
                            public final void a(Object obj4) {
                                switch (r3) {
                                    case 0:
                                        Void r62 = (Void) obj4;
                                        aVar.b(false);
                                        a0 a0Var = (a0) eVar;
                                        g0.h3(new u1(a0Var, 9), 200L);
                                        a0Var.f59824r.dismiss();
                                        return;
                                    default:
                                        aVar.b(false);
                                        e eVar2 = eVar;
                                        wg.h.c((TLRPC.TL_error) obj4, eVar2.f60616n, eVar2.f60613c, new c(eVar2, 1));
                                        return;
                                }
                            }
                        };
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.f24637t0);
                        TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                        tL_payments_applyGiftCode.slug = str;
                        connectionsManager.sendRequest(tL_payments_applyGiftCode, new n(w10Var2, w10Var, 0), 2);
                        return;
                    }
                    return;
                }
                ((a0) eVar).f59824r.dismiss();
                return;
            case 3:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yg.f fVar = ((yg.g) obj2).f61363w;
                if (fVar != null) {
                    z zVar = ((t) fVar).f59931a;
                    zVar.Y1.remove(chat);
                    zVar.l1(true, true);
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
