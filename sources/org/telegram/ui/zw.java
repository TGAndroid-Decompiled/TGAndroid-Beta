package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class zw extends FragmentContextView {
    public final int Q0;
    public final qy R0;

    public zw(qy qyVar, Context context, qy qyVar2, int i10) {
        super(context, qyVar2, true);
        this.Q0 = i10;
        switch (i10) {
            case 1:
                this.R0 = qyVar;
                super(context, qyVar2, false);
                return;
            default:
                this.R0 = qyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.Q0) {
            case 0:
                qy qyVar = this.R0;
                org.telegram.ui.Components.ms msVar = qyVar.J1;
                FrameLayout frameLayout = qyVar.G1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                msVar.i(frameLayout, z10, true);
                return;
            default:
                qy qyVar2 = this.R0;
                org.telegram.ui.Components.ms msVar2 = qyVar2.J1;
                FrameLayout frameLayout2 = qyVar2.I1;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                msVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
