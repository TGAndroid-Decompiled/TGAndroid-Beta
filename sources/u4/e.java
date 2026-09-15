package u4;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.l;
import com.google.android.gms.common.data.DataHolder;
import i9.w;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m.e3;
import org.xmlpull.v1.XmlSerializer;
import w9.o;
import x8.m;
import y8.b1;
import y8.k0;
import y8.v0;
import zd.y0;
public final class e implements Runnable {
    public final int f43612a;
    public final Object f43613b;
    public final Object f43614c;

    public e(int i10, Object obj, Object obj2) {
        this.f43612a = i10;
        this.f43614c = obj;
        this.f43613b = obj2;
    }

    @Override
    public final void run() {
        y8.d dVar;
        switch (this.f43612a) {
            case 0:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f43614c;
                ArrayList arrayList = (ArrayList) this.f43613b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f2873f;
                e3 e3Var = new e3(file);
                File file2 = (File) e3Var.f14166c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream W = e3Var.W();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(W);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        int size = arrayList.size();
                        boolean z10 = false;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            d.h(newSerializer, (h) obj);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        W.flush();
                        try {
                            W.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            W.close();
                        } catch (IOException e) {
                            Log.e("AtomicFile", "Failed to close file output stream", e);
                        }
                        e3.T(file2, file);
                        return;
                    } catch (Exception e7) {
                        e = e7;
                        fileOutputStream = W;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e10) {
                                Log.e("AtomicFile", "Failed to close file output stream", e10);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                        }
                        throw new RuntimeException("Failed to write to file " + file, e);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            case 1:
                l lVar = (l) this.f43614c;
                try {
                    ((l) this.f43613b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e12) {
                    lVar.l(e12);
                    return;
                }
            case 2:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f43614c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2871b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f43613b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2874g);
                    fVar.putAll(d.c(shortcutInfoCompatSaverImpl2.f2873f, shortcutInfoCompatSaverImpl2.f2870a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e13) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e13);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f43614c;
                shortcutInfoCompatSaverImpl3.f2871b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2872c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((l) this.f43613b);
                return;
            case 4:
                if (!(((l) this.f43613b).f3631a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f43614c).run();
                        ((l) this.f43613b).k(null);
                        return;
                    } catch (Exception e14) {
                        ((l) this.f43613b).l(e14);
                        return;
                    }
                }
                return;
            case 5:
                o.a((o) this.f43614c, (da.b) this.f43613b);
                return;
            case 6:
                x1.a aVar = (x1.a) this.f43614c;
                Object obj2 = this.f43613b;
                if (aVar.f45137c.get()) {
                    a6.d dVar2 = aVar.e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.e;
                    if (dVar3.f292g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f290c) {
                        SystemClock.uptimeMillis();
                        dVar3.f292g = null;
                        w1.a aVar2 = dVar3.f288a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f45136b = 3;
                return;
            case 7:
                DataHolder dataHolder = (DataHolder) this.f43613b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((m) this.f43614c).f45695c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f45688a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((m) this.f43614c).f45695c.onMessageReceived((k0) this.f43613b);
                return;
            case 9:
                ((m) this.f43614c).f45695c.onConnectedNodes((List) this.f43613b);
                return;
            case 10:
                ((m) this.f43614c).f45695c.onCapabilityChanged((y8.b) this.f43613b);
                return;
            case 11:
                ((m) this.f43614c).f45695c.onNotificationReceived((b1) this.f43613b);
                return;
            case 12:
                ((m) this.f43614c).f45695c.onEntityUpdate((v0) this.f43613b);
                return;
            case 13:
                y8.e eVar2 = (y8.e) this.f43613b;
                m mVar = (m) this.f43614c;
                eVar2.b(mVar.f45695c);
                dVar = mVar.f45695c.zzh;
                eVar2.b(dVar);
                return;
            default:
                ((zd.m) this.f43614c).D((y0) this.f43613b);
                return;
        }
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f43612a = i10;
        this.f43613b = obj;
        this.f43614c = obj2;
    }
}
