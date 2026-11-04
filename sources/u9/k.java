package u9;

import a9.k0;
import android.content.Intent;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import l9.y;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.mz;
import org.telegram.ui.LaunchActivity;
import org.xmlpull.v1.XmlSerializer;
import wd.v0;
public final class k implements Runnable {
    public final int f55768a;
    public Object f55769b;
    public final Object f55770c;

    public k(int i3, Object obj, Object obj2) {
        this.f55768a = i3;
        this.f55770c = obj;
        this.f55769b = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: u9.k.a():void");
    }

    @Override
    public final void run() {
        Exception exc;
        boolean z10;
        switch (this.f55768a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e10) {
                    synchronized (((l) this.f55770c).f55773b) {
                        ((l) this.f55770c).f55774c = 1;
                        throw e10;
                    }
                }
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f55770c;
                ArrayList arrayList = (ArrayList) this.f55769b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f2314f;
                p7.d dVar = new p7.d(file);
                File file2 = (File) dVar.d;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream G = dVar.G();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(G);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            w4.d.h(newSerializer, (w4.f) obj);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        G.flush();
                        try {
                            G.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                            z10 = false;
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            G.close();
                        } catch (IOException e11) {
                            Log.e("AtomicFile", "Failed to close file output stream", e11);
                        }
                        p7.d.D(file2, file);
                        return;
                    } catch (Exception e12) {
                        exc = e12;
                        fileOutputStream = G;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                Log.e("AtomicFile", "Failed to close file output stream", e13);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                        }
                        throw new RuntimeException("Failed to write to file " + file, exc);
                    }
                } catch (Exception e14) {
                    exc = e14;
                }
            case 2:
                c0.m mVar = (c0.m) this.f55770c;
                try {
                    ((c0.m) this.f55769b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e15) {
                    mVar.l(e15);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f55770c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2311b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f55769b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2315g);
                    fVar.putAll(w4.d.c(shortcutInfoCompatSaverImpl2.f2314f, shortcutInfoCompatSaverImpl2.f2310a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e16) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e16);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f55770c;
                shortcutInfoCompatSaverImpl3.f2311b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2312c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.m) this.f55769b);
                return;
            case 5:
                if (!(((c0.m) this.f55770c).f3949a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f55769b).run();
                        ((c0.m) this.f55770c).k(null);
                        return;
                    } catch (Exception e17) {
                        ((c0.m) this.f55770c).l(e17);
                        return;
                    }
                }
                return;
            case 6:
                ((wd.m) this.f55770c).D((v0) this.f55769b);
                return;
            case 7:
                ((wd.m) this.f55769b).D((xd.c) this.f55770c);
                return;
            case 8:
                z1.a aVar = (z1.a) this.f55770c;
                Object obj2 = this.f55769b;
                if (aVar.f59568c.get()) {
                    c6.d dVar2 = aVar.f59569e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    c6.d dVar3 = aVar.f59569e;
                    if (dVar3.f4226g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f4223c) {
                        SystemClock.uptimeMillis();
                        dVar3.f4226g = null;
                        y1.a aVar2 = dVar3.f4221a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f59567b = 3;
                return;
            case 9:
                DataHolder dataHolder = (DataHolder) this.f55769b;
                int i10 = dataHolder.f6789e;
                try {
                    ((z8.d) this.f55770c).f60152c.getClass();
                    if (dataHolder != null) {
                        return;
                    }
                    return;
                } finally {
                    if (dataHolder != null) {
                        dataHolder.close();
                    }
                }
            case 10:
                WearAuthListenerService wearAuthListenerService = ((z8.d) this.f55770c).f60152c;
                k0 k0Var = (k0) this.f55769b;
                String str = k0Var.f215b;
                String str2 = k0Var.d;
                byte[] bArr = k0Var.f216c;
                if ("/tg-wear-auth/offer".equals(str)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e18) {
                        a8.e("wear-auth: failed to pop LaunchActivity", e18);
                    }
                }
                g0.h3(new mz(bArr, str, str2));
                return;
            case 11:
                ((z8.d) this.f55770c).f60152c.getClass();
                return;
            default:
                a9.e eVar = (a9.e) this.f55769b;
                z8.d dVar4 = (z8.d) this.f55770c;
                eVar.b(dVar4.f60152c);
                eVar.b(dVar4.f60152c.f21404n);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f55768a) {
            case 0:
                Runnable runnable = (Runnable) this.f55769b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i3 = ((l) this.f55770c).f55774c;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public k(Object obj, Object obj2, boolean z10, int i3) {
        this.f55768a = i3;
        this.f55769b = obj;
        this.f55770c = obj2;
    }

    public k(l lVar) {
        this.f55768a = 0;
        this.f55770c = lVar;
    }
}
