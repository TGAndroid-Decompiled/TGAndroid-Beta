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
public abstract class j0 {
    public static WeakHashMap f46469a = null;
    public static Field f46470b = null;
    public static boolean f46471c = false;
    public static final w d = new Object();
    public static final y f46472e = new y();

    public static m0 a(View view) {
        if (f46469a == null) {
            f46469a = new WeakHashMap();
        }
        m0 m0Var = (m0) f46469a.get(view);
        if (m0Var == null) {
            m0 m0Var2 = new m0(view);
            f46469a.put(view, m0Var2);
            return m0Var2;
        }
        return m0Var;
    }

    public static m1 b(View view, m1 m1Var) {
        WindowInsets a2;
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            if (i10 >= 30) {
                a2 = g0.a(view, g10);
            } else {
                a2 = z.a(view, g10);
            }
            if (!a2.equals(g10)) {
                return m1.h(view, a2);
            }
        }
        return m1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = i0.d;
            i0 i0Var = (i0) view.getTag(2131296694);
            i0 i0Var2 = i0Var;
            if (i0Var == null) {
                ?? obj = new Object();
                obj.f46464a = null;
                obj.f46465b = null;
                obj.f46466c = null;
                view.setTag(2131296694, obj);
                i0Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = i0Var2.f46464a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = i0.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (i0Var2.f46464a == null) {
                                i0Var2.f46464a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = i0.d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    i0Var2.f46464a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        i0Var2.f46464a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a2 = i0Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (i0Var2.f46465b == null) {
                        i0Var2.f46465b = new SparseArray();
                    }
                    i0Var2.f46465b.put(keyCode, new WeakReference(a2));
                }
            }
            if (a2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f0.a(view);
        }
        if (!f46471c) {
            if (f46470b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f46470b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f46471c = true;
                    return null;
                }
            }
            try {
                Object obj = f46470b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f46471c = true;
                return null;
            }
        }
        return null;
    }

    public static String[] e(m.s sVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h0.a(sVar);
        }
        return (String[]) sVar.getTag(2131296689);
    }

    public static m1 f(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c0.a(view);
        }
        return b0.f(view);
    }

    public static void g(int i10, View view) {
        Object tag;
        boolean z4;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i11 >= 28) {
                tag = e0.a(view);
            } else {
                tag = view.getTag(2131296685);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i12 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z4) {
                if (i10 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i10);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    List<CharSequence> text = obtain.getText();
                    if (i11 >= 28) {
                        charSequence = e0.a(view);
                    } else {
                        Object tag2 = view.getTag(2131296685);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z4) {
                i12 = 2048;
            }
            obtain2.setEventType(i12);
            obtain2.setContentChangeTypes(i10);
            if (z4) {
                List<CharSequence> text2 = obtain2.getText();
                if (i11 >= 28) {
                    charSequence = e0.a(view);
                } else {
                    Object tag3 = view.getTag(2131296685);
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

    public static m1 h(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            WindowInsets b10 = z.b(view, g10);
            if (!b10.equals(g10)) {
                return m1.h(view, b10);
            }
        }
        return m1Var;
    }

    public static h i(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return h0.b(view, hVar);
        }
        u0.j jVar = (u0.j) view.getTag(2131296688);
        p pVar = d;
        if (jVar != null) {
            h a2 = u0.j.a(view, hVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof p) {
                pVar = (p) view;
            }
            return pVar.a(a2);
        }
        if (view instanceof p) {
            pVar = (p) view;
        }
        return pVar.a(hVar);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            f0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void k(View view, b bVar) {
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
            aVar = bVar.f46433b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void l(View view, CharSequence charSequence) {
        boolean z4;
        new x(2131296685, CharSequence.class, 8, 28, 1).d(view, charSequence);
        y yVar = f46472e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = yVar.f46515a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z4));
            view.addOnAttachStateChangeListener(yVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(yVar);
                return;
            }
            return;
        }
        yVar.f46515a.remove(view);
        view.removeOnAttachStateChangeListener(yVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(yVar);
    }

    public static void m(View view, o oVar) {
        b0.j(view, oVar);
    }
}
