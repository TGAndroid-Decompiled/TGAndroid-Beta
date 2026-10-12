package zf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
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
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.b31;
public final class f {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f50153x;
    public static ThreadPoolExecutor f50155z;
    public final BitmapDrawable f50156a;
    public final int f50157b;
    public final int f50158c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f50159f;
    public byte[] f50160g;
    public final Object h;
    public int f50161i;
    public boolean f50162j;
    public volatile boolean f50163k;
    public final int f50164l;
    public final File f50165m;
    public int f50166n;
    public final AtomicBoolean f50167o;
    public final m5 f50168p;
    public volatile boolean f50169q;
    public volatile boolean f50170r;
    public RandomAccessFile f50171s;
    public BitmapFactory.Options f50172t;
    public Bitmap f50173u;
    public static final ConcurrentHashMap f50152w = new ConcurrentHashMap();
    public static final int f50154y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public f(File file, d dVar, af.l lVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f50167o = new AtomicBoolean(false);
        this.f50168p = new m5(this, 15);
        this.f50156a = (BitmapDrawable) dVar;
        this.f50157b = i10;
        this.f50158c = i11;
        this.f50164l = lVar.f588a;
        String name = file.getName();
        if (f50155z == null) {
            int i13 = f50154y;
            f50155z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = i2.d.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.s(sb2, str2, ".pcache2"));
        this.f50165m = file3;
        this.f50159f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f50163k = file3.exists();
            try {
                if (this.f50163k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f50169q = randomAccessFile.readBoolean();
                            if (this.f50169q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f50169q = false;
                                    this.f50163k = false;
                                    file3.delete();
                                } else {
                                    if (this.f50171s != randomAccessFile) {
                                        a();
                                    }
                                    this.f50171s = randomAccessFile;
                                }
                            }
                            if (this.f50171s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f50165m.delete();
                                this.f50163k = false;
                                if (this.f50171s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f50171s != randomAccessFile && randomAccessFile != null) {
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
            this.f50163k = false;
            this.f50169q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            yj0.T0.postRunnable(new b31(21));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f50171s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: zf.f.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                e eVar = new e(i11);
                eVar.f50151c = wrap.getInt();
                eVar.f50150b = wrap.getInt();
                this.e.add(eVar);
            }
        }
    }

    public final byte[] e(e eVar) {
        boolean z10;
        byte[] bArr;
        if (this.f50159f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f50152w.get(Thread.currentThread());
        } else {
            bArr = this.f50160g;
        }
        if (bArr != null && bArr.length >= eVar.f50150b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (eVar.f50150b * 1.3f)];
        if (z10) {
            f50152w.put(Thread.currentThread(), bArr2);
            if (!f50153x) {
                f50153x = true;
                AndroidUtilities.runOnUIThread(this.f50168p, 5000L);
            }
            return bArr2;
        }
        this.f50160g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: zf.f.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f50169q && this.f50163k) {
            return false;
        }
        return true;
    }
}
