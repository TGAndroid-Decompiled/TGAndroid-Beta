package s4;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.common.data.DataHolder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;
public final class v implements Runnable {
    public final int f47923a;
    public final Object f47924b;
    public final Object f47925c;

    public v(int i10, Object obj, Object obj2) {
        this.f47923a = i10;
        this.f47925c = obj;
        this.f47924b = obj2;
    }

    @Override
    public final void run() {
        y8.d dVar;
        switch (this.f47923a) {
            case 0:
                u uVar = (u) this.f47924b;
                d1 d1Var = uVar.f47912e;
                z zVar = (z) this.f47925c;
                RecyclerView recyclerView = zVar.H;
                if (recyclerView != null && recyclerView.G && !uVar.v && d1Var.b() != -1) {
                    n0 itemAnimator = zVar.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = zVar.F;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (((u) arrayList.get(i10)).f47917w) {
                            }
                        }
                        zVar.f47949x.q(d1Var);
                        return;
                    }
                    zVar.H.post(this);
                    return;
                }
                return;
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f47925c;
                ArrayList arrayList2 = (ArrayList) this.f47924b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f3180f;
                la.h hVar = new la.h(file);
                File file2 = (File) hVar.f15502c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream Y = hVar.Y();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Y);
                        XmlSerializer newSerializer = Xml.newSerializer();
                        newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                        newSerializer.startDocument(null, Boolean.TRUE);
                        newSerializer.startTag(null, "share_targets");
                        int size2 = arrayList2.size();
                        boolean z10 = false;
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            u4.d.h(newSerializer, (u4.g) obj);
                        }
                        newSerializer.endTag(null, "share_targets");
                        newSerializer.endDocument();
                        bufferedOutputStream.flush();
                        Y.flush();
                        try {
                            Y.getFD().sync();
                            z10 = true;
                        } catch (IOException unused) {
                        }
                        if (!z10) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            Y.close();
                        } catch (IOException e7) {
                            Log.e("AtomicFile", "Failed to close file output stream", e7);
                        }
                        la.h.V(file2, file);
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        fileOutputStream = Y;
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
            case 2:
                c0.l lVar = (c0.l) this.f47925c;
                try {
                    ((c0.l) this.f47924b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e13) {
                    lVar.l(e13);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f47925c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f3177b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f47924b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f3181g);
                    fVar.putAll(u4.d.c(shortcutInfoCompatSaverImpl2.f3180f, shortcutInfoCompatSaverImpl2.f3176a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e14) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e14);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f47925c;
                shortcutInfoCompatSaverImpl3.f3177b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f3178c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((i9.w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.f47924b);
                return;
            case 5:
                if (!(((c0.l) this.f47924b).f3972a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f47925c).run();
                        ((c0.l) this.f47924b).k(null);
                        return;
                    } catch (Exception e15) {
                        ((c0.l) this.f47924b).l(e15);
                        return;
                    }
                }
                return;
            case 6:
                w9.o.a((w9.o) this.f47925c, (da.c) this.f47924b);
                return;
            case 7:
                x1.a aVar = (x1.a) this.f47925c;
                Object obj2 = this.f47924b;
                if (aVar.f50577c.get()) {
                    a6.d dVar2 = aVar.f50578e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.f50578e;
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
                aVar.f50576b = 3;
                return;
            case 8:
                DataHolder dataHolder = (DataHolder) this.f47924b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((x8.m) this.f47925c).f51183c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f51176a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 9:
                ((x8.m) this.f47925c).f51183c.onMessageReceived((y8.k0) this.f47924b);
                return;
            case 10:
                ((x8.m) this.f47925c).f51183c.onConnectedNodes((List) this.f47924b);
                return;
            case 11:
                ((x8.m) this.f47925c).f51183c.onCapabilityChanged((y8.b) this.f47924b);
                return;
            case 12:
                ((x8.m) this.f47925c).f51183c.onNotificationReceived((y8.b1) this.f47924b);
                return;
            case 13:
                ((x8.m) this.f47925c).f51183c.onEntityUpdate((y8.v0) this.f47924b);
                return;
            default:
                y8.e eVar2 = (y8.e) this.f47924b;
                x8.m mVar = (x8.m) this.f47925c;
                eVar2.b(mVar.f51183c);
                dVar = mVar.f51183c.zzh;
                eVar2.b(dVar);
                return;
        }
    }

    public v(c0.l lVar, Object obj, int i10) {
        this.f47923a = i10;
        this.f47924b = lVar;
        this.f47925c = obj;
    }

    public v(z zVar, u uVar, int i10) {
        this.f47923a = 0;
        this.f47925c = zVar;
        this.f47924b = uVar;
    }
}
