package r0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
public class b {
    public static final View.AccessibilityDelegate f54172c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate f54173a;
    public final a f54174b;

    public b() {
        this(f54172c);
    }

    public org.telegram.ui.Components.m a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f54173a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new org.telegram.ui.Components.m(accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f54173a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, s0.d dVar) {
        this.f54173a.onInitializeAccessibilityNodeInfo(view, dVar.f54612a);
    }

    public boolean d(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((s0.c) list.get(i10)).f54609a).getId() != i7; i10++) {
        }
        boolean performAccessibilityAction = this.f54173a.performAccessibilityAction(view, i7, bundle);
        if (!performAccessibilityAction && i7 == 2131296269 && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(2131296683);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                    if (clickableSpan.equals(clickableSpanArr[i12])) {
                        clickableSpan.onClick(view);
                        return true;
                    }
                }
            }
            return false;
        }
        return performAccessibilityAction;
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f54173a = accessibilityDelegate;
        this.f54174b = new a(this);
    }
}
