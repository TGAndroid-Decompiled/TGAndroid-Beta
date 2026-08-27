package te;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.firebase.messaging.d;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.p;
import s3.c;

public final class a extends se.a {

    public static final Logger f48161s = Logger.getLogger(a.class.getName());

    public final Level f48162r;

    public a(BufferedInputStream bufferedInputStream) throws IOException {
        b bVarC;
        DataInputStream dataInputStream;
        Level level = Level.FINEST;
        this.f48162r = level;
        ?? r10 = 1;
        b bVar = new b(new d((FilterInputStream) bufferedInputStream), null, "", 1 == true ? 1 : 0);
        Logger logger = f48161s;
        if (logger.isLoggable(level)) {
            logger.log(level, bVar.toString());
        }
        b bVarD = bVar.d("ftyp");
        DataInputStream dataInputStream2 = (DataInputStream) bVarD.f12926e;
        if (logger.isLoggable(level)) {
            logger.log(level, bVarD.toString());
        }
        int i10 = 4;
        byte[] bArr = new byte[4];
        dataInputStream2.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        int iIndexOf = str.indexOf(0);
        String strTrim = (iIndexOf >= 0 ? str.substring(0, iIndexOf) : str).trim();
        this.f47857a = strTrim;
        if (strTrim.matches("M4V|MP4|mp42|isom")) {
            StringBuilder sb2 = new StringBuilder();
            StringBuffer stringBuffer = new StringBuffer();
            b.h(stringBuffer, bVarD);
            sb2.append(stringBuffer.toString());
            sb2.append(": brand=");
            sb2.append(this.f47857a);
            sb2.append(" (experimental)");
            logger.warning(sb2.toString());
        } else if (!this.f47857a.matches("M4A|M4P")) {
            StringBuilder sb3 = new StringBuilder();
            StringBuffer stringBuffer2 = new StringBuffer();
            b.h(stringBuffer2, bVarD);
            sb3.append(stringBuffer2.toString());
            sb3.append(": brand=");
            sb3.append(this.f47857a);
            sb3.append(" (expected M4A or M4P)");
            logger.warning(sb3.toString());
        }
        String.valueOf(dataInputStream2.readInt());
        do {
            bVarC = bVar.c();
        } while (!((String) bVarC.d).matches("moov"));
        Level level2 = this.f48162r;
        if (logger.isLoggable(level2)) {
            logger.log(level2, bVarC.toString());
        }
        while (bVarC.j()) {
            b bVarC2 = bVarC.c();
            DataInputStream dataInputStream3 = (DataInputStream) bVarC2.f12926e;
            int i11 = 2;
            switch ((String) bVarC2.d) {
                case "mvhd":
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, bVarC2.toString());
                    }
                    byte b10 = dataInputStream3.readByte();
                    bVarC2.n(3);
                    bVarC2.n(b10 == r10 ? 16 : 8);
                    int i12 = dataInputStream3.readInt();
                    long j10 = b10 == r10 ? dataInputStream3.readLong() : dataInputStream3.readInt();
                    if (this.f47858b != 0) {
                        if (logger.isLoggable(level2)) {
                            dataInputStream = dataInputStream3;
                            long j11 = (j10 * 1000) / ((long) i12);
                            if (Math.abs(this.f47858b - j11) > 2) {
                                logger.log(level2, "mvhd: duration " + this.f47858b + " -> " + j11);
                            }
                        }
                        new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                        new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                        break;
                    } else {
                        this.f47858b = (j10 * 1000) / ((long) i12);
                    }
                    dataInputStream = dataInputStream3;
                    new BigDecimal(String.valueOf((int) dataInputStream.readShort()) + "" + String.valueOf(dataInputStream.readUnsignedShort()));
                    new BigDecimal(String.valueOf((int) dataInputStream.readByte()) + "" + String.valueOf(dataInputStream.readUnsignedByte()));
                    break;
                case "trak":
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, bVarC2.toString());
                    }
                    b bVarK = bVarC2.k("mdia");
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, bVarK.toString());
                    }
                    b bVarD2 = bVarK.d("mdhd");
                    DataInputStream dataInputStream4 = (DataInputStream) bVarD2.f12926e;
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, bVarD2.toString());
                    }
                    byte b11 = dataInputStream4.readByte();
                    bVarD2.n(3);
                    bVarD2.n(b11 == r10 ? 16 : 8);
                    int i13 = dataInputStream4.readInt();
                    long j12 = b11 == r10 ? dataInputStream4.readLong() : dataInputStream4.readInt();
                    if (this.f47858b != 0) {
                        if (logger.isLoggable(level2)) {
                            long j13 = (j12 * 1000) / ((long) i13);
                            if (Math.abs(this.f47858b - j13) > 2) {
                                logger.log(level2, "mdhd: duration " + this.f47858b + " -> " + j13);
                            }
                        }
                        break;
                    } else {
                        this.f47858b = (j12 * 1000) / ((long) i13);
                        break;
                    }
                    break;
                case "udta":
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, bVarC2.toString());
                    }
                    while (bVarC2.j()) {
                        b bVarC3 = bVarC2.c();
                        if ("meta".equals((String) bVarC3.d)) {
                            if (logger.isLoggable(level2)) {
                                logger.log(level2, bVarC3.toString());
                            }
                            bVarC3.n(i10);
                            while (bVarC3.j()) {
                                b bVarC4 = bVarC3.c();
                                if ("ilst".equals((String) bVarC4.d)) {
                                    if (logger.isLoggable(level2)) {
                                        logger.log(level2, bVarC4.toString());
                                    }
                                    while (bVarC4.j()) {
                                        b bVarC5 = bVarC4.c();
                                        if (logger.isLoggable(level2)) {
                                            logger.log(level2, bVarC5.toString());
                                        }
                                        if (bVarC5.i() != 0) {
                                            b bVarK2 = bVarC5.k("data");
                                            DataInputStream dataInputStream5 = (DataInputStream) bVarK2.f12926e;
                                            if (logger.isLoggable(level2)) {
                                                logger.log(level2, bVarK2.toString());
                                            }
                                            bVarK2.n(i10);
                                            bVarK2.n(i10);
                                            switch ((String) ((p) bVarK2.f12925c).d) {
                                                case "aART":
                                                    this.f47860e = bVarK2.m();
                                                    break;
                                                case "covr":
                                                    try {
                                                        int i14 = (int) bVarK2.i();
                                                        byte[] bArr2 = new byte[i14];
                                                        dataInputStream5.readFully(bArr2);
                                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                                        options.inJustDecodeBounds = r10;
                                                        options.inSampleSize = r10;
                                                        BitmapFactory.decodeByteArray(bArr2, 0, i14, options);
                                                        int i15 = options.outWidth;
                                                        if (i15 > 800 || options.outHeight > 800) {
                                                            for (int iMax = Math.max(i15, options.outHeight); iMax > 800; iMax /= 2) {
                                                                options.inSampleSize *= 2;
                                                            }
                                                        }
                                                        options.inJustDecodeBounds = false;
                                                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i14, options);
                                                        this.f47869o = bitmapDecodeByteArray;
                                                        if (bitmapDecodeByteArray != null) {
                                                            float fMax = Math.max(bitmapDecodeByteArray.getWidth(), this.f47869o.getHeight()) / 120.0f;
                                                            if (fMax > 0.0f) {
                                                                Bitmap bitmap = this.f47869o;
                                                                this.f47870p = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / fMax), (int) (this.f47869o.getHeight() / fMax), r10);
                                                            } else {
                                                                this.f47870p = this.f47869o;
                                                            }
                                                            if (this.f47870p == null) {
                                                                this.f47870p = this.f47869o;
                                                            }
                                                        }
                                                        break;
                                                    } catch (Exception e9) {
                                                        e9.printStackTrace();
                                                        break;
                                                    }
                                                    break;
                                                case "cpil":
                                                    dataInputStream5.readBoolean();
                                                    break;
                                                case "cprt":
                                                case "©cpy":
                                                    String str2 = this.f47866l;
                                                    if (str2 == null || str2.trim().length() == 0) {
                                                        this.f47866l = bVarK2.m();
                                                    }
                                                    break;
                                                case "disk":
                                                    bVarK2.n(i11);
                                                    this.f47865k = dataInputStream5.readShort();
                                                    bVarK2.l();
                                                    break;
                                                case "gnre":
                                                    String str3 = this.h;
                                                    if (str3 == null || str3.trim().length() == 0) {
                                                        if (bVarK2.i() == 2) {
                                                            int iA = c.a(dataInputStream5.readShort() - r10);
                                                            if (iA != 0) {
                                                                this.h = c.b(iA);
                                                            }
                                                        } else {
                                                            this.h = bVarK2.m();
                                                        }
                                                    }
                                                    break;
                                                case "rtng":
                                                    dataInputStream5.readByte();
                                                    break;
                                                case "tmpo":
                                                    bVarK2.l();
                                                    break;
                                                case "trkn":
                                                    bVarK2.n(i11);
                                                    this.f47864j = dataInputStream5.readShort();
                                                    bVarK2.l();
                                                    break;
                                                case "©ART":
                                                    this.d = bVarK2.m();
                                                    break;
                                                case "©alb":
                                                    this.f47861f = bVarK2.m();
                                                    break;
                                                case "©cmt":
                                                    this.f47863i = bVarK2.m();
                                                    break;
                                                case "©com":
                                                case "©wrt":
                                                    String str4 = this.f47867m;
                                                    if (str4 == null || str4.trim().length() == 0) {
                                                        this.f47867m = bVarK2.m();
                                                    }
                                                    break;
                                                case "©day":
                                                    String strTrim2 = bVarK2.m().trim();
                                                    if (strTrim2.length() >= i10) {
                                                        try {
                                                            this.f47862g = Short.valueOf(strTrim2.substring(0, i10)).shortValue();
                                                            break;
                                                        } catch (NumberFormatException unused) {
                                                        }
                                                    }
                                                    break;
                                                case "©gen":
                                                    String str5 = this.h;
                                                    if (str5 == null || str5.trim().length() == 0) {
                                                        this.h = bVarK2.m();
                                                    }
                                                    break;
                                                case "©grp":
                                                    bVarK2.m();
                                                    break;
                                                case "©lyr":
                                                    this.f47868n = bVarK2.m();
                                                    break;
                                                case "©nam":
                                                    this.f47859c = bVarK2.m();
                                                    break;
                                                default:
                                                    break;
                                            }
                                            i10 = 4;
                                            i11 = 2;
                                        } else if (logger.isLoggable(level2)) {
                                            StringBuilder sb4 = new StringBuilder();
                                            StringBuffer stringBuffer3 = new StringBuffer();
                                            b.h(stringBuffer3, bVarC5);
                                            sb4.append(stringBuffer3.toString());
                                            sb4.append(": contains no value");
                                            logger.log(level2, sb4.toString());
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                    break;
            }
            r10 = 1;
            i10 = 4;
        }
    }
}
