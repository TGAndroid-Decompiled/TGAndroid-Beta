package r1;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import g7.b7;
import j$.util.DesugarTimeZone;
import j3.r0;
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
    public String f46995a;
    public FileDescriptor f46996b;
    public AssetManager.AssetInputStream f46997c;
    public int d;
    public final HashMap[] f46998e;
    public final HashSet f46999f;
    public ByteOrder f47000g;
    public boolean h;
    public int f47001i;
    public int f47002j;
    public int f47003k;
    public int f47004l;
    public static final boolean f46982m = Log.isLoggable("ExifInterface", 3);
    public static final List f46983n = Arrays.asList(1, 6, 3, 8);
    public static final List f46984o = Arrays.asList(2, 7, 4, 5);
    public static final int[] f46985p = {8, 8, 8};
    public static final int[] f46986q = {8};
    public static final byte[] f46987r = {-1, -40, -1};
    public static final byte[] f46988s = {102, 116, 121, 112};
    public static final byte[] f46989t = {109, 105, 102, 49};
    public static final byte[] f46990u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};
    public static final byte[] f46991w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] f46992x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] f46993y = {101, 88, 73, 102};
    public static final byte[] f46994z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        d[] dVarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ImageWidth", 4), new d(257, 3, "ImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        H = new d("StripOffsets", 273, 3);
        I = new d[][]{dVarArr2, new d[]{new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, 3, "PixelXDimension", 4), new d(40963, 3, "PixelYDimension", 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)}, new d[]{new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, 5, "GPSLatitude", 10), new d("GPSLongitudeRef", 3, 2), new d(4, 5, "GPSLongitude", 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)}, new d[]{new d("InteroperabilityIndex", 1, 2)}, new d[]{new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(256, 3, "ThumbnailImageWidth", 4), new d(257, 3, "ThumbnailImageLength", 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d(273, 3, "StripOffsets", 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, 3, "RowsPerStrip", 4), new d(279, 3, "StripByteCounts", 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, 3, "DefaultCropSize", 4)}, dVarArr2, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        J = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i9 = 0;
        while (true) {
            d[][] dVarArr3 = I;
            if (i9 < dVarArr3.length) {
                K[i9] = new HashMap();
                L[i9] = new HashMap();
                for (d dVar : dVarArr3[i9]) {
                    K[i9].put(Integer.valueOf(dVar.f46977a), dVar);
                    L[i9].put(dVar.f46978b, dVar);
                }
                i9++;
            } else {
                HashMap hashMap = N;
                d[] dVarArr4 = J;
                hashMap.put(Integer.valueOf(dVarArr4[0].f46977a), 5);
                hashMap.put(Integer.valueOf(dVarArr4[1].f46977a), 1);
                hashMap.put(Integer.valueOf(dVarArr4[2].f46977a), 2);
                hashMap.put(Integer.valueOf(dVarArr4[3].f46977a), 3);
                hashMap.put(Integer.valueOf(dVarArr4[4].f46977a), 7);
                hashMap.put(Integer.valueOf(dVarArr4[5].f46977a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public g(File file) {
        d[][] dVarArr = I;
        this.f46998e = new HashMap[dVarArr.length];
        this.f46999f = new HashSet(dVarArr.length);
        this.f47000g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            n(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    public static ByteOrder s(b bVar) {
        short readShort = bVar.readShort();
        boolean z10 = f46982m;
        if (readShort != 18761) {
            if (readShort == 19789) {
                if (z10) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        if (z10) {
            Log.d("ExifInterface", "readExifSegment: Byte Align II");
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        String b10 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.f46998e;
        if (b10 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b10.concat("\u0000").getBytes(O);
            hashMap.put("DateTime", new c(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0L, this.f47000g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0L, this.f47000g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0L, this.f47000g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0L, this.f47000g));
        }
    }

    public final String b(String str) {
        c c10 = c(str);
        if (c10 != null) {
            int i9 = c10.f46974a;
            if (!M.contains(str)) {
                return c10.f(this.f47000g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i9 != 5 && i9 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i9);
                    return null;
                }
                e[] eVarArr = (e[]) c10.g(this.f47000g);
                if (eVarArr != null && eVarArr.length == 3) {
                    e eVar = eVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) eVar.f46980a) / ((float) eVar.f46981b)));
                    e eVar2 = eVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f46980a) / ((float) eVar2.f46981b)));
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f46980a) / ((float) eVar3.f46981b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                return null;
            }
            try {
                return Double.toString(c10.d(this.f47000g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f46982m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i9 = 0; i9 < I.length; i9++) {
            c cVar = (c) this.f46998e[i9].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) {
        String str;
        String str2;
        String str3;
        int i9;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    i.a(mediaMetadataRetriever, new a(fVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str3 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str3 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    HashMap[] hashMapArr = this.f46998e;
                    if (str != null) {
                        hashMapArr[0].put("ImageWidth", c.c(Integer.parseInt(str), this.f47000g));
                    }
                    if (str2 != null) {
                        hashMapArr[0].put("ImageLength", c.c(Integer.parseInt(str2), this.f47000g));
                    }
                    if (str3 != null) {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt != 90) {
                            if (parseInt != 180) {
                                if (parseInt != 270) {
                                    i9 = 1;
                                } else {
                                    i9 = 8;
                                }
                            } else {
                                i9 = 3;
                            }
                        } else {
                            i9 = 6;
                        }
                        hashMapArr[0].put("Orientation", c.c(i9, this.f47000g));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            fVar.b(parseInt2);
                            byte[] bArr = new byte[6];
                            if (fVar.read(bArr) == 6) {
                                int i10 = parseInt2 + 6;
                                int i11 = parseInt3 - 6;
                                if (Arrays.equals(bArr, P)) {
                                    byte[] bArr2 = new byte[i11];
                                    if (fVar.read(bArr2) == i11) {
                                        this.f47001i = i10;
                                        t(0, bArr2);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f46982m) {
                        Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                    }
                    mediaMetadataRetriever.release();
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                throw th;
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    public final void e(r1.b r23, int r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: r1.g.e(r1.b, int, int):void");
    }

    public final int f(java.io.BufferedInputStream r18) {
        throw new UnsupportedOperationException("Method not decompiled: r1.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) {
        int i9;
        int i10;
        j(fVar);
        HashMap[] hashMapArr = this.f46998e;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.f46972b = this.f47000g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f46991w;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            u(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f47000g);
                if (iArr != null && iArr.length == 4) {
                    int i11 = iArr[2];
                    int i12 = iArr[0];
                    if (i11 > i12 && (i9 = iArr[3]) > (i10 = iArr[1])) {
                        int i13 = (i11 - i12) + 1;
                        int i14 = (i9 - i10) + 1;
                        if (i13 < i14) {
                            int i15 = i13 + i14;
                            i14 = i15 - i14;
                            i13 = i15 - i14;
                        }
                        c c10 = c.c(i13, this.f47000g);
                        c c11 = c.c(i14, this.f47000g);
                        hashMapArr[0].put("ImageWidth", c10);
                        hashMapArr[0].put("ImageLength", c11);
                        return;
                    }
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    public final void h(b bVar) {
        if (f46982m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f46972b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f46992x;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i9 = length + 8;
                    if (i9 == 16 && !Arrays.equals(bArr2, f46994z)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, A)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, f46993y)) {
                        byte[] bArr3 = new byte[readInt];
                        if (bVar.read(bArr3) == readInt) {
                            int readInt2 = bVar.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f47001i = i9;
                                t(0, bArr3);
                                z();
                                w(new b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b7.a(bArr2));
                    }
                    int i10 = readInt + 4;
                    bVar.a(i10);
                    length = i9 + i10;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z10 = f46982m;
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
        int i9 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.a(i9 - bVar.f46973c);
        bVar.read(bArr4);
        e(new b(bArr4), i9, 5);
        bVar.a(i11 - bVar.f46973c);
        bVar.f46972b = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == H.f46977a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c10 = c.c(readShort, this.f47000g);
                c c11 = c.c(readShort2, this.f47000g);
                HashMap[] hashMapArr = this.f46998e;
                hashMapArr[0].put("ImageLength", c10);
                hashMapArr[0].put("ImageWidth", c11);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.a(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        q(fVar);
        u(fVar, 0);
        y(fVar, 0);
        y(fVar, 5);
        y(fVar, 4);
        z();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.f46998e;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.d);
                fVar2.f46972b = this.f47000g;
                fVar2.a(6);
                u(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f46982m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.f46998e;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.d), (int) cVar.f46976c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void l(b bVar) {
        if (f46982m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f46972b = ByteOrder.LITTLE_ENDIAN;
        bVar.a(B.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = C;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i9 = length + 8;
                    if (Arrays.equals(D, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f47001i = i9;
                            t(0, bArr3);
                            w(new b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b7.a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i9 + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        bVar.a(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int e10 = cVar.e(this.f47000g);
            int e11 = cVar2.e(this.f47000g);
            if (this.d == 7) {
                e10 += this.f47002j;
            }
            if (e10 > 0 && e11 > 0 && this.f46995a == null && this.f46997c == null && this.f46996b == null) {
                bVar.skip(e10);
                bVar.read(new byte[e11]);
            }
            if (f46982m) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e10 + ", length: " + e11);
            }
        }
    }

    public final void n(String str) {
        FileInputStream fileInputStream;
        boolean z10;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.f46997c = null;
            this.f46995a = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (f46982m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f46996b = fileInputStream.getFD();
                } else {
                    this.f46996b = null;
                }
                p(fileInputStream);
                try {
                    fileInputStream.close();
                    return;
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused2) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }

    public final boolean o(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int e10 = cVar.e(this.f47000g);
            int e11 = cVar2.e(this.f47000g);
            if (e10 <= 512 && e11 <= 512) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p(java.io.InputStream r8) {
        throw new UnsupportedOperationException("Method not decompiled: r1.g.p(java.io.InputStream):void");
    }

    public final void q(f fVar) {
        ByteOrder s10 = s(fVar);
        this.f47000g = s10;
        fVar.f46972b = s10;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i9 = this.d;
        if (i9 != 7 && i9 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = fVar.readInt();
        if (readInt >= 8) {
            int i10 = readInt - 8;
            if (i10 > 0) {
                fVar.a(i10);
                return;
            }
            return;
        }
        throw new IOException(r0.l(readInt, "Invalid first Ifd offset: "));
    }

    public final void r() {
        int i9 = 0;
        while (true) {
            HashMap[] hashMapArr = this.f46998e;
            if (i9 < hashMapArr.length) {
                StringBuilder p6 = r0.p(i9, "The size of tag group[", "]: ");
                p6.append(hashMapArr[i9].size());
                Log.d("ExifInterface", p6.toString());
                for (Map.Entry entry : hashMapArr[i9].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f47000g) + "'");
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void t(int i9, byte[] bArr) {
        f fVar = new f(bArr);
        q(fVar);
        u(fVar, i9);
    }

    public final void u(r1.f r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: r1.g.u(r1.f, int):void");
    }

    public final void v(int i9, String str, String str2) {
        HashMap[] hashMapArr = this.f46998e;
        if (!hashMapArr[i9].isEmpty() && hashMapArr[i9].get(str) != null) {
            HashMap hashMap = hashMapArr[i9];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i9].remove(str);
        }
    }

    public final void w(b bVar) {
        c cVar;
        int e10;
        HashMap hashMap = this.f46998e[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int e11 = cVar2.e(this.f47000g);
            int i9 = 1;
            if (e11 != 1) {
                if (e11 != 6) {
                    if (e11 != 7) {
                        return;
                    }
                } else {
                    m(bVar, hashMap);
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.g(this.f47000g);
                int[] iArr2 = f46985p;
                if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e10 = cVar.e(this.f47000g)) == 1 && Arrays.equals(iArr, f46986q)) || (e10 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] b10 = b7.b(cVar4.g(this.f47000g));
                        long[] b11 = b7.b(cVar5.g(this.f47000g));
                        if (b10 != null && b10.length != 0) {
                            if (b11 != null && b11.length != 0) {
                                if (b10.length != b11.length) {
                                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                                    return;
                                }
                                long j10 = 0;
                                for (long j11 : b11) {
                                    j10 += j11;
                                }
                                byte[] bArr = new byte[(int) j10];
                                this.h = true;
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                while (i10 < b10.length) {
                                    int i13 = (int) b10[i10];
                                    int i14 = (int) b11[i10];
                                    if (i10 < b10.length - i9 && i13 + i14 != b10[i10 + 1]) {
                                        this.h = false;
                                    }
                                    int i15 = i13 - i11;
                                    if (i15 < 0) {
                                        Log.d("ExifInterface", "Invalid strip offset value");
                                        return;
                                    }
                                    long j12 = i15;
                                    if (bVar.skip(j12) != j12) {
                                        Log.d("ExifInterface", "Failed to skip " + i15 + " bytes.");
                                        return;
                                    }
                                    int i16 = i11 + i15;
                                    byte[] bArr2 = new byte[i14];
                                    if (bVar.read(bArr2) != i14) {
                                        Log.d("ExifInterface", "Failed to read " + i14 + " bytes.");
                                        return;
                                    }
                                    i11 = i16 + i14;
                                    System.arraycopy(bArr2, 0, bArr, i12, i14);
                                    i12 += i14;
                                    i10++;
                                    i9 = 1;
                                }
                                if (this.h) {
                                    long j13 = b10[0];
                                    return;
                                }
                                return;
                            }
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        }
                        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                        return;
                    }
                    return;
                }
            }
            if (f46982m) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(bVar, hashMap);
    }

    public final void x(int i9, int i10) {
        HashMap[] hashMapArr = this.f46998e;
        boolean isEmpty = hashMapArr[i9].isEmpty();
        boolean z10 = f46982m;
        if (!isEmpty && !hashMapArr[i10].isEmpty()) {
            c cVar = (c) hashMapArr[i9].get("ImageLength");
            c cVar2 = (c) hashMapArr[i9].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i10].get("ImageLength");
            c cVar4 = (c) hashMapArr[i10].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int e10 = cVar.e(this.f47000g);
                    int e11 = cVar2.e(this.f47000g);
                    int e12 = cVar3.e(this.f47000g);
                    int e13 = cVar4.e(this.f47000g);
                    if (e10 < e12 && e11 < e13) {
                        HashMap hashMap = hashMapArr[i9];
                        hashMapArr[i9] = hashMapArr[i10];
                        hashMapArr[i10] = hashMap;
                    }
                } else if (z10) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                }
            } else if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
        } else if (z10) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void y(f fVar, int i9) {
        c c10;
        c c11;
        HashMap[] hashMapArr = this.f46998e;
        c cVar = (c) hashMapArr[i9].get("DefaultCropSize");
        c cVar2 = (c) hashMapArr[i9].get("SensorTopBorder");
        c cVar3 = (c) hashMapArr[i9].get("SensorLeftBorder");
        c cVar4 = (c) hashMapArr[i9].get("SensorBottomBorder");
        c cVar5 = (c) hashMapArr[i9].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f46974a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f47000g);
                if (eVarArr != null && eVarArr.length == 2) {
                    c10 = c.b(eVarArr[0], this.f47000g);
                    c11 = c.b(eVarArr[1], this.f47000g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
            } else {
                int[] iArr = (int[]) cVar.g(this.f47000g);
                if (iArr != null && iArr.length == 2) {
                    c10 = c.c(iArr[0], this.f47000g);
                    c11 = c.c(iArr[1], this.f47000g);
                } else {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
            }
            hashMapArr[i9].put("ImageWidth", c10);
            hashMapArr[i9].put("ImageLength", c11);
        } else if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int e10 = cVar2.e(this.f47000g);
            int e11 = cVar4.e(this.f47000g);
            int e12 = cVar5.e(this.f47000g);
            int e13 = cVar3.e(this.f47000g);
            if (e11 > e10 && e12 > e13) {
                c c12 = c.c(e11 - e10, this.f47000g);
                c c13 = c.c(e12 - e13, this.f47000g);
                hashMapArr[i9].put("ImageLength", c12);
                hashMapArr[i9].put("ImageWidth", c13);
            }
        } else {
            c cVar6 = (c) hashMapArr[i9].get("ImageLength");
            c cVar7 = (c) hashMapArr[i9].get("ImageWidth");
            if (cVar6 == null || cVar7 == null) {
                c cVar8 = (c) hashMapArr[i9].get("JPEGInterchangeFormat");
                c cVar9 = (c) hashMapArr[i9].get("JPEGInterchangeFormatLength");
                if (cVar8 != null && cVar9 != null) {
                    int e14 = cVar8.e(this.f47000g);
                    int e15 = cVar8.e(this.f47000g);
                    fVar.b(e14);
                    byte[] bArr = new byte[e15];
                    fVar.read(bArr);
                    e(new b(bArr), e14, i9);
                }
            }
        }
    }

    public final void z() {
        x(0, 5);
        x(0, 4);
        x(5, 4);
        HashMap[] hashMapArr = this.f46998e;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && o(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!o(hashMapArr[4])) {
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

    public g(String str) {
        d[][] dVarArr = I;
        this.f46998e = new HashMap[dVarArr.length];
        this.f46999f = new HashSet(dVarArr.length);
        this.f47000g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            n(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public g(InputStream inputStream) {
        d[][] dVarArr = I;
        this.f46998e = new HashMap[dVarArr.length];
        this.f46999f = new HashSet(dVarArr.length);
        this.f47000g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f46995a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f46997c = (AssetManager.AssetInputStream) inputStream;
                this.f46996b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    try {
                        h.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                        this.f46997c = null;
                        this.f46996b = fileInputStream.getFD();
                    } catch (Exception unused) {
                        if (f46982m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                    }
                }
                this.f46997c = null;
                this.f46996b = null;
            }
            p(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
