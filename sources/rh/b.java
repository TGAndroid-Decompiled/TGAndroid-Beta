package rh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.wb;
public final class b implements Runnable {
    public final int f46655a;
    public final i f46656b;

    public b(i iVar, int i10) {
        this.f46655a = i10;
        this.f46656b = iVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i10 = this.f46655a;
        i iVar = this.f46656b;
        switch (i10) {
            case 0:
                b bVar = iVar.f47057s0;
                int currentTime = iVar.getConnectionsManager().getCurrentTime();
                ph.i iVar2 = iVar.f47034a0;
                if (iVar.Y <= 0 && iVar.P <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                iVar2.setEnabled(z10);
                if (currentTime < iVar.P) {
                    iVar.f47034a0.i(cd.L0(2131752968, null), true, true);
                    if (iVar.f47055r0 == null) {
                        iVar.f47055r0 = new SpannableStringBuilder("l");
                        dq dqVar = new dq(2131231975, 0);
                        dqVar.f25507n = 1;
                        iVar.f47055r0.setSpan(dqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) iVar.f47055r0).append((CharSequence) i.v0(iVar.P - currentTime));
                    iVar.f47034a0.g(spannableStringBuilder, true);
                    wb wbVar = iVar.f47046j0;
                    if (wbVar != null) {
                        bb bbVar = wbVar.e;
                        if ((bbVar instanceof eb) && bbVar.isAttachedToWindow()) {
                            org.telegram.messenger.m5.q(null, null, 2131752952, new Object[]{i.v0(iVar.P - currentTime)}, ((eb) iVar.f47046j0.e).f25745b);
                        }
                    }
                    org.telegram.messenger.i0.r(bVar);
                    org.telegram.messenger.i0.h3(bVar, 1000L);
                    return;
                }
                iVar.f47034a0.g(null, true);
                ph.i iVar3 = iVar.f47034a0;
                if (iVar.X) {
                    H = cd.L0(2131752969, null);
                } else {
                    H = cd.H(' ', "BotStarsButtonWithdrawShort", (int) iVar.Y);
                }
                iVar3.i(h8.X0(false, H, iVar.f47038c0), true, true);
                return;
            case 1:
                i.a0(iVar);
                return;
            case 2:
                gf.f.r(iVar.getParentActivity(), cd.L0(2131752956, null));
                return;
            case 3:
                i.Y(iVar);
                return;
            case 4:
                gf.f.r(iVar.getParentActivity(), cd.L0(2131753029, null));
                return;
            case 5:
                gf.f.r(iVar.getParentActivity(), cd.L0(2131753049, null));
                return;
            default:
                iVar.f47036b0.setLoading(false);
                return;
        }
    }
}
