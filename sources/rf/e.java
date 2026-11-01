package rf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import b2.r1;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.i0;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.ew;
public final class e {
    public static int A;
    public static a5.a B;
    public static boolean v;
    public static volatile boolean f46516x;
    public static ThreadPoolExecutor f46518z;
    public final BitmapDrawable f46519a;
    public final int f46520b;
    public final int f46521c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f46522f;
    public byte[] f46523g;
    public final Object h;
    public int f46524i;
    public boolean f46525j;
    public volatile boolean f46526k;
    public final int f46527l;
    public final File f46528m;
    public int f46529n;
    public final AtomicBoolean f46530o;
    public final ew f46531p;
    public volatile boolean f46532q;
    public volatile boolean f46533r;
    public RandomAccessFile f46534s;
    public BitmapFactory.Options f46535t;
    public Bitmap f46536u;
    public static final ConcurrentHashMap f46515w = new ConcurrentHashMap();
    public static final int f46517y = Utilities.j(Runtime.getRuntime().availableProcessors() - 2, 6, 1);

    public e(File file, c cVar, r1 r1Var, int i10, int i11, boolean z10, int i12) {
        String str;
        String str2;
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.f46530o = new AtomicBoolean(false);
        this.f46531p = new ew(this, 24);
        this.f46519a = (BitmapDrawable) cVar;
        this.f46520b = i10;
        this.f46521c = i11;
        this.f46527l = r1Var.f2221a;
        String name = file.getName();
        if (f46518z == null) {
            int i13 = f46517y;
            f46518z = new ThreadPoolExecutor(i13, i13, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(b8.j(4), "acache");
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
            str2 = i0.a.i(i12, "_fitz");
        } else {
            str2 = "";
        }
        File file3 = new File(file2, a1.g.r(sb2, str2, ".pcache2"));
        this.f46528m = file3;
        this.f46522f = (i10 >= i0.L(60.0f) || i11 >= i0.L(60.0f)) ? false : z11;
        if (uz.o() >= 2) {
            this.f46526k = file3.exists();
            try {
                if (this.f46526k) {
                    try {
                        randomAccessFile = new RandomAccessFile(file3, "r");
                        try {
                            this.f46532q = randomAccessFile.readBoolean();
                            if (this.f46532q && arrayList.isEmpty()) {
                                randomAccessFile.seek(randomAccessFile.readInt());
                                int readInt = randomAccessFile.readInt();
                                d(randomAccessFile, readInt > 10000 ? 0 : readInt);
                                if (arrayList.size() == 0) {
                                    this.f46532q = false;
                                    this.f46526k = false;
                                    file3.delete();
                                } else {
                                    if (this.f46534s != randomAccessFile) {
                                        a();
                                    }
                                    this.f46534s = randomAccessFile;
                                }
                            }
                            if (this.f46534s != randomAccessFile) {
                                randomAccessFile.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                th.printStackTrace();
                                this.f46528m.delete();
                                this.f46526k = false;
                                if (this.f46534s != randomAccessFile && randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                            } catch (Throwable th3) {
                                try {
                                    if (this.f46534s != randomAccessFile && randomAccessFile != null) {
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
            this.f46526k = false;
            this.f46532q = false;
        }
    }

    public static void c() {
        int i10 = A - 1;
        A = i10;
        if (i10 <= 0) {
            A = 0;
            ci0.T0.postRunnable(new r5.a(1));
        }
    }

    public final void a() {
        RandomAccessFile randomAccessFile = this.f46534s;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: rf.e.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i10) {
        if (i10 != 0) {
            byte[] bArr = new byte[i10 * 8];
            randomAccessFile.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            for (int i11 = 0; i11 < i10; i11++) {
                d dVar = new d(i11);
                dVar.f46511c = wrap.getInt();
                dVar.f46510b = wrap.getInt();
                this.e.add(dVar);
            }
        }
    }

    public final byte[] e(d dVar) {
        boolean z10;
        byte[] bArr;
        if (this.f46522f && Thread.currentThread().getName().startsWith("DispatchQueuePoolThreadSafety_")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bArr = (byte[]) f46515w.get(Thread.currentThread());
        } else {
            bArr = this.f46523g;
        }
        if (bArr != null && bArr.length >= dVar.f46510b) {
            return bArr;
        }
        byte[] bArr2 = new byte[(int) (dVar.f46510b * 1.3f)];
        if (z10) {
            f46515w.put(Thread.currentThread(), bArr2);
            if (!f46516x) {
                f46516x = true;
                i0.h3(this.f46531p, 5000L);
            }
            return bArr2;
        }
        this.f46523g = bArr2;
        return bArr2;
    }

    public final int f(android.graphics.Bitmap r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.e.f(android.graphics.Bitmap, int):int");
    }

    public final boolean g() {
        if (this.f46532q && this.f46526k) {
            return false;
        }
        return true;
    }
}
