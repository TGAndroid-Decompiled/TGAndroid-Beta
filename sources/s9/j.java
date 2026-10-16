package s9;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.m;
import com.google.android.gms.common.data.DataHolder;
import j9.y;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.h3;
import org.xmlpull.v1.XmlSerializer;
import x9.p;
import y8.b1;
import y8.k0;
import y8.v0;
public final class j implements Runnable {
    public final int f45067a;
    public Object f45068b;
    public final Object f45069c;

    public j(int i10, Object obj, Object obj2) {
        this.f45067a = i10;
        this.f45069c = obj;
        this.f45068b = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: s9.j.a():void");
    }

    @Override
    public final void run() {
        Exception exc;
        FileOutputStream W;
        boolean z10;
        y8.d dVar;
        switch (this.f45067a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((k) this.f45069c).f45072b) {
                        ((k) this.f45069c).f45073c = 1;
                        throw e;
                    }
                }
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f45069c;
                ArrayList arrayList = (ArrayList) this.f45068b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f2031f;
                h3 h3Var = new h3(file);
                File file2 = (File) h3Var.f14851c;
                FileOutputStream fileOutputStream = null;
                try {
                    W = h3Var.W();
                } catch (Exception e7) {
                    exc = e7;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(W);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        u4.d.h(newSerializer, (u4.g) obj);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    W.flush();
                    try {
                        W.getFD().sync();
                        z10 = true;
                    } catch (IOException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        W.close();
                    } catch (IOException e10) {
                        Log.e("AtomicFile", "Failed to close file output stream", e10);
                    }
                    h3.T(file2, file);
                    return;
                } catch (Exception e11) {
                    exc = e11;
                    fileOutputStream = W;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused2) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            Log.e("AtomicFile", "Failed to close file output stream", e12);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 2:
                m mVar = (m) this.f45069c;
                try {
                    ((m) this.f45068b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e13) {
                    mVar.l(e13);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f45069c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2029b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f45068b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2032g);
                    fVar.putAll(u4.d.c(shortcutInfoCompatSaverImpl2.f2031f, shortcutInfoCompatSaverImpl2.f2028a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e14) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e14);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f45069c;
                shortcutInfoCompatSaverImpl3.f2029b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2030c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((m) this.f45068b);
                return;
            case 5:
                if (!(((m) this.f45069c).f4099a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f45068b).run();
                        ((m) this.f45069c).k(null);
                        return;
                    } catch (Exception e15) {
                        ((m) this.f45069c).l(e15);
                        return;
                    }
                }
                return;
            case 6:
                x1.a aVar = (x1.a) this.f45069c;
                Object obj2 = this.f45068b;
                if (aVar.f47721c.get()) {
                    a6.d dVar2 = aVar.e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.e;
                    if (dVar3.f298g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f296c) {
                        SystemClock.uptimeMillis();
                        dVar3.f298g = null;
                        w1.a aVar2 = dVar3.f294a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f47720b = 3;
                return;
            case 7:
                DataHolder dataHolder = (DataHolder) this.f45068b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((x8.m) this.f45069c).f48264c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f48257a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((x8.m) this.f45069c).f48264c.onMessageReceived((k0) this.f45068b);
                return;
            case 9:
                ((x8.m) this.f45069c).f48264c.onConnectedNodes((List) this.f45068b);
                return;
            case 10:
                ((x8.m) this.f45069c).f48264c.onCapabilityChanged((y8.b) this.f45068b);
                return;
            case 11:
                ((x8.m) this.f45069c).f48264c.onNotificationReceived((b1) this.f45068b);
                return;
            case 12:
                ((x8.m) this.f45069c).f48264c.onEntityUpdate((v0) this.f45068b);
                return;
            case 13:
                y8.e eVar2 = (y8.e) this.f45068b;
                x8.m mVar2 = (x8.m) this.f45069c;
                eVar2.b(mVar2.f48264c);
                dVar = mVar2.f48264c.zzh;
                eVar2.b(dVar);
                return;
            default:
                p.a((p) this.f45069c, (ea.b) this.f45068b);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f45067a) {
            case 0:
                Runnable runnable = (Runnable) this.f45068b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((k) this.f45069c).f45073c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
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

    public j(k kVar) {
        this.f45067a = 0;
        this.f45069c = kVar;
    }

    public j(m mVar, m mVar2) {
        this.f45067a = 2;
        this.f45068b = mVar;
        this.f45069c = mVar2;
    }
}
