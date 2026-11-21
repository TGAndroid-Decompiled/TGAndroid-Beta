package wg;

import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.sg0;
import org.telegram.ui.v00;
public final class d1 implements rj0, tj0 {
    public final e1 f59778a;

    public d1(e1 e1Var) {
        this.f59778a = e1Var;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        e1 e1Var = this.f59778a;
        ah.a aVar = e1Var.Z1;
        sg0 sg0Var = e1Var.V1;
        HashSet hashSet = e1Var.f59786c2;
        if (view instanceof n8) {
            v00 v00Var = e1Var.f59801s2;
            if (v00Var != null) {
                v00Var.run();
                e1Var.dismiss();
            }
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.f28580id : -chat.f28431id;
            boolean z10 = false;
            if (hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j3));
                q10 q10Var = e1Var.f59803u2;
                if (q10Var != null) {
                    op opVar = e1Var.Y1;
                    if (opVar != null && opVar.f38327a.f32871q) {
                        z10 = true;
                    }
                    q10Var.a(Boolean.valueOf(z10), hashSet);
                    e1Var.f59803u2 = null;
                }
                e1Var.dismiss();
                return;
            }
            boolean z11 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                e1Var.f59791i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == e1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                e1Var.j1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z12 = !isEmpty;
            if (z11 != z12) {
                aVar.setVisibility(0);
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(nr.h).setDuration(320L).withEndAction(isEmpty ? new x0(e1Var, 1) : null).start();
                xg.h hVar = e1Var.f59793k2;
                boolean z13 = !z12;
                if (hVar.E != z13) {
                    hVar.E = z13;
                    org.telegram.messenger.g0.d0(hVar.f60544f, new xg.f(z13));
                }
            }
            e1Var.e1();
            sg0Var.b(true, hashSet, new x0(e1Var, 2), null);
            e1Var.m1(true, true);
            e1Var.f1();
        }
    }

    public d1(e1 e1Var, fi.h0 h0Var, int i7) {
        this.f59778a = e1Var;
    }

    @Override
    public void r(float f10) {
    }

    @Override
    public void j() {
    }

    @Override
    public boolean mo23f(float f10, float f11, int i7, View view) {
        e1 e1Var = this.f59778a;
        ah.a aVar = e1Var.Z1;
        HashSet hashSet = e1Var.f59786c2;
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            long j3 = user != null ? user.f28580id : -rVar.getChat().f28431id;
            boolean z10 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                e1Var.f59791i2.put(Long.valueOf(j3), user);
            }
            if (hashSet.size() == e1Var.h1() + 1) {
                hashSet.remove(Long.valueOf(j3));
                e1Var.j1();
                return true;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z11 = !isEmpty;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(nr.h).setDuration(320L).withEndAction(isEmpty ? new x0(e1Var, 7) : null).start();
                xg.h hVar = e1Var.f59793k2;
                boolean z12 = !z11;
                if (hVar.E != z12) {
                    hVar.E = z12;
                    org.telegram.messenger.g0.d0(hVar.f60544f, new xg.f(z12));
                }
            }
            e1Var.e1();
            e1Var.V1.b(true, hashSet, new x0(e1Var, 8), null);
            e1Var.m1(true, true);
            e1Var.f1();
            return true;
        }
        return false;
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
