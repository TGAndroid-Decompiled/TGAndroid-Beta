package q5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

public final class b extends View.AccessibilityDelegate {

    public final CastSeekBar f46171a;

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        CastSeekBar castSeekBar = this.f46171a;
        castSeekBar.f3171a.getClass();
        accessibilityEvent.setItemCount(1);
        accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        CastSeekBar castSeekBar = this.f46171a;
        a aVar = castSeekBar.f3171a;
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096 || i10 == 8192) {
                int i11 = CastSeekBar.f3170s;
                aVar.getClass();
                castSeekBar.getProgress();
                aVar.getClass();
                return false;
            }
        }
        return false;
    }
}
