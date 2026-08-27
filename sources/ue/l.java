package ue;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.n;
import org.telegram.ui.i6;

public final class l extends se.a {

    public static final Logger f48563r = Logger.getLogger(l.class.getName());

    public l(BufferedInputStream bufferedInputStream, long j10) throws c, IOException {
        String strB;
        String str;
        String str2;
        String strB2;
        short s10;
        short s11;
        byte b10;
        g gVar;
        u2.b bVar;
        ve.a aVar;
        n1.d dVar;
        ve.a aVar2;
        Level level = Level.FINEST;
        this.f47857a = "MP3";
        m mVar = new m(bufferedInputStream);
        mVar.d = 0;
        if (g.b(mVar)) {
            Logger logger = g.f48545s;
            g gVar2 = new g();
            if (g.b(mVar)) {
                com.google.firebase.messaging.d dVar2 = new com.google.firebase.messaging.d((FilterInputStream) mVar);
                h hVar = new h();
                hVar.f48547a = 0;
                hVar.f48548b = 0;
                hVar.f48549c = 0;
                long j11 = dVar2.f4577b;
                n1.d dVar3 = new n1.d(dVar2, 23);
                byte[] bArr = new byte[3];
                int i10 = 0;
                for (int i11 = 3; i10 < i11; i11 = 3) {
                    long j12 = j11;
                    int i12 = ((com.google.firebase.messaging.d) dVar3.f18088b).read(bArr, i10, 3 - i10);
                    if (i12 <= 0) {
                        throw new EOFException();
                    }
                    i10 += i12;
                    j11 = j12;
                }
                long j13 = j11;
                String str3 = new String(bArr, "ISO-8859-1");
                if (!"ID3".equals(str3)) {
                    throw new c("Invalid ID3 identifier: ".concat(str3));
                }
                byte bA0 = dVar3.a0();
                hVar.f48547a = bA0;
                if (bA0 != 2 && bA0 != 3 && bA0 != 4) {
                    throw new c(i0.a.k(bA0, "Unsupported ID3v2 version: "));
                }
                byte bA1 = dVar3.a0();
                byte bA2 = dVar3.a0();
                int iN0 = dVar3.n0();
                hVar.f48548b = iN0 + 10;
                if (bA0 == 2) {
                    hVar.d = (bA2 & 128) != 0;
                    hVar.f48550e = (bA2 & 64) != 0;
                    bA1 = bA1;
                } else {
                    hVar.d = (bA2 & 128) != 0;
                    if ((bA2 & 64) != 0) {
                        if (bA0 == 3) {
                            int iG0 = dVar3.g0();
                            dVar3.a0();
                            dVar3.a0();
                            dVar3.g0();
                            dVar3.o0(iG0 - 6);
                        } else {
                            dVar3.o0(dVar3.n0() - 4);
                        }
                    }
                    if (bA0 >= 4 && (bA2 & 16) != 0) {
                        hVar.f48549c = 10;
                        hVar.f48548b = iN0 + 20;
                    }
                }
                int i13 = (int) (dVar2.f4577b - j13);
                gVar2.f47857a = "ID3";
                String.format("2.%d.%d", Integer.valueOf(bA0), Integer.valueOf(bA1));
                int i14 = hVar.f48548b;
                if (hVar.f48550e) {
                    throw new c("Tag compression is not supported");
                }
                if (bA0 >= 4 || !hVar.d) {
                    bVar = new u2.b(mVar, i13, (i14 - i13) - hVar.f48549c, hVar);
                } else {
                    int i15 = i14 - i13;
                    byte[] bArr2 = new byte[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        int i17 = mVar.read(bArr2, i16, i15 - i16);
                        if (i17 <= 0) {
                            throw new EOFException();
                        }
                        i16 += i17;
                    }
                    boolean z10 = false;
                    int i18 = 0;
                    for (int i19 = 0; i19 < i15; i19++) {
                        byte b11 = bArr2[i19];
                        if (!z10 || b11 != 0) {
                            bArr2[i18] = b11;
                            i18++;
                        }
                        z10 = b11 == -1;
                    }
                    bVar = new u2.b(new ByteArrayInputStream(bArr2, 0, i18), i13, i18, hVar);
                }
                n1.d dVar4 = (n1.d) bVar.f48262b;
                ve.a aVar3 = (ve.a) bVar.f48263c;
                while (true) {
                    try {
                        if (aVar3.e() > 10) {
                            f fVar = new f(bVar);
                            String str4 = (String) fVar.h;
                            int i20 = 0;
                            while (true) {
                                if (i20 < str4.length()) {
                                    if (str4.charAt(0) == 0) {
                                        i20++;
                                    }
                                } else if (fVar.f48542e == 0) {
                                }
                                gVar = gVar2;
                                try {
                                    if (fVar.f48542e > aVar3.e()) {
                                        if (r23.isLoggable(level)) {
                                            r23.log(level, "ID3 frame claims to extend frames area");
                                        }
                                        aVar = aVar3;
                                        break;
                                    }
                                    String str5 = (String) fVar.h;
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= str5.length()) {
                                            aVar = aVar3;
                                            if (fVar.f48542e > 0 && !fVar.f48543f) {
                                                e eVarF = bVar.f(fVar);
                                                try {
                                                    try {
                                                        gVar.d(eVarF);
                                                        dVar = eVarF.d;
                                                        aVar2 = eVarF.f48536a;
                                                    } catch (Throwable th) {
                                                        eVarF.d.o0(eVarF.f48536a.e());
                                                        throw th;
                                                    }
                                                } catch (c e9) {
                                                    if (r23.isLoggable(level)) {
                                                        logger.log(level, "ID3 exception occured in frame " + ((String) fVar.h) + ": " + e9.getMessage());
                                                    }
                                                    dVar = eVarF.d;
                                                    aVar2 = eVarF.f48536a;
                                                }
                                                dVar.o0(aVar2.e());
                                                break;
                                            }
                                        } else {
                                            aVar = aVar3;
                                            if (str5.charAt(i21) >= 'A') {
                                                try {
                                                    if (str5.charAt(i21) <= 'Z') {
                                                        continue;
                                                    } else if (str5.charAt(i21) >= '0' && str5.charAt(i21) <= '9') {
                                                    }
                                                    i21++;
                                                    aVar3 = aVar;
                                                } catch (c e10) {
                                                    e = e10;
                                                }
                                            } else if (str5.charAt(i21) >= '0') {
                                                i21++;
                                                aVar3 = aVar;
                                            }
                                        }
                                        dVar4.o0(fVar.f48542e);
                                        break;
                                    }
                                    gVar2 = gVar;
                                    aVar3 = aVar;
                                } catch (c e11) {
                                    e = e11;
                                    aVar = aVar3;
                                }
                                if (r23.isLoggable(level)) {
                                    r23.log(level, "ID3 exception occured: " + e.getMessage());
                                }
                            }
                        }
                        aVar = aVar3;
                        gVar = gVar2;
                        break;
                    } catch (c e12) {
                        e = e12;
                        aVar = aVar3;
                        gVar = gVar2;
                    }
                }
                dVar4.o0(aVar.e());
                int i22 = hVar.f48549c;
                if (i22 > 0) {
                    mVar.skip(i22);
                }
            } else {
                gVar = gVar2;
            }
            this.f47861f = gVar.f47861f;
            this.f47860e = gVar.f47860e;
            this.d = gVar.d;
            this.f47863i = gVar.f47863i;
            this.f47869o = gVar.f47869o;
            this.f47870p = gVar.f47870p;
            this.f47867m = gVar.f47867m;
            this.f47866l = gVar.f47866l;
            this.f47865k = gVar.f47865k;
            this.f47858b = gVar.f47858b;
            this.h = gVar.h;
            this.f47868n = gVar.f47868n;
            this.f47859c = gVar.f47859c;
            this.f47864j = gVar.f47864j;
            this.f47862g = gVar.f47862g;
        }
        long j14 = this.f47858b;
        if (j14 <= 0 || j14 >= 3600000) {
            try {
                n nVar = new n();
                nVar.f17620a = j10 - 128;
                this.f47858b = b(mVar, j10, nVar);
            } catch (i e13) {
                Logger logger2 = f48563r;
                if (logger2.isLoggable(level)) {
                    logger2.log(level, "Could not determine MP3 duration", (Throwable) e13);
                }
            }
        }
        if (this.f47859c == null || this.f47861f == null || this.d == null) {
            long j15 = mVar.f4577b;
            long j16 = j10 - 128;
            if (j15 <= j16) {
                long j17 = j16 - j15;
                long j18 = 0;
                while (j18 < j17) {
                    long jSkip = mVar.skip(j17 - j18);
                    if (jSkip <= 0) {
                        throw new EOFException();
                    }
                    j18 += jSkip;
                }
                if (a.c(bufferedInputStream)) {
                    String strB3 = null;
                    if (a.c(bufferedInputStream)) {
                        byte[] bArr3 = new byte[128];
                        int i23 = 0;
                        while (i23 < 128) {
                            int i24 = bufferedInputStream.read(bArr3, i23, 128 - i23);
                            if (i24 <= 0) {
                                throw new EOFException();
                            }
                            i23 += i24;
                        }
                        String strB4 = a.b(3, 30, bArr3);
                        strB2 = a.b(33, 30, bArr3);
                        String strB5 = a.b(63, 30, bArr3);
                        try {
                            s10 = Short.parseShort(a.b(93, 4, bArr3));
                        } catch (NumberFormatException unused) {
                            s10 = 0;
                        }
                        strB = a.b(97, 30, bArr3);
                        int iA = s3.c.a(bArr3[127]);
                        strB3 = iA != 0 ? s3.c.b(iA) : null;
                        if (bArr3[125] != 0 || (b10 = bArr3[126]) == 0) {
                            str2 = strB4;
                            str = strB3;
                            strB3 = strB5;
                        } else {
                            s11 = (short) (b10 & 255);
                            str2 = strB4;
                            str = strB3;
                            strB3 = strB5;
                        }
                        if (this.f47861f == null) {
                            this.f47861f = strB3;
                        }
                        if (this.d == null) {
                            this.d = strB2;
                        }
                        if (this.f47863i == null) {
                            this.f47863i = strB;
                        }
                        if (this.h == null) {
                            this.h = str;
                        }
                        if (this.f47859c == null) {
                            this.f47859c = str2;
                        }
                        if (this.f47864j == 0) {
                            this.f47864j = s11;
                        }
                        if (this.f47862g == 0) {
                            this.f47862g = s10;
                        }
                    }
                    strB = null;
                    str = null;
                    str2 = null;
                    strB2 = null;
                    s10 = 0;
                    s11 = 0;
                    if (this.f47861f == null) {
                        this.f47861f = strB3;
                    }
                    if (this.d == null) {
                        this.d = strB2;
                    }
                    if (this.f47863i == null) {
                        this.f47863i = strB;
                    }
                    if (this.h == null) {
                        this.h = str;
                    }
                    if (this.f47859c == null) {
                        this.f47859c = str2;
                    }
                    if (this.f47864j == 0) {
                        this.f47864j = s11;
                    }
                    if (this.f47862g == 0) {
                        this.f47862g = s10;
                    }
                }
            }
        }
    }

    public static long b(m mVar, long j10, n nVar) throws IOException, i {
        char c10;
        long j11;
        char c11;
        char c12;
        i6 i6Var;
        byte[] bArr;
        k kVar;
        int i10;
        int i11;
        long length;
        long length2;
        int iA;
        long j12;
        int iC;
        int i12;
        boolean z10;
        int i13;
        int i14;
        long j13;
        int iA2;
        k kVar2;
        byte b10;
        n nVar2 = nVar;
        int i15 = -1;
        int i16 = nVar2.a(mVar) ? -1 : mVar.read();
        int i17 = 0;
        while (true) {
            int[][] iArr = k.f48556m;
            int i18 = 4;
            if (i16 != -1) {
                if (i17 == 255 && (i16 & 224) == 224) {
                    mVar.mark(2);
                    int i19 = nVar2.a(mVar) ? -1 : mVar.read();
                    if (i19 != -1) {
                        int i20 = nVar2.a(mVar) ? -1 : mVar.read();
                        c10 = 2;
                        if (i20 == -1) {
                            j11 = 0;
                            c11 = 3;
                            c12 = 1;
                            i6Var = null;
                        } else {
                            j11 = 0;
                            k kVar3 = new k(i16, i19, i20);
                            mVar.reset();
                            mVar.mark(kVar3.b() + 2);
                            int iB = kVar3.b();
                            byte[] bArr2 = new byte[iB];
                            bArr2[0] = -1;
                            bArr2[1] = (byte) i16;
                            int i21 = iB - 2;
                            int i22 = 0;
                            while (i22 < i21) {
                                c11 = 3;
                                try {
                                    int i23 = mVar.read(bArr2, 2 + i22, i21 - i22);
                                    if (i23 <= 0) {
                                        throw new EOFException();
                                    }
                                    i22 += i23;
                                } catch (EOFException unused) {
                                }
                            }
                            c11 = 3;
                            i6Var = new i6(25, kVar3, bArr2);
                            if (kVar3.f48562g == 0 && kVar3.f48558b == 1) {
                                j jVar = new j();
                                jVar.f48551a = (short) -1;
                                jVar.a(bArr2[2]);
                                jVar.a(bArr2[3]);
                                c12 = 1;
                                int i24 = iArr[kVar3.f48560e][kVar3.f48557a];
                                for (int i25 = 0; i25 < i24; i25++) {
                                    jVar.a(bArr2[i25 + 6]);
                                }
                                if (((bArr2[5] & 255) | ((bArr2[4] & 255) << 8)) == jVar.f48551a) {
                                }
                                mVar.reset();
                            } else {
                                c12 = 1;
                            }
                            int i26 = nVar2.a(mVar) ? -1 : mVar.read();
                            int i27 = nVar2.a(mVar) ? -1 : mVar.read();
                            if (i26 != -1 && i27 != -1) {
                                if (i26 == 255 && (i27 & 254) == (i16 & 254)) {
                                    int i28 = nVar2.a(mVar) ? -1 : mVar.read();
                                    int i29 = nVar2.a(mVar) ? -1 : mVar.read();
                                    if (i28 != -1 && i29 != -1) {
                                        if (new k(i27, i28, i29).d(kVar3)) {
                                            mVar.reset();
                                            long j14 = i21;
                                            long j15 = 0;
                                            while (j15 < j14) {
                                                long jSkip = mVar.skip(j14 - j15);
                                                if (jSkip <= 0) {
                                                    throw new EOFException();
                                                }
                                                j15 += jSkip;
                                            }
                                        }
                                    }
                                }
                                mVar.reset();
                            }
                        }
                    }
                    if (i6Var != null) {
                        throw new i("No audio frame");
                    }
                    bArr = (byte[]) i6Var.f38984b;
                    kVar = (k) i6Var.f38985c;
                    i10 = iArr[kVar.f48560e][kVar.f48557a];
                    int i30 = i10 + 4;
                    if (bArr.length < i10 + 16 && i30 >= 0 && bArr.length >= i10 + 12 && (((b10 = bArr[i30]) == 88 && bArr[i10 + 5] == 105 && bArr[i10 + 6] == 110 && bArr[i10 + 7] == 103) || (b10 == 73 && bArr[i10 + 5] == 110 && bArr[i10 + 6] == 102 && bArr[i10 + 7] == 111))) {
                        if ((bArr[i10 + 11] & 1) != 0) {
                            i11 = (bArr[i10 + 15] & 255) | ((bArr[i10 + 12] & 255) << 24) | ((bArr[i10 + 13] & 255) << 16) | ((bArr[i10 + 14] & 255) << 8);
                        } else {
                            i11 = -1;
                        }
                    } else if (bArr.length < 62 && bArr[36] == 86 && bArr[37] == 66 && bArr[38] == 82 && bArr[39] == 73) {
                        i11 = ((bArr[50] & 255) << 24) | ((bArr[51] & 255) << 16) | ((bArr[52] & 255) << 8) | (bArr[53] & 255);
                    } else {
                        i11 = -1;
                    }
                    if (i11 > 0) {
                        return kVar.c(i11 * bArr.length);
                    }
                    length = mVar.f4577b - ((long) bArr.length);
                    length2 = bArr.length;
                    iA = kVar.a();
                    j12 = iA;
                    iC = 10000 / ((int) kVar.c(kVar.b()));
                    i12 = 1;
                    z10 = false;
                    while (true) {
                        k kVar4 = (k) i6Var.f38985c;
                        if (i12 != iC && !z10 && j10 > j11) {
                            return kVar4.c(j10 - length);
                        }
                        mVar.mark(i18);
                        if (nVar2.a(mVar)) {
                            i13 = -1;
                        } else {
                            i13 = mVar.read();
                        }
                        if (nVar2.a(mVar)) {
                            i14 = -1;
                        } else {
                            i14 = mVar.read();
                        }
                        if (i13 != i15 || i14 == i15) {
                            j13 = length;
                        } else {
                            if (i13 == 255 && (i14 & 224) == 224) {
                                int i31 = nVar2.a(mVar) ? -1 : mVar.read();
                                int i32 = nVar2.a(mVar) ? -1 : mVar.read();
                                j13 = length;
                                if (i31 != -1 && i32 != -1) {
                                    try {
                                        kVar2 = new k(i14, i31, i32);
                                    } catch (i e9) {
                                        int i33 = mVar.d + 1;
                                        mVar.d = i33;
                                        if (i33 > 5) {
                                            throw e9;
                                        }
                                        kVar2 = null;
                                    }
                                    if (kVar2 != null && kVar2.d(kVar4)) {
                                        int iB2 = kVar2.b();
                                        byte[] bArr3 = new byte[iB2];
                                        bArr3[0] = (byte) i13;
                                        bArr3[c12] = (byte) i14;
                                        bArr3[c10] = (byte) i31;
                                        bArr3[c11] = (byte) i32;
                                        int i34 = iB2 - 4;
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            try {
                                                int i36 = mVar.read(bArr3, 4 + i35, i34 - i35);
                                                if (i36 <= 0) {
                                                    throw new EOFException();
                                                }
                                                i35 += i36;
                                            } catch (EOFException unused2) {
                                            }
                                        }
                                        i6Var = new i6(25, kVar2, bArr3);
                                        if (i6Var == null) {
                                            return (((length2 * 1000) * ((long) i12)) * 8) / j12;
                                        }
                                        iA2 = ((k) i6Var.f38985c).a();
                                        if (iA2 != iA) {
                                            z10 = true;
                                        }
                                        j12 += (long) iA2;
                                        length2 += (long) ((byte[]) i6Var.f38984b).length;
                                        i12++;
                                        nVar2 = nVar;
                                        iC = iC;
                                        length = j13;
                                        i15 = -1;
                                        i18 = 4;
                                    }
                                }
                                i6Var = null;
                                if (i6Var == null) {
                                    return (((length2 * 1000) * ((long) i12)) * 8) / j12;
                                }
                                iA2 = ((k) i6Var.f38985c).a();
                                if (iA2 != iA) {
                                    z10 = true;
                                }
                                j12 += (long) iA2;
                                length2 += (long) ((byte[]) i6Var.f38984b).length;
                                i12++;
                                nVar2 = nVar;
                                iC = iC;
                                length = j13;
                                i15 = -1;
                                i18 = 4;
                            } else {
                                j13 = length;
                            }
                            mVar.reset();
                            i6Var = null;
                            if (i6Var == null) {
                                return (((length2 * 1000) * ((long) i12)) * 8) / j12;
                            }
                            iA2 = ((k) i6Var.f38985c).a();
                            if (iA2 != iA) {
                                z10 = true;
                            }
                            j12 += (long) iA2;
                            length2 += (long) ((byte[]) i6Var.f38984b).length;
                            i12++;
                            nVar2 = nVar;
                            iC = iC;
                            length = j13;
                            i15 = -1;
                            i18 = 4;
                        }
                        i6Var = null;
                        if (i6Var == null) {
                            return (((length2 * 1000) * ((long) i12)) * 8) / j12;
                        }
                        iA2 = ((k) i6Var.f38985c).a();
                        if (iA2 != iA) {
                            z10 = true;
                        }
                        j12 += (long) iA2;
                        length2 += (long) ((byte[]) i6Var.f38984b).length;
                        i12++;
                        nVar2 = nVar;
                        iC = iC;
                        length = j13;
                        i15 = -1;
                        i18 = 4;
                    }
                }
                i17 = i16;
                i16 = nVar2.a(mVar) ? -1 : mVar.read();
            }
            c10 = 2;
            j11 = 0;
            c11 = 3;
            c12 = 1;
            i6Var = null;
            if (i6Var != null) {
                throw new i("No audio frame");
            }
            bArr = (byte[]) i6Var.f38984b;
            kVar = (k) i6Var.f38985c;
            i10 = iArr[kVar.f48560e][kVar.f48557a];
            int i37 = i10 + 4;
            if (bArr.length < i10 + 16) {
                if (bArr.length < 62) {
                    i11 = -1;
                } else {
                    i11 = ((bArr[50] & 255) << 24) | ((bArr[51] & 255) << 16) | ((bArr[52] & 255) << 8) | (bArr[53] & 255);
                }
            } else if ((bArr[i10 + 11] & 1) != 0) {
                i11 = (bArr[i10 + 15] & 255) | ((bArr[i10 + 12] & 255) << 24) | ((bArr[i10 + 13] & 255) << 16) | ((bArr[i10 + 14] & 255) << 8);
            } else {
                i11 = -1;
            }
            if (i11 > 0) {
                return kVar.c(i11 * bArr.length);
            }
            length = mVar.f4577b - ((long) bArr.length);
            length2 = bArr.length;
            iA = kVar.a();
            j12 = iA;
            iC = 10000 / ((int) kVar.c(kVar.b()));
            i12 = 1;
            z10 = false;
            while (true) {
                k kVar5 = (k) i6Var.f38985c;
                if (i12 != iC) {
                }
                mVar.mark(i18);
                if (nVar2.a(mVar)) {
                    i13 = -1;
                } else {
                    i13 = mVar.read();
                }
                if (nVar2.a(mVar)) {
                    i14 = -1;
                } else {
                    i14 = mVar.read();
                }
                if (i13 != i15) {
                    j13 = length;
                    i6Var = null;
                } else {
                    j13 = length;
                    i6Var = null;
                }
                if (i6Var == null) {
                    return (((length2 * 1000) * ((long) i12)) * 8) / j12;
                }
                iA2 = ((k) i6Var.f38985c).a();
                if (iA2 != iA) {
                    z10 = true;
                }
                j12 += (long) iA2;
                length2 += (long) ((byte[]) i6Var.f38984b).length;
                i12++;
                nVar2 = nVar;
                iC = iC;
                length = j13;
                i15 = -1;
                i18 = 4;
            }
        }
    }
}
