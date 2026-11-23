package wg;

import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.qg0;
import org.telegram.ui.u00;
public final class c1 implements rj0, tj0 {
    public final d1 f59839a;

    public c1(d1 d1Var) {
        this.f59839a = d1Var;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        d1 d1Var = this.f59839a;
        ah.a aVar = d1Var.Z1;
        qg0 qg0Var = d1Var.V1;
        HashSet hashSet = d1Var.f59850c2;
        if (view instanceof m8) {
            u00 u00Var = d1Var.f59865s2;
            if (u00Var != null) {
                u00Var.run();
                d1Var.dismiss();
            }
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            if (user == null && chat == null) {
                return;
            }
            long j3 = user != null ? user.f28641id : -chat.f28492id;
            boolean z10 = false;
            if (hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j3));
                p10 p10Var = d1Var.f59867u2;
                if (p10Var != null) {
                    lp lpVar = d1Var.Y1;
                    if (lpVar != null && lpVar.f37189a.f32938q) {
                        z10 = true;
                    }
                    p10Var.a(Boolean.valueOf(z10), hashSet);
                    d1Var.f59867u2 = null;
                }
                d1Var.dismiss();
                return;
            }
            boolean z11 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                d1Var.f59855i2.put(Long.valueOf(j3), user);
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
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(kr.h).setDuration(320L).withEndAction(isEmpty ? new w0(d1Var, 1) : null).start();
                xg.h hVar = d1Var.f59857k2;
                boolean z13 = !z12;
                if (hVar.E != z13) {
                    hVar.E = z13;
                    org.telegram.messenger.g0.d0(hVar.f60631f, new xg.f(z13));
                }
            }
            d1Var.e1();
            qg0Var.b(true, hashSet, new w0(d1Var, 2), null);
            d1Var.m1(true, true);
            d1Var.f1();
        }
    }

    public c1(d1 d1Var, fi.h0 h0Var, int i7) {
        this.f59839a = d1Var;
    }

    @Override
    public void l(float f10) {
    }

    @Override
    public void h() {
    }

    @Override
    public boolean mo24g(float f10, float f11, int i7, View view) {
        d1 d1Var = this.f59839a;
        ah.a aVar = d1Var.Z1;
        HashSet hashSet = d1Var.f59850c2;
        if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            long j3 = user != null ? user.f28641id : -rVar.getChat().f28492id;
            boolean z10 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j3))) {
                hashSet.remove(Long.valueOf(j3));
            } else {
                hashSet.add(Long.valueOf(j3));
                d1Var.f59855i2.put(Long.valueOf(j3), user);
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
                aVar.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? org.telegram.messenger.g0.L(12.0f) : 0.0f).setInterpolator(kr.h).setDuration(320L).withEndAction(isEmpty ? new w0(d1Var, 7) : null).start();
                xg.h hVar = d1Var.f59857k2;
                boolean z12 = !z11;
                if (hVar.E != z12) {
                    hVar.E = z12;
                    org.telegram.messenger.g0.d0(hVar.f60631f, new xg.f(z12));
                }
            }
            d1Var.e1();
            d1Var.V1.b(true, hashSet, new w0(d1Var, 8), null);
            d1Var.m1(true, true);
            d1Var.f1();
            return true;
        }
        return false;
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
