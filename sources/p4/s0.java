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
import org.telegram.ui.Cells.t6;
import org.telegram.ui.zl0;
public final class s0 {
    public boolean f40915a;
    public final Object f40916b;
    public final Object f40917c;
    public final Object d;
    public final Object e;
    public final Serializable f40918f;
    public Object f40919g;
    public Object h;

    public s0(Context context, e eVar) {
        this.f40918f = new ArrayList();
        this.f40919g = new androidx.mediarouter.app.g(this, 8);
        this.h = new t6(this, 28);
        this.f40916b = context;
        this.f40917c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((r4.c) this.f40917c).x();
                return null;
            }
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.f40916b).execute(new zl0(this, i10, serializable, 13));
    }

    public void c() {
        boolean f7;
        int i10;
        e eVar = (e) this.f40917c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f40918f;
        if (this.f40915a) {
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
                    if (x.f40947c == null) {
                        f7 = false;
                    } else {
                        f7 = x.c().f();
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
                            ComponentName componentName = ((r0) arrayList.get(i13)).f40910r;
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
                        r0 r0Var = new r0((Context) this.f40916b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        r0Var.F = new le.b(this, r0Var);
                        if (!r0Var.f40912w) {
                            r0Var.f40912w = true;
                            r0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, r0Var);
                        eVar.a(r0Var, false);
                    } else if (i13 >= i11) {
                        r0 r0Var2 = (r0) arrayList.get(i13);
                        if (!r0Var2.f40912w) {
                            r0Var2.f40912w = true;
                            r0Var2.r();
                        }
                        if (r0Var2.f40914y == null) {
                            if (!r0Var2.f40912w || (((n) r0Var2.h) == null && r0Var2.v.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                r0Var2.q();
                                r0Var2.n();
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
                    r0 r0Var3 = (r0) arrayList.get(size3);
                    u d = eVar.d(r0Var3);
                    if (d != null) {
                        r0Var3.getClass();
                        x.b();
                        r0Var3.f6944f = null;
                        r0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f40817a.b(514, d);
                        eVar.f40825l.remove(d);
                    }
                    arrayList.remove(r0Var3);
                    r0Var3.F = null;
                    if (r0Var3.f40912w) {
                        r0Var3.f40912w = false;
                        r0Var3.r();
                    }
                }
            }
        }
    }

    public s0(AssetManager assetManager, Executor executor, r4.c cVar, String str, File file) {
        this.f40915a = false;
        this.f40916b = executor;
        this.f40917c = cVar;
        this.f40918f = str;
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
                    bArr = r4.d.f42358g;
                    break;
                case 27:
                    bArr = r4.d.f42357f;
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
