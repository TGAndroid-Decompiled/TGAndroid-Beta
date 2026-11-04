package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class xc extends org.telegram.ui.Components.fh0 {
    public final int f51907r;
    public final Object f51908s;

    public xc(int i3, Context context, Object obj) {
        super(context);
        this.f51907r = i3;
        this.f51908s = obj;
    }

    @Override
    public void invalidate(int i3, int i10, int i11, int i12) {
        switch (this.f51907r) {
            case 0:
                super.invalidate(i3, i10, i11, i12);
                ((ad) this.f51908s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i3, i10, i11, i12);
                return;
            case 3:
                super.invalidate(i3, i10, i11, i12);
                ((y40) this.f51908s).f52183e.invalidate();
                return;
            case 4:
                super.invalidate(i3, i10, i11, i12);
                ((nc0) this.f51908s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f51907r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.vo) this.f51908s).E1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754751, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.bd.M0(2131754750, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f51907r) {
            case 0:
                super.invalidate();
                ((ad) this.f51908s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.d10) this.f51908s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((y40) this.f51908s).f52183e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((nc0) this.f51908s).h.invalidate();
                return;
        }
    }
}
