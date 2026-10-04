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
import w9.p;
import x8.m;
import y8.b1;
import y8.k0;
import y8.v0;
import zd.y0;
public final class e implements Runnable {
    public final int f47529a;
    public final Object f47530b;
    public final Object f47531c;

    public e(int i10, Object obj, Object obj2) {
        this.f47529a = i10;
        this.f47531c = obj;
        this.f47530b = obj2;
    }

    @Override
    public final void run() {
        y8.d dVar;
        switch (this.f47529a) {
            case 0:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f47531c;
                ArrayList arrayList = (ArrayList) this.f47530b;
                shortcutInfoCompatSaverImpl.e(arrayList);
                File file = shortcutInfoCompatSaverImpl.f3101f;
                la.h hVar = new la.h(file);
                File file2 = (File) hVar.f15398c;
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
                        } catch (IOException e7) {
                            Log.e("AtomicFile", "Failed to close file output stream", e7);
                        }
                        la.h.U(file2, file);
                        return;
                    } catch (Exception e10) {
                        e = e10;
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
                l lVar = (l) this.f47531c;
                try {
                    ((l) this.f47530b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e13) {
                    lVar.l(e13);
                    return;
                }
            case 2:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f47531c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f3098b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f47530b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f3102g);
                    fVar.putAll(d.c(shortcutInfoCompatSaverImpl2.f3101f, shortcutInfoCompatSaverImpl2.f3097a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e14) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e14);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f47531c;
                shortcutInfoCompatSaverImpl3.f3098b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f3099c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((l) this.f47530b);
                return;
            case 4:
                if (!(((l) this.f47530b).f3922a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f47531c).run();
                        ((l) this.f47530b).k(null);
                        return;
                    } catch (Exception e15) {
                        ((l) this.f47530b).l(e15);
                        return;
                    }
                }
                return;
            case 5:
                p.a((p) this.f47531c, (da.b) this.f47530b);
                return;
            case 6:
                x1.a aVar = (x1.a) this.f47531c;
                Object obj2 = this.f47530b;
                if (aVar.f49161c.get()) {
                    a6.d dVar2 = aVar.f49162e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.f49162e;
                    if (dVar3.f317g != aVar) {
                        if (dVar3.h == aVar) {
                            SystemClock.uptimeMillis();
                            dVar3.h = null;
                            dVar3.b();
                        }
                    } else if (!dVar3.f314c) {
                        SystemClock.uptimeMillis();
                        dVar3.f317g = null;
                        w1.a aVar2 = dVar3.f312a;
                        if (aVar2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                aVar2.j(obj2);
                            } else {
                                aVar2.h(obj2);
                            }
                        }
                    }
                }
                aVar.f49160b = 3;
                return;
            case 7:
                DataHolder dataHolder = (DataHolder) this.f47530b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((m) this.f47531c).f49767c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f49760a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 8:
                ((m) this.f47531c).f49767c.onMessageReceived((k0) this.f47530b);
                return;
            case 9:
                ((m) this.f47531c).f49767c.onConnectedNodes((List) this.f47530b);
                return;
            case 10:
                ((m) this.f47531c).f49767c.onCapabilityChanged((y8.b) this.f47530b);
                return;
            case 11:
                ((m) this.f47531c).f49767c.onNotificationReceived((b1) this.f47530b);
                return;
            case 12:
                ((m) this.f47531c).f49767c.onEntityUpdate((v0) this.f47530b);
                return;
            case 13:
                y8.e eVar2 = (y8.e) this.f47530b;
                m mVar = (m) this.f47531c;
                eVar2.b(mVar.f49767c);
                dVar = mVar.f49767c.zzh;
                eVar2.b(dVar);
                return;
            default:
                ((zd.m) this.f47531c).D((y0) this.f47530b);
                return;
        }
    }

    public e(Object obj, Object obj2, boolean z10, int i10) {
        this.f47529a = i10;
        this.f47530b = obj;
        this.f47531c = obj2;
    }
}
