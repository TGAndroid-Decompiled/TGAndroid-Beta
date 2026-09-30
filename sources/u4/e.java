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
import org.xmlpull.v1.XmlSerializer;
import w9.o;
import x8.m;
import y8.b1;
import y8.k0;
import y8.v0;
import zd.y0;
public final class e implements Runnable {
    public final int f43899a;
    public final Object f43900b;
    public final Object f43901c;

    public e(int i10, Object obj, Object obj2) {
        this.f43899a = i10;
        this.f43901c = obj;
        this.f43900b = obj2;
    }

    @Override
    public final void run() {
        y8.d dVar;
        switch (this.f43899a) {
            case 0:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f43901c;
                ArrayList arrayList = (ArrayList) this.f43900b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f2870f;
                la.h hVar = new la.h(file);
                File file2 = (File) hVar.f14168c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream X = hVar.X();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(X);
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
                        X.flush();
                        try {
                            X.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            X.close();
                        } catch (IOException e) {
                            Log.e("AtomicFile", "Failed to close file output stream", e);
                        }
                        la.h.U(file2, file);
                        return;
                    } catch (Exception e7) {
                        e = e7;
                        fileOutputStream = X;
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
                l lVar = (l) this.f43901c;
                try {
                    ((l) this.f43900b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e12) {
                    lVar.l(e12);
                    return;
                }
            case 2:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f43901c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2868b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f43900b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2871g);
                    fVar.putAll(d.c(shortcutInfoCompatSaverImpl2.f2870f, shortcutInfoCompatSaverImpl2.f2867a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e13) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e13);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f43901c;
                shortcutInfoCompatSaverImpl3.f2868b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2869c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((l) this.f43900b);
                return;
            case 4:
                if (!(((l) this.f43900b).f3628a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f43901c).run();
                        ((l) this.f43900b).k(null);
                        return;
                    } catch (Exception e14) {
                        ((l) this.f43900b).l(e14);
                        return;
                    }
                }
                return;
            case 5:
                o.a((o) this.f43901c, (da.b) this.f43900b);
                return;
            case 6:
                x1.a aVar = (x1.a) this.f43901c;
                Object obj2 = this.f43900b;
                if (aVar.f45417c.get()) {
                    a6.d dVar2 = aVar.e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.e;
                    if (dVar3.f294g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f292c) {
                        SystemClock.uptimeMillis();
                        dVar3.f294g = null;
                        w1.a aVar2 = dVar3.f290a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f45416b = 3;
                return;
            case 7:
                DataHolder dataHolder = (DataHolder) this.f43900b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((m) this.f43901c).f45975c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f45968a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((m) this.f43901c).f45975c.onMessageReceived((k0) this.f43900b);
                return;
            case 9:
                ((m) this.f43901c).f45975c.onConnectedNodes((List) this.f43900b);
                return;
            case 10:
                ((m) this.f43901c).f45975c.onCapabilityChanged((y8.b) this.f43900b);
                return;
            case 11:
                ((m) this.f43901c).f45975c.onNotificationReceived((b1) this.f43900b);
                return;
            case 12:
                ((m) this.f43901c).f45975c.onEntityUpdate((v0) this.f43900b);
                return;
            case 13:
                y8.e eVar2 = (y8.e) this.f43900b;
                m mVar = (m) this.f43901c;
                eVar2.b(mVar.f45975c);
                dVar = mVar.f45975c.zzh;
                eVar2.b(dVar);
                return;
            default:
                ((zd.m) this.f43901c).D((y0) this.f43900b);
                return;
        }
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f43899a = i10;
        this.f43900b = obj;
        this.f43901c = obj2;
    }
}
