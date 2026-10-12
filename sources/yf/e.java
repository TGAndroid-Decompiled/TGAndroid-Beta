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
import org.telegram.ui.Components.fk0;
import org.telegram.ui.w21;
import p4.t0;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f52362x;
    public static ThreadPoolExecutor f52364z;
    public final BitmapDrawable f52365a;
    public final int f52366b;
    public final int f52367c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f52368e;
    public final boolean f52369f;
    public byte[] f52370g;
    public final Object h;
    public int f52371i;
    public boolean f52372j;
    public volatile boolean f52373k;
    public final int f52374l;
    public final File f52375m;
    public int f52376n;
    public final AtomicBoolean f52377o;
    public final t0 f52378p;
    public volatile boolean f52379q;
    public volatile boolean f52380r;
    public RandomAccessFile f52381s;
    public BitmapFactory.Options f52382t;
    public Bitmap f52383u;
    public static final ConcurrentHashMap f52361w = new ConcurrentHashMap();
    public static final int f52363y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f52368e = arrayList;
        this.h = new Object();
        this.f52377o = new AtomicBoolean(false);
        this.f52378p = new t0(this, 13);
        this.f52365a = (BitmapDrawable) cVar;
        this.f52366b = i10;
        this.f52367c = i11;
        this.f52374l = n1Var.f3490a;
        String name = file.getName();
        if (f52364z == null) {
            int i13 = f52363y;
            f52364z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = hg.c.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.t(sb2, str2, ".pcache2"));
        this.f52375m = file3;
        this.f52369f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : z11;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f52373k = file3.exists();
            try {
                if (this.f52373k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f52379q = randomAccessFile.readBoolean();
                            if (this.f52379q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f52379q = false;
                                    this.f52373k = false;
                                    file3.delete();
                                } else {
                                    if (this.f52381s != randomAccessFile) {
                                        a();
                                    }
                                    this.f52381s = randomAccessFile;
                                }
                            }
                            if (this.f52381s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f52375m.delete();
                                this.f52373k = false;
                                if (this.f52381s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f52381s != randomAccessFile && randomAccessFile != null) {
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
            this.f52373k = false;
            this.f52379q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            fk0.T0.postRunnable(new w21(20));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f52381s;
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
                dVar.f52360c = wrap.getInt();
                dVar.f52359b = wrap.getInt();
                this.f52368e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f52369f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f52361w.get(Thread.currentThread());
        } else {
            bArr = this.f52370g;
        }
        if (bArr != null && bArr.length >= dVar.f52359b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f52359b * 1.3f)];
        if (z10) {
            f52361w.put(Thread.currentThread(), bArr2);
            if (!f52362x) {
                f52362x = true;
                AndroidUtilities.runOnUIThread(this.f52378p, 5000L);
            }
            return bArr2;
        }
        this.f52370g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f52379q && this.f52373k) {
            return false;
        }
        return true;
    }
}
