package wg;

import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.rg0;
import org.telegram.ui.v00;
public final class c1 implements pj0, rj0 {
    public final d1 f59727a;

    public c1(d1 d1Var) {
        this.f59727a = d1Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        d1 d1Var = this.f59727a;
        ah.a aVar = d1Var.Z1;
        rg0 rg0Var = d1Var.V1;
        HashSet hashSet = d1Var.f59739c2;
        if (view instanceof m8) {
            v00 v00Var = d1Var.f59754s2;
            if (v00Var != null) {
                v00Var.run();
                d1Var.dismiss();
            }
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.f28554id : -chat.f28405id;
            boolean z10 = false;
            if (hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j3));
                q10 q10Var = d1Var.f59756u2;
                if (q10Var != null) {
                    mp mpVar = d1Var.Y1;
                    if (mpVar != null && mpVar.f37598a.f32838q) {
                        z10 = true;
                    }
                    q10Var.a(Boolean.valueOf(z10), hashSet);
                    d1Var.f59756u2 = null;
                }
                d1Var.dismiss();
                return;
            }
            boolean z11 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                d1Var.f59744i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == d1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                d1Var.j1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z12 = !isEmpty;
            if (z11 != z12) {
                aVar.setVisibility(0);
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(lr.h).setDuration(320L).withEndAction(isEmpty ? new x0(d1Var, 1) : null).start();
                xg.h hVar = d1Var.f59746k2;
                boolean z13 = !z12;
                if (hVar.E != z13) {
                    hVar.E = z13;
                    org.telegram.messenger.g0.d0(hVar.f60502f, new xg.f(z13));
                }
            }
            d1Var.e1();
            rg0Var.b(true, hashSet, new x0(d1Var, 2), null);
            d1Var.m1(true, true);
            d1Var.f1();
        }
    }

    public c1(d1 d1Var, fi.h0 h0Var, int i7) {
        this.f59727a = d1Var;
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void j() {
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        d1 d1Var = this.f59727a;
        ah.a aVar = d1Var.Z1;
        HashSet hashSet = d1Var.f59739c2;
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            long j3 = user != null ? user.f28554id : -rVar.getChat().f28405id;
            boolean z10 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                d1Var.f59744i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == d1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                d1Var.j1();
                return true;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z11 = !isEmpty;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(lr.h).setDuration(320L).withEndAction(isEmpty ? new x0(d1Var, 7) : null).start();
                xg.h hVar = d1Var.f59746k2;
                boolean z12 = !z11;
                if (hVar.E != z12) {
                    hVar.E = z12;
                    org.telegram.messenger.g0.d0(hVar.f60502f, new xg.f(z12));
                }
            }
            d1Var.e1();
            d1Var.V1.b(true, hashSet, new x0(d1Var, 8), null);
            d1Var.m1(true, true);
            d1Var.f1();
            return true;
        }
        return false;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
