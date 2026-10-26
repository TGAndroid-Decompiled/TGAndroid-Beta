package s0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Components.p1;
public final class c {
    public static final c e;
    public static final c f47645f;
    public static final c f47646g;
    public static final c h;
    public static final c f47647i;
    public static final c f47648j;
    public final Object f47649a;
    public final int f47650b;
    public final Class f47651c;
    public final p1 d;

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
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        new c(1, (String) null);
        new c(2, (String) null);
        new c(4, (String) null);
        new c(8, (String) null);
        e = new c(16, (String) null);
        new c(32, (String) null);
        new c(64, (String) null);
        new c(128, (String) null);
        new c(f.class, 256);
        new c(f.class, 512);
        new c(g.class, 1024);
        new c(g.class, 2048);
        f47645f = new c(4096, (String) null);
        f47646g = new c(8192, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(k.class, 131072);
        new c(262144, (String) null);
        new c(524288, (String) null);
        new c(1048576, (String) null);
        new c(l.class, 2097152);
        int i10 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, i.class);
        h = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        f47647i = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        if (i10 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new c(accessibilityAction, 16908358, null, null, null);
        if (i10 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new c(accessibilityAction2, 16908359, null, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new c(accessibilityAction3, 16908360, null, null, null);
        if (i10 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new c(accessibilityAction4, 16908361, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        if (i10 >= 24) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction5 = null;
        }
        f47648j = new c(accessibilityAction5, 16908349, null, null, j.class);
        if (i10 >= 26) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction6 = null;
        }
        new c(accessibilityAction6, 16908354, null, null, h.class);
        if (i10 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new c(accessibilityAction7, 16908356, null, null, null);
        if (i10 >= 28) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction8 = null;
        }
        new c(accessibilityAction8, 16908357, null, null, null);
        if (i10 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction9 = null;
        }
        new c(accessibilityAction9, 16908362, null, null, null);
        if (i10 >= 30) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction10 = null;
        }
        new c(accessibilityAction10, 16908372, null, null, null);
        if (i10 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction11 = null;
        }
        new c(accessibilityAction11, 16908373, null, null, null);
        if (i10 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction12 = null;
        }
        new c(accessibilityAction12, 16908374, null, null, null);
        if (i10 >= 32) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction13 = null;
        }
        new c(accessibilityAction13, 16908375, null, null, null);
        if (i10 >= 33) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction14 = null;
        }
        new c(accessibilityAction14, 16908376, null, null, null);
        if (i10 >= 34) {
            accessibilityAction15 = g1.a.e();
        }
        new c(accessibilityAction15, 16908382, null, null, null);
    }

    public c(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f47649a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f47649a;
        Object obj3 = this.f47649a;
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
        Object obj = this.f47649a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String e10 = d.e(this.f47650b);
        if (e10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f47649a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                e10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(e10);
        return sb2.toString();
    }

    public c(Class cls, int i10) {
        this(null, i10, null, null, cls);
    }

    public c(Object obj, int i10, CharSequence charSequence, p1 p1Var, Class cls) {
        this.f47650b = i10;
        this.d = p1Var;
        if (obj == null) {
            this.f47649a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f47649a = obj;
        }
        this.f47651c = cls;
    }
}
