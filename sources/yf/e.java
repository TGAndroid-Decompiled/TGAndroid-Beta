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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.u21;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f47095x;
    public static ThreadPoolExecutor f47097z;
    public final BitmapDrawable f47098a;
    public final int f47099b;
    public final int f47100c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f47101f;
    public byte[] f47102g;
    public final Object h;
    public int f47103i;
    public boolean f47104j;
    public volatile boolean f47105k;
    public final int f47106l;
    public final File f47107m;
    public int f47108n;
    public final AtomicBoolean f47109o;
    public final p8.b f47110p;
    public volatile boolean f47111q;
    public volatile boolean f47112r;
    public RandomAccessFile f47113s;
    public BitmapFactory.Options f47114t;
    public Bitmap f47115u;
    public static final ConcurrentHashMap f47094w = new ConcurrentHashMap();
    public static final int f47096y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f47109o = new AtomicBoolean(false);
        this.f47110p = new p8.b(this, 11);
        this.f47098a = (BitmapDrawable) cVar;
        this.f47099b = i10;
        this.f47100c = i11;
        this.f47106l = n1Var.f3164a;
        String name = file.getName();
        if (f47097z == null) {
            int i13 = f47096y;
            f47097z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = hg.k0.h(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a4.a.s(sb2, str2, ".pcache2"));
        this.f47107m = file3;
        this.f47101f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f47105k = file3.exists();
            try {
                if (this.f47105k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f47111q = randomAccessFile.readBoolean();
                            if (this.f47111q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f47111q = false;
                                    this.f47105k = false;
                                    file3.delete();
                                } else {
                                    if (this.f47113s != randomAccessFile) {
                                        a();
                                    }
                                    this.f47113s = randomAccessFile;
                                }
                            }
                            if (this.f47113s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f47107m.delete();
                                this.f47105k = false;
                                if (this.f47113s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f47113s != randomAccessFile && randomAccessFile != null) {
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
            this.f47105k = false;
            this.f47111q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            hj0.T0.postRunnable(new u21(18));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f47113s;
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
                dVar.f47093c = wrap.getInt();
                dVar.f47092b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f47101f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f47094w.get(Thread.currentThread());
        } else {
            bArr = this.f47102g;
        }
        if (bArr != null && bArr.length >= dVar.f47092b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f47092b * 1.3f)];
        if (z10) {
            f47094w.put(Thread.currentThread(), bArr2);
            if (!f47095x) {
                f47095x = true;
                AndroidUtilities.runOnUIThread(this.f47110p, 5000L);
            }
            return bArr2;
        }
        this.f47102g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f47111q && this.f47105k) {
            return false;
        }
        return true;
    }
}
