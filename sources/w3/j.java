package w3;

import f5.w;
import j7.l1;
import java.nio.ByteBuffer;
import java.util.UUID;
import q8.z;
public abstract class j {
    public static final String[] f49682a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final int[] f49683b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

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

    public static g4.e b(int i10, w wVar) {
        int e10 = wVar.e();
        if (wVar.e() == 1684108385) {
            wVar.D(8);
            String n10 = wVar.n(e10 - 16);
            return new g4.e("und", n10, n10);
        }
        f5.a.K("MetadataUtil", "Failed to parse comment attribute: " + nc.k.a(i10));
        return null;
    }

    public static g4.a c(w wVar) {
        String str;
        int e10 = wVar.e();
        if (wVar.e() == 1684108385) {
            int e11 = wVar.e() & 16777215;
            if (e11 == 13) {
                str = "image/jpeg";
            } else if (e11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                com.google.android.recaptcha.internal.a.s(e11, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            wVar.D(4);
            int i10 = e10 - 16;
            byte[] bArr = new byte[i10];
            wVar.c(0, i10, bArr);
            return new g4.a(3, str, null, bArr);
        }
        f5.a.K("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static g4.n d(int i10, String str, w wVar) {
        int e10 = wVar.e();
        if (wVar.e() == 1684108385 && e10 >= 22) {
            wVar.D(10);
            int w10 = wVar.w();
            if (w10 > 0) {
                String k9 = l1.k(w10, "");
                int w11 = wVar.w();
                if (w11 > 0) {
                    k9 = k9 + "/" + w11;
                }
                return new g4.n(str, null, z.y(k9));
            }
        }
        f5.a.K("MetadataUtil", "Failed to parse index/count attribute: " + nc.k.a(i10));
        return null;
    }

    public static o1.a e(byte[] bArr) {
        w wVar = new w(bArr);
        if (wVar.f6642c >= 32) {
            wVar.C(0);
            if (wVar.e() == wVar.a() + 4 && wVar.e() == 1886614376) {
                int b10 = nc.k.b(wVar.e());
                if (b10 > 1) {
                    com.google.android.recaptcha.internal.a.s(b10, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(wVar.l(), wVar.l());
                if (b10 == 1) {
                    wVar.D(wVar.u() * 16);
                }
                int u10 = wVar.u();
                if (u10 == wVar.a()) {
                    byte[] bArr2 = new byte[u10];
                    wVar.c(0, u10, bArr2);
                    return new o1.a(uuid, b10, bArr2);
                }
            }
        }
        return null;
    }

    public static g4.n f(int i10, String str, w wVar) {
        int e10 = wVar.e();
        if (wVar.e() == 1684108385) {
            wVar.D(8);
            return new g4.n(str, null, z.y(wVar.n(e10 - 16)));
        }
        f5.a.K("MetadataUtil", "Failed to parse text attribute: " + nc.k.a(i10));
        return null;
    }

    public static g4.j g(int i10, String str, w wVar, boolean z10, boolean z11) {
        int h = h(wVar);
        if (z11) {
            h = Math.min(1, h);
        }
        if (h >= 0) {
            if (z10) {
                return new g4.n(str, null, z.y(Integer.toString(h)));
            }
            return new g4.e("und", str, Integer.toString(h));
        }
        f5.a.K("MetadataUtil", "Failed to parse uint8 attribute: " + nc.k.a(i10));
        return null;
    }

    public static int h(w wVar) {
        wVar.D(4);
        if (wVar.e() == 1684108385) {
            wVar.D(8);
            return wVar.r();
        }
        f5.a.K("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean i(o3.l lVar, boolean z10, boolean z11) {
        boolean z12;
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
        boolean z13 = false;
        while (i15 < i13) {
            wVar.z(8);
            if (!lVar.f(wVar.f6640a, i14, 8, true)) {
                break;
            }
            long s10 = wVar.s();
            int e10 = wVar.e();
            if (s10 == 1) {
                lVar.a(8, 8, wVar.f6640a);
                wVar.B(16);
                i10 = i15;
                s10 = wVar.l();
                i11 = 16;
            } else {
                if (s10 == 0) {
                    long length2 = lVar.getLength();
                    if (length2 != j11) {
                        s10 = (length2 - lVar.h()) + 8;
                    }
                }
                i10 = i15;
                i11 = 8;
            }
            long j12 = i11;
            if (s10 < j12) {
                return false;
            }
            int i16 = i10 + i11;
            if (e10 == 1836019574) {
                i13 += (int) s10;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i16;
            } else if (e10 != 1836019558 && e10 != 1836475768) {
                int i17 = i12;
                if ((i16 + s10) - j12 >= i13) {
                    break;
                }
                int i18 = (int) (s10 - j12);
                i15 = i16 + i18;
                if (e10 == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    wVar.z(i18);
                    lVar.a(0, i18, wVar.f6640a);
                    int i19 = i18 / 4;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 == 1) {
                            wVar.D(4);
                        } else {
                            int e11 = wVar.e();
                            if ((e11 >>> 8) != 3368816 && (e11 != 1751476579 || !z11)) {
                                for (int i21 = 0; i21 < 29; i21++) {
                                    if (f49683b[i21] != e11) {
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
                } else if (i18 != 0) {
                    lVar.i(i18);
                }
                i12 = i17;
            } else {
                z12 = true;
                break;
            }
            j11 = -1;
            i14 = 0;
        }
        z12 = false;
        if (!z13 || z10 != z12) {
            return false;
        }
        return true;
    }
}
