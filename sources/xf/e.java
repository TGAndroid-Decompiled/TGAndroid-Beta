package xf;

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
import org.telegram.ui.web.d1;
import sg.a1;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f45110x;
    public static ThreadPoolExecutor f45112z;
    public final BitmapDrawable f45113a;
    public final int f45114b;
    public final int f45115c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f45116f;
    public byte[] f45117g;
    public final Object h;
    public int f45118i;
    public boolean f45119j;
    public volatile boolean f45120k;
    public final int f45121l;
    public final File f45122m;
    public int f45123n;
    public final AtomicBoolean f45124o;
    public final a1 f45125p;
    public volatile boolean f45126q;
    public volatile boolean f45127r;
    public RandomAccessFile f45128s;
    public BitmapFactory.Options f45129t;
    public Bitmap f45130u;
    public static final ConcurrentHashMap f45109w = new ConcurrentHashMap();
    public static final int f45111y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f45124o = new AtomicBoolean(false);
        this.f45125p = new a1(this, 5);
        this.f45113a = (BitmapDrawable) cVar;
        this.f45114b = i10;
        this.f45115c = i11;
        this.f45121l = n1Var.f1857a;
        String name = file.getName();
        if (f45112z == null) {
            int i13 = f45111y;
            f45112z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = hc.b.j(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a4.a.s(sb2, str2, ".pcache2"));
        this.f45122m = file3;
        this.f45116f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f45120k = file3.exists();
            try {
                if (this.f45120k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f45126q = randomAccessFile.readBoolean();
                            if (this.f45126q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f45126q = false;
                                    this.f45120k = false;
                                    file3.delete();
                                } else {
                                    if (this.f45128s != randomAccessFile) {
                                        a();
                                    }
                                    this.f45128s = randomAccessFile;
                                }
                            }
                            if (this.f45128s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f45122m.delete();
                                this.f45120k = false;
                                if (this.f45128s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f45128s != randomAccessFile && randomAccessFile != null) {
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
            this.f45120k = false;
            this.f45126q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            hj0.T0.postRunnable(new d1(10));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f45128s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: xf.e.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                d dVar = new d(i11);
                dVar.f45101c = wrap.getInt();
                dVar.f45100b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f45116f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f45109w.get(Thread.currentThread());
        } else {
            bArr = this.f45117g;
        }
        if (bArr != null && bArr.length >= dVar.f45100b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f45100b * 1.3f)];
        if (z10) {
            f45109w.put(Thread.currentThread(), bArr2);
            if (!f45110x) {
                f45110x = true;
                AndroidUtilities.runOnUIThread(this.f45125p, 5000L);
            }
            return bArr2;
        }
        this.f45117g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: xf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f45126q && this.f45120k) {
            return false;
        }
        return true;
    }
}
