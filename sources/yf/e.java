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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.s21;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f52251x;
    public static ThreadPoolExecutor f52253z;
    public final BitmapDrawable f52254a;
    public final int f52255b;
    public final int f52256c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f52257e;
    public final boolean f52258f;
    public byte[] f52259g;
    public final Object h;
    public int f52260i;
    public boolean f52261j;
    public volatile boolean f52262k;
    public final int f52263l;
    public final File f52264m;
    public int f52265n;
    public final AtomicBoolean f52266o;
    public final p5 f52267p;
    public volatile boolean f52268q;
    public volatile boolean f52269r;
    public RandomAccessFile f52270s;
    public BitmapFactory.Options f52271t;
    public Bitmap f52272u;
    public static final ConcurrentHashMap f52250w = new ConcurrentHashMap();
    public static final int f52252y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f52257e = arrayList;
        this.h = new Object();
        this.f52266o = new AtomicBoolean(false);
        this.f52267p = new p5(this, 13);
        this.f52254a = (BitmapDrawable) cVar;
        this.f52255b = i10;
        this.f52256c = i11;
        this.f52263l = n1Var.f3492a;
        String name = file.getName();
        if (f52253z == null) {
            int i13 = f52252y;
            f52253z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f52264m = file3;
        this.f52258f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f52262k = file3.exists();
            try {
                if (this.f52262k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f52268q = randomAccessFile.readBoolean();
                            if (this.f52268q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f52268q = false;
                                    this.f52262k = false;
                                    file3.delete();
                                } else {
                                    if (this.f52270s != randomAccessFile) {
                                        a();
                                    }
                                    this.f52270s = randomAccessFile;
                                }
                            }
                            if (this.f52270s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f52264m.delete();
                                this.f52262k = false;
                                if (this.f52270s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f52270s != randomAccessFile && randomAccessFile != null) {
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
            this.f52262k = false;
            this.f52268q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            dk0.T0.postRunnable(new s21(20));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f52270s;
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
                dVar.f52249c = wrap.getInt();
                dVar.f52248b = wrap.getInt();
                this.f52257e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f52258f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f52250w.get(Thread.currentThread());
        } else {
            bArr = this.f52259g;
        }
        if (bArr != null && bArr.length >= dVar.f52248b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f52248b * 1.3f)];
        if (z10) {
            f52250w.put(Thread.currentThread(), bArr2);
            if (!f52251x) {
                f52251x = true;
                AndroidUtilities.runOnUIThread(this.f52267p, 5000L);
            }
            return bArr2;
        }
        this.f52259g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f52268q && this.f52262k) {
            return false;
        }
        return true;
    }
}
