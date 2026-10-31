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
public abstract class h0 {
    public static WeakHashMap f46123a = null;
    public static Field f46124b = null;
    public static boolean f46125c = false;
    public static final u d = new Object();
    public static final w e = new w();

    public static k0 a(View view) {
        if (f46123a == null) {
            f46123a = new WeakHashMap();
        }
        k0 k0Var = (k0) f46123a.get(view);
        if (k0Var == null) {
            k0 k0Var2 = new k0(view);
            f46123a.put(view, k0Var2);
            return k0Var2;
        }
        return k0Var;
    }

    public static j1 b(View view, j1 j1Var) {
        WindowInsets a2;
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            if (i10 >= 30) {
                a2 = e0.a(view, g10);
            } else {
                a2 = x.a(view, g10);
            }
            if (!a2.equals(g10)) {
                return j1.h(view, a2);
            }
        }
        return j1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = g0.d;
            g0 g0Var = (g0) view.getTag(2131296694);
            g0 g0Var2 = g0Var;
            if (g0Var == null) {
                ?? obj = new Object();
                obj.f46117a = null;
                obj.f46118b = null;
                obj.f46119c = null;
                view.setTag(2131296694, obj);
                g0Var2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = g0Var2.f46117a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = g0.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (g0Var2.f46117a == null) {
                                g0Var2.f46117a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = g0.d;
                                View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view2 == null) {
                                    arrayList3.remove(size);
                                } else {
                                    g0Var2.f46117a.put(view2, Boolean.TRUE);
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        g0Var2.f46117a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View a2 = g0Var2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (g0Var2.f46118b == null) {
                        g0Var2.f46118b = new SparseArray();
                    }
                    g0Var2.f46118b.put(keyCode, new WeakReference(a2));
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
            return d0.a(view);
        }
        if (!f46125c) {
            if (f46124b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f46124b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    f46125c = true;
                    return null;
                }
            }
            try {
                Object obj = f46124b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                f46125c = true;
                return null;
            }
        }
        return null;
    }

    public static String[] e(m.s sVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f0.a(sVar);
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
                tag = c0.a(view);
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
                        charSequence = c0.a(view);
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
                    charSequence = c0.a(view);
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

    public static j1 g(View view, j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            WindowInsets b10 = x.b(view, g10);
            if (!b10.equals(g10)) {
                return j1.h(view, b10);
            }
        }
        return j1Var;
    }

    public static g h(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return f0.b(view, gVar);
        }
        u0.k kVar = (u0.k) view.getTag(2131296688);
        n nVar = d;
        if (kVar != null) {
            g a2 = u0.k.a(view, gVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof n) {
                nVar = (n) view;
            }
            return nVar.a(a2);
        }
        if (view instanceof n) {
            nVar = (n) view;
        }
        return nVar.a(gVar);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            d0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
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
            aVar = bVar.f46105b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void k(View view, CharSequence charSequence) {
        boolean z10;
        new v(2131296685, CharSequence.class, 8, 28, 1).d(view, charSequence);
        w wVar = e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = wVar.f46160a;
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
        wVar.f46160a.remove(view);
        view.removeOnAttachStateChangeListener(wVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(wVar);
    }

    public static void l(View view, m mVar) {
        z.i(view, mVar);
    }
}
