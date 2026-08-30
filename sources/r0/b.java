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
    public static final View.AccessibilityDelegate f43083c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate f43084a;
    public final a f43085b;

    public b() {
        this(f43083c);
    }

    public org.telegram.ui.Cells.f1 a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f43084a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new org.telegram.ui.Cells.f1(accessibilityNodeProvider, 18);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f43084a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, s0.e eVar) {
        this.f43084a.onInitializeAccessibilityNodeInfo(view, eVar.f43904a);
    }

    public boolean d(View view, int i10, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i11 = 0; i11 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((s0.c) list.get(i11)).f43900a).getId() != i10; i11++) {
        }
        boolean performAccessibilityAction = this.f43084a.performAccessibilityAction(view, i10, bundle);
        if (!performAccessibilityAction && i10 == 2131296269 && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(2131296683);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                    if (clickableSpan.equals(clickableSpanArr[i13])) {
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
        this.f43084a = accessibilityDelegate;
        this.f43085b = new a(this);
    }
}
