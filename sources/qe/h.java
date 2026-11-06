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
import h2.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.dt;
import org.telegram.ui.d10;
import s4.n;
import s4.r0;
import s4.u;
import s4.x;
public final class h {
    public boolean f53979a;
    public final Object f53980b;
    public final Object f53981c;
    public final Object d;
    public final Object f53982e;
    public Object f53983f;
    public Object f53984g;
    public Object h;

    public h(ca.i composer, pe.b bVar, j jVar, h[] hVarArr) {
        kotlin.jvm.internal.j.e(composer, "composer");
        this.f53980b = composer;
        this.f53981c = bVar;
        this.d = jVar;
        this.f53982e = hVarArr;
        this.f53983f = bVar.f53459a;
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
        h[] hVarArr = (h[]) this.f53982e;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        pe.b bVar = (pe.b) this.f53981c;
        j f10 = f.f(descriptor, bVar);
        char c10 = f10.f53991a;
        ca.i iVar = (ca.i) this.f53980b;
        iVar.j(c10);
        iVar.f6015b = true;
        String str = (String) this.f53984g;
        if (str != null) {
            String str2 = (String) this.h;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            iVar.i();
            j(str);
            iVar.j(':');
            j(str2);
            this.f53984g = null;
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
        ca.i iVar = (ca.i) this.f53980b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        int ordinal = ((j) this.d).ordinal();
        boolean z9 = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!iVar.f6015b) {
                        iVar.j(',');
                    }
                    iVar.i();
                    f.e(descriptor, (pe.b) this.f53981c);
                    j(descriptor.g(i7));
                    iVar.j(':');
                    iVar.k();
                    return;
                }
                if (i7 == 0) {
                    this.f53979a = true;
                }
                if (i7 == 1) {
                    iVar.j(',');
                    iVar.k();
                    this.f53979a = false;
                    return;
                }
                return;
            } else if (!iVar.f6015b) {
                if (i7 % 2 == 0) {
                    iVar.j(',');
                    iVar.i();
                } else {
                    iVar.j(':');
                    iVar.k();
                    z9 = false;
                }
                this.f53979a = z9;
                return;
            } else {
                this.f53979a = true;
                iVar.i();
                return;
            }
        }
        if (!iVar.f6015b) {
            iVar.j(',');
        }
        iVar.i();
    }

    public void c(int i7) {
        if (this.f53979a) {
            j(String.valueOf(i7));
        } else {
            ((mc.a) ((ca.i) this.f53980b).f6016c).c(String.valueOf(i7));
        }
    }

    public void d(long j3) {
        if (this.f53979a) {
            j(String.valueOf(j3));
        } else {
            ((mc.a) ((ca.i) this.f53980b).f6016c).c(String.valueOf(j3));
        }
    }

    public void e(me.d descriptor, int i7, long j3) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        b(descriptor, i7);
        d(j3);
    }

    public void f() {
        ca.i iVar = (ca.i) this.f53980b;
        iVar.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((mc.a) iVar.f6016c).c("null");
    }

    public void g(me.d descriptor, int i7, ke.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        if (obj == null && !((p0) this.f53983f).f14132b) {
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
        ca.i iVar = (ca.i) this.f53980b;
        iVar.getClass();
        kotlin.jvm.internal.j.e(value, "value");
        mc.a aVar = (mc.a) iVar.f6016c;
        aVar.a(aVar.f20002c, value.length() + 2);
        char[] cArr = aVar.f20001b;
        int i10 = aVar.f20002c;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = i.f53986b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    aVar.a(i13, 2);
                    char charAt = value.charAt(i14);
                    byte[] bArr2 = i.f53986b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i7 = i13 + 1;
                            aVar.f20001b[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = i.f53985a[charAt];
                                kotlin.jvm.internal.j.b(str);
                                aVar.a(i13, str.length());
                                str.getChars(0, str.length(), aVar.f20001b, i13);
                                int length3 = str.length() + i13;
                                aVar.f20002c = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = aVar.f20001b;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                aVar.f20002c = i13;
                            }
                        }
                    } else {
                        i7 = i13 + 1;
                        aVar.f20001b[i13] = charAt;
                    }
                    i13 = i7;
                }
                aVar.a(i13, 1);
                aVar.f20001b[i13] = '\"';
                aVar.f20002c = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        aVar.f20002c = i12 + 1;
    }

    public void k(me.d descriptor, int i7, String value) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(value, "value");
        b(descriptor, i7);
        j(value);
    }

    public void l(me.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        ca.i iVar = (ca.i) this.f53980b;
        iVar.getClass();
        iVar.f6015b = false;
        iVar.j(((j) this.d).f53992b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                ((u4.c) this.f53981c).L();
                return null;
            }
            return null;
        }
    }

    public void n(int i7, Serializable serializable) {
        ((Executor) this.f53980b).execute(new d10(this, i7, serializable, 25));
    }

    public void o() {
        boolean f10;
        int i7;
        s4.e eVar = (s4.e) this.f53981c;
        PackageManager packageManager = (PackageManager) this.f53982e;
        ArrayList arrayList = (ArrayList) this.f53983f;
        if (this.f53979a) {
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
                boolean z9 = true;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    if (x.f54804c == null) {
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
                            ComponentName componentName = ((r0) arrayList.get(i12)).f54769r;
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
                        r0 r0Var = new r0((Context) this.f53980b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        r0Var.F = new m3(this, r0Var);
                        if (!r0Var.f54772x) {
                            r0Var.f54772x = true;
                            r0Var.r();
                        }
                        i7 = i10 + 1;
                        arrayList.add(i10, r0Var);
                        eVar.a(r0Var, false);
                    } else if (i12 >= i10) {
                        r0 r0Var2 = (r0) arrayList.get(i12);
                        if (!r0Var2.f54772x) {
                            r0Var2.f54772x = true;
                            r0Var2.r();
                        }
                        if (r0Var2.D == null) {
                            if (!r0Var2.f54772x || (((n) r0Var2.h) == null && r0Var2.f54771w.isEmpty())) {
                                z9 = false;
                            }
                            if (z9) {
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
                        r0Var3.f7537f = null;
                        r0Var3.h(null);
                        eVar.m(d, null);
                        eVar.f54671a.b(514, d);
                        eVar.f54680l.remove(d);
                    }
                    arrayList.remove(r0Var3);
                    r0Var3.F = null;
                    if (r0Var3.f54772x) {
                        r0Var3.f54772x = false;
                        r0Var3.r();
                    }
                }
            }
        }
    }

    public boolean p(me.d dVar) {
        ((p0) this.f53983f).getClass();
        return false;
    }

    public h(Context context, s4.e eVar) {
        this.f53983f = new ArrayList();
        this.f53984g = new androidx.mediarouter.app.f(this, 12);
        this.h = new dt(this, 27);
        this.f53980b = context;
        this.f53981c = eVar;
        this.d = new Handler();
        this.f53982e = context.getPackageManager();
    }

    public h(AssetManager assetManager, Executor executor, u4.c cVar, String str, File file) {
        this.f53979a = false;
        this.f53980b = executor;
        this.f53981c = cVar;
        this.f53984g = str;
        this.f53982e = file;
        int i7 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i7 >= 24 && i7 <= 34) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = u4.d.h;
                    break;
                case 26:
                    bArr = u4.d.f56214g;
                    break;
                case 27:
                    bArr = u4.d.f56213f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = u4.d.f56212e;
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
