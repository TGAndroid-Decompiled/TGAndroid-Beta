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
    public final b f54064a;

    public a(b bVar) {
        this.f54064a = bVar;
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f54064a.f54068a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        org.telegram.ui.Components.n a10 = this.f54064a.a(view);
        if (a10 != null) {
            return (AccessibilityNodeProvider) a10.f36142a;
        }
        return null;
    }

    @Override
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f54064a.b(view, accessibilityEvent);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z9;
        Object tag2;
        Object tag3;
        Object obj;
        int i7;
        s0.d dVar = new s0.d(accessibilityNodeInfo);
        WeakHashMap weakHashMap = i0.f54097a;
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
        int i10 = 0;
        boolean z10 = true;
        if (bool != null && bool.booleanValue()) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.n(z9);
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
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            tag3 = d0.a(view);
        } else {
            tag3 = view.getTag(2131296685);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        dVar.m((CharSequence) tag3);
        if (i11 >= 30) {
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
        if (i11 >= 30) {
            g0.f.u(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f54064a.c(view, dVar);
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
                int i14 = 0;
                while (i14 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i14];
                    int i15 = i10;
                    while (true) {
                        if (i15 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                i7 = sparseArray2.keyAt(i15);
                                break;
                            }
                            i15++;
                        } else {
                            i7 = s0.d.f54507c;
                            s0.d.f54507c = i7 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i7, new WeakReference(clickableSpanArr[i14]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                    Spanned spanned = (Spanned) text;
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    dVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
                    i14++;
                    i10 = 0;
                }
            }
        }
        List list = (List) view.getTag(2131296682);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            dVar.b((s0.c) list.get(i16));
        }
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f54064a.f54068a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f54064a.f54068a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(View view, int i7, Bundle bundle) {
        return this.f54064a.d(view, i7, bundle);
    }

    @Override
    public final void sendAccessibilityEvent(View view, int i7) {
        this.f54064a.f54068a.sendAccessibilityEvent(view, i7);
    }

    @Override
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f54064a.f54068a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
