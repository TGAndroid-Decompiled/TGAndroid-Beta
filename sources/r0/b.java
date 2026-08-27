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

    public static final View.AccessibilityDelegate f46567c = new View.AccessibilityDelegate();

    public final View.AccessibilityDelegate f46568a;

    public final a f46569b;

    public b() {
        this(f46567c);
    }

    public m5.o a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f46568a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new m5.o(accessibilityNodeProvider, 21);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f46568a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, s0.c cVar) {
        this.f46568a.onInitializeAccessibilityNodeInfo(view, cVar.f47656a);
    }

    public boolean d(View view, int i10, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i11 = 0; i11 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((s0.b) list.get(i11)).f47653a).getId() != i10; i11++) {
        }
        boolean zPerformAccessibilityAction = this.f46568a.performAccessibilityAction(view, i10, bundle);
        if (zPerformAccessibilityAction || i10 != 2131296269 || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(2131296683);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f46568a = accessibilityDelegate;
        this.f46569b = new a(this);
    }
}
