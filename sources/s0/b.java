package s0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
public final class b {
    public static final b f45861c;
    public static final b d;
    public static final b e;
    public static final b f45862f;
    public static final b f45863g;
    public static final b h;
    public final Object f45864a;
    public final int f45865b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        new b(null, 1, null, null);
        new b(null, 2, null, null);
        new b(null, 4, null, null);
        new b(null, 8, null, null);
        f45861c = new b(null, 16, null, null);
        new b(null, 32, null, null);
        new b(null, 64, null, null);
        new b(null, 128, null, null);
        new b(null, 256, null, e.class);
        new b(null, 512, null, e.class);
        new b(null, 1024, null, f.class);
        new b(null, 2048, null, f.class);
        d = new b(null, 4096, null, null);
        e = new b(null, 8192, null, null);
        new b(null, 16384, null, null);
        new b(null, 32768, null, null);
        new b(null, 65536, null, null);
        new b(null, 131072, null, j.class);
        new b(null, 262144, null, null);
        new b(null, 524288, null, null);
        new b(null, 1048576, null, null);
        new b(null, 2097152, null, k.class);
        int i10 = Build.VERSION.SDK_INT;
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, h.class);
        f45862f = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null);
        f45863g = new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null);
        if (i10 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new b(accessibilityAction, 16908358, null, null);
        if (i10 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new b(accessibilityAction2, 16908359, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new b(accessibilityAction3, 16908360, null, null);
        if (i10 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new b(accessibilityAction4, 16908361, null, null);
        new b(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null);
        if (i10 >= 24) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction5 = null;
        }
        h = new b(accessibilityAction5, 16908349, null, i.class);
        if (i10 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new b(accessibilityAction6, 16908354, null, g.class);
        if (i10 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new b(accessibilityAction7, 16908356, null, null);
        if (i10 >= 28) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction8 = null;
        }
        new b(accessibilityAction8, 16908357, null, null);
        if (i10 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new b(accessibilityAction9, 16908362, null, null);
        if (i10 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction10 = null;
        }
        new b(accessibilityAction10, 16908372, null, null);
        if (i10 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new b(accessibilityAction11, 16908373, null, null);
        if (i10 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction12 = null;
        }
        new b(accessibilityAction12, 16908374, null, null);
        if (i10 >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction13 = null;
        }
        new b(accessibilityAction13, 16908375, null, null);
        if (i10 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        new b(accessibilityAction14, 16908376, null, null);
        if (i10 >= 34) {
            accessibilityAction15 = g1.a.e();
        } else {
            accessibilityAction15 = null;
        }
        new b(accessibilityAction15, 16908382, null, null);
    }

    public b(Object obj, int i10, CharSequence charSequence, Class cls) {
        this.f45865b = i10;
        if (obj == null) {
            this.f45864a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f45864a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f45864a;
        Object obj3 = this.f45864a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f45864a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String e7 = c.e(this.f45865b);
        if (e7.equals("ACTION_UNKNOWN")) {
            Object obj = this.f45864a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                e7 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(e7);
        return sb2.toString();
    }
}
