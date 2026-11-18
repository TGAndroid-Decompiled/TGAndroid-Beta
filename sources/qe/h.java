package qe;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import h2.o0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.ActionBar.p;
import org.telegram.ui.Components.h01;
import s4.n;
import s4.r0;
import s4.s0;
import s4.u;
import s4.x;
public final class h {
    public boolean f56117a;
    public final Object f56118b;
    public final Object f56119c;
    public final Object d;
    public final Object f56120e;
    public Object f56121f;
    public Object f56122g;
    public Object h;

    public h(ca.i composer, pe.b bVar, j jVar, h[] hVarArr) {
        kotlin.jvm.internal.j.e(composer, "composer");
        this.f56118b = composer;
        this.f56119c = bVar;
        this.d = jVar;
        this.f56120e = hVarArr;
        this.f56121f = bVar.f55572a;
        int ordinal = jVar.ordinal();
        if (hVarArr != null) {
            h hVar = hVarArr[ordinal];
            if (hVar == null && hVar == this) {
                return;
            }
            hVarArr[ordinal] = this;
        }
    }

    public h a(me.d descriptor) {
        h hVar;
        h[] hVarArr = (h[]) this.f56120e;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.f56119c;
        j f10 = f.f(descriptor, bVar);
        char c10 = f10.f56129a;
        ca.i iVar = (ca.i) this.f56118b;
        iVar.j(c10);
        iVar.f5125b = true;
        String str = (String) this.f56122g;
        if (str != null) {
            String str2 = (String) this.h;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            iVar.i();
            j(str);
            iVar.j(':');
            j(str2);
            this.f56122g = null;
            this.h = null;
        }
        if (((j) this.d) == f10) {
            return this;
        }
        if (hVarArr != null && (hVar = hVarArr[f10.ordinal()]) != null) {
            return hVar;
        }
        return new h(iVar, bVar, f10, hVarArr);
    }

