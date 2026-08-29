package r0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
public final class a extends View.AccessibilityDelegate {
    public final b f46787a;

    public a(b bVar) {
        this.f46787a = bVar;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f46787a.f46792a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        org.telegram.ui.Components.n a2 = this.f46787a.a(view);
        if (a2 != null) {
            return (AccessibilityNodeProvider) a2.f30787b;
        }
        return null;
    }

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f46787a.b(view, accessibilityEvent);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z10;
        Object tag2;
        Object tag3;
        Object obj;
        int i10;
        s0.c cVar = new s0.c(accessibilityNodeInfo);
        WeakHashMap weakHashMap = j0.f46829a;
        ClickableSpan[] clickableSpanArr = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(e0.c(view));
        } else {
            tag = view.getTag(2131296690);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z11 = true;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.n(z10);
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(e0.b(view));
        } else {
            tag2 = view.getTag(2131296684);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        cVar.k((bool2 == null || !bool2.booleanValue()) ? false : false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            tag3 = e0.a(view);
        } else {
            tag3 = view.getTag(2131296685);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        cVar.m((CharSequence) tag3);
        if (i11 >= 30) {
            obj = g0.b(view);
        } else {
            Object tag4 = view.getTag(2131296691);
            if (CharSequence.class.isInstance(tag4)) {
                obj = tag4;
            } else {
                obj = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (i11 >= 30) {
            g0.f.u(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f46787a.c(view, cVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i11 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(2131296683);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131296269);
                SparseArray sparseArray2 = (SparseArray) view.getTag(2131296683);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(2131296683, sparseArray2);
                }
                for (int i14 = 0; i14 < clickableSpanArr.length; i14++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i14];
                    int i15 = 0;
                    while (true) {
                        if (i15 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                i10 = sparseArray2.keyAt(i15);
                                break;
                            }
                            i15++;
                        } else {
                            i10 = s0.c.f47481c;
                            s0.c.f47481c = i10 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i10, new WeakReference(clickableSpanArr[i14]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                    Spanned spanned = (Spanned) text;
                    cVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    cVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    cVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    cVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                }
            }
        }
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            cVar.b((s0.b) list.get(i16));
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f46787a.f46792a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f46787a.f46792a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f46787a.d(view, i10, bundle);
    }

    @Override
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f46787a.f46792a.sendAccessibilityEvent(view, i10);
    }

    @Override
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f46787a.f46792a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
