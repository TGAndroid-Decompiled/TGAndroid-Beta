package wh;

import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.mk;
import org.telegram.ui.un;
import rh.e6;
public final class f extends ha implements us {
    public final sf.a P1;
    public final ai.b Q1;
    public final FrameLayout R1;
    public Runnable S1;
    public int T1;
    public p51 U1;

    public f(android.content.Context r16, org.telegram.ui.ActionBar.p6 r17, sf.a r18, boolean r19, java.lang.Runnable r20) {
        throw new UnsupportedOperationException("Method not decompiled: wh.f.<init>(android.content.Context, org.telegram.ui.ActionBar.p6, sf.a, boolean, java.lang.Runnable):void");
    }

    @Override
    public final void L() {
        super.L();
        zs.f(this.f21583a).n(this, zs.f19707v3);
        zs.f(this.f21583a).n(this, zs.y3);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.f21583a, 0, true, new qh.d(this, 25), this.I0);
        this.U1 = p51Var;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        ai.b bVar = this.Q1;
        if (bVar == null) {
            return null;
        }
        return ((TextView) bVar.f834c).getText();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == zs.f19707v3 || i10 == zs.y3) {
            p51 p51Var = this.U1;
            if (p51Var != null) {
                p51Var.O(true);
            }
            sf.a s10 = e6.y(this.f21583a, true).s();
            sf.a aVar = this.P1;
            ((TextView) this.Q1.f834c).setText(cd.a0(null, null, 2131744070, sf.a.i(aVar.f48255b - s10.f48255b, sf.b.f48257b).d()));
            da daVar = this.l1;
            if (daVar != null) {
                daVar.setTitle(O0());
            }
            if (s10.f48255b >= aVar.f48255b && (runnable = this.S1) != null) {
                runnable.run();
                this.S1 = null;
                dismiss();
            }
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        ai.b bVar = this.Q1;
        if (bVar != null) {
            ((a7) bVar.f833b).setPaused(true);
        }
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int w02 = t6.w0(t6.f21001h5, this.I0);
            if (w02 != this.T1) {
                this.T1 = w02;
                v0(w02);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        mk mkVar;
        if (e6.y(this.f21583a, true).s().f48255b >= this.P1.f48255b) {
            Runnable runnable = this.S1;
            if (runnable != null) {
                runnable.run();
                this.S1 = null;
                return;
            }
            return;
        }
        k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            un unVar = (un) Q;
            if (unVar.J9() && (mkVar = unVar.Z) != null) {
                mkVar.L();
            }
        }
        super.show();
        zs.f(this.f21583a).c(this, zs.f19707v3);
        zs.f(this.f21583a).c(this, zs.y3);
    }
}
