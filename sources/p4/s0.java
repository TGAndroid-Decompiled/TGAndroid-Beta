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
import org.telegram.ui.Cells.k7;
import org.telegram.ui.Components.y31;
public final class s0 {
    public boolean f44195a;
    public final Object f44196b;
    public final Object f44197c;
    public final Object d;
    public final Object e;
    public final Serializable f44198f;
    public Object f44199g;
    public Object h;

    public s0(Context context, e eVar) {
        this.f44198f = new ArrayList();
        this.f44199g = new androidx.mediarouter.app.f(this, 9);
        this.h = new k7(this, 29);
        this.f44196b = context;
        this.f44197c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((r4.d) this.f44197c).x();
                return null;
            }
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.f44196b).execute(new y31(this, i10, serializable, 24));
    }

    public void c() {
        boolean f7;
        int i10;
        e eVar = (e) this.f44197c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f44198f;
        if (this.f44195a) {
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
                    if (x.f44227c == null) {
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
                            ComponentName componentName = ((r0) arrayList.get(i13)).f44190r;
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
                        r0 r0Var = new r0((Context) this.f44196b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        r0Var.F = new j5.b(this, r0Var);
                        if (!r0Var.f44192w) {
                            r0Var.f44192w = true;
                            r0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, r0Var);
                        eVar.a(r0Var, false);
                    } else if (i13 >= i11) {
                        r0 r0Var2 = (r0) arrayList.get(i13);
                        if (!r0Var2.f44192w) {
                            r0Var2.f44192w = true;
                            r0Var2.r();
                        }
                        if (r0Var2.f44194y == null) {
                            if (!r0Var2.f44192w || (((n) r0Var2.h) == null && r0Var2.v.isEmpty())) {
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
                        r0Var3.f7281f = null;
                        r0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f44097a.b(514, d);
                        eVar.f44105l.remove(d);
                    }
                    arrayList.remove(r0Var3);
                    r0Var3.F = null;
                    if (r0Var3.f44192w) {
                        r0Var3.f44192w = false;
                        r0Var3.r();
                    }
                }
            }
        }
    }

    public s0(AssetManager assetManager, Executor executor, r4.d dVar, String str, File file) {
        this.f44195a = false;
        this.f44196b = executor;
        this.f44197c = dVar;
        this.f44198f = str;
        this.e = file;
        int i10 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = r4.e.h;
                    break;
                case 26:
                    bArr = r4.e.f45005g;
                    break;
                case 27:
                    bArr = r4.e.f45004f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = r4.e.e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = r4.e.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
