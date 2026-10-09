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
    public final b f46727a;

    public a(b bVar) {
        this.f46727a = bVar;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f46727a.f46731a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        l2.f a2 = this.f46727a.a(view);
        if (a2 != null) {
            return (AccessibilityNodeProvider) a2.f15331b;
        }
        return null;
    }

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f46727a.b(view, accessibilityEvent);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z10;
        Object tag2;
        Object tag3;
        Object obj;
        int i10;
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        WeakHashMap weakHashMap = i0.f46766a;
        ClickableSpan[] clickableSpanArr = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(d0.c(view));
        } else {
            tag = view.getTag(2131296690);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i11 = 0;
        boolean z11 = true;
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.n(z10);
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(d0.b(view));
        } else {
            tag2 = view.getTag(2131296684);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        dVar.k((bool2 == null || !bool2.booleanValue()) ? false : false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            tag3 = d0.a(view);
        } else {
            tag3 = view.getTag(2131296685);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        dVar.m((CharSequence) tag3);
        if (i12 >= 30) {
            obj = f0.b(view);
        } else {
            Object tag4 = view.getTag(2131296691);
            if (CharSequence.class.isInstance(tag4)) {
                obj = tag4;
            } else {
                obj = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (i12 >= 30) {
            g0.f.u(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f46727a.c(view, dVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i12 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(2131296683);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                        arrayList.add(Integer.valueOf(i13));
                    }
                }
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
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
                int i15 = 0;
                while (i15 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i15];
                    int i16 = i11;
                    while (true) {
                        if (i16 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                i10 = sparseArray2.keyAt(i16);
                                break;
                            }
                            i16++;
                        } else {
                            i10 = s0.d.f47586c;
                            s0.d.f47586c = i10 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                    Spanned spanned = (Spanned) text;
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                    i15++;
                    i11 = 0;
                }
            }
        }
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            dVar.b((s0.c) list.get(i17));
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f46727a.f46731a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f46727a.f46731a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f46727a.d(view, i10, bundle);
    }

    @Override
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f46727a.f46731a.sendAccessibilityEvent(view, i10);
    }

    @Override
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f46727a.f46731a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
