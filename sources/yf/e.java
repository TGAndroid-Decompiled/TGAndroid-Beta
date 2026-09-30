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
import org.telegram.ui.Components.lj0;
import org.telegram.ui.l21;
import pg.c1;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f47180x;
    public static ThreadPoolExecutor f47182z;
    public final BitmapDrawable f47183a;
    public final int f47184b;
    public final int f47185c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f47186f;
    public byte[] f47187g;
    public final Object h;
    public int f47188i;
    public boolean f47189j;
    public volatile boolean f47190k;
    public final int f47191l;
    public final File f47192m;
    public int f47193n;
    public final AtomicBoolean f47194o;
    public final c1 f47195p;
    public volatile boolean f47196q;
    public volatile boolean f47197r;
    public RandomAccessFile f47198s;
    public BitmapFactory.Options f47199t;
    public Bitmap f47200u;
    public static final ConcurrentHashMap f47179w = new ConcurrentHashMap();
    public static final int f47181y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f47194o = new AtomicBoolean(false);
        this.f47195p = new c1(this, 10);
        this.f47183a = (BitmapDrawable) cVar;
        this.f47184b = i10;
        this.f47185c = i11;
        this.f47191l = n1Var.f3163a;
        String name = file.getName();
        if (f47182z == null) {
            int i13 = f47181y;
            f47182z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        File file3 = new File(file2, a4.a.t(sb2, str2, ".pcache2"));
        this.f47192m = file3;
        this.f47186f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f47190k = file3.exists();
            try {
                if (this.f47190k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f47196q = randomAccessFile.readBoolean();
                            if (this.f47196q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f47196q = false;
                                    this.f47190k = false;
                                    file3.delete();
                                } else {
                                    if (this.f47198s != randomAccessFile) {
                                        a();
                                    }
                                    this.f47198s = randomAccessFile;
                                }
                            }
                            if (this.f47198s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f47192m.delete();
                                this.f47190k = false;
                                if (this.f47198s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f47198s != randomAccessFile && randomAccessFile != null) {
                                        randomAccessFile.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = null;
                    }
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } else {
            this.f47190k = false;
            this.f47196q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            lj0.T0.postRunnable(new l21(18));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f47198s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
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
                dVar.f47178c = wrap.getInt();
                dVar.f47177b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f47186f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f47179w.get(Thread.currentThread());
        } else {
            bArr = this.f47187g;
        }
        if (bArr != null && bArr.length >= dVar.f47177b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f47177b * 1.3f)];
        if (z10) {
            f47179w.put(Thread.currentThread(), bArr2);
            if (!f47180x) {
                f47180x = true;
                AndroidUtilities.runOnUIThread(this.f47195p, 5000L);
            }
            return bArr2;
        }
        this.f47187g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f47196q && this.f47190k) {
            return false;
        }
        return true;
    }
}
