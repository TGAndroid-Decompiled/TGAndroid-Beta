package w7;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class v6 {
    public static boolean f52718a = false;
    public static Method f52719b = null;
    public static boolean f52720c = false;
    public static Field d;

    public static boolean a(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = r0.h0.f46123a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = r0.g0.d;
            r0.g0 g0Var = (r0.g0) view.getTag(2131296694);
            WeakReference weakReference = null;
            r0.g0 g0Var2 = g0Var;
            if (g0Var == null) {
                ?? obj = new Object();
                obj.f46117a = null;
                obj.f46118b = null;
                obj.f46119c = null;
                view.setTag(2131296694, obj);
                g0Var2 = obj;
            }
            WeakReference weakReference2 = g0Var2.f46119c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                g0Var2.f46119c = new WeakReference(keyEvent);
                if (g0Var2.f46118b == null) {
                    g0Var2.f46118b = new SparseArray();
                }
                SparseArray sparseArray = g0Var2.f46118b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131296695)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    throw new ClassCastException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean b(r0.i r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: w7.v6.b(r0.i, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
