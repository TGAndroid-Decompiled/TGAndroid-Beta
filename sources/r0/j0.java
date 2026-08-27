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

    public static WeakHashMap f46605a = null;

    public static Field f46606b = null;

    public static boolean f46607c = false;
    public static final w d = new w();

    public static final y f46608e = new y();

    public static m0 a(View view) {
        if (f46605a == null) {
            f46605a = new WeakHashMap();
        }
        m0 m0Var = (m0) f46605a.get(view);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(view);
        f46605a.put(view, m0Var2);
        return m0Var2;
    }

    public static m1 b(View view, m1 m1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsG = m1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? g0.a(view, windowInsetsG) : z.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return m1.h(view, windowInsetsA);
            }
        }
        return m1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = i0.d;
        i0 i0Var = (i0) view.getTag(2131296694);
        if (i0Var == null) {
            i0Var = new i0();
            i0Var.f46600a = null;
            i0Var.f46601b = null;
            i0Var.f46602c = null;
            view.setTag(2131296694, i0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = i0Var.f46600a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = i0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (i0Var.f46600a == null) {
                            i0Var.f46600a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = i0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                i0Var.f46600a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    i0Var.f46600a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = i0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (i0Var.f46601b == null) {
                    i0Var.f46601b = new SparseArray();
                }
                i0Var.f46601b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f0.a(view);
        }
        if (f46607c) {
            return null;
        }
        if (f46606b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f46606b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f46607c = true;
                return null;
            }
        }
        try {
            Object obj = f46606b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f46607c = true;
            return null;
        }
    }

    public static String[] e(m.t tVar) {
        return Build.VERSION.SDK_INT >= 31 ? h0.a(tVar) : (String[]) tVar.getTag(2131296689);
    }

    public static m1 f(View view) {
        return Build.VERSION.SDK_INT >= 23 ? c0.a(view) : b0.f(view);
    }

    public static void g(int i10, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i11 >= 28) {
                tag = e0.a(view);
            } else {
                tag = view.getTag(2131296685);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z10 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i11 >= 28) {
                        objA = e0.a(view);
                    } else {
                        Object tag2 = view.getTag(2131296685);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e9) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e9);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i11 >= 28) {
                objA = e0.a(view);
            } else {
                Object tag3 = view.getTag(2131296685);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static m1 h(View view, m1 m1Var) {
        WindowInsets windowInsetsG = m1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = z.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return m1.h(view, windowInsetsB);
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
        if (jVar == null) {
            if (view instanceof p) {
                pVar = (p) view;
            }
            return pVar.a(hVar);
        }
        h hVarA = u0.j.a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (view instanceof p) {
            pVar = (p) view;
        }
        return pVar.a(hVarA);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            f0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void k(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f46569b);
    }

    public static void l(View view, CharSequence charSequence) {
        new x(2131296685, CharSequence.class, 8, 28, 1).d(view, charSequence);
        y yVar = f46608e;
        if (charSequence == null) {
            yVar.f46651a.remove(view);
            view.removeOnAttachStateChangeListener(yVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(yVar);
        } else {
            yVar.f46651a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(yVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(yVar);
            }
        }
    }

    public static void m(View view, o oVar) {
        b0.j(view, oVar);
    }
}
