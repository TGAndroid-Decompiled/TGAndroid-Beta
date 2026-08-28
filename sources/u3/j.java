package u3;

import d5.y;
import j3.r0;
import java.nio.ByteBuffer;
import java.util.UUID;
import n5.e0;
import o8.z;
public abstract class j {
    public static final String[] f48023a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] f48024b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i9;
        int i10;
        if (bArr != null) {
            i9 = bArr.length;
        } else {
            i9 = 0;
        }
        int i11 = i9 + 32;
        if (uuidArr != null) {
            i11 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        allocate.putInt(i11);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i10 = 16777216;
        } else {
            i10 = 0;
        }
        allocate.putInt(i10);
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

    public static e4.e b(int i9, y yVar) {
        int e10 = yVar.e();
        if (yVar.e() == 1684108385) {
            yVar.D(8);
            String n10 = yVar.n(e10 - 16);
            return new e4.e("und", n10, n10);
        }
        d5.a.K("MetadataUtil", "Failed to parse comment attribute: " + lc.k.a(i9));
        return null;
    }

    public static e4.a c(y yVar) {
        String str;
        int e10 = yVar.e();
        if (yVar.e() == 1684108385) {
            int e11 = yVar.e() & 16777215;
            if (e11 == 13) {
                str = "image/jpeg";
            } else if (e11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                e2.c.t(e11, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            yVar.D(4);
            int i9 = e10 - 16;
            byte[] bArr = new byte[i9];
            yVar.c(0, i9, bArr);
            return new e4.a(3, str, null, bArr);
        }
        d5.a.K("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static e4.n d(int i9, String str, y yVar) {
        int e10 = yVar.e();
        if (yVar.e() == 1684108385 && e10 >= 22) {
            yVar.D(10);
            int w8 = yVar.w();
            if (w8 > 0) {
                String l10 = r0.l(w8, "");
                int w10 = yVar.w();
                if (w10 > 0) {
                    l10 = l10 + "/" + w10;
                }
                return new e4.n(str, null, z.y(l10));
            }
        }
        d5.a.K("MetadataUtil", "Failed to parse index/count attribute: " + lc.k.a(i9));
        return null;
    }

    public static e0 e(byte[] bArr) {
        y yVar = new y(bArr);
        if (yVar.f4412c >= 32) {
            yVar.C(0);
            if (yVar.e() == yVar.a() + 4 && yVar.e() == 1886614376) {
                int b10 = lc.k.b(yVar.e());
                if (b10 > 1) {
                    e2.c.t(b10, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(yVar.l(), yVar.l());
                if (b10 == 1) {
                    yVar.D(yVar.u() * 16);
                }
                int u10 = yVar.u();
                if (u10 == yVar.a()) {
                    byte[] bArr2 = new byte[u10];
                    yVar.c(0, u10, bArr2);
                    return new e0(uuid, b10, bArr2);
                }
            }
        }
        return null;
    }

    public static e4.n f(int i9, String str, y yVar) {
        int e10 = yVar.e();
        if (yVar.e() == 1684108385) {
            yVar.D(8);
            return new e4.n(str, null, z.y(yVar.n(e10 - 16)));
        }
        d5.a.K("MetadataUtil", "Failed to parse text attribute: " + lc.k.a(i9));
        return null;
    }

    public static e4.j g(int i9, String str, y yVar, boolean z10, boolean z11) {
        int h = h(yVar);
        if (z11) {
            h = Math.min(1, h);
        }
        if (h >= 0) {
            if (z10) {
                return new e4.n(str, null, z.y(Integer.toString(h)));
            }
            return new e4.e("und", str, Integer.toString(h));
        }
        d5.a.K("MetadataUtil", "Failed to parse uint8 attribute: " + lc.k.a(i9));
        return null;
    }

    public static int h(y yVar) {
        yVar.D(4);
        if (yVar.e() == 1684108385) {
            yVar.D(8);
            return yVar.r();
        }
        d5.a.K("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean i(m3.l lVar, boolean z10, boolean z11) {
        boolean z12;
        int i9;
        int i10;
        long length = lVar.getLength();
        long j10 = 4096;
        long j11 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i11 != 0 && length <= 4096) {
            j10 = length;
        }
        int i12 = (int) j10;
        y yVar = new y(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (i14 < i12) {
            yVar.z(8);
            if (!lVar.g(yVar.f4410a, i13, 8, true)) {
                break;
            }
            long s10 = yVar.s();
            int e10 = yVar.e();
            if (s10 == 1) {
                lVar.c(8, 8, yVar.f4410a);
                yVar.B(16);
                i9 = i14;
                s10 = yVar.l();
                i10 = 16;
            } else {
                if (s10 == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j11) {
                        s10 = (length2 - lVar.k()) + 8;
                    }
                }
                i9 = i14;
                i10 = 8;
            }
            long j12 = i10;
            if (s10 < j12) {
                return false;
            }
            int i15 = i9 + i10;
            if (e10 == 1836019574) {
                i12 += (int) s10;
                if (i11 != 0 && i12 > length) {
                    i12 = (int) length;
                }
                i14 = i15;
            } else if (e10 != 1836019558 && e10 != 1836475768) {
                int i16 = i11;
                if ((i15 + s10) - j12 >= i12) {
                    break;
                }
                int i17 = (int) (s10 - j12);
                i14 = i15 + i17;
                if (e10 == 1718909296) {
                    if (i17 < 8) {
                        return false;
                    }
                    yVar.z(i17);
                    lVar.c(0, i17, yVar.f4410a);
                    int i18 = i17 / 4;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if (i19 == 1) {
                            yVar.D(4);
                        } else {
                            int e11 = yVar.e();
                            if ((e11 >>> 8) != 3368816 && (e11 != 1751476579 || !z11)) {
                                for (int i20 = 0; i20 < 29; i20++) {
                                    if (f48024b[i20] != e11) {
                                    }
                                }
                                continue;
                            }
                            z13 = true;
                            break;
                        }
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i17 != 0) {
                    lVar.n(i17);
                }
                i11 = i16;
            } else {
                z12 = true;
                break;
            }
            j11 = -1;
            i13 = 0;
        }
        z12 = false;
        if (!z13 || z10 != z12) {
            return false;
        }
        return true;
    }
}
