package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class yc extends org.telegram.ui.Components.dh0 {
    public final int f52077r;
    public final Object f52078s;

    public yc(int i7, Context context, Object obj) {
        super(context);
        this.f52077r = i7;
        this.f52078s = obj;
    }

    @Override
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.f52077r) {
            case 0:
                super.invalidate(i7, i10, i11, i12);
                ((bd) this.f52078s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i7, i10, i11, i12);
                return;
            case 3:
                super.invalidate(i7, i10, i11, i12);
                ((f50) this.f52078s).f45587e.invalidate();
                return;
            case 4:
                super.invalidate(i7, i10, i11, i12);
                ((rc0) this.f52078s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f52077r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.vo) this.f52078s).D1) {
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
        switch (this.f52077r) {
            case 0:
                super.invalidate();
                ((bd) this.f52078s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.h10) this.f52078s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((f50) this.f52078s).f45587e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((rc0) this.f52078s).h.invalidate();
                return;
        }
    }
}
