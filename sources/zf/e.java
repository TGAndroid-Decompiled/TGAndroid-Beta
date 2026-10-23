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
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.m4;
import org.telegram.ui.if0;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f52005x;
    public static ThreadPoolExecutor f52007z;
    public final BitmapDrawable f52008a;
    public final int f52009b;
    public final int f52010c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f52011f;
    public byte[] f52012g;
    public final Object h;
    public int f52013i;
    public boolean f52014j;
    public volatile boolean f52015k;
    public final int f52016l;
    public final File f52017m;
    public int f52018n;
    public final AtomicBoolean f52019o;
    public final m4 f52020p;
    public volatile boolean f52021q;
    public volatile boolean f52022r;
    public RandomAccessFile f52023s;
    public BitmapFactory.Options f52024t;
    public Bitmap f52025u;
    public static final ConcurrentHashMap f52004w = new ConcurrentHashMap();
    public static final int f52006y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, af.l lVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f52019o = new AtomicBoolean(false);
        this.f52020p = new m4(this, 18);
        this.f52008a = (BitmapDrawable) cVar;
        this.f52009b = i10;
        this.f52010c = i11;
        this.f52016l = lVar.f592a;
        String name = file.getName();
        if (f52007z == null) {
            int i13 = f52006y;
            f52007z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f52017m = file3;
        this.f52011f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f52015k = file3.exists();
            try {
                if (this.f52015k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f52021q = randomAccessFile.readBoolean();
                            if (this.f52021q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f52021q = false;
                                    this.f52015k = false;
                                    file3.delete();
                                } else {
                                    if (this.f52023s != randomAccessFile) {
                                        a();
                                    }
                                    this.f52023s = randomAccessFile;
                                }
                            }
                            if (this.f52023s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f52017m.delete();
                                this.f52015k = false;
                                if (this.f52023s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f52023s != randomAccessFile && randomAccessFile != null) {
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
            this.f52015k = false;
            this.f52021q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            yj0.T0.postRunnable(new if0(24));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f52023s;
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
                dVar.f52003c = wrap.getInt();
                dVar.f52002b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f52011f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f52004w.get(Thread.currentThread());
        } else {
            bArr = this.f52012g;
        }
        if (bArr != null && bArr.length >= dVar.f52002b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f52002b * 1.3f)];
        if (z10) {
            f52004w.put(Thread.currentThread(), bArr2);
            if (!f52005x) {
                f52005x = true;
                AndroidUtilities.runOnUIThread(this.f52020p, 5000L);
            }
            return bArr2;
        }
        this.f52012g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: zf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f52021q && this.f52015k) {
            return false;
        }
        return true;
    }
}
