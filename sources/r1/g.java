package r1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import h7.t6;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class g {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final d H;
    public static final d[][] I;
    public static final d[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;

    public String f46685a;

    public FileDescriptor f46686b;

    public AssetManager.AssetInputStream f46687c;
    public int d;

    public final HashMap[] f46688e;

    public final HashSet f46689f;

    public ByteOrder f46690g;
    public boolean h;

    public int f46691i;

    public int f46692j;

    public int f46693k;

    public int f46694l;

    public static final boolean f46672m = Log.isLoggable("ExifInterface", 3);

    public static final List f46673n = Arrays.asList(1, 6, 3, 8);

    public static final List f46674o = Arrays.asList(2, 7, 4, 5);

    public static final int[] f46675p = {8, 8, 8};

    public static final int[] f46676q = {8};

    public static final byte[] f46677r = {-1, -40, -1};

    public static final byte[] f46678s = {102, 116, 121, 112};

    public static final byte[] f46679t = {109, 105, 102, 49};

    public static final byte[] f46680u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};

    public static final byte[] f46681w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    public static final byte[] f46682x = {-119, 80, 78, 71, 13, 10, 26, 10};

    public static final byte[] f46683y = {101, 88, 73, 102};

    public static final byte[] f46684z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ImageWidth", 4), new d(257, 3, "ImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, "PixelXDimension", 4), new d(40963, 3, "PixelYDimension", 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, "GPSLatitude", 10), new d("GPSLongitudeRef", 3, 2), new d(4, 5, "GPSLongitude", 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ThumbnailImageWidth", 4), new d(257, 3, "ThumbnailImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)};
        H = new d("StripOffsets", 273, 3);
        I = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        O = charsetForName;
        P = "Exif\u0000\u0000".getBytes(charsetForName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr6 = I;
            if (i10 >= dVarArr6.length) {
                HashMap map = N;
                d[] dVarArr7 = J;
                map.put(Integer.valueOf(dVarArr7[0].f46667a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f46667a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f46667a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f46667a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f46667a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f46667a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i10] = new HashMap();
            L[i10] = new HashMap();
            for (d dVar : dVarArr6[i10]) {
                K[i10].put(Integer.valueOf(dVar.f46667a), dVar);
                L[i10].put(dVar.f46668b, dVar);
            }
            i10++;
        }
    }

    public g(File file) throws Throwable {
        d[][] dVarArr = I;
        this.f46688e = new HashMap[dVarArr.length];
        this.f46689f = new HashSet(dVarArr.length);
        this.f46690g = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        n(file.getAbsolutePath());
    }

    public static ByteOrder s(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z10 = f46672m;
        if (s10 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f46688e;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(O);
            map.put("DateTime", new c(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f46690g));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f46690g));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f46690g));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f46690g));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            int i10 = cVarC.f46664a;
            if (!M.contains(str)) {
                return cVarC.f(this.f46690g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f46690g);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f46670a / eVar.f46671b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f46670a / eVar2.f46671b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f46670a / eVar3.f46671b)));
            }
            try {
                return Double.toString(cVarC.d(this.f46690g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f46672m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < I.length; i10++) {
            c cVar = (c) this.f46688e[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f46688e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f46690g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f46690g));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i10, this.f46690g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i12);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (fVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f46691i = i14;
                    t(0, bArr2);
                }
                if (f46672m) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    public final void e(r1.b r23, int r24, int r25) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: r1.g.e(r1.b, int, int):void");
    }

    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i10;
        b bVar2;
        b bVar3;
        b bVar4;
        boolean z10;
        b bVar5;
        b bVar6;
        boolean z11;
        int i11;
        byte[] bArr;
        boolean z12;
        int i12;
        byte[] bArr2;
        int i13;
        byte[] bArr3;
        b bVar7;
        short s10;
        long j10;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i14 = 0;
        while (true) {
            byte[] bArr5 = f46677r;
            if (i14 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i14] != bArr5[i14]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i15 = 0; i15 < bytes.length; i15++) {
                    if (bArr4[i15] != bytes[i15]) {
                        boolean z13 = true;
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                try {
                                    long j11 = bVar2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar2.read(bArr6);
                                    try {
                                        try {
                                            if (Arrays.equals(bArr6, f46678s)) {
                                                if (j11 == 1) {
                                                    j11 = bVar2.readLong();
                                                    j10 = 16;
                                                    if (j11 < 16) {
                                                    }
                                                    bVar4 = new b(bArr4);
                                                    ByteOrder byteOrderS = s(bVar4);
                                                    this.f46690g = byteOrderS;
                                                    bVar4.f46662b = byteOrderS;
                                                    s10 = bVar4.readShort();
                                                    if (s10 != 20306 || s10 == 21330) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    bVar4.close();
                                                    if (z10) {
                                                        return 7;
                                                    }
                                                    try {
                                                        bVar7 = new b(bArr4);
                                                        try {
                                                            ByteOrder byteOrderS2 = s(bVar7);
                                                            this.f46690g = byteOrderS2;
                                                            bVar7.f46662b = byteOrderS2;
                                                            if (bVar7.readShort() == 85) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            bVar7.close();
                                                        } catch (Exception unused) {
                                                            bVar6 = bVar7;
                                                            if (bVar6 != null) {
                                                                bVar6.close();
                                                            }
                                                            z11 = false;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bVar5 = bVar7;
                                                            if (bVar5 != null) {
                                                                bVar5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                        bVar6 = null;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        bVar5 = null;
                                                    }
                                                    if (z11) {
                                                        return 10;
                                                    }
                                                    i11 = 0;
                                                    while (true) {
                                                        bArr = f46682x;
                                                        if (i11 < bArr.length) {
                                                            z12 = true;
                                                            break;
                                                        }
                                                        if (bArr4[i11] != bArr[i11]) {
                                                            z12 = false;
                                                            break;
                                                        }
                                                        i11++;
                                                    }
                                                    if (z12) {
                                                        return 13;
                                                    }
                                                    i12 = 0;
                                                    while (true) {
                                                        bArr2 = B;
                                                        if (i12 < bArr2.length) {
                                                            i13 = 0;
                                                            while (true) {
                                                                bArr3 = C;
                                                                if (i13 >= bArr3.length) {
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                                                    break;
                                                                }
                                                                i13++;
                                                            }
                                                            if (z13) {
                                                                return 14;
                                                            }
                                                            return i10;
                                                        }
                                                        if (bArr4[i12] != bArr2[i12]) {
                                                            break;
                                                        }
                                                        i12++;
                                                    }
                                                    z13 = false;
                                                    if (z13) {
                                                        return 14;
                                                    }
                                                    return i10;
                                                }
                                                j10 = 8;
                                                i10 = 0;
                                                long j12 = 5000;
                                                if (j11 > j12) {
                                                    j11 = j12;
                                                }
                                                long j13 = j11 - j10;
                                                if (j13 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z14 = false;
                                                        boolean z15 = false;
                                                        for (long j14 = 0; j14 < j13 / 4 && bVar2.read(bArr7) == 4; j14++) {
                                                            if (j14 != 1) {
                                                                if (Arrays.equals(bArr7, f46679t)) {
                                                                    z14 = true;
                                                                } else if (Arrays.equals(bArr7, f46680u)) {
                                                                    z15 = true;
                                                                }
                                                                if (z14 && z15) {
                                                                    bVar2.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        if (f46672m) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (bVar2 != null) {
                                                        }
                                                        bVar4 = new b(bArr4);
                                                        ByteOrder byteOrderS3 = s(bVar4);
                                                        this.f46690g = byteOrderS3;
                                                        bVar4.f46662b = byteOrderS3;
                                                        s10 = bVar4.readShort();
                                                        if (s10 != 20306) {
                                                            z10 = true;
                                                        } else {
                                                            z10 = true;
                                                        }
                                                        bVar4.close();
                                                        if (z10) {
                                                            return 7;
                                                        }
                                                        bVar7 = new b(bArr4);
                                                        ByteOrder byteOrderS4 = s(bVar7);
                                                        this.f46690g = byteOrderS4;
                                                        bVar7.f46662b = byteOrderS4;
                                                        if (bVar7.readShort() == 85) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        bVar7.close();
                                                        if (z11) {
                                                            return 10;
                                                        }
                                                        i11 = 0;
                                                        while (true) {
                                                            bArr = f46682x;
                                                            if (i11 < bArr.length) {
                                                                z12 = true;
                                                                break;
                                                            }
                                                            if (bArr4[i11] != bArr[i11]) {
                                                                z12 = false;
                                                                break;
                                                            }
                                                            i11++;
                                                        }
                                                        if (z12) {
                                                            return 13;
                                                        }
                                                        i12 = 0;
                                                        while (true) {
                                                            bArr2 = B;
                                                            if (i12 < bArr2.length) {
                                                                i13 = 0;
                                                                while (true) {
                                                                    bArr3 = C;
                                                                    if (i13 >= bArr3.length) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i13++;
                                                                }
                                                                if (z13) {
                                                                    return 14;
                                                                }
                                                                return i10;
                                                            }
                                                            if (bArr4[i12] != bArr2[i12]) {
                                                                break;
                                                                break;
                                                            }
                                                            i12++;
                                                        }
                                                        z13 = false;
                                                        if (z13) {
                                                            return 14;
                                                        }
                                                        return i10;
                                                    }
                                                }
                                                bVar2.close();
                                                bVar4 = new b(bArr4);
                                                ByteOrder byteOrderS5 = s(bVar4);
                                                this.f46690g = byteOrderS5;
                                                bVar4.f46662b = byteOrderS5;
                                                s10 = bVar4.readShort();
                                                if (s10 != 20306) {
                                                    z10 = true;
                                                } else {
                                                    z10 = true;
                                                }
                                                bVar4.close();
                                                if (z10) {
                                                    return 7;
                                                }
                                                bVar7 = new b(bArr4);
                                                ByteOrder byteOrderS6 = s(bVar7);
                                                this.f46690g = byteOrderS6;
                                                bVar7.f46662b = byteOrderS6;
                                                if (bVar7.readShort() == 85) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                bVar7.close();
                                                if (z11) {
                                                    return 10;
                                                }
                                                i11 = 0;
                                                while (true) {
                                                    bArr = f46682x;
                                                    if (i11 < bArr.length) {
                                                        z12 = true;
                                                        break;
                                                    }
                                                    if (bArr4[i11] != bArr[i11]) {
                                                        z12 = false;
                                                        break;
                                                    }
                                                    i11++;
                                                }
                                                if (z12) {
                                                    return 13;
                                                }
                                                i12 = 0;
                                                while (true) {
                                                    bArr2 = B;
                                                    if (i12 < bArr2.length) {
                                                        i13 = 0;
                                                        while (true) {
                                                            bArr3 = C;
                                                            if (i13 >= bArr3.length) {
                                                                break;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                                                break;
                                                                break;
                                                            }
                                                            i13++;
                                                        }
                                                        if (z13) {
                                                            return 14;
                                                        }
                                                        return i10;
                                                    }
                                                    if (bArr4[i12] != bArr2[i12]) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                }
                                                z13 = false;
                                                if (z13) {
                                                    return 14;
                                                }
                                                return i10;
                                            }
                                            ByteOrder byteOrderS7 = s(bVar4);
                                            this.f46690g = byteOrderS7;
                                            bVar4.f46662b = byteOrderS7;
                                            s10 = bVar4.readShort();
                                            if (s10 != 20306) {
                                                z10 = true;
                                            } else {
                                                z10 = true;
                                            }
                                            bVar4.close();
                                        } catch (Exception unused3) {
                                            if (bVar4 != null) {
                                                bVar4.close();
                                            }
                                            z10 = false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            bVar3 = bVar4;
                                            if (bVar3 != null) {
                                                bVar3.close();
                                            }
                                            throw th;
                                        }
                                        bVar4 = new b(bArr4);
                                    } catch (Exception unused4) {
                                        bVar4 = null;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        bVar3 = null;
                                    }
                                    bVar2.close();
                                    i10 = 0;
                                } catch (Exception e10) {
                                    e = e10;
                                    i10 = 0;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i10 = 0;
                            bVar2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = null;
                        }
                        if (z10) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderS8 = s(bVar7);
                        this.f46690g = byteOrderS8;
                        bVar7.f46662b = byteOrderS8;
                        if (bVar7.readShort() == 85) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        bVar7.close();
                        if (z11) {
                            return 10;
                        }
                        i11 = 0;
                        while (true) {
                            bArr = f46682x;
                            if (i11 < bArr.length) {
                                z12 = true;
                                break;
                            }
                            if (bArr4[i11] != bArr[i11]) {
                                z12 = false;
                                break;
                            }
                            i11++;
                        }
                        if (z12) {
                            return 13;
                        }
                        i12 = 0;
                        while (true) {
                            bArr2 = B;
                            if (i12 < bArr2.length) {
                                i13 = 0;
                                while (true) {
                                    bArr3 = C;
                                    if (i13 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i13 + 4] != bArr3[i13]) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                                if (z13) {
                                    return 14;
                                }
                                return i10;
                            }
                            if (bArr4[i12] != bArr2[i12]) {
                                break;
                                break;
                            }
                            i12++;
                        }
                        z13 = false;
                        if (z13) {
                            return 14;
                        }
                        return i10;
                    }
                }
                return 9;
            }
            i14++;
        }
    }

    public final void g(f fVar) throws IOException {
        int i10;
        int i11;
        j(fVar);
        HashMap[] mapArr = this.f46688e;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.f46662b = this.f46690g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f46681w;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            u(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f46690g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarC = c.c(i14, this.f46690g);
                c cVarC2 = c.c(i15, this.f46690g);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (f46672m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f46662b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f46682x;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f46684z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, A)) {
                    return;
                }
                if (Arrays.equals(bArr2, f46683y)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + t6.a(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f46691i = i11;
                        t(0, bArr3);
                        z();
                        w(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.a(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z10 = f46672m;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.a(i10 - bVar.f46663c);
        bVar.read(bArr4);
        e(new b(bArr4), i10, 5);
        bVar.a(i12 - bVar.f46663c);
        bVar.f46662b = ByteOrder.BIG_ENDIAN;
        int i13 = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == H.f46667a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarC = c.c(s10, this.f46690g);
                c cVarC2 = c.c(s11, this.f46690g);
                HashMap[] mapArr = this.f46688e;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        q(fVar);
        u(fVar, 0);
        y(fVar, 0);
        y(fVar, 5);
        y(fVar, 4);
        z();
        if (this.d == 8) {
            HashMap[] mapArr = this.f46688e;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.d);
                fVar2.f46662b = this.f46690g;
                fVar2.a(6);
                u(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (f46672m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f46688e;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.d), (int) cVar.f46666c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (f46672m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f46662b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(B.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = C;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f46691i = i12;
                        t(0, bArr3);
                        w(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + t6.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f46690g);
        int iE2 = cVar2.e(this.f46690g);
        if (this.d == 7) {
            iE += this.f46692j;
        }
        if (iE > 0 && iE2 > 0 && this.f46685a == null && this.f46687c == null && this.f46686b == null) {
            bVar.skip(iE);
            bVar.read(new byte[iE2]);
        }
        if (f46672m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final void n(String str) throws Throwable {
        boolean z10;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f46687c = null;
        this.f46685a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                try {
                    h.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f46672m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f46686b = fileInputStream2.getFD();
                } else {
                    this.f46686b = null;
                }
                p(fileInputStream2);
                try {
                    fileInputStream2.close();
                } catch (RuntimeException e9) {
                    throw e9;
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean o(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f46690g) <= 512 && cVar2.e(this.f46690g) <= 512;
    }

    public final void p(InputStream inputStream) {
        boolean z10 = f46672m;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < I.length; i10++) {
            try {
                try {
                    this.f46688e[i10] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (z10) {
                        r();
                    }
                    throw th;
                }
            } catch (IOException e9) {
                e = e9;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z10) {
                    r();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e10) {
                e = e10;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z10) {
                    r();
                    return;
                }
                return;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.d = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i11 = this.d;
            if (i11 == 4) {
                e(bVar, 0, 0);
            } else if (i11 == 13) {
                h(bVar);
            } else if (i11 == 9) {
                i(bVar);
            } else if (i11 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i12 = this.d;
            if (i12 == 12) {
                d(fVar);
            } else if (i12 == 7) {
                g(fVar);
            } else if (i12 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.b(this.f46691i);
            w(fVar);
        }
        a();
        if (z10) {
            r();
        }
    }

    public final void q(f fVar) throws IOException {
        ByteOrder byteOrderS = s(fVar);
        this.f46690g = byteOrderS;
        fVar.f46662b = byteOrderS;
        int unsignedShort = fVar.readUnsignedShort();
        int i10 = this.d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = fVar.readInt();
        if (i11 < 8) {
            throw new IOException(i0.a.k(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            fVar.a(i12);
        }
    }

    public final void r() {
        int i10 = 0;
        while (true) {
            HashMap[] mapArr = this.f46688e;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbO = i0.a.o(i10, "The size of tag group[", "]: ");
            sbO.append(mapArr[i10].size());
            Log.d("ExifInterface", sbO.toString());
            for (Map.Entry entry : mapArr[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f46690g) + "'");
            }
            i10++;
        }
    }

    public final void t(int i10, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        q(fVar);
        u(fVar, i10);
    }

    public final void u(f fVar, int i10) throws IOException {
        HashMap[] mapArr;
        short s10;
        boolean z10;
        int i11;
        int i12;
        long j10;
        boolean z11;
        int i13;
        HashMap[] mapArr2;
        Integer num;
        long j11;
        String str;
        int unsignedShort;
        long j12;
        int i14;
        Integer numValueOf = Integer.valueOf(fVar.f46663c);
        HashSet hashSet = this.f46689f;
        hashSet.add(numValueOf);
        short s11 = fVar.readShort();
        boolean z12 = f46672m;
        if (z12) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        short s12 = 0;
        while (true) {
            mapArr = this.f46688e;
            if (s12 >= s11) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i15 = fVar.readInt();
            long j13 = ((long) fVar.f46663c) + 4;
            d dVar = (d) K[i10].get(Integer.valueOf(unsignedShort2));
            if (z12) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), dVar != null ? dVar.f46668b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i15)));
            }
            if (dVar == null) {
                if (z12) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                s10 = s11;
                z10 = z12;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = F;
                    if (unsignedShort3 < iArr.length) {
                        i12 = dVar.f46669c;
                        s10 = s11;
                        if (i12 == 7 || unsignedShort3 == 7 || i12 == unsignedShort3 || (i13 = dVar.d) == unsignedShort3) {
                            z10 = z12;
                        } else {
                            z10 = z12;
                            if (((i12 != 4 && i13 != 4) || unsignedShort3 != 3) && (((i12 != 9 && i13 != 9) || unsignedShort3 != 8) && ((i12 != 12 && i13 != 12) || unsignedShort3 != 11))) {
                                if (z10) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + E[unsignedShort3] + ") is unexpected for tag: " + dVar.f46668b);
                                }
                            }
                        }
                        if (unsignedShort3 != 7) {
                            i12 = unsignedShort3;
                        }
                        i11 = i15;
                        j10 = ((long) iArr[i12]) * ((long) i11);
                        if (j10 < 0 || j10 > 2147483647L) {
                            if (z10) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i11);
                            }
                            j10 = j10;
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        if (j10 > 4) {
                            i14 = fVar.readInt();
                            mapArr2 = mapArr;
                            if (z10) {
                                Log.d("ExifInterface", "seek to data offset: " + i14);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(dVar.f46668b)) {
                                    this.f46692j = i14;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar.f46668b)) {
                                    this.f46693k = i14;
                                    this.f46694l = i11;
                                    c cVarC = c.c(6, this.f46690g);
                                    c cVarA = c.a(this.f46693k, this.f46690g);
                                    c cVarA2 = c.a(this.f46694l, this.f46690g);
                                    mapArr2[4].put("Compression", cVarC);
                                    mapArr2[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr2[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.b(i14);
                        } else {
                            i11 = i11;
                            j13 = j13;
                            mapArr2 = mapArr;
                            unsignedShort2 = unsignedShort2;
                        }
                        num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                        if (z10) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    j12 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (i12 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (i12 != 9 || i12 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j12 = -1;
                                }
                                if (z10) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f46668b));
                                }
                                if (j12 > 0) {
                                    if (!hashSet.contains(Integer.valueOf((int) j12))) {
                                        fVar.b(j12);
                                        u(fVar, num.intValue());
                                    } else if (z10) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                    }
                                } else if (z10) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                                }
                                fVar.b(j13);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j12 = unsignedShort;
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f46668b));
                            }
                            if (j12 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j12))) {
                                    fVar.b(j12);
                                    u(fVar, num.intValue());
                                } else if (z10) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                }
                            } else if (z10) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                            }
                            fVar.b(j13);
                        } else {
                            j11 = j13;
                            int i16 = fVar.f46663c + this.f46691i;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            c cVar = new c(i16, bArr, i12, i11);
                            HashMap map = mapArr2[i10];
                            str = dVar.f46668b;
                            map.put(str, cVar);
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f46690g).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f46690g) == 65535)) {
                                this.d = 8;
                            }
                            if (fVar.f46663c != j11) {
                                fVar.b(j11);
                            }
                        }
                    } else {
                        fVar.b(j13);
                        s12 = s12;
                    }
                    s12 = (short) (s12 + 1);
                    s11 = s10;
                    z12 = z10;
                }
                s10 = s11;
                z10 = z12;
                i11 = i15;
                if (z10) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                i12 = unsignedShort3;
                j10 = 0;
                z11 = false;
                if (z11) {
                    fVar.b(j13);
                    s12 = s12;
                } else {
                    if (j10 > 4) {
                        i14 = fVar.readInt();
                        mapArr2 = mapArr;
                        if (z10) {
                            Log.d("ExifInterface", "seek to data offset: " + i14);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(dVar.f46668b)) {
                                this.f46692j = i14;
                            } else if (i10 != 6) {
                            }
                        }
                        fVar.b(i14);
                    } else {
                        i11 = i11;
                        j13 = j13;
                        mapArr2 = mapArr;
                        unsignedShort2 = unsignedShort2;
                    }
                    num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                    if (z10) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                j12 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (i12 == 8) {
                                if (i12 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f46668b));
                            }
                            if (j12 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j12))) {
                                    fVar.b(j12);
                                    u(fVar, num.intValue());
                                } else if (z10) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                                }
                            } else if (z10) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                            }
                            fVar.b(j13);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j12 = unsignedShort;
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f46668b));
                        }
                        if (j12 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j12))) {
                                fVar.b(j12);
                                u(fVar, num.intValue());
                            } else if (z10) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                            }
                        } else if (z10) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                        }
                        fVar.b(j13);
                    } else {
                        j11 = j13;
                        int i17 = fVar.f46663c + this.f46691i;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(i17, bArr2, i12, i11);
                        HashMap map2 = mapArr2[i10];
                        str = dVar.f46668b;
                        map2.put(str, cVar2);
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (fVar.f46663c != j11) {
                            fVar.b(j11);
                        }
                    }
                }
                s12 = (short) (s12 + 1);
                s11 = s10;
                z12 = z10;
            }
            i11 = i15;
            i12 = unsignedShort3;
            j10 = 0;
            z11 = false;
            if (z11) {
                fVar.b(j13);
                s12 = s12;
            } else {
                if (j10 > 4) {
                    i14 = fVar.readInt();
                    mapArr2 = mapArr;
                    if (z10) {
                        Log.d("ExifInterface", "seek to data offset: " + i14);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(dVar.f46668b)) {
                            this.f46692j = i14;
                        } else if (i10 != 6) {
                        }
                    }
                    fVar.b(i14);
                } else {
                    i11 = i11;
                    j13 = j13;
                    mapArr2 = mapArr;
                    unsignedShort2 = unsignedShort2;
                }
                num = (Integer) N.get(Integer.valueOf(unsignedShort2));
                if (z10) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            j12 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (i12 == 8) {
                            if (i12 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f46668b));
                        }
                        if (j12 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j12))) {
                                fVar.b(j12);
                                u(fVar, num.intValue());
                            } else if (z10) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                            }
                        } else if (z10) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                        }
                        fVar.b(j13);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j12 = unsignedShort;
                    if (z10) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j12), dVar.f46668b));
                    }
                    if (j12 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j12))) {
                            fVar.b(j12);
                            u(fVar, num.intValue());
                        } else if (z10) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j12 + ")");
                        }
                    } else if (z10) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j12);
                    }
                    fVar.b(j13);
                } else {
                    j11 = j13;
                    int i18 = fVar.f46663c + this.f46691i;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(i18, bArr3, i12, i11);
                    HashMap map3 = mapArr2[i10];
                    str = dVar.f46668b;
                    map3.put(str, cVar3);
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (fVar.f46663c != j11) {
                        fVar.b(j11);
                    }
                }
            }
            s12 = (short) (s12 + 1);
            s11 = s10;
            z12 = z10;
        }
        boolean z13 = z12;
        int i19 = fVar.readInt();
        if (z13) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i19)));
        }
        long j14 = i19;
        if (j14 <= 0) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i19);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i19))) {
            if (z13) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i19);
                return;
            }
            return;
        }
        fVar.b(j14);
        if (mapArr[4].isEmpty()) {
            u(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            u(fVar, 5);
        }
    }

    public final void v(int i10, String str, String str2) {
        HashMap[] mapArr = this.f46688e;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void w(b bVar) throws IOException {
        c cVar;
        int iE;
        HashMap map = this.f46688e[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f46690g);
        int i10 = 1;
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f46690g);
            int[] iArr2 = f46675p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f46690g)) == 1 && Arrays.equals(iArr, f46676q)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrB = t6.b(cVar4.g(this.f46690g));
                long[] jArrB2 = t6.b(cVar5.g(this.f46690g));
                if (jArrB == null || jArrB.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrB2 == null || jArrB2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrB.length != jArrB2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrB2) {
                    j10 += j11;
                }
                byte[] bArr = new byte[(int) j10];
                this.h = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < jArrB.length) {
                    int i14 = (int) jArrB[i11];
                    int i15 = (int) jArrB2[i11];
                    if (i11 < jArrB.length - i10 && i14 + i15 != jArrB[i11 + 1]) {
                        this.h = false;
                    }
                    int i16 = i14 - i12;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j12 = i16;
                    if (bVar.skip(j12) != j12) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                    int i17 = i12 + i16;
                    byte[] bArr2 = new byte[i15];
                    if (bVar.read(bArr2) != i15) {
                        Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                        return;
                    }
                    i12 = i17 + i15;
                    System.arraycopy(bArr2, 0, bArr, i13, i15);
                    i13 += i15;
                    i11++;
                    i10 = 1;
                }
                if (this.h) {
                    long j13 = jArrB[0];
                    return;
                }
                return;
            }
        }
        if (f46672m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void x(int i10, int i11) {
        HashMap[] mapArr = this.f46688e;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f46672m;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i10].get("ImageLength");
        c cVar2 = (c) mapArr[i10].get("ImageWidth");
        c cVar3 = (c) mapArr[i11].get("ImageLength");
        c cVar4 = (c) mapArr[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f46690g);
        int iE2 = cVar2.e(this.f46690g);
        int iE3 = cVar3.e(this.f46690g);
        int iE4 = cVar4.e(this.f46690g);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void y(f fVar, int i10) throws IOException {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f46688e;
        c cVar = (c) mapArr[i10].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i10].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i10].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i10].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i10].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f46664a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f46690g);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f46690g);
                cVarC2 = c.b(eVarArr[1], this.f46690g);
            } else {
                int[] iArr = (int[]) cVar.g(this.f46690g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f46690g);
                cVarC2 = c.c(iArr[1], this.f46690g);
            }
            mapArr[i10].put("ImageWidth", cVarC);
            mapArr[i10].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f46690g);
            int iE2 = cVar4.e(this.f46690g);
            int iE3 = cVar5.e(this.f46690g);
            int iE4 = cVar3.e(this.f46690g);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f46690g);
            c cVarC4 = c.c(iE3 - iE4, this.f46690g);
            mapArr[i10].put("ImageLength", cVarC3);
            mapArr[i10].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i10].get("ImageLength");
        c cVar7 = (c) mapArr[i10].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i10].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i10].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f46690g);
            int iE6 = cVar8.e(this.f46690g);
            fVar.b(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            e(new b(bArr), iE5, i10);
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] mapArr = this.f46688e;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && o(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!o(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        v(0, "ThumbnailOrientation", "Orientation");
        v(0, "ThumbnailImageLength", "ImageLength");
        v(0, "ThumbnailImageWidth", "ImageWidth");
        v(5, "ThumbnailOrientation", "Orientation");
        v(5, "ThumbnailImageLength", "ImageLength");
        v(5, "ThumbnailImageWidth", "ImageWidth");
        v(4, "Orientation", "ThumbnailOrientation");
        v(4, "ImageLength", "ThumbnailImageLength");
        v(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public g(String str) throws Throwable {
        d[][] dVarArr = I;
        this.f46688e = new HashMap[dVarArr.length];
        this.f46689f = new HashSet(dVarArr.length);
        this.f46690g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            n(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public g(InputStream inputStream) throws IOException {
        d[][] dVarArr = I;
        this.f46688e = new HashMap[dVarArr.length];
        this.f46689f = new HashSet(dVarArr.length);
        this.f46690g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f46685a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f46687c = (AssetManager.AssetInputStream) inputStream;
                this.f46686b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f46687c = null;
                    this.f46686b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (f46672m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    this.f46687c = null;
                    this.f46686b = null;
                }
            } else {
                this.f46687c = null;
                this.f46686b = null;
            }
            p(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
