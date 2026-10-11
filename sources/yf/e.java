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
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.s21;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f52217x;
    public static ThreadPoolExecutor f52219z;
    public final BitmapDrawable f52220a;
    public final int f52221b;
    public final int f52222c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f52223e;
    public final boolean f52224f;
    public byte[] f52225g;
    public final Object h;
    public int f52226i;
    public boolean f52227j;
    public volatile boolean f52228k;
    public final int f52229l;
    public final File f52230m;
    public int f52231n;
    public final AtomicBoolean f52232o;
    public final p5 f52233p;
    public volatile boolean f52234q;
    public volatile boolean f52235r;
    public RandomAccessFile f52236s;
    public BitmapFactory.Options f52237t;
    public Bitmap f52238u;
    public static final ConcurrentHashMap f52216w = new ConcurrentHashMap();
    public static final int f52218y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f52223e = arrayList;
        this.h = new Object();
        this.f52232o = new AtomicBoolean(false);
        this.f52233p = new p5(this, 13);
        this.f52220a = (BitmapDrawable) cVar;
        this.f52221b = i10;
        this.f52222c = i11;
        this.f52229l = n1Var.f3492a;
        String name = file.getName();
        if (f52219z == null) {
            int i13 = f52218y;
            f52219z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = hg.c.h(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.t(sb2, str2, ".pcache2"));
        this.f52230m = file3;
        this.f52224f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f52228k = file3.exists();
            try {
                if (this.f52228k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f52234q = randomAccessFile.readBoolean();
                            if (this.f52234q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f52234q = false;
                                    this.f52228k = false;
                                    file3.delete();
                                } else {
                                    if (this.f52236s != randomAccessFile) {
                                        a();
                                    }
                                    this.f52236s = randomAccessFile;
                                }
                            }
                            if (this.f52236s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f52230m.delete();
                                this.f52228k = false;
                                if (this.f52236s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f52236s != randomAccessFile && randomAccessFile != null) {
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
            this.f52228k = false;
            this.f52234q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            ek0.T0.postRunnable(new s21(20));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f52236s;
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
                dVar.f52215c = wrap.getInt();
                dVar.f52214b = wrap.getInt();
                this.f52223e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f52224f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f52216w.get(Thread.currentThread());
        } else {
            bArr = this.f52225g;
        }
        if (bArr != null && bArr.length >= dVar.f52214b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f52214b * 1.3f)];
        if (z10) {
            f52216w.put(Thread.currentThread(), bArr2);
            if (!f52217x) {
                f52217x = true;
                AndroidUtilities.runOnUIThread(this.f52233p, 5000L);
            }
            return bArr2;
        }
        this.f52225g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f52234q && this.f52228k) {
            return false;
        }
        return true;
    }
}
