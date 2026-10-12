package p4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.c90;
public final class t0 {
    public boolean f43107a;
    public final Object f43108b;
    public final Object f43109c;
    public final Object d;
    public final Object e;
    public final Serializable f43110f;
    public Object f43111g;
    public Object h;

    public t0(Context context, e eVar) {
        this.f43110f = new ArrayList();
        this.f43111g = new androidx.mediarouter.app.f(this, 9);
        this.h = new m5(this, 1);
        this.f43108b = context;
        this.f43109c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((r4.c) this.f43109c).y();
                return null;
            }
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.f43108b).execute(new c90(this, i10, serializable, 19));
    }

    public void c() {
        boolean f7;
        int i10;
        e eVar = (e) this.f43109c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f43110f;
        if (this.f43107a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                for (ResolveInfo resolveInfo : packageManager.queryIntentServices(intent, 0)) {
                    arrayList3.add(resolveInfo.serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i11 = 0;
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (y.f43139c == null) {
                        f7 = false;
                    } else {
                        f7 = y.c().f();
                    }
                    if (f7 && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            ComponentName componentName = ((s0) arrayList.get(i13)).f43102r;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    if (i13 < 0) {
                        s0 s0Var = new s0((Context) this.f43108b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        s0Var.F = new ji.m5(this, s0Var);
                        if (!s0Var.f43104w) {
                            s0Var.f43104w = true;
                            s0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, s0Var);
                        eVar.a(s0Var, false);
                    } else if (i13 >= i11) {
                        s0 s0Var2 = (s0) arrayList.get(i13);
                        if (!s0Var2.f43104w) {
                            s0Var2.f43104w = true;
                            s0Var2.r();
                        }
                        if (s0Var2.f43106y == null) {
                            if (!s0Var2.f43104w || (((n) s0Var2.h) == null && s0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                s0Var2.q();
                                s0Var2.n();
                            }
                        }
                        i10 = i11 + 1;
                        Collections.swap(arrayList, i13, i11);
                    }
                    i11 = i10;
                }
            }
            if (i11 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i11; size3--) {
                    s0 s0Var3 = (s0) arrayList.get(size3);
                    v d = eVar.d(s0Var3);
                    if (d != null) {
                        s0Var3.getClass();
                        y.b();
                        s0Var3.f5824f = null;
                        s0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f43008a.b(514, d);
                        eVar.f43016l.remove(d);
                    }
                    arrayList.remove(s0Var3);
                    s0Var3.F = null;
                    if (s0Var3.f43104w) {
                        s0Var3.f43104w = false;
                        s0Var3.r();
                    }
                }
            }
        }
    }

    public t0(AssetManager assetManager, Executor executor, r4.c cVar, String str, File file) {
        this.f43107a = false;
        this.f43108b = executor;
        this.f43109c = cVar;
        this.f43110f = str;
        this.e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = r4.d.h;
                    break;
                case 26:
                    bArr = r4.d.f43908g;
                    break;
                case 27:
                    bArr = r4.d.f43907f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = r4.d.e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = r4.d.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
