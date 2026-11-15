package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class xc extends org.telegram.ui.Components.fh0 {
    public final int f53170r;
    public final Object f53171s;

    public xc(int i7, Context context, Object obj) {
        super(context);
        this.f53170r = i7;
        this.f53171s = obj;
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f53170r) {
            case 0:
                super.invalidate(i7, i10, i11, i12);
                ((ad) this.f53171s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
            case 3:
                super.invalidate(i7, i10, i11, i12);
                ((c50) this.f53171s).f46020e.invalidate();
                return;
            case 4:
                super.invalidate(i7, i10, i11, i12);
                ((oc0) this.f53171s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f53170r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.ep) this.f53171s).H1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754751, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754750, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f53170r) {
            case 0:
                super.invalidate();
                ((ad) this.f53171s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.k10) this.f53171s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((c50) this.f53171s).f46020e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((oc0) this.f53171s).h.invalidate();
                return;
        }
    }
}
