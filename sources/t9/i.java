package t9;

import aa.b0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.m;
import com.google.android.gms.common.data.DataHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.y;
import org.xmlpull.v1.XmlSerializer;
import y9.p;
import z8.c1;
import z8.l0;
import z8.w0;
public final class i implements Runnable {
    public final int f48745a;
    public Object f48746b;
    public final Object f48747c;

    public i(int i10, Object obj, Object obj2) {
        this.f48745a = i10;
        this.f48747c = obj;
        this.f48746b = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: t9.i.a():void");
    }

    @Override
    public final void run() {
        Exception exc;
        FileOutputStream J;
        boolean z10;
        z8.e eVar;
        switch (this.f48745a) {
            case 0:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((j) this.f48747c).f48750b) {
                        ((j) this.f48747c).f48751c = 1;
                        throw e;
                    }
                }
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f48747c;
                ArrayList arrayList = (ArrayList) this.f48746b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f3094f;
                k6.c cVar = new k6.c(file);
                File file2 = (File) cVar.f16407c;
                FileOutputStream fileOutputStream = null;
                try {
                    J = cVar.J();
                } catch (Exception e10) {
                    exc = e10;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(J);
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
                    J.flush();
                    try {
                        J.getFD().sync();
                        z10 = true;
                    } catch (IOException unused) {
                        z10 = false;
                    }
                    if (!z10) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        J.close();
                    } catch (IOException e11) {
                        Log.e("AtomicFile", "Failed to close file output stream", e11);
                    }
                    k6.c.G(file2, file);
                    return;
                } catch (Exception e12) {
                    exc = e12;
                    fileOutputStream = J;
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
            case 2:
                m mVar = (m) this.f48747c;
                try {
                    ((m) this.f48746b).get();
                    mVar.k(null);
                    return;
                } catch (Exception e14) {
                    mVar.l(e14);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f48747c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f3092b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f48746b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f3095g);
                    fVar.putAll(u4.d.c(shortcutInfoCompatSaverImpl2.f3091a, shortcutInfoCompatSaverImpl2.f3094f));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e15) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e15);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f48747c;
                shortcutInfoCompatSaverImpl3.f3092b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f3093c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((m) this.f48746b);
                return;
            case 5:
                if (!(((m) this.f48747c).f5906a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f48746b).run();
                        ((m) this.f48747c).k(null);
                        return;
                    } catch (Exception e16) {
                        ((m) this.f48747c).l(e16);
                        return;
                    }
                }
                return;
            case 6:
                x1.a aVar = (x1.a) this.f48747c;
                Object obj2 = this.f48746b;
                if (aVar.f51286c.get()) {
                    b6.d dVar = aVar.e;
                    if (dVar.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar.h = null;
                        dVar.b();
                    }
                } else {
                    b6.d dVar2 = aVar.e;
                    if (dVar2.f3661g != aVar) {
                        if (dVar2.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar2.h = null;
                            dVar2.b();
                        }
                    } else if (!dVar2.f3659c) {
                        SystemClock.uptimeMillis();
                        dVar2.f3661g = null;
                        w1.a aVar2 = dVar2.f3657a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f51285b = 3;
                return;
            case 7:
                DataHolder dataHolder = (DataHolder) this.f48746b;
                y8.e eVar2 = new y8.e(dataHolder);
                try {
                    ((y8.m) this.f48747c).f52399c.onDataChanged(eVar2);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar2.f52392a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((y8.m) this.f48747c).f52399c.onMessageReceived((l0) this.f48746b);
                return;
            case 9:
                ((y8.m) this.f48747c).f52399c.onConnectedNodes((List) this.f48746b);
                return;
            case 10:
                ((y8.m) this.f48747c).f52399c.onCapabilityChanged((z8.c) this.f48746b);
                return;
            case 11:
                ((y8.m) this.f48747c).f52399c.onNotificationReceived((c1) this.f48746b);
                return;
            case 12:
                ((y8.m) this.f48747c).f52399c.onEntityUpdate((w0) this.f48746b);
                return;
            case 13:
                z8.f fVar3 = (z8.f) this.f48746b;
                y8.m mVar2 = (y8.m) this.f48747c;
                fVar3.b(mVar2.f52399c);
                eVar = mVar2.f52399c.zzh;
                fVar3.b(eVar);
                return;
            default:
                p.a((p) this.f48747c, (b0) this.f48746b);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f48745a) {
            case 0:
                Runnable runnable = (Runnable) this.f48746b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i10 = ((j) this.f48747c).f48751c;
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

    public i(j jVar) {
        this.f48745a = 0;
        this.f48747c = jVar;
    }

    public i(m mVar, m mVar2) {
        this.f48745a = 2;
        this.f48746b = mVar;
        this.f48747c = mVar2;
    }
}
