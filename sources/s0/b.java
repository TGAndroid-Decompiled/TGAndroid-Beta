package s0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
public final class b {
    public static final b f47475c;
    public static final b d;
    public static final b f47476e;
    public static final b f47477f;
    public static final b f47478g;
    public static final b h;
    public final Object f47479a;
    public final int f47480b;

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
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        new b(null, 1, null, null);
        new b(null, 2, null, null);
        new b(null, 4, null, null);
        new b(null, 8, null, null);
        f47475c = new b(null, 16, null, null);
        new b(null, 32, null, null);
        new b(null, 64, null, null);
        new b(null, 128, null, null);
        new b(null, 256, null, e.class);
        new b(null, 512, null, e.class);
        new b(null, 1024, null, f.class);
        new b(null, 2048, null, f.class);
        d = new b(null, 4096, null, null);
        f47476e = new b(null, 8192, null, null);
        new b(null, 16384, null, null);
        new b(null, 32768, null, null);
        new b(null, 65536, null, null);
        new b(null, 131072, null, j.class);
        new b(null, 262144, null, null);
        new b(null, 524288, null, null);
        new b(null, 1048576, null, null);
        new b(null, 2097152, null, k.class);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new b(accessibilityAction, 16908342, null, null);
        if (i10 >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new b(accessibilityAction2, 16908343, null, h.class);
        if (i10 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f47477f = new b(accessibilityAction3, 16908344, null, null);
        if (i10 >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        new b(accessibilityAction4, 16908345, null, null);
        if (i10 >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        f47478g = new b(accessibilityAction5, 16908346, null, null);
        if (i10 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new b(accessibilityAction6, 16908347, null, null);
        if (i10 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new b(accessibilityAction7, 16908358, null, null);
        if (i10 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new b(accessibilityAction8, 16908359, null, null);
        if (i10 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new b(accessibilityAction9, 16908360, null, null);
        if (i10 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new b(accessibilityAction10, 16908361, null, null);
        if (i10 >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new b(accessibilityAction11, 16908348, null, null);
        if (i10 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        h = new b(accessibilityAction12, 16908349, null, i.class);
        if (i10 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new b(accessibilityAction13, 16908354, null, g.class);
        if (i10 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new b(accessibilityAction14, 16908356, null, null);
        if (i10 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new b(accessibilityAction15, 16908357, null, null);
        if (i10 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new b(accessibilityAction16, 16908362, null, null);
        if (i10 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction17 = null;
        }
        new b(accessibilityAction17, 16908372, null, null);
        if (i10 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new b(accessibilityAction18, 16908373, null, null);
        if (i10 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction19 = null;
        }
        new b(accessibilityAction19, 16908374, null, null);
        if (i10 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction20 = null;
        }
        new b(accessibilityAction20, 16908375, null, null);
        if (i10 >= 33) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction21 = null;
        }
        new b(accessibilityAction21, 16908376, null, null);
        if (i10 >= 34) {
            accessibilityAction22 = g1.a.e();
        } else {
            accessibilityAction22 = null;
        }
        new b(accessibilityAction22, 16908382, null, null);
    }

    public b(Object obj, int i10, CharSequence charSequence, Class cls) {
        this.f47480b = i10;
        if (obj == null) {
            this.f47479a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f47479a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f47479a;
        Object obj3 = this.f47479a;
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
        Object obj = this.f47479a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String e10 = c.e(this.f47480b);
        if (e10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f47479a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                e10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(e10);
        return sb2.toString();
    }
}
