package rh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.wb;
public final class b implements Runnable {
    public final int f46650a;
    public final i f46651b;

    public b(i iVar, int i10) {
        this.f46650a = i10;
        this.f46651b = iVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i10 = this.f46650a;
        i iVar = this.f46651b;
        switch (i10) {
            case 0:
                b bVar = iVar.f47071s0;
                int currentTime = iVar.getConnectionsManager().getCurrentTime();
                ph.i iVar2 = iVar.f47048a0;
                if (iVar.Y <= 0 && iVar.P <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                iVar2.setEnabled(z10);
                if (currentTime < iVar.P) {
                    iVar.f47048a0.i(dd.L0(2131752968, null), true, true);
                    if (iVar.f47069r0 == null) {
                        iVar.f47069r0 = new SpannableStringBuilder("l");
                        dq dqVar = new dq(2131231975, 0);
                        dqVar.f25567n = 1;
                        iVar.f47069r0.setSpan(dqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) iVar.f47069r0).append((CharSequence) i.w0(iVar.P - currentTime));
                    iVar.f47048a0.g(spannableStringBuilder, true);
                    wb wbVar = iVar.f47060j0;
                    if (wbVar != null) {
                        bb bbVar = wbVar.e;
                        if ((bbVar instanceof eb) && bbVar.isAttachedToWindow()) {
                            org.telegram.messenger.m5.q(null, null, 2131752952, new Object[]{i.w0(iVar.P - currentTime)}, ((eb) iVar.f47060j0.e).f25779b);
                        }
                    }
                    org.telegram.messenger.i0.r(bVar);
                    org.telegram.messenger.i0.h3(bVar, 1000L);
                    return;
                }
                iVar.f47048a0.g(null, true);
                ph.i iVar3 = iVar.f47048a0;
                if (iVar.X) {
                    H = dd.L0(2131752969, null);
                } else {
                    H = dd.H(' ', "BotStarsButtonWithdrawShort", (int) iVar.Y);
                }
                iVar3.i(h8.Y0(false, H, iVar.f47052c0), true, true);
                return;
            case 1:
                i.b0(iVar);
                return;
            case 2:
                gf.f.r(iVar.getParentActivity(), dd.L0(2131752956, null));
                return;
            case 3:
                i.Z(iVar);
                return;
            case 4:
                gf.f.r(iVar.getParentActivity(), dd.L0(2131753029, null));
                return;
            case 5:
                gf.f.r(iVar.getParentActivity(), dd.L0(2131753049, null));
                return;
            default:
                iVar.f47050b0.setLoading(false);
                return;
        }
    }
}
