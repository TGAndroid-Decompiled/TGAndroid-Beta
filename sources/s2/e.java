package s2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.t0;
import androidx.lifecycle.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import f3.j0;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.kn0;
import org.telegram.ui.tv;
import org.telegram.ui.vp0;
import sg.s0;
import v4.j1;
import v4.k1;
import x2.c1;
import y7.s2;
import z7.qa;
public final class e implements u, te.d, s0, q5.b, com.google.android.gms.common.api.internal.q, b3.r {
    public final int f56891a;
    public final Object f56892b;
    public Object f56893c;

    public e(int i7, Object obj, Object obj2) {
        this.f56891a = i7;
        this.f56892b = obj;
        this.f56893c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public boolean H(float f10) {
        return false;
    }

    @Override
    public b3.r U() {
        return new e(9, ((u) this.f56892b).U(), (List) this.f56893c);
    }

    @Override
    public void a() {
        ((te.i) this.f56892b).a();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v6.d dVar = new v6.d((v6.e) this.f56892b, (TaskCompletionSource) obj2, 0);
        v6.c cVar = (v6.c) ((v6.f) obj).n();
        Parcel j12 = cVar.j1();
        n7.a.c(j12, dVar);
        n7.a.b(j12, (v6.a) this.f56893c);
        cVar.k1(j12, 1);
    }

    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f56892b;
        Class cls = (Class) ((nd0) this.f56893c).f37766b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new u9.c(str2, 0));
        }
        return arrayList2;
    }

    public void c(String str, PrintWriter printWriter) {
        boolean z10;
        z1.b bVar = (z1.b) this.f56893c;
        if (bVar.d.f34c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i7 = 0;
            while (true) {
                a0.m mVar = bVar.d;
                if (i7 < mVar.f34c) {
                    z1.a aVar = (z1.a) mVar.f33b[i7];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f32a[i7]);
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
                    printWriter.println(aVar.f61469l);
                    d6.d dVar = aVar.f61469l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f7858a);
                    if (dVar.f7859b || dVar.f7861e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f7859b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f7861e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f7860c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f7860c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f7863g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f7863g);
                        printWriter.print(" waiting=");
                        dVar.f7863g.getClass();
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
                    if (aVar.f61471n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f61471n);
                        ca.i iVar = aVar.f61471n;
                        iVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(iVar.f5117b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    d6.d dVar2 = aVar.f61469l;
                    Object obj2 = aVar.f2529e;
                    if (obj2 != z.f2525k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb2 = new StringBuilder(64);
                    if (obj == null) {
                        sb2.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb2.append(cls.getSimpleName());
                        sb2.append("{");
                        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb2.append("}");
                    }
                    printWriter.println(sb2.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f2528c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public View d(int i7, int i10, int i11, int i12) {
        int i13;
        j1 j1Var = (j1) this.f56893c;
        k1 k1Var = (k1) this.f56892b;
        int i14 = k1Var.i();
        int k10 = k1Var.k();
        if (i10 > i7) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i7 != i10) {
            View l10 = k1Var.l(i7);
            int d = k1Var.d(l10);
            int m10 = k1Var.m(l10);
            j1Var.f59289b = i14;
            j1Var.f59290c = k10;
            j1Var.d = d;
            j1Var.f59291e = m10;
            if (i11 != 0) {
                j1Var.f59288a = i11;
                if (j1Var.a()) {
                    return l10;
                }
            }
            if (i12 != 0) {
                j1Var.f59288a = i12;
                if (j1Var.a()) {
                    view = l10;
                }
            }
            i7 += i13;
        }
        return view;
    }

    public boolean e(View view) {
        j1 j1Var = (j1) this.f56893c;
        k1 k1Var = (k1) this.f56892b;
        int i7 = k1Var.i();
        int k10 = k1Var.k();
        int d = k1Var.d(view);
        int m10 = k1Var.m(view);
        j1Var.f59289b = i7;
        j1Var.f59290c = k10;
        j1Var.d = d;
        j1Var.f59291e = m10;
        j1Var.f59288a = 24579;
        return j1Var.a();
    }

    public j0 f(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f56892b;
            if (i10 < iArr.length) {
                if (i7 == iArr[i10]) {
                    return ((c1[]) this.f56893c)[i10];
                }
                i10++;
            } else {
                h2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new f3.n();
            }
        }
    }

    @Override
    public Object g(Uri uri, j2.k kVar) {
        w2.a aVar = (w2.a) ((b3.r) this.f56892b).g(uri, kVar);
        List list = (List) this.f56893c;
        if (list != null && !list.isEmpty()) {
            return (w2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public Object mo23get() {
        qb.a aVar = new qb.a(28);
        pb.b bVar = new pb.b(28);
        Object mo23get = ((fd.a) this.f56892b).mo23get();
        fd.a aVar2 = (fd.a) this.f56893c;
        return new v5.g(aVar, bVar, v5.a.f59396f, (v5.i) mo23get, aVar2);
    }

    @Override
    public void h() {
        ((kn0) this.f56892b).run();
    }

    @Override
    public void k0() {
        vp0 vp0Var = (vp0) this.f56893c;
        vp0Var.f58041p0.f57386a.v();
        vp0Var.V0.setViewHidden(false);
    }

    @Override
    public void l() {
        tv tvVar = ((vp0) this.f56893c).H0;
        if (tvVar != null) {
            tvVar.invalidate();
        }
    }

    @Override
    public void q() {
        vp0 vp0Var = (vp0) this.f56893c;
        if (vp0Var.U0) {
            vp0Var.U0 = false;
            return;
        }
        vp0Var.f58027d1.b(1);
        vp0Var.w((sg.h) sg.h.f57338a.get(0));
    }

    @Override
    public boolean s() {
        boolean z10;
        vp0 vp0Var = (vp0) this.f56893c;
        if (vp0Var.C0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            vp0Var.u0(null, true);
        }
        return z10;
    }

    public String toString() {
        switch (this.f56891a) {
            case 13:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f56892b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void x0() {
        vp0 vp0Var = (vp0) this.f56893c;
        if (vp0Var.C0 != null) {
            vp0Var.u0(null, true);
        }
        vp0Var.V0.setViewHidden(true);
    }

    @Override
    public void y1() {
        ((te.i) this.f56892b).g((te.j) this.f56893c);
    }

    @Override
    public b3.r z(q qVar, n nVar) {
        return new e(9, ((u) this.f56892b).z(qVar, nVar), (List) this.f56893c);
    }

    public e(Object obj, Object obj2, boolean z10, int i7) {
        this.f56891a = i7;
        this.f56893c = obj;
        this.f56892b = obj2;
    }

    public e(s2 s2Var) {
        this.f56891a = 14;
        this.f56893c = new Object();
        this.f56892b = s2Var;
        qa.b();
    }

    public e(Context context) {
        this.f56891a = 11;
        this.f56892b = context;
        this.f56893c = null;
    }

    public e(androidx.lifecycle.t tVar, t0 t0Var) {
        this.f56891a = 13;
        this.f56892b = tVar;
        this.f56893c = (z1.b) new a0(t0Var, z1.b.f61472f).j(z1.b.class);
    }

    public e(k1 k1Var) {
        this.f56891a = 6;
        this.f56892b = k1Var;
        ?? obj = new Object();
        obj.f59288a = 0;
        this.f56893c = obj;
    }

    @Override
    public void K() {
    }

    @Override
    public void E(boolean z10) {
    }
}