    public void b(me.d descriptor, int i7) {
        ca.i iVar = (ca.i) this.f56118b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        int ordinal = ((j) this.d).ordinal();
        boolean z10 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!iVar.f5125b) {
                        iVar.j(',');
                    }
                    iVar.i();
                    f.e(descriptor, (pe.b) this.f56119c);
                    j(descriptor.g(i7));
                    iVar.j(':');
                    iVar.k();
                    return;
                }
                if (i7 == 0) {
                    this.f56117a = true;
                }
                if (i7 == 1) {
                    iVar.j(',');
                    iVar.k();
                    this.f56117a = false;
                    return;
                }
                return;
            } else if (!iVar.f5125b) {
                if (i7 % 2 == 0) {
                    iVar.j(',');
                    iVar.i();
                } else {
                    iVar.j(':');
                    iVar.k();
                    z10 = false;
                }
                this.f56117a = z10;
                return;
            } else {
                this.f56117a = true;
                iVar.i();
                return;
            }
        }
        if (!iVar.f5125b) {
            iVar.j(',');
        }
        iVar.i();
    }

    public void c(int i7) {
        if (this.f56117a) {
            j(String.valueOf(i7));
        } else {
            ((mc.a) ((ca.i) this.f56118b).f5126c).c(String.valueOf(i7));
        }
    }

    public void d(long j3) {
        if (this.f56117a) {
            j(String.valueOf(j3));
        } else {
            ((mc.a) ((ca.i) this.f56118b).f5126c).c(String.valueOf(j3));
        }
    }

    public void e(me.d descriptor, int i7, long j3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        b(descriptor, i7);
        d(j3);
    }

    public void f() {
        ca.i iVar = (ca.i) this.f56118b;
        iVar.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((mc.a) iVar.f5126c).c("null");
    }

    public void g(me.d descriptor, int i7, ke.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        if (obj == null && !((o0) this.f56121f).f13806b) {
            return;
        }
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        b(descriptor, i7);
        if (serializer.d().c()) {
            i(serializer, obj);
        } else if (obj == null) {
            f();
        } else {
            i(serializer, obj);
        }
    }

    public void h(me.d descriptor, int i7, ke.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        b(descriptor, i7);
        i(serializer, obj);
    }

    public void i(ke.a r5, java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: qe.h.i(ke.a, java.lang.Object):void");
    }

    public void j(String value) {
        int i7;
        kotlin.jvm.internal.j.e(value, "value");
        ca.i iVar = (ca.i) this.f56118b;
        iVar.getClass();
        kotlin.jvm.internal.j.e(value, "value");
        mc.a aVar = (mc.a) iVar.f5126c;
        aVar.a(aVar.f20966c, value.length() + 2);
        char[] cArr = aVar.f20965b;
        int i10 = aVar.f20966c;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = i.f56124b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    aVar.a(i13, 2);
                    char charAt = value.charAt(i14);
                    byte[] bArr2 = i.f56124b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i7 = i13 + 1;
                            aVar.f20965b[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = i.f56123a[charAt];
                                kotlin.jvm.internal.j.b(str);
                                aVar.a(i13, str.length());
                                str.getChars(0, str.length(), aVar.f20965b, i13);
                                int length3 = str.length() + i13;
                                aVar.f20966c = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = aVar.f20965b;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                aVar.f20966c = i13;
                            }
                        }
                    } else {
                        i7 = i13 + 1;
                        aVar.f20965b[i13] = charAt;
                    }
                    i13 = i7;
                }
                aVar.a(i13, 1);
                aVar.f20965b[i13] = '\"';
                aVar.f20966c = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        aVar.f20966c = i12 + 1;
    }

    public void k(me.d descriptor, int i7, String value) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(value, "value");
        b(descriptor, i7);
        j(value);
    }

    public void l(me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ca.i iVar = (ca.i) this.f56118b;
        iVar.getClass();
        iVar.f5125b = false;
        iVar.j(((j) this.d).f56130b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((u4.c) this.f56119c).A();
                return null;
            }
            return null;
        }
    }

    public void n(int i7, Serializable serializable) {
        ((Executor) this.f56118b).execute(new h01(this, i7, serializable, 28));
    }

    public void o() {
        boolean f10;
        int i7;
        s4.e eVar = (s4.e) this.f56119c;
        PackageManager packageManager = (PackageManager) this.f56120e;
        ArrayList arrayList = (ArrayList) this.f56121f;
        if (this.f56117a) {
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
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (x.f57062c == null) {
                        f10 = false;
                    } else {
                        f10 = x.c().f();
                    }
                    if (f10 && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            ComponentName componentName = ((r0) arrayList.get(i12)).f57025r;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 < 0) {
                        r0 r0Var = new r0((Context) this.f56118b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        r0Var.G = new p(this, r0Var);
                        if (!r0Var.f57028x) {
                            r0Var.f57028x = true;
                            r0Var.r();
                        }
                        i7 = i10 + 1;
                        arrayList.add(i10, r0Var);
                        eVar.a(r0Var, false);
                    } else if (i12 >= i10) {
                        r0 r0Var2 = (r0) arrayList.get(i12);
                        if (!r0Var2.f57028x) {
                            r0Var2.f57028x = true;
                            r0Var2.r();
                        }
                        if (r0Var2.E == null) {
                            if (!r0Var2.f57028x || (((n) r0Var2.h) == null && r0Var2.f57027w.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                r0Var2.q();
                                r0Var2.n();
                            }
                        }
                        i7 = i10 + 1;
                        Collections.swap(arrayList, i12, i10);
                    }
                    i10 = i7;
                }
            }
            if (i10 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
                    r0 r0Var3 = (r0) arrayList.get(size3);
                    u d = eVar.d(r0Var3);
                    if (d != null) {
                        r0Var3.getClass();
                        x.b();
                        r0Var3.f7213f = null;
                        r0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f56927a.b(514, d);
                        eVar.f56936l.remove(d);
                    }
                    arrayList.remove(r0Var3);
                    r0Var3.G = null;
                    if (r0Var3.f57028x) {
                        r0Var3.f57028x = false;
                        r0Var3.r();
                    }
                }
            }
        }
    }

    public boolean p(me.d dVar) {
        ((o0) this.f56121f).getClass();
        return false;
    }

    public h(Context context, s4.e eVar) {
        this.f56121f = new ArrayList();
        this.f56122g = new androidx.mediarouter.app.f(this, 12);
        this.h = new s0(this, 0);
        this.f56118b = context;
        this.f56119c = eVar;
        this.d = new Handler();
        this.f56120e = context.getPackageManager();
    }

    public h(AssetManager assetManager, Executor executor, u4.c cVar, String str, File file) {
        this.f56117a = false;
        this.f56118b = executor;
        this.f56119c = cVar;
        this.f56122g = str;
        this.f56120e = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 >= 24 && i7 <= 34) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = u4.d.h;
                    break;
                case 26:
                    bArr = u4.d.f58405g;
                    break;
                case 27:
                    bArr = u4.d.f58404f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = u4.d.f58403e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = u4.d.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
