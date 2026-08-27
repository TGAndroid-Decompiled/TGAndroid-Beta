package u3;

import d5.z;
import java.nio.ByteBuffer;
import java.util.UUID;

public abstract class j {

    public static final String[] f48320a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static final int[] f48321b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static e4.e b(int i10, z zVar) {
        int iE = zVar.e();
        if (zVar.e() == 1684108385) {
            zVar.D(8);
            String strN = zVar.n(iE - 16);
            return new e4.e("und", strN, strN);
        }
        d5.a.K("MetadataUtil", "Failed to parse comment attribute: " + mc.k.a(i10));
        return null;
    }

    public static e4.a c(z zVar) {
        String str;
        int iE = zVar.e();
        if (zVar.e() != 1684108385) {
            d5.a.K("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iE2 = zVar.e() & 16777215;
        if (iE2 == 13) {
            str = "image/jpeg";
        } else {
            str = iE2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            com.google.android.recaptcha.internal.a.s(iE2, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        zVar.D(4);
        int i10 = iE - 16;
        byte[] bArr = new byte[i10];
        zVar.c(0, i10, bArr);
        return new e4.a(3, str, null, bArr);
    }

    public static e4.n d(int i10, String str, z zVar) {
        int iE = zVar.e();
        if (zVar.e() == 1684108385 && iE >= 22) {
            zVar.D(10);
            int iW = zVar.w();
            if (iW > 0) {
                String strK = i0.a.k(iW, "");
                int iW2 = zVar.w();
                if (iW2 > 0) {
                    strK = strK + "/" + iW2;
                }
                return new e4.n(str, null, p8.z.y(strK));
            }
        }
        d5.a.K("MetadataUtil", "Failed to parse index/count attribute: " + mc.k.a(i10));
        return null;
    }

    public static n1.d e(byte[] bArr) {
        z zVar = new z(bArr);
        if (zVar.f4860c >= 32) {
            zVar.C(0);
            if (zVar.e() == zVar.a() + 4 && zVar.e() == 1886614376) {
                int iB = mc.k.b(zVar.e());
                if (iB > 1) {
                    com.google.android.recaptcha.internal.a.s(iB, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(zVar.l(), zVar.l());
                if (iB == 1) {
                    zVar.D(zVar.u() * 16);
                }
                int iU = zVar.u();
                if (iU == zVar.a()) {
                    byte[] bArr2 = new byte[iU];
                    zVar.c(0, iU, bArr2);
                    return new n1.d(uuid, iB, bArr2);
                }
            }
        }
        return null;
    }

    public static e4.n f(int i10, String str, z zVar) {
        int iE = zVar.e();
        if (zVar.e() == 1684108385) {
            zVar.D(8);
            return new e4.n(str, null, p8.z.y(zVar.n(iE - 16)));
        }
        d5.a.K("MetadataUtil", "Failed to parse text attribute: " + mc.k.a(i10));
        return null;
    }

    public static e4.j g(int i10, String str, z zVar, boolean z10, boolean z11) {
        int iH = h(zVar);
        if (z11) {
            iH = Math.min(1, iH);
        }
        if (iH >= 0) {
            return z10 ? new e4.n(str, null, p8.z.y(Integer.toString(iH))) : new e4.e("und", str, Integer.toString(iH));
        }
        d5.a.K("MetadataUtil", "Failed to parse uint8 attribute: " + mc.k.a(i10));
        return null;
    }

    public static int h(z zVar) {
        zVar.D(4);
        if (zVar.e() == 1684108385) {
            zVar.D(8);
            return zVar.r();
        }
        d5.a.K("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean i(m3.l lVar, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        long length = lVar.getLength();
        long j10 = 4096;
        long j11 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i11 != 0 && length <= 4096) {
            j10 = length;
        }
        int i12 = (int) j10;
        z zVar = new z(64);
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 < i12) {
                zVar.z(8);
                if (lVar.g(zVar.f4858a, i13, 8, true)) {
                    long jS = zVar.s();
                    int iE = zVar.e();
                    if (jS == 1) {
                        lVar.b(8, 8, zVar.f4858a);
                        zVar.B(16);
                        jS = zVar.l();
                        i10 = 16;
                    } else {
                        if (jS == 0) {
                            long length2 = lVar.getLength();
                            if (length2 != j11) {
                                jS = (length2 - lVar.i()) + ((long) 8);
                            }
                        }
                        i10 = 8;
                    }
                    long j12 = i10;
                    if (jS < j12) {
                        return false;
                    }
                    int i15 = i14 + i10;
                    if (iE == 1836019574) {
                        i12 += (int) jS;
                        if (i11 != 0 && i12 > length) {
                            i12 = (int) length;
                        }
                        i14 = i15;
                    } else {
                        if (iE == 1836019558 || iE == 1836475768) {
                            z12 = true;
                            return z13 && z10 == z12;
                        }
                        int i16 = i11;
                        if ((((long) i15) + jS) - j12 < i12) {
                            int i17 = (int) (jS - j12);
                            i14 = i15 + i17;
                            if (iE == 1718909296) {
                                if (i17 < 8) {
                                    return false;
                                }
                                zVar.z(i17);
                                lVar.b(0, i17, zVar.f4858a);
                                int i18 = i17 / 4;
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if (i19 != 1) {
                                        int iE2 = zVar.e();
                                        if ((iE2 >>> 8) != 3368816 && (iE2 != 1751476579 || !z11)) {
                                            int i20 = 0;
                                            while (true) {
                                                if (i20 >= 29) {
                                                    continue;
                                                } else if (f48321b[i20] != iE2) {
                                                    i20++;
                                                }
                                            }
                                        }
                                        z13 = true;
                                        break;
                                    }
                                    zVar.D(4);
                                }
                                if (!z13) {
                                    return false;
                                }
                            } else if (i17 != 0) {
                                lVar.j(i17);
                            }
                            i11 = i16;
                        }
                    }
                    j11 = -1;
                    i13 = 0;
                }
            }
            z12 = false;
            if (z13) {
                return false;
            }
        }
    }
}
