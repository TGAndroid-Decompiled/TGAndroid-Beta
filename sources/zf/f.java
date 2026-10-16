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
import org.telegram.ui.b31;
import p4.s0;
public final class f {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f50154x;
    public static ThreadPoolExecutor f50156z;
    public final BitmapDrawable f50157a;
    public final int f50158b;
    public final int f50159c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f50160f;
    public byte[] f50161g;
    public final Object h;
    public int f50162i;
    public boolean f50163j;
    public volatile boolean f50164k;
    public final int f50165l;
    public final File f50166m;
    public int f50167n;
    public final AtomicBoolean f50168o;
    public final s0 f50169p;
    public volatile boolean f50170q;
    public volatile boolean f50171r;
    public RandomAccessFile f50172s;
    public BitmapFactory.Options f50173t;
    public Bitmap f50174u;
    public static final ConcurrentHashMap f50153w = new ConcurrentHashMap();
    public static final int f50155y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public f(File file, d dVar, af.l lVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f50168o = new AtomicBoolean(false);
        this.f50169p = new s0(this, 15);
        this.f50157a = (BitmapDrawable) dVar;
        this.f50158b = i10;
        this.f50159c = i11;
        this.f50165l = lVar.f592a;
        String name = file.getName();
        if (f50156z == null) {
            int i13 = f50155y;
            f50156z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = i2.d.j(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.s(sb2, str2, ".pcache2"));
        this.f50166m = file3;
        this.f50160f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f50164k = file3.exists();
            try {
                if (this.f50164k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f50170q = randomAccessFile.readBoolean();
                            if (this.f50170q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f50170q = false;
                                    this.f50164k = false;
                                    file3.delete();
                                } else {
                                    if (this.f50172s != randomAccessFile) {
                                        a();
                                    }
                                    this.f50172s = randomAccessFile;
                                }
                            }
                            if (this.f50172s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f50166m.delete();
                                this.f50164k = false;
                                if (this.f50172s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f50172s != randomAccessFile && randomAccessFile != null) {
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
            this.f50164k = false;
            this.f50170q = false;
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
        RandomAccessFile randomAccessFile = this.f50172s;
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
                eVar.f50152c = wrap.getInt();
                eVar.f50151b = wrap.getInt();
                this.e.add(eVar);
            }
        }
    }

    public final byte[] e(e eVar) {
        boolean z10;
        byte[] bArr;
        if (this.f50160f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f50153w.get(Thread.currentThread());
        } else {
            bArr = this.f50161g;
        }
        if (bArr != null && bArr.length >= eVar.f50151b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (eVar.f50151b * 1.3f)];
        if (z10) {
            f50153w.put(Thread.currentThread(), bArr2);
            if (!f50154x) {
                f50154x = true;
                AndroidUtilities.runOnUIThread(this.f50169p, 5000L);
            }
            return bArr2;
        }
        this.f50161g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: zf.f.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f50170q && this.f50164k) {
            return false;
        }
        return true;
    }
}
