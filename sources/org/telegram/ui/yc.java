package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class yc extends org.telegram.ui.Components.ch0 {
    public final int f52193r;
    public final Object f52194s;

    public yc(int i7, Context context, Object obj) {
        super(context);
        this.f52193r = i7;
        this.f52194s = obj;
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f52193r) {
            case 0:
                super.invalidate(i7, i10, i11, i12);
                ((bd) this.f52194s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
            case 3:
                super.invalidate(i7, i10, i11, i12);
                ((d50) this.f52194s).f44954e.invalidate();
                return;
            case 4:
                super.invalidate(i7, i10, i11, i12);
                ((pc0) this.f52194s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f52193r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.vo) this.f52194s).D1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754751, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.id.M0(2131754750, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f52193r) {
            case 0:
                super.invalidate();
                ((bd) this.f52194s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.h10) this.f52194s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((d50) this.f52194s).f44954e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((pc0) this.f52194s).h.invalidate();
                return;
        }
    }
}
