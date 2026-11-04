package t4;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import k2.p1;
public abstract class e {
    public static final kb.a f54915a = new kb.a(24);
    public static final byte[] f54916b = {112, 114, 111, 0};
    public static final byte[] f54917c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] f54918e = {48, 49, 48, 0};
    public static final byte[] f54919f = {48, 48, 57, 0};
    public static final byte[] f54920g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] f54921i = {48, 48, 49, 0};
    public static final byte[] f54922j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int i3 = 0;
        for (b bVar : bVarArr) {
            i3 += ((((bVar.f54913g * 2) + 7) & (-8)) / 8) + (bVar.f54911e * 2) + d(bArr, bVar.f54908a, bVar.f54909b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f54912f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, f54919f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bArr, bVar2.f54908a, bVar2.f54909b));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.h;
                int length = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bArr, bVar3.f54908a, bVar3.f54909b));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.h;
                int length2 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    public static String d(byte[] bArr, String str, String str2) {
        Object obj;
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f54920g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    return a1.g.s(com.google.android.recaptcha.internal.a.l(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
                }
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(int i3, InputStream inputStream) {
        byte[] bArr = new byte[i3];
        int i10 = 0;
        while (i10 < i3) {
            int read = inputStream.read(bArr, i10, i3 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                throw new IllegalStateException(p1.i(i3, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 += (int) m(2, byteArrayInputStream);
            iArr[i11] = i10;
        }
        return iArr;
    }

    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: t4.e.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f54921i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m10 = (int) m(1, fileInputStream);
                    byte[] h7 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
                        try {
                            b[] j10 = j(byteArrayInputStream, m10, bVarArr);
                            byteArrayInputStream.close();
                            return j10;
                        } catch (Throwable th2) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, f54922j)) {
            int m11 = (int) m(2, fileInputStream);
            byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
                try {
                    b[] k10 = k(byteArrayInputStream2, bArr2, m11, bVarArr);
                    byteArrayInputStream2.close();
                    return k10;
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i3, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i3 == bVarArr.length) {
            String[] strArr = new String[i3];
            int[] iArr = new int[i3];
            for (int i10 = 0; i10 < i3; i10++) {
                iArr[i10] = (int) m(2, byteArrayInputStream);
                strArr[i10] = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i3; i11++) {
                b bVar = bVarArr[i11];
                if (bVar.f54909b.equals(strArr[i11])) {
                    int i12 = iArr[i11];
                    bVar.f54911e = i12;
                    bVar.h = g(byteArrayInputStream, i12);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i3 == bVarArr.length) {
            for (int i10 = 0; i10 < i3; i10++) {
                m(2, byteArrayInputStream);
                String str2 = new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
                long m10 = m(4, byteArrayInputStream);
                int m11 = (int) m(2, byteArrayInputStream);
                b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i11].f54909b.equals(str)) {
                            bVar = bVarArr[i11];
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (bVar != null) {
                    bVar.d = m10;
                    int[] g7 = g(byteArrayInputStream, m11);
                    if (Arrays.equals(bArr, h)) {
                        bVar.f54911e = m11;
                        bVar.h = g7;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f54918e)) {
            int m10 = (int) m(1, fileInputStream);
            byte[] h7 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
                try {
                    b[] n4 = n(byteArrayInputStream, str, m10);
                    byteArrayInputStream.close();
                    return n4;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(int i3, InputStream inputStream) {
        byte[] f10 = f(i3, inputStream);
        long j10 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j10 += (f10[i10] & 255) << (i10 * 8);
        }
        return j10;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        int i10;
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i3];
        for (int i12 = 0; i12 < i3; i12++) {
            int m10 = (int) m(2, byteArrayInputStream);
            bVarArr[i12] = new b(str, new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), m10, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[m10], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i3) {
            b bVar = bVarArr[i13];
            int available = byteArrayInputStream.available();
            int i14 = bVar.f54912f;
            int i15 = bVar.f54913g;
            TreeMap treeMap = bVar.f54914i;
            int i16 = available - i14;
            int i17 = i11;
            while (byteArrayInputStream.available() > i16) {
                i17 += (int) m(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i17), 1);
                int m11 = (int) m(2, byteArrayInputStream);
                while (m11 > 0) {
                    m(2, byteArrayInputStream);
                    int m12 = (int) m(1, byteArrayInputStream);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(1, byteArrayInputStream);
                            int i18 = i11;
                            int i19 = i13;
                            for (int m13 = (int) m(1, byteArrayInputStream); m13 > 0; m13--) {
                                m(2, byteArrayInputStream);
                            }
                            m12--;
                            i11 = i18;
                            i13 = i19;
                        }
                    }
                    m11--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i20 = i11;
            int i21 = i13;
            if (byteArrayInputStream.available() == i16) {
                bVar.h = g(byteArrayInputStream, bVar.f54911e);
                BitSet valueOf = BitSet.valueOf(f((((i15 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
                for (int i22 = i20; i22 < i15; i22++) {
                    if (valueOf.get(i22)) {
                        i10 = 2;
                    } else {
                        i10 = i20;
                    }
                    if (valueOf.get(i22 + i15)) {
                        i10 |= 4;
                    }
                    if (i10 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i22));
                        if (num == null) {
                            num = Integer.valueOf(i20);
                        }
                        treeMap.put(Integer.valueOf(i22), Integer.valueOf(i10 | num.intValue()));
                    }
                }
                i13 = i21 + 1;
                i11 = i20;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, bVarArr.length);
                int i10 = 2;
                int i11 = 2;
                for (b bVar : bVarArr) {
                    t(byteArrayOutputStream2, bVar.f54910c, 4);
                    t(byteArrayOutputStream2, bVar.d, 4);
                    t(byteArrayOutputStream2, bVar.f54913g, 4);
                    String d10 = d(bArr2, bVar.f54908a, bVar.f54909b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d10.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i11 = i11 + 14 + length2;
                    byteArrayOutputStream2.write(d10.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i11 == byteArray.length) {
                    k kVar = new k(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(kVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < bVarArr.length) {
                        try {
                            b bVar2 = bVarArr[i12];
                            u(byteArrayOutputStream3, i12);
                            u(byteArrayOutputStream3, bVar2.f54911e);
                            i13 = i13 + 4 + (bVar2.f54911e * i10);
                            int[] iArr = bVar2.h;
                            int length3 = iArr.length;
                            int i14 = i3;
                            int i15 = i10;
                            int i16 = i14;
                            while (i16 < length3) {
                                int i17 = iArr[i16];
                                u(byteArrayOutputStream3, i17 - i14);
                                i16++;
                                i14 = i17;
                            }
                            i12++;
                            i10 = i15;
                            i3 = 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        k kVar2 = new k(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(kVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < bVarArr.length) {
                            try {
                                b bVar3 = bVarArr[i18];
                                int i20 = 0;
                                for (Map.Entry entry : bVar3.f54914i.entrySet()) {
                                    i20 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream4, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream5, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                u(byteArrayOutputStream3, i18);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i21 = i19 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream3, length4, 4);
                                u(byteArrayOutputStream3, i20);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i19 = i21 + length4;
                                i18++;
                                arrayList3 = arrayList4;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i19 == byteArray5.length) {
                            k kVar3 = new k(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(kVar3);
                            long j11 = 4;
                            long size = j11 + j11 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i22 = 0;
                            while (i22 < arrayList2.size()) {
                                k kVar4 = (k) arrayList2.get(i22);
                                int i23 = kVar4.f54929a;
                                byte[] bArr3 = kVar4.f54930b;
                                if (i23 != 1) {
                                    if (i23 != 2) {
                                        if (i23 != 3) {
                                            if (i23 != 4) {
                                                if (i23 == 5) {
                                                    j10 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j10 = 3;
                                            }
                                        } else {
                                            j10 = 2;
                                        }
                                    } else {
                                        j10 = 1;
                                    }
                                } else {
                                    j10 = 0;
                                }
                                t(byteArrayOutputStream, j10, 4);
                                t(byteArrayOutputStream, size, 4);
                                if (kVar4.f54931c) {
                                    byte[] a10 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a10);
                                    t(byteArrayOutputStream, a10.length, 4);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    length = a10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i22++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] bArr4 = f54918e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b10 = b(bVarArr, bArr4);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b10.length, 4);
            byte[] a11 = a(b10);
            t(byteArrayOutputStream, a11.length, 4);
            byteArrayOutputStream.write(a11);
            return true;
        }
        byte[] bArr5 = f54920g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, bVarArr.length, 1);
            for (b bVar4 : bVarArr) {
                String d11 = d(bArr5, bVar4.f54908a, bVar4.f54909b);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d11.getBytes(charset2).length);
                u(byteArrayOutputStream, bVar4.h.length);
                t(byteArrayOutputStream, bVar4.f54914i.size() * 4, 4);
                t(byteArrayOutputStream, bVar4.f54910c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                for (Integer num : bVar4.f54914i.keySet()) {
                    u(byteArrayOutputStream, num.intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i25 : bVar4.h) {
                    u(byteArrayOutputStream, i25);
                }
            }
            return true;
        }
        byte[] bArr6 = f54919f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b11 = b(bVarArr, bArr6);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b11.length, 4);
            byte[] a12 = a(b11);
            t(byteArrayOutputStream, a12.length, 4);
            byteArrayOutputStream.write(a12);
            return true;
        }
        byte[] bArr7 = h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar5 : bVarArr) {
                String str = bVar5.f54908a;
                TreeMap treeMap = bVar5.f54914i;
                String d12 = d(bArr7, str, bVar5.f54909b);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d12.getBytes(charset3).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar5.h.length);
                t(byteArrayOutputStream, bVar5.f54910c, 4);
                byteArrayOutputStream.write(d12.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    u(byteArrayOutputStream, num2.intValue());
                }
                for (int i26 : bVar5.h) {
                    u(byteArrayOutputStream, i26);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f54911e);
        t(byteArrayOutputStream, bVar.f54912f, 4);
        t(byteArrayOutputStream, bVar.f54910c, 4);
        t(byteArrayOutputStream, bVar.f54913g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f54913g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f54914i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i3 = intValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + bVar.f54913g;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i3 = 0;
        for (Map.Entry entry : bVar.f54914i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i3);
                u(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, t4.d r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: t4.e.s(android.content.Context, java.util.concurrent.Executor, t4.d, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j10, int i3) {
        byte[] bArr = new byte[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            bArr[i10] = (byte) ((j10 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        t(byteArrayOutputStream, i3, 2);
    }
}
