package q5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.t0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
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
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.al0;
import ph.m1;
import vh.c1;
import vh.d1;
import vh.d4;
import vh.f3;
import vh.h0;
import vh.o3;
import vh.p3;
import vh.q3;
import vh.r3;
import vh.v3;
import vh.v5;
public final class g0 implements q9.a, oe.b, t5.a, u4.p, p3, c1, Continuation, xd.d, a3.b {
    public final int f42805a;
    public final Object f42806b;
    public Object f42807c;

    public g0(int i10, Object obj, Object obj2) {
        this.f42805a = i10;
        this.f42806b = obj;
        this.f42807c = obj2;
    }

    public static String L(g0 g0Var) {
        Collection<String> collection = (Collection) g0Var.f42807c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) g0Var.f42806b;
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
                    if (!u5.a.f45096a.matcher(str2).matches()) {
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

    public static String t(Class cls) {
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
    public void A(vh.a aVar) {
        vh.p pVar = (vh.p) this.f42807c;
        li liVar = pVar.f24278b;
        p2 p2Var = liVar.f26689c0;
        if (p2Var != null && aVar != null && (aVar.f45775b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            li liVar2 = new li(pVar.getContext(), liVar.f26689c0, false, false, false, null);
            liVar2.W1 = new cb.b(24);
            liVar2.M = true;
            liVar2.f26746u1.setVisibility(8);
            liVar2.f26733q2 = new m1(pVar, aVar, liVar2, 5);
            liVar2.r1();
            liVar2.show();
        }
    }

    @Override
    public void B() {
        v3 v3Var = ((vh.p) this.f42807c).f46060s;
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
    public o70 C(View view) {
        vh.p pVar = (vh.p) this.f42807c;
        o70 o70Var = new o70(pVar, (f6) this.f42806b, view, false, false, true);
        pVar.E = o70Var;
        return o70Var;
    }

    @Override
    public void D(CharSequence charSequence) {
        ((vh.g0) this.f42806b).y(charSequence);
    }

    public com.google.android.datatransport.cct.CctBackendFactory E(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: q5.g0.E(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public boolean F(d1 d1Var) {
        return false;
    }

    @Override
    public void G(d1 d1Var) {
        ((vh.g0) this.f42806b).h();
    }

    @Override
    public void H() {
        vh.p pVar = (vh.p) this.f42807c;
        pVar.X();
        pVar.Y();
    }

    public ra.m I(wa.a r7) {
        throw new UnsupportedOperationException("Method not decompiled: q5.g0.I(wa.a):ra.m");
    }

    @Override
    public o0 J() {
        return new f7.b(29, ((u4.p) this.f42806b).J(), (List) this.f42807c);
    }

    public r3.k K(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f42807c)) {
            if (!((AtomicBoolean) this.f42807c).get()) {
                try {
                    a2 = ((al0) this.f42806b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f42807c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (r3.k) a2.newInstance(objArr);
        } catch (Exception e6) {
            throw new IllegalStateException("Unexpected error creating extractor", e6);
        }
    }

    @Override
    public void N(Editable editable) {
        ((h0) this.f42807c).i();
        ((vh.g0) this.f42806b).P();
    }

    @Override
    public void O(d1 d1Var, int i10, int i11) {
        m9 u10;
        vh.g0 g0Var = (vh.g0) this.f42806b;
        if (!((h0) this.f42807c).d && i10 != i11 && (u10 = g0Var.u()) != null) {
            if (!u10.y() || u10.W != g0Var.z()) {
                d1Var.post(new lj(this, d1Var, i11, u10, g0Var, i10));
            }
        }
    }

    @Override
    public boolean R(boolean z4) {
        return false;
    }

    @Override
    public void a() {
        ((xd.i) this.f42806b).a();
    }

    @Override
    public boolean b(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: q5.g0.b(float):boolean");
    }

    @Override
    public void c(d1 d1Var) {
        ((vh.g0) this.f42806b).c(d1Var);
    }

    @Override
    public boolean d() {
        return ((vh.g0) this.f42806b).L();
    }

    @Override
    public void e(d1 d1Var, boolean z4) {
        ((vh.p) this.f42807c).f24278b.t1(d1Var, z4);
    }

    @Override
    public o0 f(u4.l lVar, u4.i iVar) {
        return new f7.b(29, ((u4.p) this.f42806b).f(lVar, iVar), (List) this.f42807c);
    }

    @Override
    public Object mo0get() {
        return new z2.d((Context) ((a3.c) this.f42806b).f46b, (s5.m) ((qk0) this.f42807c).mo0get());
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void i(int i10, int i11) {
        ((vh.g0) this.f42806b).M(i10, i11);
    }

    @Override
    public boolean j(float f10) {
        return false;
    }

    @Override
    public void l(o3 o3Var, View view) {
        vh.p pVar = (vh.p) this.f42807c;
        o70 o70Var = new o70(pVar, (f6) this.f42806b, view, false, false, true);
        o70Var.Q = true;
        pVar.E = d4.c(o70Var, pVar.f24278b.f26689c0, pVar.getContext(), (f6) this.f42806b, o3Var, true);
    }

    @Override
    public void m(int i10) {
        vh.p.O((vh.p) this.f42807c, 74, i10);
    }

    @Override
    public void n() {
        int i10;
        vh.p pVar = (vh.p) this.f42807c;
        r3 r3Var = pVar.f46059r;
        v3 v3Var = pVar.f46060s;
        if (v3Var != null) {
            f3 f3Var = r3Var.f46124k3;
            if (f3Var != null && f3Var.y() && r3Var.C4()) {
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
                pVar.W();
            }
        }
        pVar.Z();
    }

    @Override
    public boolean o(d1 d1Var) {
        return false;
    }

    @Override
    public void onContentChanged() {
        vh.p pVar = (vh.p) this.f42807c;
        v3 v3Var = pVar.f46060s;
        if (v3Var != null) {
            v3Var.setSendLoading(pVar.f46059r.m3());
        }
        pVar.V(true);
        pVar.Y();
        vh.d dVar = pVar.M;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p(Bitmap bitmap) {
        g0 g0Var = (g0) this.f42806b;
        g0Var.f42807c = bitmap;
        t5.f fVar = (t5.f) this.f42807c;
        fVar.f44586l = g0Var;
        fVar.b();
    }

    @Override
    public void q() {
        v3 v3Var = ((vh.p) this.f42807c).f46060s;
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
    public void s(v5 v5Var, String str) {
        vh.p pVar = (vh.p) this.f42807c;
        if (pVar.v == null) {
            f6 f6Var = (f6) this.f42806b;
            pVar.v = new s3(new org.telegram.ui.web.m(11, this, f6Var), f6Var);
        }
        pVar.v.f(v5Var, str);
    }

    @Override
    public Object then(Task task) {
        x5.a aVar = (x5.a) this.f42806b;
        Bundle bundle = (Bundle) this.f42807c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(x5.l.f46826a, x5.b.f46810b);
        }
        return task;
    }

    public String toString() {
        switch (this.f42805a) {
            case 3:
                return "Bounds{lower=" + ((i0.b) this.f42806b) + " upper=" + ((i0.b) this.f42807c) + "}";
            case 6:
                return ((HashMap) this.f42806b).toString();
            case 14:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f42806b).getClass();
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
        ((xd.i) this.f42806b).e((xd.j) this.f42807c);
    }

    @Override
    public void v() {
        vh.p pVar = (vh.p) this.f42807c;
        if (pVar.getCurrentItemTop() != pVar.F) {
            pVar.f24278b.X1(pVar, 0);
        }
        pVar.a0();
        vh.p.J(pVar);
    }

    @Override
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        q9.a[] aVarArr = (q9.a[]) this.f42806b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            q9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.v0(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((h7.u) this.f42807c).v0(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void w(q3 q3Var, View view) {
        vh.p pVar = (vh.p) this.f42807c;
        o70 o70Var = new o70(pVar, (f6) this.f42806b, view, false, false, true);
        o70Var.Q = true;
        p2 p2Var = pVar.f24278b.f26689c0;
        pVar.getContext();
        pVar.E = d4.b(o70Var, p2Var, q3Var, true);
    }

    @Override
    public void x(int i10) {
        vh.p pVar = (vh.p) this.f42807c;
        pVar.f24278b.X1(pVar, i10);
        pVar.a0();
        vh.p.J(pVar);
    }

    public void y(String str, PrintWriter printWriter) {
        boolean z4;
        w1.b bVar = (w1.b) this.f42807c;
        if (bVar.d.f28c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.l lVar = bVar.d;
                if (i10 < lVar.f28c) {
                    w1.a aVar = (w1.a) lVar.f27b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f26a[i10]);
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
                    printWriter.println(aVar.f46354l);
                    o5.d dVar = aVar.f46354l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f16444a);
                    if (dVar.f16445b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f16445b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f16446c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f16446c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f16448g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f16448g);
                        printWriter.print(" waiting=");
                        dVar.f16448g.getClass();
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
                    if (aVar.f46356n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f46356n);
                        c2.u uVar = aVar.f46356n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f2006b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    o5.d dVar2 = aVar.f46354l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f1043k) {
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
                    if (aVar.f1046c > 0) {
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
    public oe.a z(f7.b bVar) {
        int i10;
        List list = (List) this.f42807c;
        List list2 = (List) bVar.f6012b;
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
        return new qc.i(bVar, (List) this.f42806b, list);
    }

    public g0(Object obj, int i10) {
        this.f42805a = i10;
        this.f42807c = null;
        this.f42806b = obj;
    }

    public g0(Object obj, Object obj2, boolean z4, int i10) {
        this.f42805a = i10;
        this.f42807c = obj;
        this.f42806b = obj2;
    }

    public g0(a6.a aVar) {
        this.f42805a = 8;
        this.f42806b = aVar == null ? null : aVar.f121b;
    }

    public g0(IBinder iBinder) {
        this.f42805a = 15;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f42807c = new x5.f(iBinder);
            this.f42806b = null;
            return;
        }
        this.f42806b = new Messenger(iBinder);
        this.f42807c = null;
    }

    public g0(q9.a[] aVarArr) {
        this.f42805a = 1;
        this.f42806b = aVarArr;
        this.f42807c = new h7.u(20);
    }

    public g0(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f42805a = 14;
        this.f42806b = tVar;
        this.f42807c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f46357f).n(w1.b.class);
    }

    public g0(String str, String str2) {
        this.f42805a = 11;
        this.f42806b = str;
        this.f42807c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void r() {
    }

    public g0(al0 al0Var) {
        this.f42805a = 4;
        this.f42806b = al0Var;
        this.f42807c = new AtomicBoolean(false);
    }

    @Override
    public void g(boolean z4) {
    }
}
