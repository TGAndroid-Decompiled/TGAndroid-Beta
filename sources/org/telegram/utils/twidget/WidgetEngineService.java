package org.telegram.utils.twidget;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public final class WidgetEngineService extends Service {
    public static volatile String f52759b;
    public static String f52760c;
    public static final ExecutorService d = Executors.newSingleThreadExecutor(new h2.l0(6));
    public final z f52761a = new z(this);

    public static String a(AssetManager assetManager) {
        int i7;
        int i10;
        String[] strArr;
        int i11;
        AssetManager assetManager2 = assetManager;
        synchronized (WidgetEngineService.class) {
            try {
                String str = f52760c;
                if (str != null) {
                    return str;
                }
                InputStream open = assetManager2.open("WidgetSandbox/manifest.txt");
                try {
                    ExecutorService executorService = a1.f52766a;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = open.read(bArr);
                        i7 = 0;
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    String str2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    open.close();
                    String[] split = str2.split("\n");
                    int length = split.length;
                    byte[] bArr2 = null;
                    byte[] bArr3 = null;
                    byte[] bArr4 = null;
                    byte[] bArr5 = null;
                    byte[] bArr6 = null;
                    int i12 = 0;
                    while (i12 < length) {
                        String str3 = split[i12];
                        if (str3.isEmpty()) {
                            strArr = split;
                            i11 = length;
                            i10 = i7;
                        } else {
                            String[] split2 = str3.split(" ", 2);
                            byte[] b10 = b(assetManager2, split2[1]);
                            StringBuilder sb2 = new StringBuilder();
                            i10 = i7;
                            byte[] digest = MessageDigest.getInstance("SHA-256").digest(b10);
                            int length2 = digest.length;
                            int i13 = i10;
                            while (i13 < length2) {
                                int i14 = i13;
                                int i15 = length;
                                Object[] objArr = new Object[1];
                                objArr[i10] = Integer.valueOf(digest[i14] & 255);
                                sb2.append(String.format("%02x", objArr));
                                i13 = i14 + 1;
                                split = split;
                                length = i15;
                            }
                            strArr = split;
                            i11 = length;
                            if (split2[i10].equals(sb2.toString())) {
                                String str4 = split2[1];
                                switch (str4.hashCode()) {
                                    case -1927203231:
                                        if (!str4.equals("validator-bundle.qbc")) {
                                            break;
                                        } else {
                                            bArr6 = b10;
                                            continue;
                                        }
                                    case -1818708305:
                                        if (str4.equals("sandbox-bundle.js")) {
                                            bArr2 = b10;
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case -1529025109:
                                        if (str4.equals("renderer-bundle.js")) {
                                            bArr4 = b10;
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case -754904710:
                                        if (str4.equals("validator-bundle.js")) {
                                            bArr3 = b10;
                                            break;
                                        } else {
                                            continue;
                                        }
                                    case -545376308:
                                        if (str4.equals("sandbox-bundle.qbc")) {
                                            bArr5 = b10;
                                            break;
                                        } else {
                                            continue;
                                        }
                                    default:
                                        continue;
                                }
                            } else {
                                throw new IllegalStateException("Bundle checksum mismatch: " + split2[1]);
                            }
                        }
                        i12++;
                        assetManager2 = assetManager;
                        i7 = i10;
                        split = strArr;
                        length = i11;
                    }
                    int i16 = i7;
                    if (bArr2 != null && bArr3 != null) {
                        byte[] digest2 = MessageDigest.getInstance("SHA-256").digest(str2.getBytes(StandardCharsets.UTF_8));
                        StringBuilder sb3 = new StringBuilder("assets:");
                        for (int i17 = i16; i17 < 12; i17++) {
                            Object[] objArr2 = new Object[1];
                            objArr2[i16] = Integer.valueOf(digest2[i17] & 255);
                            sb3.append(String.format("%02x", objArr2));
                        }
                        WidgetSandboxNative.registerResources(sb3.toString().getBytes(StandardCharsets.UTF_8), bArr2, bArr3, bArr4, bArr5, bArr6);
                        String sb4 = sb3.toString();
                        f52760c = sb4;
                        return sb4;
                    }
                    throw new IllegalStateException("Widget bundles are missing");
                } catch (Throwable th2) {
                    if (open != null) {
                        try {
                            open.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new IllegalStateException("Widget bundles: " + e11);
            } finally {
            }
        }
    }

    public static byte[] b(AssetManager assetManager, String str) {
        if (!str.contains("..") && !str.startsWith("/")) {
            InputStream open = assetManager.open("WidgetSandbox/WidgetJS/".concat(str));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = open.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        open.close();
                        return byteArray;
                    }
                }
            } catch (Throwable th2) {
                if (open != null) {
                    try {
                        open.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("Invalid bundle path");
        }
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 28 && Process.isIsolated()) {
            return true;
        }
        String str = f52759b;
        if (str == null) {
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
                byte[] bArr = new byte[256];
                int read = fileInputStream.read(bArr);
                int i7 = 0;
                while (i7 < Math.max(0, read) && bArr[i7] != 0) {
                    i7++;
                }
                String str2 = new String(bArr, 0, i7, StandardCharsets.UTF_8);
                fileInputStream.close();
                str = str2;
            } catch (Exception unused) {
                str = "";
            }
            f52759b = str;
        }
        return str.contains(":widgets");
    }

    private static native int installSeccomp(boolean z9);

    @Override
    public final IBinder onBind(Intent intent) {
        return this.f52761a;
    }

    @Override
    public final void onCreate() {
        long j3;
        super.onCreate();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (WidgetSandboxNative.available()) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            installSeccomp(false);
            StringBuilder sb2 = new StringBuilder("engine up: ");
            if (Build.VERSION.SDK_INT >= 24) {
                j3 = uptimeMillis - Process.getStartUptimeMillis();
            } else {
                j3 = -1;
            }
            sb2.append(j3);
            sb2.append(" ms from fork to onCreate, library ");
            sb2.append(uptimeMillis2);
            sb2.append(" ms, seccomp ");
            sb2.append((SystemClock.uptimeMillis() - uptimeMillis) - uptimeMillis2);
            sb2.append(" ms");
            Log.i("WidgetEngine", sb2.toString());
            return;
        }
        throw new IllegalStateException("libtwidget is missing");
    }
}
