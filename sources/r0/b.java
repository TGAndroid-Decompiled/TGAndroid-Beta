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
import org.telegram.ui.Components.nh;
public class b {
    public static final View.AccessibilityDelegate f53985c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate f53986a;
    public final a f53987b;

    public b() {
        this(f53985c);
    }

    public nh a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f53986a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new nh(accessibilityNodeProvider, 17);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f53986a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, s0.d dVar) {
        this.f53986a.onInitializeAccessibilityNodeInfo(view, dVar.f54570a);
    }

    public boolean d(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((s0.c) list.get(i10)).f54567a).getId() != i3; i10++) {
        }
        boolean performAccessibilityAction = this.f53986a.performAccessibilityAction(view, i3, bundle);
        if (!performAccessibilityAction && i3 == 2131296269 && bundle != null) {
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
        this.f53986a = accessibilityDelegate;
        this.f53987b = new a(this);
    }
}
