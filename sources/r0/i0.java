package r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public abstract class i0 {
    public static WeakHashMap f56285a = null;
    public static Field f56286b = null;
    public static boolean f56287c = false;
    public static final u d = new Object();
    public static final w f56288e = new w();

    public static l0 a(View view) {
        if (f56285a == null) {
            f56285a = new WeakHashMap();
        }
        l0 l0Var = (l0) f56285a.get(view);
        if (l0Var == null) {
            l0 l0Var2 = new l0(view);
            f56285a.put(view, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public static l1 b(View view, l1 l1Var) {
        WindowInsets a10;
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            if (i7 >= 30) {
                a10 = f0.a(view, g10);
            } else {
                a10 = y.a(view, g10);
            }
            if (!a10.equals(g10)) {
                return l1.h(view, a10);
            }
        }
        return l1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = h0.d;
            h0 h0Var = (h0) view.getTag(2131296696);
            h0 h0Var2 = h0Var;
            if (h0Var == null) {
                ?? obj = new Object();
                obj.f56281a = null;
                obj.f56282b = null;
                obj.f56283c = null;
                view.setTag(2131296696, obj);
                h0Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = h0Var2.f56281a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = h0.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (h0Var2.f56281a == null) {
                                h0Var2.f56281a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = h0.d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    h0Var2.f56281a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        h0Var2.f56281a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a10 = h0Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (h0Var2.f56282b == null) {
                        h0Var2.f56282b = new SparseArray();
                    }
                    h0Var2.f56282b.put(keyCode, new WeakReference(a10));
                }
            }
            if (a10 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e0.a(view);
        }
        if (!f56287c) {
            if (f56286b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f56286b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f56287c = true;
                    return null;
                }
            }
            try {
                Object obj = f56286b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f56287c = true;
                return null;
            }
        }
        return null;
    }

    public static String[] e(m.s sVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.a(sVar);
        }
        return (String[]) sVar.getTag(2131296691);
    }

    public static void f(int i7, View view) {
        Object tag;
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i10 >= 28) {
                tag = d0.a(view);
            } else {
                tag = view.getTag(2131296687);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z10) {
                if (i7 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i7);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    List<CharSequence> text = obtain.getText();
                    if (i10 >= 28) {
                        charSequence = d0.a(view);
                    } else {
                        Object tag2 = view.getTag(2131296687);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z10) {
                i11 = 2048;
            }
            obtain2.setEventType(i11);
            obtain2.setContentChangeTypes(i7);
            if (z10) {
                List<CharSequence> text2 = obtain2.getText();
                if (i10 >= 28) {
                    charSequence = d0.a(view);
                } else {
                    Object tag3 = view.getTag(2131296687);
                    if (CharSequence.class.isInstance(tag3)) {
                        charSequence = tag3;
                    }
                }
                text2.add(charSequence);
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static l1 g(View view, l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            WindowInsets b10 = y.b(view, g10);
            if (!b10.equals(g10)) {
                return l1.h(view, b10);
            }
        }
        return l1Var;
    }

    public static g h(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.b(view, gVar);
        }
        u0.j jVar = (u0.j) view.getTag(2131296690);
        n nVar = d;
        if (jVar != null) {
            g a10 = u0.j.a(view, gVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof n) {
                nVar = (n) view;
            }
            return nVar.a(a10);
        }
        if (view instanceof n) {
            nVar = (n) view;
        }
        return nVar.a(gVar);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.b(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    public static void j(View view, b bVar) {
        a aVar;
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f56258b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void k(View view, CharSequence charSequence) {
        boolean z10;
        new v(2131296687, CharSequence.class, 8, 28, 1).d(view, charSequence);
        w wVar = f56288e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = wVar.f56328a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(wVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(wVar);
                return;
            }
            return;
        }
        wVar.f56328a.remove(view);
        view.removeOnAttachStateChangeListener(wVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(wVar);
    }

    public static void l(View view, m mVar) {
        a0.i(view, mVar);
    }
}
