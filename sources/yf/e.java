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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.t21;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f52128x;
    public static ThreadPoolExecutor f52130z;
    public final BitmapDrawable f52131a;
    public final int f52132b;
    public final int f52133c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f52134e;
    public final boolean f52135f;
    public byte[] f52136g;
    public final Object h;
    public int f52137i;
    public boolean f52138j;
    public volatile boolean f52139k;
    public final int f52140l;
    public final File f52141m;
    public int f52142n;
    public final AtomicBoolean f52143o;
    public final m5 f52144p;
    public volatile boolean f52145q;
    public volatile boolean f52146r;
    public RandomAccessFile f52147s;
    public BitmapFactory.Options f52148t;
    public Bitmap f52149u;
    public static final ConcurrentHashMap f52127w = new ConcurrentHashMap();
    public static final int f52129y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f52134e = arrayList;
        this.h = new Object();
        this.f52143o = new AtomicBoolean(false);
        this.f52144p = new m5(this, 13);
        this.f52131a = (BitmapDrawable) cVar;
        this.f52132b = i10;
        this.f52133c = i11;
        this.f52140l = n1Var.f3492a;
        String name = file.getName();
        if (f52130z == null) {
            int i13 = f52129y;
            f52130z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f52141m = file3;
        this.f52135f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f52139k = file3.exists();
            try {
                if (this.f52139k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f52145q = randomAccessFile.readBoolean();
                            if (this.f52145q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f52145q = false;
                                    this.f52139k = false;
                                    file3.delete();
                                } else {
                                    if (this.f52147s != randomAccessFile) {
                                        a();
                                    }
                                    this.f52147s = randomAccessFile;
                                }
                            }
                            if (this.f52147s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f52141m.delete();
                                this.f52139k = false;
                                if (this.f52147s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f52147s != randomAccessFile && randomAccessFile != null) {
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
            this.f52139k = false;
            this.f52145q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            ck0.T0.postRunnable(new t21(20));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f52147s;
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
                dVar.f52126c = wrap.getInt();
                dVar.f52125b = wrap.getInt();
                this.f52134e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f52135f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f52127w.get(Thread.currentThread());
        } else {
            bArr = this.f52136g;
        }
        if (bArr != null && bArr.length >= dVar.f52125b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f52125b * 1.3f)];
        if (z10) {
            f52127w.put(Thread.currentThread(), bArr2);
            if (!f52128x) {
                f52128x = true;
                AndroidUtilities.runOnUIThread(this.f52144p, 5000L);
            }
            return bArr2;
        }
        this.f52136g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f52145q && this.f52139k) {
            return false;
        }
        return true;
    }
}
