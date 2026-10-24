package zf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import i2.o1;
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
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.hf0;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f52004x;
    public static ThreadPoolExecutor f52006z;
    public final BitmapDrawable f52007a;
    public final int f52008b;
    public final int f52009c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f52010f;
    public byte[] f52011g;
    public final Object h;
    public int f52012i;
    public boolean f52013j;
    public volatile boolean f52014k;
    public final int f52015l;
    public final File f52016m;
    public int f52017n;
    public final AtomicBoolean f52018o;
    public final m4 f52019p;
    public volatile boolean f52020q;
    public volatile boolean f52021r;
    public RandomAccessFile f52022s;
    public BitmapFactory.Options f52023t;
    public Bitmap f52024u;
    public static final ConcurrentHashMap f52003w = new ConcurrentHashMap();
    public static final int f52005y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, af.l lVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f52018o = new AtomicBoolean(false);
        this.f52019p = new m4(this, 18);
        this.f52007a = (BitmapDrawable) cVar;
        this.f52008b = i10;
        this.f52009c = i11;
        this.f52015l = lVar.f592a;
        String name = file.getName();
        if (f52006z == null) {
            int i13 = f52005y;
            f52006z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = o1.k(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.s(sb2, str2, ".pcache2"));
        this.f52016m = file3;
        this.f52010f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f52014k = file3.exists();
            try {
                if (this.f52014k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f52020q = randomAccessFile.readBoolean();
                            if (this.f52020q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f52020q = false;
                                    this.f52014k = false;
                                    file3.delete();
                                } else {
                                    if (this.f52022s != randomAccessFile) {
                                        a();
                                    }
                                    this.f52022s = randomAccessFile;
                                }
                            }
                            if (this.f52022s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f52016m.delete();
                                this.f52014k = false;
                                if (this.f52022s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f52022s != randomAccessFile && randomAccessFile != null) {
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
            this.f52014k = false;
            this.f52020q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            xj0.T0.postRunnable(new hf0(24));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f52022s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: zf.e.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                d dVar = new d(i11);
                dVar.f52002c = wrap.getInt();
                dVar.f52001b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f52010f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f52003w.get(Thread.currentThread());
        } else {
            bArr = this.f52011g;
        }
        if (bArr != null && bArr.length >= dVar.f52001b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f52001b * 1.3f)];
        if (z10) {
            f52003w.put(Thread.currentThread(), bArr2);
            if (!f52004x) {
                f52004x = true;
                AndroidUtilities.runOnUIThread(this.f52019p, 5000L);
            }
            return bArr2;
        }
        this.f52011g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: zf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f52020q && this.f52014k) {
            return false;
        }
        return true;
    }
}
