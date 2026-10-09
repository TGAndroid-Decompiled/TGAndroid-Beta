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
    public static WeakHashMap f46764a = null;
    public static Field f46765b = null;
    public static boolean f46766c = false;
    public static final v d = new Object();
    public static final x f46767e = new x();

    public static l0 a(View view) {
        if (f46764a == null) {
            f46764a = new WeakHashMap();
        }
        l0 l0Var = (l0) f46764a.get(view);
        if (l0Var == null) {
            l0 l0Var2 = new l0(view);
            f46764a.put(view, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public static k1 b(View view, k1 k1Var) {
        WindowInsets a2;
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            if (i10 >= 30) {
                a2 = f0.a(view, g10);
            } else {
                a2 = y.a(view, g10);
            }
            if (!a2.equals(g10)) {
                return k1.h(view, a2);
            }
        }
        return k1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = h0.d;
            h0 h0Var = (h0) view.getTag(2131296694);
            h0 h0Var2 = h0Var;
            if (h0Var == null) {
                ?? obj = new Object();
                obj.f46758a = null;
                obj.f46759b = null;
                obj.f46760c = null;
                view.setTag(2131296694, obj);
                h0Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = h0Var2.f46758a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = h0.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (h0Var2.f46758a == null) {
                                h0Var2.f46758a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = h0.d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    h0Var2.f46758a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        h0Var2.f46758a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a2 = h0Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (h0Var2.f46759b == null) {
                        h0Var2.f46759b = new SparseArray();
                    }
                    h0Var2.f46759b.put(keyCode, new WeakReference(a2));
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
            return e0.a(view);
        }
        if (!f46766c) {
            if (f46765b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f46765b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f46766c = true;
                    return null;
                }
            }
            try {
                Object obj = f46765b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f46766c = true;
                return null;
            }
        }
        return null;
    }

    public static String[] e(m.s sVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.a(sVar);
        }
        return (String[]) sVar.getTag(2131296689);
    }

    public static void f(int i10, View view) {
        Object tag;
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i11 >= 28) {
                tag = d0.a(view);
            } else {
                tag = view.getTag(2131296685);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i12 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z10) {
                if (i10 == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i10);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    List<CharSequence> text = obtain.getText();
                    if (i11 >= 28) {
                        charSequence = d0.a(view);
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
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z10) {
                i12 = 2048;
            }
            obtain2.setEventType(i12);
            obtain2.setContentChangeTypes(i10);
            if (z10) {
                List<CharSequence> text2 = obtain2.getText();
                if (i11 >= 28) {
                    charSequence = d0.a(view);
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

    public static k1 g(View view, k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            WindowInsets b10 = y.b(view, g10);
            if (!b10.equals(g10)) {
                return k1.h(view, b10);
            }
        }
        return k1Var;
    }

    public static g h(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.b(view, gVar);
        }
        u0.j jVar = (u0.j) view.getTag(2131296688);
        o oVar = d;
        if (jVar != null) {
            g a2 = u0.j.a(view, gVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof o) {
                oVar = (o) view;
            }
            return oVar.a(a2);
        }
        if (view instanceof o) {
            oVar = (o) view;
        }
        return oVar.a(gVar);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
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
            aVar = bVar.f46730b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void k(View view, CharSequence charSequence) {
        boolean z10;
        new w(2131296685, CharSequence.class, 8, 28, 1).d(view, charSequence);
        x xVar = f46767e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = xVar.f46809a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(xVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(xVar);
                return;
            }
            return;
        }
        xVar.f46809a.remove(view);
        view.removeOnAttachStateChangeListener(xVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(xVar);
    }

    public static void l(View view, n nVar) {
        a0.i(view, nVar);
    }
}
