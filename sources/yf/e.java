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
import org.telegram.ui.Components.xi0;
import org.telegram.ui.q31;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f50067x;
    public static ThreadPoolExecutor f50069z;
    public final BitmapDrawable f50070a;
    public final int f50071b;
    public final int f50072c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList f50073e;
    public final boolean f50074f;
    public byte[] f50075g;
    public final Object h;
    public int f50076i;
    public boolean f50077j;
    public volatile boolean f50078k;
    public final int f50079l;
    public final File f50080m;
    public int f50081n;
    public final AtomicBoolean f50082o;
    public final rg.b0 f50083p;
    public volatile boolean f50084q;
    public volatile boolean f50085r;
    public RandomAccessFile f50086s;
    public BitmapFactory.Options f50087t;
    public Bitmap f50088u;
    public static final ConcurrentHashMap f50066w = new ConcurrentHashMap();
    public static final int f50068y = Utilities.clamp(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, n1 n1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.f50073e = arrayList;
        this.h = new Object();
        this.f50082o = new AtomicBoolean(false);
        this.f50083p = new rg.b0(this, 9);
        this.f50070a = (BitmapDrawable) cVar;
        this.f50071b = i10;
        this.f50072c = i11;
        this.f50079l = n1Var.f2219a;
        String name = file.getName();
        if (f50069z == null) {
            int i13 = f50068y;
            f50069z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
            str2 = i2.g.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a4.a.s(sb2, str2, ".pcache2"));
        this.f50080m = file3;
        this.f50074f = (i10 >= AndroidUtilities.dp(60.0f) || i11 >= AndroidUtilities.dp(60.0f)) ? false : false;
        if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.f50078k = file3.exists();
            try {
                if (this.f50078k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f50084q = randomAccessFile.readBoolean();
                            if (this.f50084q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f50084q = false;
                                    this.f50078k = false;
                                    file3.delete();
                                } else {
                                    if (this.f50086s != randomAccessFile) {
                                        a();
                                    }
                                    this.f50086s = randomAccessFile;
                                }
                            }
                            if (this.f50086s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f50080m.delete();
                                this.f50078k = false;
                                if (this.f50086s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f50086s != randomAccessFile && randomAccessFile != null) {
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
            this.f50078k = false;
            this.f50084q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            xi0.T0.postRunnable(new q31(16));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f50086s;
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
                dVar.f50057c = wrap.getInt();
                dVar.f50056b = wrap.getInt();
                this.f50073e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f50074f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f50066w.get(Thread.currentThread());
        } else {
            bArr = this.f50075g;
        }
        if (bArr != null && bArr.length >= dVar.f50056b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f50056b * 1.3f)];
        if (z10) {
            f50066w.put(Thread.currentThread(), bArr2);
            if (!f50067x) {
                f50067x = true;
                AndroidUtilities.runOnUIThread(this.f50083p, 5000L);
            }
            return bArr2;
        }
        this.f50075g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: yf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f50084q && this.f50078k) {
            return false;
        }
        return true;
    }
}
