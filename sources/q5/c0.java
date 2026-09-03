package q5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.t0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g5.o0;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.q70;
import org.telegram.ui.cl0;
import qh.l1;
import wh.d1;
import wh.d4;
import wh.e1;
import wh.f3;
import wh.h0;
import wh.i0;
import wh.o3;
import wh.p3;
import wh.q3;
import wh.v3;
import wh.v5;
public final class c0 implements com.google.android.gms.common.api.internal.s, q9.a, oe.b, t5.a, u4.p, p3, d1, Continuation, xd.d, a3.b {
    public final int f44557a;
    public Object f44558b;
    public Object f44559c;

    public c0(int i10, Object obj, Object obj2) {
        this.f44557a = i10;
        this.f44559c = obj;
        this.f44558b = obj2;
    }

    public static String K(c0 c0Var) {
        Collection<String> collection = (Collection) c0Var.f44559c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) c0Var.f44558b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z4 = true;
                for (String str2 : collection) {
                    u5.a.b(str2);
                    if (!z4) {
                        sb.append(",");
                    }
                    if (!u5.a.f48383a.matcher(str2).matches()) {
                        StringBuilder sb2 = new StringBuilder(str2.length());
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            char charAt = str2.charAt(i10);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    z4 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    public static String f(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    @Override
    public void A() {
        wh.q qVar = (wh.q) this.f44558b;
        if (qVar.getCurrentItemTop() != qVar.F) {
            qVar.f26590b.X1(qVar, 0);
        }
        qVar.a0();
        wh.q.J(qVar);
    }

    @Override
    public o0 B(u4.l lVar, u4.i iVar) {
        return new f7.b(29, ((u4.p) this.f44559c).B(lVar, iVar), (List) this.f44558b);
    }

    @Override
    public void C(int i10) {
        wh.q qVar = (wh.q) this.f44558b;
        qVar.f26590b.X1(qVar, i10);
        qVar.a0();
        wh.q.J(qVar);
    }

    @Override
    public boolean D(e1 e1Var) {
        return false;
    }

    @Override
    public void E() {
        ((xd.i) this.f44559c).e((xd.j) this.f44558b);
    }

    @Override
    public void F(v5 v5Var, String str) {
        wh.q qVar = (wh.q) this.f44558b;
        if (qVar.v == null) {
            g6 g6Var = (g6) this.f44559c;
            qVar.v = new r3(new org.telegram.ui.web.m(11, this, g6Var), g6Var);
        }
        qVar.v.f(v5Var, str);
    }

    @Override
    public o0 G() {
        return new f7.b(29, ((u4.p) this.f44559c).G(), (List) this.f44558b);
    }

    @Override
    public void H(CharSequence charSequence) {
        ((h0) this.f44559c).B(charSequence);
    }

    public r3.k I(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f44558b)) {
            if (!((AtomicBoolean) this.f44558b).get()) {
                try {
                    a2 = ((cl0) this.f44559c).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f44558b).set(true);
                } catch (Exception e6) {
                    throw new RuntimeException("Error instantiating extension", e6);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (r3.k) a2.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    @Override
    public void J() {
        v3 v3Var = ((wh.q) this.f44558b).f49967s;
        if (v3Var != null) {
            int i10 = 0;
            v3Var.e(false, true);
            int i11 = v3Var.V;
            if (i11 != 2) {
                i10 = i11;
            }
            v3Var.f(i10, true);
        }
    }

    @Override
    public void O(Editable editable) {
        ((i0) this.f44558b).i();
        ((h0) this.f44559c).Q();
    }

    @Override
    public q70 P(View view) {
        wh.q qVar = (wh.q) this.f44558b;
        q70 q70Var = new q70(qVar, (g6) this.f44559c, view, false, false, true);
        qVar.E = q70Var;
        return q70Var;
    }

    @Override
    public void S() {
        wh.q qVar = (wh.q) this.f44558b;
        qVar.X();
        qVar.Y();
    }

    @Override
    public boolean T(boolean z4) {
        return false;
    }

    @Override
    public void a() {
        ((xd.i) this.f44559c).a();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z4;
        f0 f0Var = (f0) this.f44559c;
        String str = (String) this.f44558b;
        u5.x xVar = (u5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (f0Var.F == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        b6.m.j("Not connected to device", z4);
        u5.f fVar = (u5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (f0Var.f44582s) {
            try {
                if (f0Var.f44579p != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(2001, null, null, null)));
                } else {
                    f0Var.f44579p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean b(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: q5.c0.b(float):boolean");
    }

    @Override
    public void c(e1 e1Var) {
        ((h0) this.f44559c).c(e1Var);
    }

    @Override
    public void d(o3 o3Var, View view) {
        wh.q qVar = (wh.q) this.f44558b;
        q70 q70Var = new q70(qVar, (g6) this.f44559c, view, false, false, true);
        q70Var.Q = true;
        qVar.E = d4.c(q70Var, qVar.f26590b.f29058c0, qVar.getContext(), (g6) this.f44559c, o3Var, true);
    }

    @Override
    public boolean e() {
        return ((h0) this.f44559c).L();
    }

    public void g(String str, PrintWriter printWriter) {
        boolean z4;
        w1.b bVar = (w1.b) this.f44558b;
        if (bVar.d.f31c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.l lVar = bVar.d;
                if (i10 < lVar.f31c) {
                    w1.a aVar = (w1.a) lVar.f30b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f29a[i10]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f49355l);
                    o5.d dVar = aVar.f49355l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f16603a);
                    if (dVar.f16604b || dVar.f16606e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f16604b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f16606e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f16605c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f16605c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f16608g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f16608g);
                        printWriter.print(" waiting=");
                        dVar.f16608g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.h);
                        printWriter.print(" waiting=");
                        dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f49357n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f49357n);
                        c2.u uVar = aVar.f49357n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f2179b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    o5.d dVar2 = aVar.f49355l;
                    Object obj2 = aVar.f1136e;
                    if (obj2 != androidx.lifecycle.z.f1132k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    if (obj == null) {
                        sb.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb.append(cls.getSimpleName());
                        sb.append("{");
                        sb.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb.append("}");
                    }
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f1135c > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    printWriter.println(z4);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public Object mo38get() {
        return new z2.e((Context) ((a3.c) this.f44559c).f49a, (s5.m) ((z2.d) this.f44558b).mo38get());
    }

    @Override
    public void h(e1 e1Var, boolean z4) {
        ((wh.q) this.f44558b).f26590b.t1(e1Var, z4);
    }

    @Override
    public void j(int i10, int i11) {
        ((h0) this.f44559c).M(i10, i11);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean l(float f10) {
        return false;
    }

    @Override
    public void n(wh.a aVar) {
        wh.q qVar = (wh.q) this.f44558b;
        mi miVar = qVar.f26590b;
        p2 p2Var = miVar.f29058c0;
        if (p2Var != null && aVar != null && (aVar.f49653b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            mi miVar2 = new mi(qVar.getContext(), miVar.f29058c0, false, false, false, null);
            miVar2.W1 = new db.a(24);
            miVar2.M = true;
            miVar2.f29116u1.setVisibility(8);
            miVar2.f29103q2 = new l1(qVar, aVar, miVar2, 5);
            miVar2.r1();
            miVar2.show();
        }
    }

    @Override
    public void o(e1 e1Var) {
        ((h0) this.f44559c).f();
    }

    @Override
    public void onContentChanged() {
        wh.q qVar = (wh.q) this.f44558b;
        v3 v3Var = qVar.f49967s;
        if (v3Var != null) {
            v3Var.setSendLoading(qVar.f49966r.l3());
        }
        qVar.V(true);
        qVar.Y();
        wh.e eVar = qVar.M;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    @Override
    public void p(int i10) {
        wh.q.O((wh.q) this.f44558b, 74, i10);
    }

    @Override
    public void q() {
        int i10;
        wh.q qVar = (wh.q) this.f44558b;
        wh.r3 r3Var = qVar.f49966r;
        v3 v3Var = qVar.f49967s;
        if (v3Var != null) {
            f3 f3Var = r3Var.f50028k3;
            if (f3Var != null && f3Var.y() && r3Var.B4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (v3Var.U == 2) {
                v3Var.V = i10;
            } else {
                v3Var.f(i10, true);
            }
            if (i10 != 0) {
                qVar.W();
            }
        }
        qVar.Z();
    }

    @Override
    public boolean r(e1 e1Var) {
        return false;
    }

    @Override
    public void s(e1 e1Var, int i10, int i11) {
        m9 z4;
        h0 h0Var = (h0) this.f44559c;
        if (!((i0) this.f44558b).d && i10 != i11 && (z4 = h0Var.z()) != null) {
            if (!z4.y() || z4.W != h0Var.E()) {
                e1Var.post(new nj(this, e1Var, i11, z4, h0Var, i10));
            }
        }
    }

    @Override
    public void t(Bitmap bitmap) {
        c0 c0Var = (c0) this.f44559c;
        c0Var.f44558b = bitmap;
        t5.f fVar = (t5.f) this.f44558b;
        fVar.f48032l = c0Var;
        fVar.b();
    }

    @Override
    public Object then(Task task) {
        x5.a aVar = (x5.a) this.f44559c;
        Bundle bundle = (Bundle) this.f44558b;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(x5.l.f50468a, x5.b.f50449b);
        }
        return task;
    }

    public String toString() {
        switch (this.f44557a) {
            case 4:
                return "Bounds{lower=" + ((i0.b) this.f44559c) + " upper=" + ((i0.b) this.f44558b) + "}";
            case 7:
                return ((HashMap) this.f44559c).toString();
            case 13:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f44559c).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        v3 v3Var = ((wh.q) this.f44558b).f49967s;
        if (v3Var != null) {
            int i10 = v3Var.U;
            if (i10 == 2) {
                i10 = 0;
            }
            v3Var.V = i10;
            v3Var.e(false, false);
            v3Var.f(2, true);
        }
    }

    @Override
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        q9.a[] aVarArr = (q9.a[]) this.f44559c;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            q9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.v0(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((h7.u) this.f44558b).v0(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public oe.a w(f7.b bVar) {
        int i10;
        List list = (List) this.f44558b;
        List list2 = (List) bVar.f6120b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new qc.i(bVar, (List) this.f44559c, list);
    }

    @Override
    public void x(q3 q3Var, View view) {
        wh.q qVar = (wh.q) this.f44558b;
        q70 q70Var = new q70(qVar, (g6) this.f44559c, view, false, false, true);
        q70Var.Q = true;
        p2 p2Var = qVar.f26590b.f29058c0;
        qVar.getContext();
        qVar.E = d4.b(q70Var, p2Var, q3Var, true);
    }

    public com.google.android.datatransport.cct.CctBackendFactory y(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: q5.c0.y(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public ra.m z(wa.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: q5.c0.z(wa.a):ra.m");
    }

    public c0(Object obj, Object obj2, boolean z4, int i10) {
        this.f44557a = i10;
        this.f44558b = obj;
        this.f44559c = obj2;
    }

    public c0(a6.a aVar) {
        this.f44557a = 9;
        this.f44559c = aVar == null ? null : aVar.f132b;
    }

    public c0(IBinder iBinder) {
        this.f44557a = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f44558b = new x5.f(iBinder);
            this.f44559c = null;
            return;
        }
        this.f44559c = new Messenger(iBinder);
        this.f44558b = null;
    }

    public c0(q9.a[] aVarArr) {
        this.f44557a = 2;
        this.f44559c = aVarArr;
        this.f44558b = new h7.u(20);
    }

    public c0(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f44557a = 13;
        this.f44559c = tVar;
        this.f44558b = (w1.b) new androidx.biometric.e(t0Var, w1.b.f49358f).m(w1.b.class);
    }

    public c0(String str, String str2) {
        this.f44557a = 12;
        this.f44558b = str;
        this.f44559c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void m() {
    }

    @Override
    public void v() {
    }

    public c0(Context context) {
        this.f44557a = 20;
        this.f44558b = null;
        this.f44559c = context;
    }

    @Override
    public void i(boolean z4) {
    }

    public c0(String str) {
        this.f44557a = 11;
        this.f44559c = null;
        this.f44558b = str;
    }

    public c0(cl0 cl0Var) {
        this.f44557a = 5;
        this.f44559c = cl0Var;
        this.f44558b = new AtomicBoolean(false);
    }
}
