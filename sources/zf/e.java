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
import org.telegram.ui.Components.uj0;
import org.telegram.ui.mj0;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f51533x;
    public static ThreadPoolExecutor f51535z;
    public final BitmapDrawable f51536a;
    public final int f51537b;
    public final int f51538c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f51539f;
    public byte[] f51540g;
    public final Object h;
    public int f51541i;
    public boolean f51542j;
    public volatile boolean f51543k;
    public final int f51544l;
    public final File f51545m;
    public int f51546n;
    public final AtomicBoolean f51547o;
    public final p8.b f51548p;
    public volatile boolean f51549q;
    public volatile boolean f51550r;
    public RandomAccessFile f51551s;
    public BitmapFactory.Options f51552t;
    public Bitmap f51553u;
    public static final ConcurrentHashMap f51532w = new ConcurrentHashMap();
    public static final int f51534y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, af.l lVar, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f51547o = new AtomicBoolean(false);
        this.f51548p = new p8.b(this, 14);
        this.f51536a = (BitmapDrawable) cVar;
        this.f51537b = i10;
        this.f51538c = i11;
        this.f51544l = lVar.f592a;
        String name = file.getName();
        if (f51535z == null) {
            int i13 = f51534y;
            f51535z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        this.f51545m = file3;
        this.f51539f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f51543k = file3.exists();
            try {
                if (this.f51543k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f51549q = randomAccessFile.readBoolean();
                            if (this.f51549q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f51549q = false;
                                    this.f51543k = false;
                                    file3.delete();
                                } else {
                                    if (this.f51551s != randomAccessFile) {
                                        a();
                                    }
                                    this.f51551s = randomAccessFile;
                                }
                            }
                            if (this.f51551s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f51545m.delete();
                                this.f51543k = false;
                                if (this.f51551s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f51551s != randomAccessFile && randomAccessFile != null) {
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
            this.f51543k = false;
            this.f51549q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            uj0.T0.postRunnable(new mj0(23));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f51551s;
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
                dVar.f51531c = wrap.getInt();
                dVar.f51530b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f51539f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f51532w.get(Thread.currentThread());
        } else {
            bArr = this.f51540g;
        }
        if (bArr != null && bArr.length >= dVar.f51530b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f51530b * 1.3f)];
        if (z10) {
            f51532w.put(Thread.currentThread(), bArr2);
            if (!f51533x) {
                f51533x = true;
                AndroidUtilities.runOnUIThread(this.f51548p, 5000L);
            }
            return bArr2;
        }
        this.f51540g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: zf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f51549q && this.f51543k) {
            return false;
        }
        return true;
    }
}
