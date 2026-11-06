package rf;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import com.google.android.gms.internal.cast.f4;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.g0;
import p1.g;
import y7.e;
public abstract class b {
    public static int a(int i7) {
        int[] d = g.d(126);
        if (i7 >= 0 && i7 < d.length) {
            return d[i7];
        }
        return 0;
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return u(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static String c(int i7) {
        switch (i7) {
            case 1:
                return "Blues";
            case 2:
                return "Classic Rock";
            case 3:
                return "Country";
            case 4:
                return "Dance";
            case 5:
                return "Disco";
            case 6:
                return "Funk";
            case 7:
                return "Grunge";
            case 8:
                return "Hip-Hop";
            case 9:
                return "Jazz";
            case 10:
                return "Metal";
            case 11:
                return "New Age";
            case 12:
                return "Oldies";
            case 13:
                return "Other";
            case 14:
                return "Pop";
            case 15:
                return "R&B";
            case 16:
                return "Rap";
            case 17:
                return "Reggae";
            case 18:
                return "Rock";
            case 19:
                return "Techno";
            case 20:
                return "Industrial";
            case 21:
                return "Alternative";
            case 22:
                return "Ska";
            case 23:
                return "Death Metal";
            case 24:
                return "Pranks";
            case 25:
                return "Soundtrack";
            case 26:
                return "Euro-Techno";
            case 27:
                return "Ambient";
            case 28:
                return "Trip-Hop";
            case 29:
                return "Vocal";
            case 30:
                return "Jazz+Funk";
            case 31:
                return "Fusion";
            case 32:
                return "Trance";
            case 33:
                return "Classical";
            case 34:
                return "Instrumental";
            case 35:
                return "Acid";
            case 36:
                return "House";
            case 37:
                return "Game";
            case 38:
                return "Sound Clip";
            case 39:
                return "Gospel";
            case 40:
                return "Noise";
            case 41:
                return "AlternRock";
            case 42:
                return "Bass";
            case 43:
                return "Soul";
            case 44:
                return "Punk";
            case 45:
                return "Space";
            case 46:
                return "Meditative";
            case 47:
                return "Instrumental Pop";
            case 48:
                return "Instrumental Rock";
            case 49:
                return "Ethnic";
            case 50:
                return "Gothic";
            case 51:
                return "Darkwave";
            case 52:
                return "Techno-Industrial";
            case 53:
                return "Electronic";
            case 54:
                return "Pop-Folk";
            case 55:
                return "Eurodance";
            case 56:
                return "Dream";
            case 57:
                return "Southern Rock";
            case 58:
                return "Comedy";
            case 59:
                return "Cult";
            case 60:
                return "Gangsta";
            case 61:
                return "Top 40";
            case 62:
                return "Christian Rap";
            case 63:
                return "Pop/Funk";
            case 64:
                return "Jungle";
            case 65:
                return "Native American";
            case 66:
                return "Cabaret";
            case 67:
                return "New Wave";
            case 68:
                return "Psychadelic";
            case 69:
                return "Rave";
            case 70:
                return "Showtunes";
            case 71:
                return "Trailer";
            case 72:
                return "Lo-Fi";
            case 73:
                return "Tribal";
            case 74:
                return "Acid Punk";
            case 75:
                return "Acid Jazz";
            case 76:
                return "Polka";
            case 77:
                return "Retro";
            case 78:
                return "Musical";
            case 79:
                return "Rock & Roll";
            case 80:
                return "Hard Rock";
            case 81:
                return "Folk";
            case 82:
                return "Folk-Rock";
            case 83:
                return "National Folk";
            case 84:
                return "Swing";
            case 85:
                return "Fast Fusion";
            case 86:
                return "Bebop";
            case 87:
                return "Latin";
            case 88:
                return "Revival";
            case 89:
                return "Celtic";
            case 90:
                return "Bluegrass";
            case 91:
                return "Avantgarde";
            case 92:
                return "Gothic Rock";
            case 93:
                return "Progressive Rock";
            case 94:
                return "Psychedelic Rock";
            case 95:
                return "Symphonic Rock";
            case 96:
                return "Slow Rock";
            case 97:
                return "Big Band";
            case 98:
                return "Chorus";
            case 99:
                return "Easy Listening";
            case 100:
                return "Acoustic";
            case 101:
                return "Humour";
            case 102:
                return "Speech";
            case 103:
                return "Chanson";
            case 104:
                return "Opera";
            case 105:
                return "Chamber Music";
            case 106:
                return "Sonata";
            case 107:
                return "Symphony";
            case 108:
                return "Booty Bass";
            case 109:
                return "Primus";
            case 110:
                return "Porn Groove";
            case 111:
                return "Satire";
            case 112:
                return "Slow Jam";
            case 113:
                return "Club";
            case 114:
                return "Tango";
            case 115:
                return "Samba";
            case 116:
                return "Folklore";
            case 117:
                return "Ballad";
            case 118:
                return "Power Ballad";
            case 119:
                return "Rhythmic Soul";
            case 120:
                return "Freestyle";
            case 121:
                return "Duet";
            case 122:
                return "Punk Rock";
            case 123:
                return "Drum Solo";
            case 124:
                return "A capella";
            case 125:
                return "Euro-House";
            case 126:
                return "Dance Hall";
            default:
                throw null;
        }
    }

    public static float d(float f10, float f11, float f12, float f13) {
        return (f10 * f11) + f12 + f13;
    }

    public static int e(Float f10, float f11) {
        return g0.L(f10.floatValue() * f11);
    }

    public static Bundle f(int i7, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i7);
        return bundle;
    }

    public static Object g(int i7, List list) {
        return list.get(list.size() - i7);
    }

    public static String h(long j3, String str, String str2) {
        return str + j3 + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder j(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap k(Class cls, e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap l(Class cls, z7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static e m(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new e(i7);
    }

    public static z7.a n(HashMap hashMap, int i7) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z7.a(i7);
    }

    public static void o(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
        } else if (mediaMetadataRetriever instanceof ExecutorService) {
            f4.b();
        } else if (com.google.android.recaptcha.internal.a.u(mediaMetadataRetriever)) {
            mediaMetadataRetriever.release();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void p(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(int i7) {
        switch (i7) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static String s(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        return "null";
                    }
                    return "ERROR";
                }
                return "CANCELLED";
            }
            return "AUDIO_REMOVED";
        }
        return "TRIMMED";
    }

    public static String t(int i7) {
        switch (i7) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static int u(String str) {
        if (str != null) {
            if (str.equals("GET")) {
                return 1;
            }
            if (str.equals("PUT")) {
                return 2;
            }
            if (str.equals("POST")) {
                return 3;
            }
            if (str.equals("DELETE")) {
                return 4;
            }
            if (str.equals("HEAD")) {
                return 5;
            }
            if (str.equals("OPTIONS")) {
                return 6;
            }
            if (str.equals("TRACE")) {
                return 7;
            }
            if (str.equals("CONNECT")) {
                return 8;
            }
            if (str.equals("PATCH")) {
                return 9;
            }
            if (str.equals("PROPFIND")) {
                return 10;
            }
            if (str.equals("PROPPATCH")) {
                return 11;
            }
            if (str.equals("MKCOL")) {
                return 12;
            }
            if (str.equals("MOVE")) {
                return 13;
            }
            if (str.equals("COPY")) {
                return 14;
            }
            if (str.equals("LOCK")) {
                return 15;
            }
            if (str.equals("UNLOCK")) {
                return 16;
            }
            throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
