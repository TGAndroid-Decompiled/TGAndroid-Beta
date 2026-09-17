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
import m2.t;
import org.xmlpull.v1.XmlSerializer;
import w9.o;
import x8.m;
import y8.b1;
import y8.k0;
import y8.v0;
import zd.y0;
public final class e implements Runnable {
    public final int f46968a;
    public final Object f46969b;
    public final Object f46970c;

    public e(int i10, Object obj, Object obj2) {
        this.f46968a = i10;
        this.f46970c = obj;
        this.f46969b = obj2;
    }

    @Override
    public final void run() {
        y8.d dVar;
        switch (this.f46968a) {
            case 0:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f46970c;
                ArrayList arrayList = (ArrayList) this.f46969b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f1934f;
                t tVar = new t(file);
                File file2 = (File) tVar.f15845c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream Q = tVar.Q();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Q);
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
                        Q.flush();
                        try {
                            Q.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            Q.close();
                        } catch (IOException e7) {
                            Log.e("AtomicFile", "Failed to close file output stream", e7);
                        }
                        t.N(file2, file);
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = Q;
                        Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.getFD().sync();
                            } catch (IOException unused2) {
                                Log.e("AtomicFile", "Failed to sync file output stream");
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e11) {
                                Log.e("AtomicFile", "Failed to close file output stream", e11);
                            }
                            if (!file2.delete()) {
                                Log.e("AtomicFile", "Failed to delete new file " + file2);
                            }
                        }
                        throw new RuntimeException("Failed to write to file " + file, e);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 1:
                l lVar = (l) this.f46970c;
                try {
                    ((l) this.f46969b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e13) {
                    lVar.l(e13);
                    return;
                }
            case 2:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f46970c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f1931b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f46969b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f1935g);
                    fVar.putAll(d.c(shortcutInfoCompatSaverImpl2.f1934f, shortcutInfoCompatSaverImpl2.f1930a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e14) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e14);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f46970c;
                shortcutInfoCompatSaverImpl3.f1931b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f1932c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((l) this.f46969b);
                return;
            case 4:
                if (!(((l) this.f46969b).f4144a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f46970c).run();
                        ((l) this.f46969b).k(null);
                        return;
                    } catch (Exception e15) {
                        ((l) this.f46969b).l(e15);
                        return;
                    }
                }
                return;
            case 5:
                o.a((o) this.f46970c, (da.b) this.f46969b);
                return;
            case 6:
                x1.a aVar = (x1.a) this.f46970c;
                Object obj2 = this.f46969b;
                if (aVar.f48710c.get()) {
                    a6.d dVar2 = aVar.f48711e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.f48711e;
                    if (dVar3.f315g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f312c) {
                        SystemClock.uptimeMillis();
                        dVar3.f315g = null;
                        w1.a aVar2 = dVar3.f310a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f48709b = 3;
                return;
            case 7:
                DataHolder dataHolder = (DataHolder) this.f46969b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((m) this.f46970c).f49316c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f49309a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((m) this.f46970c).f49316c.onMessageReceived((k0) this.f46969b);
                return;
            case 9:
                ((m) this.f46970c).f49316c.onConnectedNodes((List) this.f46969b);
                return;
            case 10:
                ((m) this.f46970c).f49316c.onCapabilityChanged((y8.b) this.f46969b);
                return;
            case 11:
                ((m) this.f46970c).f49316c.onNotificationReceived((b1) this.f46969b);
                return;
            case 12:
                ((m) this.f46970c).f49316c.onEntityUpdate((v0) this.f46969b);
                return;
            case 13:
                y8.e eVar2 = (y8.e) this.f46969b;
                m mVar = (m) this.f46970c;
                eVar2.b(mVar.f49316c);
                dVar = mVar.f49316c.zzh;
                eVar2.b(dVar);
                return;
            default:
                ((zd.m) this.f46970c).D((y0) this.f46969b);
                return;
        }
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f46968a = i10;
        this.f46969b = obj;
        this.f46970c = obj2;
    }
}
