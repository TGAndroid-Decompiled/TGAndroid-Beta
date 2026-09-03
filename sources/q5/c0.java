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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.lj;
import org.telegram.ui.Components.p70;
import org.telegram.ui.cl0;
import ph.l1;
import vh.d1;
import vh.e1;
import vh.e4;
import vh.g3;
import vh.h0;
import vh.i0;
import vh.p3;
import vh.q3;
import vh.r3;
import vh.s3;
import vh.w3;
import vh.w5;
public final class c0 implements com.google.android.gms.common.api.internal.s, q9.a, oe.b, t5.a, u4.p, q3, d1, Continuation, xd.d, a3.b {
    public final int f42806a;
    public Object f42807b;
    public Object f42808c;

    public c0(int i10, Object obj, Object obj2) {
        this.f42806a = i10;
        this.f42808c = obj;
        this.f42807b = obj2;
    }

    public static String G(c0 c0Var) {
        Collection<String> collection = (Collection) c0Var.f42808c;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) c0Var.f42807b;
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
                    if (!u5.a.f45158a.matcher(str2).matches()) {
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

    public static String e(Class cls) {
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
        w3 w3Var = ((vh.q) this.f42807b).f46157s;
        if (w3Var != null) {
            int i10 = 0;
            w3Var.e(false, true);
            int i11 = w3Var.V;
            if (i11 != 2) {
                i10 = i11;
            }
            w3Var.f(i10, true);
        }
    }

    public com.google.android.datatransport.cct.CctBackendFactory B(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: q5.c0.B(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public p70 C(View view) {
        vh.q qVar = (vh.q) this.f42807b;
        p70 p70Var = new p70(qVar, (f6) this.f42808c, view, false, false, true);
        qVar.E = p70Var;
        return p70Var;
    }

    @Override
    public void D() {
        vh.q qVar = (vh.q) this.f42807b;
        qVar.X();
        qVar.Y();
    }

    public ra.m E(wa.a r7) {
        throw new UnsupportedOperationException("Method not decompiled: q5.c0.E(wa.a):ra.m");
    }

    public r3.k F(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f42807b)) {
            if (!((AtomicBoolean) this.f42807b).get()) {
                try {
                    a2 = ((cl0) this.f42808c).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f42807b).set(true);
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
    public oe.a P0(f7.b bVar) {
        int i10;
        List list = (List) this.f42807b;
        List list2 = (List) bVar.f6001b;
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
        return new qc.i(bVar, (List) this.f42808c, list);
    }

    @Override
    public void Q0(CharSequence charSequence) {
        ((h0) this.f42808c).L0(charSequence);
    }

    @Override
    public boolean V0(e1 e1Var) {
        return false;
    }

    @Override
    public void a() {
        ((xd.i) this.f42808c).a();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z4;
        f0 f0Var = (f0) this.f42808c;
        String str = (String) this.f42807b;
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
        synchronized (f0Var.f42830s) {
            try {
                if (f0Var.f42827p != null) {
                    taskCompletionSource.setException(b6.m.m(new Status(2001, null, null, null)));
                } else {
                    f0Var.f42827p = taskCompletionSource;
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
        ((h0) this.f42808c).c(e1Var);
    }

    @Override
    public void d(e1 e1Var, boolean z4) {
        ((vh.q) this.f42807b).f24282b.t1(e1Var, z4);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void g1(e1 e1Var) {
        ((h0) this.f42808c).l();
    }

    @Override
    public Object mo28get() {
        return new z2.d((Context) ((a3.c) this.f42808c).f45a, (s5.m) ((xe.b) this.f42807b).mo28get());
    }

    @Override
    public boolean h() {
        return ((h0) this.f42808c).Y0();
    }

    @Override
    public boolean h0(e1 e1Var) {
        return false;
    }

    @Override
    public boolean i(float f10) {
        return false;
    }

    @Override
    public o0 k(u4.l lVar, u4.i iVar) {
        return new f7.b(29, ((u4.p) this.f42808c).k(lVar, iVar), (List) this.f42807b);
    }

    @Override
    public o0 l() {
        return new f7.b(29, ((u4.p) this.f42808c).l(), (List) this.f42807b);
    }

    @Override
    public void l1(Editable editable) {
        ((i0) this.f42807b).i();
        ((h0) this.f42808c).s1();
    }

    @Override
    public void m(p3 p3Var, View view) {
        vh.q qVar = (vh.q) this.f42807b;
        p70 p70Var = new p70(qVar, (f6) this.f42808c, view, false, false, true);
        p70Var.Q = true;
        qVar.E = e4.c(p70Var, qVar.f24282b.f26685c0, qVar.getContext(), (f6) this.f42808c, p3Var, true);
    }

    @Override
    public void n(int i10) {
        vh.q.O((vh.q) this.f42807b, 74, i10);
    }

    @Override
    public void n1(e1 e1Var, int i10, int i11) {
        l9 J0;
        h0 h0Var = (h0) this.f42808c;
        if (!((i0) this.f42807b).d && i10 != i11 && (J0 = h0Var.J0()) != null) {
            if (!J0.y() || J0.W != h0Var.O0()) {
                e1Var.post(new lj(this, e1Var, i11, J0, h0Var, i10));
            }
        }
    }

    @Override
    public void o() {
        int i10;
        vh.q qVar = (vh.q) this.f42807b;
        s3 s3Var = qVar.f46156r;
        w3 w3Var = qVar.f46157s;
        if (w3Var != null) {
            g3 g3Var = s3Var.f46221k3;
            if (g3Var != null && g3Var.y() && s3Var.B4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (w3Var.U == 2) {
                w3Var.V = i10;
            } else {
                w3Var.f(i10, true);
            }
            if (i10 != 0) {
                qVar.W();
            }
        }
        qVar.Z();
    }

    @Override
    public void onContentChanged() {
        vh.q qVar = (vh.q) this.f42807b;
        w3 w3Var = qVar.f46157s;
        if (w3Var != null) {
            w3Var.setSendLoading(qVar.f46156r.l3());
        }
        qVar.V(true);
        qVar.Y();
        vh.e eVar = qVar.M;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    @Override
    public void p(Bitmap bitmap) {
        c0 c0Var = (c0) this.f42808c;
        c0Var.f42807b = bitmap;
        t5.f fVar = (t5.f) this.f42807b;
        fVar.f44648l = c0Var;
        fVar.b();
    }

    public void q(String str, PrintWriter printWriter) {
        boolean z4;
        w1.b bVar = (w1.b) this.f42807b;
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
                    printWriter.println(aVar.f46436l);
                    o5.d dVar = aVar.f46436l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f16426a);
                    if (dVar.f16427b || dVar.e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f16427b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f16428c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f16428c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f16430g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f16430g);
                        printWriter.print(" waiting=");
                        dVar.f16430g.getClass();
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
                    if (aVar.f46438n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f46438n);
                        c2.u uVar = aVar.f46438n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f2036b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    o5.d dVar2 = aVar.f46436l;
                    Object obj2 = aVar.e;
                    if (obj2 != androidx.lifecycle.z.f1054k) {
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
                    if (aVar.f1057c > 0) {
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
    public void r(int i10, int i11) {
        ((h0) this.f42808c).f1(i10, i11);
    }

    @Override
    public void s() {
        w3 w3Var = ((vh.q) this.f42807b).f46157s;
        if (w3Var != null) {
            int i10 = w3Var.U;
            if (i10 == 2) {
                i10 = 0;
            }
            w3Var.V = i10;
            w3Var.e(false, false);
            w3Var.f(2, true);
        }
    }

    @Override
    public void t(w5 w5Var, String str) {
        vh.q qVar = (vh.q) this.f42807b;
        if (qVar.v == null) {
            f6 f6Var = (f6) this.f42808c;
            qVar.v = new m.s3(new org.telegram.ui.web.m(11, this, f6Var), f6Var);
        }
        qVar.v.f(w5Var, str);
    }

    @Override
    public Object then(Task task) {
        x5.a aVar = (x5.a) this.f42808c;
        Bundle bundle = (Bundle) this.f42807b;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(x5.l.f46893a, x5.b.f46877b);
        }
        return task;
    }

    public String toString() {
        switch (this.f42806a) {
            case 4:
                return "Bounds{lower=" + ((i0.b) this.f42808c) + " upper=" + ((i0.b) this.f42807b) + "}";
            case 7:
                return ((HashMap) this.f42808c).toString();
            case 15:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f42808c).getClass();
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
        vh.q qVar = (vh.q) this.f42807b;
        if (qVar.getCurrentItemTop() != qVar.F) {
            qVar.f24282b.X1(qVar, 0);
        }
        qVar.a0();
        vh.q.J(qVar);
    }

    @Override
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        q9.a[] aVarArr = (q9.a[]) this.f42808c;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            q9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.v(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((db.a) this.f42807b).v(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void w(r3 r3Var, View view) {
        vh.q qVar = (vh.q) this.f42807b;
        p70 p70Var = new p70(qVar, (f6) this.f42808c, view, false, false, true);
        p70Var.Q = true;
        p2 p2Var = qVar.f24282b.f26685c0;
        qVar.getContext();
        qVar.E = e4.b(p70Var, p2Var, r3Var, true);
    }

    @Override
    public boolean w1(boolean z4) {
        return false;
    }

    @Override
    public void x() {
        ((xd.i) this.f42808c).e((xd.j) this.f42807b);
    }

    @Override
    public void y(int i10) {
        vh.q qVar = (vh.q) this.f42807b;
        qVar.f24282b.X1(qVar, i10);
        qVar.a0();
        vh.q.J(qVar);
    }

    @Override
    public void z(vh.a aVar) {
        vh.q qVar = (vh.q) this.f42807b;
        li liVar = qVar.f24282b;
        p2 p2Var = liVar.f26685c0;
        if (p2Var != null && aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            li liVar2 = new li(qVar.getContext(), liVar.f26685c0, false, false, false, null);
            liVar2.W1 = new ab.a(24);
            liVar2.M = true;
            liVar2.f26742u1.setVisibility(8);
            liVar2.f26729q2 = new l1(qVar, aVar, liVar2, 5);
            liVar2.r1();
            liVar2.show();
        }
    }

    public c0(Object obj, Object obj2, boolean z4, int i10) {
        this.f42806a = i10;
        this.f42807b = obj;
        this.f42808c = obj2;
    }

    public c0(a6.a aVar) {
        this.f42806a = 9;
        this.f42808c = aVar == null ? null : aVar.f120b;
    }

    public c0(IBinder iBinder) {
        this.f42806a = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f42807b = new x5.f(iBinder);
            this.f42808c = null;
            return;
        }
        this.f42808c = new Messenger(iBinder);
        this.f42807b = null;
    }

    public c0(q9.a[] aVarArr) {
        this.f42806a = 2;
        this.f42808c = aVarArr;
        this.f42807b = new db.a(20);
    }

    public c0(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f42806a = 15;
        this.f42808c = tVar;
        this.f42807b = (w1.b) new af.d(t0Var, w1.b.f46439f).m(w1.b.class);
    }

    public c0(String str, String str2) {
        this.f42806a = 12;
        this.f42807b = str;
        this.f42808c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void q0() {
    }

    public c0(Context context) {
        this.f42806a = 20;
        this.f42807b = null;
        this.f42808c = context;
    }

    @Override
    public void f(boolean z4) {
    }

    public c0(String str) {
        this.f42806a = 11;
        this.f42808c = null;
        this.f42807b = str;
    }

    public c0(cl0 cl0Var) {
        this.f42806a = 5;
        this.f42808c = cl0Var;
        this.f42807b = new AtomicBoolean(false);
    }
}
