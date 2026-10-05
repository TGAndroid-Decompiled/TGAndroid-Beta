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
    public static volatile boolean f50964x;
    public static ThreadPoolExecutor f50966z;
    public final BitmapDrawable f50967a;
    public final int f50968b;
    public final int f50969c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f50970e;
    public final boolean f50971f;
    public byte[] f50972g;
    public final Object h;
    public int f50973i;
    public boolean f50974j;
    public volatile boolean f50975k;
    public final int f50976l;
    public final File f50977m;
    public int f50978n;
    public final AtomicBoolean f50979o;
    public final c1 f50980p;
    public volatile boolean f50981q;
    public volatile boolean f50982r;
    public RandomAccessFile f50983s;
    public BitmapFactory.Options f50984t;
    public Bitmap f50985u;
    public static final ConcurrentHashMap f50963w = new ConcurrentHashMap();
    public static final int f50965y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f50970e = arrayList;
        this.h = new Object();
        this.f50979o = new AtomicBoolean(false);
        this.f50980p = new c1(this, 10);
        this.f50967a = (BitmapDrawable) cVar;
        this.f50968b = i10;
        this.f50969c = i11;
        this.f50976l = n1Var.f3413a;
        String name = file.getName();
        if (f50966z == null) {
            int i13 = f50965y;
            f50966z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f50977m = file3;
        this.f50971f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f50975k = file3.exists();
            try {
                if (this.f50975k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f50981q = randomAccessFile.readBoolean();
                            if (this.f50981q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f50981q = false;
                                    this.f50975k = false;
                                    file3.delete();
                                } else {
                                    if (this.f50983s != randomAccessFile) {
                                        a();
                                    }
                                    this.f50983s = randomAccessFile;
                                }
                            }
                            if (this.f50983s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f50977m.delete();
                                this.f50975k = false;
                                if (this.f50983s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f50983s != randomAccessFile && randomAccessFile != null) {
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
            this.f50975k = false;
            this.f50981q = false;
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
        RandomAccessFile randomAccessFile = this.f50983s;
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
                dVar.f50960c = wrap.getInt();
                dVar.f50959b = wrap.getInt();
                this.f50970e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f50971f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f50963w.get(Thread.currentThread());
        } else {
            bArr = this.f50972g;
        }
        if (bArr != null && bArr.length >= dVar.f50959b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f50959b * 1.3f)];
        if (z10) {
            f50963w.put(Thread.currentThread(), bArr2);
            if (!f50964x) {
                f50964x = true;
                AndroidUtilities.runOnUIThread(this.f50980p, 5000L);
            }
            return bArr2;
        }
        this.f50972g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f50981q && this.f50975k) {
            return false;
        }
        return true;
    }
}
