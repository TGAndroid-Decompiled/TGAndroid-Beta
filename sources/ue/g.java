package ue;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class g extends se.a {

    public static final Logger f48545s = Logger.getLogger(g.class.getName());

    public byte f48546r;

    public static boolean b(m mVar) {
        mVar.mark(3);
        try {
            return mVar.read() == 73 && mVar.read() == 68 && mVar.read() == 51;
        } finally {
            mVar.reset();
        }
    }

    public static c9.b c(e eVar) throws c, IOException {
        b bVarB = eVar.b();
        eVar.c(3, b.ISO_8859_1);
        return new c9.b(4, eVar.d(200, bVarB), eVar.c((int) eVar.f48536a.e(), bVarB));
    }

    public static String e(e eVar) throws c {
        return eVar.c((int) eVar.f48536a.e(), eVar.b());
    }

    public final void d(e eVar) throws c, IOException {
        String str;
        int i10;
        f fVar = eVar.f48538c;
        Level level = Level.FINEST;
        Logger logger = f48545s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + ((String) fVar.h));
        }
        String str2 = (String) fVar.h;
        str2.getClass();
        int iA = 0;
        switch (str2) {
            case "COM":
            case "COMM":
                c9.b bVarC = c(eVar);
                if (this.f47863i == null || (str = bVarC.f2566b) == null || "".equals(str)) {
                    this.f47863i = bVarC.f2567c;
                    return;
                }
                return;
            case "PIC":
            case "APIC":
                if (this.f47869o == null || this.f48546r != 3) {
                    b bVarB = eVar.b();
                    n1.d dVar = eVar.d;
                    if (eVar.f48537b.f48547a == 2) {
                        eVar.c(3, b.ISO_8859_1).toUpperCase().getClass();
                    } else {
                        eVar.d(20, b.ISO_8859_1);
                    }
                    byte bA0 = dVar.a0();
                    eVar.d(200, bVarB);
                    int iE = (int) eVar.f48536a.e();
                    byte[] bArr = new byte[iE];
                    int i11 = 0;
                    while (i11 < iE) {
                        int i12 = ((com.google.firebase.messaging.d) dVar.f18088b).read(bArr, i11, iE - i11);
                        if (i12 <= 0) {
                            throw new EOFException();
                        }
                        i11 += i12;
                    }
                    if (this.f47869o == null || bA0 == 3 || bA0 == 0) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, iE, options);
                            int i13 = options.outWidth;
                            if (i13 > 800 || options.outHeight > 800) {
                                for (int iMax = Math.max(i13, options.outHeight); iMax > 800; iMax /= 2) {
                                    options.inSampleSize *= 2;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iE, options);
                            this.f47869o = bitmapDecodeByteArray;
                            if (bitmapDecodeByteArray != null) {
                                float fMax = Math.max(bitmapDecodeByteArray.getWidth(), this.f47869o.getHeight()) / 120.0f;
                                if (fMax > 0.0f) {
                                    Bitmap bitmap = this.f47869o;
                                    this.f47870p = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / fMax), (int) (this.f47869o.getHeight() / fMax), true);
                                } else {
                                    this.f47870p = this.f47869o;
                                }
                                if (this.f47870p == null) {
                                    this.f47870p = this.f47869o;
                                }
                            }
                            break;
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        this.f48546r = bA0;
                        return;
                    }
                    return;
                }
                return;
            case "TAL":
            case "TALB":
                this.f47861f = e(eVar);
                return;
            case "TCM":
            case "TCOM":
                this.f47867m = e(eVar);
                return;
            case "TCO":
            case "TCON":
                String strE = e(eVar);
                if (strE.length() > 0) {
                    this.h = strE;
                    try {
                        if (strE.charAt(0) == '(') {
                            int iIndexOf = strE.indexOf(41);
                            if (iIndexOf > 1 && (iA = s3.c.a(Integer.parseInt(strE.substring(1, iIndexOf)))) == 0 && strE.length() > (i10 = iIndexOf + 1)) {
                                this.h = strE.substring(i10);
                            }
                        } else {
                            iA = s3.c.a(Integer.parseInt(strE));
                        }
                        if (iA != 0) {
                            this.h = s3.c.b(iA);
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                return;
            case "TCP":
            case "TCMP":
                "1".equals(e(eVar));
                return;
            case "TCR":
            case "TCOP":
                this.f47866l = e(eVar);
                return;
            case "TLE":
            case "TLEN":
                String strE2 = e(eVar);
                try {
                    this.f47858b = Long.valueOf(strE2).longValue();
                    return;
                } catch (NumberFormatException unused2) {
                    if (logger.isLoggable(level)) {
                        logger.log(level, "Could not parse track duration: " + strE2);
                        return;
                    }
                    return;
                }
            case "TP1":
            case "TPE1":
                this.d = e(eVar);
                return;
            case "TP2":
            case "TPE2":
                this.f47860e = e(eVar);
                return;
            case "TPA":
            case "TPOS":
                String strE3 = e(eVar);
                if (strE3.length() > 0) {
                    int iIndexOf2 = strE3.indexOf(47);
                    if (iIndexOf2 < 0) {
                        try {
                            this.f47865k = Short.valueOf(strE3).shortValue();
                            return;
                        } catch (NumberFormatException unused3) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse disc number: ".concat(strE3));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.f47865k = Short.valueOf(strE3.substring(0, iIndexOf2)).shortValue();
                    } catch (NumberFormatException unused4) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse disc number: ".concat(strE3));
                        }
                    }
                    try {
                        Short.valueOf(strE3.substring(iIndexOf2 + 1)).getClass();
                        return;
                    } catch (NumberFormatException unused5) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of discs: ".concat(strE3));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TRK":
            case "TRCK":
                String strE4 = e(eVar);
                if (strE4.length() > 0) {
                    int iIndexOf3 = strE4.indexOf(47);
                    if (iIndexOf3 < 0) {
                        try {
                            this.f47864j = Short.valueOf(strE4).shortValue();
                            return;
                        } catch (NumberFormatException unused6) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse track number: ".concat(strE4));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.f47864j = Short.valueOf(strE4.substring(0, iIndexOf3)).shortValue();
                    } catch (NumberFormatException unused7) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse track number: ".concat(strE4));
                        }
                    }
                    try {
                        Short.valueOf(strE4.substring(iIndexOf3 + 1)).getClass();
                        return;
                    } catch (NumberFormatException unused8) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of tracks: ".concat(strE4));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "TT1":
            case "TIT1":
                e(eVar);
                return;
            case "TT2":
            case "TIT2":
                this.f47859c = e(eVar);
                return;
            case "TYE":
            case "TYER":
                String strE5 = e(eVar);
                if (strE5.length() > 0) {
                    try {
                        this.f47862g = Short.valueOf(strE5).shortValue();
                        return;
                    } catch (NumberFormatException unused9) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year: ".concat(strE5));
                            return;
                        }
                        return;
                    }
                }
                return;
            case "ULT":
            case "USLT":
                if (this.f47868n == null) {
                    this.f47868n = c(eVar).f2567c;
                    return;
                }
                return;
            case "TDRC":
                String strE6 = e(eVar);
                if (strE6.length() >= 4) {
                    try {
                        this.f47862g = Short.valueOf(strE6.substring(0, 4)).shortValue();
                        return;
                    } catch (NumberFormatException unused10) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year from: ".concat(strE6));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
