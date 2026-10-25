package r0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.h2;
import org.telegram.ui.Components.p1;
import org.telegram.ui.Components.wz;
public class b {
    public static final View.AccessibilityDelegate f47072c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate f47073a;
    public final a f47074b;

    public b() {
        this(f47072c);
    }

    public jg.i a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f47073a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new jg.i(accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f47073a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, s0.d dVar) {
        this.f47073a.onInitializeAccessibilityNodeInfo(view, dVar.f47650a);
    }

    public boolean d(View view, int i10, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z10;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i11 >= list.size()) {
                break;
            }
            s0.c cVar = (s0.c) list.get(i11);
            if (cVar.a() == i10) {
                Class cls = cVar.f47648c;
                p1 p1Var = cVar.d;
                if (p1Var != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    wz wzVar = (wz) p1Var.f31405b;
                    h2 h2Var = (h2) p1Var.f31406c;
                    if (!wzVar.f34564x) {
                        wzVar.setRefreshing(true);
                        h2Var.run();
                    }
                    z10 = true;
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = this.f47073a.performAccessibilityAction(view, i10, bundle);
        }
        if (!z10 && i10 == 2131296269 && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(2131296683);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i13 = 0;
                while (true) {
                    if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i13])) {
                        clickableSpan.onClick(view);
                        z11 = true;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            return z11;
        }
        return z10;
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f47073a = accessibilityDelegate;
        this.f47074b = new a(this);
    }
}
