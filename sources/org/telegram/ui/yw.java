package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class yw extends FragmentContextView {
    public final int K0;
    public final oy L0;

    public yw(oy oyVar, Context context, oy oyVar2, int i10) {
        super(context, oyVar2, true);
        this.K0 = i10;
        switch (i10) {
            case 1:
                this.L0 = oyVar;
                super(context, oyVar2, false);
                return;
            default:
                this.L0 = oyVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        switch (this.K0) {
            case 0:
                oy oyVar = this.L0;
                org.telegram.ui.Components.js jsVar = oyVar.G1;
                FrameLayout frameLayout = oyVar.D1;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jsVar.i(frameLayout, z4, true);
                return;
            default:
                oy oyVar2 = this.L0;
                org.telegram.ui.Components.js jsVar2 = oyVar2.G1;
                FrameLayout frameLayout2 = oyVar2.F1;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jsVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
