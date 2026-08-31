package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class zw extends FragmentContextView {
    public final int K0;
    public final py L0;

    public zw(py pyVar, Context context, py pyVar2, int i10) {
        super(context, pyVar2, true);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = pyVar;
                super(context, pyVar2, false);
                return;
            default:
                this.L0 = pyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        switch (this.K0) {
            case 0:
                py pyVar = this.L0;
                org.telegram.ui.Components.ls lsVar = pyVar.G1;
                FrameLayout frameLayout = pyVar.D1;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                lsVar.i(frameLayout, z4, true);
                return;
            default:
                py pyVar2 = this.L0;
                org.telegram.ui.Components.ls lsVar2 = pyVar2.G1;
                FrameLayout frameLayout2 = pyVar2.F1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lsVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
