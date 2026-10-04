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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.n21;
import pg.c1;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f50957x;
    public static ThreadPoolExecutor f50959z;
    public final BitmapDrawable f50960a;
    public final int f50961b;
    public final int f50962c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f50963e;
    public final boolean f50964f;
    public byte[] f50965g;
    public final Object h;
    public int f50966i;
    public boolean f50967j;
    public volatile boolean f50968k;
    public final int f50969l;
    public final File f50970m;
    public int f50971n;
    public final AtomicBoolean f50972o;
    public final c1 f50973p;
    public volatile boolean f50974q;
    public volatile boolean f50975r;
    public RandomAccessFile f50976s;
    public BitmapFactory.Options f50977t;
    public Bitmap f50978u;
    public static final ConcurrentHashMap f50956w = new ConcurrentHashMap();
    public static final int f50958y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f50963e = arrayList;
        this.h = new Object();
        this.f50972o = new AtomicBoolean(false);
        this.f50973p = new c1(this, 10);
        this.f50960a = (BitmapDrawable) cVar;
        this.f50961b = i10;
        this.f50962c = i11;
        this.f50969l = n1Var.f3413a;
        String name = file.getName();
        if (f50959z == null) {
            int i13 = f50958y;
            f50959z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f50970m = file3;
        this.f50964f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f50968k = file3.exists();
            try {
                if (this.f50968k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f50974q = randomAccessFile.readBoolean();
                            if (this.f50974q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f50974q = false;
                                    this.f50968k = false;
                                    file3.delete();
                                } else {
                                    if (this.f50976s != randomAccessFile) {
                                        a();
                                    }
                                    this.f50976s = randomAccessFile;
                                }
                            }
                            if (this.f50976s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f50970m.delete();
                                this.f50968k = false;
                                if (this.f50976s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f50976s != randomAccessFile && randomAccessFile != null) {
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
            this.f50968k = false;
            this.f50974q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            kj0.T0.postRunnable(new n21(18));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f50976s;
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
                dVar.f50953c = wrap.getInt();
                dVar.f50952b = wrap.getInt();
                this.f50963e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f50964f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f50956w.get(Thread.currentThread());
        } else {
            bArr = this.f50965g;
        }
        if (bArr != null && bArr.length >= dVar.f50952b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f50952b * 1.3f)];
        if (z10) {
            f50956w.put(Thread.currentThread(), bArr2);
            if (!f50957x) {
                f50957x = true;
                AndroidUtilities.runOnUIThread(this.f50973p, 5000L);
            }
            return bArr2;
        }
        this.f50965g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f50974q && this.f50968k) {
            return false;
        }
        return true;
    }
}
