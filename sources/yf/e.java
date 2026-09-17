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
import org.telegram.ui.Components.yi0;
import org.telegram.ui.p91;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f46816x;
    public static ThreadPoolExecutor f46818z;
    public final BitmapDrawable f46819a;
    public final int f46820b;
    public final int f46821c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f46822f;
    public byte[] f46823g;
    public final Object h;
    public int f46824i;
    public boolean f46825j;
    public volatile boolean f46826k;
    public final int f46827l;
    public final File f46828m;
    public int f46829n;
    public final AtomicBoolean f46830o;
    public final qg.b0 f46831p;
    public volatile boolean f46832q;
    public volatile boolean f46833r;
    public RandomAccessFile f46834s;
    public BitmapFactory.Options f46835t;
    public Bitmap f46836u;
    public static final ConcurrentHashMap f46815w = new ConcurrentHashMap();
    public static final int f46817y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f46830o = new AtomicBoolean(false);
        this.f46831p = new qg.b0(this, 9);
        this.f46819a = (BitmapDrawable) cVar;
        this.f46820b = i10;
        this.f46821c = i11;
        this.f46827l = n1Var.f3164a;
        String name = file.getName();
        if (f46818z == null) {
            int i13 = f46817y;
            f46818z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = hg.k0.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a4.a.s(sb2, str2, ".pcache2"));
        this.f46828m = file3;
        this.f46822f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f46826k = file3.exists();
            try {
                if (this.f46826k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f46832q = randomAccessFile.readBoolean();
                            if (this.f46832q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f46832q = false;
                                    this.f46826k = false;
                                    file3.delete();
                                } else {
                                    if (this.f46834s != randomAccessFile) {
                                        a();
                                    }
                                    this.f46834s = randomAccessFile;
                                }
                            }
                            if (this.f46834s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f46828m.delete();
                                this.f46826k = false;
                                if (this.f46834s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f46834s != randomAccessFile && randomAccessFile != null) {
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
            this.f46826k = false;
            this.f46832q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            yi0.T0.postRunnable(new p91(16));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f46834s;
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
                dVar.f46814c = wrap.getInt();
                dVar.f46813b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f46822f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f46815w.get(Thread.currentThread());
        } else {
            bArr = this.f46823g;
        }
        if (bArr != null && bArr.length >= dVar.f46813b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f46813b * 1.3f)];
        if (z10) {
            f46815w.put(Thread.currentThread(), bArr2);
            if (!f46816x) {
                f46816x = true;
                AndroidUtilities.runOnUIThread(this.f46831p, 5000L);
            }
            return bArr2;
        }
        this.f46823g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f46832q && this.f46826k) {
            return false;
        }
        return true;
    }
}
