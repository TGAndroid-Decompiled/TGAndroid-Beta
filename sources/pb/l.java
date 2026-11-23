package pb;

import android.util.Log;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.md0;
import org.xmlpull.v1.XmlSerializer;
import v4.e1;
import v4.m0;
import v4.u;
import v4.y;
import zd.v0;
public final class l implements Runnable {
    public final int f55545a;
    public Object f55546b;
    public final Object f55547c;

    public l(int i7, Object obj, Object obj2) {
        this.f55545a = i7;
        this.f55546b = obj;
        this.f55547c = obj2;
    }

    public void a() {
        throw new UnsupportedOperationException("Method not decompiled: pb.l.a():void");
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        Exception exc;
        FileOutputStream J;
        boolean z12;
        switch (this.f55545a) {
            case 0:
                ReferenceQueue referenceQueue = (ReferenceQueue) this.f55546b;
                while (!((Set) this.f55547c).isEmpty()) {
                    try {
                        m mVar = (m) referenceQueue.remove();
                        if (mVar.f55548a.remove(mVar)) {
                            mVar.clear();
                            mVar.f55549b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
                return;
            case 1:
                Callable callable = (Callable) this.f55546b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f55547c;
                try {
                    taskCompletionSource.setResult(callable.call());
                    return;
                } catch (lb.a e10) {
                    taskCompletionSource.setException(e10);
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(new lb.a("Internal error has occurred when executing ML Kit tasks", e11));
                    return;
                }
            case 2:
                i iVar = (i) this.f55546b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f55547c;
                int decrementAndGet = iVar.f55538b.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q6.m.k(z10);
                if (decrementAndGet == 0) {
                    iVar.c();
                    iVar.f55539c.set(false);
                }
                w7.n.f59629a.clear();
                w7.r.f59633a.clear();
                taskCompletionSource2.setResult(null);
                return;
            case 3:
                ab.q qVar = (ab.q) this.f55546b;
                if (((Thread) ((AtomicReference) qVar.d).getAndSet(Thread.currentThread())) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                q6.m.k(z11);
                try {
                    ((Runnable) this.f55547c).run();
                    ((AtomicReference) qVar.d).set(null);
                    qVar.G();
                    return;
                } catch (Throwable th2) {
                    try {
                        ((AtomicReference) qVar.d).set(null);
                        qVar.G();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 4:
                pi.k kVar = (pi.k) this.f55547c;
                ArrayList arrayList = (ArrayList) this.f55546b;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    kVar.B((v4.i) obj);
                }
                arrayList.clear();
                kVar.v.remove(arrayList);
                return;
            case 5:
                u uVar = (u) this.f55546b;
                e1 e1Var = uVar.f59225e;
                y yVar = (y) this.f55547c;
                RecyclerView recyclerView = yVar.I;
                if (recyclerView != null && recyclerView.H && !uVar.f59230w && e1Var.b() != -1) {
                    m0 itemAnimator = yVar.I.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.k()) {
                        ArrayList arrayList2 = yVar.G;
                        int size2 = arrayList2.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            if (((u) arrayList2.get(i10)).f59231x) {
                            }
                        }
                        yVar.f59259y.q(e1Var);
                        return;
                    }
                    yVar.I.post(this);
                    return;
                }
                return;
            case 6:
                try {
                    a();
                    return;
                } catch (Error e12) {
                    synchronized (((v9.i) this.f55547c).f59333b) {
                        ((v9.i) this.f55547c).f59334c = 1;
                        throw e12;
                    }
                }
            case 7:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.f55547c;
                ArrayList arrayList3 = (ArrayList) this.f55546b;
                shortcutInfoCompatSaverImpl.e(arrayList3);
                File file = shortcutInfoCompatSaverImpl.f2801f;
                md0 md0Var = new md0(file);
                File file2 = (File) md0Var.f49831c;
                FileOutputStream fileOutputStream = null;
                try {
                    J = md0Var.J();
                } catch (Exception e13) {
                    exc = e13;
                }
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(J);
                    XmlSerializer newSerializer = Xml.newSerializer();
                    newSerializer.setOutput(bufferedOutputStream, "UTF_8");
                    newSerializer.startDocument(null, Boolean.TRUE);
                    newSerializer.startTag(null, "share_targets");
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        x4.d.h(newSerializer, (x4.f) obj2);
                    }
                    newSerializer.endTag(null, "share_targets");
                    newSerializer.endDocument();
                    bufferedOutputStream.flush();
                    J.flush();
                    try {
                        J.getFD().sync();
                        z12 = true;
                    } catch (IOException unused2) {
                        z12 = false;
                    }
                    if (!z12) {
                        Log.e("AtomicFile", "Failed to sync file output stream");
                    }
                    try {
                        J.close();
                    } catch (IOException e14) {
                        Log.e("AtomicFile", "Failed to close file output stream", e14);
                    }
                    md0.G(file2, file);
                    return;
                } catch (Exception e15) {
                    exc = e15;
                    fileOutputStream = J;
                    Log.e("ShortcutInfoCompatSaver", "Failed to write to file " + file, exc);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.getFD().sync();
                        } catch (IOException unused3) {
                            Log.e("AtomicFile", "Failed to sync file output stream");
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e16) {
                            Log.e("AtomicFile", "Failed to close file output stream", e16);
                        }
                        if (!file2.delete()) {
                            Log.e("AtomicFile", "Failed to delete new file " + file2);
                        }
                    }
                    throw new RuntimeException("Failed to write to file " + file, exc);
                }
            case 8:
                c0.m mVar2 = (c0.m) this.f55547c;
                try {
                    ((c0.m) this.f55546b).get();
                    mVar2.k(null);
                    return;
                } catch (Exception e17) {
                    mVar2.l(e17);
                    return;
                }
            case 9:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = (ShortcutInfoCompatSaverImpl) this.f55547c;
                a0.f fVar = shortcutInfoCompatSaverImpl2.f2798b;
                try {
                    ShortcutInfoCompatSaverImpl.f((File) this.f55546b);
                    ShortcutInfoCompatSaverImpl.f(shortcutInfoCompatSaverImpl2.f2802g);
                    fVar.putAll(x4.d.c(shortcutInfoCompatSaverImpl2.f2801f, shortcutInfoCompatSaverImpl2.f2797a));
                    shortcutInfoCompatSaverImpl2.e(new ArrayList(fVar.values()));
                    return;
                } catch (Exception e18) {
                    Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e18);
                    return;
                }
            case 10:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl3 = (ShortcutInfoCompatSaverImpl) this.f55547c;
                shortcutInfoCompatSaverImpl3.f2798b.clear();
                a0.f fVar2 = shortcutInfoCompatSaverImpl3.f2799c;
                Iterator it = ((a0.e) fVar2.values()).iterator();
                while (it.hasNext()) {
                    ((m9.y) it.next()).cancel(false);
                }
                fVar2.clear();
                shortcutInfoCompatSaverImpl3.h((c0.m) this.f55546b);
                return;
            case 11:
                if (!(((c0.m) this.f55546b).f4332a instanceof c0.a)) {
                    try {
                        ((Runnable) this.f55547c).run();
                        ((c0.m) this.f55546b).k(null);
                        return;
                    } catch (Exception e19) {
                        ((c0.m) this.f55546b).l(e19);
                        return;
                    }
                }
                return;
            default:
                ((zd.m) this.f55547c).D((v0) this.f55546b);
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f55545a) {
            case 6:
                Runnable runnable = (Runnable) this.f55546b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((v9.i) this.f55547c).f59334c;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 != 4) {
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

    public l(Object obj, Object obj2, boolean z10, int i7) {
        this.f55545a = i7;
        this.f55547c = obj;
        this.f55546b = obj2;
    }

    public l(v9.i iVar) {
        this.f55545a = 6;
        this.f55547c = iVar;
    }

    public l(y yVar, u uVar, int i7) {
        this.f55545a = 5;
        this.f55547c = yVar;
        this.f55546b = uVar;
    }
}
