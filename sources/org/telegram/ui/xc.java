package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class xc extends org.telegram.ui.Components.rh0 {
    public final int f53822r;
    public final Object f53823s;

    public xc(int i7, Context context, Object obj) {
        super(context);
        this.f53822r = i7;
        this.f53823s = obj;
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f53822r) {
            case 0:
                super.invalidate(i7, i10, i11, i12);
                ((ad) this.f53823s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
            case 3:
                super.invalidate(i7, i10, i11, i12);
                ((f50) this.f53823s).f47592e.invalidate();
                return;
            case 4:
                super.invalidate(i7, i10, i11, i12);
                ((pc0) this.f53823s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f53822r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.np) this.f53823s).H1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754750, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754749, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f53822r) {
            case 0:
                super.invalidate();
                ((ad) this.f53823s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.u10) this.f53823s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((f50) this.f53823s).f47592e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((pc0) this.f53823s).h.invalidate();
                return;
        }
    }
}
