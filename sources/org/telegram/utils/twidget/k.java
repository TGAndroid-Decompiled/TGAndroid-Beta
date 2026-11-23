package org.telegram.utils.twidget;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
public final class k extends l {
    @Override
    public final void a(long j3, long j10, int i7, byte[] bArr) {
        WidgetSandboxNative.answerRequest(j3, j10, i7, bArr);
    }

    @Override
    public final long c(Context context, String str, String str2, float f10, float f11, int i7, String str3, String str4, String str5, String str6, boolean z10, WidgetSandboxBackend widgetSandboxBackend) {
        File file;
        char c10;
        int i10;
        AssetManager assetManager;
        if (WidgetSandboxNative.available()) {
            int i11 = 0;
            WidgetSandboxNative.conformance(false);
            WidgetSandboxNative.attackScan(false);
            WidgetSandboxNative.limits(null);
            ExecutorService executorService = i1.f54914a;
            synchronized (i1.class) {
                try {
                    file = i1.f54915b;
                    if (file == null) {
                        AssetManager assets = context.getApplicationContext().getAssets();
                        InputStream open = assets.open("WidgetSandbox/manifest.txt");
                        String a10 = i1.a(open);
                        open.close();
                        byte[] digest = MessageDigest.getInstance("SHA-256").digest(a10.getBytes(StandardCharsets.UTF_8));
                        StringBuilder sb2 = new StringBuilder();
                        int i12 = 0;
                        while (true) {
                            c10 = 1;
                            if (i12 >= 12) {
                                break;
                            }
                            sb2.append(String.format("%02x", Integer.valueOf(digest[i12] & 255)));
                            i12++;
                        }
                        File file2 = new File(context.getFilesDir(), "widget-sandbox/" + ((Object) sb2));
                        File file3 = new File(file2, "ready");
                        if (!file3.isFile()) {
                            String[] split = a10.split("\n");
                            int length = split.length;
                            int i13 = 0;
                            while (i13 < length) {
                                String str7 = split[i13];
                                if (str7.isEmpty()) {
                                    i10 = i11;
                                    assetManager = assets;
                                } else {
                                    String[] split2 = str7.split(" ", 2);
                                    String str8 = split2[c10];
                                    if (!str8.contains("..") && !str8.startsWith("/")) {
                                        File file4 = new File(file2, str8);
                                        if (!file4.getParentFile().isDirectory() && !file4.getParentFile().mkdirs()) {
                                            throw new IllegalStateException("Cannot create bundle directory");
                                        }
                                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                        InputStream open2 = assets.open("WidgetSandbox/WidgetJS/" + str8);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                        try {
                                            byte[] bArr = new byte[16384];
                                            while (true) {
                                                int read = open2.read(bArr);
                                                if (read == -1) {
                                                    break;
                                                }
                                                messageDigest.update(bArr, i11, read);
                                                fileOutputStream.write(bArr, i11, read);
                                            }
                                            fileOutputStream.close();
                                            open2.close();
                                            StringBuilder sb3 = new StringBuilder();
                                            byte[] digest2 = messageDigest.digest();
                                            int length2 = digest2.length;
                                            int i14 = i11;
                                            while (i14 < length2) {
                                                int i15 = i11;
                                                AssetManager assetManager2 = assets;
                                                Object[] objArr = new Object[1];
                                                objArr[i15] = Integer.valueOf(digest2[i14] & 255);
                                                sb3.append(String.format("%02x", objArr));
                                                i14++;
                                                i11 = i15;
                                                assets = assetManager2;
                                            }
                                            i10 = i11;
                                            assetManager = assets;
                                            if (!split2[i10].equals(sb3.toString())) {
                                                throw new IllegalStateException("Bundle checksum mismatch: " + str8);
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Invalid bundle path");
                                    }
                                }
                                i13++;
                                i11 = i10;
                                assets = assetManager;
                                c10 = 1;
                            }
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                            fileOutputStream2.write(1);
                            fileOutputStream2.close();
                        }
                        i1.f54915b = file2;
                        file = file2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            String absolutePath = file.getAbsolutePath();
            Charset charset = StandardCharsets.UTF_8;
            return WidgetSandboxNative.create(absolutePath.getBytes(charset), str.getBytes(charset), str2.getBytes(charset), f10, f11, i7, str3.getBytes(charset), str4.getBytes(charset), str5.getBytes(charset), str6.getBytes(charset), z10, widgetSandboxBackend);
        }
        throw new IllegalStateException("libtwidget is missing");
    }

    @Override
    public final void d(long j3, byte[] bArr) {
        WidgetSandboxNative.data(j3, bArr);
    }

    @Override
    public final void e(long j3) {
        WidgetSandboxNative.destroy(j3);
    }

    @Override
    public final void f(long j3, int i7, float f10, float f11, int i10) {
        WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
    }

    @Override
    public final void i(long j3) {
        WidgetSandboxNative.repaint(j3);
    }

    @Override
    public final void j(long j3, byte[] bArr) {
        WidgetSandboxNative.safeArea(j3, bArr);
    }

    @Override
    public final void k(long j3, byte[] bArr) {
        WidgetSandboxNative.theme(j3, bArr);
    }

    @Override
    public final void l(long j3, float f10, boolean z10, boolean z11, boolean z12) {
        WidgetSandboxNative.tick(j3, f10, z10, z11, z12);
    }

    @Override
    public final void m(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z10, z11, i11, i12);
    }

    @Override
    public final void o(long j3, boolean z10) {
        WidgetSandboxNative.visible(j3, z10);
    }

    @Override
    public final void p(long j3, float f10) {
        WidgetSandboxNative.width(j3, f10);
    }
}
