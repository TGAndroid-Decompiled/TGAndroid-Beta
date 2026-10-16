package ri;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
public final class v {
    public final File f44751a;
    public final int f44752b;
    public final boolean f44753c;
    public final n d;
    public final org.telegram.ui.web.o0 e;
    public MP4Builder f44756i;
    public MediaFormat f44757j;
    public MediaFormat f44758k;
    public long f44761n;
    public long f44762o;
    public long f44763p;
    public long f44765r;
    public ByteBuffer f44766s;
    public boolean f44768u;
    public boolean v;
    public boolean f44769w;
    public final ArrayList f44754f = new ArrayList();
    public final u f44755g = new u(33333);
    public final u h = new u(21333);
    public int f44759l = -1;
    public int f44760m = -1;
    public long f44764q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo f44767t = new MediaCodec.BufferInfo();

    public v(File file, int i10, boolean z10, n nVar, org.telegram.ui.web.o0 o0Var) {
        this.f44751a = file;
        this.f44752b = i10;
        this.f44753c = z10;
        this.d = nVar;
        this.e = o0Var;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        if (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) {
            return 3;
        }
        return 0;
    }

    public static String d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return "offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", ptsUs=" + bufferInfo.presentationTimeUs + ", flags=" + bufferInfo.flags + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity();
    }

    public static String e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        int i11;
        String str;
        n(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 == bufferInfo.offset) {
            i10 = m(byteBuffer, f7, i13);
            i11 = 0;
            while (f7 >= 0) {
                i11++;
                f7 = f(byteBuffer, m(byteBuffer, f7, i13) + f7, i13);
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        if (i11 > 0) {
            str = "annex-b";
        } else {
            str = "avcc";
        }
        sb2.append(str);
        sb2.append(", nalCount=");
        sb2.append(i11);
        sb2.append(", firstPrefix=");
        sb2.append(i10);
        sb2.append(", head=");
        int i14 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i13 - i14);
        for (int i15 = 0; i15 < min; i15++) {
            if (i15 > 0) {
                sb3.append(' ');
            }
            int i16 = byteBuffer.get(i14 + i15) & 255;
            if (i16 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i16));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i10, int i11) {
        int i12;
        while (true) {
            int i13 = i10 + 2;
            if (i13 < i11) {
                if (byteBuffer.get(i10) != 0 || byteBuffer.get(i10 + 1) != 0 || (byteBuffer.get(i13) != 1 && ((i12 = i10 + 3) >= i11 || byteBuffer.get(i13) != 0 || byteBuffer.get(i12) != 1))) {
                    i10++;
                }
            } else {
                return -1;
            }
        }
        return i10;
    }

    public static boolean k(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a2 = a(byteBuffer);
                    int a10 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a2;
                    if (limit == byteBuffer2.limit() - a10) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(a2 + i10) == byteBuffer2.get(a10 + i10)) {
                            }
                        }
                        continue;
                    }
                } else if (byteBuffer == byteBuffer2) {
                }
            }
            return true;
        }
        return false;
    }

    public static int m(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 + 3 < i11 && byteBuffer.get(i10 + 2) == 0) {
            return 4;
        }
        return 3;
    }

    public static void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size;
        long j10 = i10 + i11;
        if (i10 >= 0 && i11 >= 0 && j10 <= byteBuffer.limit()) {
            return;
        }
        throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j10) {
        u uVar;
        long j11;
        long max;
        long max2;
        u uVar2 = this.h;
        u uVar3 = this.f44755g;
        if (z10) {
            uVar = uVar3;
        } else {
            uVar = uVar2;
        }
        long j12 = 0;
        if (j10 < 0) {
            max = Math.max(0L, j10 + bufferInfo.presentationTimeUs);
        } else {
            if (this.f44764q != j10) {
                this.f44764q = j10;
                long j13 = uVar3.f44750c;
                if (j13 != Long.MIN_VALUE) {
                    j12 = Math.max(1L, uVar3.d) + j13;
                }
                long j14 = uVar2.f44750c;
                if (j14 == Long.MIN_VALUE) {
                    max2 = 0;
                } else {
                    max2 = Math.max(1L, uVar2.d) + j14;
                }
                this.f44765r = Math.max(j10, Math.max(j12, max2));
                j11 = Long.MIN_VALUE;
                uVar3.f44748a = Long.MIN_VALUE;
                uVar3.f44749b = Long.MIN_VALUE;
                uVar2.f44748a = Long.MIN_VALUE;
                uVar2.f44749b = Long.MIN_VALUE;
            } else {
                j11 = Long.MIN_VALUE;
            }
            if (uVar.f44748a == j11) {
                uVar.f44748a = bufferInfo.presentationTimeUs;
            }
            j12 = 0;
            max = this.f44765r + Math.max(0L, bufferInfo.presentationTimeUs - uVar.f44748a);
        }
        long j15 = max;
        long j16 = bufferInfo.presentationTimeUs;
        long j17 = uVar.f44749b;
        if (j17 != Long.MIN_VALUE) {
            long j18 = j16 - j17;
            if (j18 > j12 && j18 < 1000000) {
                uVar.d = j18;
            }
        }
        uVar.f44749b = j16;
        uVar.f44750c = Math.max(uVar.f44750c, j15);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, j15, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.f44756i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f44756i.finishMovie(file);
                n nVar = this.d;
                nVar.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Exception e) {
                throw new IOException("Unable to create preview MP4", e);
            }
        } else {
            throw new IOException("MP4 tracks are not initialized");
        }
    }

    public final synchronized void g() {
        if (this.f44769w) {
            return;
        }
        if (this.f44756i != null) {
            long nanoTime = System.nanoTime();
            try {
                this.f44756i.finishMovie();
                this.f44769w = true;
                j(this.f44751a.length());
                n nVar = this.d;
                nVar.b("MP4 finalized: file=" + this.f44751a.getName() + ", size=" + this.f44751a.length() + ", videoSamples=" + this.f44762o + ", audioSamples=" + this.f44763p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                return;
            } catch (Exception e) {
                throw new IOException("Unable to finish MP4", e);
            }
        }
        throw new IOException("MP4 tracks are not initialized");
    }

    public final void h() {
        ArrayList arrayList = this.f44754f;
        if (this.f44757j != null) {
            boolean z10 = this.f44753c;
            if (!z10 || this.f44758k != null) {
                Mp4Movie mp4Movie = new Mp4Movie();
                File file = this.f44751a;
                mp4Movie.setCacheFile(file);
                int i10 = this.f44752b;
                mp4Movie.setSize(i10, i10);
                try {
                    MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                    this.f44756i = createMovie;
                    this.f44759l = createMovie.addTrack(this.f44757j, false);
                    if (z10) {
                        this.f44760m = this.f44756i.addTrack(this.f44758k, true);
                    }
                    n nVar = this.d;
                    nVar.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        t tVar = (t) arrayList.get(i11);
                        p(tVar.f44745a, tVar.f44746b, tVar.f44747c);
                    }
                    arrayList.clear();
                } catch (Exception e) {
                    throw new IOException("Unable to initialize MP4", e);
                }
            }
        }
    }

    public final void i(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        int i10;
        int i11;
        n(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 != bufferInfo.offset) {
            int i14 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.f44766s;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i14) {
                this.f44766s = ByteBuffer.allocateDirect(i14);
            }
            this.f44766s.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.f44766s.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.f44766s.flip();
                this.f44767t.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i15 = 0;
        int i16 = f7;
        int i17 = 0;
        while (i16 >= 0) {
            int m10 = m(byteBuffer, i16, i13) + i16;
            i16 = f(byteBuffer, m10, i13);
            if (i16 < 0) {
                i11 = i13;
            } else {
                i11 = i16;
            }
            if (i11 > m10) {
                i15++;
                i17 = ((i11 + 4) - m10) + i17;
            }
        }
        if (i15 != 0) {
            ByteBuffer byteBuffer3 = this.f44766s;
            if (byteBuffer3 == null || byteBuffer3.capacity() < i17) {
                this.f44766s = ByteBuffer.allocateDirect(i17);
            }
            this.f44766s.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            while (f7 >= 0) {
                try {
                    int m11 = f7 + m(byteBuffer, f7, i13);
                    int f10 = f(byteBuffer, m11, i13);
                    if (f10 < 0) {
                        i10 = i13;
                    } else {
                        i10 = f10;
                    }
                    if (i10 > m11) {
                        this.f44766s.putInt(i10 - m11);
                        byteBuffer.position(m11);
                        byteBuffer.limit(i10);
                        this.f44766s.put(byteBuffer);
                    }
                    f7 = f10;
                } finally {
                }
            }
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            this.f44766s.flip();
            this.f44767t.set(0, this.f44766s.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
            return;
        }
        throw new IOException("Annex-B video sample contains no NAL units");
    }

    public final void j(long j10) {
        if (j10 > this.f44761n) {
            this.f44761n = j10;
            if (this.v) {
                return;
            }
            org.telegram.ui.web.o0 o0Var = this.e;
            r0 r0Var = (r0) o0Var.f41142b;
            n0 n0Var = (n0) o0Var.f41143c;
            synchronized (r0Var.f44679g) {
                try {
                    long j11 = n0Var.f44659c;
                    long j12 = j10 - j11;
                    if (j12 > 0 && !n0Var.d) {
                        n0Var.f44659c = j10;
                        r0Var.f44682k.execute(new a3.h0(r0Var, n0Var, j11, j12, 15));
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized void l(MediaFormat mediaFormat, boolean z10) {
        MediaFormat mediaFormat2;
        String str;
        try {
            if (this.f44769w) {
                return;
            }
            if (this.f44756i != null) {
                if (z10) {
                    mediaFormat2 = this.f44757j;
                } else {
                    mediaFormat2 = this.f44758k;
                }
                if ((z10 && !k(mediaFormat2, mediaFormat, "csd-0", "csd-1")) || (!z10 && this.f44753c && !k(mediaFormat2, mediaFormat, "csd-0"))) {
                    StringBuilder sb2 = new StringBuilder();
                    if (z10) {
                        str = "Video";
                    } else {
                        str = "Audio";
                    }
                    sb2.append(str);
                    sb2.append(" codec configuration changed between segments");
                    throw new IOException(sb2.toString());
                }
                return;
            }
            if (z10) {
                this.f44757j = mediaFormat;
            } else if (this.f44753c) {
                this.f44758k = mediaFormat;
            }
            h();
        } finally {
        }
    }

    public final synchronized void o(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j10) {
        try {
            if (!this.f44769w) {
                if (!z10) {
                    if (this.f44753c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j10);
                    if (this.f44756i == null) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(byteBuffer).flip();
                        b10.offset = 0;
                        this.f44754f.add(new t(z10, allocateDirect, b10));
                        return;
                    }
                    p(z10, byteBuffer, b10);
                }
            }
        } finally {
        }
    }

    public final void p(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String str;
        String d;
        int i10;
        n nVar = this.d;
        String str2 = null;
        if (z10) {
            try {
                if (!this.f44768u) {
                    str2 = e(byteBuffer, bufferInfo);
                }
                i(byteBuffer, bufferInfo);
                byteBuffer2 = this.f44766s;
                bufferInfo2 = this.f44767t;
                if (!this.f44768u) {
                    this.f44768u = true;
                    nVar.b("first video sample prepared: " + str2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e) {
                if (z10) {
                    if (str2 == null) {
                        try {
                            d = e(byteBuffer, bufferInfo);
                        } catch (Exception unused) {
                            d = d(byteBuffer, bufferInfo);
                        }
                        str2 = d;
                    }
                } else {
                    str2 = d(byteBuffer, bufferInfo);
                }
                StringBuilder sb2 = new StringBuilder("MP4 sample write failed: track=");
                String str3 = "audio";
                if (!z10) {
                    str = "audio";
                } else {
                    str = "video";
                }
                nVar.a(a1.g.q(str, ", ", str2, sb2), e);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str3 = "video";
                }
                throw new IOException(a1.g.q(str3, " MP4 sample: ", str2, sb3), e);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        MP4Builder mP4Builder = this.f44756i;
        if (z10) {
            i10 = this.f44759l;
        } else {
            i10 = this.f44760m;
        }
        long writeSampleData = mP4Builder.writeSampleData(i10, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.f44762o++;
        } else {
            this.f44763p++;
        }
        if (writeSampleData > 0) {
            j(writeSampleData);
        }
    }
}
