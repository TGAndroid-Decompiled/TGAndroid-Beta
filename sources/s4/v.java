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
import m.f3;
import org.xmlpull.v1.XmlSerializer;
public final class v implements Runnable {
    public final int f48030a;
    public final Object f48031b;
    public final Object f48032c;

    public v(int i10, Object obj, Object obj2) {
        this.f48030a = i10;
        this.f48032c = obj;
        this.f48031b = obj2;
    }

    @Override
    public final void run() {
        y8.d dVar;
        switch (this.f48030a) {
            case 0:
                u uVar = (u) this.f48031b;
                d1 d1Var = uVar.f48019e;
                z zVar = (z) this.f48032c;
                RecyclerView recyclerView = zVar.H;
                if (recyclerView != null && recyclerView.G && !uVar.v && d1Var.b() != -1) {
                    n0 itemAnimator = zVar.H.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList = zVar.F;
                        int size = arrayList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (((u) arrayList.get(i10)).f48024w) {
                            }
                        }
                        zVar.f48056x.q(d1Var);
                        return;
                    }
                    zVar.H.post(this);
                    return;
                }
                return;
            case 1:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f48032c;
                ArrayList arrayList2 = (ArrayList) this.f48031b;
                shortcutInfoCompatSaverImpl.e(arrayList2);
                File file = shortcutInfoCompatSaverImpl.f3178f;
                f3 f3Var = new f3(file);
                File file2 = (File) f3Var.f15424c;
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream X = f3Var.X();
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(X);
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
                        f3.U(file2, file);
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
            case 2:
                c0.l lVar = (c0.l) this.f48032c;
                try {
                    ((c0.l) this.f48031b).get();
                    lVar.k(null);
                    return;
                } catch (Exception e13) {
                    lVar.l(e13);
                    return;
                }
            case 3:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f48032c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f3175b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f48031b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f3179g);
                    fVar.putAll(u4.d.c(shortcutInfoCompatSaverImpl2.f3178f, shortcutInfoCompatSaverImpl2.f3174a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e14) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e14);
                    return;
                }
            case 4:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f48032c;
                shortcutInfoCompatSaverImpl3.f3175b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f3176c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((i9.w) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.l) this.f48031b);
                return;
            case 5:
                if (!(((c0.l) this.f48031b).f3971a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f48032c).run();
                        ((c0.l) this.f48031b).k(null);
                        return;
                    } catch (Exception e15) {
                        ((c0.l) this.f48031b).l(e15);
                        return;
                    }
                }
                return;
            case 6:
                w9.p.a((w9.p) this.f48032c, (da.c) this.f48031b);
                return;
            case 7:
                x1.a aVar = (x1.a) this.f48032c;
                Object obj2 = this.f48031b;
                if (aVar.f50684c.get()) {
                    a6.d dVar2 = aVar.f50685e;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.b();
                    }
                } else {
                    a6.d dVar3 = aVar.f50685e;
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
                aVar.f50683b = 3;
                return;
            case 8:
                DataHolder dataHolder = (DataHolder) this.f48031b;
                x8.e eVar = new x8.e(dataHolder);
                try {
                    ((x8.m) this.f48032c).f51290c.onDataChanged(eVar);
                    if (dataHolder != null) {
                        dataHolder.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    DataHolder dataHolder2 = eVar.f51283a;
                    if (dataHolder2 != null) {
                        dataHolder2.close();
                    }
                    throw th2;
                }
            case 9:
                ((x8.m) this.f48032c).f51290c.onMessageReceived((y8.k0) this.f48031b);
                return;
            case 10:
                ((x8.m) this.f48032c).f51290c.onConnectedNodes((List) this.f48031b);
                return;
            case 11:
                ((x8.m) this.f48032c).f51290c.onCapabilityChanged((y8.b) this.f48031b);
                return;
            case 12:
                ((x8.m) this.f48032c).f51290c.onNotificationReceived((y8.b1) this.f48031b);
                return;
            case 13:
                ((x8.m) this.f48032c).f51290c.onEntityUpdate((y8.v0) this.f48031b);
                return;
            default:
                y8.e eVar2 = (y8.e) this.f48031b;
                x8.m mVar = (x8.m) this.f48032c;
                eVar2.b(mVar.f51290c);
                dVar = mVar.f51290c.zzh;
                eVar2.b(dVar);
                return;
        }
    }

    public v(c0.l lVar, Object obj, int i10) {
        this.f48030a = i10;
        this.f48031b = lVar;
        this.f48032c = obj;
    }

    public v(z zVar, u uVar, int i10) {
        this.f48030a = 0;
        this.f48032c = zVar;
        this.f48031b = uVar;
    }
}
