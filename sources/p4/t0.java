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
import org.telegram.ui.Components.ew;
import org.telegram.ui.Wallet.x0;
public final class t0 {
    public boolean f44810a;
    public final Object f44811b;
    public final Object f44812c;
    public final Object d;
    public final Object e;
    public final Serializable f44813f;
    public Object f44814g;
    public Object h;

    public t0(Context context, e eVar) {
        this.f44813f = new ArrayList();
        this.f44814g = new androidx.mediarouter.app.f(this, 13);
        this.h = new ew(this, 21);
        this.f44811b = context;
        this.f44812c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((r4.c) this.f44812c).p();
                return null;
            }
            return null;
        }
    }

    public void b(int i10, Serializable serializable) {
        ((Executor) this.f44811b).execute(new x0(this, i10, serializable, 10));
    }

    public void c() {
        boolean f7;
        int i10;
        e eVar = (e) this.f44812c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f44813f;
        if (this.f44810a) {
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
                    if (y.f44842c == null) {
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
                            ComponentName componentName = ((s0) arrayList.get(i13)).f44805r;
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
                        s0 s0Var = new s0((Context) this.f44811b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        s0Var.F = new mg.l(this, s0Var);
                        if (!s0Var.f44808x) {
                            s0Var.f44808x = true;
                            s0Var.r();
                        }
                        i10 = i11 + 1;
                        arrayList.add(i11, s0Var);
                        eVar.a(s0Var, false);
                    } else if (i13 >= i11) {
                        s0 s0Var2 = (s0) arrayList.get(i13);
                        if (!s0Var2.f44808x) {
                            s0Var2.f44808x = true;
                            s0Var2.r();
                        }
                        if (s0Var2.D == null) {
                            if (!s0Var2.f44808x || (((n) s0Var2.h) == null && s0Var2.f44807w.isEmpty())) {
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
                        s0Var3.f5274f = null;
                        s0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f44710a.b(514, d);
                        eVar.f44718l.remove(d);
                    }
                    arrayList.remove(s0Var3);
                    s0Var3.F = null;
                    if (s0Var3.f44808x) {
                        s0Var3.f44808x = false;
                        s0Var3.r();
                    }
                }
            }
        }
    }

    public t0(AssetManager assetManager, Executor executor, r4.c cVar, String str, File file) {
        this.f44810a = false;
        this.f44811b = executor;
        this.f44812c = cVar;
        this.f44813f = str;
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
                    bArr = r4.d.f46307g;
                    break;
                case 27:
                    bArr = r4.d.f46306f;
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
