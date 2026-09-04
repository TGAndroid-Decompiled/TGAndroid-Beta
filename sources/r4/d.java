package r4;

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
public abstract class d {
    public static final na.d f44896a = new Object();
    public static final byte[] f44897b = {112, 114, 111, 0};
    public static final byte[] f44898c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] f44899e = {48, 49, 48, 0};
    public static final byte[] f44900f = {48, 48, 57, 0};
    public static final byte[] f44901g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] f44902i = {48, 48, 49, 0};
    public static final byte[] f44903j = {48, 48, 50, 0};

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
        int i10 = 0;
        for (b bVar : bVarArr) {
            i10 += ((((bVar.f44894g * 2) + 7) & (-8)) / 8) + (bVar.f44892e * 2) + d(bVar.f44889a, bVar.f44890b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f44893f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f44900f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f44889a, bVar2.f44890b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] iArr = bVar2.h;
                int length = iArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = iArr[i11];
                    u(byteArrayOutputStream, i13 - i12);
                    i11++;
                    i12 = i13;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f44889a, bVar3.f44890b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] iArr2 = bVar4.h;
                int length2 = iArr2.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length2) {
                    int i16 = iArr2[i14];
                    u(byteArrayOutputStream, i16 - i15);
                    i14++;
                    i15 = i16;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
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

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f44901g;
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
                    return a4.a.s(a4.a.u(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
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

    public static byte[] f(int i10, InputStream inputStream) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int read = inputStream.read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new IllegalStateException(i2.g.i(i10, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += (int) m(2, byteArrayInputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: r4.d.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f44902i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m10 = (int) m(1, fileInputStream);
                    byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
                        try {
                            b[] j3 = j(byteArrayInputStream, m10, bVarArr);
                            byteArrayInputStream.close();
                            return j3;
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
        } else if (Arrays.equals(bArr, f44903j)) {
            int m11 = (int) m(2, fileInputStream);
            byte[] h11 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h11);
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

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int m10 = (int) m(2, byteArrayInputStream);
                iArr[i11] = (int) m(2, byteArrayInputStream);
                strArr[i11] = new String(f(m10, byteArrayInputStream), StandardCharsets.UTF_8);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                b bVar = bVarArr[i12];
                if (bVar.f44890b.equals(strArr[i12])) {
                    int i13 = iArr[i12];
                    bVar.f44892e = i13;
                    bVar.h = g(byteArrayInputStream, i13);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            for (int i11 = 0; i11 < i10; i11++) {
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
                    int i12 = 0;
                    while (true) {
                        if (i12 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[i12].f44890b.equals(str)) {
                            bVar = bVarArr[i12];
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                if (bVar != null) {
                    bVar.d = m10;
                    int[] g10 = g(byteArrayInputStream, m11);
                    if (Arrays.equals(bArr, h)) {
                        bVar.f44892e = m11;
                        bVar.h = g10;
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
        if (Arrays.equals(bArr, f44899e)) {
            int m10 = (int) m(1, fileInputStream);
            byte[] h10 = h(fileInputStream, (int) m(4, fileInputStream), (int) m(4, fileInputStream));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h10);
                try {
                    b[] n10 = n(byteArrayInputStream, str, m10);
                    byteArrayInputStream.close();
                    return n10;
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

    public static long m(int i10, InputStream inputStream) {
        byte[] f7 = f(i10, inputStream);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 += (f7[i11] & 255) << (i11 * 8);
        }
        return j3;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i10) {
        int i11;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int m10 = (int) m(2, byteArrayInputStream);
            bVarArr[i12] = new b(str, new String(f((int) m(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8), m(4, byteArrayInputStream), m10, (int) m(4, byteArrayInputStream), (int) m(4, byteArrayInputStream), new int[m10], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            b bVar = bVarArr[i13];
            int available = byteArrayInputStream.available();
            int i14 = bVar.f44893f;
            int i15 = bVar.f44894g;
            TreeMap treeMap = bVar.f44895i;
            int i16 = available - i14;
            int i17 = 0;
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
                            int i18 = i13;
                            for (int m13 = (int) m(1, byteArrayInputStream); m13 > 0; m13--) {
                                m(2, byteArrayInputStream);
                            }
                            m12--;
                            i13 = i18;
                        }
                    }
                    m11--;
                    i13 = i13;
                }
            }
            int i19 = i13;
            if (byteArrayInputStream.available() == i16) {
                bVar.h = g(byteArrayInputStream, bVar.f44892e);
                BitSet valueOf = BitSet.valueOf(f((((i15 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
                for (int i20 = 0; i20 < i15; i20++) {
                    if (valueOf.get(i20)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (valueOf.get(i20 + i15)) {
                        i11 |= 4;
                    }
                    if (i11 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i20));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i20), Integer.valueOf(i11 | num.intValue()));
                    }
                }
                i13 = i19 + 1;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, bVarArr.length);
                int i10 = 2;
                for (b bVar : bVarArr) {
                    t(byteArrayOutputStream2, bVar.f44891c, 4);
                    t(byteArrayOutputStream2, bVar.d, 4);
                    t(byteArrayOutputStream2, bVar.f44894g, 4);
                    String d10 = d(bVar.f44889a, bVar.f44890b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d10.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i10 = i10 + 14 + length2;
                    byteArrayOutputStream2.write(d10.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i10 == byteArray.length) {
                    j jVar = new j(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(jVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i11 = 0;
                    for (int i12 = 0; i12 < bVarArr.length; i12++) {
                        try {
                            b bVar2 = bVarArr[i12];
                            u(byteArrayOutputStream3, i12);
                            u(byteArrayOutputStream3, bVar2.f44892e);
                            i11 = i11 + 4 + (bVar2.f44892e * 2);
                            int[] iArr = bVar2.h;
                            int length3 = iArr.length;
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < length3) {
                                int i15 = iArr[i13];
                                u(byteArrayOutputStream3, i15 - i14);
                                i13++;
                                i14 = i15;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i11 == byteArray2.length) {
                        j jVar2 = new j(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(jVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < bVarArr.length) {
                            try {
                                b bVar3 = bVarArr[i16];
                                int i18 = 0;
                                for (Map.Entry entry : bVar3.f44895i.entrySet()) {
                                    i18 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream4, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream5, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                u(byteArrayOutputStream3, i16);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i19 = i17 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream3, length4, 4);
                                u(byteArrayOutputStream3, i18);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i17 = i19 + length4;
                                i16++;
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
                        if (i17 == byteArray5.length) {
                            j jVar3 = new j(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(jVar3);
                            long j10 = 4;
                            long size = j10 + j10 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i20 = 0;
                            while (i20 < arrayList2.size()) {
                                j jVar4 = (j) arrayList2.get(i20);
                                int i21 = jVar4.f44910a;
                                byte[] bArr3 = jVar4.f44911b;
                                if (i21 != 1) {
                                    if (i21 != 2) {
                                        if (i21 != 3) {
                                            if (i21 != 4) {
                                                if (i21 == 5) {
                                                    j3 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j3 = 3;
                                            }
                                        } else {
                                            j3 = 2;
                                        }
                                    } else {
                                        j3 = 1;
                                    }
                                } else {
                                    j3 = 0;
                                }
                                t(byteArrayOutputStream, j3, 4);
                                t(byteArrayOutputStream, size, 4);
                                if (jVar4.f44912c) {
                                    byte[] a2 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a2);
                                    t(byteArrayOutputStream, a2.length, 4);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    length = a2.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i20++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i17 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] bArr4 = f44899e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b10 = b(bVarArr, bArr4);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b10.length, 4);
            byte[] a10 = a(b10);
            t(byteArrayOutputStream, a10.length, 4);
            byteArrayOutputStream.write(a10);
            return true;
        }
        byte[] bArr5 = f44901g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, bVarArr.length, 1);
            for (b bVar4 : bVarArr) {
                String d11 = d(bVar4.f44889a, bVar4.f44890b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d11.getBytes(charset2).length);
                u(byteArrayOutputStream, bVar4.h.length);
                t(byteArrayOutputStream, bVar4.f44895i.size() * 4, 4);
                t(byteArrayOutputStream, bVar4.f44891c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset2));
                for (Integer num : bVar4.f44895i.keySet()) {
                    u(byteArrayOutputStream, num.intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i23 : bVar4.h) {
                    u(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        byte[] bArr6 = f44900f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b11 = b(bVarArr, bArr6);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b11.length, 4);
            byte[] a11 = a(b11);
            t(byteArrayOutputStream, a11.length, 4);
            byteArrayOutputStream.write(a11);
            return true;
        }
        byte[] bArr7 = h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar5 : bVarArr) {
                String str = bVar5.f44889a;
                TreeMap treeMap = bVar5.f44895i;
                String d12 = d(str, bVar5.f44890b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d12.getBytes(charset3).length);
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar5.h.length);
                t(byteArrayOutputStream, bVar5.f44891c, 4);
                byteArrayOutputStream.write(d12.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    u(byteArrayOutputStream, num2.intValue());
                }
                for (int i24 : bVar5.h) {
                    u(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f44892e);
        t(byteArrayOutputStream, bVar.f44893f, 4);
        t(byteArrayOutputStream, bVar.f44891c, 4);
        t(byteArrayOutputStream, bVar.f44894g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.f44894g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f44895i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i10 = intValue / 8;
                bArr[i10] = (byte) (bArr[i10] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i11 = intValue + bVar.f44894g;
                int i12 = i11 / 8;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int i10 = 0;
        for (Map.Entry entry : bVar.f44895i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i10);
                u(byteArrayOutputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, r4.c r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: r4.d.s(android.content.Context, java.util.concurrent.Executor, r4.c, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i10) {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j3 >> (i11 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i10) {
        t(byteArrayOutputStream, i10, 2);
    }
}
