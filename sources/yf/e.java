package yf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import b2.n1;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.q31;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f50095x;
    public static ThreadPoolExecutor f50097z;
    public final BitmapDrawable f50098a;
    public final int f50099b;
    public final int f50100c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f50101e;
    public final boolean f50102f;
    public byte[] f50103g;
    public final Object h;
    public int f50104i;
    public boolean f50105j;
    public volatile boolean f50106k;
    public final int f50107l;
    public final File f50108m;
    public int f50109n;
    public final AtomicBoolean f50110o;
    public final rg.b0 f50111p;
    public volatile boolean f50112q;
    public volatile boolean f50113r;
    public RandomAccessFile f50114s;
    public BitmapFactory.Options f50115t;
    public Bitmap f50116u;
    public static final ConcurrentHashMap f50094w = new ConcurrentHashMap();
    public static final int f50096y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f50101e = arrayList;
        this.h = new Object();
        this.f50110o = new AtomicBoolean(false);
        this.f50111p = new rg.b0(this, 9);
        this.f50098a = (BitmapDrawable) cVar;
        this.f50099b = i10;
        this.f50100c = i11;
        this.f50107l = n1Var.f2246a;
        String name = file.getName();
        if (f50097z == null) {
            int i13 = f50096y;
            f50097z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(FileLoader.checkDirectory(4), "acache");
        boolean z11 = true;
        if (!v) {
            file2.mkdir();
            v = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append("_");
        sb2.append(i10);
        sb2.append("_");
        sb2.append(i11);
        if (z10) {
            str = "_nolimit";
        } else {
            str = " ";
        }
        sb2.append(str);
        if (i12 != 0) {
            str2 = i2.g.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a4.a.s(sb2, str2, ".pcache2"));
        this.f50108m = file3;
        this.f50102f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f50106k = file3.exists();
            try {
                if (this.f50106k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f50112q = randomAccessFile.readBoolean();
                            if (this.f50112q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f50112q = false;
                                    this.f50106k = false;
                                    file3.delete();
                                } else {
                                    if (this.f50114s != randomAccessFile) {
                                        a();
                                    }
                                    this.f50114s = randomAccessFile;
                                }
                            }
                            if (this.f50114s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f50108m.delete();
                                this.f50106k = false;
                                if (this.f50114s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f50114s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e7) {
                                    e7.printStackTrace();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } else {
            this.f50106k = false;
            this.f50112q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            xi0.T0.postRunnable(new q31(16));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f50114s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                d dVar = new d(i11);
                dVar.f50085c = wrap.getInt();
                dVar.f50084b = wrap.getInt();
                this.f50101e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f50102f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f50094w.get(Thread.currentThread());
        } else {
            bArr = this.f50103g;
        }
        if (bArr != null && bArr.length >= dVar.f50084b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f50084b * 1.3f)];
        if (z10) {
            f50094w.put(Thread.currentThread(), bArr2);
            if (!f50095x) {
                f50095x = true;
                AndroidUtilities.runOnUIThread(this.f50111p, 5000L);
            }
            return bArr2;
        }
        this.f50103g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f50112q && this.f50106k) {
            return false;
        }
        return true;
    }
}
