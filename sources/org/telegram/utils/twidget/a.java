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
public final class a extends b {
    @Override
    public final long b(Context context, String str, String str2, float f, float f2, int i, String str3, String str4, String str5, String str6, boolean z, WidgetSandboxBackend widgetSandboxBackend) {
        File file;
        char c;
        int i2;
        AssetManager assetManager;
        if (WidgetSandboxNative.available()) {
            int i3 = 0;
            WidgetSandboxNative.conformance(false);
            WidgetSandboxNative.attackScan(false);
            WidgetSandboxNative.limits(null);
            ExecutorService executorService = iyc.a;
            synchronized (iyc.class) {
                file = iyc.b;
                if (file == null) {
                    AssetManager assets = context.getApplicationContext().getAssets();
                    InputStream open = assets.open("WidgetSandbox/manifest.txt");
                    String a = iyc.a(open);
                    open.close();
                    byte[] digest = MessageDigest.getInstance("SHA-256").digest(a.getBytes(StandardCharsets.UTF_8));
                    StringBuilder sb = new StringBuilder();
                    int i4 = 0;
                    while (true) {
                        c = 1;
                        if (i4 >= 12) {
                            break;
                        }
                        sb.append(String.format("%02x", Integer.valueOf(digest[i4] & 255)));
                        i4++;
                    }
                    File file2 = new File(context.getFilesDir(), "widget-sandbox/" + ((Object) sb));
                    File file3 = new File(file2, "ready");
                    if (!file3.isFile()) {
                        String[] split = a.split("\n");
                        int length = split.length;
                        int i5 = 0;
                        while (i5 < length) {
                            String str7 = split[i5];
                            if (str7.isEmpty()) {
                                i2 = i3;
                                assetManager = assets;
                            } else {
                                String[] split2 = str7.split(" ", 2);
                                String str8 = split2[c];
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
                                            messageDigest.update(bArr, i3, read);
                                            fileOutputStream.write(bArr, i3, read);
                                        }
                                        fileOutputStream.close();
                                        open2.close();
                                        StringBuilder sb2 = new StringBuilder();
                                        byte[] digest2 = messageDigest.digest();
                                        int length2 = digest2.length;
                                        int i6 = i3;
                                        while (i6 < length2) {
                                            int i7 = i3;
                                            AssetManager assetManager2 = assets;
                                            Object[] objArr = new Object[1];
                                            objArr[i7] = Integer.valueOf(digest2[i6] & 255);
                                            sb2.append(String.format("%02x", objArr));
                                            i6++;
                                            i3 = i7;
                                            assets = assetManager2;
                                        }
                                        i2 = i3;
                                        assetManager = assets;
                                        if (!split2[i2].equals(sb2.toString())) {
                                            throw new IllegalStateException("Bundle checksum mismatch: " + str8);
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } else {
                                    throw new IllegalArgumentException("Invalid bundle path");
                                }
                            }
                            i5++;
                            i3 = i2;
                            assets = assetManager;
                            c = 1;
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                        fileOutputStream2.write(1);
                        fileOutputStream2.close();
                    }
                    iyc.b = file2;
                    file = file2;
                }
            }
            String absolutePath = file.getAbsolutePath();
            Charset charset = StandardCharsets.UTF_8;
            return WidgetSandboxNative.create(absolutePath.getBytes(charset), str.getBytes(charset), str2.getBytes(charset), f, f2, i, str3.getBytes(charset), str4.getBytes(charset), str5.getBytes(charset), str6.getBytes(charset), z, widgetSandboxBackend);
        }
        dq9.m("libtwidget is missing");
        return 0L;
    }
}
