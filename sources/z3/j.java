package z3;

import b4.e0;
import h5.w;
import java.nio.ByteBuffer;
import java.util.UUID;
import kf.k0;
import s8.v;
public abstract class j {
    public static final String[] f47388a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] f47389b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = 16777216;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static j4.e b(int i10, w wVar) {
        int g10 = wVar.g();
        if (wVar.g() == 1684108385) {
            wVar.G(8);
            String q10 = wVar.q(g10 - 16);
            return new j4.e("und", q10, q10);
        }
        h5.a.K("MetadataUtil", "Failed to parse comment attribute: " + n3.a.c(i10));
        return null;
    }

    public static j4.a c(w wVar) {
        String str;
        int g10 = wVar.g();
        if (wVar.g() == 1684108385) {
            int g11 = wVar.g() & 16777215;
            if (g11 == 13) {
                str = "image/jpeg";
            } else if (g11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                e2.c.q(g11, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            wVar.G(4);
            int i10 = g10 - 16;
            byte[] bArr = new byte[i10];
            wVar.e(0, i10, bArr);
            return new j4.a(3, str, null, bArr);
        }
        h5.a.K("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static j4.n d(int i10, String str, w wVar) {
        int g10 = wVar.g();
        if (wVar.g() == 1684108385 && g10 >= 22) {
            wVar.G(10);
            int z4 = wVar.z();
            if (z4 > 0) {
                String j10 = k0.j(z4, "");
                int z10 = wVar.z();
                if (z10 > 0) {
                    j10 = j10 + "/" + z10;
                }
                return new j4.n(str, null, v.x(j10));
            }
        }
        h5.a.K("MetadataUtil", "Failed to parse index/count attribute: " + n3.a.c(i10));
        return null;
    }

    public static e0 e(byte[] bArr) {
        w wVar = new w(bArr);
        if (wVar.f6989c >= 32) {
            wVar.F(0);
            if (wVar.g() == wVar.a() + 4 && wVar.g() == 1886614376) {
                int f10 = n3.a.f(wVar.g());
                if (f10 > 1) {
                    e2.c.q(f10, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(wVar.o(), wVar.o());
                if (f10 == 1) {
                    wVar.G(wVar.x() * 16);
                }
                int x10 = wVar.x();
                if (x10 == wVar.a()) {
                    ?? r22 = new byte[x10];
                    wVar.e(0, x10, r22);
                    return new e0(uuid, f10, r22, 25);
                }
            }
        }
        return null;
    }

    public static byte[] f(byte[] bArr, UUID uuid) {
        e0 e = e(bArr);
        if (e == null) {
            return null;
        }
        UUID uuid2 = (UUID) e.f1379c;
        if (!uuid.equals(uuid2)) {
            h5.a.K("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) e.d;
    }

    public static j4.n g(int i10, String str, w wVar) {
        int g10 = wVar.g();
        if (wVar.g() == 1684108385) {
            wVar.G(8);
            return new j4.n(str, null, v.x(wVar.q(g10 - 16)));
        }
        h5.a.K("MetadataUtil", "Failed to parse text attribute: " + n3.a.c(i10));
        return null;
    }

    public static j4.j h(int i10, String str, w wVar, boolean z4, boolean z10) {
        int i11 = i(wVar);
        if (z10) {
            i11 = Math.min(1, i11);
        }
        if (i11 >= 0) {
            if (z4) {
                return new j4.n(str, null, v.x(Integer.toString(i11)));
            }
            return new j4.e("und", str, Integer.toString(i11));
        }
        h5.a.K("MetadataUtil", "Failed to parse uint8 attribute: " + n3.a.c(i10));
        return null;
    }

    public static int i(w wVar) {
        wVar.G(4);
        if (wVar.g() == 1684108385) {
            wVar.G(8);
            return wVar.u();
        }
        h5.a.K("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean j(r3.l lVar, boolean z4, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        long length = lVar.getLength();
        long j10 = 4096;
        long j11 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i12 != 0 && length <= 4096) {
            j10 = length;
        }
        int i13 = (int) j10;
        w wVar = new w(64);
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (i15 < i13) {
            wVar.C(8);
            if (!lVar.f(wVar.f6987a, i14, 8, true)) {
                break;
            }
            long v = wVar.v();
            int g10 = wVar.g();
            if (v == 1) {
                lVar.b(8, 8, wVar.f6987a);
                wVar.E(16);
                i10 = i15;
                v = wVar.o();
                i11 = 16;
            } else {
                if (v == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j11) {
                        v = (length2 - lVar.g()) + 8;
                    }
                }
                i10 = i15;
                i11 = 8;
            }
            long j12 = i11;
            if (v < j12) {
                return false;
            }
            int i16 = i10 + i11;
            if (g10 == 1836019574) {
                i13 += (int) v;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i16;
            } else if (g10 != 1836019558 && g10 != 1836475768) {
                int i17 = i12;
                if ((i16 + v) - j12 >= i13) {
                    break;
                }
                int i18 = (int) (v - j12);
                i15 = i16 + i18;
                if (g10 == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    wVar.C(i18);
                    lVar.b(0, i18, wVar.f6987a);
                    int i19 = i18 / 4;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 == 1) {
                            wVar.G(4);
                        } else {
                            int g11 = wVar.g();
                            if ((g11 >>> 8) != 3368816 && (g11 != 1751476579 || !z10)) {
                                for (int i21 = 0; i21 < 29; i21++) {
                                    if (f47389b[i21] != g11) {
                                    }
                                }
                                continue;
                            }
                            z12 = true;
                            break;
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                } else if (i18 != 0) {
                    lVar.i(i18);
                }
                i12 = i17;
            } else {
                z11 = true;
                break;
            }
            j11 = -1;
            i14 = 0;
        }
        z11 = false;
        if (!z12 || z4 != z11) {
            return false;
        }
        return true;
    }
}
